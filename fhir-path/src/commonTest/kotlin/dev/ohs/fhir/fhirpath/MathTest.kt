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

import dev.ohs.fhir.fhirpath.types.FhirPathDecimal
import dev.ohs.fhir.fhirpath.types.FhirPathQuantity
import kotlin.test.Test
import kotlin.test.assertEquals

private val fhirPathEngine = FhirPathEngine.forR4()

class MathTest {

  @Test
  fun `ceiling on Long value`() {
    val result = fhirPathEngine.evaluateExpression("%val.ceiling()", null, mapOf("val" to 100L))
    assertEquals(listOf(100L), result.toList())
  }

  @Test
  fun `floor on Long value`() {
    val result = fhirPathEngine.evaluateExpression("%val.floor()", null, mapOf("val" to 100L))
    assertEquals(listOf(100L), result.toList())
  }

  @Test
  fun `truncate on Long value`() {
    val result = fhirPathEngine.evaluateExpression("%val.truncate()", null, mapOf("val" to 100L))
    assertEquals(listOf(100L), result.toList())
  }

  @Test
  fun `ceiling on Quantity value`() {
    val result = fhirPathEngine.evaluateExpression("(1.4 'mg').ceiling()", null)
    assertEquals(listOf(FhirPathQuantity(FhirPathDecimal.fromInt(2), "'mg'")), result.toList())
  }

  @Test
  fun `floor on Quantity value`() {
    val result = fhirPathEngine.evaluateExpression("(1.4 'mg').floor()", null)
    assertEquals(listOf(FhirPathQuantity(FhirPathDecimal.fromInt(1), "'mg'")), result.toList())
  }

  @Test
  fun `truncate on Quantity value`() {
    val result = fhirPathEngine.evaluateExpression("(-1.6 'mg').truncate()", null)
    assertEquals(listOf(FhirPathQuantity(FhirPathDecimal.fromInt(-1), "'mg'")), result.toList())
  }

  @Test
  fun `round on Quantity value`() {
    val result = fhirPathEngine.evaluateExpression("(1.234 'mg').round(2)", null)
    assertEquals(
      listOf(FhirPathQuantity(FhirPathDecimal.fromString("1.23"), "'mg'")),
      result.toList(),
    )
  }
}
