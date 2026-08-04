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

import dev.ohs.fhir.model.r5.CarePlan
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun CarePlan.getProperty(name: String): Any? =
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
    "instantiatesCanonical" -> this.instantiatesCanonical
    "instantiatesUri" -> this.instantiatesUri
    "basedOn" -> this.basedOn
    "replaces" -> this.replaces
    "partOf" -> this.partOf
    "status" -> this.status
    "intent" -> this.intent
    "category" -> this.category
    "title" -> this.title
    "description" -> this.description
    "subject" -> this.subject
    "encounter" -> this.encounter
    "period" -> this.period
    "created" -> this.created
    "custodian" -> this.custodian
    "contributor" -> this.contributor
    "careTeam" -> this.careTeam
    "addresses" -> this.addresses
    "supportingInfo" -> this.supportingInfo
    "goal" -> this.goal
    "activity" -> this.activity
    "note" -> this.note
    else -> error("$name is not a valid property name")
  }

internal fun CarePlan.hasProperty(name: String): Boolean =
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
    "instantiatesCanonical" -> true
    "instantiatesUri" -> true
    "basedOn" -> true
    "replaces" -> true
    "partOf" -> true
    "status" -> true
    "intent" -> true
    "category" -> true
    "title" -> true
    "description" -> true
    "subject" -> true
    "encounter" -> true
    "period" -> true
    "created" -> true
    "custodian" -> true
    "contributor" -> true
    "careTeam" -> true
    "addresses" -> true
    "supportingInfo" -> true
    "goal" -> true
    "activity" -> true
    "note" -> true
    else -> false
  }

internal fun CarePlan.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.meta?.let { add(it) }
  this@getAllChildren.implicitRules?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.contained)
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.identifier)
  addAll(this@getAllChildren.instantiatesCanonical)
  addAll(this@getAllChildren.instantiatesUri)
  addAll(this@getAllChildren.basedOn)
  addAll(this@getAllChildren.replaces)
  addAll(this@getAllChildren.partOf)
  add(this@getAllChildren.status)
  add(this@getAllChildren.intent)
  addAll(this@getAllChildren.category)
  this@getAllChildren.title?.let { add(it) }
  this@getAllChildren.description?.let { add(it) }
  add(this@getAllChildren.subject)
  this@getAllChildren.encounter?.let { add(it) }
  this@getAllChildren.period?.let { add(it) }
  this@getAllChildren.created?.let { add(it) }
  this@getAllChildren.custodian?.let { add(it) }
  addAll(this@getAllChildren.contributor)
  addAll(this@getAllChildren.careTeam)
  addAll(this@getAllChildren.addresses)
  addAll(this@getAllChildren.supportingInfo)
  addAll(this@getAllChildren.goal)
  addAll(this@getAllChildren.activity)
  addAll(this@getAllChildren.note)
}

internal fun CarePlan.Activity.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "performedActivity" -> this.performedActivity
    "progress" -> this.progress
    "plannedActivityReference" -> this.plannedActivityReference
    else -> error("$name is not a valid property name")
  }

internal fun CarePlan.Activity.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "performedActivity" -> true
    "progress" -> true
    "plannedActivityReference" -> true
    else -> false
  }

internal fun CarePlan.Activity.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.performedActivity)
  addAll(this@getAllChildren.progress)
  this@getAllChildren.plannedActivityReference?.let { add(it) }
}
