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
import kotlin.test.assertFailsWith
import kotlinx.serialization.json.Json

private val fhirPathEngine = FhirPathEngine.forR4()

private val patient: Resource =
  Json { ignoreUnknownKeys = true }
    .decodeFromString("""{"resourceType": "Patient", "name": [{"family": "Chalmers"}]}""")

class ConformsToTest {

  @Test
  fun `element conforms to its base data type profile`() {
    assertEquals(
      listOf(true),
      fhirPathEngine
        .evaluateExpression(
          "name.first().conformsTo('http://hl7.org/fhir/StructureDefinition/HumanName')",
          patient,
        )
        .toList(),
    )
  }

  @Test
  fun `element does not conform to a different data type profile`() {
    assertEquals(
      listOf(false),
      fhirPathEngine
        .evaluateExpression(
          "name.first().conformsTo('http://hl7.org/fhir/StructureDefinition/Address')",
          patient,
        )
        .toList(),
    )
  }

  @Test
  fun `unresolvable structure throws`() {
    assertFailsWith<Exception> {
      fhirPathEngine.evaluateExpression(
        "conformsTo('http://hl7.org/fhir/StructureDefinition/NotARealType')",
        patient,
      )
    }
  }

  @Test
  fun `structure resolving only to a System type throws`() {
    // `String` is not a FHIR structure definition (FHIR's is lowercase `string`), so it must
    // error rather than fall back to the System type and return false. The input element is a
    // FHIR string, so with the lowercase URL this would return true; the error is about the
    // structure being unresolvable, not about the input.
    assertFailsWith<Exception> {
      fhirPathEngine.evaluateExpression(
        "name.first().family.conformsTo('http://hl7.org/fhir/StructureDefinition/String')",
        patient,
      )
    }
  }

  @Test
  fun `empty input returns empty`() {
    assertEquals(
      emptyList(),
      fhirPathEngine
        .evaluateExpression(
          "{}.conformsTo('http://hl7.org/fhir/StructureDefinition/Patient')",
          patient,
        )
        .toList(),
    )
  }
}
