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

package dev.ohs.fhir.fhirpath.operators

import com.ionspin.kotlin.bignum.decimal.BigDecimal
import com.ionspin.kotlin.bignum.decimal.DecimalMode
import com.ionspin.kotlin.bignum.decimal.RoundingMode
import com.ionspin.kotlin.bignum.decimal.toBigDecimal
import dev.ohs.fhir.fhirpath.toFhirPathType
import dev.ohs.fhir.fhirpath.types.FhirPathDate
import dev.ohs.fhir.fhirpath.types.FhirPathDateTime
import dev.ohs.fhir.fhirpath.types.FhirPathQuantity
import dev.ohs.fhir.fhirpath.types.FhirPathTime
import dev.ohs.fhir.fhirpath.types.FhirPathTypeResolver
import dev.ohs.fhir.fhirpath.types.div
import dev.ohs.fhir.fhirpath.types.minus
import dev.ohs.fhir.fhirpath.types.plus
import dev.ohs.fhir.fhirpath.types.times
import kotlin.time.ExperimentalTime

val DECIMAL_MODE =
  DecimalMode(
    decimalPrecision = 15, // TODO: clarify this with the specification
    roundingMode =
      RoundingMode.ROUND_HALF_AWAY_FROM_ZERO, // See https://jira.hl7.org/browse/FHIR-53159
  )

/** See [specification](https://hl7.org/fhirpath/STU3/en/#-multiplication). */
internal fun multiplication(
  left: Collection<Any>,
  right: Collection<Any>,
  fhirPathTypeResolver: FhirPathTypeResolver,
): Collection<Any> {
  val leftItem = left.singleOrNull()?.toFhirPathType(fhirPathTypeResolver) ?: return emptyList()
  val rightItem = right.singleOrNull()?.toFhirPathType(fhirPathTypeResolver) ?: return emptyList()

  return when {
    leftItem is Int && rightItem is Int -> listOf(leftItem * rightItem)
    leftItem is Int && rightItem is Long -> listOf(leftItem * rightItem)
    leftItem is Int && rightItem is BigDecimal -> listOf(rightItem * leftItem)
    leftItem is Int && rightItem is FhirPathQuantity -> listOf(rightItem * leftItem.toBigDecimal())
    leftItem is Long && rightItem is Int -> listOf(leftItem * rightItem)
    leftItem is Long && rightItem is Long -> listOf(leftItem * rightItem)
    leftItem is Long && rightItem is BigDecimal -> listOf(rightItem * leftItem)
    leftItem is Long && rightItem is FhirPathQuantity -> listOf(rightItem * leftItem.toBigDecimal())
    leftItem is BigDecimal && rightItem is Int -> listOf(leftItem * rightItem)
    leftItem is BigDecimal && rightItem is Long -> listOf(leftItem * rightItem)
    leftItem is BigDecimal && rightItem is BigDecimal -> listOf(leftItem * rightItem)
    leftItem is BigDecimal && rightItem is FhirPathQuantity -> listOf(rightItem * leftItem)
    leftItem is FhirPathQuantity && rightItem is Int -> {
      listOf(leftItem * rightItem.toBigDecimal())
    }
    leftItem is FhirPathQuantity && rightItem is Long -> {
      listOf(leftItem * rightItem.toBigDecimal())
    }
    leftItem is FhirPathQuantity && rightItem is BigDecimal -> {
      listOf(leftItem * rightItem)
    }
    leftItem is FhirPathQuantity && rightItem is FhirPathQuantity -> {
      (leftItem * rightItem)?.let { listOf(it) } ?: emptyList()
    }
    else -> error("Cannot multiply $leftItem and $rightItem")
  }
}

/** See [specification](https://hl7.org/fhirpath/STU3/en/#-division). */
internal fun division(
  left: Collection<Any>,
  right: Collection<Any>,
  fhirPathTypeResolver: FhirPathTypeResolver,
): Collection<Any> {
  val leftItem = left.singleOrNull()?.toFhirPathType(fhirPathTypeResolver) ?: return emptyList()
  val rightItem = right.singleOrNull()?.toFhirPathType(fhirPathTypeResolver) ?: return emptyList()

  if (leftItem is FhirPathQuantity && rightItem is FhirPathQuantity) {
    return (leftItem / rightItem)?.let { listOf(it) } ?: emptyList()
  }

  val leftBigDecimal =
    when (leftItem) {
      is Int -> leftItem.toBigDecimal()
      is Long -> leftItem.toBigDecimal()
      is BigDecimal -> leftItem
      else -> error("Operand of division must be a number")
    }
  val rightBigDecimal =
    when (rightItem) {
      is Int -> rightItem.toBigDecimal()
      is Long -> rightItem.toBigDecimal()
      is BigDecimal -> rightItem
      else -> error("Operand of division must be a number")
    }

  if (rightBigDecimal == BigDecimal.ZERO) return emptyList()
  return listOf(leftBigDecimal.divide(rightBigDecimal, DECIMAL_MODE))
}

/** See [specification](https://hl7.org/fhirpath/STU3/en/#-addition). */
@OptIn(ExperimentalTime::class)
internal fun addition(
  left: Collection<Any>,
  right: Collection<Any>,
  fhirPathTypeResolver: FhirPathTypeResolver,
): Collection<Any> {
  val leftItem = left.singleOrNull()?.toFhirPathType(fhirPathTypeResolver) ?: return emptyList()
  val rightItem = right.singleOrNull()?.toFhirPathType(fhirPathTypeResolver) ?: return emptyList()

  return when {
    leftItem is Int && rightItem is Int -> listOf(leftItem + rightItem)
    leftItem is Int && rightItem is Long -> listOf(leftItem + rightItem)
    leftItem is Int && rightItem is BigDecimal -> listOf(rightItem + leftItem)
    leftItem is Long && rightItem is Int -> listOf(leftItem + rightItem)
    leftItem is Long && rightItem is Long -> listOf(leftItem + rightItem)
    leftItem is Long && rightItem is BigDecimal -> listOf(rightItem + leftItem)
    leftItem is BigDecimal && rightItem is Int -> listOf(leftItem + rightItem)
    leftItem is BigDecimal && rightItem is Long -> listOf(leftItem + rightItem)
    leftItem is BigDecimal && rightItem is BigDecimal -> listOf(leftItem + rightItem)
    leftItem is String && rightItem is String -> listOf(leftItem + rightItem)
    leftItem is FhirPathQuantity && rightItem is FhirPathQuantity ->
      (leftItem + rightItem)?.let { listOf(it) } ?: emptyList()
    leftItem is FhirPathDate && rightItem is FhirPathQuantity -> listOf(leftItem + rightItem)
    leftItem is FhirPathDateTime && rightItem is FhirPathQuantity -> listOf(leftItem + rightItem)
    leftItem is FhirPathTime && rightItem is FhirPathQuantity -> listOf(leftItem + rightItem)
    else -> error("Cannot add $leftItem and $rightItem")
  }
}

/** See [specification](https://hl7.org/fhirpath/STU3/en/#--subtraction). */
internal fun subtraction(
  left: Collection<Any>,
  right: Collection<Any>,
  fhirPathTypeResolver: FhirPathTypeResolver,
): Collection<Any> {
  val leftItem = left.singleOrNull()?.toFhirPathType(fhirPathTypeResolver) ?: return emptyList()
  val rightItem = right.singleOrNull()?.toFhirPathType(fhirPathTypeResolver) ?: return emptyList()
  return when {
    leftItem is Int && rightItem is Int -> listOf(leftItem - rightItem)
    leftItem is Int && rightItem is Long -> listOf(leftItem - rightItem)
    leftItem is Int && rightItem is BigDecimal -> listOf(-rightItem + leftItem)
    leftItem is Long && rightItem is Int -> listOf(leftItem - rightItem)
    leftItem is Long && rightItem is Long -> listOf(leftItem - rightItem)
    leftItem is Long && rightItem is BigDecimal -> listOf(-rightItem + leftItem)
    leftItem is BigDecimal && rightItem is Int -> listOf(leftItem - rightItem)
    leftItem is BigDecimal && rightItem is Long -> listOf(leftItem - rightItem)
    leftItem is BigDecimal && rightItem is BigDecimal -> listOf(leftItem - rightItem)
    leftItem is FhirPathQuantity && rightItem is FhirPathQuantity ->
      (leftItem - rightItem)?.let { listOf(it) } ?: emptyList()
    leftItem is FhirPathDate && rightItem is FhirPathQuantity -> listOf(leftItem - rightItem)
    leftItem is FhirPathDateTime && rightItem is FhirPathQuantity -> listOf(leftItem - rightItem)
    leftItem is FhirPathTime && rightItem is FhirPathQuantity -> listOf(leftItem - rightItem)
    else -> error("Cannot subtract $rightItem from $leftItem")
  }
}

/** See [specification](https://hl7.org/fhirpath/STU3/en/#div). */
internal fun div(left: Collection<Any>, right: Collection<Any>): Collection<Any> {
  val leftBigDecimal =
    when (val leftItem = left.singleOrNull() ?: return emptyList()) {
      is Int -> leftItem.toBigDecimal()
      is Long -> leftItem.toBigDecimal()
      is BigDecimal -> leftItem
      else -> error("Operand of div must be a number")
    }
  val rightBigDecimal =
    when (val rightItem = right.singleOrNull() ?: return emptyList()) {
      is Int -> rightItem.toBigDecimal()
      is Long -> rightItem.toBigDecimal()
      is BigDecimal -> rightItem
      else -> error("Operand of div must be a number")
    }
  if (rightBigDecimal == BigDecimal.ZERO) return emptyList()

  val (quotient, _) = leftBigDecimal divrem rightBigDecimal
  return listOf(quotient.intValue())
}

/** See [specification](https://hl7.org/fhirpath/STU3/en/#mod). */
internal fun mod(left: Collection<Any>, right: Collection<Any>): Collection<Any> {
  val leftItem = left.singleOrNull() ?: return emptyList()
  val leftBigDecimal =
    when (leftItem) {
      is Int -> leftItem.toBigDecimal()
      is Long -> leftItem.toBigDecimal()
      is BigDecimal -> leftItem
      else -> error("Operand of mod must be a number")
    }
  val rightItem = right.singleOrNull() ?: return emptyList()
  val rightBigDecimal =
    when (rightItem) {
      is Int -> rightItem.toBigDecimal()
      is Long -> rightItem.toBigDecimal()
      is BigDecimal -> rightItem
      else -> error("Operand of mod must be a number")
    }
  if (rightBigDecimal.isZero()) return emptyList()

  val (_, remainder) = leftBigDecimal divrem rightBigDecimal
  if (leftItem is Int && rightItem is Int) return listOf(remainder.intValue())
  if (
    (leftItem is Long && rightItem is Long) ||
      (leftItem is Int && rightItem is Long) ||
      (leftItem is Long && rightItem is Int)
  ) {
    // N.B. the specification does not specify what to do if the result is out of range for Integer.
    return listOf(remainder.longValue())
  }
  return listOf(remainder)
}

/** See [specification](https://hl7.org/fhirpath/STU3/en/#-string-concatenation). */
internal fun concat(left: Collection<Any>, right: Collection<Any>): Collection<Any> {
  check(left.size <= 1) { "& cannot be called on a collection with more than 1 item" }
  check(right.size <= 1) { "& cannot be called on a collection with more than 1 item" }

  val leftString = (left.singleOrNull() as String?) ?: ""
  val rightString: String = (right.singleOrNull() as String?) ?: ""
  return listOf(leftString + rightString)
}
