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

import dev.ohs.fhir.model.r4.NutritionOrder
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun NutritionOrder.getProperty(name: String): Any? =
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
    "instantiates" -> this.instantiates
    "status" -> this.status
    "intent" -> this.intent
    "patient" -> this.patient
    "encounter" -> this.encounter
    "dateTime" -> this.dateTime
    "orderer" -> this.orderer
    "allergyIntolerance" -> this.allergyIntolerance
    "foodPreferenceModifier" -> this.foodPreferenceModifier
    "excludeFoodModifier" -> this.excludeFoodModifier
    "oralDiet" -> this.oralDiet
    "supplement" -> this.supplement
    "enteralFormula" -> this.enteralFormula
    "note" -> this.note
    else -> error("$name is not a valid property name")
  }

internal fun NutritionOrder.hasProperty(name: String): Boolean =
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
    "instantiates" -> true
    "status" -> true
    "intent" -> true
    "patient" -> true
    "encounter" -> true
    "dateTime" -> true
    "orderer" -> true
    "allergyIntolerance" -> true
    "foodPreferenceModifier" -> true
    "excludeFoodModifier" -> true
    "oralDiet" -> true
    "supplement" -> true
    "enteralFormula" -> true
    "note" -> true
    else -> false
  }

internal fun NutritionOrder.getAllChildren(): List<Any> = buildList {
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
  addAll(this@getAllChildren.instantiates)
  add(this@getAllChildren.status)
  add(this@getAllChildren.intent)
  add(this@getAllChildren.patient)
  this@getAllChildren.encounter?.let { add(it) }
  add(this@getAllChildren.dateTime)
  this@getAllChildren.orderer?.let { add(it) }
  addAll(this@getAllChildren.allergyIntolerance)
  addAll(this@getAllChildren.foodPreferenceModifier)
  addAll(this@getAllChildren.excludeFoodModifier)
  this@getAllChildren.oralDiet?.let { add(it) }
  addAll(this@getAllChildren.supplement)
  this@getAllChildren.enteralFormula?.let { add(it) }
  addAll(this@getAllChildren.note)
}

internal fun NutritionOrder.OralDiet.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "schedule" -> this.schedule
    "nutrient" -> this.nutrient
    "texture" -> this.texture
    "fluidConsistencyType" -> this.fluidConsistencyType
    "instruction" -> this.instruction
    else -> error("$name is not a valid property name")
  }

internal fun NutritionOrder.OralDiet.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "schedule" -> true
    "nutrient" -> true
    "texture" -> true
    "fluidConsistencyType" -> true
    "instruction" -> true
    else -> false
  }

internal fun NutritionOrder.OralDiet.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.type)
  addAll(this@getAllChildren.schedule)
  addAll(this@getAllChildren.nutrient)
  addAll(this@getAllChildren.texture)
  addAll(this@getAllChildren.fluidConsistencyType)
  this@getAllChildren.instruction?.let { add(it) }
}

internal fun NutritionOrder.OralDiet.Nutrient.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "modifier" -> this.modifier
    "amount" -> this.amount
    else -> error("$name is not a valid property name")
  }

internal fun NutritionOrder.OralDiet.Nutrient.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "modifier" -> true
    "amount" -> true
    else -> false
  }

internal fun NutritionOrder.OralDiet.Nutrient.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.modifier?.let { add(it) }
  this@getAllChildren.amount?.let { add(it) }
}

internal fun NutritionOrder.OralDiet.Texture.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "modifier" -> this.modifier
    "foodType" -> this.foodType
    else -> error("$name is not a valid property name")
  }

internal fun NutritionOrder.OralDiet.Texture.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "modifier" -> true
    "foodType" -> true
    else -> false
  }

internal fun NutritionOrder.OralDiet.Texture.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.modifier?.let { add(it) }
  this@getAllChildren.foodType?.let { add(it) }
}

internal fun NutritionOrder.Supplement.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "productName" -> this.productName
    "schedule" -> this.schedule
    "quantity" -> this.quantity
    "instruction" -> this.instruction
    else -> error("$name is not a valid property name")
  }

internal fun NutritionOrder.Supplement.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "productName" -> true
    "schedule" -> true
    "quantity" -> true
    "instruction" -> true
    else -> false
  }

internal fun NutritionOrder.Supplement.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.type?.let { add(it) }
  this@getAllChildren.productName?.let { add(it) }
  addAll(this@getAllChildren.schedule)
  this@getAllChildren.quantity?.let { add(it) }
  this@getAllChildren.instruction?.let { add(it) }
}

internal fun NutritionOrder.EnteralFormula.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "baseFormulaType" -> this.baseFormulaType
    "baseFormulaProductName" -> this.baseFormulaProductName
    "additiveType" -> this.additiveType
    "additiveProductName" -> this.additiveProductName
    "caloricDensity" -> this.caloricDensity
    "routeofAdministration" -> this.routeofAdministration
    "administration" -> this.administration
    "maxVolumeToDeliver" -> this.maxVolumeToDeliver
    "administrationInstruction" -> this.administrationInstruction
    else -> error("$name is not a valid property name")
  }

internal fun NutritionOrder.EnteralFormula.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "baseFormulaType" -> true
    "baseFormulaProductName" -> true
    "additiveType" -> true
    "additiveProductName" -> true
    "caloricDensity" -> true
    "routeofAdministration" -> true
    "administration" -> true
    "maxVolumeToDeliver" -> true
    "administrationInstruction" -> true
    else -> false
  }

internal fun NutritionOrder.EnteralFormula.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.baseFormulaType?.let { add(it) }
  this@getAllChildren.baseFormulaProductName?.let { add(it) }
  this@getAllChildren.additiveType?.let { add(it) }
  this@getAllChildren.additiveProductName?.let { add(it) }
  this@getAllChildren.caloricDensity?.let { add(it) }
  this@getAllChildren.routeofAdministration?.let { add(it) }
  addAll(this@getAllChildren.administration)
  this@getAllChildren.maxVolumeToDeliver?.let { add(it) }
  this@getAllChildren.administrationInstruction?.let { add(it) }
}

internal fun NutritionOrder.EnteralFormula.Administration.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "schedule" -> this.schedule
    "quantity" -> this.quantity
    "rate" -> this.rate
    else -> error("$name is not a valid property name")
  }

internal fun NutritionOrder.EnteralFormula.Administration.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "schedule" -> true
    "quantity" -> true
    "rate" -> true
    else -> false
  }

internal fun NutritionOrder.EnteralFormula.Administration.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.schedule?.let { add(it) }
  this@getAllChildren.quantity?.let { add(it) }
  this@getAllChildren.rate?.let { add(it) }
}
