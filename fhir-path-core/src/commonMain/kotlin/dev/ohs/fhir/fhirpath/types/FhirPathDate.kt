/*
 * Copyright 2025-2026 Open Health Stack Foundation
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

package dev.ohs.fhir.fhirpath.types

import kotlin.time.ExperimentalTime
import kotlinx.datetime.LocalDate
import kotlinx.datetime.YearMonth

data class FhirPathDate(val year: Int, val month: Int? = null, val day: Int? = null) {

  enum class Precision {
    YEAR,
    MONTH,
    DAY;

    companion object {
      fun fromIntegerPrecision(precision: Int): Precision =
        when (precision) {
          4 -> YEAR
          6 -> MONTH
          8 -> DAY
          else -> error("Invalid precision value: $precision")
        }
    }
  }

  val precision =
    when {
      day != null -> Precision.DAY
      month != null -> Precision.MONTH
      else -> Precision.YEAR
    }

  /** Returns the character count precision (4 for Year, 6 for Month, 8 for Day). */
  val integerPrecision: Int
    get() =
      when {
        day != null -> 8
        month != null -> 6
        else -> 4
      }

  /**
   * Resolves and validates a target precision parameter for Date operations. Returns null if
   * [targetPrecision] is invalid for a Date (must be 4, 6, or 8).
   */
  fun resolvePrecision(targetPrecision: Int? = null): Int? {
    val resolved = targetPrecision ?: integerPrecision
    return if (resolved == 4 || resolved == 6 || resolved == 8) resolved else null
  }

  @OptIn(ExperimentalTime::class)
  fun compareTo(other: FhirPathDate): Int? {
    year.compareTo(other.year).let { if (it != 0) return it }

    if ((month == null) != (other.month == null)) return null
    month?.compareTo(other.month!!).let { if (it != 0) return it }

    if ((day == null) != (other.day == null)) return null
    day?.compareTo(other.day!!).let { if (it != 0) return it }

    return 0
  }

  override fun toString(): String {
    return when (precision) {
      Precision.YEAR -> year.toString().padStart(4, '0')
      Precision.MONTH -> "${year.toString().padStart(4, '0')}-${month.toString().padStart(2, '0')}"
      Precision.DAY ->
        "${year.toString().padStart(4, '0')}-${month.toString().padStart(2, '0')}-${day.toString().padStart(2, '0')}"
    }
  }

  companion object {
    fun fromString(string: String): FhirPathDate {
      val regex =
        Regex("^" + "(?<year>\\d{4})" + "(-(?<month>\\d{2})" + "(-(?<day>\\d{2}))?)?" + "$")

      val match =
        regex.find(string)
          ?: throw IllegalArgumentException("Invalid FHIRPath Date format: $string")
      val groups = match.groups

      val year = groups["year"]!!.value.toInt()
      val month = groups["month"]?.value?.toInt()
      val day = groups["day"]?.value?.toInt()

      // Use kotlinx.datetime for robust validation of date components
      try {
        if (day != null) {
          LocalDate(year, month!!, day)
        } else if (month != null) {
          YearMonth(year, month)
        }
      } catch (e: Exception) {
        throw IllegalArgumentException("Invalid date component in literal: $string", e)
      }

      return FhirPathDate(year, month, day)
    }
  }
}
