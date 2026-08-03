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

package dev.ohs.fhir.model.r4b.ext

import dev.ohs.fhir.model.r4b.ClinicalImpression
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun ClinicalImpression.getProperty(name: String): Any? =
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
    "status" -> this.status
    "statusReason" -> this.statusReason
    "code" -> this.code
    "description" -> this.description
    "subject" -> this.subject
    "encounter" -> this.encounter
    "effective" -> this.effective
    "date" -> this.date
    "assessor" -> this.assessor
    "previous" -> this.previous
    "problem" -> this.problem
    "investigation" -> this.investigation
    "protocol" -> this.protocol
    "summary" -> this.summary
    "finding" -> this.finding
    "prognosisCodeableConcept" -> this.prognosisCodeableConcept
    "prognosisReference" -> this.prognosisReference
    "supportingInfo" -> this.supportingInfo
    "note" -> this.note
    else -> error("$name is not a valid property name")
  }

internal fun ClinicalImpression.hasProperty(name: String): Boolean =
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
    "status" -> true
    "statusReason" -> true
    "code" -> true
    "description" -> true
    "subject" -> true
    "encounter" -> true
    "effective" -> true
    "date" -> true
    "assessor" -> true
    "previous" -> true
    "problem" -> true
    "investigation" -> true
    "protocol" -> true
    "summary" -> true
    "finding" -> true
    "prognosisCodeableConcept" -> true
    "prognosisReference" -> true
    "supportingInfo" -> true
    "note" -> true
    else -> false
  }

internal fun ClinicalImpression.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.meta?.let { add(it) }
  this@getAllChildren.implicitRules?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.contained)
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.identifier)
  add(this@getAllChildren.status)
  this@getAllChildren.statusReason?.let { add(it) }
  this@getAllChildren.code?.let { add(it) }
  this@getAllChildren.description?.let { add(it) }
  add(this@getAllChildren.subject)
  this@getAllChildren.encounter?.let { add(it) }
  this@getAllChildren.effective?.let { add(it) }
  this@getAllChildren.date?.let { add(it) }
  this@getAllChildren.assessor?.let { add(it) }
  this@getAllChildren.previous?.let { add(it) }
  addAll(this@getAllChildren.problem)
  addAll(this@getAllChildren.investigation)
  addAll(this@getAllChildren.protocol)
  this@getAllChildren.summary?.let { add(it) }
  addAll(this@getAllChildren.finding)
  addAll(this@getAllChildren.prognosisCodeableConcept)
  addAll(this@getAllChildren.prognosisReference)
  addAll(this@getAllChildren.supportingInfo)
  addAll(this@getAllChildren.note)
}

internal fun ClinicalImpression.Investigation.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "code" -> this.code
    "item" -> this.item
    else -> error("$name is not a valid property name")
  }

internal fun ClinicalImpression.Investigation.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "code" -> true
    "item" -> true
    else -> false
  }

internal fun ClinicalImpression.Investigation.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.code)
  addAll(this@getAllChildren.item)
}

internal fun ClinicalImpression.Finding.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "itemCodeableConcept" -> this.itemCodeableConcept
    "itemReference" -> this.itemReference
    "basis" -> this.basis
    else -> error("$name is not a valid property name")
  }

internal fun ClinicalImpression.Finding.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "itemCodeableConcept" -> true
    "itemReference" -> true
    "basis" -> true
    else -> false
  }

internal fun ClinicalImpression.Finding.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.itemCodeableConcept?.let { add(it) }
  this@getAllChildren.itemReference?.let { add(it) }
  this@getAllChildren.basis?.let { add(it) }
}
