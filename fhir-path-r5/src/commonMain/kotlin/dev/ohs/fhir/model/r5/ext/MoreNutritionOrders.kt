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

import dev.ohs.fhir.model.r5.NutritionOrder
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
    "basedOn" -> this.basedOn
    "groupIdentifier" -> this.groupIdentifier
    "status" -> this.status
    "intent" -> this.intent
    "priority" -> this.priority
    "subject" -> this.subject
    "encounter" -> this.encounter
    "supportingInformation" -> this.supportingInformation
    "dateTime" -> this.dateTime
    "orderer" -> this.orderer
    "performer" -> this.performer
    "allergyIntolerance" -> this.allergyIntolerance
    "foodPreferenceModifier" -> this.foodPreferenceModifier
    "excludeFoodModifier" -> this.excludeFoodModifier
    "outsideFoodAllowed" -> this.outsideFoodAllowed
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
    "basedOn" -> true
    "groupIdentifier" -> true
    "status" -> true
    "intent" -> true
    "priority" -> true
    "subject" -> true
    "encounter" -> true
    "supportingInformation" -> true
    "dateTime" -> true
    "orderer" -> true
    "performer" -> true
    "allergyIntolerance" -> true
    "foodPreferenceModifier" -> true
    "excludeFoodModifier" -> true
    "outsideFoodAllowed" -> true
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
  addAll(this@getAllChildren.basedOn)
  this@getAllChildren.groupIdentifier?.let { add(it) }
  add(this@getAllChildren.status)
  add(this@getAllChildren.intent)
  this@getAllChildren.priority?.let { add(it) }
  add(this@getAllChildren.subject)
  this@getAllChildren.encounter?.let { add(it) }
  addAll(this@getAllChildren.supportingInformation)
  add(this@getAllChildren.dateTime)
  this@getAllChildren.orderer?.let { add(it) }
  addAll(this@getAllChildren.performer)
  addAll(this@getAllChildren.allergyIntolerance)
  addAll(this@getAllChildren.foodPreferenceModifier)
  addAll(this@getAllChildren.excludeFoodModifier)
  this@getAllChildren.outsideFoodAllowed?.let { add(it) }
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
  this@getAllChildren.schedule?.let { add(it) }
  addAll(this@getAllChildren.nutrient)
  addAll(this@getAllChildren.texture)
  addAll(this@getAllChildren.fluidConsistencyType)
  this@getAllChildren.instruction?.let { add(it) }
}

internal fun NutritionOrder.OralDiet.Schedule.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "timing" -> this.timing
    "asNeeded" -> this.asNeeded
    "asNeededFor" -> this.asNeededFor
    else -> error("$name is not a valid property name")
  }

internal fun NutritionOrder.OralDiet.Schedule.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "timing" -> true
    "asNeeded" -> true
    "asNeededFor" -> true
    else -> false
  }

internal fun NutritionOrder.OralDiet.Schedule.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.timing)
  this@getAllChildren.asNeeded?.let { add(it) }
  this@getAllChildren.asNeededFor?.let { add(it) }
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
  this@getAllChildren.schedule?.let { add(it) }
  this@getAllChildren.quantity?.let { add(it) }
  this@getAllChildren.instruction?.let { add(it) }
}

internal fun NutritionOrder.Supplement.Schedule.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "timing" -> this.timing
    "asNeeded" -> this.asNeeded
    "asNeededFor" -> this.asNeededFor
    else -> error("$name is not a valid property name")
  }

internal fun NutritionOrder.Supplement.Schedule.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "timing" -> true
    "asNeeded" -> true
    "asNeededFor" -> true
    else -> false
  }

internal fun NutritionOrder.Supplement.Schedule.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.timing)
  this@getAllChildren.asNeeded?.let { add(it) }
  this@getAllChildren.asNeededFor?.let { add(it) }
}

internal fun NutritionOrder.EnteralFormula.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "baseFormulaType" -> this.baseFormulaType
    "baseFormulaProductName" -> this.baseFormulaProductName
    "deliveryDevice" -> this.deliveryDevice
    "additive" -> this.additive
    "caloricDensity" -> this.caloricDensity
    "routeOfAdministration" -> this.routeOfAdministration
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
    "deliveryDevice" -> true
    "additive" -> true
    "caloricDensity" -> true
    "routeOfAdministration" -> true
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
  addAll(this@getAllChildren.deliveryDevice)
  addAll(this@getAllChildren.additive)
  this@getAllChildren.caloricDensity?.let { add(it) }
  this@getAllChildren.routeOfAdministration?.let { add(it) }
  addAll(this@getAllChildren.administration)
  this@getAllChildren.maxVolumeToDeliver?.let { add(it) }
  this@getAllChildren.administrationInstruction?.let { add(it) }
}

internal fun NutritionOrder.EnteralFormula.Additive.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "productName" -> this.productName
    "quantity" -> this.quantity
    else -> error("$name is not a valid property name")
  }

internal fun NutritionOrder.EnteralFormula.Additive.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "productName" -> true
    "quantity" -> true
    else -> false
  }

internal fun NutritionOrder.EnteralFormula.Additive.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.type?.let { add(it) }
  this@getAllChildren.productName?.let { add(it) }
  this@getAllChildren.quantity?.let { add(it) }
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

internal fun NutritionOrder.EnteralFormula.Administration.Schedule.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "timing" -> this.timing
    "asNeeded" -> this.asNeeded
    "asNeededFor" -> this.asNeededFor
    else -> error("$name is not a valid property name")
  }

internal fun NutritionOrder.EnteralFormula.Administration.Schedule.hasProperty(
  name: String
): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "timing" -> true
    "asNeeded" -> true
    "asNeededFor" -> true
    else -> false
  }

internal fun NutritionOrder.EnteralFormula.Administration.Schedule.getAllChildren(): List<Any> =
  buildList {
    this@getAllChildren.id?.let { add(it) }
    addAll(this@getAllChildren.extension)
    addAll(this@getAllChildren.modifierExtension)
    addAll(this@getAllChildren.timing)
    this@getAllChildren.asNeeded?.let { add(it) }
    this@getAllChildren.asNeededFor?.let { add(it) }
  }
