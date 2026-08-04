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

import dev.ohs.fhir.model.r5.EncounterHistory
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun EncounterHistory.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "meta" -> this.meta
    "implicitRules" -> this.implicitRules
    "language" -> this.language
    "text" -> this.text
    "contained" -> this.contained
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "encounter" -> this.encounter
    "identifier" -> this.identifier
    "status" -> this.status
    "class" -> this.`class`
    "type" -> this.type
    "serviceType" -> this.serviceType
    "subject" -> this.subject
    "subjectStatus" -> this.subjectStatus
    "actualPeriod" -> this.actualPeriod
    "plannedStartDate" -> this.plannedStartDate
    "plannedEndDate" -> this.plannedEndDate
    "length" -> this.length
    "location" -> this.location
    else -> error("$name is not a valid property name")
  }

internal fun EncounterHistory.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "meta" -> true
    "implicitRules" -> true
    "language" -> true
    "text" -> true
    "contained" -> true
    "extension" -> true
    "modifierExtension" -> true
    "encounter" -> true
    "identifier" -> true
    "status" -> true
    "class" -> true
    "type" -> true
    "serviceType" -> true
    "subject" -> true
    "subjectStatus" -> true
    "actualPeriod" -> true
    "plannedStartDate" -> true
    "plannedEndDate" -> true
    "length" -> true
    "location" -> true
    else -> false
  }

internal fun EncounterHistory.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.meta?.let { add(it) }
  this@getAllChildren.implicitRules?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.contained)
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.encounter?.let { add(it) }
  addAll(this@getAllChildren.identifier)
  add(this@getAllChildren.status)
  add(this@getAllChildren.`class`)
  addAll(this@getAllChildren.type)
  addAll(this@getAllChildren.serviceType)
  this@getAllChildren.subject?.let { add(it) }
  this@getAllChildren.subjectStatus?.let { add(it) }
  this@getAllChildren.actualPeriod?.let { add(it) }
  this@getAllChildren.plannedStartDate?.let { add(it) }
  this@getAllChildren.plannedEndDate?.let { add(it) }
  this@getAllChildren.length?.let { add(it) }
  addAll(this@getAllChildren.location)
}

internal fun EncounterHistory.Location.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "location" -> this.location
    "form" -> this.form
    else -> error("$name is not a valid property name")
  }

internal fun EncounterHistory.Location.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "location" -> true
    "form" -> true
    else -> false
  }

internal fun EncounterHistory.Location.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.location)
  this@getAllChildren.form?.let { add(it) }
}
