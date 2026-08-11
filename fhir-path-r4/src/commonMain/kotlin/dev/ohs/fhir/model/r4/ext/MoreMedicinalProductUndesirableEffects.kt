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

package dev.ohs.fhir.model.r4.ext

import dev.ohs.fhir.model.r4.MedicinalProductUndesirableEffect
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun MedicinalProductUndesirableEffect.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "meta" -> this.meta
    "implicitRules" -> this.implicitRules
    "language" -> this.language
    "text" -> this.text
    "contained" -> this.contained
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "subject" -> this.subject
    "symptomConditionEffect" -> this.symptomConditionEffect
    "classification" -> this.classification
    "frequencyOfOccurrence" -> this.frequencyOfOccurrence
    "population" -> this.population
    else -> error("$name is not a valid property name")
  }

internal fun MedicinalProductUndesirableEffect.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "meta" -> true
    "implicitRules" -> true
    "language" -> true
    "text" -> true
    "contained" -> true
    "extension" -> true
    "modifierExtension" -> true
    "subject" -> true
    "symptomConditionEffect" -> true
    "classification" -> true
    "frequencyOfOccurrence" -> true
    "population" -> true
    else -> false
  }

internal fun MedicinalProductUndesirableEffect.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.meta?.let { add(it) }
  this@getAllChildren.implicitRules?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.contained)
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.subject)
  this@getAllChildren.symptomConditionEffect?.let { add(it) }
  this@getAllChildren.classification?.let { add(it) }
  this@getAllChildren.frequencyOfOccurrence?.let { add(it) }
  addAll(this@getAllChildren.population)
}
