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

import dev.ohs.fhir.model.r5.RelatedPerson
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun RelatedPerson.getProperty(name: String): Any? =
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
    "patient" -> this.patient
    "relationship" -> this.relationship
    "name" -> this.name
    "telecom" -> this.telecom
    "gender" -> this.gender
    "birthDate" -> this.birthDate
    "address" -> this.address
    "photo" -> this.photo
    "period" -> this.period
    "communication" -> this.communication
    else -> error("$name is not a valid property name")
  }

internal fun RelatedPerson.hasProperty(name: String): Boolean =
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
    "patient" -> true
    "relationship" -> true
    "name" -> true
    "telecom" -> true
    "gender" -> true
    "birthDate" -> true
    "address" -> true
    "photo" -> true
    "period" -> true
    "communication" -> true
    else -> false
  }

internal fun RelatedPerson.getAllChildren(): List<Any> = buildList {
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
  add(this@getAllChildren.patient)
  addAll(this@getAllChildren.relationship)
  addAll(this@getAllChildren.name)
  addAll(this@getAllChildren.telecom)
  this@getAllChildren.gender?.let { add(it) }
  this@getAllChildren.birthDate?.let { add(it) }
  addAll(this@getAllChildren.address)
  addAll(this@getAllChildren.photo)
  this@getAllChildren.period?.let { add(it) }
  addAll(this@getAllChildren.communication)
}

internal fun RelatedPerson.Communication.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "language" -> this.language
    "preferred" -> this.preferred
    else -> error("$name is not a valid property name")
  }

internal fun RelatedPerson.Communication.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "language" -> true
    "preferred" -> true
    else -> false
  }

internal fun RelatedPerson.Communication.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.language)
  this@getAllChildren.preferred?.let { add(it) }
}
