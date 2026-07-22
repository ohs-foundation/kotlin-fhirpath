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

private val jsonR4 = Json { ignoreUnknownKeys = true }

private val patient: Resource =
  jsonR4.decodeFromString(
    """
      {
        "resourceType": "Patient",
        "id": "example",
        "gender": "male",
        "name": [
          { "use": "official", "family": "Chalmers" },
          { "use": "usual", "given": ["Jim"] }
        ]
      }
      """
  )

class OfTypeTest {

  @Test
  fun `returns resource matching a resource type`() {
    assertEquals(
      listOf<Any>(patient),
      fhirPathEngine.evaluateExpression("Patient.ofType(Patient)", patient).toList(),
    )
  }

  @Test
  fun `returns resource matching a namespace-qualified resource type`() {
    assertEquals(
      listOf<Any>(patient),
      fhirPathEngine.evaluateExpression("Patient.ofType(FHIR.Patient)", patient).toList(),
    )
  }

  @Test
  fun `returns resource matching a backtick-escaped resource type`() {
    assertEquals(
      listOf<Any>(patient),
      fhirPathEngine.evaluateExpression("Patient.ofType(FHIR.`Patient`)", patient).toList(),
    )
  }

  @Test
  fun `returns empty for a non-matching resource type`() {
    assertEquals(
      emptyList(),
      fhirPathEngine.evaluateExpression("Patient.ofType(Observation)", patient).toList(),
    )
  }

  @Test
  fun `filters items matching a system type in a mixed collection`() {
    assertEquals(
      listOf<Any>(1),
      fhirPathEngine.evaluateExpression("(1 | 'a' | true).ofType(Integer)", null).toList(),
    )
    assertEquals(
      listOf<Any>("a"),
      fhirPathEngine.evaluateExpression("(1 | 'a' | true).ofType(System.String)", null).toList(),
    )
    assertEquals(
      listOf<Any>(true),
      fhirPathEngine.evaluateExpression("(1 | 'a' | true).ofType(Boolean)", null).toList(),
    )
  }

  @Test
  fun `returns empty for an empty input collection`() {
    assertEquals(
      emptyList(),
      fhirPathEngine.evaluateExpression("{}.ofType(string)", patient).toList(),
    )
  }
}
