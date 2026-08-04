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
import dev.ohs.fhir.fhirpath.toFhirPathType
import dev.ohs.fhir.fhirpath.types.FhirPathTypeResolver
import dev.ohs.fhir.fhirpath.types.FhirType

/**
 * Returns the extensions with the given url on each item in the input collection.
 *
 * `extension(url)` is a shorthand for `extension.where(url = url)`. It works on any element
 * carrying extensions, including primitives (e.g. `Patient.birthDate.extension(...)`).
 *
 * See [specification](https://hl7.org/fhir/fhirpath.html#functions).
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

private const val BASE_STRUCTURE_DEFINITION_PREFIX = "http://hl7.org/fhir/StructureDefinition/"

/**
 * Returns whether the single input element conforms to the profile specified by the structure
 * argument.
 *
 * Only the base FHIR profiles (`http://hl7.org/fhir/StructureDefinition/<Type>`) are supported: the
 * input's type is compared to `<Type>`. An error is thrown if the structure cannot be resolved, as
 * the specification requires. Other profiles, such as those defined in implementation guides, would
 * need profile validation, which is not implemented.
 *
 * See [specification](https://hl7.org/fhir/R4/fhirpath.html#functions).
 */
internal fun Collection<Any>.conformsTo(
  params: List<Any>,
  fhirPathTypeResolver: FhirPathTypeResolver,
): Collection<Boolean> {
  check(size <= 1) { "conformsTo() cannot be called on a collection with more than 1 item" }
  val item = singleOrNull() ?: return emptyList()
  // The structure argument can be a FHIR string (e.g. from a resource element), so it is
  // converted before use like any other string parameter.
  val structure =
    params.singleOrNull()?.toFhirPathType(fhirPathTypeResolver) as? String
      ?: error("conformsTo() requires a structure argument")

  if (!structure.startsWith(BASE_STRUCTURE_DEFINITION_PREFIX)) {
    error("Cannot resolve structure definition: $structure")
  }
  // resolveFromString throws for an unknown type name, satisfying the specification's
  // requirement to error when the structure cannot be resolved. It falls back to System types
  // for names that are not FHIR types (e.g. `String` rather than `string`), which are not valid
  // structure definitions either, so those must error as well.
  val targetType =
    fhirPathTypeResolver.resolveFromString(structure.removePrefix(BASE_STRUCTURE_DEFINITION_PREFIX))
  if (targetType !is FhirType) {
    error("Cannot resolve structure definition: $structure")
  }
  return listOf(fhirPathTypeResolver.resolveFromObject(item) == targetType)
}
