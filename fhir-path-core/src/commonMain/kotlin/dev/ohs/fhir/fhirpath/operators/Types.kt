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

import dev.ohs.fhir.fhirpath.toFhirPathType
import dev.ohs.fhir.fhirpath.types.FhirPathTypeResolver

/** See [specification](https://hl7.org/fhirpath/N1/#istype-type-specifier). */
internal fun Collection<Any>.`is`(
  params: List<Any>,
  fhirPathTypeResolver: FhirPathTypeResolver,
): Collection<Boolean> {
  check(size <= 1) { "is cannot be called on a collection with more than 1 item" }
  val item = singleOrNull() ?: return emptyList()

  val type = fhirPathTypeResolver.resolveFromObject(item)
  val targetType = params.single()
  return listOf(type == targetType)
}

/**
 * See [specification](https://hl7.org/fhirpath/N1/#oftypetype-type-specifier-collection).
 *
 * The type comparison is an exact match, so subtypes are not matched: `ofType(Quantity)` does not
 * return `Duration` items even though `Duration` specializes `Quantity`. The FHIRPath spec calls
 * for matching "the given type or a subclass thereof", which is not supported yet for complex types
 * and resources. For primitives the exact match is the specified behavior: "All primitives are
 * considered to be independent types (so `markdown` is not a subclass of `string`)"
 * (https://hl7.org/fhir/R5/fhirpath.html). The same limitation applies to `is` and `as`.
 */
internal fun Collection<Any>.ofType(
  params: List<Any>,
  fhirPathTypeResolver: FhirPathTypeResolver,
): Collection<Any> {
  val targetType = params.single()
  return filter { fhirPathTypeResolver.resolveFromObject(it) == targetType }
}

/** See [specification](https://hl7.org/fhirpath/N1/#astype-type-specifier). */
internal fun Collection<Any>.`as`(
  params: List<Any>,
  fhirPathTypeResolver: FhirPathTypeResolver,
): Collection<Any> {
  check(size <= 1) { "as cannot be called on a collection with more than 1 item" }
  val item = singleOrNull() ?: return emptyList()

  val type = fhirPathTypeResolver.resolveFromObject(item)
  val targetType = params.single()

  if (type == targetType) {
    return this
  }

  val converted = item.toFhirPathType(fhirPathTypeResolver)
  val convertedType = fhirPathTypeResolver.resolveFromObject(converted)
  if (convertedType == targetType) {
    return listOf(converted)
  }

  return emptyList()
}
