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

import dev.ohs.fhir.model.r4.SubstanceSourceMaterial
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun SubstanceSourceMaterial.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "meta" -> this.meta
    "implicitRules" -> this.implicitRules
    "language" -> this.language
    "text" -> this.text
    "contained" -> this.contained
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "sourceMaterialClass" -> this.sourceMaterialClass
    "sourceMaterialType" -> this.sourceMaterialType
    "sourceMaterialState" -> this.sourceMaterialState
    "organismId" -> this.organismId
    "organismName" -> this.organismName
    "parentSubstanceId" -> this.parentSubstanceId
    "parentSubstanceName" -> this.parentSubstanceName
    "countryOfOrigin" -> this.countryOfOrigin
    "geographicalLocation" -> this.geographicalLocation
    "developmentStage" -> this.developmentStage
    "fractionDescription" -> this.fractionDescription
    "organism" -> this.organism
    "partDescription" -> this.partDescription
    else -> error("$name is not a valid property name")
  }

internal fun SubstanceSourceMaterial.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "meta" -> true
    "implicitRules" -> true
    "language" -> true
    "text" -> true
    "contained" -> true
    "extension" -> true
    "modifierExtension" -> true
    "sourceMaterialClass" -> true
    "sourceMaterialType" -> true
    "sourceMaterialState" -> true
    "organismId" -> true
    "organismName" -> true
    "parentSubstanceId" -> true
    "parentSubstanceName" -> true
    "countryOfOrigin" -> true
    "geographicalLocation" -> true
    "developmentStage" -> true
    "fractionDescription" -> true
    "organism" -> true
    "partDescription" -> true
    else -> false
  }

internal fun SubstanceSourceMaterial.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.meta?.let { add(it) }
  this@getAllChildren.implicitRules?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.contained)
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.sourceMaterialClass?.let { add(it) }
  this@getAllChildren.sourceMaterialType?.let { add(it) }
  this@getAllChildren.sourceMaterialState?.let { add(it) }
  this@getAllChildren.organismId?.let { add(it) }
  this@getAllChildren.organismName?.let { add(it) }
  addAll(this@getAllChildren.parentSubstanceId)
  addAll(this@getAllChildren.parentSubstanceName)
  addAll(this@getAllChildren.countryOfOrigin)
  addAll(this@getAllChildren.geographicalLocation)
  this@getAllChildren.developmentStage?.let { add(it) }
  addAll(this@getAllChildren.fractionDescription)
  this@getAllChildren.organism?.let { add(it) }
  addAll(this@getAllChildren.partDescription)
}

internal fun SubstanceSourceMaterial.FractionDescription.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "fraction" -> this.fraction
    "materialType" -> this.materialType
    else -> error("$name is not a valid property name")
  }

internal fun SubstanceSourceMaterial.FractionDescription.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "fraction" -> true
    "materialType" -> true
    else -> false
  }

internal fun SubstanceSourceMaterial.FractionDescription.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.fraction?.let { add(it) }
  this@getAllChildren.materialType?.let { add(it) }
}

internal fun SubstanceSourceMaterial.Organism.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "family" -> this.family
    "genus" -> this.genus
    "species" -> this.species
    "intraspecificType" -> this.intraspecificType
    "intraspecificDescription" -> this.intraspecificDescription
    "author" -> this.author
    "hybrid" -> this.hybrid
    "organismGeneral" -> this.organismGeneral
    else -> error("$name is not a valid property name")
  }

internal fun SubstanceSourceMaterial.Organism.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "family" -> true
    "genus" -> true
    "species" -> true
    "intraspecificType" -> true
    "intraspecificDescription" -> true
    "author" -> true
    "hybrid" -> true
    "organismGeneral" -> true
    else -> false
  }

internal fun SubstanceSourceMaterial.Organism.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.family?.let { add(it) }
  this@getAllChildren.genus?.let { add(it) }
  this@getAllChildren.species?.let { add(it) }
  this@getAllChildren.intraspecificType?.let { add(it) }
  this@getAllChildren.intraspecificDescription?.let { add(it) }
  addAll(this@getAllChildren.author)
  this@getAllChildren.hybrid?.let { add(it) }
  this@getAllChildren.organismGeneral?.let { add(it) }
}

internal fun SubstanceSourceMaterial.Organism.Author.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "authorType" -> this.authorType
    "authorDescription" -> this.authorDescription
    else -> error("$name is not a valid property name")
  }

internal fun SubstanceSourceMaterial.Organism.Author.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "authorType" -> true
    "authorDescription" -> true
    else -> false
  }

internal fun SubstanceSourceMaterial.Organism.Author.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.authorType?.let { add(it) }
  this@getAllChildren.authorDescription?.let { add(it) }
}

internal fun SubstanceSourceMaterial.Organism.Hybrid.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "maternalOrganismId" -> this.maternalOrganismId
    "maternalOrganismName" -> this.maternalOrganismName
    "paternalOrganismId" -> this.paternalOrganismId
    "paternalOrganismName" -> this.paternalOrganismName
    "hybridType" -> this.hybridType
    else -> error("$name is not a valid property name")
  }

internal fun SubstanceSourceMaterial.Organism.Hybrid.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "maternalOrganismId" -> true
    "maternalOrganismName" -> true
    "paternalOrganismId" -> true
    "paternalOrganismName" -> true
    "hybridType" -> true
    else -> false
  }

internal fun SubstanceSourceMaterial.Organism.Hybrid.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.maternalOrganismId?.let { add(it) }
  this@getAllChildren.maternalOrganismName?.let { add(it) }
  this@getAllChildren.paternalOrganismId?.let { add(it) }
  this@getAllChildren.paternalOrganismName?.let { add(it) }
  this@getAllChildren.hybridType?.let { add(it) }
}

internal fun SubstanceSourceMaterial.Organism.OrganismGeneral.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "kingdom" -> this.kingdom
    "phylum" -> this.phylum
    "class" -> this.`class`
    "order" -> this.order
    else -> error("$name is not a valid property name")
  }

internal fun SubstanceSourceMaterial.Organism.OrganismGeneral.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "kingdom" -> true
    "phylum" -> true
    "class" -> true
    "order" -> true
    else -> false
  }

internal fun SubstanceSourceMaterial.Organism.OrganismGeneral.getAllChildren(): List<Any> =
  buildList {
    this@getAllChildren.id?.let { add(it) }
    addAll(this@getAllChildren.extension)
    addAll(this@getAllChildren.modifierExtension)
    this@getAllChildren.kingdom?.let { add(it) }
    this@getAllChildren.phylum?.let { add(it) }
    this@getAllChildren.`class`?.let { add(it) }
    this@getAllChildren.order?.let { add(it) }
  }

internal fun SubstanceSourceMaterial.PartDescription.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "part" -> this.part
    "partLocation" -> this.partLocation
    else -> error("$name is not a valid property name")
  }

internal fun SubstanceSourceMaterial.PartDescription.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "part" -> true
    "partLocation" -> true
    else -> false
  }

internal fun SubstanceSourceMaterial.PartDescription.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.part?.let { add(it) }
  this@getAllChildren.partLocation?.let { add(it) }
}
