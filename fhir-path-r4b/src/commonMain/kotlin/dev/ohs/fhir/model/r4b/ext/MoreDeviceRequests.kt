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

import dev.ohs.fhir.model.r4b.DeviceRequest
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun DeviceRequest.getProperty(name: String): Any? =
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
    "priorRequest" -> this.priorRequest
    "groupIdentifier" -> this.groupIdentifier
    "status" -> this.status
    "intent" -> this.intent
    "priority" -> this.priority
    "code" -> this.code
    "parameter" -> this.parameter
    "subject" -> this.subject
    "encounter" -> this.encounter
    "occurrence" -> this.occurrence
    "authoredOn" -> this.authoredOn
    "requester" -> this.requester
    "performerType" -> this.performerType
    "performer" -> this.performer
    "reasonCode" -> this.reasonCode
    "reasonReference" -> this.reasonReference
    "insurance" -> this.insurance
    "supportingInfo" -> this.supportingInfo
    "note" -> this.note
    "relevantHistory" -> this.relevantHistory
    else -> error("$name is not a valid property name")
  }

internal fun DeviceRequest.hasProperty(name: String): Boolean =
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
    "priorRequest" -> true
    "groupIdentifier" -> true
    "status" -> true
    "intent" -> true
    "priority" -> true
    "code" -> true
    "parameter" -> true
    "subject" -> true
    "encounter" -> true
    "occurrence" -> true
    "authoredOn" -> true
    "requester" -> true
    "performerType" -> true
    "performer" -> true
    "reasonCode" -> true
    "reasonReference" -> true
    "insurance" -> true
    "supportingInfo" -> true
    "note" -> true
    "relevantHistory" -> true
    else -> false
  }

internal fun DeviceRequest.getAllChildren(): List<Any> = buildList {
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
  addAll(this@getAllChildren.priorRequest)
  this@getAllChildren.groupIdentifier?.let { add(it) }
  this@getAllChildren.status?.let { add(it) }
  add(this@getAllChildren.intent)
  this@getAllChildren.priority?.let { add(it) }
  add(this@getAllChildren.code)
  addAll(this@getAllChildren.parameter)
  add(this@getAllChildren.subject)
  this@getAllChildren.encounter?.let { add(it) }
  this@getAllChildren.occurrence?.let { add(it) }
  this@getAllChildren.authoredOn?.let { add(it) }
  this@getAllChildren.requester?.let { add(it) }
  this@getAllChildren.performerType?.let { add(it) }
  this@getAllChildren.performer?.let { add(it) }
  addAll(this@getAllChildren.reasonCode)
  addAll(this@getAllChildren.reasonReference)
  addAll(this@getAllChildren.insurance)
  addAll(this@getAllChildren.supportingInfo)
  addAll(this@getAllChildren.note)
  addAll(this@getAllChildren.relevantHistory)
}

internal fun DeviceRequest.Parameter.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "code" -> this.code
    "value" -> this.`value`
    else -> error("$name is not a valid property name")
  }

internal fun DeviceRequest.Parameter.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "code" -> true
    "value" -> true
    else -> false
  }

internal fun DeviceRequest.Parameter.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.code?.let { add(it) }
  this@getAllChildren.`value`?.let { add(it) }
}
