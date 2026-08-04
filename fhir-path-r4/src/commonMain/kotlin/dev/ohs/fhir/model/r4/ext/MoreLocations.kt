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

import dev.ohs.fhir.model.r4.Location
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun Location.getProperty(name: String): Any? =
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
    "operationalStatus" -> this.operationalStatus
    "name" -> this.name
    "alias" -> this.alias
    "description" -> this.description
    "mode" -> this.mode
    "type" -> this.type
    "telecom" -> this.telecom
    "address" -> this.address
    "physicalType" -> this.physicalType
    "position" -> this.position
    "managingOrganization" -> this.managingOrganization
    "partOf" -> this.partOf
    "hoursOfOperation" -> this.hoursOfOperation
    "availabilityExceptions" -> this.availabilityExceptions
    "endpoint" -> this.endpoint
    else -> error("$name is not a valid property name")
  }

internal fun Location.hasProperty(name: String): Boolean =
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
    "operationalStatus" -> true
    "name" -> true
    "alias" -> true
    "description" -> true
    "mode" -> true
    "type" -> true
    "telecom" -> true
    "address" -> true
    "physicalType" -> true
    "position" -> true
    "managingOrganization" -> true
    "partOf" -> true
    "hoursOfOperation" -> true
    "availabilityExceptions" -> true
    "endpoint" -> true
    else -> false
  }

internal fun Location.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.meta?.let { add(it) }
  this@getAllChildren.implicitRules?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.contained)
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.identifier)
  this@getAllChildren.status?.let { add(it) }
  this@getAllChildren.operationalStatus?.let { add(it) }
  this@getAllChildren.name?.let { add(it) }
  addAll(this@getAllChildren.alias)
  this@getAllChildren.description?.let { add(it) }
  this@getAllChildren.mode?.let { add(it) }
  addAll(this@getAllChildren.type)
  addAll(this@getAllChildren.telecom)
  this@getAllChildren.address?.let { add(it) }
  this@getAllChildren.physicalType?.let { add(it) }
  this@getAllChildren.position?.let { add(it) }
  this@getAllChildren.managingOrganization?.let { add(it) }
  this@getAllChildren.partOf?.let { add(it) }
  addAll(this@getAllChildren.hoursOfOperation)
  this@getAllChildren.availabilityExceptions?.let { add(it) }
  addAll(this@getAllChildren.endpoint)
}

internal fun Location.Position.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "longitude" -> this.longitude
    "latitude" -> this.latitude
    "altitude" -> this.altitude
    else -> error("$name is not a valid property name")
  }

internal fun Location.Position.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "longitude" -> true
    "latitude" -> true
    "altitude" -> true
    else -> false
  }

internal fun Location.Position.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.longitude)
  add(this@getAllChildren.latitude)
  this@getAllChildren.altitude?.let { add(it) }
}

internal fun Location.HoursOfOperation.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "daysOfWeek" -> this.daysOfWeek
    "allDay" -> this.allDay
    "openingTime" -> this.openingTime
    "closingTime" -> this.closingTime
    else -> error("$name is not a valid property name")
  }

internal fun Location.HoursOfOperation.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "daysOfWeek" -> true
    "allDay" -> true
    "openingTime" -> true
    "closingTime" -> true
    else -> false
  }

internal fun Location.HoursOfOperation.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.daysOfWeek)
  this@getAllChildren.allDay?.let { add(it) }
  this@getAllChildren.openingTime?.let { add(it) }
  this@getAllChildren.closingTime?.let { add(it) }
}
