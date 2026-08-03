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

import dev.ohs.fhir.model.r4.Encounter
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
    "statusHistory" -> this.statusHistory
    "class" -> this.`class`
    "classHistory" -> this.classHistory
    "type" -> this.type
    "serviceType" -> this.serviceType
    "priority" -> this.priority
    "subject" -> this.subject
    "episodeOfCare" -> this.episodeOfCare
    "basedOn" -> this.basedOn
    "participant" -> this.participant
    "appointment" -> this.appointment
    "period" -> this.period
    "length" -> this.length
    "reasonCode" -> this.reasonCode
    "reasonReference" -> this.reasonReference
    "diagnosis" -> this.diagnosis
    "account" -> this.account
    "hospitalization" -> this.hospitalization
    "location" -> this.location
    "serviceProvider" -> this.serviceProvider
    "partOf" -> this.partOf
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
    "statusHistory" -> true
    "class" -> true
    "classHistory" -> true
    "type" -> true
    "serviceType" -> true
    "priority" -> true
    "subject" -> true
    "episodeOfCare" -> true
    "basedOn" -> true
    "participant" -> true
    "appointment" -> true
    "period" -> true
    "length" -> true
    "reasonCode" -> true
    "reasonReference" -> true
    "diagnosis" -> true
    "account" -> true
    "hospitalization" -> true
    "location" -> true
    "serviceProvider" -> true
    "partOf" -> true
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
  addAll(this@getAllChildren.statusHistory)
  add(this@getAllChildren.`class`)
  addAll(this@getAllChildren.classHistory)
  addAll(this@getAllChildren.type)
  this@getAllChildren.serviceType?.let { add(it) }
  this@getAllChildren.priority?.let { add(it) }
  this@getAllChildren.subject?.let { add(it) }
  addAll(this@getAllChildren.episodeOfCare)
  addAll(this@getAllChildren.basedOn)
  addAll(this@getAllChildren.participant)
  addAll(this@getAllChildren.appointment)
  this@getAllChildren.period?.let { add(it) }
  this@getAllChildren.length?.let { add(it) }
  addAll(this@getAllChildren.reasonCode)
  addAll(this@getAllChildren.reasonReference)
  addAll(this@getAllChildren.diagnosis)
  addAll(this@getAllChildren.account)
  this@getAllChildren.hospitalization?.let { add(it) }
  addAll(this@getAllChildren.location)
  this@getAllChildren.serviceProvider?.let { add(it) }
  this@getAllChildren.partOf?.let { add(it) }
}

internal fun Encounter.StatusHistory.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "status" -> this.status
    "period" -> this.period
    else -> error("$name is not a valid property name")
  }

internal fun Encounter.StatusHistory.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "status" -> true
    "period" -> true
    else -> false
  }

internal fun Encounter.StatusHistory.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.status)
  add(this@getAllChildren.period)
}

internal fun Encounter.ClassHistory.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "class" -> this.`class`
    "period" -> this.period
    else -> error("$name is not a valid property name")
  }

internal fun Encounter.ClassHistory.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "class" -> true
    "period" -> true
    else -> false
  }

internal fun Encounter.ClassHistory.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.`class`)
  add(this@getAllChildren.period)
}

internal fun Encounter.Participant.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "period" -> this.period
    "individual" -> this.individual
    else -> error("$name is not a valid property name")
  }

internal fun Encounter.Participant.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "period" -> true
    "individual" -> true
    else -> false
  }

internal fun Encounter.Participant.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.type)
  this@getAllChildren.period?.let { add(it) }
  this@getAllChildren.individual?.let { add(it) }
}

internal fun Encounter.Diagnosis.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "condition" -> this.condition
    "use" -> this.use
    "rank" -> this.rank
    else -> error("$name is not a valid property name")
  }

internal fun Encounter.Diagnosis.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "condition" -> true
    "use" -> true
    "rank" -> true
    else -> false
  }

internal fun Encounter.Diagnosis.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.condition)
  this@getAllChildren.use?.let { add(it) }
  this@getAllChildren.rank?.let { add(it) }
}

internal fun Encounter.Hospitalization.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "preAdmissionIdentifier" -> this.preAdmissionIdentifier
    "origin" -> this.origin
    "admitSource" -> this.admitSource
    "reAdmission" -> this.reAdmission
    "dietPreference" -> this.dietPreference
    "specialCourtesy" -> this.specialCourtesy
    "specialArrangement" -> this.specialArrangement
    "destination" -> this.destination
    "dischargeDisposition" -> this.dischargeDisposition
    else -> error("$name is not a valid property name")
  }

internal fun Encounter.Hospitalization.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "preAdmissionIdentifier" -> true
    "origin" -> true
    "admitSource" -> true
    "reAdmission" -> true
    "dietPreference" -> true
    "specialCourtesy" -> true
    "specialArrangement" -> true
    "destination" -> true
    "dischargeDisposition" -> true
    else -> false
  }

internal fun Encounter.Hospitalization.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.preAdmissionIdentifier?.let { add(it) }
  this@getAllChildren.origin?.let { add(it) }
  this@getAllChildren.admitSource?.let { add(it) }
  this@getAllChildren.reAdmission?.let { add(it) }
  addAll(this@getAllChildren.dietPreference)
  addAll(this@getAllChildren.specialCourtesy)
  addAll(this@getAllChildren.specialArrangement)
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
    "physicalType" -> this.physicalType
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
    "physicalType" -> true
    "period" -> true
    else -> false
  }

internal fun Encounter.Location.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.location)
  this@getAllChildren.status?.let { add(it) }
  this@getAllChildren.physicalType?.let { add(it) }
  this@getAllChildren.period?.let { add(it) }
}
