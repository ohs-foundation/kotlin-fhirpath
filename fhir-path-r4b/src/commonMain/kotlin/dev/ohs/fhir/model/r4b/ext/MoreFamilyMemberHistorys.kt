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

import dev.ohs.fhir.model.r4b.FamilyMemberHistory
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun FamilyMemberHistory.getProperty(name: String): Any? =
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
    "status" -> this.status
    "dataAbsentReason" -> this.dataAbsentReason
    "patient" -> this.patient
    "date" -> this.date
    "name" -> this.name
    "relationship" -> this.relationship
    "sex" -> this.sex
    "born" -> this.born
    "age" -> this.age
    "estimatedAge" -> this.estimatedAge
    "deceased" -> this.deceased
    "reasonCode" -> this.reasonCode
    "reasonReference" -> this.reasonReference
    "note" -> this.note
    "condition" -> this.condition
    else -> error("$name is not a valid property name")
  }

internal fun FamilyMemberHistory.hasProperty(name: String): Boolean =
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
    "status" -> true
    "dataAbsentReason" -> true
    "patient" -> true
    "date" -> true
    "name" -> true
    "relationship" -> true
    "sex" -> true
    "born" -> true
    "age" -> true
    "estimatedAge" -> true
    "deceased" -> true
    "reasonCode" -> true
    "reasonReference" -> true
    "note" -> true
    "condition" -> true
    else -> false
  }

internal fun FamilyMemberHistory.getAllChildren(): List<Any> = buildList {
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
  add(this@getAllChildren.status)
  this@getAllChildren.dataAbsentReason?.let { add(it) }
  add(this@getAllChildren.patient)
  this@getAllChildren.date?.let { add(it) }
  this@getAllChildren.name?.let { add(it) }
  add(this@getAllChildren.relationship)
  this@getAllChildren.sex?.let { add(it) }
  this@getAllChildren.born?.let { add(it) }
  this@getAllChildren.age?.let { add(it) }
  this@getAllChildren.estimatedAge?.let { add(it) }
  this@getAllChildren.deceased?.let { add(it) }
  addAll(this@getAllChildren.reasonCode)
  addAll(this@getAllChildren.reasonReference)
  addAll(this@getAllChildren.note)
  addAll(this@getAllChildren.condition)
}

internal fun FamilyMemberHistory.Condition.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "code" -> this.code
    "outcome" -> this.outcome
    "contributedToDeath" -> this.contributedToDeath
    "onset" -> this.onset
    "note" -> this.note
    else -> error("$name is not a valid property name")
  }

internal fun FamilyMemberHistory.Condition.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "code" -> true
    "outcome" -> true
    "contributedToDeath" -> true
    "onset" -> true
    "note" -> true
    else -> false
  }

internal fun FamilyMemberHistory.Condition.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.code)
  this@getAllChildren.outcome?.let { add(it) }
  this@getAllChildren.contributedToDeath?.let { add(it) }
  this@getAllChildren.onset?.let { add(it) }
  addAll(this@getAllChildren.note)
}
