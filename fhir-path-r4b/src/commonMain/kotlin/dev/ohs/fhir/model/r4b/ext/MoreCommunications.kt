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

import dev.ohs.fhir.model.r4b.Communication
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun Communication.getProperty(name: String): Any? =
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
    "partOf" -> this.partOf
    "inResponseTo" -> this.inResponseTo
    "status" -> this.status
    "statusReason" -> this.statusReason
    "category" -> this.category
    "priority" -> this.priority
    "medium" -> this.medium
    "subject" -> this.subject
    "topic" -> this.topic
    "about" -> this.about
    "encounter" -> this.encounter
    "sent" -> this.sent
    "received" -> this.received
    "recipient" -> this.recipient
    "sender" -> this.sender
    "reasonCode" -> this.reasonCode
    "reasonReference" -> this.reasonReference
    "payload" -> this.payload
    "note" -> this.note
    else -> error("$name is not a valid property name")
  }

internal fun Communication.hasProperty(name: String): Boolean =
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
    "partOf" -> true
    "inResponseTo" -> true
    "status" -> true
    "statusReason" -> true
    "category" -> true
    "priority" -> true
    "medium" -> true
    "subject" -> true
    "topic" -> true
    "about" -> true
    "encounter" -> true
    "sent" -> true
    "received" -> true
    "recipient" -> true
    "sender" -> true
    "reasonCode" -> true
    "reasonReference" -> true
    "payload" -> true
    "note" -> true
    else -> false
  }

internal fun Communication.getAllChildren(): List<Any> = buildList {
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
  addAll(this@getAllChildren.partOf)
  addAll(this@getAllChildren.inResponseTo)
  add(this@getAllChildren.status)
  this@getAllChildren.statusReason?.let { add(it) }
  addAll(this@getAllChildren.category)
  this@getAllChildren.priority?.let { add(it) }
  addAll(this@getAllChildren.medium)
  this@getAllChildren.subject?.let { add(it) }
  this@getAllChildren.topic?.let { add(it) }
  addAll(this@getAllChildren.about)
  this@getAllChildren.encounter?.let { add(it) }
  this@getAllChildren.sent?.let { add(it) }
  this@getAllChildren.received?.let { add(it) }
  addAll(this@getAllChildren.recipient)
  this@getAllChildren.sender?.let { add(it) }
  addAll(this@getAllChildren.reasonCode)
  addAll(this@getAllChildren.reasonReference)
  addAll(this@getAllChildren.payload)
  addAll(this@getAllChildren.note)
}

internal fun Communication.Payload.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "content" -> this.content
    else -> error("$name is not a valid property name")
  }

internal fun Communication.Payload.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "content" -> true
    else -> false
  }

internal fun Communication.Payload.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.content)
}
