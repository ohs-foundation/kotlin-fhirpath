/*
 * Copyright 2026 Open Health Stack Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package dev.ohs.fhir.fhirpath.operators

import com.ionspin.kotlin.bignum.decimal.BigDecimal
import com.ionspin.kotlin.bignum.decimal.toBigDecimal
import dev.ohs.fhir.fhirpath.createSecondBigDecimal
import dev.ohs.fhir.fhirpath.types.FhirPathDate
import dev.ohs.fhir.fhirpath.types.FhirPathDateTime
import dev.ohs.fhir.fhirpath.types.FhirPathQuantity
import dev.ohs.fhir.fhirpath.types.FhirPathTime
import kotlin.time.ExperimentalTime
import kotlinx.datetime.DateTimePeriod
import kotlinx.datetime.DateTimeUnit
import kotlinx.datetime.LocalDate
import kotlinx.datetime.LocalDateTime
import kotlinx.datetime.LocalTime
import kotlinx.datetime.TimeZone
import kotlinx.datetime.number
import kotlinx.datetime.plus
import kotlinx.datetime.toInstant
import kotlinx.datetime.toLocalDateTime

private val CALENDAR_DATE_UNITS =
  setOf("year", "years", "month", "months", "week", "weeks", "day", "days")
private val UCUM_DATE_UNITS = setOf("wk", "d")
private val DATE_ARITHMETIC_UNITS = CALENDAR_DATE_UNITS + UCUM_DATE_UNITS

private val CALENDAR_TIME_UNITS =
  setOf("hour", "hours", "minute", "minutes", "second", "seconds", "millisecond", "milliseconds")
private val UCUM_TIME_UNITS = setOf("h", "min", "s", "ms")
private val TIME_ARITHMETIC_UNITS = CALENDAR_TIME_UNITS + UCUM_TIME_UNITS

private val DATETIME_ARITHMETIC_UNITS = DATE_ARITHMETIC_UNITS + TIME_ARITHMETIC_UNITS

private const val MONTHS_PER_YEAR = 12
private const val DAYS_PER_YEAR = 365
private const val DAYS_PER_MONTH = 30
private const val DAYS_PER_WEEK = 7
private const val HOURS_PER_DAY = 24
private const val HOURS_PER_YEAR = HOURS_PER_DAY * DAYS_PER_YEAR
private const val HOURS_PER_MONTH = HOURS_PER_DAY * DAYS_PER_MONTH
private const val MINUTES_PER_HOUR = 60
private const val MINUTES_PER_DAY = HOURS_PER_DAY * MINUTES_PER_HOUR
private const val MINUTES_PER_YEAR = MINUTES_PER_DAY * DAYS_PER_YEAR
private const val MINUTES_PER_MONTH = MINUTES_PER_DAY * DAYS_PER_MONTH
private const val SECONDS_PER_MINUTE = 60L
private const val SECONDS_PER_HOUR = MINUTES_PER_HOUR * SECONDS_PER_MINUTE
private const val SECONDS_PER_DAY = HOURS_PER_DAY * SECONDS_PER_HOUR
private const val SECONDS_PER_YEAR = DAYS_PER_YEAR * SECONDS_PER_DAY
private const val SECONDS_PER_MONTH = DAYS_PER_MONTH * SECONDS_PER_DAY
private const val MILLISECONDS_PER_SECOND = 1_000L
private const val MILLISECONDS_PER_MINUTE = SECONDS_PER_MINUTE * MILLISECONDS_PER_SECOND
private const val MILLISECONDS_PER_HOUR = SECONDS_PER_HOUR * MILLISECONDS_PER_SECOND
private const val MILLISECONDS_PER_DAY = HOURS_PER_DAY * MILLISECONDS_PER_HOUR
private const val MILLISECONDS_PER_YEAR = DAYS_PER_YEAR * MILLISECONDS_PER_DAY
private const val MILLISECONDS_PER_MONTH = DAYS_PER_MONTH * MILLISECONDS_PER_DAY
private const val NANOSECONDS_PER_MILLISECOND = 1_000_000L
private const val NANOSECONDS_PER_SECOND = 1_000_000_000L
private const val NANOSECONDS_PER_MINUTE = SECONDS_PER_MINUTE * NANOSECONDS_PER_SECOND
private const val NANOSECONDS_PER_HOUR = MINUTES_PER_HOUR * NANOSECONDS_PER_MINUTE
private const val NANOSECONDS_PER_DAY = HOURS_PER_DAY * NANOSECONDS_PER_HOUR

/**
 * Adds a date-based duration ([DATE_ARITHMETIC_UNITS]) to a [FhirPathDate].
 *
 * Per the [specification](https://hl7.org/fhirpath/N1/#datetime-arithmetic), addition of
 * time-valued duration units (hours, minutes, seconds, milliseconds) to a [FhirPathDate] is not
 * permitted and will result in an empty collection `{}` / error.
 */
internal operator fun FhirPathDate.plus(duration: FhirPathQuantity): FhirPathDate {
  val durationInfo = DurationInfo.from(duration, DATE_ARITHMETIC_UNITS)

  return when (precision) {
    FhirPathDate.Precision.YEAR -> FhirPathDate(year = year + durationInfo.toYears())
    FhirPathDate.Precision.MONTH -> addMonthsToYearMonth(year, month!!, durationInfo.toMonths())
    FhirPathDate.Precision.DAY -> addDurationToLocalDate(year, month!!, day!!, durationInfo)
  }
}

/** See [specification](https://hl7.org/fhirpath/N1/#datetime-arithmetic). */
internal operator fun FhirPathDate.minus(duration: FhirPathQuantity): FhirPathDate =
  this + duration.copy(value = -duration.value!!)

/** See [specification](https://hl7.org/fhirpath/N1/#datetime-arithmetic). */
@OptIn(ExperimentalTime::class)
internal operator fun FhirPathDateTime.plus(duration: FhirPathQuantity): FhirPathDateTime {
  val durationInfo = DurationInfo.from(duration, DATETIME_ARITHMETIC_UNITS)

  return when (precision) {
    FhirPathDateTime.Precision.YEAR ->
      FhirPathDateTime(year = year + durationInfo.toYears(), utcOffset = utcOffset)

    FhirPathDateTime.Precision.MONTH -> {
      val dateResult = addMonthsToYearMonth(year, month!!, durationInfo.toMonths())
      FhirPathDateTime(year = dateResult.year, month = dateResult.month, utcOffset = utcOffset)
    }

    FhirPathDateTime.Precision.DAY -> {
      val dateResult = addDurationToLocalDate(year, month!!, day!!, durationInfo)
      FhirPathDateTime(
        year = dateResult.year,
        month = dateResult.month,
        day = dateResult.day,
        utcOffset = utcOffset,
      )
    }

    FhirPathDateTime.Precision.HOUR,
    FhirPathDateTime.Precision.MINUTE,
    FhirPathDateTime.Precision.SECOND -> {
      val (wholeSecond, nanosecond) = second?.toSecondAndNanosecond() ?: (0 to 0)
      val initialDateTime =
        LocalDateTime(year, month!!, day!!, hour ?: 0, minute ?: 0, wholeSecond, nanosecond)
      val resultDateTime =
        initialDateTime
          .toInstant(TimeZone.UTC)
          .plus(durationInfo.toDateTimePeriod(), TimeZone.UTC)
          .toLocalDateTime(TimeZone.UTC)

      FhirPathDateTime(
        year = resultDateTime.year,
        month = resultDateTime.month.number,
        day = resultDateTime.day,
        hour = resultDateTime.hour.takeIf { precision >= FhirPathDateTime.Precision.HOUR },
        minute = resultDateTime.minute.takeIf { precision >= FhirPathDateTime.Precision.MINUTE },
        second =
          if (precision == FhirPathDateTime.Precision.SECOND) {
            createSecondBigDecimal(resultDateTime.second, resultDateTime.nanosecond)
          } else null,
        utcOffset = utcOffset,
      )
    }
  }
}

/** See [specification](https://hl7.org/fhirpath/N1/#datetime-arithmetic). */
internal operator fun FhirPathDateTime.minus(duration: FhirPathQuantity): FhirPathDateTime =
  this + duration.copy(value = -duration.value!!)

/**
 * Adds a time-based duration ([TIME_ARITHMETIC_UNITS]) to a [FhirPathTime], wrapping around the
 * 24-hour clock cycle.
 *
 * Per the [specification](https://hl7.org/fhirpath/N1/#datetime-arithmetic), addition of date-based
 * duration units (years, months, weeks, days) to a [FhirPathTime] is not permitted and will result
 * in an empty collection `{}` / error.
 */
internal operator fun FhirPathTime.plus(duration: FhirPathQuantity): FhirPathTime {
  val durationInfo = DurationInfo.from(duration, TIME_ARITHMETIC_UNITS)

  return when (precision) {
    FhirPathTime.Precision.HOUR -> {
      val newHour = (hour + durationInfo.toHours()).mod(HOURS_PER_DAY)
      FhirPathTime(hour = newHour)
    }

    FhirPathTime.Precision.MINUTE -> {
      val totalMinutes = hour * MINUTES_PER_HOUR + minute!!
      val newTotalMinutes = (totalMinutes + durationInfo.toMinutes()).mod(MINUTES_PER_DAY)
      FhirPathTime(
        hour = newTotalMinutes / MINUTES_PER_HOUR,
        minute = newTotalMinutes % MINUTES_PER_HOUR,
      )
    }

    FhirPathTime.Precision.SECOND -> {
      val (wholeSecond, nanosecond) = second!!.toSecondAndNanosecond()
      val totalNanoseconds = LocalTime(hour, minute!!, wholeSecond, nanosecond).toNanosecondOfDay()
      val unitsPerDay = NANOSECONDS_PER_DAY / durationInfo.unit.nanoseconds
      val addNanoseconds = durationInfo.value.mod(unitsPerDay) * durationInfo.unit.nanoseconds
      val newTotalNanoseconds = (totalNanoseconds + addNanoseconds).mod(NANOSECONDS_PER_DAY)
      FhirPathTime.fromLocalTime(LocalTime.fromNanosecondOfDay(newTotalNanoseconds))
    }
  }
}

/** See [specification](https://hl7.org/fhirpath/N1/#datetime-arithmetic). */
internal operator fun FhirPathTime.minus(duration: FhirPathQuantity): FhirPathTime =
  this + duration.copy(value = -duration.value!!)

private fun addDurationToLocalDate(
  year: Int,
  month: Int,
  day: Int,
  durationInfo: DurationInfo,
): FhirPathDate {
  val resultDate =
    when (durationInfo.unit) {
      DurationUnit.DateBased.YEAR ->
        LocalDate(year, month, day).plus(durationInfo.toYears(), DateTimeUnit.YEAR)
      DurationUnit.DateBased.MONTH ->
        LocalDate(year, month, day).plus(durationInfo.toMonths(), DateTimeUnit.MONTH)
      else -> LocalDate(year, month, day).plus(durationInfo.toDays(), DateTimeUnit.DAY)
    }
  return FhirPathDate(year = resultDate.year, month = resultDate.month.number, day = resultDate.day)
}

private fun addMonthsToYearMonth(year: Int, month: Int, monthsToAdd: Int): FhirPathDate {
  val resultDate = LocalDate(year, month, 1).plus(monthsToAdd, DateTimeUnit.MONTH)
  return FhirPathDate(year = resultDate.year, month = resultDate.month.number)
}

private fun BigDecimal.toSecondAndNanosecond(): Pair<Int, Int> {
  val wholeSecond = toBigInteger()
  val nanosecond =
    ((this - BigDecimal.fromBigInteger(wholeSecond)) * NANOSECONDS_PER_SECOND.toBigDecimal())
      .toBigInteger()
      .intValue()
  return wholeSecond.intValue() to nanosecond
}

/**
 * FHIRPath duration units partitioned into [DateBased] (years, months, weeks, days) and [TimeBased]
 * (hours, minutes, seconds, milliseconds) to enforce date/time arithmetic scope rules.
 *
 * Supports FHIRPath calendar unit names and UCUM abbreviations (`wk`, `d`, `h`, `min`, `s`, `ms`).
 */
private sealed interface DurationUnit {
  val names: Set<String>
  val nanoseconds: Long

  fun toPeriod(value: Long): DateTimePeriod

  enum class DateBased(override val names: Set<String>, override val nanoseconds: Long) :
    DurationUnit {
    YEAR(setOf("year", "years"), DAYS_PER_YEAR * NANOSECONDS_PER_DAY) {
      override fun toPeriod(value: Long) = DateTimePeriod(years = value.toInt())
    },
    MONTH(setOf("month", "months"), DAYS_PER_MONTH * NANOSECONDS_PER_DAY) {
      override fun toPeriod(value: Long) = DateTimePeriod(months = value.toInt())
    },
    WEEK(setOf("week", "weeks", "wk"), DAYS_PER_WEEK * NANOSECONDS_PER_DAY) {
      override fun toPeriod(value: Long) = DateTimePeriod(days = (value * DAYS_PER_WEEK).toInt())
    },
    DAY(setOf("day", "days", "d"), NANOSECONDS_PER_DAY) {
      override fun toPeriod(value: Long) = DateTimePeriod(days = value.toInt())
    },
  }

  enum class TimeBased(override val names: Set<String>, override val nanoseconds: Long) :
    DurationUnit {
    HOUR(setOf("hour", "hours", "h"), NANOSECONDS_PER_HOUR) {
      override fun toPeriod(value: Long) = DateTimePeriod(hours = value.toInt())
    },
    MINUTE(setOf("minute", "minutes", "min"), NANOSECONDS_PER_MINUTE) {
      override fun toPeriod(value: Long) = DateTimePeriod(minutes = value.toInt())
    },
    SECOND(setOf("second", "seconds", "s"), NANOSECONDS_PER_SECOND) {
      override fun toPeriod(value: Long) = DateTimePeriod(seconds = value.toInt())
    },
    MILLISECOND(setOf("millisecond", "milliseconds", "ms"), NANOSECONDS_PER_MILLISECOND) {
      override fun toPeriod(value: Long) =
        DateTimePeriod(nanoseconds = value * NANOSECONDS_PER_MILLISECOND)
    },
  }

  companion object {
    private val BY_NAME: Map<String, DurationUnit> =
      (DateBased.entries + TimeBased.entries)
        .flatMap { unit -> unit.names.map { it to unit } }
        .toMap()

    fun from(name: String): DurationUnit? = BY_NAME[name]
  }
}

/**
 * A normalized duration container that converts quantities between FHIRPath unit boundaries.
 *
 * When converting from a smaller unit to a larger precision (such as months to years or minutes to
 * hours), conversion uses integer division over fixed scale ratios (`12 months = 1 year`, `30 days
 * = 1 month`, `60 minutes = 1 hour`) and discards any fractional remainder:
 * - `23 months` -> `1 year` (`23 / 12`, remainder ignored)
 * - `5 weeks` -> `1 month` (`35 days / 30`, remainder ignored)
 * - `90 minutes` -> `1 hour` (`90 / 60`, remainder ignored)
 *
 * When converting from a larger unit to a smaller precision (such as years to days or hours to
 * nanoseconds), conversion uses exact multiplication:
 * - `2 years` -> `730 days` (`2 * 365`)
 * - `2 hours` -> `7,200,000,000,000 nanoseconds` (`2 * 3.6e12`)
 *
 * This class implements the calendar duration conversion factors defined in the
 * [specification](https://build.fhir.org/ig/HL7/FHIRPath/en/#time-valued-unit-conversions).
 *
 * @property unit The resolved FHIRPath [DurationUnit].
 * @property value The integer magnitude of the duration.
 * @property originalUnit The original string representation of the unit for diagnostic messages.
 */
private class DurationInfo(val unit: DurationUnit, val value: Long, val originalUnit: String) {
  fun toYears(): Int =
    when (unit) {
      DurationUnit.DateBased.YEAR -> value.toInt()
      DurationUnit.DateBased.MONTH -> (value / MONTHS_PER_YEAR).toInt()
      else -> toDays() / DAYS_PER_YEAR
    }

  fun toMonths(): Int =
    when (unit) {
      DurationUnit.DateBased.YEAR -> (value * MONTHS_PER_YEAR).toInt()
      DurationUnit.DateBased.MONTH -> value.toInt()
      else -> toDays() / DAYS_PER_MONTH
    }

  fun toDays(): Int =
    when (unit) {
      DurationUnit.DateBased.YEAR -> (value * DAYS_PER_YEAR).toInt()
      DurationUnit.DateBased.MONTH -> (value * DAYS_PER_MONTH).toInt()
      DurationUnit.DateBased.WEEK -> (value * DAYS_PER_WEEK).toInt()
      DurationUnit.DateBased.DAY -> value.toInt()
      is DurationUnit.TimeBased -> (value / (NANOSECONDS_PER_DAY / unit.nanoseconds)).toInt()
    }

  fun toHours(): Int {
    check(unit is DurationUnit.TimeBased) { "Cannot convert '$originalUnit' to hours" }
    return (value / (NANOSECONDS_PER_HOUR / unit.nanoseconds)).toInt()
  }

  fun toMinutes(): Int {
    check(unit is DurationUnit.TimeBased) { "Cannot convert '$originalUnit' to minutes" }
    return if (unit == DurationUnit.TimeBased.HOUR) {
      (value * MINUTES_PER_HOUR).toInt()
    } else {
      (value / (NANOSECONDS_PER_MINUTE / unit.nanoseconds)).toInt()
    }
  }

  fun toNanoseconds(): Long {
    check(unit is DurationUnit.TimeBased) { "Cannot convert '$originalUnit' to nanoseconds" }
    return value * unit.nanoseconds
  }

  fun toDateTimePeriod(): DateTimePeriod = unit.toPeriod(value)

  companion object {
    fun from(duration: FhirPathQuantity, allowedUnits: Set<String>): DurationInfo {
      val value = checkNotNull(duration.value) { "Duration quantity must have a value" }
      val unquotedUnit = duration.unit?.removeSurrounding("'")?.removeSurrounding("\"") ?: ""
      check(unquotedUnit in allowedUnits) {
        "Unsupported or invalid unit '${duration.unit}' for date/time arithmetic"
      }
      val unit = checkNotNull(DurationUnit.from(unquotedUnit)) { "Invalid unit '${duration.unit}'" }
      return DurationInfo(
        unit = unit,
        value = value.toBigInteger().longValue(),
        originalUnit = duration.unit ?: "",
      )
    }
  }
}
