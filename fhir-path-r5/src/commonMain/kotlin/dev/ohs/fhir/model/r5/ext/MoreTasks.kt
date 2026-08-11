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

import dev.ohs.fhir.model.r5.Task
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun Task.getProperty(name: String): Any? =
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
    "businessStatus" -> this.businessStatus
    "intent" -> this.intent
    "priority" -> this.priority
    "doNotPerform" -> this.doNotPerform
    "code" -> this.code
    "description" -> this.description
    "focus" -> this.focus
    "for" -> this.`for`
    "encounter" -> this.encounter
    "requestedPeriod" -> this.requestedPeriod
    "executionPeriod" -> this.executionPeriod
    "authoredOn" -> this.authoredOn
    "lastModified" -> this.lastModified
    "requester" -> this.requester
    "requestedPerformer" -> this.requestedPerformer
    "owner" -> this.owner
    "performer" -> this.performer
    "location" -> this.location
    "reason" -> this.reason
    "insurance" -> this.insurance
    "note" -> this.note
    "relevantHistory" -> this.relevantHistory
    "restriction" -> this.restriction
    "input" -> this.input
    "output" -> this.output
    else -> error("$name is not a valid property name")
  }

internal fun Task.hasProperty(name: String): Boolean =
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
    "businessStatus" -> true
    "intent" -> true
    "priority" -> true
    "doNotPerform" -> true
    "code" -> true
    "description" -> true
    "focus" -> true
    "for" -> true
    "encounter" -> true
    "requestedPeriod" -> true
    "executionPeriod" -> true
    "authoredOn" -> true
    "lastModified" -> true
    "requester" -> true
    "requestedPerformer" -> true
    "owner" -> true
    "performer" -> true
    "location" -> true
    "reason" -> true
    "insurance" -> true
    "note" -> true
    "relevantHistory" -> true
    "restriction" -> true
    "input" -> true
    "output" -> true
    else -> false
  }

internal fun Task.getAllChildren(): List<Any> = buildList {
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
  add(this@getAllChildren.status)
  this@getAllChildren.statusReason?.let { add(it) }
  this@getAllChildren.businessStatus?.let { add(it) }
  add(this@getAllChildren.intent)
  this@getAllChildren.priority?.let { add(it) }
  this@getAllChildren.doNotPerform?.let { add(it) }
  this@getAllChildren.code?.let { add(it) }
  this@getAllChildren.description?.let { add(it) }
  this@getAllChildren.focus?.let { add(it) }
  this@getAllChildren.`for`?.let { add(it) }
  this@getAllChildren.encounter?.let { add(it) }
  this@getAllChildren.requestedPeriod?.let { add(it) }
  this@getAllChildren.executionPeriod?.let { add(it) }
  this@getAllChildren.authoredOn?.let { add(it) }
  this@getAllChildren.lastModified?.let { add(it) }
  this@getAllChildren.requester?.let { add(it) }
  addAll(this@getAllChildren.requestedPerformer)
  this@getAllChildren.owner?.let { add(it) }
  addAll(this@getAllChildren.performer)
  this@getAllChildren.location?.let { add(it) }
  addAll(this@getAllChildren.reason)
  addAll(this@getAllChildren.insurance)
  addAll(this@getAllChildren.note)
  addAll(this@getAllChildren.relevantHistory)
  this@getAllChildren.restriction?.let { add(it) }
  addAll(this@getAllChildren.input)
  addAll(this@getAllChildren.output)
}

internal fun Task.Performer.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "function" -> this.function
    "actor" -> this.actor
    else -> error("$name is not a valid property name")
  }

internal fun Task.Performer.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "function" -> true
    "actor" -> true
    else -> false
  }

internal fun Task.Performer.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.function?.let { add(it) }
  add(this@getAllChildren.actor)
}

internal fun Task.Restriction.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "repetitions" -> this.repetitions
    "period" -> this.period
    "recipient" -> this.recipient
    else -> error("$name is not a valid property name")
  }

internal fun Task.Restriction.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "repetitions" -> true
    "period" -> true
    "recipient" -> true
    else -> false
  }

internal fun Task.Restriction.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.repetitions?.let { add(it) }
  this@getAllChildren.period?.let { add(it) }
  addAll(this@getAllChildren.recipient)
}

internal fun Task.Input.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "value" -> this.`value`
    else -> error("$name is not a valid property name")
  }

internal fun Task.Input.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "value" -> true
    else -> false
  }

internal fun Task.Input.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.type)
  add(this@getAllChildren.`value`)
}

internal fun Task.Output.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "value" -> this.`value`
    else -> error("$name is not a valid property name")
  }

internal fun Task.Output.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "value" -> true
    else -> false
  }

internal fun Task.Output.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.type)
  add(this@getAllChildren.`value`)
}
