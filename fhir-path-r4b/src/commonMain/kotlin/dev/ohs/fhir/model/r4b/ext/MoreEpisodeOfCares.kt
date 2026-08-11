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

package dev.ohs.fhir.model.r4b.ext

import dev.ohs.fhir.model.r4b.EpisodeOfCare
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun EpisodeOfCare.getProperty(name: String): Any? =
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
    "type" -> this.type
    "diagnosis" -> this.diagnosis
    "patient" -> this.patient
    "managingOrganization" -> this.managingOrganization
    "period" -> this.period
    "referralRequest" -> this.referralRequest
    "careManager" -> this.careManager
    "team" -> this.team
    "account" -> this.account
    else -> error("$name is not a valid property name")
  }

internal fun EpisodeOfCare.hasProperty(name: String): Boolean =
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
    "type" -> true
    "diagnosis" -> true
    "patient" -> true
    "managingOrganization" -> true
    "period" -> true
    "referralRequest" -> true
    "careManager" -> true
    "team" -> true
    "account" -> true
    else -> false
  }

internal fun EpisodeOfCare.getAllChildren(): List<Any> = buildList {
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
  addAll(this@getAllChildren.type)
  addAll(this@getAllChildren.diagnosis)
  add(this@getAllChildren.patient)
  this@getAllChildren.managingOrganization?.let { add(it) }
  this@getAllChildren.period?.let { add(it) }
  addAll(this@getAllChildren.referralRequest)
  this@getAllChildren.careManager?.let { add(it) }
  addAll(this@getAllChildren.team)
  addAll(this@getAllChildren.account)
}

internal fun EpisodeOfCare.StatusHistory.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "status" -> this.status
    "period" -> this.period
    else -> error("$name is not a valid property name")
  }

internal fun EpisodeOfCare.StatusHistory.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "status" -> true
    "period" -> true
    else -> false
  }

internal fun EpisodeOfCare.StatusHistory.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.status)
  add(this@getAllChildren.period)
}

internal fun EpisodeOfCare.Diagnosis.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "condition" -> this.condition
    "role" -> this.role
    "rank" -> this.rank
    else -> error("$name is not a valid property name")
  }

internal fun EpisodeOfCare.Diagnosis.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "condition" -> true
    "role" -> true
    "rank" -> true
    else -> false
  }

internal fun EpisodeOfCare.Diagnosis.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.condition)
  this@getAllChildren.role?.let { add(it) }
  this@getAllChildren.rank?.let { add(it) }
}
