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

import dev.ohs.fhir.model.r5.ServiceRequest
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun ServiceRequest.getProperty(name: String): Any? =
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
    "requisition" -> this.requisition
    "status" -> this.status
    "intent" -> this.intent
    "category" -> this.category
    "priority" -> this.priority
    "doNotPerform" -> this.doNotPerform
    "code" -> this.code
    "orderDetail" -> this.orderDetail
    "quantity" -> this.quantity
    "subject" -> this.subject
    "focus" -> this.focus
    "encounter" -> this.encounter
    "occurrence" -> this.occurrence
    "asNeeded" -> this.asNeeded
    "authoredOn" -> this.authoredOn
    "requester" -> this.requester
    "performerType" -> this.performerType
    "performer" -> this.performer
    "location" -> this.location
    "reason" -> this.reason
    "insurance" -> this.insurance
    "supportingInfo" -> this.supportingInfo
    "specimen" -> this.specimen
    "bodySite" -> this.bodySite
    "bodyStructure" -> this.bodyStructure
    "note" -> this.note
    "patientInstruction" -> this.patientInstruction
    "relevantHistory" -> this.relevantHistory
    else -> error("$name is not a valid property name")
  }

internal fun ServiceRequest.hasProperty(name: String): Boolean =
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
    "requisition" -> true
    "status" -> true
    "intent" -> true
    "category" -> true
    "priority" -> true
    "doNotPerform" -> true
    "code" -> true
    "orderDetail" -> true
    "quantity" -> true
    "subject" -> true
    "focus" -> true
    "encounter" -> true
    "occurrence" -> true
    "asNeeded" -> true
    "authoredOn" -> true
    "requester" -> true
    "performerType" -> true
    "performer" -> true
    "location" -> true
    "reason" -> true
    "insurance" -> true
    "supportingInfo" -> true
    "specimen" -> true
    "bodySite" -> true
    "bodyStructure" -> true
    "note" -> true
    "patientInstruction" -> true
    "relevantHistory" -> true
    else -> false
  }

internal fun ServiceRequest.getAllChildren(): List<Any> = buildList {
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
  this@getAllChildren.requisition?.let { add(it) }
  add(this@getAllChildren.status)
  add(this@getAllChildren.intent)
  addAll(this@getAllChildren.category)
  this@getAllChildren.priority?.let { add(it) }
  this@getAllChildren.doNotPerform?.let { add(it) }
  this@getAllChildren.code?.let { add(it) }
  addAll(this@getAllChildren.orderDetail)
  this@getAllChildren.quantity?.let { add(it) }
  add(this@getAllChildren.subject)
  addAll(this@getAllChildren.focus)
  this@getAllChildren.encounter?.let { add(it) }
  this@getAllChildren.occurrence?.let { add(it) }
  this@getAllChildren.asNeeded?.let { add(it) }
  this@getAllChildren.authoredOn?.let { add(it) }
  this@getAllChildren.requester?.let { add(it) }
  this@getAllChildren.performerType?.let { add(it) }
  addAll(this@getAllChildren.performer)
  addAll(this@getAllChildren.location)
  addAll(this@getAllChildren.reason)
  addAll(this@getAllChildren.insurance)
  addAll(this@getAllChildren.supportingInfo)
  addAll(this@getAllChildren.specimen)
  addAll(this@getAllChildren.bodySite)
  this@getAllChildren.bodyStructure?.let { add(it) }
  addAll(this@getAllChildren.note)
  addAll(this@getAllChildren.patientInstruction)
  addAll(this@getAllChildren.relevantHistory)
}

internal fun ServiceRequest.OrderDetail.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "parameterFocus" -> this.parameterFocus
    "parameter" -> this.parameter
    else -> error("$name is not a valid property name")
  }

internal fun ServiceRequest.OrderDetail.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "parameterFocus" -> true
    "parameter" -> true
    else -> false
  }

internal fun ServiceRequest.OrderDetail.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.parameterFocus?.let { add(it) }
  addAll(this@getAllChildren.parameter)
}

internal fun ServiceRequest.OrderDetail.Parameter.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "code" -> this.code
    "value" -> this.`value`
    else -> error("$name is not a valid property name")
  }

internal fun ServiceRequest.OrderDetail.Parameter.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "code" -> true
    "value" -> true
    else -> false
  }

internal fun ServiceRequest.OrderDetail.Parameter.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.code)
  add(this@getAllChildren.`value`)
}

internal fun ServiceRequest.PatientInstruction.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "instruction" -> this.instruction
    else -> error("$name is not a valid property name")
  }

internal fun ServiceRequest.PatientInstruction.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "instruction" -> true
    else -> false
  }

internal fun ServiceRequest.PatientInstruction.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.instruction?.let { add(it) }
}
