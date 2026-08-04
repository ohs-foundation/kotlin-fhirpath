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

import dev.ohs.fhir.model.r5.BiologicallyDerivedProductDispense
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun BiologicallyDerivedProductDispense.getProperty(name: String): Any? =
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
    "basedOn" -> this.basedOn
    "partOf" -> this.partOf
    "status" -> this.status
    "originRelationshipType" -> this.originRelationshipType
    "product" -> this.product
    "patient" -> this.patient
    "matchStatus" -> this.matchStatus
    "performer" -> this.performer
    "location" -> this.location
    "quantity" -> this.quantity
    "preparedDate" -> this.preparedDate
    "whenHandedOver" -> this.whenHandedOver
    "destination" -> this.destination
    "note" -> this.note
    "usageInstruction" -> this.usageInstruction
    else -> error("$name is not a valid property name")
  }

internal fun BiologicallyDerivedProductDispense.hasProperty(name: String): Boolean =
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
    "basedOn" -> true
    "partOf" -> true
    "status" -> true
    "originRelationshipType" -> true
    "product" -> true
    "patient" -> true
    "matchStatus" -> true
    "performer" -> true
    "location" -> true
    "quantity" -> true
    "preparedDate" -> true
    "whenHandedOver" -> true
    "destination" -> true
    "note" -> true
    "usageInstruction" -> true
    else -> false
  }

internal fun BiologicallyDerivedProductDispense.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.meta?.let { add(it) }
  this@getAllChildren.implicitRules?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.contained)
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.identifier)
  addAll(this@getAllChildren.basedOn)
  addAll(this@getAllChildren.partOf)
  add(this@getAllChildren.status)
  this@getAllChildren.originRelationshipType?.let { add(it) }
  add(this@getAllChildren.product)
  add(this@getAllChildren.patient)
  this@getAllChildren.matchStatus?.let { add(it) }
  addAll(this@getAllChildren.performer)
  this@getAllChildren.location?.let { add(it) }
  this@getAllChildren.quantity?.let { add(it) }
  this@getAllChildren.preparedDate?.let { add(it) }
  this@getAllChildren.whenHandedOver?.let { add(it) }
  this@getAllChildren.destination?.let { add(it) }
  addAll(this@getAllChildren.note)
  this@getAllChildren.usageInstruction?.let { add(it) }
}

internal fun BiologicallyDerivedProductDispense.Performer.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "function" -> this.function
    "actor" -> this.actor
    else -> error("$name is not a valid property name")
  }

internal fun BiologicallyDerivedProductDispense.Performer.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "function" -> true
    "actor" -> true
    else -> false
  }

internal fun BiologicallyDerivedProductDispense.Performer.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.function?.let { add(it) }
  add(this@getAllChildren.actor)
}
