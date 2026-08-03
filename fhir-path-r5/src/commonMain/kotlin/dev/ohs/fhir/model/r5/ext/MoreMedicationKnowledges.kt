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

import dev.ohs.fhir.model.r5.MedicationKnowledge
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun MedicationKnowledge.getProperty(name: String): Any? =
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
    "code" -> this.code
    "status" -> this.status
    "author" -> this.author
    "intendedJurisdiction" -> this.intendedJurisdiction
    "name" -> this.name
    "relatedMedicationKnowledge" -> this.relatedMedicationKnowledge
    "associatedMedication" -> this.associatedMedication
    "productType" -> this.productType
    "monograph" -> this.monograph
    "preparationInstruction" -> this.preparationInstruction
    "cost" -> this.cost
    "monitoringProgram" -> this.monitoringProgram
    "indicationGuideline" -> this.indicationGuideline
    "medicineClassification" -> this.medicineClassification
    "packaging" -> this.packaging
    "clinicalUseIssue" -> this.clinicalUseIssue
    "storageGuideline" -> this.storageGuideline
    "regulatory" -> this.regulatory
    "definitional" -> this.definitional
    else -> error("$name is not a valid property name")
  }

internal fun MedicationKnowledge.hasProperty(name: String): Boolean =
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
    "code" -> true
    "status" -> true
    "author" -> true
    "intendedJurisdiction" -> true
    "name" -> true
    "relatedMedicationKnowledge" -> true
    "associatedMedication" -> true
    "productType" -> true
    "monograph" -> true
    "preparationInstruction" -> true
    "cost" -> true
    "monitoringProgram" -> true
    "indicationGuideline" -> true
    "medicineClassification" -> true
    "packaging" -> true
    "clinicalUseIssue" -> true
    "storageGuideline" -> true
    "regulatory" -> true
    "definitional" -> true
    else -> false
  }

internal fun MedicationKnowledge.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.meta?.let { add(it) }
  this@getAllChildren.implicitRules?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.contained)
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.identifier)
  this@getAllChildren.code?.let { add(it) }
  this@getAllChildren.status?.let { add(it) }
  this@getAllChildren.author?.let { add(it) }
  addAll(this@getAllChildren.intendedJurisdiction)
  addAll(this@getAllChildren.name)
  addAll(this@getAllChildren.relatedMedicationKnowledge)
  addAll(this@getAllChildren.associatedMedication)
  addAll(this@getAllChildren.productType)
  addAll(this@getAllChildren.monograph)
  this@getAllChildren.preparationInstruction?.let { add(it) }
  addAll(this@getAllChildren.cost)
  addAll(this@getAllChildren.monitoringProgram)
  addAll(this@getAllChildren.indicationGuideline)
  addAll(this@getAllChildren.medicineClassification)
  addAll(this@getAllChildren.packaging)
  addAll(this@getAllChildren.clinicalUseIssue)
  addAll(this@getAllChildren.storageGuideline)
  addAll(this@getAllChildren.regulatory)
  this@getAllChildren.definitional?.let { add(it) }
}

internal fun MedicationKnowledge.RelatedMedicationKnowledge.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "reference" -> this.reference
    else -> error("$name is not a valid property name")
  }

internal fun MedicationKnowledge.RelatedMedicationKnowledge.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "reference" -> true
    else -> false
  }

internal fun MedicationKnowledge.RelatedMedicationKnowledge.getAllChildren(): List<Any> =
  buildList {
    this@getAllChildren.id?.let { add(it) }
    addAll(this@getAllChildren.extension)
    addAll(this@getAllChildren.modifierExtension)
    add(this@getAllChildren.type)
    addAll(this@getAllChildren.reference)
  }

internal fun MedicationKnowledge.Monograph.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "source" -> this.source
    else -> error("$name is not a valid property name")
  }

internal fun MedicationKnowledge.Monograph.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "source" -> true
    else -> false
  }

internal fun MedicationKnowledge.Monograph.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.type?.let { add(it) }
  this@getAllChildren.source?.let { add(it) }
}

internal fun MedicationKnowledge.Cost.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "effectiveDate" -> this.effectiveDate
    "type" -> this.type
    "source" -> this.source
    "cost" -> this.cost
    else -> error("$name is not a valid property name")
  }

internal fun MedicationKnowledge.Cost.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "effectiveDate" -> true
    "type" -> true
    "source" -> true
    "cost" -> true
    else -> false
  }

internal fun MedicationKnowledge.Cost.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.effectiveDate)
  add(this@getAllChildren.type)
  this@getAllChildren.source?.let { add(it) }
  add(this@getAllChildren.cost)
}

internal fun MedicationKnowledge.MonitoringProgram.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "name" -> this.name
    else -> error("$name is not a valid property name")
  }

internal fun MedicationKnowledge.MonitoringProgram.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "name" -> true
    else -> false
  }

internal fun MedicationKnowledge.MonitoringProgram.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.type?.let { add(it) }
  this@getAllChildren.name?.let { add(it) }
}

internal fun MedicationKnowledge.IndicationGuideline.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "indication" -> this.indication
    "dosingGuideline" -> this.dosingGuideline
    else -> error("$name is not a valid property name")
  }

internal fun MedicationKnowledge.IndicationGuideline.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "indication" -> true
    "dosingGuideline" -> true
    else -> false
  }

internal fun MedicationKnowledge.IndicationGuideline.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.indication)
  addAll(this@getAllChildren.dosingGuideline)
}

internal fun MedicationKnowledge.IndicationGuideline.DosingGuideline.getProperty(
  name: String
): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "treatmentIntent" -> this.treatmentIntent
    "dosage" -> this.dosage
    "administrationTreatment" -> this.administrationTreatment
    "patientCharacteristic" -> this.patientCharacteristic
    else -> error("$name is not a valid property name")
  }

internal fun MedicationKnowledge.IndicationGuideline.DosingGuideline.hasProperty(
  name: String
): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "treatmentIntent" -> true
    "dosage" -> true
    "administrationTreatment" -> true
    "patientCharacteristic" -> true
    else -> false
  }

internal fun MedicationKnowledge.IndicationGuideline.DosingGuideline.getAllChildren(): List<Any> =
  buildList {
    this@getAllChildren.id?.let { add(it) }
    addAll(this@getAllChildren.extension)
    addAll(this@getAllChildren.modifierExtension)
    this@getAllChildren.treatmentIntent?.let { add(it) }
    addAll(this@getAllChildren.dosage)
    this@getAllChildren.administrationTreatment?.let { add(it) }
    addAll(this@getAllChildren.patientCharacteristic)
  }

internal fun MedicationKnowledge.IndicationGuideline.DosingGuideline.Dosage.getProperty(
  name: String
): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "dosage" -> this.dosage
    else -> error("$name is not a valid property name")
  }

internal fun MedicationKnowledge.IndicationGuideline.DosingGuideline.Dosage.hasProperty(
  name: String
): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "dosage" -> true
    else -> false
  }

internal fun MedicationKnowledge.IndicationGuideline.DosingGuideline.Dosage.getAllChildren():
  List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.type)
  addAll(this@getAllChildren.dosage)
}

internal fun MedicationKnowledge.IndicationGuideline.DosingGuideline.PatientCharacteristic
  .getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "value" -> this.`value`
    else -> error("$name is not a valid property name")
  }

internal fun MedicationKnowledge.IndicationGuideline.DosingGuideline.PatientCharacteristic
  .hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "value" -> true
    else -> false
  }

internal fun MedicationKnowledge.IndicationGuideline.DosingGuideline.PatientCharacteristic
  .getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.type)
  this@getAllChildren.`value`?.let { add(it) }
}

internal fun MedicationKnowledge.MedicineClassification.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "source" -> this.source
    "classification" -> this.classification
    else -> error("$name is not a valid property name")
  }

internal fun MedicationKnowledge.MedicineClassification.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "source" -> true
    "classification" -> true
    else -> false
  }

internal fun MedicationKnowledge.MedicineClassification.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.type)
  this@getAllChildren.source?.let { add(it) }
  addAll(this@getAllChildren.classification)
}

internal fun MedicationKnowledge.Packaging.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "cost" -> this.cost
    "packagedProduct" -> this.packagedProduct
    else -> error("$name is not a valid property name")
  }

internal fun MedicationKnowledge.Packaging.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "cost" -> true
    "packagedProduct" -> true
    else -> false
  }

internal fun MedicationKnowledge.Packaging.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.cost)
  this@getAllChildren.packagedProduct?.let { add(it) }
}

internal fun MedicationKnowledge.StorageGuideline.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "reference" -> this.reference
    "note" -> this.note
    "stabilityDuration" -> this.stabilityDuration
    "environmentalSetting" -> this.environmentalSetting
    else -> error("$name is not a valid property name")
  }

internal fun MedicationKnowledge.StorageGuideline.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "reference" -> true
    "note" -> true
    "stabilityDuration" -> true
    "environmentalSetting" -> true
    else -> false
  }

internal fun MedicationKnowledge.StorageGuideline.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.reference?.let { add(it) }
  addAll(this@getAllChildren.note)
  this@getAllChildren.stabilityDuration?.let { add(it) }
  addAll(this@getAllChildren.environmentalSetting)
}

internal fun MedicationKnowledge.StorageGuideline.EnvironmentalSetting.getProperty(
  name: String
): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "value" -> this.`value`
    else -> error("$name is not a valid property name")
  }

internal fun MedicationKnowledge.StorageGuideline.EnvironmentalSetting.hasProperty(
  name: String
): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "value" -> true
    else -> false
  }

internal fun MedicationKnowledge.StorageGuideline.EnvironmentalSetting.getAllChildren(): List<Any> =
  buildList {
    this@getAllChildren.id?.let { add(it) }
    addAll(this@getAllChildren.extension)
    addAll(this@getAllChildren.modifierExtension)
    add(this@getAllChildren.type)
    add(this@getAllChildren.`value`)
  }

internal fun MedicationKnowledge.Regulatory.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "regulatoryAuthority" -> this.regulatoryAuthority
    "substitution" -> this.substitution
    "schedule" -> this.schedule
    "maxDispense" -> this.maxDispense
    else -> error("$name is not a valid property name")
  }

internal fun MedicationKnowledge.Regulatory.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "regulatoryAuthority" -> true
    "substitution" -> true
    "schedule" -> true
    "maxDispense" -> true
    else -> false
  }

internal fun MedicationKnowledge.Regulatory.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.regulatoryAuthority)
  addAll(this@getAllChildren.substitution)
  addAll(this@getAllChildren.schedule)
  this@getAllChildren.maxDispense?.let { add(it) }
}

internal fun MedicationKnowledge.Regulatory.Substitution.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "allowed" -> this.allowed
    else -> error("$name is not a valid property name")
  }

internal fun MedicationKnowledge.Regulatory.Substitution.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "allowed" -> true
    else -> false
  }

internal fun MedicationKnowledge.Regulatory.Substitution.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.type)
  add(this@getAllChildren.allowed)
}

internal fun MedicationKnowledge.Regulatory.MaxDispense.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "quantity" -> this.quantity
    "period" -> this.period
    else -> error("$name is not a valid property name")
  }

internal fun MedicationKnowledge.Regulatory.MaxDispense.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "quantity" -> true
    "period" -> true
    else -> false
  }

internal fun MedicationKnowledge.Regulatory.MaxDispense.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.quantity)
  this@getAllChildren.period?.let { add(it) }
}

internal fun MedicationKnowledge.Definitional.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "definition" -> this.definition
    "doseForm" -> this.doseForm
    "intendedRoute" -> this.intendedRoute
    "ingredient" -> this.ingredient
    "drugCharacteristic" -> this.drugCharacteristic
    else -> error("$name is not a valid property name")
  }

internal fun MedicationKnowledge.Definitional.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "definition" -> true
    "doseForm" -> true
    "intendedRoute" -> true
    "ingredient" -> true
    "drugCharacteristic" -> true
    else -> false
  }

internal fun MedicationKnowledge.Definitional.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.definition)
  this@getAllChildren.doseForm?.let { add(it) }
  addAll(this@getAllChildren.intendedRoute)
  addAll(this@getAllChildren.ingredient)
  addAll(this@getAllChildren.drugCharacteristic)
}

internal fun MedicationKnowledge.Definitional.Ingredient.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "item" -> this.item
    "type" -> this.type
    "strength" -> this.strength
    else -> error("$name is not a valid property name")
  }

internal fun MedicationKnowledge.Definitional.Ingredient.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "item" -> true
    "type" -> true
    "strength" -> true
    else -> false
  }

internal fun MedicationKnowledge.Definitional.Ingredient.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.item)
  this@getAllChildren.type?.let { add(it) }
  this@getAllChildren.strength?.let { add(it) }
}

internal fun MedicationKnowledge.Definitional.DrugCharacteristic.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "value" -> this.`value`
    else -> error("$name is not a valid property name")
  }

internal fun MedicationKnowledge.Definitional.DrugCharacteristic.hasProperty(
  name: String
): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "value" -> true
    else -> false
  }

internal fun MedicationKnowledge.Definitional.DrugCharacteristic.getAllChildren(): List<Any> =
  buildList {
    this@getAllChildren.id?.let { add(it) }
    addAll(this@getAllChildren.extension)
    addAll(this@getAllChildren.modifierExtension)
    this@getAllChildren.type?.let { add(it) }
    this@getAllChildren.`value`?.let { add(it) }
  }
