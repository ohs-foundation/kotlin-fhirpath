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

import dev.ohs.fhir.model.r4.CommunicationRequest
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun CommunicationRequest.getProperty(name: String): Any? =
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
    "basedOn" -> this.basedOn
    "replaces" -> this.replaces
    "groupIdentifier" -> this.groupIdentifier
    "status" -> this.status
    "statusReason" -> this.statusReason
    "category" -> this.category
    "priority" -> this.priority
    "doNotPerform" -> this.doNotPerform
    "medium" -> this.medium
    "subject" -> this.subject
    "about" -> this.about
    "encounter" -> this.encounter
    "payload" -> this.payload
    "occurrence" -> this.occurrence
    "authoredOn" -> this.authoredOn
    "requester" -> this.requester
    "recipient" -> this.recipient
    "sender" -> this.sender
    "reasonCode" -> this.reasonCode
    "reasonReference" -> this.reasonReference
    "note" -> this.note
    else -> error("$name is not a valid property name")
  }

internal fun CommunicationRequest.hasProperty(name: String): Boolean =
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
    "basedOn" -> true
    "replaces" -> true
    "groupIdentifier" -> true
    "status" -> true
    "statusReason" -> true
    "category" -> true
    "priority" -> true
    "doNotPerform" -> true
    "medium" -> true
    "subject" -> true
    "about" -> true
    "encounter" -> true
    "payload" -> true
    "occurrence" -> true
    "authoredOn" -> true
    "requester" -> true
    "recipient" -> true
    "sender" -> true
    "reasonCode" -> true
    "reasonReference" -> true
    "note" -> true
    else -> false
  }

internal fun CommunicationRequest.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.meta?.let { add(it) }
  this@getAllChildren.implicitRules?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.contained)
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.identifier)
  addAll(this@getAllChildren.basedOn)
  addAll(this@getAllChildren.replaces)
  this@getAllChildren.groupIdentifier?.let { add(it) }
  add(this@getAllChildren.status)
  this@getAllChildren.statusReason?.let { add(it) }
  addAll(this@getAllChildren.category)
  this@getAllChildren.priority?.let { add(it) }
  this@getAllChildren.doNotPerform?.let { add(it) }
  addAll(this@getAllChildren.medium)
  this@getAllChildren.subject?.let { add(it) }
  addAll(this@getAllChildren.about)
  this@getAllChildren.encounter?.let { add(it) }
  addAll(this@getAllChildren.payload)
  this@getAllChildren.occurrence?.let { add(it) }
  this@getAllChildren.authoredOn?.let { add(it) }
  this@getAllChildren.requester?.let { add(it) }
  addAll(this@getAllChildren.recipient)
  this@getAllChildren.sender?.let { add(it) }
  addAll(this@getAllChildren.reasonCode)
  addAll(this@getAllChildren.reasonReference)
  addAll(this@getAllChildren.note)
}

internal fun CommunicationRequest.Payload.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "content" -> this.content
    else -> error("$name is not a valid property name")
  }

internal fun CommunicationRequest.Payload.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "content" -> true
    else -> false
  }

internal fun CommunicationRequest.Payload.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.content)
}
