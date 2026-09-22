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
import dev.ohs.fhir.fhirpath.terminology.TerminologyService
import dev.ohs.fhir.fhirpath.terminology.ValueSetMembership
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
 * an empty list if the input collection is not a single FHIR primitive.
 *
 * See [specification](https://hl7.org/fhir/R5/fhirpath.html#functions).
 */
internal fun Collection<Any>.hasValue(
  fhirPathTypeResolver: FhirPathTypeResolver,
  fhirModelNavigator: FhirModelNavigator,
): Collection<Boolean> {
  // Return an empty collection if the input collection is not a single FHIR primitive
  val item = singleOrNull() ?: return emptyList()
  if (fhirPathTypeResolver.resolveFromObject(item) !is FhirPrimitiveType) {
    return emptyList()
  }
  return listOf(fhirModelNavigator.accessProperty(item, "value") != null)
}

/**
 * Returns whether the input is in the given value set. The input is a single `code`, `string`,
 * `uri`, `Coding` or `CodeableConcept`. Returns an empty list for any other input, if there is no
 * [terminologyService], or if the value set cannot be found or evaluated.
 *
 * See [specification](https://hl7.org/fhir/R5/fhirpath.html#functions).
 */
internal fun Collection<Any>.memberOf(
  params: List<Any>,
  fhirPathTypeResolver: FhirPathTypeResolver,
  fhirModelNavigator: FhirModelNavigator,
  terminologyService: TerminologyService?,
): Collection<Boolean> {
  val item = singleOrNull() ?: return emptyList()
  val valueSet = params.singleOrNull() as? String ?: return emptyList()
  if (terminologyService == null) return emptyList()

  fun codingMembership(coding: Any): ValueSetMembership {
    // A Coding without a system or a code is not in any value set.
    val system =
      fhirModelNavigator.primitiveValue(coding, "system") ?: return ValueSetMembership.OUT
    val code = fhirModelNavigator.primitiveValue(coding, "code") ?: return ValueSetMembership.OUT
    return terminologyService.memberOf(valueSet, system, code)
  }

  val membership =
    when (fhirPathTypeResolver.resolveFromObject(item)?.typeName) {
      "code",
      "string",
      "uri" ->
        (fhirModelNavigator.accessProperty(item, "value") as? String)?.let {
          terminologyService.memberOf(valueSet, system = null, code = it)
        }
      "String" -> terminologyService.memberOf(valueSet, system = null, code = item as String)
      "Coding" -> codingMembership(item)
      "CodeableConcept" -> {
        val memberships =
          (fhirModelNavigator.accessProperty(item, "coding") as? List<*>)
            .orEmpty()
            .filterNotNull()
            .map(::codingMembership)
        when {
          ValueSetMembership.IN in memberships -> ValueSetMembership.IN
          ValueSetMembership.UNKNOWN in memberships -> ValueSetMembership.UNKNOWN
          else -> ValueSetMembership.OUT
        }
      }
      else -> null
    }
  return when (membership) {
    ValueSetMembership.IN -> listOf(true)
    ValueSetMembership.OUT -> listOf(false)
    ValueSetMembership.UNKNOWN,
    null -> emptyList()
  }
}

/** Returns the string value of a primitive property, or null if the property or value is absent. */
internal fun FhirModelNavigator.primitiveValue(obj: Any, propertyName: String): String? =
  when (val property = accessProperty(obj, propertyName)) {
    null -> null
    is String -> property
    else -> accessProperty(property, "value") as? String
  }
