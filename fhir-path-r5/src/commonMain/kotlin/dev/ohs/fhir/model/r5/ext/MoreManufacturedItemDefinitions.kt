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

import dev.ohs.fhir.model.r5.ManufacturedItemDefinition
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun ManufacturedItemDefinition.getProperty(name: String): Any? =
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
    "status" -> this.status
    "name" -> this.name
    "manufacturedDoseForm" -> this.manufacturedDoseForm
    "unitOfPresentation" -> this.unitOfPresentation
    "manufacturer" -> this.manufacturer
    "marketingStatus" -> this.marketingStatus
    "ingredient" -> this.ingredient
    "property" -> this.`property`
    "component" -> this.component
    else -> error("$name is not a valid property name")
  }

internal fun ManufacturedItemDefinition.hasProperty(name: String): Boolean =
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
    "status" -> true
    "name" -> true
    "manufacturedDoseForm" -> true
    "unitOfPresentation" -> true
    "manufacturer" -> true
    "marketingStatus" -> true
    "ingredient" -> true
    "property" -> true
    "component" -> true
    else -> false
  }

internal fun ManufacturedItemDefinition.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.meta?.let { add(it) }
  this@getAllChildren.implicitRules?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.contained)
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.identifier)
  add(this@getAllChildren.status)
  this@getAllChildren.name?.let { add(it) }
  add(this@getAllChildren.manufacturedDoseForm)
  this@getAllChildren.unitOfPresentation?.let { add(it) }
  addAll(this@getAllChildren.manufacturer)
  addAll(this@getAllChildren.marketingStatus)
  addAll(this@getAllChildren.ingredient)
  addAll(this@getAllChildren.`property`)
  addAll(this@getAllChildren.component)
}

internal fun ManufacturedItemDefinition.Property.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "value" -> this.`value`
    else -> error("$name is not a valid property name")
  }

internal fun ManufacturedItemDefinition.Property.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "value" -> true
    else -> false
  }

internal fun ManufacturedItemDefinition.Property.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.type)
  this@getAllChildren.`value`?.let { add(it) }
}

internal fun ManufacturedItemDefinition.Component.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "function" -> this.function
    "amount" -> this.amount
    "constituent" -> this.constituent
    "property" -> this.`property`
    "component" -> this.component
    else -> error("$name is not a valid property name")
  }

internal fun ManufacturedItemDefinition.Component.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "function" -> true
    "amount" -> true
    "constituent" -> true
    "property" -> true
    "component" -> true
    else -> false
  }

internal fun ManufacturedItemDefinition.Component.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.type)
  addAll(this@getAllChildren.function)
  addAll(this@getAllChildren.amount)
  addAll(this@getAllChildren.constituent)
  addAll(this@getAllChildren.`property`)
  addAll(this@getAllChildren.component)
}

internal fun ManufacturedItemDefinition.Component.Constituent.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "amount" -> this.amount
    "location" -> this.location
    "function" -> this.function
    "hasIngredient" -> this.hasIngredient
    else -> error("$name is not a valid property name")
  }

internal fun ManufacturedItemDefinition.Component.Constituent.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "amount" -> true
    "location" -> true
    "function" -> true
    "hasIngredient" -> true
    else -> false
  }

internal fun ManufacturedItemDefinition.Component.Constituent.getAllChildren(): List<Any> =
  buildList {
    this@getAllChildren.id?.let { add(it) }
    addAll(this@getAllChildren.extension)
    addAll(this@getAllChildren.modifierExtension)
    addAll(this@getAllChildren.amount)
    addAll(this@getAllChildren.location)
    addAll(this@getAllChildren.function)
    addAll(this@getAllChildren.hasIngredient)
  }
