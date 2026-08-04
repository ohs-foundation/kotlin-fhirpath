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

import dev.ohs.fhir.model.r4b.MessageDefinition
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun MessageDefinition.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "meta" -> this.meta
    "implicitRules" -> this.implicitRules
    "language" -> this.language
    "text" -> this.text
    "contained" -> this.contained
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "url" -> this.url
    "identifier" -> this.identifier
    "version" -> this.version
    "name" -> this.name
    "title" -> this.title
    "replaces" -> this.replaces
    "status" -> this.status
    "experimental" -> this.experimental
    "date" -> this.date
    "publisher" -> this.publisher
    "contact" -> this.contact
    "description" -> this.description
    "useContext" -> this.useContext
    "jurisdiction" -> this.jurisdiction
    "purpose" -> this.purpose
    "copyright" -> this.copyright
    "base" -> this.base
    "parent" -> this.parent
    "event" -> this.event
    "category" -> this.category
    "focus" -> this.focus
    "responseRequired" -> this.responseRequired
    "allowedResponse" -> this.allowedResponse
    "graph" -> this.graph
    else -> error("$name is not a valid property name")
  }

internal fun MessageDefinition.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "meta" -> true
    "implicitRules" -> true
    "language" -> true
    "text" -> true
    "contained" -> true
    "extension" -> true
    "modifierExtension" -> true
    "url" -> true
    "identifier" -> true
    "version" -> true
    "name" -> true
    "title" -> true
    "replaces" -> true
    "status" -> true
    "experimental" -> true
    "date" -> true
    "publisher" -> true
    "contact" -> true
    "description" -> true
    "useContext" -> true
    "jurisdiction" -> true
    "purpose" -> true
    "copyright" -> true
    "base" -> true
    "parent" -> true
    "event" -> true
    "category" -> true
    "focus" -> true
    "responseRequired" -> true
    "allowedResponse" -> true
    "graph" -> true
    else -> false
  }

internal fun MessageDefinition.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.meta?.let { add(it) }
  this@getAllChildren.implicitRules?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.contained)
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.url?.let { add(it) }
  addAll(this@getAllChildren.identifier)
  this@getAllChildren.version?.let { add(it) }
  this@getAllChildren.name?.let { add(it) }
  this@getAllChildren.title?.let { add(it) }
  addAll(this@getAllChildren.replaces)
  add(this@getAllChildren.status)
  this@getAllChildren.experimental?.let { add(it) }
  add(this@getAllChildren.date)
  this@getAllChildren.publisher?.let { add(it) }
  addAll(this@getAllChildren.contact)
  this@getAllChildren.description?.let { add(it) }
  addAll(this@getAllChildren.useContext)
  addAll(this@getAllChildren.jurisdiction)
  this@getAllChildren.purpose?.let { add(it) }
  this@getAllChildren.copyright?.let { add(it) }
  this@getAllChildren.base?.let { add(it) }
  addAll(this@getAllChildren.parent)
  add(this@getAllChildren.event)
  this@getAllChildren.category?.let { add(it) }
  addAll(this@getAllChildren.focus)
  this@getAllChildren.responseRequired?.let { add(it) }
  addAll(this@getAllChildren.allowedResponse)
  addAll(this@getAllChildren.graph)
}

internal fun MessageDefinition.Focus.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "code" -> this.code
    "profile" -> this.profile
    "min" -> this.min
    "max" -> this.max
    else -> error("$name is not a valid property name")
  }

internal fun MessageDefinition.Focus.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "code" -> true
    "profile" -> true
    "min" -> true
    "max" -> true
    else -> false
  }

internal fun MessageDefinition.Focus.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.code)
  this@getAllChildren.profile?.let { add(it) }
  add(this@getAllChildren.min)
  this@getAllChildren.max?.let { add(it) }
}

internal fun MessageDefinition.AllowedResponse.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "message" -> this.message
    "situation" -> this.situation
    else -> error("$name is not a valid property name")
  }

internal fun MessageDefinition.AllowedResponse.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "message" -> true
    "situation" -> true
    else -> false
  }

internal fun MessageDefinition.AllowedResponse.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.message)
  this@getAllChildren.situation?.let { add(it) }
}
