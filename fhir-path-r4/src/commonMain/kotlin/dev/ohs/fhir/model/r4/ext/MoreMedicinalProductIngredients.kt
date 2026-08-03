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

import dev.ohs.fhir.model.r4.MedicinalProductIngredient
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun MedicinalProductIngredient.getProperty(name: String): Any? =
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
    "role" -> this.role
    "allergenicIndicator" -> this.allergenicIndicator
    "manufacturer" -> this.manufacturer
    "specifiedSubstance" -> this.specifiedSubstance
    "substance" -> this.substance
    else -> error("$name is not a valid property name")
  }

internal fun MedicinalProductIngredient.hasProperty(name: String): Boolean =
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
    "role" -> true
    "allergenicIndicator" -> true
    "manufacturer" -> true
    "specifiedSubstance" -> true
    "substance" -> true
    else -> false
  }

internal fun MedicinalProductIngredient.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.meta?.let { add(it) }
  this@getAllChildren.implicitRules?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.contained)
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.identifier?.let { add(it) }
  add(this@getAllChildren.role)
  this@getAllChildren.allergenicIndicator?.let { add(it) }
  addAll(this@getAllChildren.manufacturer)
  addAll(this@getAllChildren.specifiedSubstance)
  this@getAllChildren.substance?.let { add(it) }
}

internal fun MedicinalProductIngredient.SpecifiedSubstance.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "code" -> this.code
    "group" -> this.group
    "confidentiality" -> this.confidentiality
    "strength" -> this.strength
    else -> error("$name is not a valid property name")
  }

internal fun MedicinalProductIngredient.SpecifiedSubstance.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "code" -> true
    "group" -> true
    "confidentiality" -> true
    "strength" -> true
    else -> false
  }

internal fun MedicinalProductIngredient.SpecifiedSubstance.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.code)
  add(this@getAllChildren.group)
  this@getAllChildren.confidentiality?.let { add(it) }
  addAll(this@getAllChildren.strength)
}

internal fun MedicinalProductIngredient.SpecifiedSubstance.Strength.getProperty(
  name: String
): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "presentation" -> this.presentation
    "presentationLowLimit" -> this.presentationLowLimit
    "concentration" -> this.concentration
    "concentrationLowLimit" -> this.concentrationLowLimit
    "measurementPoint" -> this.measurementPoint
    "country" -> this.country
    "referenceStrength" -> this.referenceStrength
    else -> error("$name is not a valid property name")
  }

internal fun MedicinalProductIngredient.SpecifiedSubstance.Strength.hasProperty(
  name: String
): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "presentation" -> true
    "presentationLowLimit" -> true
    "concentration" -> true
    "concentrationLowLimit" -> true
    "measurementPoint" -> true
    "country" -> true
    "referenceStrength" -> true
    else -> false
  }

internal fun MedicinalProductIngredient.SpecifiedSubstance.Strength.getAllChildren(): List<Any> =
  buildList {
    this@getAllChildren.id?.let { add(it) }
    addAll(this@getAllChildren.extension)
    addAll(this@getAllChildren.modifierExtension)
    add(this@getAllChildren.presentation)
    this@getAllChildren.presentationLowLimit?.let { add(it) }
    this@getAllChildren.concentration?.let { add(it) }
    this@getAllChildren.concentrationLowLimit?.let { add(it) }
    this@getAllChildren.measurementPoint?.let { add(it) }
    addAll(this@getAllChildren.country)
    addAll(this@getAllChildren.referenceStrength)
  }

internal fun MedicinalProductIngredient.SpecifiedSubstance.Strength.ReferenceStrength.getProperty(
  name: String
): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "substance" -> this.substance
    "strength" -> this.strength
    "strengthLowLimit" -> this.strengthLowLimit
    "measurementPoint" -> this.measurementPoint
    "country" -> this.country
    else -> error("$name is not a valid property name")
  }

internal fun MedicinalProductIngredient.SpecifiedSubstance.Strength.ReferenceStrength.hasProperty(
  name: String
): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "substance" -> true
    "strength" -> true
    "strengthLowLimit" -> true
    "measurementPoint" -> true
    "country" -> true
    else -> false
  }

internal fun MedicinalProductIngredient.SpecifiedSubstance.Strength.ReferenceStrength
  .getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.substance?.let { add(it) }
  add(this@getAllChildren.strength)
  this@getAllChildren.strengthLowLimit?.let { add(it) }
  this@getAllChildren.measurementPoint?.let { add(it) }
  addAll(this@getAllChildren.country)
}

internal fun MedicinalProductIngredient.Substance.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "code" -> this.code
    "strength" -> this.strength
    else -> error("$name is not a valid property name")
  }

internal fun MedicinalProductIngredient.Substance.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "code" -> true
    "strength" -> true
    else -> false
  }

internal fun MedicinalProductIngredient.Substance.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.code)
  addAll(this@getAllChildren.strength)
}
