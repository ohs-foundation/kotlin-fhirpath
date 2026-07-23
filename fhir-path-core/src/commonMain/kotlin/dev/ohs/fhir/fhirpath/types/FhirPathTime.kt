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

import com.ionspin.kotlin.bignum.decimal.BigDecimal
import dev.ohs.fhir.fhirpath.createSecondBigDecimal
import dev.ohs.fhir.fhirpath.decimalPlaces
import dev.ohs.fhir.fhirpath.toBigDecimalPreservingScale
import kotlinx.datetime.LocalTime

data class FhirPathTime(val hour: Int, val minute: Int? = null, val second: BigDecimal? = null) {
  enum class Precision {
    HOUR,
    MINUTE,
    SECOND;

    companion object {
      fun fromIntegerPrecision(precision: Int): Precision =
        when (precision) {
          2 -> HOUR
          4 -> MINUTE
          else -> if (precision >= 6) SECOND else error("Invalid precision value: $precision")
        }
    }
  }

  val precision =
    when {
      second != null -> Precision.SECOND
      minute != null -> Precision.MINUTE
      else -> Precision.HOUR
    }

  /** Returns the character count precision for this Time value. */
  val integerPrecision: Int
    get() {
      var p = 2
      if (minute != null) p += 2
      if (second != null) {
        p += 2
        p += second.decimalPlaces.toInt()
      }
      return p
    }

  /**
   * Resolves and validates a target precision parameter for Time operations. Returns null if
   * [requestedPrecision] is invalid for a Time (must be 2, 4, 6, or > 6).
   */
  fun resolvePrecision(requestedPrecision: Int? = null): Int? {
    val resolved = requestedPrecision ?: integerPrecision
    return if (resolved in setOf(2, 4, 6) || resolved > 6) resolved else null
  }

  fun compareTo(other: FhirPathTime): Int? {
    if (precision != other.precision) {
      return null
    }
    hour.compareTo(other.hour).let { if (it != 0) return it }
    minute?.compareTo(other.minute!!).let { if (it != 0) return it }
    second?.compareTo(other.second!!).let { if (it != 0) return it }
    return 0
  }

  companion object {
    fun fromString(string: String): FhirPathTime {
      val regex =
        Regex(
          "^" +
            "(?<hour>\\d{2})" +
            "(:(?<minute>\\d{2}))?" +
            "(:(?<second>\\d{2}(\\.\\d+)?))?" +
            "$"
        )

      val match =
        regex.find(string)
          ?: throw IllegalArgumentException("Invalid FHIRPath Time format: $string")
      val groups = match.groups

      val hour = groups["hour"]!!.value.toInt()
      val minute = groups["minute"]?.value?.toInt()
      val second = groups["second"]?.value?.toBigDecimalPreservingScale()

      // Use kotlinx.LocalTime to validate the time components
      try {
        LocalTime(hour, minute ?: 0, second?.toBigInteger()?.intValue() ?: 0)
      } catch (e: Exception) {
        throw IllegalArgumentException("Invalid time component in literal: $string", e)
      }
      return FhirPathTime(hour, minute, second)
    }

    fun fromLocalTime(localTime: LocalTime): FhirPathTime =
      FhirPathTime(
        hour = localTime.hour,
        minute = localTime.minute,
        second = createSecondBigDecimal(localTime.second, localTime.nanosecond),
      )
  }
}
