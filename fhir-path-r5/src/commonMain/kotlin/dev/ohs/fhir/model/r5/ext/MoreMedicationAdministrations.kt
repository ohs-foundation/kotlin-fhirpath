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

import dev.ohs.fhir.model.r5.MedicationAdministration
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun MedicationAdministration.getProperty(name: String): Any? =
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
    "basedOn" -> this.basedOn
    "partOf" -> this.partOf
    "status" -> this.status
    "statusReason" -> this.statusReason
    "category" -> this.category
    "medication" -> this.medication
    "subject" -> this.subject
    "encounter" -> this.encounter
    "supportingInformation" -> this.supportingInformation
    "occurence" -> this.occurence
    "recorded" -> this.recorded
    "isSubPotent" -> this.isSubPotent
    "subPotentReason" -> this.subPotentReason
    "performer" -> this.performer
    "reason" -> this.reason
    "request" -> this.request
    "device" -> this.device
    "note" -> this.note
    "dosage" -> this.dosage
    "eventHistory" -> this.eventHistory
    else -> error("$name is not a valid property name")
  }

internal fun MedicationAdministration.hasProperty(name: String): Boolean =
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
    "basedOn" -> true
    "partOf" -> true
    "status" -> true
    "statusReason" -> true
    "category" -> true
    "medication" -> true
    "subject" -> true
    "encounter" -> true
    "supportingInformation" -> true
    "occurence" -> true
    "recorded" -> true
    "isSubPotent" -> true
    "subPotentReason" -> true
    "performer" -> true
    "reason" -> true
    "request" -> true
    "device" -> true
    "note" -> true
    "dosage" -> true
    "eventHistory" -> true
    else -> false
  }

internal fun MedicationAdministration.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.meta?.let { add(it) }
  this@getAllChildren.implicitRules?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.contained)
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.identifier)
  addAll(this@getAllChildren.basedOn)
  addAll(this@getAllChildren.partOf)
  add(this@getAllChildren.status)
  addAll(this@getAllChildren.statusReason)
  addAll(this@getAllChildren.category)
  add(this@getAllChildren.medication)
  add(this@getAllChildren.subject)
  this@getAllChildren.encounter?.let { add(it) }
  addAll(this@getAllChildren.supportingInformation)
  add(this@getAllChildren.occurence)
  this@getAllChildren.recorded?.let { add(it) }
  this@getAllChildren.isSubPotent?.let { add(it) }
  addAll(this@getAllChildren.subPotentReason)
  addAll(this@getAllChildren.performer)
  addAll(this@getAllChildren.reason)
  this@getAllChildren.request?.let { add(it) }
  addAll(this@getAllChildren.device)
  addAll(this@getAllChildren.note)
  this@getAllChildren.dosage?.let { add(it) }
  addAll(this@getAllChildren.eventHistory)
}

internal fun MedicationAdministration.Performer.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "function" -> this.function
    "actor" -> this.actor
    else -> error("$name is not a valid property name")
  }

internal fun MedicationAdministration.Performer.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "function" -> true
    "actor" -> true
    else -> false
  }

internal fun MedicationAdministration.Performer.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.function?.let { add(it) }
  add(this@getAllChildren.actor)
}

internal fun MedicationAdministration.Dosage.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "text" -> this.text
    "site" -> this.site
    "route" -> this.route
    "method" -> this.method
    "dose" -> this.dose
    "rate" -> this.rate
    else -> error("$name is not a valid property name")
  }

internal fun MedicationAdministration.Dosage.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "text" -> true
    "site" -> true
    "route" -> true
    "method" -> true
    "dose" -> true
    "rate" -> true
    else -> false
  }

internal fun MedicationAdministration.Dosage.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.text?.let { add(it) }
  this@getAllChildren.site?.let { add(it) }
  this@getAllChildren.route?.let { add(it) }
  this@getAllChildren.method?.let { add(it) }
  this@getAllChildren.dose?.let { add(it) }
  this@getAllChildren.rate?.let { add(it) }
}
