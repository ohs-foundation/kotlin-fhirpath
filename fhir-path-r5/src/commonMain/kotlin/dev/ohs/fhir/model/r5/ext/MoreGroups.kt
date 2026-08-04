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

import dev.ohs.fhir.model.r5.Group
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun Group.getProperty(name: String): Any? =
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
    "active" -> this.active
    "type" -> this.type
    "membership" -> this.membership
    "code" -> this.code
    "name" -> this.name
    "description" -> this.description
    "quantity" -> this.quantity
    "managingEntity" -> this.managingEntity
    "characteristic" -> this.characteristic
    "member" -> this.member
    else -> error("$name is not a valid property name")
  }

internal fun Group.hasProperty(name: String): Boolean =
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
    "active" -> true
    "type" -> true
    "membership" -> true
    "code" -> true
    "name" -> true
    "description" -> true
    "quantity" -> true
    "managingEntity" -> true
    "characteristic" -> true
    "member" -> true
    else -> false
  }

internal fun Group.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.meta?.let { add(it) }
  this@getAllChildren.implicitRules?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.contained)
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.identifier)
  this@getAllChildren.active?.let { add(it) }
  add(this@getAllChildren.type)
  add(this@getAllChildren.membership)
  this@getAllChildren.code?.let { add(it) }
  this@getAllChildren.name?.let { add(it) }
  this@getAllChildren.description?.let { add(it) }
  this@getAllChildren.quantity?.let { add(it) }
  this@getAllChildren.managingEntity?.let { add(it) }
  addAll(this@getAllChildren.characteristic)
  addAll(this@getAllChildren.member)
}

internal fun Group.Characteristic.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "code" -> this.code
    "value" -> this.`value`
    "exclude" -> this.exclude
    "period" -> this.period
    else -> error("$name is not a valid property name")
  }

internal fun Group.Characteristic.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "code" -> true
    "value" -> true
    "exclude" -> true
    "period" -> true
    else -> false
  }

internal fun Group.Characteristic.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.code)
  add(this@getAllChildren.`value`)
  add(this@getAllChildren.exclude)
  this@getAllChildren.period?.let { add(it) }
}

internal fun Group.Member.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "entity" -> this.entity
    "period" -> this.period
    "inactive" -> this.inactive
    else -> error("$name is not a valid property name")
  }

internal fun Group.Member.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "entity" -> true
    "period" -> true
    "inactive" -> true
    else -> false
  }

internal fun Group.Member.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.entity)
  this@getAllChildren.period?.let { add(it) }
  this@getAllChildren.inactive?.let { add(it) }
}
