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

import dev.ohs.fhir.model.r4b.CarePlan
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
    "author" -> this.author
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
    "author" -> true
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
  this@getAllChildren.author?.let { add(it) }
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
    "outcomeCodeableConcept" -> this.outcomeCodeableConcept
    "outcomeReference" -> this.outcomeReference
    "progress" -> this.progress
    "reference" -> this.reference
    "detail" -> this.detail
    else -> error("$name is not a valid property name")
  }

internal fun CarePlan.Activity.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "outcomeCodeableConcept" -> true
    "outcomeReference" -> true
    "progress" -> true
    "reference" -> true
    "detail" -> true
    else -> false
  }

internal fun CarePlan.Activity.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.outcomeCodeableConcept)
  addAll(this@getAllChildren.outcomeReference)
  addAll(this@getAllChildren.progress)
  this@getAllChildren.reference?.let { add(it) }
  this@getAllChildren.detail?.let { add(it) }
}

internal fun CarePlan.Activity.Detail.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "kind" -> this.kind
    "instantiatesCanonical" -> this.instantiatesCanonical
    "instantiatesUri" -> this.instantiatesUri
    "code" -> this.code
    "reasonCode" -> this.reasonCode
    "reasonReference" -> this.reasonReference
    "goal" -> this.goal
    "status" -> this.status
    "statusReason" -> this.statusReason
    "doNotPerform" -> this.doNotPerform
    "scheduled" -> this.scheduled
    "location" -> this.location
    "performer" -> this.performer
    "product" -> this.product
    "dailyAmount" -> this.dailyAmount
    "quantity" -> this.quantity
    "description" -> this.description
    else -> error("$name is not a valid property name")
  }

internal fun CarePlan.Activity.Detail.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "kind" -> true
    "instantiatesCanonical" -> true
    "instantiatesUri" -> true
    "code" -> true
    "reasonCode" -> true
    "reasonReference" -> true
    "goal" -> true
    "status" -> true
    "statusReason" -> true
    "doNotPerform" -> true
    "scheduled" -> true
    "location" -> true
    "performer" -> true
    "product" -> true
    "dailyAmount" -> true
    "quantity" -> true
    "description" -> true
    else -> false
  }

internal fun CarePlan.Activity.Detail.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.kind?.let { add(it) }
  addAll(this@getAllChildren.instantiatesCanonical)
  addAll(this@getAllChildren.instantiatesUri)
  this@getAllChildren.code?.let { add(it) }
  addAll(this@getAllChildren.reasonCode)
  addAll(this@getAllChildren.reasonReference)
  addAll(this@getAllChildren.goal)
  add(this@getAllChildren.status)
  this@getAllChildren.statusReason?.let { add(it) }
  this@getAllChildren.doNotPerform?.let { add(it) }
  this@getAllChildren.scheduled?.let { add(it) }
  this@getAllChildren.location?.let { add(it) }
  addAll(this@getAllChildren.performer)
  this@getAllChildren.product?.let { add(it) }
  this@getAllChildren.dailyAmount?.let { add(it) }
  this@getAllChildren.quantity?.let { add(it) }
  this@getAllChildren.description?.let { add(it) }
}
