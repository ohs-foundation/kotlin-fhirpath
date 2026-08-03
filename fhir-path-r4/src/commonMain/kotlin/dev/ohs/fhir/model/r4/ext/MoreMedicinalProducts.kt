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

import dev.ohs.fhir.model.r4.MedicinalProduct
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun MedicinalProduct.getProperty(name: String): Any? =
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
    "domain" -> this.domain
    "combinedPharmaceuticalDoseForm" -> this.combinedPharmaceuticalDoseForm
    "legalStatusOfSupply" -> this.legalStatusOfSupply
    "additionalMonitoringIndicator" -> this.additionalMonitoringIndicator
    "specialMeasures" -> this.specialMeasures
    "paediatricUseIndicator" -> this.paediatricUseIndicator
    "productClassification" -> this.productClassification
    "marketingStatus" -> this.marketingStatus
    "pharmaceuticalProduct" -> this.pharmaceuticalProduct
    "packagedMedicinalProduct" -> this.packagedMedicinalProduct
    "attachedDocument" -> this.attachedDocument
    "masterFile" -> this.masterFile
    "contact" -> this.contact
    "clinicalTrial" -> this.clinicalTrial
    "name" -> this.name
    "crossReference" -> this.crossReference
    "manufacturingBusinessOperation" -> this.manufacturingBusinessOperation
    "specialDesignation" -> this.specialDesignation
    else -> error("$name is not a valid property name")
  }

internal fun MedicinalProduct.hasProperty(name: String): Boolean =
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
    "domain" -> true
    "combinedPharmaceuticalDoseForm" -> true
    "legalStatusOfSupply" -> true
    "additionalMonitoringIndicator" -> true
    "specialMeasures" -> true
    "paediatricUseIndicator" -> true
    "productClassification" -> true
    "marketingStatus" -> true
    "pharmaceuticalProduct" -> true
    "packagedMedicinalProduct" -> true
    "attachedDocument" -> true
    "masterFile" -> true
    "contact" -> true
    "clinicalTrial" -> true
    "name" -> true
    "crossReference" -> true
    "manufacturingBusinessOperation" -> true
    "specialDesignation" -> true
    else -> false
  }

internal fun MedicinalProduct.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.meta?.let { add(it) }
  this@getAllChildren.implicitRules?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.contained)
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.identifier)
  this@getAllChildren.type?.let { add(it) }
  this@getAllChildren.domain?.let { add(it) }
  this@getAllChildren.combinedPharmaceuticalDoseForm?.let { add(it) }
  this@getAllChildren.legalStatusOfSupply?.let { add(it) }
  this@getAllChildren.additionalMonitoringIndicator?.let { add(it) }
  addAll(this@getAllChildren.specialMeasures)
  this@getAllChildren.paediatricUseIndicator?.let { add(it) }
  addAll(this@getAllChildren.productClassification)
  addAll(this@getAllChildren.marketingStatus)
  addAll(this@getAllChildren.pharmaceuticalProduct)
  addAll(this@getAllChildren.packagedMedicinalProduct)
  addAll(this@getAllChildren.attachedDocument)
  addAll(this@getAllChildren.masterFile)
  addAll(this@getAllChildren.contact)
  addAll(this@getAllChildren.clinicalTrial)
  addAll(this@getAllChildren.name)
  addAll(this@getAllChildren.crossReference)
  addAll(this@getAllChildren.manufacturingBusinessOperation)
  addAll(this@getAllChildren.specialDesignation)
}

internal fun MedicinalProduct.Name.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "productName" -> this.productName
    "namePart" -> this.namePart
    "countryLanguage" -> this.countryLanguage
    else -> error("$name is not a valid property name")
  }

internal fun MedicinalProduct.Name.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "productName" -> true
    "namePart" -> true
    "countryLanguage" -> true
    else -> false
  }

internal fun MedicinalProduct.Name.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.productName)
  addAll(this@getAllChildren.namePart)
  addAll(this@getAllChildren.countryLanguage)
}

internal fun MedicinalProduct.Name.NamePart.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "part" -> this.part
    "type" -> this.type
    else -> error("$name is not a valid property name")
  }

internal fun MedicinalProduct.Name.NamePart.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "part" -> true
    "type" -> true
    else -> false
  }

internal fun MedicinalProduct.Name.NamePart.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.part)
  add(this@getAllChildren.type)
}

internal fun MedicinalProduct.Name.CountryLanguage.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "country" -> this.country
    "jurisdiction" -> this.jurisdiction
    "language" -> this.language
    else -> error("$name is not a valid property name")
  }

internal fun MedicinalProduct.Name.CountryLanguage.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "country" -> true
    "jurisdiction" -> true
    "language" -> true
    else -> false
  }

internal fun MedicinalProduct.Name.CountryLanguage.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.country)
  this@getAllChildren.jurisdiction?.let { add(it) }
  add(this@getAllChildren.language)
}

internal fun MedicinalProduct.ManufacturingBusinessOperation.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "operationType" -> this.operationType
    "authorisationReferenceNumber" -> this.authorisationReferenceNumber
    "effectiveDate" -> this.effectiveDate
    "confidentialityIndicator" -> this.confidentialityIndicator
    "manufacturer" -> this.manufacturer
    "regulator" -> this.regulator
    else -> error("$name is not a valid property name")
  }

internal fun MedicinalProduct.ManufacturingBusinessOperation.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "operationType" -> true
    "authorisationReferenceNumber" -> true
    "effectiveDate" -> true
    "confidentialityIndicator" -> true
    "manufacturer" -> true
    "regulator" -> true
    else -> false
  }

internal fun MedicinalProduct.ManufacturingBusinessOperation.getAllChildren(): List<Any> =
  buildList {
    this@getAllChildren.id?.let { add(it) }
    addAll(this@getAllChildren.extension)
    addAll(this@getAllChildren.modifierExtension)
    this@getAllChildren.operationType?.let { add(it) }
    this@getAllChildren.authorisationReferenceNumber?.let { add(it) }
    this@getAllChildren.effectiveDate?.let { add(it) }
    this@getAllChildren.confidentialityIndicator?.let { add(it) }
    addAll(this@getAllChildren.manufacturer)
    this@getAllChildren.regulator?.let { add(it) }
  }

internal fun MedicinalProduct.SpecialDesignation.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "identifier" -> this.identifier
    "type" -> this.type
    "intendedUse" -> this.intendedUse
    "indication" -> this.indication
    "status" -> this.status
    "date" -> this.date
    "species" -> this.species
    else -> error("$name is not a valid property name")
  }

internal fun MedicinalProduct.SpecialDesignation.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "identifier" -> true
    "type" -> true
    "intendedUse" -> true
    "indication" -> true
    "status" -> true
    "date" -> true
    "species" -> true
    else -> false
  }

internal fun MedicinalProduct.SpecialDesignation.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.identifier)
  this@getAllChildren.type?.let { add(it) }
  this@getAllChildren.intendedUse?.let { add(it) }
  this@getAllChildren.indication?.let { add(it) }
  this@getAllChildren.status?.let { add(it) }
  this@getAllChildren.date?.let { add(it) }
  this@getAllChildren.species?.let { add(it) }
}
