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

import com.ionspin.kotlin.bignum.decimal.BigDecimal
import dev.ohs.fhir.fhirpath.types.FhirPathQuantity
import dev.ohs.fhir.model.r4.Code
import dev.ohs.fhir.model.r4.CodeableConcept
import dev.ohs.fhir.model.r4.Decimal
import dev.ohs.fhir.model.r4.Enumeration
import dev.ohs.fhir.model.r4.FhirDecimal
import dev.ohs.fhir.model.r4.Observation
import dev.ohs.fhir.model.r4.Quantity
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertIs

private val fhirPathEngine = FhirPathEngine.forR4()

/**
 * Regression tests for reading `decimal` values from resources built with kotlin-fhir 1.0.0-rc01+,
 * where `Decimal.value` is a [FhirDecimal] wrapper rather than a plain BigDecimal. Reading such a
 * value used to crash with `NoSuchMethodError`.
 */
class DecimalConversionTest {

  private val observation =
    Observation(
      status = Enumeration(value = Observation.ObservationStatus.Final),
      code = CodeableConcept(),
      value =
        Observation.Value.Quantity(
          Quantity(
            value = Decimal(value = FhirDecimal.fromString("0.9")),
            code = Code(value = "kg"),
          )
        ),
    )

  @Test
  fun `quantity with a fhir decimal value evaluates`() {
    val result = fhirPathEngine.evaluateExpression("Observation.value", observation).single()
    val quantity = assertIs<FhirPathQuantity>(result)
    assertEquals(0, quantity.value!!.compareTo(BigDecimal.parseString("0.9")))
    assertEquals("kg", quantity.unit)
  }

  @Test
  fun `decimal element evaluates to a fhirpath decimal`() {
    val result = fhirPathEngine.evaluateExpression("Observation.value.value", observation).single()
    val decimal = assertIs<BigDecimal>(result)
    assertEquals(0, decimal.compareTo(BigDecimal.parseString("0.9")))
  }
}
