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

import dev.ohs.fhir.model.r5.Practitioner
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun Practitioner.getProperty(name: String): Any? =
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
    "photo" -> this.photo
    "qualification" -> this.qualification
    "communication" -> this.communication
    else -> error("$name is not a valid property name")
  }

internal fun Practitioner.hasProperty(name: String): Boolean =
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
    "photo" -> true
    "qualification" -> true
    "communication" -> true
    else -> false
  }

internal fun Practitioner.getAllChildren(): List<Any> = buildList {
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
  addAll(this@getAllChildren.photo)
  addAll(this@getAllChildren.qualification)
  addAll(this@getAllChildren.communication)
}

internal fun Practitioner.Qualification.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "identifier" -> this.identifier
    "code" -> this.code
    "period" -> this.period
    "issuer" -> this.issuer
    else -> error("$name is not a valid property name")
  }

internal fun Practitioner.Qualification.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "identifier" -> true
    "code" -> true
    "period" -> true
    "issuer" -> true
    else -> false
  }

internal fun Practitioner.Qualification.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.identifier)
  add(this@getAllChildren.code)
  this@getAllChildren.period?.let { add(it) }
  this@getAllChildren.issuer?.let { add(it) }
}

internal fun Practitioner.Communication.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "language" -> this.language
    "preferred" -> this.preferred
    else -> error("$name is not a valid property name")
  }

internal fun Practitioner.Communication.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "language" -> true
    "preferred" -> true
    else -> false
  }

internal fun Practitioner.Communication.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.language)
  this@getAllChildren.preferred?.let { add(it) }
}
