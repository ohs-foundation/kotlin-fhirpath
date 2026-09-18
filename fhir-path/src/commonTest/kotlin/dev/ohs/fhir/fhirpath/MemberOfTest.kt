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

private val jsonR4 = Json { ignoreUnknownKeys = true }

private val engine = FhirPathEngine.forR4()

class MemberOfTest {

  /** Every case in [memberOfCases] gives the result recorded from the HL7 engine. */
  @Test
  fun memberOf_matchesHl7Engine() {
    val mismatches =
      memberOfCases.mapNotNull { case ->
        val resource: Resource = jsonR4.decodeFromString(case.resource)
        val actual =
          try {
            val result = engine.evaluateExpression(case.expression, resource)
            if (result.isEmpty()) "empty" else result.joinToString(",")
          } catch (e: Throwable) {
            "error: ${e.message}"
          }
        if (actual == case.hl7Result) null
        else "${case.id} ${case.note}: expected ${case.hl7Result} but was $actual"
      }
    assertEquals(emptyList(), mismatches, mismatches.joinToString("\n", prefix = "\n"))
  }
}
