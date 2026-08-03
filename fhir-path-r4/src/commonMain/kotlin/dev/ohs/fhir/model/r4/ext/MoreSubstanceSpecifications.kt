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

import dev.ohs.fhir.model.r4.SubstanceSpecification
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun SubstanceSpecification.getProperty(name: String): Any? =
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
    "type" -> this.type
    "status" -> this.status
    "domain" -> this.domain
    "description" -> this.description
    "source" -> this.source
    "comment" -> this.comment
    "moiety" -> this.moiety
    "property" -> this.`property`
    "referenceInformation" -> this.referenceInformation
    "structure" -> this.structure
    "code" -> this.code
    "name" -> this.name
    "molecularWeight" -> this.molecularWeight
    "relationship" -> this.relationship
    "nucleicAcid" -> this.nucleicAcid
    "polymer" -> this.polymer
    "protein" -> this.protein
    "sourceMaterial" -> this.sourceMaterial
    else -> error("$name is not a valid property name")
  }

internal fun SubstanceSpecification.hasProperty(name: String): Boolean =
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
    "type" -> true
    "status" -> true
    "domain" -> true
    "description" -> true
    "source" -> true
    "comment" -> true
    "moiety" -> true
    "property" -> true
    "referenceInformation" -> true
    "structure" -> true
    "code" -> true
    "name" -> true
    "molecularWeight" -> true
    "relationship" -> true
    "nucleicAcid" -> true
    "polymer" -> true
    "protein" -> true
    "sourceMaterial" -> true
    else -> false
  }

internal fun SubstanceSpecification.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.meta?.let { add(it) }
  this@getAllChildren.implicitRules?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.contained)
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.identifier?.let { add(it) }
  this@getAllChildren.type?.let { add(it) }
  this@getAllChildren.status?.let { add(it) }
  this@getAllChildren.domain?.let { add(it) }
  this@getAllChildren.description?.let { add(it) }
  addAll(this@getAllChildren.source)
  this@getAllChildren.comment?.let { add(it) }
  addAll(this@getAllChildren.moiety)
  addAll(this@getAllChildren.`property`)
  this@getAllChildren.referenceInformation?.let { add(it) }
  this@getAllChildren.structure?.let { add(it) }
  addAll(this@getAllChildren.code)
  addAll(this@getAllChildren.name)
  addAll(this@getAllChildren.molecularWeight)
  addAll(this@getAllChildren.relationship)
  this@getAllChildren.nucleicAcid?.let { add(it) }
  this@getAllChildren.polymer?.let { add(it) }
  this@getAllChildren.protein?.let { add(it) }
  this@getAllChildren.sourceMaterial?.let { add(it) }
}

internal fun SubstanceSpecification.Moiety.getProperty(name: String): Any? =
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
    else -> error("$name is not a valid property name")
  }

internal fun SubstanceSpecification.Moiety.hasProperty(name: String): Boolean =
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
    else -> false
  }

internal fun SubstanceSpecification.Moiety.getAllChildren(): List<Any> = buildList {
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
}

internal fun SubstanceSpecification.Property.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "category" -> this.category
    "code" -> this.code
    "parameters" -> this.parameters
    "definingSubstance" -> this.definingSubstance
    "amount" -> this.amount
    else -> error("$name is not a valid property name")
  }

internal fun SubstanceSpecification.Property.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "category" -> true
    "code" -> true
    "parameters" -> true
    "definingSubstance" -> true
    "amount" -> true
    else -> false
  }

internal fun SubstanceSpecification.Property.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.category?.let { add(it) }
  this@getAllChildren.code?.let { add(it) }
  this@getAllChildren.parameters?.let { add(it) }
  this@getAllChildren.definingSubstance?.let { add(it) }
  this@getAllChildren.amount?.let { add(it) }
}

internal fun SubstanceSpecification.Structure.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "stereochemistry" -> this.stereochemistry
    "opticalActivity" -> this.opticalActivity
    "molecularFormula" -> this.molecularFormula
    "molecularFormulaByMoiety" -> this.molecularFormulaByMoiety
    "isotope" -> this.isotope
    "molecularWeight" -> this.molecularWeight
    "source" -> this.source
    "representation" -> this.representation
    else -> error("$name is not a valid property name")
  }

internal fun SubstanceSpecification.Structure.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "stereochemistry" -> true
    "opticalActivity" -> true
    "molecularFormula" -> true
    "molecularFormulaByMoiety" -> true
    "isotope" -> true
    "molecularWeight" -> true
    "source" -> true
    "representation" -> true
    else -> false
  }

internal fun SubstanceSpecification.Structure.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.stereochemistry?.let { add(it) }
  this@getAllChildren.opticalActivity?.let { add(it) }
  this@getAllChildren.molecularFormula?.let { add(it) }
  this@getAllChildren.molecularFormulaByMoiety?.let { add(it) }
  addAll(this@getAllChildren.isotope)
  this@getAllChildren.molecularWeight?.let { add(it) }
  addAll(this@getAllChildren.source)
  addAll(this@getAllChildren.representation)
}

internal fun SubstanceSpecification.Structure.Isotope.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "identifier" -> this.identifier
    "name" -> this.name
    "substitution" -> this.substitution
    "halfLife" -> this.halfLife
    "molecularWeight" -> this.molecularWeight
    else -> error("$name is not a valid property name")
  }

internal fun SubstanceSpecification.Structure.Isotope.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "identifier" -> true
    "name" -> true
    "substitution" -> true
    "halfLife" -> true
    "molecularWeight" -> true
    else -> false
  }

internal fun SubstanceSpecification.Structure.Isotope.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.identifier?.let { add(it) }
  this@getAllChildren.name?.let { add(it) }
  this@getAllChildren.substitution?.let { add(it) }
  this@getAllChildren.halfLife?.let { add(it) }
  this@getAllChildren.molecularWeight?.let { add(it) }
}

internal fun SubstanceSpecification.Structure.Isotope.MolecularWeight.getProperty(
  name: String
): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "method" -> this.method
    "type" -> this.type
    "amount" -> this.amount
    else -> error("$name is not a valid property name")
  }

internal fun SubstanceSpecification.Structure.Isotope.MolecularWeight.hasProperty(
  name: String
): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "method" -> true
    "type" -> true
    "amount" -> true
    else -> false
  }

internal fun SubstanceSpecification.Structure.Isotope.MolecularWeight.getAllChildren(): List<Any> =
  buildList {
    this@getAllChildren.id?.let { add(it) }
    addAll(this@getAllChildren.extension)
    addAll(this@getAllChildren.modifierExtension)
    this@getAllChildren.method?.let { add(it) }
    this@getAllChildren.type?.let { add(it) }
    this@getAllChildren.amount?.let { add(it) }
  }

internal fun SubstanceSpecification.Structure.Representation.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "representation" -> this.representation
    "attachment" -> this.attachment
    else -> error("$name is not a valid property name")
  }

internal fun SubstanceSpecification.Structure.Representation.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "representation" -> true
    "attachment" -> true
    else -> false
  }

internal fun SubstanceSpecification.Structure.Representation.getAllChildren(): List<Any> =
  buildList {
    this@getAllChildren.id?.let { add(it) }
    addAll(this@getAllChildren.extension)
    addAll(this@getAllChildren.modifierExtension)
    this@getAllChildren.type?.let { add(it) }
    this@getAllChildren.representation?.let { add(it) }
    this@getAllChildren.attachment?.let { add(it) }
  }

internal fun SubstanceSpecification.Code.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "code" -> this.code
    "status" -> this.status
    "statusDate" -> this.statusDate
    "comment" -> this.comment
    "source" -> this.source
    else -> error("$name is not a valid property name")
  }

internal fun SubstanceSpecification.Code.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "code" -> true
    "status" -> true
    "statusDate" -> true
    "comment" -> true
    "source" -> true
    else -> false
  }

internal fun SubstanceSpecification.Code.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.code?.let { add(it) }
  this@getAllChildren.status?.let { add(it) }
  this@getAllChildren.statusDate?.let { add(it) }
  this@getAllChildren.comment?.let { add(it) }
  addAll(this@getAllChildren.source)
}

internal fun SubstanceSpecification.Name.getProperty(name: String): Any? =
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

internal fun SubstanceSpecification.Name.hasProperty(name: String): Boolean =
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

internal fun SubstanceSpecification.Name.getAllChildren(): List<Any> = buildList {
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

internal fun SubstanceSpecification.Name.Official.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "authority" -> this.authority
    "status" -> this.status
    "date" -> this.date
    else -> error("$name is not a valid property name")
  }

internal fun SubstanceSpecification.Name.Official.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "authority" -> true
    "status" -> true
    "date" -> true
    else -> false
  }

internal fun SubstanceSpecification.Name.Official.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.authority?.let { add(it) }
  this@getAllChildren.status?.let { add(it) }
  this@getAllChildren.date?.let { add(it) }
}

internal fun SubstanceSpecification.Relationship.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "substance" -> this.substance
    "relationship" -> this.relationship
    "isDefining" -> this.isDefining
    "amount" -> this.amount
    "amountRatioLowLimit" -> this.amountRatioLowLimit
    "amountType" -> this.amountType
    "source" -> this.source
    else -> error("$name is not a valid property name")
  }

internal fun SubstanceSpecification.Relationship.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "substance" -> true
    "relationship" -> true
    "isDefining" -> true
    "amount" -> true
    "amountRatioLowLimit" -> true
    "amountType" -> true
    "source" -> true
    else -> false
  }

internal fun SubstanceSpecification.Relationship.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.substance?.let { add(it) }
  this@getAllChildren.relationship?.let { add(it) }
  this@getAllChildren.isDefining?.let { add(it) }
  this@getAllChildren.amount?.let { add(it) }
  this@getAllChildren.amountRatioLowLimit?.let { add(it) }
  this@getAllChildren.amountType?.let { add(it) }
  addAll(this@getAllChildren.source)
}
