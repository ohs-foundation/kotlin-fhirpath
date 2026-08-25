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

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

private val fhirPathEngine = FhirPathEngine.forR4()

class LastIndexOfTest {

  @Test
  fun `lastIndexOf with empty collection receiver and argument returns empty`() =
    assertEquals(
      emptyList(),
      fhirPathEngine.evaluateExpression("{}.lastIndexOf({})", null).toList(),
    )

  @Test
  fun `lastIndexOf with empty collection receiver returns empty`() =
    assertEquals(
      emptyList(),
      fhirPathEngine.evaluateExpression("{}.lastIndexOf('ab')", null).toList(),
    )

  @Test
  fun `lastIndexOf with empty collection argument returns empty`() =
    assertEquals(
      emptyList(),
      fhirPathEngine.evaluateExpression("'ababab'.lastIndexOf({})", null).toList(),
    )

  @Test
  fun `lastIndexOf with empty string substring`() =
    assertEquals(
      listOf(6),
      fhirPathEngine.evaluateExpression("'ababab'.lastIndexOf('')", null).toList(),
    )

  @Test
  fun `lastIndexOf with empty string input and empty string substring`() =
    assertEquals(listOf(0), fhirPathEngine.evaluateExpression("''.lastIndexOf('')", null).toList())

  @Test
  fun `lastIndexOf with single occurrence`() =
    assertEquals(
      listOf(0),
      fhirPathEngine.evaluateExpression("'ab'.lastIndexOf('ab')", null).toList(),
    )

  @Test
  fun `lastIndexOf with repeating substrings`() =
    assertEquals(
      listOf(4),
      fhirPathEngine.evaluateExpression("'ababab'.lastIndexOf('ab')", null).toList(),
    )

  @Test
  fun `lastIndexOf when not found returns -1`() =
    assertEquals(
      listOf(-1),
      fhirPathEngine.evaluateExpression("'ababab'.lastIndexOf('c')", null).toList(),
    )

  @Test
  fun `lastIndexOf with multiple items in argument returns empty`() =
    assertEquals(
      emptyList(),
      fhirPathEngine.evaluateExpression("'ababab'.lastIndexOf('a' | 'b')", null).toList(),
    )

  @Test
  fun `lastIndexOf on multiple items in receiver throws IllegalStateException`() {
    assertFailsWith<IllegalStateException> {
      fhirPathEngine.evaluateExpression("('a' | 'b').lastIndexOf('a')", null)
    }
  }
}
