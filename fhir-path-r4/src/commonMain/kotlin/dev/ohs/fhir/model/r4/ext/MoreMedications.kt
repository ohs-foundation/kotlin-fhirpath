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

import dev.ohs.fhir.model.r4.Medication
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun Medication.getProperty(name: String): Any? =
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
    "code" -> this.code
    "status" -> this.status
    "manufacturer" -> this.manufacturer
    "form" -> this.form
    "amount" -> this.amount
    "ingredient" -> this.ingredient
    "batch" -> this.batch
    else -> error("$name is not a valid property name")
  }

internal fun Medication.hasProperty(name: String): Boolean =
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
    "code" -> true
    "status" -> true
    "manufacturer" -> true
    "form" -> true
    "amount" -> true
    "ingredient" -> true
    "batch" -> true
    else -> false
  }

internal fun Medication.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.meta?.let { add(it) }
  this@getAllChildren.implicitRules?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.contained)
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.identifier)
  this@getAllChildren.code?.let { add(it) }
  this@getAllChildren.status?.let { add(it) }
  this@getAllChildren.manufacturer?.let { add(it) }
  this@getAllChildren.form?.let { add(it) }
  this@getAllChildren.amount?.let { add(it) }
  addAll(this@getAllChildren.ingredient)
  this@getAllChildren.batch?.let { add(it) }
}

internal fun Medication.Ingredient.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "item" -> this.item
    "isActive" -> this.isActive
    "strength" -> this.strength
    else -> error("$name is not a valid property name")
  }

internal fun Medication.Ingredient.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "item" -> true
    "isActive" -> true
    "strength" -> true
    else -> false
  }

internal fun Medication.Ingredient.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.item)
  this@getAllChildren.isActive?.let { add(it) }
  this@getAllChildren.strength?.let { add(it) }
}

internal fun Medication.Batch.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "lotNumber" -> this.lotNumber
    "expirationDate" -> this.expirationDate
    else -> error("$name is not a valid property name")
  }

internal fun Medication.Batch.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "lotNumber" -> true
    "expirationDate" -> true
    else -> false
  }

internal fun Medication.Batch.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.lotNumber?.let { add(it) }
  this@getAllChildren.expirationDate?.let { add(it) }
}
