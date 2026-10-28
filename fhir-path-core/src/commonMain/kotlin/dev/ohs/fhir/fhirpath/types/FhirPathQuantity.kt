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

package dev.ohs.fhir.fhirpath.types

import dev.ohs.fhir.fhirpath.div
import dev.ohs.fhir.fhirpath.formatUcumUnit
import dev.ohs.fhir.fhirpath.operators.DECIMAL_MODE
import dev.ohs.fhir.fhirpath.parseUcumUnit
import dev.ohs.fhir.fhirpath.times
import dev.ohs.fhir.fhirpath.toEqualCanonicalized

data class FhirPathQuantity(val value: FhirPathDecimal? = null, val unit: String? = null)

/** Returns a new [FhirPathQuantity] that is the absolute value of this quantity. */
internal fun FhirPathQuantity.abs(): FhirPathQuantity =
  FhirPathQuantity(value = value!!.abs(), unit = unit)

/** Returns a new [FhirPathQuantity] with its value rounded up to the nearest integer. */
internal fun FhirPathQuantity.ceil(): FhirPathQuantity =
  FhirPathQuantity(value = value!!.ceil(), unit = unit)

/** Returns a new [FhirPathQuantity] with its value rounded down to the nearest integer. */
internal fun FhirPathQuantity.floor(): FhirPathQuantity =
  FhirPathQuantity(value = value!!.floor(), unit = unit)

/** Returns a new [FhirPathQuantity] with its value rounded to [precision] decimal places. */
internal fun FhirPathQuantity.round(precision: Long): FhirPathQuantity =
  FhirPathQuantity(value = value!!.round(precision, DECIMAL_MODE.roundingMode), unit = unit)

/** Returns a new [FhirPathQuantity] with the fractional part of its value truncated. */
internal fun FhirPathQuantity.truncate(): FhirPathQuantity =
  FhirPathQuantity(value = value!!.truncate(), unit = unit)

operator fun FhirPathQuantity.plus(other: FhirPathQuantity): FhirPathQuantity? =
  addOrSubtract(other, FhirPathDecimal::plus)

operator fun FhirPathQuantity.minus(other: FhirPathQuantity): FhirPathQuantity? =
  addOrSubtract(other, FhirPathDecimal::minus)

/** Multiplies a quantity by a numeric multiplier. */
operator fun FhirPathQuantity.times(multiplier: FhirPathDecimal): FhirPathQuantity {
  return FhirPathQuantity(value = this.value!! * multiplier, unit = this.unit)
}

/** Multiplies two quantities, combining their UCUM units. */
operator fun FhirPathQuantity.times(other: FhirPathQuantity): FhirPathQuantity? =
  multiplyOrDivide(other, { left, right -> left * right }, { left, right -> left * right })

/** Divides two quantities, combining their UCUM units. Returns `null` if the divisor is zero. */
operator fun FhirPathQuantity.div(other: FhirPathQuantity): FhirPathQuantity? {
  if (other.value?.isZero() == true) return null
  return multiplyOrDivide(other, { left, right -> left / right }, { left, right -> left / right })
}

private fun FhirPathQuantity.addOrSubtract(
  other: FhirPathQuantity,
  valueOp: (FhirPathDecimal, FhirPathDecimal) -> FhirPathDecimal,
): FhirPathQuantity? {
  val leftValue = this.value ?: return null
  val rightValue = other.value ?: return null
  if (this.unit == other.unit) {
    return FhirPathQuantity(value = valueOp(leftValue, rightValue), unit = this.unit)
  }
  val leftCanonical = this.toEqualCanonicalized()
  val rightCanonical = other.toEqualCanonicalized()

  val leftCanonicalUnit = leftCanonical.unit ?: return null
  val rightCanonicalUnit = rightCanonical.unit ?: return null
  if (leftCanonicalUnit != rightCanonicalUnit) return null

  val unitScaleFactor =
    FhirPathQuantity(value = FhirPathDecimal.ONE, unit = this.unit).toEqualCanonicalized().value!!
  if (unitScaleFactor.isZero()) return null

  val resultValue = valueOp(leftCanonical.value!!, rightCanonical.value!!) / unitScaleFactor
  return FhirPathQuantity(value = resultValue, unit = this.unit)
}

private fun FhirPathQuantity.multiplyOrDivide(
  other: FhirPathQuantity,
  valueOp: (FhirPathDecimal, FhirPathDecimal) -> FhirPathDecimal,
  unitOp: (Map<String, Int>, Map<String, Int>) -> Map<String, Int>,
): FhirPathQuantity? {
  this.value ?: return null
  other.value ?: return null

  val leftCanonical = this.toEqualCanonicalized()
  val rightCanonical = other.toEqualCanonicalized()

  val resultValue = valueOp(leftCanonical.value!!, rightCanonical.value!!)
  val combinedUnits =
    unitOp(parseUcumUnit(leftCanonical.unit ?: ""), parseUcumUnit(rightCanonical.unit ?: ""))

  return FhirPathQuantity(value = resultValue, unit = formatUcumUnit(combinedUnits))
}
