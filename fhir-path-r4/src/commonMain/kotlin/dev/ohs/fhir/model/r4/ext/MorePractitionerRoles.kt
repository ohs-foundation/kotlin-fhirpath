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

import dev.ohs.fhir.model.r4.PractitionerRole
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun PractitionerRole.getProperty(name: String): Any? =
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
    "active" -> this.active
    "period" -> this.period
    "practitioner" -> this.practitioner
    "organization" -> this.organization
    "code" -> this.code
    "specialty" -> this.specialty
    "location" -> this.location
    "healthcareService" -> this.healthcareService
    "telecom" -> this.telecom
    "availableTime" -> this.availableTime
    "notAvailable" -> this.notAvailable
    "availabilityExceptions" -> this.availabilityExceptions
    "endpoint" -> this.endpoint
    else -> error("$name is not a valid property name")
  }

internal fun PractitionerRole.hasProperty(name: String): Boolean =
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
    "active" -> true
    "period" -> true
    "practitioner" -> true
    "organization" -> true
    "code" -> true
    "specialty" -> true
    "location" -> true
    "healthcareService" -> true
    "telecom" -> true
    "availableTime" -> true
    "notAvailable" -> true
    "availabilityExceptions" -> true
    "endpoint" -> true
    else -> false
  }

internal fun PractitionerRole.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.meta?.let { add(it) }
  this@getAllChildren.implicitRules?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.contained)
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.identifier)
  this@getAllChildren.active?.let { add(it) }
  this@getAllChildren.period?.let { add(it) }
  this@getAllChildren.practitioner?.let { add(it) }
  this@getAllChildren.organization?.let { add(it) }
  addAll(this@getAllChildren.code)
  addAll(this@getAllChildren.specialty)
  addAll(this@getAllChildren.location)
  addAll(this@getAllChildren.healthcareService)
  addAll(this@getAllChildren.telecom)
  addAll(this@getAllChildren.availableTime)
  addAll(this@getAllChildren.notAvailable)
  this@getAllChildren.availabilityExceptions?.let { add(it) }
  addAll(this@getAllChildren.endpoint)
}

internal fun PractitionerRole.AvailableTime.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "daysOfWeek" -> this.daysOfWeek
    "allDay" -> this.allDay
    "availableStartTime" -> this.availableStartTime
    "availableEndTime" -> this.availableEndTime
    else -> error("$name is not a valid property name")
  }

internal fun PractitionerRole.AvailableTime.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "daysOfWeek" -> true
    "allDay" -> true
    "availableStartTime" -> true
    "availableEndTime" -> true
    else -> false
  }

internal fun PractitionerRole.AvailableTime.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.daysOfWeek)
  this@getAllChildren.allDay?.let { add(it) }
  this@getAllChildren.availableStartTime?.let { add(it) }
  this@getAllChildren.availableEndTime?.let { add(it) }
}

internal fun PractitionerRole.NotAvailable.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "description" -> this.description
    "during" -> this.during
    else -> error("$name is not a valid property name")
  }

internal fun PractitionerRole.NotAvailable.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "description" -> true
    "during" -> true
    else -> false
  }

internal fun PractitionerRole.NotAvailable.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.description)
  this@getAllChildren.during?.let { add(it) }
}
