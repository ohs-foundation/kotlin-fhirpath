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

import dev.ohs.fhir.model.r4b.MedicationKnowledge
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
    "code" -> this.code
    "status" -> this.status
    "manufacturer" -> this.manufacturer
    "doseForm" -> this.doseForm
    "amount" -> this.amount
    "synonym" -> this.synonym
    "relatedMedicationKnowledge" -> this.relatedMedicationKnowledge
    "associatedMedication" -> this.associatedMedication
    "productType" -> this.productType
    "monograph" -> this.monograph
    "ingredient" -> this.ingredient
    "preparationInstruction" -> this.preparationInstruction
    "intendedRoute" -> this.intendedRoute
    "cost" -> this.cost
    "monitoringProgram" -> this.monitoringProgram
    "administrationGuidelines" -> this.administrationGuidelines
    "medicineClassification" -> this.medicineClassification
    "packaging" -> this.packaging
    "drugCharacteristic" -> this.drugCharacteristic
    "contraindication" -> this.contraindication
    "regulatory" -> this.regulatory
    "kinetics" -> this.kinetics
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
    "code" -> true
    "status" -> true
    "manufacturer" -> true
    "doseForm" -> true
    "amount" -> true
    "synonym" -> true
    "relatedMedicationKnowledge" -> true
    "associatedMedication" -> true
    "productType" -> true
    "monograph" -> true
    "ingredient" -> true
    "preparationInstruction" -> true
    "intendedRoute" -> true
    "cost" -> true
    "monitoringProgram" -> true
    "administrationGuidelines" -> true
    "medicineClassification" -> true
    "packaging" -> true
    "drugCharacteristic" -> true
    "contraindication" -> true
    "regulatory" -> true
    "kinetics" -> true
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
  this@getAllChildren.code?.let { add(it) }
  this@getAllChildren.status?.let { add(it) }
  this@getAllChildren.manufacturer?.let { add(it) }
  this@getAllChildren.doseForm?.let { add(it) }
  this@getAllChildren.amount?.let { add(it) }
  addAll(this@getAllChildren.synonym)
  addAll(this@getAllChildren.relatedMedicationKnowledge)
  addAll(this@getAllChildren.associatedMedication)
  addAll(this@getAllChildren.productType)
  addAll(this@getAllChildren.monograph)
  addAll(this@getAllChildren.ingredient)
  this@getAllChildren.preparationInstruction?.let { add(it) }
  addAll(this@getAllChildren.intendedRoute)
  addAll(this@getAllChildren.cost)
  addAll(this@getAllChildren.monitoringProgram)
  addAll(this@getAllChildren.administrationGuidelines)
  addAll(this@getAllChildren.medicineClassification)
  this@getAllChildren.packaging?.let { add(it) }
  addAll(this@getAllChildren.drugCharacteristic)
  addAll(this@getAllChildren.contraindication)
  addAll(this@getAllChildren.regulatory)
  addAll(this@getAllChildren.kinetics)
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

internal fun MedicationKnowledge.Ingredient.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "item" -> this.item
    "isActive" -> this.isActive
    "strength" -> this.strength
    else -> error("$name is not a valid property name")
  }

internal fun MedicationKnowledge.Ingredient.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "item" -> true
    "isActive" -> true
    "strength" -> true
    else -> false
  }

internal fun MedicationKnowledge.Ingredient.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.item)
  this@getAllChildren.isActive?.let { add(it) }
  this@getAllChildren.strength?.let { add(it) }
}

internal fun MedicationKnowledge.Cost.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
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
    "type" -> true
    "source" -> true
    "cost" -> true
    else -> false
  }

internal fun MedicationKnowledge.Cost.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
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

internal fun MedicationKnowledge.AdministrationGuidelines.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "dosage" -> this.dosage
    "indication" -> this.indication
    "patientCharacteristics" -> this.patientCharacteristics
    else -> error("$name is not a valid property name")
  }

internal fun MedicationKnowledge.AdministrationGuidelines.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "dosage" -> true
    "indication" -> true
    "patientCharacteristics" -> true
    else -> false
  }

internal fun MedicationKnowledge.AdministrationGuidelines.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.dosage)
  this@getAllChildren.indication?.let { add(it) }
  addAll(this@getAllChildren.patientCharacteristics)
}

internal fun MedicationKnowledge.AdministrationGuidelines.Dosage.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "dosage" -> this.dosage
    else -> error("$name is not a valid property name")
  }

internal fun MedicationKnowledge.AdministrationGuidelines.Dosage.hasProperty(
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

internal fun MedicationKnowledge.AdministrationGuidelines.Dosage.getAllChildren(): List<Any> =
  buildList {
    this@getAllChildren.id?.let { add(it) }
    addAll(this@getAllChildren.extension)
    addAll(this@getAllChildren.modifierExtension)
    add(this@getAllChildren.type)
    addAll(this@getAllChildren.dosage)
  }

internal fun MedicationKnowledge.AdministrationGuidelines.PatientCharacteristics.getProperty(
  name: String
): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "characteristic" -> this.characteristic
    "value" -> this.`value`
    else -> error("$name is not a valid property name")
  }

internal fun MedicationKnowledge.AdministrationGuidelines.PatientCharacteristics.hasProperty(
  name: String
): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "characteristic" -> true
    "value" -> true
    else -> false
  }

internal fun MedicationKnowledge.AdministrationGuidelines.PatientCharacteristics.getAllChildren():
  List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.characteristic)
  addAll(this@getAllChildren.`value`)
}

internal fun MedicationKnowledge.MedicineClassification.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "classification" -> this.classification
    else -> error("$name is not a valid property name")
  }

internal fun MedicationKnowledge.MedicineClassification.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "classification" -> true
    else -> false
  }

internal fun MedicationKnowledge.MedicineClassification.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.type)
  addAll(this@getAllChildren.classification)
}

internal fun MedicationKnowledge.Packaging.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "quantity" -> this.quantity
    else -> error("$name is not a valid property name")
  }

internal fun MedicationKnowledge.Packaging.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "quantity" -> true
    else -> false
  }

internal fun MedicationKnowledge.Packaging.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.type?.let { add(it) }
  this@getAllChildren.quantity?.let { add(it) }
}

internal fun MedicationKnowledge.DrugCharacteristic.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "value" -> this.`value`
    else -> error("$name is not a valid property name")
  }

internal fun MedicationKnowledge.DrugCharacteristic.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "value" -> true
    else -> false
  }

internal fun MedicationKnowledge.DrugCharacteristic.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.type?.let { add(it) }
  this@getAllChildren.`value`?.let { add(it) }
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

internal fun MedicationKnowledge.Regulatory.Schedule.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "schedule" -> this.schedule
    else -> error("$name is not a valid property name")
  }

internal fun MedicationKnowledge.Regulatory.Schedule.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "schedule" -> true
    else -> false
  }

internal fun MedicationKnowledge.Regulatory.Schedule.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.schedule)
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

internal fun MedicationKnowledge.Kinetics.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "areaUnderCurve" -> this.areaUnderCurve
    "lethalDose50" -> this.lethalDose50
    "halfLifePeriod" -> this.halfLifePeriod
    else -> error("$name is not a valid property name")
  }

internal fun MedicationKnowledge.Kinetics.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "areaUnderCurve" -> true
    "lethalDose50" -> true
    "halfLifePeriod" -> true
    else -> false
  }

internal fun MedicationKnowledge.Kinetics.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.areaUnderCurve)
  addAll(this@getAllChildren.lethalDose50)
  this@getAllChildren.halfLifePeriod?.let { add(it) }
}
