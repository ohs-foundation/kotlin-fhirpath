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

import dev.ohs.fhir.model.r5.Transport
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun Transport.getProperty(name: String): Any? =
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
    "groupIdentifier" -> this.groupIdentifier
    "partOf" -> this.partOf
    "status" -> this.status
    "statusReason" -> this.statusReason
    "intent" -> this.intent
    "priority" -> this.priority
    "code" -> this.code
    "description" -> this.description
    "focus" -> this.focus
    "for" -> this.`for`
    "encounter" -> this.encounter
    "completionTime" -> this.completionTime
    "authoredOn" -> this.authoredOn
    "lastModified" -> this.lastModified
    "requester" -> this.requester
    "performerType" -> this.performerType
    "owner" -> this.owner
    "location" -> this.location
    "insurance" -> this.insurance
    "note" -> this.note
    "relevantHistory" -> this.relevantHistory
    "restriction" -> this.restriction
    "input" -> this.input
    "output" -> this.output
    "requestedLocation" -> this.requestedLocation
    "currentLocation" -> this.currentLocation
    "reason" -> this.reason
    "history" -> this.history
    else -> error("$name is not a valid property name")
  }

internal fun Transport.hasProperty(name: String): Boolean =
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
    "groupIdentifier" -> true
    "partOf" -> true
    "status" -> true
    "statusReason" -> true
    "intent" -> true
    "priority" -> true
    "code" -> true
    "description" -> true
    "focus" -> true
    "for" -> true
    "encounter" -> true
    "completionTime" -> true
    "authoredOn" -> true
    "lastModified" -> true
    "requester" -> true
    "performerType" -> true
    "owner" -> true
    "location" -> true
    "insurance" -> true
    "note" -> true
    "relevantHistory" -> true
    "restriction" -> true
    "input" -> true
    "output" -> true
    "requestedLocation" -> true
    "currentLocation" -> true
    "reason" -> true
    "history" -> true
    else -> false
  }

internal fun Transport.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.meta?.let { add(it) }
  this@getAllChildren.implicitRules?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.contained)
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.identifier)
  this@getAllChildren.instantiatesCanonical?.let { add(it) }
  this@getAllChildren.instantiatesUri?.let { add(it) }
  addAll(this@getAllChildren.basedOn)
  this@getAllChildren.groupIdentifier?.let { add(it) }
  addAll(this@getAllChildren.partOf)
  this@getAllChildren.status?.let { add(it) }
  this@getAllChildren.statusReason?.let { add(it) }
  add(this@getAllChildren.intent)
  this@getAllChildren.priority?.let { add(it) }
  this@getAllChildren.code?.let { add(it) }
  this@getAllChildren.description?.let { add(it) }
  this@getAllChildren.focus?.let { add(it) }
  this@getAllChildren.`for`?.let { add(it) }
  this@getAllChildren.encounter?.let { add(it) }
  this@getAllChildren.completionTime?.let { add(it) }
  this@getAllChildren.authoredOn?.let { add(it) }
  this@getAllChildren.lastModified?.let { add(it) }
  this@getAllChildren.requester?.let { add(it) }
  addAll(this@getAllChildren.performerType)
  this@getAllChildren.owner?.let { add(it) }
  this@getAllChildren.location?.let { add(it) }
  addAll(this@getAllChildren.insurance)
  addAll(this@getAllChildren.note)
  addAll(this@getAllChildren.relevantHistory)
  this@getAllChildren.restriction?.let { add(it) }
  addAll(this@getAllChildren.input)
  addAll(this@getAllChildren.output)
  add(this@getAllChildren.requestedLocation)
  add(this@getAllChildren.currentLocation)
  this@getAllChildren.reason?.let { add(it) }
  this@getAllChildren.history?.let { add(it) }
}

internal fun Transport.Restriction.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "repetitions" -> this.repetitions
    "period" -> this.period
    "recipient" -> this.recipient
    else -> error("$name is not a valid property name")
  }

internal fun Transport.Restriction.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "repetitions" -> true
    "period" -> true
    "recipient" -> true
    else -> false
  }

internal fun Transport.Restriction.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.repetitions?.let { add(it) }
  this@getAllChildren.period?.let { add(it) }
  addAll(this@getAllChildren.recipient)
}

internal fun Transport.Input.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "value" -> this.`value`
    else -> error("$name is not a valid property name")
  }

internal fun Transport.Input.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "value" -> true
    else -> false
  }

internal fun Transport.Input.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.type)
  add(this@getAllChildren.`value`)
}

internal fun Transport.Output.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "value" -> this.`value`
    else -> error("$name is not a valid property name")
  }

internal fun Transport.Output.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "value" -> true
    else -> false
  }

internal fun Transport.Output.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.type)
  add(this@getAllChildren.`value`)
}
