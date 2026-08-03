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

import dev.ohs.fhir.model.r4.NamingSystem
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun NamingSystem.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "meta" -> this.meta
    "implicitRules" -> this.implicitRules
    "language" -> this.language
    "text" -> this.text
    "contained" -> this.contained
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "name" -> this.name
    "status" -> this.status
    "kind" -> this.kind
    "date" -> this.date
    "publisher" -> this.publisher
    "contact" -> this.contact
    "responsible" -> this.responsible
    "type" -> this.type
    "description" -> this.description
    "useContext" -> this.useContext
    "jurisdiction" -> this.jurisdiction
    "usage" -> this.usage
    "uniqueId" -> this.uniqueId
    else -> error("$name is not a valid property name")
  }

internal fun NamingSystem.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "meta" -> true
    "implicitRules" -> true
    "language" -> true
    "text" -> true
    "contained" -> true
    "extension" -> true
    "modifierExtension" -> true
    "name" -> true
    "status" -> true
    "kind" -> true
    "date" -> true
    "publisher" -> true
    "contact" -> true
    "responsible" -> true
    "type" -> true
    "description" -> true
    "useContext" -> true
    "jurisdiction" -> true
    "usage" -> true
    "uniqueId" -> true
    else -> false
  }

internal fun NamingSystem.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.meta?.let { add(it) }
  this@getAllChildren.implicitRules?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.contained)
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.name)
  add(this@getAllChildren.status)
  add(this@getAllChildren.kind)
  add(this@getAllChildren.date)
  this@getAllChildren.publisher?.let { add(it) }
  addAll(this@getAllChildren.contact)
  this@getAllChildren.responsible?.let { add(it) }
  this@getAllChildren.type?.let { add(it) }
  this@getAllChildren.description?.let { add(it) }
  addAll(this@getAllChildren.useContext)
  addAll(this@getAllChildren.jurisdiction)
  this@getAllChildren.usage?.let { add(it) }
  addAll(this@getAllChildren.uniqueId)
}

internal fun NamingSystem.UniqueId.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "value" -> this.`value`
    "preferred" -> this.preferred
    "comment" -> this.comment
    "period" -> this.period
    else -> error("$name is not a valid property name")
  }

internal fun NamingSystem.UniqueId.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "value" -> true
    "preferred" -> true
    "comment" -> true
    "period" -> true
    else -> false
  }

internal fun NamingSystem.UniqueId.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.type)
  add(this@getAllChildren.`value`)
  this@getAllChildren.preferred?.let { add(it) }
  this@getAllChildren.comment?.let { add(it) }
  this@getAllChildren.period?.let { add(it) }
}
