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

// `Dosage` and `Timing` are complex types derived from `BackboneElement` in R4, and contain nested
// elements (e.g. `Dosage.doseAndRate`, `Timing.repeat`) of their own.
private val medicationRequest: Resource =
  jsonR4.decodeFromString(
    """
      {
        "resourceType": "MedicationRequest",
        "id": "example",
        "status": "active",
        "intent": "order",
        "medicationCodeableConcept": { "text": "Amoxicillin 250mg" },
        "subject": { "reference": "Patient/example" },
        "dosageInstruction": [
          {
            "text": "1 capsule three times daily",
            "timing": {
              "repeat": { "frequency": 3, "period": 1, "periodUnit": "d" },
              "code": { "text": "TID" }
            },
            "route": { "text": "oral" },
            "doseAndRate": [
              { "doseQuantity": { "value": 250, "unit": "mg" } }
            ]
          }
        ]
      }
      """
  )

class DosageTest {

  private fun evaluate(expression: String) =
    fhirPathEngine.evaluateExpression(expression, medicationRequest).toList()

  @Test
  fun `navigates to dosage text`() {
    assertEquals(listOf<Any>("1 capsule three times daily"), evaluate("dosageInstruction.text"))
  }

  @Test
  fun `navigates to dosage route`() {
    assertEquals(listOf<Any>("oral"), evaluate("dosageInstruction.route.text"))
  }

  @Test
  fun `navigates to dose quantity in dose and rate`() {
    assertEquals(1, evaluate("dosageInstruction.doseAndRate").size)
    assertEquals(
      listOf<Any>(true),
      evaluate("dosageInstruction.doseAndRate.dose.ofType(Quantity).value = 250"),
    )
    assertEquals(
      listOf<Any>("mg"),
      evaluate("dosageInstruction.doseAndRate.dose.ofType(Quantity).unit"),
    )
  }

  @Test
  fun `returns children of dosage`() {
    assertEquals(listOf<Any>(4), evaluate("dosageInstruction.children().count()"))
  }

  @Test
  fun `navigates to timing`() {
    assertEquals(listOf<Any>("TID"), evaluate("dosageInstruction.timing.code.text"))
    assertEquals(listOf<Any>(3), evaluate("dosageInstruction.timing.repeat.frequency"))
    assertEquals(listOf<Any>("d"), evaluate("dosageInstruction.timing.repeat.periodUnit"))
    assertEquals(listOf<Any>(2), evaluate("dosageInstruction.timing.children().count()"))
  }
}
