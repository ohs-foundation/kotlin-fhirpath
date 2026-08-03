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

import dev.ohs.fhir.model.r4b.Patient
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun Patient.getProperty(name: String): Any? =
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
    "multipleBirth" -> this.multipleBirth
    "photo" -> this.photo
    "contact" -> this.contact
    "communication" -> this.communication
    "generalPractitioner" -> this.generalPractitioner
    "managingOrganization" -> this.managingOrganization
    "link" -> this.link
    else -> error("$name is not a valid property name")
  }

internal fun Patient.hasProperty(name: String): Boolean =
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
    "multipleBirth" -> true
    "photo" -> true
    "contact" -> true
    "communication" -> true
    "generalPractitioner" -> true
    "managingOrganization" -> true
    "link" -> true
    else -> false
  }

internal fun Patient.getAllChildren(): List<Any> = buildList {
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
  this@getAllChildren.multipleBirth?.let { add(it) }
  addAll(this@getAllChildren.photo)
  addAll(this@getAllChildren.contact)
  addAll(this@getAllChildren.communication)
  addAll(this@getAllChildren.generalPractitioner)
  this@getAllChildren.managingOrganization?.let { add(it) }
  addAll(this@getAllChildren.link)
}

internal fun Patient.Contact.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "relationship" -> this.relationship
    "name" -> this.name
    "telecom" -> this.telecom
    "address" -> this.address
    "gender" -> this.gender
    "organization" -> this.organization
    "period" -> this.period
    else -> error("$name is not a valid property name")
  }

internal fun Patient.Contact.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "relationship" -> true
    "name" -> true
    "telecom" -> true
    "address" -> true
    "gender" -> true
    "organization" -> true
    "period" -> true
    else -> false
  }

internal fun Patient.Contact.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.relationship)
  this@getAllChildren.name?.let { add(it) }
  addAll(this@getAllChildren.telecom)
  this@getAllChildren.address?.let { add(it) }
  this@getAllChildren.gender?.let { add(it) }
  this@getAllChildren.organization?.let { add(it) }
  this@getAllChildren.period?.let { add(it) }
}

internal fun Patient.Communication.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "language" -> this.language
    "preferred" -> this.preferred
    else -> error("$name is not a valid property name")
  }

internal fun Patient.Communication.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "language" -> true
    "preferred" -> true
    else -> false
  }

internal fun Patient.Communication.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.language)
  this@getAllChildren.preferred?.let { add(it) }
}

internal fun Patient.Link.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "other" -> this.other
    "type" -> this.type
    else -> error("$name is not a valid property name")
  }

internal fun Patient.Link.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "other" -> true
    "type" -> true
    else -> false
  }

internal fun Patient.Link.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.other)
  add(this@getAllChildren.type)
}
