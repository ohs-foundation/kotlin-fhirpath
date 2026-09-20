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

package dev.ohs.fhir.fhirpath.terminology

/** Whether a code is in a value set. */
enum class ValueSetMembership {
  IN,
  OUT,

  /** The value set could not be found or evaluated. */
  UNKNOWN,
}

/**
 * Answers terminology questions for the evaluator.
 *
 * See [specification](https://hl7.org/fhir/R5/fhirpath.html#txapi).
 */
fun interface TerminologyService {
  /**
   * Returns whether the code is in the value set.
   *
   * @param valueSet The canonical URL of the value set, optionally with a `|version` suffix.
   * @param system The code system, or null if only a code is known.
   */
  fun memberOf(valueSet: String, system: String?, code: String): ValueSetMembership

  companion object
}
