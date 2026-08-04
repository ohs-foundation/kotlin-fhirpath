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

package dev.ohs.fhir.model.r5.ext

import dev.ohs.fhir.model.r5.MedicationStatement
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun MedicationStatement.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "meta" -> this.meta
    "implicitRules" -> this.implicitRules
    "language" -> this.language
    "text" -> this.text
    "contained" -> this.contained
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "identifier" -> this.identifier
    "partOf" -> this.partOf
    "status" -> this.status
    "category" -> this.category
    "medication" -> this.medication
    "subject" -> this.subject
    "encounter" -> this.encounter
    "effective" -> this.effective
    "dateAsserted" -> this.dateAsserted
    "informationSource" -> this.informationSource
    "derivedFrom" -> this.derivedFrom
    "reason" -> this.reason
    "note" -> this.note
    "relatedClinicalInformation" -> this.relatedClinicalInformation
    "renderedDosageInstruction" -> this.renderedDosageInstruction
    "dosage" -> this.dosage
    "adherence" -> this.adherence
    else -> error("$name is not a valid property name")
  }

internal fun MedicationStatement.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "meta" -> true
    "implicitRules" -> true
    "language" -> true
    "text" -> true
    "contained" -> true
    "extension" -> true
    "modifierExtension" -> true
    "identifier" -> true
    "partOf" -> true
    "status" -> true
    "category" -> true
    "medication" -> true
    "subject" -> true
    "encounter" -> true
    "effective" -> true
    "dateAsserted" -> true
    "informationSource" -> true
    "derivedFrom" -> true
    "reason" -> true
    "note" -> true
    "relatedClinicalInformation" -> true
    "renderedDosageInstruction" -> true
    "dosage" -> true
    "adherence" -> true
    else -> false
  }

internal fun MedicationStatement.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.meta?.let { add(it) }
  this@getAllChildren.implicitRules?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.contained)
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.identifier)
  addAll(this@getAllChildren.partOf)
  add(this@getAllChildren.status)
  addAll(this@getAllChildren.category)
  add(this@getAllChildren.medication)
  add(this@getAllChildren.subject)
  this@getAllChildren.encounter?.let { add(it) }
  this@getAllChildren.effective?.let { add(it) }
  this@getAllChildren.dateAsserted?.let { add(it) }
  addAll(this@getAllChildren.informationSource)
  addAll(this@getAllChildren.derivedFrom)
  addAll(this@getAllChildren.reason)
  addAll(this@getAllChildren.note)
  addAll(this@getAllChildren.relatedClinicalInformation)
  this@getAllChildren.renderedDosageInstruction?.let { add(it) }
  addAll(this@getAllChildren.dosage)
  this@getAllChildren.adherence?.let { add(it) }
}

internal fun MedicationStatement.Adherence.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "code" -> this.code
    "reason" -> this.reason
    else -> error("$name is not a valid property name")
  }

internal fun MedicationStatement.Adherence.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "code" -> true
    "reason" -> true
    else -> false
  }

internal fun MedicationStatement.Adherence.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.code)
  this@getAllChildren.reason?.let { add(it) }
}
