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

import dev.ohs.fhir.model.r5.MessageHeader
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun MessageHeader.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "meta" -> this.meta
    "implicitRules" -> this.implicitRules
    "language" -> this.language
    "text" -> this.text
    "contained" -> this.contained
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "event" -> this.event
    "destination" -> this.destination
    "sender" -> this.sender
    "author" -> this.author
    "source" -> this.source
    "responsible" -> this.responsible
    "reason" -> this.reason
    "response" -> this.response
    "focus" -> this.focus
    "definition" -> this.definition
    else -> error("$name is not a valid property name")
  }

internal fun MessageHeader.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "meta" -> true
    "implicitRules" -> true
    "language" -> true
    "text" -> true
    "contained" -> true
    "extension" -> true
    "modifierExtension" -> true
    "event" -> true
    "destination" -> true
    "sender" -> true
    "author" -> true
    "source" -> true
    "responsible" -> true
    "reason" -> true
    "response" -> true
    "focus" -> true
    "definition" -> true
    else -> false
  }

internal fun MessageHeader.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.meta?.let { add(it) }
  this@getAllChildren.implicitRules?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.contained)
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.event)
  addAll(this@getAllChildren.destination)
  this@getAllChildren.sender?.let { add(it) }
  this@getAllChildren.author?.let { add(it) }
  add(this@getAllChildren.source)
  this@getAllChildren.responsible?.let { add(it) }
  this@getAllChildren.reason?.let { add(it) }
  this@getAllChildren.response?.let { add(it) }
  addAll(this@getAllChildren.focus)
  this@getAllChildren.definition?.let { add(it) }
}

internal fun MessageHeader.Destination.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "endpoint" -> this.endpoint
    "name" -> this.name
    "target" -> this.target
    "receiver" -> this.`receiver`
    else -> error("$name is not a valid property name")
  }

internal fun MessageHeader.Destination.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "endpoint" -> true
    "name" -> true
    "target" -> true
    "receiver" -> true
    else -> false
  }

internal fun MessageHeader.Destination.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.endpoint?.let { add(it) }
  this@getAllChildren.name?.let { add(it) }
  this@getAllChildren.target?.let { add(it) }
  this@getAllChildren.`receiver`?.let { add(it) }
}

internal fun MessageHeader.Source.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "endpoint" -> this.endpoint
    "name" -> this.name
    "software" -> this.software
    "version" -> this.version
    "contact" -> this.contact
    else -> error("$name is not a valid property name")
  }

internal fun MessageHeader.Source.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "endpoint" -> true
    "name" -> true
    "software" -> true
    "version" -> true
    "contact" -> true
    else -> false
  }

internal fun MessageHeader.Source.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.endpoint?.let { add(it) }
  this@getAllChildren.name?.let { add(it) }
  this@getAllChildren.software?.let { add(it) }
  this@getAllChildren.version?.let { add(it) }
  this@getAllChildren.contact?.let { add(it) }
}

internal fun MessageHeader.Response.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "identifier" -> this.identifier
    "code" -> this.code
    "details" -> this.details
    else -> error("$name is not a valid property name")
  }

internal fun MessageHeader.Response.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "identifier" -> true
    "code" -> true
    "details" -> true
    else -> false
  }

internal fun MessageHeader.Response.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.identifier)
  add(this@getAllChildren.code)
  this@getAllChildren.details?.let { add(it) }
}
