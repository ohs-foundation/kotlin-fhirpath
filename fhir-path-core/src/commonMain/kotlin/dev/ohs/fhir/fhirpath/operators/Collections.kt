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

import dev.ohs.fhir.fhirpath.types.FhirPathTypeResolver

/** See [specification](https://hl7.org/fhirpath/STU3/en/#in-membership--boolean). */
internal fun `in`(
  left: Collection<Any>,
  right: Collection<Any>,
  fhirPathTypeResolver: FhirPathTypeResolver,
): Collection<Boolean> {
  check(left.size <= 1) { "in cannot be called on a left operand with more than 1 item" }
  val leftItem = left.singleOrNull() ?: return emptyList()
  return listOf(right.any { itemsEqual(leftItem, it, fhirPathTypeResolver) == true })
}

/** See [specification](https://hl7.org/fhirpath/STU3/en/#contains-containership--boolean). */
internal fun contains(
  left: Collection<Any>,
  right: Collection<Any>,
  fhirPathTypeResolver: FhirPathTypeResolver,
): Collection<Boolean> {
  check(right.size <= 1) { "contains cannot be called on a right operand with more than 1 item" }
  return `in`(right, left, fhirPathTypeResolver)
}
