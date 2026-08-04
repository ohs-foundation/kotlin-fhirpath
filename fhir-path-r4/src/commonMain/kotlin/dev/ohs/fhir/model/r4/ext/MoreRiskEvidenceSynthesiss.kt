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

import dev.ohs.fhir.model.r4.RiskEvidenceSynthesis
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun RiskEvidenceSynthesis.getProperty(name: String): Any? =
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
    "name" -> this.name
    "title" -> this.title
    "status" -> this.status
    "date" -> this.date
    "publisher" -> this.publisher
    "contact" -> this.contact
    "description" -> this.description
    "note" -> this.note
    "useContext" -> this.useContext
    "jurisdiction" -> this.jurisdiction
    "copyright" -> this.copyright
    "approvalDate" -> this.approvalDate
    "lastReviewDate" -> this.lastReviewDate
    "effectivePeriod" -> this.effectivePeriod
    "topic" -> this.topic
    "author" -> this.author
    "editor" -> this.editor
    "reviewer" -> this.reviewer
    "endorser" -> this.endorser
    "relatedArtifact" -> this.relatedArtifact
    "synthesisType" -> this.synthesisType
    "studyType" -> this.studyType
    "population" -> this.population
    "exposure" -> this.exposure
    "outcome" -> this.outcome
    "sampleSize" -> this.sampleSize
    "riskEstimate" -> this.riskEstimate
    "certainty" -> this.certainty
    else -> error("$name is not a valid property name")
  }

internal fun RiskEvidenceSynthesis.hasProperty(name: String): Boolean =
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
    "name" -> true
    "title" -> true
    "status" -> true
    "date" -> true
    "publisher" -> true
    "contact" -> true
    "description" -> true
    "note" -> true
    "useContext" -> true
    "jurisdiction" -> true
    "copyright" -> true
    "approvalDate" -> true
    "lastReviewDate" -> true
    "effectivePeriod" -> true
    "topic" -> true
    "author" -> true
    "editor" -> true
    "reviewer" -> true
    "endorser" -> true
    "relatedArtifact" -> true
    "synthesisType" -> true
    "studyType" -> true
    "population" -> true
    "exposure" -> true
    "outcome" -> true
    "sampleSize" -> true
    "riskEstimate" -> true
    "certainty" -> true
    else -> false
  }

internal fun RiskEvidenceSynthesis.getAllChildren(): List<Any> = buildList {
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
  this@getAllChildren.name?.let { add(it) }
  this@getAllChildren.title?.let { add(it) }
  add(this@getAllChildren.status)
  this@getAllChildren.date?.let { add(it) }
  this@getAllChildren.publisher?.let { add(it) }
  addAll(this@getAllChildren.contact)
  this@getAllChildren.description?.let { add(it) }
  addAll(this@getAllChildren.note)
  addAll(this@getAllChildren.useContext)
  addAll(this@getAllChildren.jurisdiction)
  this@getAllChildren.copyright?.let { add(it) }
  this@getAllChildren.approvalDate?.let { add(it) }
  this@getAllChildren.lastReviewDate?.let { add(it) }
  this@getAllChildren.effectivePeriod?.let { add(it) }
  addAll(this@getAllChildren.topic)
  addAll(this@getAllChildren.author)
  addAll(this@getAllChildren.editor)
  addAll(this@getAllChildren.reviewer)
  addAll(this@getAllChildren.endorser)
  addAll(this@getAllChildren.relatedArtifact)
  this@getAllChildren.synthesisType?.let { add(it) }
  this@getAllChildren.studyType?.let { add(it) }
  add(this@getAllChildren.population)
  this@getAllChildren.exposure?.let { add(it) }
  add(this@getAllChildren.outcome)
  this@getAllChildren.sampleSize?.let { add(it) }
  this@getAllChildren.riskEstimate?.let { add(it) }
  addAll(this@getAllChildren.certainty)
}

internal fun RiskEvidenceSynthesis.SampleSize.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "description" -> this.description
    "numberOfStudies" -> this.numberOfStudies
    "numberOfParticipants" -> this.numberOfParticipants
    else -> error("$name is not a valid property name")
  }

internal fun RiskEvidenceSynthesis.SampleSize.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "description" -> true
    "numberOfStudies" -> true
    "numberOfParticipants" -> true
    else -> false
  }

internal fun RiskEvidenceSynthesis.SampleSize.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.description?.let { add(it) }
  this@getAllChildren.numberOfStudies?.let { add(it) }
  this@getAllChildren.numberOfParticipants?.let { add(it) }
}

internal fun RiskEvidenceSynthesis.RiskEstimate.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "description" -> this.description
    "type" -> this.type
    "value" -> this.`value`
    "unitOfMeasure" -> this.unitOfMeasure
    "denominatorCount" -> this.denominatorCount
    "numeratorCount" -> this.numeratorCount
    "precisionEstimate" -> this.precisionEstimate
    else -> error("$name is not a valid property name")
  }

internal fun RiskEvidenceSynthesis.RiskEstimate.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "description" -> true
    "type" -> true
    "value" -> true
    "unitOfMeasure" -> true
    "denominatorCount" -> true
    "numeratorCount" -> true
    "precisionEstimate" -> true
    else -> false
  }

internal fun RiskEvidenceSynthesis.RiskEstimate.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.description?.let { add(it) }
  this@getAllChildren.type?.let { add(it) }
  this@getAllChildren.`value`?.let { add(it) }
  this@getAllChildren.unitOfMeasure?.let { add(it) }
  this@getAllChildren.denominatorCount?.let { add(it) }
  this@getAllChildren.numeratorCount?.let { add(it) }
  addAll(this@getAllChildren.precisionEstimate)
}

internal fun RiskEvidenceSynthesis.RiskEstimate.PrecisionEstimate.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "level" -> this.level
    "from" -> this.from
    "to" -> this.to
    else -> error("$name is not a valid property name")
  }

internal fun RiskEvidenceSynthesis.RiskEstimate.PrecisionEstimate.hasProperty(
  name: String
): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "level" -> true
    "from" -> true
    "to" -> true
    else -> false
  }

internal fun RiskEvidenceSynthesis.RiskEstimate.PrecisionEstimate.getAllChildren(): List<Any> =
  buildList {
    this@getAllChildren.id?.let { add(it) }
    addAll(this@getAllChildren.extension)
    addAll(this@getAllChildren.modifierExtension)
    this@getAllChildren.type?.let { add(it) }
    this@getAllChildren.level?.let { add(it) }
    this@getAllChildren.from?.let { add(it) }
    this@getAllChildren.to?.let { add(it) }
  }

internal fun RiskEvidenceSynthesis.Certainty.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "rating" -> this.rating
    "note" -> this.note
    "certaintySubcomponent" -> this.certaintySubcomponent
    else -> error("$name is not a valid property name")
  }

internal fun RiskEvidenceSynthesis.Certainty.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "rating" -> true
    "note" -> true
    "certaintySubcomponent" -> true
    else -> false
  }

internal fun RiskEvidenceSynthesis.Certainty.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.rating)
  addAll(this@getAllChildren.note)
  addAll(this@getAllChildren.certaintySubcomponent)
}

internal fun RiskEvidenceSynthesis.Certainty.CertaintySubcomponent.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "rating" -> this.rating
    "note" -> this.note
    else -> error("$name is not a valid property name")
  }

internal fun RiskEvidenceSynthesis.Certainty.CertaintySubcomponent.hasProperty(
  name: String
): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "rating" -> true
    "note" -> true
    else -> false
  }

internal fun RiskEvidenceSynthesis.Certainty.CertaintySubcomponent.getAllChildren(): List<Any> =
  buildList {
    this@getAllChildren.id?.let { add(it) }
    addAll(this@getAllChildren.extension)
    addAll(this@getAllChildren.modifierExtension)
    this@getAllChildren.type?.let { add(it) }
    addAll(this@getAllChildren.rating)
    addAll(this@getAllChildren.note)
  }
