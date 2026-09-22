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

import dev.ohs.fhir.fhirpath.model.FhirR5ModelNavigator
import dev.ohs.fhir.fhirpath.terminology.TerminologyService
import dev.ohs.fhir.fhirpath.terminology.ValueSetTerminologyService
import dev.ohs.fhir.fhirpath.types.FhirR5TypeResolver
import dev.ohs.fhir.model.r5.ValueSet

fun FhirPathEngine.Companion.forR5(strictMode: Boolean = false): FhirPathEngine {
  return FhirPathEngine(
    fhirPathTypeResolver = FhirR5TypeResolver,
    fhirModelNavigator = FhirR5ModelNavigator,
    strictMode = strictMode,
  )
}

/** Creates an engine that evaluates terminology functions such as `memberOf` with the service. */
fun FhirPathEngine.Companion.forR5(
  strictMode: Boolean = false,
  terminologyService: TerminologyService,
): FhirPathEngine {
  return FhirPathEngine(
    fhirPathTypeResolver = FhirR5TypeResolver,
    fhirModelNavigator = FhirR5ModelNavigator,
    strictMode = strictMode,
    terminologyService = terminologyService,
  )
}

/** Returns a [TerminologyService] that answers from the given value sets. */
fun TerminologyService.Companion.forR5(valueSets: Collection<ValueSet>): TerminologyService =
  ValueSetTerminologyService(valueSets, FhirR5ModelNavigator)
