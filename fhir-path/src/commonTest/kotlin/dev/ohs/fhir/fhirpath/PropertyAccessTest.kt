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

import dev.ohs.fhir.fhirpath.types.FhirPathDateTime
import dev.ohs.fhir.model.r5.Resource
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import kotlinx.serialization.json.Json

private val jsonR5 = Json { ignoreUnknownKeys = true }
private val engine = FhirPathEngine.forR5()

private const val PATIENT_JSON =
  """{
  "resourceType": "Patient",
  "id": "example",
  "meta": { "versionId": "1" },
  "identifier": [
    {
      "value": "12345",
      "assigner": { "reference": "Organization/1" }
    }
  ],
  "name": [
    {
      "family": "Chalmers",
      "given": ["Peter", "James"]
    }
  ],
  "address": [
    {
      "city": "PleasantVille",
      "period": { "end": "2002-01-01" }
    }
  ],
  "contact": [
    {
      "name": { "family": "du Marché", "given": ["Bénédicte"] },
      "telecom": [{ "value": "+33 (237) 998327" }]
    }
  ]
}"""

private const val OBSERVATION_JSON =
  """{
  "resourceType": "Observation",
  "id": "example",
  "status": "final",
  "code": { "text": "Age" },
  "valueQuantity": {
    "value": 25,
    "unit": "a",
    "system": "http://unitsofmeasure.org",
    "code": "a"
  }
}"""

private fun loadResource(jsonString: String): Resource = jsonR5.decodeFromString(jsonString)

/**
 * Property access and lookup tests for generated FHIR model helpers.
 *
 * See https://github.com/ohs-foundation/kotlin-fhirpath/pull/94 for historical context.
 */
class PropertyAccessTest {

  @Test
  fun `evaluating property paths across complex types resolves correctly`() {
    val patient = loadResource(PATIENT_JSON)

    assertEquals(listOf("Peter", "James"), engine.evaluateExpression("name.given", patient))
    assertEquals(listOf("Chalmers"), engine.evaluateExpression("name.family", patient))
    assertEquals(listOf("PleasantVille"), engine.evaluateExpression("address.city", patient))
    assertEquals(
      FhirPathDateTime(year = 2002, month = 1, day = 1),
      engine.evaluateExpression("address.period.end", patient).single(),
    )
    assertEquals(listOf("12345"), engine.evaluateExpression("identifier.value", patient))
    assertEquals(
      listOf("Organization/1"),
      engine.evaluateExpression("identifier.assigner.reference", patient),
    )
    assertEquals(listOf("1"), engine.evaluateExpression("meta.versionId", patient))
  }

  @Test
  fun `descendants traverses full resource tree without stack overflow`() {
    val patient = loadResource(PATIENT_JSON)

    val descendants = engine.evaluateExpression("descendants()", patient)
    assertTrue(descendants.isNotEmpty(), "expected non-empty descendants list")
  }

  @Test
  fun `backbone element property named name is not shadowed by parameter`() {
    val patient = loadResource(PATIENT_JSON)

    assertEquals(listOf("Bénédicte"), engine.evaluateExpression("contact.name.given", patient))
    assertEquals(listOf("du Marché"), engine.evaluateExpression("contact.name.family", patient))
  }

  @Test
  fun `evaluating concrete subtype properties succeeds`() {
    val observation = loadResource(OBSERVATION_JSON)

    assertEquals(listOf("a"), engine.evaluateExpression("value.unit", observation))
  }
}
