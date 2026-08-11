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

import dev.ohs.fhir.model.r4b.NutritionProduct
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun NutritionProduct.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "meta" -> this.meta
    "implicitRules" -> this.implicitRules
    "language" -> this.language
    "text" -> this.text
    "contained" -> this.contained
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "status" -> this.status
    "category" -> this.category
    "code" -> this.code
    "manufacturer" -> this.manufacturer
    "nutrient" -> this.nutrient
    "ingredient" -> this.ingredient
    "knownAllergen" -> this.knownAllergen
    "productCharacteristic" -> this.productCharacteristic
    "instance" -> this.instance
    "note" -> this.note
    else -> error("$name is not a valid property name")
  }

internal fun NutritionProduct.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "meta" -> true
    "implicitRules" -> true
    "language" -> true
    "text" -> true
    "contained" -> true
    "extension" -> true
    "modifierExtension" -> true
    "status" -> true
    "category" -> true
    "code" -> true
    "manufacturer" -> true
    "nutrient" -> true
    "ingredient" -> true
    "knownAllergen" -> true
    "productCharacteristic" -> true
    "instance" -> true
    "note" -> true
    else -> false
  }

internal fun NutritionProduct.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.meta?.let { add(it) }
  this@getAllChildren.implicitRules?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.contained)
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.status)
  addAll(this@getAllChildren.category)
  this@getAllChildren.code?.let { add(it) }
  addAll(this@getAllChildren.manufacturer)
  addAll(this@getAllChildren.nutrient)
  addAll(this@getAllChildren.ingredient)
  addAll(this@getAllChildren.knownAllergen)
  addAll(this@getAllChildren.productCharacteristic)
  this@getAllChildren.instance?.let { add(it) }
  addAll(this@getAllChildren.note)
}

internal fun NutritionProduct.Nutrient.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "item" -> this.item
    "amount" -> this.amount
    else -> error("$name is not a valid property name")
  }

internal fun NutritionProduct.Nutrient.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "item" -> true
    "amount" -> true
    else -> false
  }

internal fun NutritionProduct.Nutrient.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.item?.let { add(it) }
  addAll(this@getAllChildren.amount)
}

internal fun NutritionProduct.Ingredient.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "item" -> this.item
    "amount" -> this.amount
    else -> error("$name is not a valid property name")
  }

internal fun NutritionProduct.Ingredient.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "item" -> true
    "amount" -> true
    else -> false
  }

internal fun NutritionProduct.Ingredient.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.item)
  addAll(this@getAllChildren.amount)
}

internal fun NutritionProduct.ProductCharacteristic.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "value" -> this.`value`
    else -> error("$name is not a valid property name")
  }

internal fun NutritionProduct.ProductCharacteristic.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "value" -> true
    else -> false
  }

internal fun NutritionProduct.ProductCharacteristic.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.type)
  add(this@getAllChildren.`value`)
}

internal fun NutritionProduct.Instance.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "quantity" -> this.quantity
    "identifier" -> this.identifier
    "lotNumber" -> this.lotNumber
    "expiry" -> this.expiry
    "useBy" -> this.useBy
    else -> error("$name is not a valid property name")
  }

internal fun NutritionProduct.Instance.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "quantity" -> true
    "identifier" -> true
    "lotNumber" -> true
    "expiry" -> true
    "useBy" -> true
    else -> false
  }

internal fun NutritionProduct.Instance.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.quantity?.let { add(it) }
  addAll(this@getAllChildren.identifier)
  this@getAllChildren.lotNumber?.let { add(it) }
  this@getAllChildren.expiry?.let { add(it) }
  this@getAllChildren.useBy?.let { add(it) }
}
