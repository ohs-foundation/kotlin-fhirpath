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

import dev.ohs.fhir.model.r5.Measure
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun Measure.getProperty(name: String): Any? =
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
    "subtitle" -> this.subtitle
    "status" -> this.status
    "experimental" -> this.experimental
    "subject" -> this.subject
    "basis" -> this.basis
    "date" -> this.date
    "publisher" -> this.publisher
    "contact" -> this.contact
    "description" -> this.description
    "useContext" -> this.useContext
    "jurisdiction" -> this.jurisdiction
    "purpose" -> this.purpose
    "usage" -> this.usage
    "copyright" -> this.copyright
    "copyrightLabel" -> this.copyrightLabel
    "approvalDate" -> this.approvalDate
    "lastReviewDate" -> this.lastReviewDate
    "effectivePeriod" -> this.effectivePeriod
    "topic" -> this.topic
    "author" -> this.author
    "editor" -> this.editor
    "reviewer" -> this.reviewer
    "endorser" -> this.endorser
    "relatedArtifact" -> this.relatedArtifact
    "library" -> this.library
    "disclaimer" -> this.disclaimer
    "scoring" -> this.scoring
    "scoringUnit" -> this.scoringUnit
    "compositeScoring" -> this.compositeScoring
    "type" -> this.type
    "riskAdjustment" -> this.riskAdjustment
    "rateAggregation" -> this.rateAggregation
    "rationale" -> this.rationale
    "clinicalRecommendationStatement" -> this.clinicalRecommendationStatement
    "improvementNotation" -> this.improvementNotation
    "term" -> this.term
    "guidance" -> this.guidance
    "group" -> this.group
    "supplementalData" -> this.supplementalData
    else -> error("$name is not a valid property name")
  }

internal fun Measure.hasProperty(name: String): Boolean =
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
    "subtitle" -> true
    "status" -> true
    "experimental" -> true
    "subject" -> true
    "basis" -> true
    "date" -> true
    "publisher" -> true
    "contact" -> true
    "description" -> true
    "useContext" -> true
    "jurisdiction" -> true
    "purpose" -> true
    "usage" -> true
    "copyright" -> true
    "copyrightLabel" -> true
    "approvalDate" -> true
    "lastReviewDate" -> true
    "effectivePeriod" -> true
    "topic" -> true
    "author" -> true
    "editor" -> true
    "reviewer" -> true
    "endorser" -> true
    "relatedArtifact" -> true
    "library" -> true
    "disclaimer" -> true
    "scoring" -> true
    "scoringUnit" -> true
    "compositeScoring" -> true
    "type" -> true
    "riskAdjustment" -> true
    "rateAggregation" -> true
    "rationale" -> true
    "clinicalRecommendationStatement" -> true
    "improvementNotation" -> true
    "term" -> true
    "guidance" -> true
    "group" -> true
    "supplementalData" -> true
    else -> false
  }

internal fun Measure.getAllChildren(): List<Any> = buildList {
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
  this@getAllChildren.subtitle?.let { add(it) }
  add(this@getAllChildren.status)
  this@getAllChildren.experimental?.let { add(it) }
  this@getAllChildren.subject?.let { add(it) }
  this@getAllChildren.basis?.let { add(it) }
  this@getAllChildren.date?.let { add(it) }
  this@getAllChildren.publisher?.let { add(it) }
  addAll(this@getAllChildren.contact)
  this@getAllChildren.description?.let { add(it) }
  addAll(this@getAllChildren.useContext)
  addAll(this@getAllChildren.jurisdiction)
  this@getAllChildren.purpose?.let { add(it) }
  this@getAllChildren.usage?.let { add(it) }
  this@getAllChildren.copyright?.let { add(it) }
  this@getAllChildren.copyrightLabel?.let { add(it) }
  this@getAllChildren.approvalDate?.let { add(it) }
  this@getAllChildren.lastReviewDate?.let { add(it) }
  this@getAllChildren.effectivePeriod?.let { add(it) }
  addAll(this@getAllChildren.topic)
  addAll(this@getAllChildren.author)
  addAll(this@getAllChildren.editor)
  addAll(this@getAllChildren.reviewer)
  addAll(this@getAllChildren.endorser)
  addAll(this@getAllChildren.relatedArtifact)
  addAll(this@getAllChildren.library)
  this@getAllChildren.disclaimer?.let { add(it) }
  this@getAllChildren.scoring?.let { add(it) }
  this@getAllChildren.scoringUnit?.let { add(it) }
  this@getAllChildren.compositeScoring?.let { add(it) }
  addAll(this@getAllChildren.type)
  this@getAllChildren.riskAdjustment?.let { add(it) }
  this@getAllChildren.rateAggregation?.let { add(it) }
  this@getAllChildren.rationale?.let { add(it) }
  this@getAllChildren.clinicalRecommendationStatement?.let { add(it) }
  this@getAllChildren.improvementNotation?.let { add(it) }
  addAll(this@getAllChildren.term)
  this@getAllChildren.guidance?.let { add(it) }
  addAll(this@getAllChildren.group)
  addAll(this@getAllChildren.supplementalData)
}

internal fun Measure.Term.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "code" -> this.code
    "definition" -> this.definition
    else -> error("$name is not a valid property name")
  }

internal fun Measure.Term.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "code" -> true
    "definition" -> true
    else -> false
  }

internal fun Measure.Term.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.code?.let { add(it) }
  this@getAllChildren.definition?.let { add(it) }
}

internal fun Measure.Group.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "linkId" -> this.linkId
    "code" -> this.code
    "description" -> this.description
    "type" -> this.type
    "subject" -> this.subject
    "basis" -> this.basis
    "scoring" -> this.scoring
    "scoringUnit" -> this.scoringUnit
    "rateAggregation" -> this.rateAggregation
    "improvementNotation" -> this.improvementNotation
    "library" -> this.library
    "population" -> this.population
    "stratifier" -> this.stratifier
    else -> error("$name is not a valid property name")
  }

internal fun Measure.Group.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "linkId" -> true
    "code" -> true
    "description" -> true
    "type" -> true
    "subject" -> true
    "basis" -> true
    "scoring" -> true
    "scoringUnit" -> true
    "rateAggregation" -> true
    "improvementNotation" -> true
    "library" -> true
    "population" -> true
    "stratifier" -> true
    else -> false
  }

internal fun Measure.Group.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.linkId?.let { add(it) }
  this@getAllChildren.code?.let { add(it) }
  this@getAllChildren.description?.let { add(it) }
  addAll(this@getAllChildren.type)
  this@getAllChildren.subject?.let { add(it) }
  this@getAllChildren.basis?.let { add(it) }
  this@getAllChildren.scoring?.let { add(it) }
  this@getAllChildren.scoringUnit?.let { add(it) }
  this@getAllChildren.rateAggregation?.let { add(it) }
  this@getAllChildren.improvementNotation?.let { add(it) }
  addAll(this@getAllChildren.library)
  addAll(this@getAllChildren.population)
  addAll(this@getAllChildren.stratifier)
}

internal fun Measure.Group.Population.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "linkId" -> this.linkId
    "code" -> this.code
    "description" -> this.description
    "criteria" -> this.criteria
    "groupDefinition" -> this.groupDefinition
    "inputPopulationId" -> this.inputPopulationId
    "aggregateMethod" -> this.aggregateMethod
    else -> error("$name is not a valid property name")
  }

internal fun Measure.Group.Population.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "linkId" -> true
    "code" -> true
    "description" -> true
    "criteria" -> true
    "groupDefinition" -> true
    "inputPopulationId" -> true
    "aggregateMethod" -> true
    else -> false
  }

internal fun Measure.Group.Population.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.linkId?.let { add(it) }
  this@getAllChildren.code?.let { add(it) }
  this@getAllChildren.description?.let { add(it) }
  this@getAllChildren.criteria?.let { add(it) }
  this@getAllChildren.groupDefinition?.let { add(it) }
  this@getAllChildren.inputPopulationId?.let { add(it) }
  this@getAllChildren.aggregateMethod?.let { add(it) }
}

internal fun Measure.Group.Stratifier.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "linkId" -> this.linkId
    "code" -> this.code
    "description" -> this.description
    "criteria" -> this.criteria
    "groupDefinition" -> this.groupDefinition
    "component" -> this.component
    else -> error("$name is not a valid property name")
  }

internal fun Measure.Group.Stratifier.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "linkId" -> true
    "code" -> true
    "description" -> true
    "criteria" -> true
    "groupDefinition" -> true
    "component" -> true
    else -> false
  }

internal fun Measure.Group.Stratifier.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.linkId?.let { add(it) }
  this@getAllChildren.code?.let { add(it) }
  this@getAllChildren.description?.let { add(it) }
  this@getAllChildren.criteria?.let { add(it) }
  this@getAllChildren.groupDefinition?.let { add(it) }
  addAll(this@getAllChildren.component)
}

internal fun Measure.Group.Stratifier.Component.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "linkId" -> this.linkId
    "code" -> this.code
    "description" -> this.description
    "criteria" -> this.criteria
    "groupDefinition" -> this.groupDefinition
    else -> error("$name is not a valid property name")
  }

internal fun Measure.Group.Stratifier.Component.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "linkId" -> true
    "code" -> true
    "description" -> true
    "criteria" -> true
    "groupDefinition" -> true
    else -> false
  }

internal fun Measure.Group.Stratifier.Component.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.linkId?.let { add(it) }
  this@getAllChildren.code?.let { add(it) }
  this@getAllChildren.description?.let { add(it) }
  this@getAllChildren.criteria?.let { add(it) }
  this@getAllChildren.groupDefinition?.let { add(it) }
}

internal fun Measure.SupplementalData.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "linkId" -> this.linkId
    "code" -> this.code
    "usage" -> this.usage
    "description" -> this.description
    "criteria" -> this.criteria
    else -> error("$name is not a valid property name")
  }

internal fun Measure.SupplementalData.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "linkId" -> true
    "code" -> true
    "usage" -> true
    "description" -> true
    "criteria" -> true
    else -> false
  }

internal fun Measure.SupplementalData.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.linkId?.let { add(it) }
  this@getAllChildren.code?.let { add(it) }
  addAll(this@getAllChildren.usage)
  this@getAllChildren.description?.let { add(it) }
  add(this@getAllChildren.criteria)
}
