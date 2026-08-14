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

package dev.ohs.fhir.fhirpath

import dev.ohs.fhir.fhirpath.types.FhirPathDate
import dev.ohs.fhir.fhirpath.types.FhirPathDateTime
import dev.ohs.fhir.fhirpath.types.FhirPathTime
import dev.ohs.fhir.model.r4.Patient
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFails

class DateTimeArithmeticTest {
  private val fhirPathEngine = FhirPathEngine.forR4()
  private val context = Patient()

  private fun evalDate(expression: String): String =
    (fhirPathEngine.evaluateExpression(expression, context).single() as FhirPathDate).toString()

  private fun evalDateTime(expression: String): FhirPathDateTime =
    fhirPathEngine.evaluateExpression(expression, context).single() as FhirPathDateTime

  private fun evalTime(expression: String): FhirPathTime =
    fhirPathEngine.evaluateExpression(expression, context).single() as FhirPathTime

  // Date arithmetic

  @Test
  fun `add years to date in leap year`() {
    assertEquals("2025-02-28", evalDate("@2024-02-29 + 1 year"))
  }

  @Test
  fun `subtract days across century leap year boundary`() {
    assertEquals("2000-02-29", evalDate("@2000-03-01 - 1 day"))
  }

  @Test
  fun `add months to full date`() {
    assertEquals("2014-02-28", evalDate("@2014-01-31 + 1 month"))
  }

  @Test
  fun `subtract months from end of month clamps to last day in leap year`() {
    assertEquals("2024-02-29", evalDate("@2024-03-31 - 1 month"))
  }

  @Test
  fun `add months to partial year date`() {
    assertEquals("2015", evalDate("@2014 + 23 months"))
  }

  @Test
  fun `subtract months from partial year date spans multiple past years`() {
    assertEquals("2012", evalDate("@2014 - 24 months"))
  }

  @Test
  fun `add weeks to full date`() {
    assertEquals("1974-01-01", evalDate("@1973-12-25 + 1 week"))
  }

  @Test
  fun `subtract weeks from full date wraps into previous year`() {
    assertEquals("2025-12-25", evalDate("@2026-01-01 - 1 week"))
  }

  @Test
  fun `add weeks to partial month date`() {
    assertEquals("2026-03", evalDate("@2026-02 + 5 weeks"))
  }

  @Test
  fun `subtract weeks from partial month date`() {
    assertEquals("2026-02", evalDate("@2026-03 - 5 weeks"))
  }

  @Test
  fun `add days to full date`() {
    assertEquals("2014-01-11", evalDate("@2014-01-01 + 10 days"))
  }

  @Test
  fun `subtract days from full date`() {
    assertEquals("2013-12-22", evalDate("@2014-01-01 - 10 days"))
  }

  @Test
  fun `add days to partial year date`() {
    assertEquals("2017", evalDate("@2016 + 365 days"))
  }

  @Test
  fun `subtract days from partial year date decrements year`() {
    assertEquals("2015", evalDate("@2016 - 365 days"))
  }

  @Test
  fun `add fractional days truncates remainder`() {
    assertEquals("1974-01-01", evalDate("@1973-12-25 + 7.9 days"))
  }

  @Test
  fun `subtract fractional days across month boundary truncates remainder`() {
    assertEquals("2026-02-28", evalDate("@2026-03-01 - 1.8 days"))
  }

  @Test
  fun `add UCUM unit abbreviations to date`() {
    assertEquals("1974-01-01", evalDate("@1973-12-25 + 1 'wk'"))
  }

  @Test
  fun `subtract UCUM day abbreviation from date across year boundary`() {
    assertEquals("2025-12-31", evalDate("@2026-01-01 - 1 'd'"))
  }

  // DateTime arithmetic

  @Test
  fun `add hours to datetime`() {
    assertEquals(2, evalDateTime("@2026-01-31T23:00:00 + 2 hours").month)
  }

  @Test
  fun `subtract hours from datetime`() {
    assertEquals(0, evalDateTime("@2014-01-01T01:00:00.000+00:00 - 1 hour").hour)
  }

  @Test
  fun `add minutes to datetime`() {
    assertEquals(30, evalDateTime("@2026-01-01T13:00:00 + 30 minutes").minute)
  }

  @Test
  fun `subtract minutes from datetime`() {
    assertEquals(28, evalDateTime("@2026-03-01T00:15:00 - 30 minutes").day)
  }

  @Test
  fun `add minutes to hour precision datetime truncates fractional hour`() {
    assertEquals(11, evalDateTime("@2020-01-01T10 + 90 minutes").hour)
  }

  @Test
  fun `subtract minutes from hour precision datetime truncates fractional hour`() {
    assertEquals(9, evalDateTime("@2020-01-01T11 - 90 minutes").hour)
  }

  @Test
  fun `add seconds to datetime`() {
    assertEquals("45", evalDateTime("@2026-01-01T13:00:30 + 15 seconds").second?.toPlainString())
  }

  @Test
  fun `subtract seconds from datetime using UCUM alias`() {
    assertEquals("15", evalDateTime("@2026-01-01T13:00:30 - 15 's'").second?.toPlainString())
  }

  @Test
  fun `add milliseconds to datetime`() {
    assertEquals(
      "0.75",
      evalDateTime("@2026-01-01T13:00:00.250 + 500 milliseconds").second?.toPlainString(),
    )
  }

  @Test
  fun `subtract milliseconds from datetime using UCUM alias`() {
    assertEquals(
      "0.25",
      evalDateTime("@2026-01-01T13:00:00.500 - 250 'ms'").second?.toPlainString(),
    )
  }

  // Time arithmetic

  @Test
  fun `add hours to time wraps around 24-hour cycle`() {
    with(evalTime("@T23:30:00 + 1 hour")) {
      assertEquals(0, hour)
      assertEquals(30, minute)
    }
  }

  @Test
  fun `subtract hours from time wraps around 24-hour cycle`() {
    with(evalTime("@T00:30:00 - 1 hour")) {
      assertEquals(23, hour)
      assertEquals(30, minute)
    }
  }

  @Test
  fun `add minutes to time wraps across hour`() {
    with(evalTime("@T23:45:00 + 30 minutes")) {
      assertEquals(0, hour)
      assertEquals(15, minute)
    }
  }

  @Test
  fun `subtract minutes from time wraps backward across hour`() {
    with(evalTime("@T00:15:00 - 30 minutes")) {
      assertEquals(23, hour)
      assertEquals(45, minute)
    }
  }

  @Test
  fun `add seconds to time`() {
    assertEquals("45", evalTime("@T12:00:30 + 15 seconds").second?.toPlainString())
  }

  @Test
  fun `subtract seconds from time using UCUM alias`() {
    assertEquals("15", evalTime("@T12:00:30 - 15 's'").second?.toPlainString())
  }

  @Test
  fun `add milliseconds to time`() {
    assertEquals("0.75", evalTime("@T12:00:00.250 + 500 milliseconds").second?.toPlainString())
  }

  @Test
  fun `subtract milliseconds from time using UCUM alias`() {
    assertEquals("0.25", evalTime("@T12:00:00.500 - 250 'ms'").second?.toPlainString())
  }

  @Test
  fun `add large hour quantity to time without overflow`() {
    with(evalTime("@T01:00:00 + 1000000000 hours")) {
      assertEquals(17, hour)
      assertEquals(0, minute)
    }
  }

  @Test
  fun `subtract large hour quantity from time without overflow`() {
    with(evalTime("@T01:00:00 - 1000000000 hours")) {
      assertEquals(9, hour)
      assertEquals(0, minute)
    }
  }

  // Invalid unit combinations

  @Test
  fun `adding physical UCUM calendar code to date fails`() {
    assertFails { fhirPathEngine.evaluateExpression("@1973-12-25 + 1 'mo'", context) }
  }

  @Test
  fun `adding time units to date fails`() {
    assertFails { fhirPathEngine.evaluateExpression("@1973-12-25 + 1 hour", context) }
  }

  @Test
  fun `adding date units to time fails`() {
    assertFails { fhirPathEngine.evaluateExpression("@T12:00:00 + 1 day", context) }
  }
}
