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

import dev.ohs.fhir.model.r5.Encounter
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun Encounter.getProperty(name: String): Any? =
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
    "class" -> this.`class`
    "priority" -> this.priority
    "type" -> this.type
    "serviceType" -> this.serviceType
    "subject" -> this.subject
    "subjectStatus" -> this.subjectStatus
    "episodeOfCare" -> this.episodeOfCare
    "basedOn" -> this.basedOn
    "careTeam" -> this.careTeam
    "partOf" -> this.partOf
    "serviceProvider" -> this.serviceProvider
    "participant" -> this.participant
    "appointment" -> this.appointment
    "virtualService" -> this.virtualService
    "actualPeriod" -> this.actualPeriod
    "plannedStartDate" -> this.plannedStartDate
    "plannedEndDate" -> this.plannedEndDate
    "length" -> this.length
    "reason" -> this.reason
    "diagnosis" -> this.diagnosis
    "account" -> this.account
    "dietPreference" -> this.dietPreference
    "specialArrangement" -> this.specialArrangement
    "specialCourtesy" -> this.specialCourtesy
    "admission" -> this.admission
    "location" -> this.location
    else -> error("$name is not a valid property name")
  }

internal fun Encounter.hasProperty(name: String): Boolean =
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
    "class" -> true
    "priority" -> true
    "type" -> true
    "serviceType" -> true
    "subject" -> true
    "subjectStatus" -> true
    "episodeOfCare" -> true
    "basedOn" -> true
    "careTeam" -> true
    "partOf" -> true
    "serviceProvider" -> true
    "participant" -> true
    "appointment" -> true
    "virtualService" -> true
    "actualPeriod" -> true
    "plannedStartDate" -> true
    "plannedEndDate" -> true
    "length" -> true
    "reason" -> true
    "diagnosis" -> true
    "account" -> true
    "dietPreference" -> true
    "specialArrangement" -> true
    "specialCourtesy" -> true
    "admission" -> true
    "location" -> true
    else -> false
  }

internal fun Encounter.getAllChildren(): List<Any> = buildList {
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
  addAll(this@getAllChildren.`class`)
  this@getAllChildren.priority?.let { add(it) }
  addAll(this@getAllChildren.type)
  addAll(this@getAllChildren.serviceType)
  this@getAllChildren.subject?.let { add(it) }
  this@getAllChildren.subjectStatus?.let { add(it) }
  addAll(this@getAllChildren.episodeOfCare)
  addAll(this@getAllChildren.basedOn)
  addAll(this@getAllChildren.careTeam)
  this@getAllChildren.partOf?.let { add(it) }
  this@getAllChildren.serviceProvider?.let { add(it) }
  addAll(this@getAllChildren.participant)
  addAll(this@getAllChildren.appointment)
  addAll(this@getAllChildren.virtualService)
  this@getAllChildren.actualPeriod?.let { add(it) }
  this@getAllChildren.plannedStartDate?.let { add(it) }
  this@getAllChildren.plannedEndDate?.let { add(it) }
  this@getAllChildren.length?.let { add(it) }
  addAll(this@getAllChildren.reason)
  addAll(this@getAllChildren.diagnosis)
  addAll(this@getAllChildren.account)
  addAll(this@getAllChildren.dietPreference)
  addAll(this@getAllChildren.specialArrangement)
  addAll(this@getAllChildren.specialCourtesy)
  this@getAllChildren.admission?.let { add(it) }
  addAll(this@getAllChildren.location)
}

internal fun Encounter.Participant.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "period" -> this.period
    "actor" -> this.actor
    else -> error("$name is not a valid property name")
  }

internal fun Encounter.Participant.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "period" -> true
    "actor" -> true
    else -> false
  }

internal fun Encounter.Participant.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.type)
  this@getAllChildren.period?.let { add(it) }
  this@getAllChildren.actor?.let { add(it) }
}

internal fun Encounter.Reason.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "use" -> this.use
    "value" -> this.`value`
    else -> error("$name is not a valid property name")
  }

internal fun Encounter.Reason.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "use" -> true
    "value" -> true
    else -> false
  }

internal fun Encounter.Reason.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.use)
  addAll(this@getAllChildren.`value`)
}

internal fun Encounter.Diagnosis.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "condition" -> this.condition
    "use" -> this.use
    else -> error("$name is not a valid property name")
  }

internal fun Encounter.Diagnosis.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "condition" -> true
    "use" -> true
    else -> false
  }

internal fun Encounter.Diagnosis.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.condition)
  addAll(this@getAllChildren.use)
}

internal fun Encounter.Admission.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "preAdmissionIdentifier" -> this.preAdmissionIdentifier
    "origin" -> this.origin
    "admitSource" -> this.admitSource
    "reAdmission" -> this.reAdmission
    "destination" -> this.destination
    "dischargeDisposition" -> this.dischargeDisposition
    else -> error("$name is not a valid property name")
  }

internal fun Encounter.Admission.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "preAdmissionIdentifier" -> true
    "origin" -> true
    "admitSource" -> true
    "reAdmission" -> true
    "destination" -> true
    "dischargeDisposition" -> true
    else -> false
  }

internal fun Encounter.Admission.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.preAdmissionIdentifier?.let { add(it) }
  this@getAllChildren.origin?.let { add(it) }
  this@getAllChildren.admitSource?.let { add(it) }
  this@getAllChildren.reAdmission?.let { add(it) }
  this@getAllChildren.destination?.let { add(it) }
  this@getAllChildren.dischargeDisposition?.let { add(it) }
}

internal fun Encounter.Location.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "location" -> this.location
    "status" -> this.status
    "form" -> this.form
    "period" -> this.period
    else -> error("$name is not a valid property name")
  }

internal fun Encounter.Location.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "location" -> true
    "status" -> true
    "form" -> true
    "period" -> true
    else -> false
  }

internal fun Encounter.Location.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.location)
  this@getAllChildren.status?.let { add(it) }
  this@getAllChildren.form?.let { add(it) }
  this@getAllChildren.period?.let { add(it) }
}
