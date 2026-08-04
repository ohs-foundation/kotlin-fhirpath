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

import dev.ohs.fhir.model.r5.NutritionIntake
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun NutritionIntake.getProperty(name: String): Any? =
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
    "basedOn" -> this.basedOn
    "partOf" -> this.partOf
    "status" -> this.status
    "statusReason" -> this.statusReason
    "code" -> this.code
    "subject" -> this.subject
    "encounter" -> this.encounter
    "occurrence" -> this.occurrence
    "recorded" -> this.recorded
    "reported" -> this.reported
    "consumedItem" -> this.consumedItem
    "ingredientLabel" -> this.ingredientLabel
    "performer" -> this.performer
    "location" -> this.location
    "derivedFrom" -> this.derivedFrom
    "reason" -> this.reason
    "note" -> this.note
    else -> error("$name is not a valid property name")
  }

internal fun NutritionIntake.hasProperty(name: String): Boolean =
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
    "basedOn" -> true
    "partOf" -> true
    "status" -> true
    "statusReason" -> true
    "code" -> true
    "subject" -> true
    "encounter" -> true
    "occurrence" -> true
    "recorded" -> true
    "reported" -> true
    "consumedItem" -> true
    "ingredientLabel" -> true
    "performer" -> true
    "location" -> true
    "derivedFrom" -> true
    "reason" -> true
    "note" -> true
    else -> false
  }

internal fun NutritionIntake.getAllChildren(): List<Any> = buildList {
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
  addAll(this@getAllChildren.basedOn)
  addAll(this@getAllChildren.partOf)
  add(this@getAllChildren.status)
  addAll(this@getAllChildren.statusReason)
  this@getAllChildren.code?.let { add(it) }
  add(this@getAllChildren.subject)
  this@getAllChildren.encounter?.let { add(it) }
  this@getAllChildren.occurrence?.let { add(it) }
  this@getAllChildren.recorded?.let { add(it) }
  this@getAllChildren.reported?.let { add(it) }
  addAll(this@getAllChildren.consumedItem)
  addAll(this@getAllChildren.ingredientLabel)
  addAll(this@getAllChildren.performer)
  this@getAllChildren.location?.let { add(it) }
  addAll(this@getAllChildren.derivedFrom)
  addAll(this@getAllChildren.reason)
  addAll(this@getAllChildren.note)
}

internal fun NutritionIntake.ConsumedItem.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "nutritionProduct" -> this.nutritionProduct
    "schedule" -> this.schedule
    "amount" -> this.amount
    "rate" -> this.rate
    "notConsumed" -> this.notConsumed
    "notConsumedReason" -> this.notConsumedReason
    else -> error("$name is not a valid property name")
  }

internal fun NutritionIntake.ConsumedItem.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "nutritionProduct" -> true
    "schedule" -> true
    "amount" -> true
    "rate" -> true
    "notConsumed" -> true
    "notConsumedReason" -> true
    else -> false
  }

internal fun NutritionIntake.ConsumedItem.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.type)
  add(this@getAllChildren.nutritionProduct)
  this@getAllChildren.schedule?.let { add(it) }
  this@getAllChildren.amount?.let { add(it) }
  this@getAllChildren.rate?.let { add(it) }
  this@getAllChildren.notConsumed?.let { add(it) }
  this@getAllChildren.notConsumedReason?.let { add(it) }
}

internal fun NutritionIntake.IngredientLabel.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "nutrient" -> this.nutrient
    "amount" -> this.amount
    else -> error("$name is not a valid property name")
  }

internal fun NutritionIntake.IngredientLabel.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "nutrient" -> true
    "amount" -> true
    else -> false
  }

internal fun NutritionIntake.IngredientLabel.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.nutrient)
  add(this@getAllChildren.amount)
}

internal fun NutritionIntake.Performer.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "function" -> this.function
    "actor" -> this.actor
    else -> error("$name is not a valid property name")
  }

internal fun NutritionIntake.Performer.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "function" -> true
    "actor" -> true
    else -> false
  }

internal fun NutritionIntake.Performer.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.function?.let { add(it) }
  add(this@getAllChildren.actor)
}
