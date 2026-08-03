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

import dev.ohs.fhir.model.r5.Appointment
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
    "cancellationReason" -> this.cancellationReason
    "class" -> this.`class`
    "serviceCategory" -> this.serviceCategory
    "serviceType" -> this.serviceType
    "specialty" -> this.specialty
    "appointmentType" -> this.appointmentType
    "reason" -> this.reason
    "priority" -> this.priority
    "description" -> this.description
    "replaces" -> this.replaces
    "virtualService" -> this.virtualService
    "supportingInformation" -> this.supportingInformation
    "previousAppointment" -> this.previousAppointment
    "originatingAppointment" -> this.originatingAppointment
    "start" -> this.start
    "end" -> this.end
    "minutesDuration" -> this.minutesDuration
    "requestedPeriod" -> this.requestedPeriod
    "slot" -> this.slot
    "account" -> this.account
    "created" -> this.created
    "cancellationDate" -> this.cancellationDate
    "note" -> this.note
    "patientInstruction" -> this.patientInstruction
    "basedOn" -> this.basedOn
    "subject" -> this.subject
    "participant" -> this.participant
    "recurrenceId" -> this.recurrenceId
    "occurrenceChanged" -> this.occurrenceChanged
    "recurrenceTemplate" -> this.recurrenceTemplate
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
    "cancellationReason" -> true
    "class" -> true
    "serviceCategory" -> true
    "serviceType" -> true
    "specialty" -> true
    "appointmentType" -> true
    "reason" -> true
    "priority" -> true
    "description" -> true
    "replaces" -> true
    "virtualService" -> true
    "supportingInformation" -> true
    "previousAppointment" -> true
    "originatingAppointment" -> true
    "start" -> true
    "end" -> true
    "minutesDuration" -> true
    "requestedPeriod" -> true
    "slot" -> true
    "account" -> true
    "created" -> true
    "cancellationDate" -> true
    "note" -> true
    "patientInstruction" -> true
    "basedOn" -> true
    "subject" -> true
    "participant" -> true
    "recurrenceId" -> true
    "occurrenceChanged" -> true
    "recurrenceTemplate" -> true
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
  this@getAllChildren.cancellationReason?.let { add(it) }
  addAll(this@getAllChildren.`class`)
  addAll(this@getAllChildren.serviceCategory)
  addAll(this@getAllChildren.serviceType)
  addAll(this@getAllChildren.specialty)
  this@getAllChildren.appointmentType?.let { add(it) }
  addAll(this@getAllChildren.reason)
  this@getAllChildren.priority?.let { add(it) }
  this@getAllChildren.description?.let { add(it) }
  addAll(this@getAllChildren.replaces)
  addAll(this@getAllChildren.virtualService)
  addAll(this@getAllChildren.supportingInformation)
  this@getAllChildren.previousAppointment?.let { add(it) }
  this@getAllChildren.originatingAppointment?.let { add(it) }
  this@getAllChildren.start?.let { add(it) }
  this@getAllChildren.end?.let { add(it) }
  this@getAllChildren.minutesDuration?.let { add(it) }
  addAll(this@getAllChildren.requestedPeriod)
  addAll(this@getAllChildren.slot)
  addAll(this@getAllChildren.account)
  this@getAllChildren.created?.let { add(it) }
  this@getAllChildren.cancellationDate?.let { add(it) }
  addAll(this@getAllChildren.note)
  addAll(this@getAllChildren.patientInstruction)
  addAll(this@getAllChildren.basedOn)
  this@getAllChildren.subject?.let { add(it) }
  addAll(this@getAllChildren.participant)
  this@getAllChildren.recurrenceId?.let { add(it) }
  this@getAllChildren.occurrenceChanged?.let { add(it) }
  addAll(this@getAllChildren.recurrenceTemplate)
}

internal fun Appointment.Participant.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "period" -> this.period
    "actor" -> this.actor
    "required" -> this.required
    "status" -> this.status
    else -> error("$name is not a valid property name")
  }

internal fun Appointment.Participant.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "period" -> true
    "actor" -> true
    "required" -> true
    "status" -> true
    else -> false
  }

internal fun Appointment.Participant.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.type)
  this@getAllChildren.period?.let { add(it) }
  this@getAllChildren.actor?.let { add(it) }
  this@getAllChildren.required?.let { add(it) }
  add(this@getAllChildren.status)
}

internal fun Appointment.RecurrenceTemplate.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "timezone" -> this.timezone
    "recurrenceType" -> this.recurrenceType
    "lastOccurrenceDate" -> this.lastOccurrenceDate
    "occurrenceCount" -> this.occurrenceCount
    "occurrenceDate" -> this.occurrenceDate
    "weeklyTemplate" -> this.weeklyTemplate
    "monthlyTemplate" -> this.monthlyTemplate
    "yearlyTemplate" -> this.yearlyTemplate
    "excludingDate" -> this.excludingDate
    "excludingRecurrenceId" -> this.excludingRecurrenceId
    else -> error("$name is not a valid property name")
  }

internal fun Appointment.RecurrenceTemplate.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "timezone" -> true
    "recurrenceType" -> true
    "lastOccurrenceDate" -> true
    "occurrenceCount" -> true
    "occurrenceDate" -> true
    "weeklyTemplate" -> true
    "monthlyTemplate" -> true
    "yearlyTemplate" -> true
    "excludingDate" -> true
    "excludingRecurrenceId" -> true
    else -> false
  }

internal fun Appointment.RecurrenceTemplate.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.timezone?.let { add(it) }
  add(this@getAllChildren.recurrenceType)
  this@getAllChildren.lastOccurrenceDate?.let { add(it) }
  this@getAllChildren.occurrenceCount?.let { add(it) }
  addAll(this@getAllChildren.occurrenceDate)
  this@getAllChildren.weeklyTemplate?.let { add(it) }
  this@getAllChildren.monthlyTemplate?.let { add(it) }
  this@getAllChildren.yearlyTemplate?.let { add(it) }
  addAll(this@getAllChildren.excludingDate)
  addAll(this@getAllChildren.excludingRecurrenceId)
}

internal fun Appointment.RecurrenceTemplate.WeeklyTemplate.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "monday" -> this.monday
    "tuesday" -> this.tuesday
    "wednesday" -> this.wednesday
    "thursday" -> this.thursday
    "friday" -> this.friday
    "saturday" -> this.saturday
    "sunday" -> this.sunday
    "weekInterval" -> this.weekInterval
    else -> error("$name is not a valid property name")
  }

internal fun Appointment.RecurrenceTemplate.WeeklyTemplate.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "monday" -> true
    "tuesday" -> true
    "wednesday" -> true
    "thursday" -> true
    "friday" -> true
    "saturday" -> true
    "sunday" -> true
    "weekInterval" -> true
    else -> false
  }

internal fun Appointment.RecurrenceTemplate.WeeklyTemplate.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.monday?.let { add(it) }
  this@getAllChildren.tuesday?.let { add(it) }
  this@getAllChildren.wednesday?.let { add(it) }
  this@getAllChildren.thursday?.let { add(it) }
  this@getAllChildren.friday?.let { add(it) }
  this@getAllChildren.saturday?.let { add(it) }
  this@getAllChildren.sunday?.let { add(it) }
  this@getAllChildren.weekInterval?.let { add(it) }
}

internal fun Appointment.RecurrenceTemplate.MonthlyTemplate.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "dayOfMonth" -> this.dayOfMonth
    "nthWeekOfMonth" -> this.nthWeekOfMonth
    "dayOfWeek" -> this.dayOfWeek
    "monthInterval" -> this.monthInterval
    else -> error("$name is not a valid property name")
  }

internal fun Appointment.RecurrenceTemplate.MonthlyTemplate.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "dayOfMonth" -> true
    "nthWeekOfMonth" -> true
    "dayOfWeek" -> true
    "monthInterval" -> true
    else -> false
  }

internal fun Appointment.RecurrenceTemplate.MonthlyTemplate.getAllChildren(): List<Any> =
  buildList {
    this@getAllChildren.id?.let { add(it) }
    addAll(this@getAllChildren.extension)
    addAll(this@getAllChildren.modifierExtension)
    this@getAllChildren.dayOfMonth?.let { add(it) }
    this@getAllChildren.nthWeekOfMonth?.let { add(it) }
    this@getAllChildren.dayOfWeek?.let { add(it) }
    add(this@getAllChildren.monthInterval)
  }

internal fun Appointment.RecurrenceTemplate.YearlyTemplate.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "yearInterval" -> this.yearInterval
    else -> error("$name is not a valid property name")
  }

internal fun Appointment.RecurrenceTemplate.YearlyTemplate.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "yearInterval" -> true
    else -> false
  }

internal fun Appointment.RecurrenceTemplate.YearlyTemplate.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.yearInterval)
}
