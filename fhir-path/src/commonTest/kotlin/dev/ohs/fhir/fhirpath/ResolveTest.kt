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

import dev.ohs.fhir.model.r4.Device
import dev.ohs.fhir.model.r4.Patient
import dev.ohs.fhir.model.r4.Reference
import dev.ohs.fhir.model.r4.Resource
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlinx.serialization.json.Json

private val json = Json { ignoreUnknownKeys = true }

private fun observation(subject: String): Resource =
  json.decodeFromString(
    """
    {
      "resourceType": "Observation",
      "contained": [{"resourceType": "Patient", "id": "p1"}],
      "status": "final",
      "code": {"text": "test"},
      "subject": $subject
    }
    """
  )

/** Tests for `resolve()`; see [specification](https://hl7.org/fhir/R5/fhirpath.html#functions). */
class ResolveTest {
  private val resources =
    mapOf(
      "Patient/p2" to Patient(id = "p2"),
      "http://example.org/fhir/Patient/p3" to Patient(id = "p3"),
      "Device/d1" to Device(id = "d1"),
    )
  private val calls = mutableListOf<Pair<String?, Any>>()
  private val fhirPathEngine =
    FhirPathEngine.forR4 {
      resolveReference = { reference, item ->
        calls += reference to item
        resources[reference]
      }
    }

  private fun ids(expression: String, resource: Resource?) =
    fhirPathEngine.evaluateExpression(expression, resource).toList()

  @Test
  fun `resolves a contained resource without calling resolveReference`() {
    assertEquals(
      listOf("p1"),
      ids("Observation.subject.resolve().id", observation("""{"reference": "#p1"}""")),
    )
    assertEquals(emptyList(), calls)
  }

  @Test
  fun `resolves a contained resource without a resolveReference function`() {
    assertEquals(
      listOf("p1"),
      FhirPathEngine.forR4()
        .evaluateExpression(
          "Observation.subject.resolve().id",
          observation("""{"reference": "#p1"}"""),
        )
        .toList(),
    )
  }

  @Test
  fun `ignores a reference to a contained resource that is not there`() {
    assertEquals(
      emptyList(),
      ids("Observation.subject.resolve()", observation("""{"reference": "#p9"}""")),
    )
    assertEquals(emptyList(), calls)
  }

  @Test
  fun `passes a relative reference and the Reference to resolveReference`() {
    val resource = observation("""{"reference": "Patient/p2"}""")
    assertEquals(listOf("p2"), ids("Observation.subject.resolve().id", resource))
    assertEquals("Patient/p2", calls.single().first)
    assertEquals("Patient/p2", ((calls.single().second as Reference).reference?.value))
  }

  @Test
  fun `passes an absolute reference as it is`() {
    assertEquals(
      listOf("p3"),
      ids(
        "Observation.subject.resolve().id",
        observation("""{"reference": "http://example.org/fhir/Patient/p3"}"""),
      ),
    )
  }

  @Test
  fun `passes a Reference without a reference to resolveReference`() {
    val resource =
      observation(
        """{"type": "Patient", "identifier": {"system": "urn:example", "value": "123"}}"""
      )
    assertEquals(emptyList(), ids("Observation.subject.resolve()", resource))
    val (reference, item) = calls.single()
    assertEquals(null, reference)
    assertEquals("Patient", (item as Reference).type?.value)
  }

  @Test
  fun `keeps only references whose target is the given type`() {
    val expression = "Observation.subject.where(resolve() is Patient).reference"
    assertEquals(
      listOf("Patient/p2"),
      ids(expression, observation("""{"reference": "Patient/p2"}""")),
    )
    assertEquals(emptyList(), ids(expression, observation("""{"reference": "Device/d1"}""")))
  }

  @Test
  fun `returns empty for an empty input`() {
    assertEquals(emptyList(), ids("{}.resolve()", null))
  }

  @Test
  fun `resolves a string`() {
    assertEquals(listOf("p2"), ids("'Patient/p2'.resolve().id", null))
    assertEquals("Patient/p2", calls.single().second)
  }

  @Test
  fun `resolves a FHIR string`() {
    assertEquals(
      listOf("p2"),
      ids(
        "Observation.subject.reference.resolve().id",
        observation("""{"reference": "Patient/p2"}"""),
      ),
    )
  }

  @Test
  fun `ignores a reference that resolveReference does not find`() {
    assertEquals(
      emptyList(),
      ids("Observation.subject.resolve()", observation("""{"reference": "Patient/p9"}""")),
    )
  }

  @Test
  fun `ignores other references when there is no resolveReference function`() {
    assertEquals(
      emptyList(),
      FhirPathEngine.forR4()
        .evaluateExpression(
          "Observation.subject.resolve()",
          observation("""{"reference": "Patient/p2"}"""),
        )
        .toList(),
    )
  }

  @Test
  fun `ignores an item that is neither a Reference nor a string`() {
    assertEquals(emptyList(), ids("1.resolve()", null))
    assertEquals(emptyList(), calls)
  }
}
