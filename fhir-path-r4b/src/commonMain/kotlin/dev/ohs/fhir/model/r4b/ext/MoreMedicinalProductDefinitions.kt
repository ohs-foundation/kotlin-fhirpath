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

import dev.ohs.fhir.model.r4b.MedicinalProductDefinition
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun MedicinalProductDefinition.getProperty(name: String): Any? =
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
    "version" -> this.version
    "status" -> this.status
    "statusDate" -> this.statusDate
    "description" -> this.description
    "combinedPharmaceuticalDoseForm" -> this.combinedPharmaceuticalDoseForm
    "route" -> this.route
    "indication" -> this.indication
    "legalStatusOfSupply" -> this.legalStatusOfSupply
    "additionalMonitoringIndicator" -> this.additionalMonitoringIndicator
    "specialMeasures" -> this.specialMeasures
    "pediatricUseIndicator" -> this.pediatricUseIndicator
    "classification" -> this.classification
    "marketingStatus" -> this.marketingStatus
    "packagedMedicinalProduct" -> this.packagedMedicinalProduct
    "ingredient" -> this.ingredient
    "impurity" -> this.impurity
    "attachedDocument" -> this.attachedDocument
    "masterFile" -> this.masterFile
    "contact" -> this.contact
    "clinicalTrial" -> this.clinicalTrial
    "code" -> this.code
    "name" -> this.name
    "crossReference" -> this.crossReference
    "operation" -> this.operation
    "characteristic" -> this.characteristic
    else -> error("$name is not a valid property name")
  }

internal fun MedicinalProductDefinition.hasProperty(name: String): Boolean =
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
    "version" -> true
    "status" -> true
    "statusDate" -> true
    "description" -> true
    "combinedPharmaceuticalDoseForm" -> true
    "route" -> true
    "indication" -> true
    "legalStatusOfSupply" -> true
    "additionalMonitoringIndicator" -> true
    "specialMeasures" -> true
    "pediatricUseIndicator" -> true
    "classification" -> true
    "marketingStatus" -> true
    "packagedMedicinalProduct" -> true
    "ingredient" -> true
    "impurity" -> true
    "attachedDocument" -> true
    "masterFile" -> true
    "contact" -> true
    "clinicalTrial" -> true
    "code" -> true
    "name" -> true
    "crossReference" -> true
    "operation" -> true
    "characteristic" -> true
    else -> false
  }

internal fun MedicinalProductDefinition.getAllChildren(): List<Any> = buildList {
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
  this@getAllChildren.version?.let { add(it) }
  this@getAllChildren.status?.let { add(it) }
  this@getAllChildren.statusDate?.let { add(it) }
  this@getAllChildren.description?.let { add(it) }
  this@getAllChildren.combinedPharmaceuticalDoseForm?.let { add(it) }
  addAll(this@getAllChildren.route)
  this@getAllChildren.indication?.let { add(it) }
  this@getAllChildren.legalStatusOfSupply?.let { add(it) }
  this@getAllChildren.additionalMonitoringIndicator?.let { add(it) }
  addAll(this@getAllChildren.specialMeasures)
  this@getAllChildren.pediatricUseIndicator?.let { add(it) }
  addAll(this@getAllChildren.classification)
  addAll(this@getAllChildren.marketingStatus)
  addAll(this@getAllChildren.packagedMedicinalProduct)
  addAll(this@getAllChildren.ingredient)
  addAll(this@getAllChildren.impurity)
  addAll(this@getAllChildren.attachedDocument)
  addAll(this@getAllChildren.masterFile)
  addAll(this@getAllChildren.contact)
  addAll(this@getAllChildren.clinicalTrial)
  addAll(this@getAllChildren.code)
  addAll(this@getAllChildren.name)
  addAll(this@getAllChildren.crossReference)
  addAll(this@getAllChildren.operation)
  addAll(this@getAllChildren.characteristic)
}

internal fun MedicinalProductDefinition.Contact.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "contact" -> this.contact
    else -> error("$name is not a valid property name")
  }

internal fun MedicinalProductDefinition.Contact.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "contact" -> true
    else -> false
  }

internal fun MedicinalProductDefinition.Contact.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.type?.let { add(it) }
  add(this@getAllChildren.contact)
}

internal fun MedicinalProductDefinition.Name.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "productName" -> this.productName
    "type" -> this.type
    "namePart" -> this.namePart
    "countryLanguage" -> this.countryLanguage
    else -> error("$name is not a valid property name")
  }

internal fun MedicinalProductDefinition.Name.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "productName" -> true
    "type" -> true
    "namePart" -> true
    "countryLanguage" -> true
    else -> false
  }

internal fun MedicinalProductDefinition.Name.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.productName)
  this@getAllChildren.type?.let { add(it) }
  addAll(this@getAllChildren.namePart)
  addAll(this@getAllChildren.countryLanguage)
}

internal fun MedicinalProductDefinition.Name.NamePart.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "part" -> this.part
    "type" -> this.type
    else -> error("$name is not a valid property name")
  }

internal fun MedicinalProductDefinition.Name.NamePart.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "part" -> true
    "type" -> true
    else -> false
  }

internal fun MedicinalProductDefinition.Name.NamePart.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.part)
  add(this@getAllChildren.type)
}

internal fun MedicinalProductDefinition.Name.CountryLanguage.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "country" -> this.country
    "jurisdiction" -> this.jurisdiction
    "language" -> this.language
    else -> error("$name is not a valid property name")
  }

internal fun MedicinalProductDefinition.Name.CountryLanguage.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "country" -> true
    "jurisdiction" -> true
    "language" -> true
    else -> false
  }

internal fun MedicinalProductDefinition.Name.CountryLanguage.getAllChildren(): List<Any> =
  buildList {
    this@getAllChildren.id?.let { add(it) }
    addAll(this@getAllChildren.extension)
    addAll(this@getAllChildren.modifierExtension)
    add(this@getAllChildren.country)
    this@getAllChildren.jurisdiction?.let { add(it) }
    add(this@getAllChildren.language)
  }

internal fun MedicinalProductDefinition.CrossReference.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "product" -> this.product
    "type" -> this.type
    else -> error("$name is not a valid property name")
  }

internal fun MedicinalProductDefinition.CrossReference.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "product" -> true
    "type" -> true
    else -> false
  }

internal fun MedicinalProductDefinition.CrossReference.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.product)
  this@getAllChildren.type?.let { add(it) }
}

internal fun MedicinalProductDefinition.Operation.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "effectiveDate" -> this.effectiveDate
    "organization" -> this.organization
    "confidentialityIndicator" -> this.confidentialityIndicator
    else -> error("$name is not a valid property name")
  }

internal fun MedicinalProductDefinition.Operation.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "effectiveDate" -> true
    "organization" -> true
    "confidentialityIndicator" -> true
    else -> false
  }

internal fun MedicinalProductDefinition.Operation.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.type?.let { add(it) }
  this@getAllChildren.effectiveDate?.let { add(it) }
  addAll(this@getAllChildren.organization)
  this@getAllChildren.confidentialityIndicator?.let { add(it) }
}

internal fun MedicinalProductDefinition.Characteristic.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "value" -> this.`value`
    else -> error("$name is not a valid property name")
  }

internal fun MedicinalProductDefinition.Characteristic.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "value" -> true
    else -> false
  }

internal fun MedicinalProductDefinition.Characteristic.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.type)
  this@getAllChildren.`value`?.let { add(it) }
}
