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

import dev.ohs.fhir.model.r4.Appointment
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun Appointment.getProperty(name: String): Any? =
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
    "cancelationReason" -> this.cancelationReason
    "serviceCategory" -> this.serviceCategory
    "serviceType" -> this.serviceType
    "specialty" -> this.specialty
    "appointmentType" -> this.appointmentType
    "reasonCode" -> this.reasonCode
    "reasonReference" -> this.reasonReference
    "priority" -> this.priority
    "description" -> this.description
    "supportingInformation" -> this.supportingInformation
    "start" -> this.start
    "end" -> this.end
    "minutesDuration" -> this.minutesDuration
    "slot" -> this.slot
    "created" -> this.created
    "comment" -> this.comment
    "patientInstruction" -> this.patientInstruction
    "basedOn" -> this.basedOn
    "participant" -> this.participant
    "requestedPeriod" -> this.requestedPeriod
    else -> error("$name is not a valid property name")
  }

internal fun Appointment.hasProperty(name: String): Boolean =
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
    "cancelationReason" -> true
    "serviceCategory" -> true
    "serviceType" -> true
    "specialty" -> true
    "appointmentType" -> true
    "reasonCode" -> true
    "reasonReference" -> true
    "priority" -> true
    "description" -> true
    "supportingInformation" -> true
    "start" -> true
    "end" -> true
    "minutesDuration" -> true
    "slot" -> true
    "created" -> true
    "comment" -> true
    "patientInstruction" -> true
    "basedOn" -> true
    "participant" -> true
    "requestedPeriod" -> true
    else -> false
  }

internal fun Appointment.getAllChildren(): List<Any> = buildList {
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
  this@getAllChildren.cancelationReason?.let { add(it) }
  addAll(this@getAllChildren.serviceCategory)
  addAll(this@getAllChildren.serviceType)
  addAll(this@getAllChildren.specialty)
  this@getAllChildren.appointmentType?.let { add(it) }
  addAll(this@getAllChildren.reasonCode)
  addAll(this@getAllChildren.reasonReference)
  this@getAllChildren.priority?.let { add(it) }
  this@getAllChildren.description?.let { add(it) }
  addAll(this@getAllChildren.supportingInformation)
  this@getAllChildren.start?.let { add(it) }
  this@getAllChildren.end?.let { add(it) }
  this@getAllChildren.minutesDuration?.let { add(it) }
  addAll(this@getAllChildren.slot)
  this@getAllChildren.created?.let { add(it) }
  this@getAllChildren.comment?.let { add(it) }
  this@getAllChildren.patientInstruction?.let { add(it) }
  addAll(this@getAllChildren.basedOn)
  addAll(this@getAllChildren.participant)
  addAll(this@getAllChildren.requestedPeriod)
}

internal fun Appointment.Participant.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "actor" -> this.actor
    "required" -> this.required
    "status" -> this.status
    "period" -> this.period
    else -> error("$name is not a valid property name")
  }

internal fun Appointment.Participant.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "actor" -> true
    "required" -> true
    "status" -> true
    "period" -> true
    else -> false
  }

internal fun Appointment.Participant.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.type)
  this@getAllChildren.actor?.let { add(it) }
  this@getAllChildren.required?.let { add(it) }
  add(this@getAllChildren.status)
  this@getAllChildren.period?.let { add(it) }
}
