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
