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

import dev.ohs.fhir.model.r5.Evidence
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun Evidence.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "meta" -> this.meta
    "implicitRules" -> this.implicitRules
    "language" -> this.language
    "text" -> this.text
    "contained" -> this.contained
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "url" -> this.url
    "identifier" -> this.identifier
    "version" -> this.version
    "versionAlgorithm" -> this.versionAlgorithm
    "name" -> this.name
    "title" -> this.title
    "citeAs" -> this.citeAs
    "status" -> this.status
    "experimental" -> this.experimental
    "date" -> this.date
    "approvalDate" -> this.approvalDate
    "lastReviewDate" -> this.lastReviewDate
    "publisher" -> this.publisher
    "contact" -> this.contact
    "author" -> this.author
    "editor" -> this.editor
    "reviewer" -> this.reviewer
    "endorser" -> this.endorser
    "useContext" -> this.useContext
    "purpose" -> this.purpose
    "copyright" -> this.copyright
    "copyrightLabel" -> this.copyrightLabel
    "relatedArtifact" -> this.relatedArtifact
    "description" -> this.description
    "assertion" -> this.assertion
    "note" -> this.note
    "variableDefinition" -> this.variableDefinition
    "synthesisType" -> this.synthesisType
    "studyDesign" -> this.studyDesign
    "statistic" -> this.statistic
    "certainty" -> this.certainty
    else -> error("$name is not a valid property name")
  }

internal fun Evidence.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "meta" -> true
    "implicitRules" -> true
    "language" -> true
    "text" -> true
    "contained" -> true
    "extension" -> true
    "modifierExtension" -> true
    "url" -> true
    "identifier" -> true
    "version" -> true
    "versionAlgorithm" -> true
    "name" -> true
    "title" -> true
    "citeAs" -> true
    "status" -> true
    "experimental" -> true
    "date" -> true
    "approvalDate" -> true
    "lastReviewDate" -> true
    "publisher" -> true
    "contact" -> true
    "author" -> true
    "editor" -> true
    "reviewer" -> true
    "endorser" -> true
    "useContext" -> true
    "purpose" -> true
    "copyright" -> true
    "copyrightLabel" -> true
    "relatedArtifact" -> true
    "description" -> true
    "assertion" -> true
    "note" -> true
    "variableDefinition" -> true
    "synthesisType" -> true
    "studyDesign" -> true
    "statistic" -> true
    "certainty" -> true
    else -> false
  }

internal fun Evidence.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.meta?.let { add(it) }
  this@getAllChildren.implicitRules?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.contained)
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.url?.let { add(it) }
  addAll(this@getAllChildren.identifier)
  this@getAllChildren.version?.let { add(it) }
  this@getAllChildren.versionAlgorithm?.let { add(it) }
  this@getAllChildren.name?.let { add(it) }
  this@getAllChildren.title?.let { add(it) }
  this@getAllChildren.citeAs?.let { add(it) }
  add(this@getAllChildren.status)
  this@getAllChildren.experimental?.let { add(it) }
  this@getAllChildren.date?.let { add(it) }
  this@getAllChildren.approvalDate?.let { add(it) }
  this@getAllChildren.lastReviewDate?.let { add(it) }
  this@getAllChildren.publisher?.let { add(it) }
  addAll(this@getAllChildren.contact)
  addAll(this@getAllChildren.author)
  addAll(this@getAllChildren.editor)
  addAll(this@getAllChildren.reviewer)
  addAll(this@getAllChildren.endorser)
  addAll(this@getAllChildren.useContext)
  this@getAllChildren.purpose?.let { add(it) }
  this@getAllChildren.copyright?.let { add(it) }
  this@getAllChildren.copyrightLabel?.let { add(it) }
  addAll(this@getAllChildren.relatedArtifact)
  this@getAllChildren.description?.let { add(it) }
  this@getAllChildren.assertion?.let { add(it) }
  addAll(this@getAllChildren.note)
  addAll(this@getAllChildren.variableDefinition)
  this@getAllChildren.synthesisType?.let { add(it) }
  addAll(this@getAllChildren.studyDesign)
  addAll(this@getAllChildren.statistic)
  addAll(this@getAllChildren.certainty)
}

internal fun Evidence.VariableDefinition.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "description" -> this.description
    "note" -> this.note
    "variableRole" -> this.variableRole
    "observed" -> this.observed
    "intended" -> this.intended
    "directnessMatch" -> this.directnessMatch
    else -> error("$name is not a valid property name")
  }

internal fun Evidence.VariableDefinition.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "description" -> true
    "note" -> true
    "variableRole" -> true
    "observed" -> true
    "intended" -> true
    "directnessMatch" -> true
    else -> false
  }

internal fun Evidence.VariableDefinition.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.description?.let { add(it) }
  addAll(this@getAllChildren.note)
  add(this@getAllChildren.variableRole)
  this@getAllChildren.observed?.let { add(it) }
  this@getAllChildren.intended?.let { add(it) }
  this@getAllChildren.directnessMatch?.let { add(it) }
}

internal fun Evidence.Statistic.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "description" -> this.description
    "note" -> this.note
    "statisticType" -> this.statisticType
    "category" -> this.category
    "quantity" -> this.quantity
    "numberOfEvents" -> this.numberOfEvents
    "numberAffected" -> this.numberAffected
    "sampleSize" -> this.sampleSize
    "attributeEstimate" -> this.attributeEstimate
    "modelCharacteristic" -> this.modelCharacteristic
    else -> error("$name is not a valid property name")
  }

internal fun Evidence.Statistic.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "description" -> true
    "note" -> true
    "statisticType" -> true
    "category" -> true
    "quantity" -> true
    "numberOfEvents" -> true
    "numberAffected" -> true
    "sampleSize" -> true
    "attributeEstimate" -> true
    "modelCharacteristic" -> true
    else -> false
  }

internal fun Evidence.Statistic.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.description?.let { add(it) }
  addAll(this@getAllChildren.note)
  this@getAllChildren.statisticType?.let { add(it) }
  this@getAllChildren.category?.let { add(it) }
  this@getAllChildren.quantity?.let { add(it) }
  this@getAllChildren.numberOfEvents?.let { add(it) }
  this@getAllChildren.numberAffected?.let { add(it) }
  this@getAllChildren.sampleSize?.let { add(it) }
  addAll(this@getAllChildren.attributeEstimate)
  addAll(this@getAllChildren.modelCharacteristic)
}

internal fun Evidence.Statistic.SampleSize.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "description" -> this.description
    "note" -> this.note
    "numberOfStudies" -> this.numberOfStudies
    "numberOfParticipants" -> this.numberOfParticipants
    "knownDataCount" -> this.knownDataCount
    else -> error("$name is not a valid property name")
  }

internal fun Evidence.Statistic.SampleSize.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "description" -> true
    "note" -> true
    "numberOfStudies" -> true
    "numberOfParticipants" -> true
    "knownDataCount" -> true
    else -> false
  }

internal fun Evidence.Statistic.SampleSize.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.description?.let { add(it) }
  addAll(this@getAllChildren.note)
  this@getAllChildren.numberOfStudies?.let { add(it) }
  this@getAllChildren.numberOfParticipants?.let { add(it) }
  this@getAllChildren.knownDataCount?.let { add(it) }
}

internal fun Evidence.Statistic.AttributeEstimate.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "description" -> this.description
    "note" -> this.note
    "type" -> this.type
    "quantity" -> this.quantity
    "level" -> this.level
    "range" -> this.range
    "attributeEstimate" -> this.attributeEstimate
    else -> error("$name is not a valid property name")
  }

internal fun Evidence.Statistic.AttributeEstimate.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "description" -> true
    "note" -> true
    "type" -> true
    "quantity" -> true
    "level" -> true
    "range" -> true
    "attributeEstimate" -> true
    else -> false
  }

internal fun Evidence.Statistic.AttributeEstimate.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.description?.let { add(it) }
  addAll(this@getAllChildren.note)
  this@getAllChildren.type?.let { add(it) }
  this@getAllChildren.quantity?.let { add(it) }
  this@getAllChildren.level?.let { add(it) }
  this@getAllChildren.range?.let { add(it) }
  addAll(this@getAllChildren.attributeEstimate)
}

internal fun Evidence.Statistic.ModelCharacteristic.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "code" -> this.code
    "value" -> this.`value`
    "variable" -> this.variable
    "attributeEstimate" -> this.attributeEstimate
    else -> error("$name is not a valid property name")
  }

internal fun Evidence.Statistic.ModelCharacteristic.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "code" -> true
    "value" -> true
    "variable" -> true
    "attributeEstimate" -> true
    else -> false
  }

internal fun Evidence.Statistic.ModelCharacteristic.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.code)
  this@getAllChildren.`value`?.let { add(it) }
  addAll(this@getAllChildren.variable)
  addAll(this@getAllChildren.attributeEstimate)
}

internal fun Evidence.Statistic.ModelCharacteristic.Variable.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "variableDefinition" -> this.variableDefinition
    "handling" -> this.handling
    "valueCategory" -> this.valueCategory
    "valueQuantity" -> this.valueQuantity
    "valueRange" -> this.valueRange
    else -> error("$name is not a valid property name")
  }

internal fun Evidence.Statistic.ModelCharacteristic.Variable.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "variableDefinition" -> true
    "handling" -> true
    "valueCategory" -> true
    "valueQuantity" -> true
    "valueRange" -> true
    else -> false
  }

internal fun Evidence.Statistic.ModelCharacteristic.Variable.getAllChildren(): List<Any> =
  buildList {
    this@getAllChildren.id?.let { add(it) }
    addAll(this@getAllChildren.extension)
    addAll(this@getAllChildren.modifierExtension)
    add(this@getAllChildren.variableDefinition)
    this@getAllChildren.handling?.let { add(it) }
    addAll(this@getAllChildren.valueCategory)
    addAll(this@getAllChildren.valueQuantity)
    addAll(this@getAllChildren.valueRange)
  }

internal fun Evidence.Certainty.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "description" -> this.description
    "note" -> this.note
    "type" -> this.type
    "rating" -> this.rating
    "rater" -> this.rater
    "subcomponent" -> this.subcomponent
    else -> error("$name is not a valid property name")
  }

internal fun Evidence.Certainty.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "description" -> true
    "note" -> true
    "type" -> true
    "rating" -> true
    "rater" -> true
    "subcomponent" -> true
    else -> false
  }

internal fun Evidence.Certainty.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.description?.let { add(it) }
  addAll(this@getAllChildren.note)
  this@getAllChildren.type?.let { add(it) }
  this@getAllChildren.rating?.let { add(it) }
  this@getAllChildren.rater?.let { add(it) }
  addAll(this@getAllChildren.subcomponent)
}
