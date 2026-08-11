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

import dev.ohs.fhir.model.r5.MedicationDispense
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun MedicationDispense.getProperty(name: String): Any? =
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
    "notPerformedReason" -> this.notPerformedReason
    "statusChanged" -> this.statusChanged
    "category" -> this.category
    "medication" -> this.medication
    "subject" -> this.subject
    "encounter" -> this.encounter
    "supportingInformation" -> this.supportingInformation
    "performer" -> this.performer
    "location" -> this.location
    "authorizingPrescription" -> this.authorizingPrescription
    "type" -> this.type
    "quantity" -> this.quantity
    "daysSupply" -> this.daysSupply
    "recorded" -> this.recorded
    "whenPrepared" -> this.whenPrepared
    "whenHandedOver" -> this.whenHandedOver
    "destination" -> this.destination
    "receiver" -> this.`receiver`
    "note" -> this.note
    "renderedDosageInstruction" -> this.renderedDosageInstruction
    "dosageInstruction" -> this.dosageInstruction
    "substitution" -> this.substitution
    "eventHistory" -> this.eventHistory
    else -> error("$name is not a valid property name")
  }

internal fun MedicationDispense.hasProperty(name: String): Boolean =
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
    "notPerformedReason" -> true
    "statusChanged" -> true
    "category" -> true
    "medication" -> true
    "subject" -> true
    "encounter" -> true
    "supportingInformation" -> true
    "performer" -> true
    "location" -> true
    "authorizingPrescription" -> true
    "type" -> true
    "quantity" -> true
    "daysSupply" -> true
    "recorded" -> true
    "whenPrepared" -> true
    "whenHandedOver" -> true
    "destination" -> true
    "receiver" -> true
    "note" -> true
    "renderedDosageInstruction" -> true
    "dosageInstruction" -> true
    "substitution" -> true
    "eventHistory" -> true
    else -> false
  }

internal fun MedicationDispense.getAllChildren(): List<Any> = buildList {
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
  this@getAllChildren.notPerformedReason?.let { add(it) }
  this@getAllChildren.statusChanged?.let { add(it) }
  addAll(this@getAllChildren.category)
  add(this@getAllChildren.medication)
  add(this@getAllChildren.subject)
  this@getAllChildren.encounter?.let { add(it) }
  addAll(this@getAllChildren.supportingInformation)
  addAll(this@getAllChildren.performer)
  this@getAllChildren.location?.let { add(it) }
  addAll(this@getAllChildren.authorizingPrescription)
  this@getAllChildren.type?.let { add(it) }
  this@getAllChildren.quantity?.let { add(it) }
  this@getAllChildren.daysSupply?.let { add(it) }
  this@getAllChildren.recorded?.let { add(it) }
  this@getAllChildren.whenPrepared?.let { add(it) }
  this@getAllChildren.whenHandedOver?.let { add(it) }
  this@getAllChildren.destination?.let { add(it) }
  addAll(this@getAllChildren.`receiver`)
  addAll(this@getAllChildren.note)
  this@getAllChildren.renderedDosageInstruction?.let { add(it) }
  addAll(this@getAllChildren.dosageInstruction)
  this@getAllChildren.substitution?.let { add(it) }
  addAll(this@getAllChildren.eventHistory)
}

internal fun MedicationDispense.Performer.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "function" -> this.function
    "actor" -> this.actor
    else -> error("$name is not a valid property name")
  }

internal fun MedicationDispense.Performer.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "function" -> true
    "actor" -> true
    else -> false
  }

internal fun MedicationDispense.Performer.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.function?.let { add(it) }
  add(this@getAllChildren.actor)
}

internal fun MedicationDispense.Substitution.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "wasSubstituted" -> this.wasSubstituted
    "type" -> this.type
    "reason" -> this.reason
    "responsibleParty" -> this.responsibleParty
    else -> error("$name is not a valid property name")
  }

internal fun MedicationDispense.Substitution.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "wasSubstituted" -> true
    "type" -> true
    "reason" -> true
    "responsibleParty" -> true
    else -> false
  }

internal fun MedicationDispense.Substitution.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.wasSubstituted)
  this@getAllChildren.type?.let { add(it) }
  addAll(this@getAllChildren.reason)
  this@getAllChildren.responsibleParty?.let { add(it) }
}
