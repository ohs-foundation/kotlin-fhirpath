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

// Touches many complex types, including some nested inside repeated BackboneElements, so the
// tests below exercise generated property dispatch broadly rather than for a single type.
private const val PATIENT_JSON =
  """{
  "resourceType": "Patient",
  "id": "example",
  "meta": {
    "versionId": "1",
    "lastUpdated": "2026-01-01T00:00:00Z"
  },
  "identifier": [
    {
      "use": "usual",
      "system": "urn:oid:1.2.36.146.595.217.0.1",
      "value": "12345",
      "period": { "start": "2001-05-06" },
      "assigner": { "reference": "Organization/1", "display": "Acme Healthcare" }
    }
  ],
  "active": true,
  "name": [
    {
      "use": "official",
      "family": "Chalmers",
      "given": ["Peter", "James"],
      "period": { "start": "1974-12-25" }
    }
  ],
  "telecom": [
    { "system": "phone", "value": "(03) 5555 6473", "use": "work" }
  ],
  "gender": "male",
  "birthDate": "1974-12-25",
  "address": [
    {
      "use": "home",
      "line": ["534 Erewhon St"],
      "city": "PleasantVille",
      "state": "Vic",
      "postalCode": "3999",
      "period": { "start": "1974-12-25", "end": "2002-01-01" }
    }
  ],
  "maritalStatus": {
    "coding": [
      { "system": "http://terminology.hl7.org/CodeSystem/v3-MaritalStatus", "code": "M", "display": "Married" }
    ],
    "text": "Married"
  },
  "photo": [
    { "contentType": "image/jpeg", "title": "Photo" }
  ],
  "contact": [
    {
      "relationship": [
        { "coding": [{ "system": "http://terminology.hl7.org/CodeSystem/v2-0131", "code": "N" }] }
      ],
      "name": { "family": "du Marché", "given": ["Bénédicte"] },
      "telecom": [{ "system": "phone", "value": "+33 (237) 998327" }],
      "address": {
        "line": ["534 Erewhon St"],
        "city": "PleasantVille",
        "period": { "start": "2010-01-01" }
      },
      "gender": "female",
      "organization": { "reference": "Organization/1", "display": "Acme Healthcare" },
      "period": { "start": "2012-01-01" }
    }
  ],
  "communication": [
    {
      "language": {
        "coding": [{ "system": "urn:ietf:bcp:47", "code": "en", "display": "English" }]
      },
      "preferred": true
    }
  ],
  "generalPractitioner": [
    { "reference": "Practitioner/example" }
  ],
  "managingOrganization": { "reference": "Organization/1" },
  "link": [
    { "other": { "reference": "Patient/example2" }, "type": "seealso" }
  ]
}"""

private fun loadPatient(): Resource = jsonR5.decodeFromString(PATIENT_JSON)

/**
 * Regression tests for two bugs that made evaluating ordinary FHIRPath expressions against an R5
 * `Patient` unreliable: one crashed the app outright, the other silently handed back the wrong
 * data. Both traced back to bugs in generated property-lookup code.
 */
class R5ComplexTypeDispatchRegressionTest {

  @Test
  fun `evaluating property paths across many complex types does not stack overflow`() {
    // Before the fix, an app calling evaluateExpression("name.given", ...) would crash with a
    // StackOverflowError instead of getting the given names back.
    val patient = loadPatient()

    assertEquals(listOf("Peter", "James"), engine.evaluateExpression("name.given", patient))
    assertEquals(listOf("Chalmers"), engine.evaluateExpression("name.family", patient))
    assertEquals(listOf("(03) 5555 6473"), engine.evaluateExpression("telecom.value", patient))
    assertEquals(listOf("PleasantVille"), engine.evaluateExpression("address.city", patient))
    assertEquals(
      FhirPathDateTime(year = 2002, month = 1, day = 1),
      engine.evaluateExpression("address.period.end", patient).single(),
    )
    assertEquals(listOf("M"), engine.evaluateExpression("maritalStatus.coding.code", patient))
    assertEquals(
      listOf("+33 (237) 998327"),
      engine.evaluateExpression("contact.telecom.value", patient),
    )
    assertEquals(
      listOf("PleasantVille"),
      engine.evaluateExpression("contact.address.city", patient),
    )
    assertEquals(
      listOf("N"),
      engine.evaluateExpression("contact.relationship.coding.code", patient),
    )
    assertEquals(
      listOf("Organization/1"),
      engine.evaluateExpression("contact.organization.reference", patient),
    )
    assertEquals(listOf("12345"), engine.evaluateExpression("identifier.value", patient))
    assertEquals(
      listOf("Organization/1"),
      engine.evaluateExpression("identifier.assigner.reference", patient),
    )
    assertEquals(listOf("image/jpeg"), engine.evaluateExpression("photo.contentType", patient))
    assertEquals(
      listOf("en"),
      engine.evaluateExpression("communication.language.coding.code", patient),
    )
    assertEquals(
      listOf("Practitioner/example"),
      engine.evaluateExpression("generalPractitioner.reference", patient),
    )
    assertEquals(
      listOf("Organization/1"),
      engine.evaluateExpression("managingOrganization.reference", patient),
    )
    assertEquals(
      listOf("Patient/example2"),
      engine.evaluateExpression("link.other.reference", patient),
    )
    assertEquals(listOf("1"), engine.evaluateExpression("meta.versionId", patient))
  }

  @Test
  fun `walking the entire resource tree does not stack overflow`() {
    val patient = loadPatient()

    // Which property type actually crashed depended on arbitrary codegen ordering, so it wasn't
    // just HumanName at risk. descendants() touches every element in the resource, so this one
    // call would have crashed no matter which type the bug happened to land on.
    val descendants = engine.evaluateExpression("descendants()", patient)

    assertTrue(descendants.size > 50, "expected a deep tree, got ${descendants.size} nodes")
  }

  @Test
  fun `backbone element properties named 'name' are not shadowed by the lookup parameter`() {
    // A different, quieter bug: an app reading contact.name.given got back an empty list, no
    // error at all, because generated code confused the "name" property with the "name" of the
    // property it was looking up.
    val patient = loadPatient()

    assertEquals(listOf("Bénédicte"), engine.evaluateExpression("contact.name.given", patient))
    assertEquals(listOf("du Marché"), engine.evaluateExpression("contact.name.family", patient))
  }
}
