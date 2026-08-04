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

import dev.ohs.fhir.model.r5.MedicationRequest
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun MedicationRequest.getProperty(name: String): Any? =
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
    "priorPrescription" -> this.priorPrescription
    "groupIdentifier" -> this.groupIdentifier
    "status" -> this.status
    "statusReason" -> this.statusReason
    "statusChanged" -> this.statusChanged
    "intent" -> this.intent
    "category" -> this.category
    "priority" -> this.priority
    "doNotPerform" -> this.doNotPerform
    "medication" -> this.medication
    "subject" -> this.subject
    "informationSource" -> this.informationSource
    "encounter" -> this.encounter
    "supportingInformation" -> this.supportingInformation
    "authoredOn" -> this.authoredOn
    "requester" -> this.requester
    "reported" -> this.reported
    "performerType" -> this.performerType
    "performer" -> this.performer
    "device" -> this.device
    "recorder" -> this.recorder
    "reason" -> this.reason
    "courseOfTherapyType" -> this.courseOfTherapyType
    "insurance" -> this.insurance
    "note" -> this.note
    "renderedDosageInstruction" -> this.renderedDosageInstruction
    "effectiveDosePeriod" -> this.effectiveDosePeriod
    "dosageInstruction" -> this.dosageInstruction
    "dispenseRequest" -> this.dispenseRequest
    "substitution" -> this.substitution
    "eventHistory" -> this.eventHistory
    else -> error("$name is not a valid property name")
  }

internal fun MedicationRequest.hasProperty(name: String): Boolean =
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
    "priorPrescription" -> true
    "groupIdentifier" -> true
    "status" -> true
    "statusReason" -> true
    "statusChanged" -> true
    "intent" -> true
    "category" -> true
    "priority" -> true
    "doNotPerform" -> true
    "medication" -> true
    "subject" -> true
    "informationSource" -> true
    "encounter" -> true
    "supportingInformation" -> true
    "authoredOn" -> true
    "requester" -> true
    "reported" -> true
    "performerType" -> true
    "performer" -> true
    "device" -> true
    "recorder" -> true
    "reason" -> true
    "courseOfTherapyType" -> true
    "insurance" -> true
    "note" -> true
    "renderedDosageInstruction" -> true
    "effectiveDosePeriod" -> true
    "dosageInstruction" -> true
    "dispenseRequest" -> true
    "substitution" -> true
    "eventHistory" -> true
    else -> false
  }

internal fun MedicationRequest.getAllChildren(): List<Any> = buildList {
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
  this@getAllChildren.priorPrescription?.let { add(it) }
  this@getAllChildren.groupIdentifier?.let { add(it) }
  add(this@getAllChildren.status)
  this@getAllChildren.statusReason?.let { add(it) }
  this@getAllChildren.statusChanged?.let { add(it) }
  add(this@getAllChildren.intent)
  addAll(this@getAllChildren.category)
  this@getAllChildren.priority?.let { add(it) }
  this@getAllChildren.doNotPerform?.let { add(it) }
  add(this@getAllChildren.medication)
  add(this@getAllChildren.subject)
  addAll(this@getAllChildren.informationSource)
  this@getAllChildren.encounter?.let { add(it) }
  addAll(this@getAllChildren.supportingInformation)
  this@getAllChildren.authoredOn?.let { add(it) }
  this@getAllChildren.requester?.let { add(it) }
  this@getAllChildren.reported?.let { add(it) }
  this@getAllChildren.performerType?.let { add(it) }
  addAll(this@getAllChildren.performer)
  addAll(this@getAllChildren.device)
  this@getAllChildren.recorder?.let { add(it) }
  addAll(this@getAllChildren.reason)
  this@getAllChildren.courseOfTherapyType?.let { add(it) }
  addAll(this@getAllChildren.insurance)
  addAll(this@getAllChildren.note)
  this@getAllChildren.renderedDosageInstruction?.let { add(it) }
  this@getAllChildren.effectiveDosePeriod?.let { add(it) }
  addAll(this@getAllChildren.dosageInstruction)
  this@getAllChildren.dispenseRequest?.let { add(it) }
  this@getAllChildren.substitution?.let { add(it) }
  addAll(this@getAllChildren.eventHistory)
}

internal fun MedicationRequest.DispenseRequest.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "initialFill" -> this.initialFill
    "dispenseInterval" -> this.dispenseInterval
    "validityPeriod" -> this.validityPeriod
    "numberOfRepeatsAllowed" -> this.numberOfRepeatsAllowed
    "quantity" -> this.quantity
    "expectedSupplyDuration" -> this.expectedSupplyDuration
    "dispenser" -> this.dispenser
    "dispenserInstruction" -> this.dispenserInstruction
    "doseAdministrationAid" -> this.doseAdministrationAid
    else -> error("$name is not a valid property name")
  }

internal fun MedicationRequest.DispenseRequest.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "initialFill" -> true
    "dispenseInterval" -> true
    "validityPeriod" -> true
    "numberOfRepeatsAllowed" -> true
    "quantity" -> true
    "expectedSupplyDuration" -> true
    "dispenser" -> true
    "dispenserInstruction" -> true
    "doseAdministrationAid" -> true
    else -> false
  }

internal fun MedicationRequest.DispenseRequest.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.initialFill?.let { add(it) }
  this@getAllChildren.dispenseInterval?.let { add(it) }
  this@getAllChildren.validityPeriod?.let { add(it) }
  this@getAllChildren.numberOfRepeatsAllowed?.let { add(it) }
  this@getAllChildren.quantity?.let { add(it) }
  this@getAllChildren.expectedSupplyDuration?.let { add(it) }
  this@getAllChildren.dispenser?.let { add(it) }
  addAll(this@getAllChildren.dispenserInstruction)
  this@getAllChildren.doseAdministrationAid?.let { add(it) }
}

internal fun MedicationRequest.DispenseRequest.InitialFill.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "quantity" -> this.quantity
    "duration" -> this.duration
    else -> error("$name is not a valid property name")
  }

internal fun MedicationRequest.DispenseRequest.InitialFill.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "quantity" -> true
    "duration" -> true
    else -> false
  }

internal fun MedicationRequest.DispenseRequest.InitialFill.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.quantity?.let { add(it) }
  this@getAllChildren.duration?.let { add(it) }
}

internal fun MedicationRequest.Substitution.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "allowed" -> this.allowed
    "reason" -> this.reason
    else -> error("$name is not a valid property name")
  }

internal fun MedicationRequest.Substitution.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "allowed" -> true
    "reason" -> true
    else -> false
  }

internal fun MedicationRequest.Substitution.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.allowed)
  this@getAllChildren.reason?.let { add(it) }
}
