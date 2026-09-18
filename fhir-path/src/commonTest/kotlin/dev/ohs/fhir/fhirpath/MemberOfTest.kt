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

import dev.ohs.fhir.fhirpath.terminology.TerminologyService
import dev.ohs.fhir.model.r4.Resource
import dev.ohs.fhir.model.r4.ValueSet
import kotlin.test.Ignore
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlinx.serialization.json.Json

private val jsonR4 = Json { ignoreUnknownKeys = true }

private val engine =
  FhirPathEngine.forR4(
    terminologyService =
      TerminologyService.forR4(memberOfValueSets.map { jsonR4.decodeFromString<ValueSet>(it) })
  )

/** Case id to the expected result and the reason it differs from the HL7 engine's. */
private val differencesFromHl7Engine: Map<String, Pair<String, String>> =
  mapOf(
    "S006" to
      ("false" to
        "The HL7 engine cannot validate a code whose system it does not know, reports that as a warning, and memberOf treats a warning as true.")
  ) +
    listOf("S049", "S050", "S051", "S052", "S053").associateWith {
      "empty" to
        "The value set selects by filter or takes a whole code system. The HL7 engine evaluates it from the CodeSystem resource; ValueSetTerminologyService has no code system."
    }

private fun evaluate(engine: FhirPathEngine, case: MemberOfCase): String {
  val resource: Resource = jsonR4.decodeFromString(case.resource)
  val result = engine.evaluateExpression(case.expression, resource)
  return if (result.isEmpty()) "empty" else result.joinToString(",")
}

class MemberOfTest {

  @Test
  fun memberOf_matchesHl7Engine() {
    val mismatches =
      memberOfCases.mapNotNull { case ->
        val expected = differencesFromHl7Engine[case.id]?.first ?: case.hl7Result
        val actual = evaluate(engine, case)
        if (actual == expected) null
        else "${case.id} ${case.note}: expected $expected but was $actual"
      }
    assertEquals(emptyList(), mismatches, mismatches.joinToString("\n", prefix = "\n"))
  }

  @Test
  fun memberOf_valueSetsImportingEachOther_returnsEmpty() {
    fun valueSet(name: String, imports: String) =
      jsonR4.decodeFromString<ValueSet>(
        """{"resourceType":"ValueSet","url":"http://example.org/$name","status":"active","compose":{"include":[{"valueSet":["http://example.org/$imports"]}]}}"""
      )
    val engine =
      FhirPathEngine.forR4(
        terminologyService =
          TerminologyService.forR4(listOf(valueSet("a", "b"), valueSet("b", "a")))
      )
    val result =
      engine.evaluateExpression(
        "Observation.code.coding.memberOf('http://example.org/a')",
        jsonR4.decodeFromString<Resource>(memberOfCases.first().resource),
      )
    assertEquals(emptyList(), result.toList())
  }

  @Test
  fun memberOf_r4b() {
    val valueSets =
      memberOfValueSets.map { jsonR4.decodeFromString<dev.ohs.fhir.model.r4b.ValueSet>(it) }
    val engine = FhirPathEngine.forR4B(terminologyService = TerminologyService.forR4B(valueSets))
    val case = memberOfCases.first()
    val resource = jsonR4.decodeFromString<dev.ohs.fhir.model.r4b.Resource>(case.resource)
    assertEquals(listOf<Any>(true), engine.evaluateExpression(case.expression, resource).toList())
  }

  // FhirR5ComplexType.fromObject resolves a Coding as Base, so memberOf sees an unsupported type.
  @Ignore
  @Test
  fun memberOf_r5() {
    val valueSets =
      memberOfValueSets.map { jsonR4.decodeFromString<dev.ohs.fhir.model.r5.ValueSet>(it) }
    val engine = FhirPathEngine.forR5(terminologyService = TerminologyService.forR5(valueSets))
    val case = memberOfCases.first()
    val resource = jsonR4.decodeFromString<dev.ohs.fhir.model.r5.Resource>(case.resource)
    assertEquals(listOf<Any>(true), engine.evaluateExpression(case.expression, resource).toList())
  }

  @Test
  fun memberOf_withoutTerminologyService_returnsEmpty() {
    val results = memberOfCases.map { evaluate(FhirPathEngine.forR4(), it) }.distinct()
    assertEquals(listOf("empty"), results)
  }
}
