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

import dev.ohs.fhir.model.r4b.ClinicalUseDefinition
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun ClinicalUseDefinition.getProperty(name: String): Any? =
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
    "category" -> this.category
    "subject" -> this.subject
    "status" -> this.status
    "contraindication" -> this.contraindication
    "indication" -> this.indication
    "interaction" -> this.interaction
    "population" -> this.population
    "undesirableEffect" -> this.undesirableEffect
    "warning" -> this.warning
    else -> error("$name is not a valid property name")
  }

internal fun ClinicalUseDefinition.hasProperty(name: String): Boolean =
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
    "category" -> true
    "subject" -> true
    "status" -> true
    "contraindication" -> true
    "indication" -> true
    "interaction" -> true
    "population" -> true
    "undesirableEffect" -> true
    "warning" -> true
    else -> false
  }

internal fun ClinicalUseDefinition.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.meta?.let { add(it) }
  this@getAllChildren.implicitRules?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.contained)
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.identifier)
  add(this@getAllChildren.type)
  addAll(this@getAllChildren.category)
  addAll(this@getAllChildren.subject)
  this@getAllChildren.status?.let { add(it) }
  this@getAllChildren.contraindication?.let { add(it) }
  this@getAllChildren.indication?.let { add(it) }
  this@getAllChildren.interaction?.let { add(it) }
  addAll(this@getAllChildren.population)
  this@getAllChildren.undesirableEffect?.let { add(it) }
  this@getAllChildren.warning?.let { add(it) }
}

internal fun ClinicalUseDefinition.Contraindication.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "diseaseSymptomProcedure" -> this.diseaseSymptomProcedure
    "diseaseStatus" -> this.diseaseStatus
    "comorbidity" -> this.comorbidity
    "indication" -> this.indication
    "otherTherapy" -> this.otherTherapy
    else -> error("$name is not a valid property name")
  }

internal fun ClinicalUseDefinition.Contraindication.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "diseaseSymptomProcedure" -> true
    "diseaseStatus" -> true
    "comorbidity" -> true
    "indication" -> true
    "otherTherapy" -> true
    else -> false
  }

internal fun ClinicalUseDefinition.Contraindication.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.diseaseSymptomProcedure?.let { add(it) }
  this@getAllChildren.diseaseStatus?.let { add(it) }
  addAll(this@getAllChildren.comorbidity)
  addAll(this@getAllChildren.indication)
  addAll(this@getAllChildren.otherTherapy)
}

internal fun ClinicalUseDefinition.Contraindication.OtherTherapy.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "relationshipType" -> this.relationshipType
    "therapy" -> this.therapy
    else -> error("$name is not a valid property name")
  }

internal fun ClinicalUseDefinition.Contraindication.OtherTherapy.hasProperty(
  name: String
): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "relationshipType" -> true
    "therapy" -> true
    else -> false
  }

internal fun ClinicalUseDefinition.Contraindication.OtherTherapy.getAllChildren(): List<Any> =
  buildList {
    this@getAllChildren.id?.let { add(it) }
    addAll(this@getAllChildren.extension)
    addAll(this@getAllChildren.modifierExtension)
    add(this@getAllChildren.relationshipType)
    add(this@getAllChildren.therapy)
  }

internal fun ClinicalUseDefinition.Indication.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "diseaseSymptomProcedure" -> this.diseaseSymptomProcedure
    "diseaseStatus" -> this.diseaseStatus
    "comorbidity" -> this.comorbidity
    "intendedEffect" -> this.intendedEffect
    "duration" -> this.duration
    "undesirableEffect" -> this.undesirableEffect
    "otherTherapy" -> this.otherTherapy
    else -> error("$name is not a valid property name")
  }

internal fun ClinicalUseDefinition.Indication.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "diseaseSymptomProcedure" -> true
    "diseaseStatus" -> true
    "comorbidity" -> true
    "intendedEffect" -> true
    "duration" -> true
    "undesirableEffect" -> true
    "otherTherapy" -> true
    else -> false
  }

internal fun ClinicalUseDefinition.Indication.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.diseaseSymptomProcedure?.let { add(it) }
  this@getAllChildren.diseaseStatus?.let { add(it) }
  addAll(this@getAllChildren.comorbidity)
  this@getAllChildren.intendedEffect?.let { add(it) }
  this@getAllChildren.duration?.let { add(it) }
  addAll(this@getAllChildren.undesirableEffect)
  addAll(this@getAllChildren.otherTherapy)
}

internal fun ClinicalUseDefinition.Interaction.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "interactant" -> this.interactant
    "type" -> this.type
    "effect" -> this.effect
    "incidence" -> this.incidence
    "management" -> this.management
    else -> error("$name is not a valid property name")
  }

internal fun ClinicalUseDefinition.Interaction.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "interactant" -> true
    "type" -> true
    "effect" -> true
    "incidence" -> true
    "management" -> true
    else -> false
  }

internal fun ClinicalUseDefinition.Interaction.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.interactant)
  this@getAllChildren.type?.let { add(it) }
  this@getAllChildren.effect?.let { add(it) }
  this@getAllChildren.incidence?.let { add(it) }
  addAll(this@getAllChildren.management)
}

internal fun ClinicalUseDefinition.Interaction.Interactant.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "item" -> this.item
    else -> error("$name is not a valid property name")
  }

internal fun ClinicalUseDefinition.Interaction.Interactant.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "item" -> true
    else -> false
  }

internal fun ClinicalUseDefinition.Interaction.Interactant.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.item)
}

internal fun ClinicalUseDefinition.UndesirableEffect.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "symptomConditionEffect" -> this.symptomConditionEffect
    "classification" -> this.classification
    "frequencyOfOccurrence" -> this.frequencyOfOccurrence
    else -> error("$name is not a valid property name")
  }

internal fun ClinicalUseDefinition.UndesirableEffect.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "symptomConditionEffect" -> true
    "classification" -> true
    "frequencyOfOccurrence" -> true
    else -> false
  }

internal fun ClinicalUseDefinition.UndesirableEffect.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.symptomConditionEffect?.let { add(it) }
  this@getAllChildren.classification?.let { add(it) }
  this@getAllChildren.frequencyOfOccurrence?.let { add(it) }
}

internal fun ClinicalUseDefinition.Warning.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "description" -> this.description
    "code" -> this.code
    else -> error("$name is not a valid property name")
  }

internal fun ClinicalUseDefinition.Warning.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "description" -> true
    "code" -> true
    else -> false
  }

internal fun ClinicalUseDefinition.Warning.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.description?.let { add(it) }
  this@getAllChildren.code?.let { add(it) }
}
