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
      """{"resourceType": "Observation", "status": "final", "code": {"text": "w"},
         "valueQuantity": {"value": 80, "unit": "kg", "system": "http://unitsofmeasure.org",
         "code": "kg"},
         "_status": {"extension": [{"url": "https://example.org/x", "valueString": "e"}]},
         "_issued": {"id": "no-value", "extension": [{"url": "https://example.org/x",
         "valueString": "e"}]}}"""
    )

class HasValueTest {

  @Test
  fun `primitive with a value returns true`() {
    assertEquals(
      listOf(true),
      fhirPathEngine.evaluateExpression("status.hasValue()", observation).toList(),
    )
  }

  @Test
  fun `complex type is not a primitive even though it has a value property`() {
    // Quantity has a `value` property, but hasValue() only applies to FHIR primitives.
    assertEquals(
      listOf(false),
      fhirPathEngine.evaluateExpression("value.hasValue()", observation).toList(),
    )
  }

  @Test
  fun `primitive without a value returns false`() {
    // `issued` exists only through `_issued`: an element carrying an id and an extension but no
    // value. The count check proves the element is present, so the false is not from empty input.
    assertEquals(
      listOf(1),
      fhirPathEngine.evaluateExpression("issued.count()", observation).toList(),
    )
    assertEquals(
      listOf(false),
      fhirPathEngine.evaluateExpression("issued.hasValue()", observation).toList(),
    )
  }

  @Test
  fun `multi-item input returns false`() {
    // Two copies of a primitive that alone returns true, so the false can only come from the
    // item count. combine() because the union operator would deduplicate them back to one.
    assertEquals(
      listOf(false),
      fhirPathEngine.evaluateExpression("status.combine(status).hasValue()", observation).toList(),
    )
  }

  @Test
  fun `empty input returns false`() {
    assertEquals(
      listOf(false),
      fhirPathEngine.evaluateExpression("{}.hasValue()", observation).toList(),
    )
  }
}
