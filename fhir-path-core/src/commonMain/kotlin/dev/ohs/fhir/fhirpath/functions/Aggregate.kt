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

package dev.ohs.fhir.fhirpath.functions

import com.ionspin.kotlin.bignum.decimal.BigDecimal
import com.ionspin.kotlin.bignum.decimal.toBigDecimal
import dev.ohs.fhir.fhirpath.operators.DECIMAL_MODE
import dev.ohs.fhir.fhirpath.operators.compare
import dev.ohs.fhir.fhirpath.toFhirPathType
import dev.ohs.fhir.fhirpath.types.FhirPathDate
import dev.ohs.fhir.fhirpath.types.FhirPathDateTime
import dev.ohs.fhir.fhirpath.types.FhirPathQuantity
import dev.ohs.fhir.fhirpath.types.FhirPathTime
import dev.ohs.fhir.fhirpath.types.FhirPathTypeResolver
import dev.ohs.fhir.fhirpath.types.plus

/** See [specification](https://hl7.org/fhirpath/STU3/en/#sum--integer--long--decimal--quantity). */
internal fun Collection<Any>.sumFun(fhirPathTypeResolver: FhirPathTypeResolver): Collection<Any> {
  if (isEmpty()) return emptyList()
  val converted = map { it.toFhirPathType(fhirPathTypeResolver) }
  converted.forEach {
    when (it) {
      is Int,
      is Long,
      is BigDecimal,
      is FhirPathQuantity -> {}
      else -> error("sum() cannot be applied to type ${it::class.simpleName}: $it")
    }
  }
  return listOf(converted.reduce(::add))
}

/**
 * See
 * [specification](https://hl7.org/fhirpath/STU3/en/#min--integer--long--decimal--quantity--date--datetime--time--string).
 */
internal fun Collection<Any>.minFun(fhirPathTypeResolver: FhirPathTypeResolver): Collection<Any> =
  findMinOrMax(fhirPathTypeResolver, "min", isMin = true)

/**
 * See
 * [specification](https://hl7.org/fhirpath/STU3/en/#max--integer--long--decimal--quantity--date--datetime--time--string).
 */
internal fun Collection<Any>.maxFun(fhirPathTypeResolver: FhirPathTypeResolver): Collection<Any> =
  findMinOrMax(fhirPathTypeResolver, "max", isMin = false)

/** See [specification](https://hl7.org/fhirpath/STU3/en/#avg--decimal--quantity). */
internal fun Collection<Any>.avgFun(fhirPathTypeResolver: FhirPathTypeResolver): Collection<Any> {
  if (isEmpty()) return emptyList()
  val sumVal = sumFun(fhirPathTypeResolver).single()
  val countBigDecimal = size.toBigDecimal()
  val result =
    when (sumVal) {
      is Int -> sumVal.toBigDecimal().divide(countBigDecimal, DECIMAL_MODE)
      is Long -> sumVal.toBigDecimal().divide(countBigDecimal, DECIMAL_MODE)
      is BigDecimal -> sumVal.divide(countBigDecimal, DECIMAL_MODE)
      is FhirPathQuantity -> {
        val valBd = sumVal.value ?: error("Quantity value cannot be null")
        FhirPathQuantity(value = valBd.divide(countBigDecimal, DECIMAL_MODE), unit = sumVal.unit)
      }
      else -> error("Unexpected sum type in avg(): $sumVal")
    }
  return listOf(result)
}

private fun add(left: Any, right: Any): Any {
  return when {
    left is Int && right is Int -> left + right
    left is Int && right is Long -> left + right
    left is Int && right is BigDecimal -> right + left
    left is Long && right is Int -> left + right
    left is Long && right is Long -> left + right
    left is Long && right is BigDecimal -> right + left
    left is BigDecimal && right is Int -> left + right
    left is BigDecimal && right is Long -> left + right
    left is BigDecimal && right is BigDecimal -> left + right
    left is FhirPathQuantity && right is FhirPathQuantity ->
      (left + right) ?: error("Cannot sum quantities with incommensurable units: $left and $right")
    else ->
      error("Cannot sum values of type ${left::class.simpleName} and ${right::class.simpleName}")
  }
}

private fun Collection<Any>.findMinOrMax(
  fhirPathTypeResolver: FhirPathTypeResolver,
  name: String,
  isMin: Boolean,
): Collection<Any> {
  if (isEmpty()) return emptyList()
  val converted = map { item ->
    val fhirType = item.toFhirPathType(fhirPathTypeResolver)
    when (fhirType) {
      is Int,
      is Long,
      is BigDecimal,
      is FhirPathQuantity,
      is FhirPathDate,
      is FhirPathDateTime,
      is FhirPathTime,
      is String -> fhirType
      else -> error("$name() cannot be applied to type ${fhirType::class.simpleName}: $fhirType")
    }
  }
  val comparator =
    Comparator<Any> { a, b ->
      compare(a, b, fhirPathTypeResolver)
        ?: error("Items in collection are not comparable in $name(): $a and $b")
    }
  val result =
    if (isMin) {
      converted.minWithOrNull(comparator)
    } else {
      converted.maxWithOrNull(comparator)
    }
  return listOfNotNull(result)
}
