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

import dev.ohs.fhir.fhirpath.model.FhirR4BModelNavigator
import dev.ohs.fhir.fhirpath.terminology.TerminologyService
import dev.ohs.fhir.fhirpath.terminology.ValueSetTerminologyService
import dev.ohs.fhir.fhirpath.types.FhirR4BTypeResolver
import dev.ohs.fhir.model.r4b.ValueSet

fun FhirPathEngine.Companion.forR4B(strictMode: Boolean = false): FhirPathEngine {
  return FhirPathEngine(
    fhirPathTypeResolver = FhirR4BTypeResolver,
    fhirModelNavigator = FhirR4BModelNavigator,
    strictMode = strictMode,
  )
}

/** Creates an engine that evaluates terminology functions such as `memberOf` with the service. */
fun FhirPathEngine.Companion.forR4B(
  strictMode: Boolean = false,
  terminologyService: TerminologyService,
): FhirPathEngine {
  return FhirPathEngine(
    fhirPathTypeResolver = FhirR4BTypeResolver,
    fhirModelNavigator = FhirR4BModelNavigator,
    strictMode = strictMode,
    terminologyService = terminologyService,
  )
}

/** Returns a [TerminologyService] that answers from the given value sets. */
fun TerminologyService.Companion.forR4B(valueSets: Collection<ValueSet>): TerminologyService =
  ValueSetTerminologyService(valueSets, FhirR4BModelNavigator)
