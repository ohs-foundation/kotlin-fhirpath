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

import dev.ohs.fhir.model.r5.CareTeam
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun CareTeam.getProperty(name: String): Any? =
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
    "category" -> this.category
    "name" -> this.name
    "subject" -> this.subject
    "period" -> this.period
    "participant" -> this.participant
    "reason" -> this.reason
    "managingOrganization" -> this.managingOrganization
    "telecom" -> this.telecom
    "note" -> this.note
    else -> error("$name is not a valid property name")
  }

internal fun CareTeam.hasProperty(name: String): Boolean =
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
    "category" -> true
    "name" -> true
    "subject" -> true
    "period" -> true
    "participant" -> true
    "reason" -> true
    "managingOrganization" -> true
    "telecom" -> true
    "note" -> true
    else -> false
  }

internal fun CareTeam.getAllChildren(): List<Any> = buildList {
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
  addAll(this@getAllChildren.category)
  this@getAllChildren.name?.let { add(it) }
  this@getAllChildren.subject?.let { add(it) }
  this@getAllChildren.period?.let { add(it) }
  addAll(this@getAllChildren.participant)
  addAll(this@getAllChildren.reason)
  addAll(this@getAllChildren.managingOrganization)
  addAll(this@getAllChildren.telecom)
  addAll(this@getAllChildren.note)
}

internal fun CareTeam.Participant.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "role" -> this.role
    "member" -> this.member
    "onBehalfOf" -> this.onBehalfOf
    "coverage" -> this.coverage
    else -> error("$name is not a valid property name")
  }

internal fun CareTeam.Participant.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "role" -> true
    "member" -> true
    "onBehalfOf" -> true
    "coverage" -> true
    else -> false
  }

internal fun CareTeam.Participant.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.role?.let { add(it) }
  this@getAllChildren.member?.let { add(it) }
  this@getAllChildren.onBehalfOf?.let { add(it) }
  this@getAllChildren.coverage?.let { add(it) }
}
