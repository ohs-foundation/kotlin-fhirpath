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

package dev.ohs.fhir.fhirpath

import com.ionspin.kotlin.bignum.decimal.toBigDecimal
import dev.ohs.fhir.fhirpath.types.FhirPathDate
import dev.ohs.fhir.fhirpath.types.FhirPathTime
import io.kotest.core.spec.style.FunSpec
import kotlin.test.assertEquals

class DateTimeComponentTest :
  FunSpec({
    val engine = FhirPathEngine.forR4()

    test("yearOf() extracts year from Date") {
      assertEquals(listOf(2023), engine.evaluateExpression("@2023-05-15.yearOf()", null))
    }

    test("yearOf() extracts year from DateTime") {
      assertEquals(listOf(2024), engine.evaluateExpression("@2024-01-01T12:30:45Z.yearOf()", null))
    }

    test("monthOf() extracts month from Date") {
      assertEquals(listOf(5), engine.evaluateExpression("@2023-05-15.monthOf()", null))
    }

    test("monthOf() returns empty list when Date is missing month") {
      assertEquals(emptyList<Any>(), engine.evaluateExpression("@2023.monthOf()", null))
    }

    test("monthOf() extracts month from DateTime") {
      assertEquals(listOf(11), engine.evaluateExpression("@2023-11-01T12:00:00Z.monthOf()", null))
    }

    test("dayOf() extracts day from Date") {
      assertEquals(listOf(15), engine.evaluateExpression("@2023-05-15.dayOf()", null))
    }

    test("dayOf() returns empty list when Date is missing day") {
      assertEquals(emptyList<Any>(), engine.evaluateExpression("@2023-05.dayOf()", null))
    }

    test("dayOf() extracts day from DateTime") {
      assertEquals(listOf(30), engine.evaluateExpression("@2023-04-30T10:00:00Z.dayOf()", null))
    }

    test("hourOf() extracts hour from Time") {
      assertEquals(listOf(14), engine.evaluateExpression("@T14:30:00.hourOf()", null))
    }

    test("hourOf() extracts hour from DateTime") {
      assertEquals(listOf(8), engine.evaluateExpression("@2023-05-15T08:15:00Z.hourOf()", null))
    }

    test("minuteOf() extracts minute from Time") {
      assertEquals(listOf(30), engine.evaluateExpression("@T14:30:00.minuteOf()", null))
    }

    test("minuteOf() extracts minute from DateTime") {
      assertEquals(listOf(15), engine.evaluateExpression("@2023-05-15T08:15:00Z.minuteOf()", null))
    }

    test("secondOf() extracts integer second from Time ignoring milliseconds") {
      assertEquals(listOf(45), engine.evaluateExpression("@T14:30:45.123.secondOf()", null))
    }

    test("secondOf() extracts integer second from DateTime ignoring milliseconds") {
      assertEquals(
        listOf(9),
        engine.evaluateExpression("@2023-05-15T08:15:09.999Z.secondOf()", null),
      )
    }

    test("millisecondOf() extracts 3-digit fractional second as integer ms") {
      assertEquals(listOf(123), engine.evaluateExpression("@T14:30:45.123.millisecondOf()", null))
    }

    test("millisecondOf() pads 1-digit fractional second to milliseconds") {
      assertEquals(listOf(500), engine.evaluateExpression("@T14:30:45.5.millisecondOf()", null))
    }

    test("millisecondOf() returns 0 when fractional seconds are absent") {
      assertEquals(listOf(0), engine.evaluateExpression("@T14:30:45.millisecondOf()", null))
    }

    test("timezoneOffsetOf() extracts fractional decimal hours for half-hour offsets") {
      assertEquals(
        listOf(5.5.toBigDecimal()),
        engine.evaluateExpression("@2023-05-15T12:00:00+05:30.timezoneOffsetOf()", null),
      )
    }

    test("timezoneOffsetOf() extracts negative decimal hours for western hemisphere offsets") {
      assertEquals(
        listOf((-4).toBigDecimal()),
        engine.evaluateExpression("@2023-05-15T12:00:00-04:00.timezoneOffsetOf()", null),
      )
    }

    test("timezoneOffsetOf() returns zero for UTC Z offset") {
      assertEquals(
        listOf(0.toBigDecimal()),
        engine.evaluateExpression("@2023-05-15T12:00:00Z.timezoneOffsetOf()", null),
      )
    }

    test("dateOf() returns identity when called on Date") {
      assertEquals(
        listOf(FhirPathDate(2023, 5, 15)),
        engine.evaluateExpression("@2023-05-15.dateOf()", null),
      )
    }

    test("dateOf() extracts Date from DateTime") {
      assertEquals(
        listOf(FhirPathDate(2023, 5, 15)),
        engine.evaluateExpression("@2023-05-15T12:30:00Z.dateOf()", null),
      )
    }

    test("timeOf() returns identity when called on Time") {
      assertEquals(
        listOf(FhirPathTime(14, 30, 45.toBigDecimal())),
        engine.evaluateExpression("@T14:30:45.timeOf()", null),
      )
    }

    test("timeOf() extracts Time from DateTime") {
      assertEquals(
        listOf(FhirPathTime(12, 30, 45.toBigDecimal())),
        engine.evaluateExpression("@2023-05-15T12:30:45Z.timeOf()", null),
      )
    }
  })
