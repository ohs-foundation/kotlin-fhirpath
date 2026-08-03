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

import dev.ohs.fhir.model.r4b.SubstanceDefinition
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun SubstanceDefinition.getProperty(name: String): Any? =
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
    "version" -> this.version
    "status" -> this.status
    "classification" -> this.classification
    "domain" -> this.domain
    "grade" -> this.grade
    "description" -> this.description
    "informationSource" -> this.informationSource
    "note" -> this.note
    "manufacturer" -> this.manufacturer
    "supplier" -> this.supplier
    "moiety" -> this.moiety
    "property" -> this.`property`
    "molecularWeight" -> this.molecularWeight
    "structure" -> this.structure
    "code" -> this.code
    "name" -> this.name
    "relationship" -> this.relationship
    "sourceMaterial" -> this.sourceMaterial
    else -> error("$name is not a valid property name")
  }

internal fun SubstanceDefinition.hasProperty(name: String): Boolean =
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
    "version" -> true
    "status" -> true
    "classification" -> true
    "domain" -> true
    "grade" -> true
    "description" -> true
    "informationSource" -> true
    "note" -> true
    "manufacturer" -> true
    "supplier" -> true
    "moiety" -> true
    "property" -> true
    "molecularWeight" -> true
    "structure" -> true
    "code" -> true
    "name" -> true
    "relationship" -> true
    "sourceMaterial" -> true
    else -> false
  }

internal fun SubstanceDefinition.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.meta?.let { add(it) }
  this@getAllChildren.implicitRules?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.contained)
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.identifier)
  this@getAllChildren.version?.let { add(it) }
  this@getAllChildren.status?.let { add(it) }
  addAll(this@getAllChildren.classification)
  this@getAllChildren.domain?.let { add(it) }
  addAll(this@getAllChildren.grade)
  this@getAllChildren.description?.let { add(it) }
  addAll(this@getAllChildren.informationSource)
  addAll(this@getAllChildren.note)
  addAll(this@getAllChildren.manufacturer)
  addAll(this@getAllChildren.supplier)
  addAll(this@getAllChildren.moiety)
  addAll(this@getAllChildren.`property`)
  addAll(this@getAllChildren.molecularWeight)
  this@getAllChildren.structure?.let { add(it) }
  addAll(this@getAllChildren.code)
  addAll(this@getAllChildren.name)
  addAll(this@getAllChildren.relationship)
  this@getAllChildren.sourceMaterial?.let { add(it) }
}

internal fun SubstanceDefinition.Moiety.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "role" -> this.role
    "identifier" -> this.identifier
    "name" -> this.name
    "stereochemistry" -> this.stereochemistry
    "opticalActivity" -> this.opticalActivity
    "molecularFormula" -> this.molecularFormula
    "amount" -> this.amount
    "measurementType" -> this.measurementType
    else -> error("$name is not a valid property name")
  }

internal fun SubstanceDefinition.Moiety.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "role" -> true
    "identifier" -> true
    "name" -> true
    "stereochemistry" -> true
    "opticalActivity" -> true
    "molecularFormula" -> true
    "amount" -> true
    "measurementType" -> true
    else -> false
  }

internal fun SubstanceDefinition.Moiety.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.role?.let { add(it) }
  this@getAllChildren.identifier?.let { add(it) }
  this@getAllChildren.name?.let { add(it) }
  this@getAllChildren.stereochemistry?.let { add(it) }
  this@getAllChildren.opticalActivity?.let { add(it) }
  this@getAllChildren.molecularFormula?.let { add(it) }
  this@getAllChildren.amount?.let { add(it) }
  this@getAllChildren.measurementType?.let { add(it) }
}

internal fun SubstanceDefinition.Property.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "value" -> this.`value`
    else -> error("$name is not a valid property name")
  }

internal fun SubstanceDefinition.Property.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "value" -> true
    else -> false
  }

internal fun SubstanceDefinition.Property.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.type)
  this@getAllChildren.`value`?.let { add(it) }
}

internal fun SubstanceDefinition.MolecularWeight.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "method" -> this.method
    "type" -> this.type
    "amount" -> this.amount
    else -> error("$name is not a valid property name")
  }

internal fun SubstanceDefinition.MolecularWeight.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "method" -> true
    "type" -> true
    "amount" -> true
    else -> false
  }

internal fun SubstanceDefinition.MolecularWeight.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.method?.let { add(it) }
  this@getAllChildren.type?.let { add(it) }
  add(this@getAllChildren.amount)
}

internal fun SubstanceDefinition.Structure.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "stereochemistry" -> this.stereochemistry
    "opticalActivity" -> this.opticalActivity
    "molecularFormula" -> this.molecularFormula
    "molecularFormulaByMoiety" -> this.molecularFormulaByMoiety
    "molecularWeight" -> this.molecularWeight
    "technique" -> this.technique
    "sourceDocument" -> this.sourceDocument
    "representation" -> this.representation
    else -> error("$name is not a valid property name")
  }

internal fun SubstanceDefinition.Structure.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "stereochemistry" -> true
    "opticalActivity" -> true
    "molecularFormula" -> true
    "molecularFormulaByMoiety" -> true
    "molecularWeight" -> true
    "technique" -> true
    "sourceDocument" -> true
    "representation" -> true
    else -> false
  }

internal fun SubstanceDefinition.Structure.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.stereochemistry?.let { add(it) }
  this@getAllChildren.opticalActivity?.let { add(it) }
  this@getAllChildren.molecularFormula?.let { add(it) }
  this@getAllChildren.molecularFormulaByMoiety?.let { add(it) }
  this@getAllChildren.molecularWeight?.let { add(it) }
  addAll(this@getAllChildren.technique)
  addAll(this@getAllChildren.sourceDocument)
  addAll(this@getAllChildren.representation)
}

internal fun SubstanceDefinition.Structure.Representation.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "representation" -> this.representation
    "format" -> this.format
    "document" -> this.document
    else -> error("$name is not a valid property name")
  }

internal fun SubstanceDefinition.Structure.Representation.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "representation" -> true
    "format" -> true
    "document" -> true
    else -> false
  }

internal fun SubstanceDefinition.Structure.Representation.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.type?.let { add(it) }
  this@getAllChildren.representation?.let { add(it) }
  this@getAllChildren.format?.let { add(it) }
  this@getAllChildren.document?.let { add(it) }
}

internal fun SubstanceDefinition.Code.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "code" -> this.code
    "status" -> this.status
    "statusDate" -> this.statusDate
    "note" -> this.note
    "source" -> this.source
    else -> error("$name is not a valid property name")
  }

internal fun SubstanceDefinition.Code.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "code" -> true
    "status" -> true
    "statusDate" -> true
    "note" -> true
    "source" -> true
    else -> false
  }

internal fun SubstanceDefinition.Code.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.code?.let { add(it) }
  this@getAllChildren.status?.let { add(it) }
  this@getAllChildren.statusDate?.let { add(it) }
  addAll(this@getAllChildren.note)
  addAll(this@getAllChildren.source)
}

internal fun SubstanceDefinition.Name.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "name" -> this.name
    "type" -> this.type
    "status" -> this.status
    "preferred" -> this.preferred
    "language" -> this.language
    "domain" -> this.domain
    "jurisdiction" -> this.jurisdiction
    "synonym" -> this.synonym
    "translation" -> this.translation
    "official" -> this.official
    "source" -> this.source
    else -> error("$name is not a valid property name")
  }

internal fun SubstanceDefinition.Name.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "name" -> true
    "type" -> true
    "status" -> true
    "preferred" -> true
    "language" -> true
    "domain" -> true
    "jurisdiction" -> true
    "synonym" -> true
    "translation" -> true
    "official" -> true
    "source" -> true
    else -> false
  }

internal fun SubstanceDefinition.Name.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.name)
  this@getAllChildren.type?.let { add(it) }
  this@getAllChildren.status?.let { add(it) }
  this@getAllChildren.preferred?.let { add(it) }
  addAll(this@getAllChildren.language)
  addAll(this@getAllChildren.domain)
  addAll(this@getAllChildren.jurisdiction)
  addAll(this@getAllChildren.synonym)
  addAll(this@getAllChildren.translation)
  addAll(this@getAllChildren.official)
  addAll(this@getAllChildren.source)
}

internal fun SubstanceDefinition.Name.Official.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "authority" -> this.authority
    "status" -> this.status
    "date" -> this.date
    else -> error("$name is not a valid property name")
  }

internal fun SubstanceDefinition.Name.Official.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "authority" -> true
    "status" -> true
    "date" -> true
    else -> false
  }

internal fun SubstanceDefinition.Name.Official.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.authority?.let { add(it) }
  this@getAllChildren.status?.let { add(it) }
  this@getAllChildren.date?.let { add(it) }
}

internal fun SubstanceDefinition.Relationship.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "substanceDefinition" -> this.substanceDefinition
    "type" -> this.type
    "isDefining" -> this.isDefining
    "amount" -> this.amount
    "ratioHighLimitAmount" -> this.ratioHighLimitAmount
    "comparator" -> this.comparator
    "source" -> this.source
    else -> error("$name is not a valid property name")
  }

internal fun SubstanceDefinition.Relationship.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "substanceDefinition" -> true
    "type" -> true
    "isDefining" -> true
    "amount" -> true
    "ratioHighLimitAmount" -> true
    "comparator" -> true
    "source" -> true
    else -> false
  }

internal fun SubstanceDefinition.Relationship.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.substanceDefinition?.let { add(it) }
  add(this@getAllChildren.type)
  this@getAllChildren.isDefining?.let { add(it) }
  this@getAllChildren.amount?.let { add(it) }
  this@getAllChildren.ratioHighLimitAmount?.let { add(it) }
  this@getAllChildren.comparator?.let { add(it) }
  addAll(this@getAllChildren.source)
}

internal fun SubstanceDefinition.SourceMaterial.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "genus" -> this.genus
    "species" -> this.species
    "part" -> this.part
    "countryOfOrigin" -> this.countryOfOrigin
    else -> error("$name is not a valid property name")
  }

internal fun SubstanceDefinition.SourceMaterial.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "genus" -> true
    "species" -> true
    "part" -> true
    "countryOfOrigin" -> true
    else -> false
  }

internal fun SubstanceDefinition.SourceMaterial.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.type?.let { add(it) }
  this@getAllChildren.genus?.let { add(it) }
  this@getAllChildren.species?.let { add(it) }
  this@getAllChildren.part?.let { add(it) }
  addAll(this@getAllChildren.countryOfOrigin)
}
