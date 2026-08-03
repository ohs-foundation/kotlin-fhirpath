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

import dev.ohs.fhir.model.r5.Ingredient
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun Ingredient.getProperty(name: String): Any? =
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
    "for" -> this.`for`
    "role" -> this.role
    "function" -> this.function
    "group" -> this.group
    "allergenicIndicator" -> this.allergenicIndicator
    "comment" -> this.comment
    "manufacturer" -> this.manufacturer
    "substance" -> this.substance
    else -> error("$name is not a valid property name")
  }

internal fun Ingredient.hasProperty(name: String): Boolean =
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
    "for" -> true
    "role" -> true
    "function" -> true
    "group" -> true
    "allergenicIndicator" -> true
    "comment" -> true
    "manufacturer" -> true
    "substance" -> true
    else -> false
  }

internal fun Ingredient.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.meta?.let { add(it) }
  this@getAllChildren.implicitRules?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.contained)
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.identifier?.let { add(it) }
  add(this@getAllChildren.status)
  addAll(this@getAllChildren.`for`)
  add(this@getAllChildren.role)
  addAll(this@getAllChildren.function)
  this@getAllChildren.group?.let { add(it) }
  this@getAllChildren.allergenicIndicator?.let { add(it) }
  this@getAllChildren.comment?.let { add(it) }
  addAll(this@getAllChildren.manufacturer)
  add(this@getAllChildren.substance)
}

internal fun Ingredient.Manufacturer.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "role" -> this.role
    "manufacturer" -> this.manufacturer
    else -> error("$name is not a valid property name")
  }

internal fun Ingredient.Manufacturer.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "role" -> true
    "manufacturer" -> true
    else -> false
  }

internal fun Ingredient.Manufacturer.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.role?.let { add(it) }
  add(this@getAllChildren.manufacturer)
}

internal fun Ingredient.Substance.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "code" -> this.code
    "strength" -> this.strength
    else -> error("$name is not a valid property name")
  }

internal fun Ingredient.Substance.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "code" -> true
    "strength" -> true
    else -> false
  }

internal fun Ingredient.Substance.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.code)
  addAll(this@getAllChildren.strength)
}

internal fun Ingredient.Substance.Strength.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "presentation" -> this.presentation
    "textPresentation" -> this.textPresentation
    "concentration" -> this.concentration
    "textConcentration" -> this.textConcentration
    "basis" -> this.basis
    "measurementPoint" -> this.measurementPoint
    "country" -> this.country
    "referenceStrength" -> this.referenceStrength
    else -> error("$name is not a valid property name")
  }

internal fun Ingredient.Substance.Strength.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "presentation" -> true
    "textPresentation" -> true
    "concentration" -> true
    "textConcentration" -> true
    "basis" -> true
    "measurementPoint" -> true
    "country" -> true
    "referenceStrength" -> true
    else -> false
  }

internal fun Ingredient.Substance.Strength.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.presentation?.let { add(it) }
  this@getAllChildren.textPresentation?.let { add(it) }
  this@getAllChildren.concentration?.let { add(it) }
  this@getAllChildren.textConcentration?.let { add(it) }
  this@getAllChildren.basis?.let { add(it) }
  this@getAllChildren.measurementPoint?.let { add(it) }
  addAll(this@getAllChildren.country)
  addAll(this@getAllChildren.referenceStrength)
}

internal fun Ingredient.Substance.Strength.ReferenceStrength.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "substance" -> this.substance
    "strength" -> this.strength
    "measurementPoint" -> this.measurementPoint
    "country" -> this.country
    else -> error("$name is not a valid property name")
  }

internal fun Ingredient.Substance.Strength.ReferenceStrength.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "substance" -> true
    "strength" -> true
    "measurementPoint" -> true
    "country" -> true
    else -> false
  }

internal fun Ingredient.Substance.Strength.ReferenceStrength.getAllChildren(): List<Any> =
  buildList {
    this@getAllChildren.id?.let { add(it) }
    addAll(this@getAllChildren.extension)
    addAll(this@getAllChildren.modifierExtension)
    add(this@getAllChildren.substance)
    add(this@getAllChildren.strength)
    this@getAllChildren.measurementPoint?.let { add(it) }
    addAll(this@getAllChildren.country)
  }
