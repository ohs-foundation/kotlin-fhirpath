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

import dev.ohs.fhir.model.r5.Person
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun Person.getProperty(name: String): Any? =
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
    "name" -> this.name
    "telecom" -> this.telecom
    "gender" -> this.gender
    "birthDate" -> this.birthDate
    "deceased" -> this.deceased
    "address" -> this.address
    "maritalStatus" -> this.maritalStatus
    "photo" -> this.photo
    "communication" -> this.communication
    "managingOrganization" -> this.managingOrganization
    "link" -> this.link
    else -> error("$name is not a valid property name")
  }

internal fun Person.hasProperty(name: String): Boolean =
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
    "name" -> true
    "telecom" -> true
    "gender" -> true
    "birthDate" -> true
    "deceased" -> true
    "address" -> true
    "maritalStatus" -> true
    "photo" -> true
    "communication" -> true
    "managingOrganization" -> true
    "link" -> true
    else -> false
  }

internal fun Person.getAllChildren(): List<Any> = buildList {
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
  addAll(this@getAllChildren.name)
  addAll(this@getAllChildren.telecom)
  this@getAllChildren.gender?.let { add(it) }
  this@getAllChildren.birthDate?.let { add(it) }
  this@getAllChildren.deceased?.let { add(it) }
  addAll(this@getAllChildren.address)
  this@getAllChildren.maritalStatus?.let { add(it) }
  addAll(this@getAllChildren.photo)
  addAll(this@getAllChildren.communication)
  this@getAllChildren.managingOrganization?.let { add(it) }
  addAll(this@getAllChildren.link)
}

internal fun Person.Communication.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "language" -> this.language
    "preferred" -> this.preferred
    else -> error("$name is not a valid property name")
  }

internal fun Person.Communication.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "language" -> true
    "preferred" -> true
    else -> false
  }

internal fun Person.Communication.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.language)
  this@getAllChildren.preferred?.let { add(it) }
}

internal fun Person.Link.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "target" -> this.target
    "assurance" -> this.assurance
    else -> error("$name is not a valid property name")
  }

internal fun Person.Link.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "target" -> true
    "assurance" -> true
    else -> false
  }

internal fun Person.Link.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.target)
  this@getAllChildren.assurance?.let { add(it) }
}
