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

import dev.ohs.fhir.model.r4.Resource
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlinx.serialization.json.Json

private val fhirPathEngine = FhirPathEngine.forR4()

private val observation: Resource =
  Json { ignoreUnknownKeys = true }
    .decodeFromString(
      """{"resourceType": "Observation", "status": "final", "code": {"text": "weight"},
         "valueQuantity": {"value": 80, "unit": "kg", "system": "http://unitsofmeasure.org",
         "code": "kg"}}"""
    )

private val unitlessObservation: Resource =
  Json { ignoreUnknownKeys = true }
    .decodeFromString(
      """{"resourceType": "Observation", "status": "final", "code": {"text": "score"},
         "valueQuantity": {"value": 5}}"""
    )

class ComparableTest {

  @Test
  fun `mass units are comparable`() {
    assertEquals(
      listOf(true),
      fhirPathEngine.evaluateExpression("(1 'kg').comparable(1 '[lb_av]')", null).toList(),
    )
  }

  @Test
  fun `identical unknown units are comparable`() {
    assertEquals(
      listOf(true),
      fhirPathEngine.evaluateExpression("(1 '[s]').comparable(1 '[s]')", null).toList(),
    )
  }

  @Test
  fun `navigated quantity element works as input`() {
    assertEquals(
      listOf(true),
      fhirPathEngine.evaluateExpression("value.comparable(1 'g')", observation).toList(),
    )
    assertEquals(
      listOf(false),
      fhirPathEngine.evaluateExpression("value.comparable(1 's')", observation).toList(),
    )
  }

  @Test
  fun `calendar year is not comparable to the UCUM year`() {
    // Matches the comparison behavior in the published spec: `1 year > 1 'a'` is empty because
    // calendar durations above seconds are not comparable to definite durations
    // (https://hl7.org/fhirpath/STU3/en/#time-valued-quantities).
    assertEquals(
      listOf(false),
      fhirPathEngine.evaluateExpression("(1 year).comparable(1 'a')", null).toList(),
    )
  }

  @Test
  fun `fhir quantity without a code returns empty`() {
    // A FHIR Quantity without a code cannot be converted to a FHIRPath Quantity, so the input is
    // not a single Quantity and the result is empty, per the specification's input rule.
    assertEquals(
      emptyList(),
      fhirPathEngine
        .evaluateExpression("valueQuantity.comparable(1 'kg')", unitlessObservation)
        .toList(),
    )
  }

  @Test
  fun `empty input returns empty`() {
    assertEquals(
      emptyList(),
      fhirPathEngine.evaluateExpression("{}.comparable(1 'kg')", null).toList(),
    )
  }
}
