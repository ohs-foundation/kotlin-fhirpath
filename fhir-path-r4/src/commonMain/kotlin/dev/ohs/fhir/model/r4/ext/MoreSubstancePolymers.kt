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

import dev.ohs.fhir.model.r4.SubstancePolymer
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun SubstancePolymer.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "meta" -> this.meta
    "implicitRules" -> this.implicitRules
    "language" -> this.language
    "text" -> this.text
    "contained" -> this.contained
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "class" -> this.`class`
    "geometry" -> this.geometry
    "copolymerConnectivity" -> this.copolymerConnectivity
    "modification" -> this.modification
    "monomerSet" -> this.monomerSet
    "repeat" -> this.repeat
    else -> error("$name is not a valid property name")
  }

internal fun SubstancePolymer.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "meta" -> true
    "implicitRules" -> true
    "language" -> true
    "text" -> true
    "contained" -> true
    "extension" -> true
    "modifierExtension" -> true
    "class" -> true
    "geometry" -> true
    "copolymerConnectivity" -> true
    "modification" -> true
    "monomerSet" -> true
    "repeat" -> true
    else -> false
  }

internal fun SubstancePolymer.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.meta?.let { add(it) }
  this@getAllChildren.implicitRules?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.contained)
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.`class`?.let { add(it) }
  this@getAllChildren.geometry?.let { add(it) }
  addAll(this@getAllChildren.copolymerConnectivity)
  addAll(this@getAllChildren.modification)
  addAll(this@getAllChildren.monomerSet)
  addAll(this@getAllChildren.repeat)
}

internal fun SubstancePolymer.MonomerSet.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "ratioType" -> this.ratioType
    "startingMaterial" -> this.startingMaterial
    else -> error("$name is not a valid property name")
  }

internal fun SubstancePolymer.MonomerSet.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "ratioType" -> true
    "startingMaterial" -> true
    else -> false
  }

internal fun SubstancePolymer.MonomerSet.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.ratioType?.let { add(it) }
  addAll(this@getAllChildren.startingMaterial)
}

internal fun SubstancePolymer.MonomerSet.StartingMaterial.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "material" -> this.material
    "type" -> this.type
    "isDefining" -> this.isDefining
    "amount" -> this.amount
    else -> error("$name is not a valid property name")
  }

internal fun SubstancePolymer.MonomerSet.StartingMaterial.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "material" -> true
    "type" -> true
    "isDefining" -> true
    "amount" -> true
    else -> false
  }

internal fun SubstancePolymer.MonomerSet.StartingMaterial.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.material?.let { add(it) }
  this@getAllChildren.type?.let { add(it) }
  this@getAllChildren.isDefining?.let { add(it) }
  this@getAllChildren.amount?.let { add(it) }
}

internal fun SubstancePolymer.Repeat.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "numberOfUnits" -> this.numberOfUnits
    "averageMolecularFormula" -> this.averageMolecularFormula
    "repeatUnitAmountType" -> this.repeatUnitAmountType
    "repeatUnit" -> this.repeatUnit
    else -> error("$name is not a valid property name")
  }

internal fun SubstancePolymer.Repeat.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "numberOfUnits" -> true
    "averageMolecularFormula" -> true
    "repeatUnitAmountType" -> true
    "repeatUnit" -> true
    else -> false
  }

internal fun SubstancePolymer.Repeat.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.numberOfUnits?.let { add(it) }
  this@getAllChildren.averageMolecularFormula?.let { add(it) }
  this@getAllChildren.repeatUnitAmountType?.let { add(it) }
  addAll(this@getAllChildren.repeatUnit)
}

internal fun SubstancePolymer.Repeat.RepeatUnit.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "orientationOfPolymerisation" -> this.orientationOfPolymerisation
    "repeatUnit" -> this.repeatUnit
    "amount" -> this.amount
    "degreeOfPolymerisation" -> this.degreeOfPolymerisation
    "structuralRepresentation" -> this.structuralRepresentation
    else -> error("$name is not a valid property name")
  }

internal fun SubstancePolymer.Repeat.RepeatUnit.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "orientationOfPolymerisation" -> true
    "repeatUnit" -> true
    "amount" -> true
    "degreeOfPolymerisation" -> true
    "structuralRepresentation" -> true
    else -> false
  }

internal fun SubstancePolymer.Repeat.RepeatUnit.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.orientationOfPolymerisation?.let { add(it) }
  this@getAllChildren.repeatUnit?.let { add(it) }
  this@getAllChildren.amount?.let { add(it) }
  addAll(this@getAllChildren.degreeOfPolymerisation)
  addAll(this@getAllChildren.structuralRepresentation)
}

internal fun SubstancePolymer.Repeat.RepeatUnit.DegreeOfPolymerisation.getProperty(
  name: String
): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "degree" -> this.degree
    "amount" -> this.amount
    else -> error("$name is not a valid property name")
  }

internal fun SubstancePolymer.Repeat.RepeatUnit.DegreeOfPolymerisation.hasProperty(
  name: String
): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "degree" -> true
    "amount" -> true
    else -> false
  }

internal fun SubstancePolymer.Repeat.RepeatUnit.DegreeOfPolymerisation.getAllChildren(): List<Any> =
  buildList {
    this@getAllChildren.id?.let { add(it) }
    addAll(this@getAllChildren.extension)
    addAll(this@getAllChildren.modifierExtension)
    this@getAllChildren.degree?.let { add(it) }
    this@getAllChildren.amount?.let { add(it) }
  }

internal fun SubstancePolymer.Repeat.RepeatUnit.StructuralRepresentation.getProperty(
  name: String
): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "representation" -> this.representation
    "attachment" -> this.attachment
    else -> error("$name is not a valid property name")
  }

internal fun SubstancePolymer.Repeat.RepeatUnit.StructuralRepresentation.hasProperty(
  name: String
): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "representation" -> true
    "attachment" -> true
    else -> false
  }

internal fun SubstancePolymer.Repeat.RepeatUnit.StructuralRepresentation.getAllChildren():
  List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.type?.let { add(it) }
  this@getAllChildren.representation?.let { add(it) }
  this@getAllChildren.attachment?.let { add(it) }
}
