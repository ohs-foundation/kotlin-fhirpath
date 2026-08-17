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

package dev.ohs.fhir.fhirpath.functions

import dev.ohs.fhir.fhirpath.model.FhirModelNavigator
import dev.ohs.fhir.fhirpath.types.FhirPathTypeResolver
import dev.ohs.fhir.fhirpath.types.FhirPrimitiveType

/**
 * Returns the extensions with the given url on each item in the input collection.
 *
 * `extension(url)` is a shorthand for `extension.where(url = url)`. It works on any element
 * carrying extensions, including primitives (e.g. `Patient.birthDate.extension(...)`).
 *
 * See [specification](https://hl7.org/fhir/R5/fhirpath.html#functions).
 */
internal fun Collection<Any>.extension(
  params: List<Any>,
  fhirModelNavigator: FhirModelNavigator,
): Collection<Any> {
  val url = params.singleOrNull() as? String ?: return emptyList()
  return flatMap { item ->
      when (val extensions = fhirModelNavigator.accessProperty(item, "extension")) {
        null -> emptyList()
        is List<*> -> extensions.filterNotNull()
        else -> error("Expected `extension` to be a list but was: $extensions")
      }
    }
    .filter { fhirModelNavigator.accessProperty(it, "url") == url }
}

/**
 * Returns whether the input is a single FHIR primitive that has an actual value, as opposed to only
 * carrying an `id` or `extension` (e.g. a `_given` element with an extension but no value). Returns
 * false for an empty input, for non-primitives (including complex types with a `value` property
 * such as `Quantity`), and for FHIRPath literals, which are System values rather than FHIR
 * primitives.
 *
 * See [specification](https://hl7.org/fhir/R5/fhirpath.html#functions).
 */
internal fun Collection<Any>.hasValue(
  fhirPathTypeResolver: FhirPathTypeResolver,
  fhirModelNavigator: FhirModelNavigator,
): Collection<Boolean> {
  // Per the specification, the result is true only when the collection "contains a single value
  // which is a FHIR primitive" with a value; an empty or multi-item collection is simply false.
  val item = singleOrNull() ?: return listOf(false)
  if (fhirPathTypeResolver.resolveFromObject(item) !is FhirPrimitiveType) {
    return listOf(false)
  }
  // Code-bound elements are `Enumeration` objects, which have no generated property dispatch, so
  // their value presence is checked through the resolver's string conversion instead.
  val value =
    fhirModelNavigator.accessProperty(item, "value") ?: fhirPathTypeResolver.convertToString(item)
  return listOf(value != null)
}
