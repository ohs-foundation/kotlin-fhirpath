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

import dev.ohs.fhir.model.r4.Dosage
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun Dosage.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "sequence" -> this.sequence
    "text" -> this.text
    "additionalInstruction" -> this.additionalInstruction
    "patientInstruction" -> this.patientInstruction
    "timing" -> this.timing
    "asNeeded" -> this.asNeeded
    "site" -> this.site
    "route" -> this.route
    "method" -> this.method
    "doseAndRate" -> this.doseAndRate
    "maxDosePerPeriod" -> this.maxDosePerPeriod
    "maxDosePerAdministration" -> this.maxDosePerAdministration
    "maxDosePerLifetime" -> this.maxDosePerLifetime
    else -> error("$name is not a valid property name")
  }

internal fun Dosage.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "sequence" -> true
    "text" -> true
    "additionalInstruction" -> true
    "patientInstruction" -> true
    "timing" -> true
    "asNeeded" -> true
    "site" -> true
    "route" -> true
    "method" -> true
    "doseAndRate" -> true
    "maxDosePerPeriod" -> true
    "maxDosePerAdministration" -> true
    "maxDosePerLifetime" -> true
    else -> false
  }

internal fun Dosage.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.sequence?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.additionalInstruction)
  this@getAllChildren.patientInstruction?.let { add(it) }
  this@getAllChildren.timing?.let { add(it) }
  this@getAllChildren.asNeeded?.let { add(it) }
  this@getAllChildren.site?.let { add(it) }
  this@getAllChildren.route?.let { add(it) }
  this@getAllChildren.method?.let { add(it) }
  addAll(this@getAllChildren.doseAndRate)
  this@getAllChildren.maxDosePerPeriod?.let { add(it) }
  this@getAllChildren.maxDosePerAdministration?.let { add(it) }
  this@getAllChildren.maxDosePerLifetime?.let { add(it) }
}

internal fun Dosage.DoseAndRate.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "type" -> this.type
    "dose" -> this.dose
    "rate" -> this.rate
    else -> error("$name is not a valid property name")
  }

internal fun Dosage.DoseAndRate.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "type" -> true
    "dose" -> true
    "rate" -> true
    else -> false
  }

internal fun Dosage.DoseAndRate.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  this@getAllChildren.type?.let { add(it) }
  this@getAllChildren.dose?.let { add(it) }
  this@getAllChildren.rate?.let { add(it) }
}
