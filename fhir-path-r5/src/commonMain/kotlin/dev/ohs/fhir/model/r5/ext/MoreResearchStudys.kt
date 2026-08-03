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

import dev.ohs.fhir.model.r5.ResearchStudy
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun ResearchStudy.getProperty(name: String): Any? =
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
    "label" -> this.label
    "protocol" -> this.protocol
    "partOf" -> this.partOf
    "relatedArtifact" -> this.relatedArtifact
    "date" -> this.date
    "status" -> this.status
    "primaryPurposeType" -> this.primaryPurposeType
    "phase" -> this.phase
    "studyDesign" -> this.studyDesign
    "focus" -> this.focus
    "condition" -> this.condition
    "keyword" -> this.keyword
    "region" -> this.region
    "descriptionSummary" -> this.descriptionSummary
    "description" -> this.description
    "period" -> this.period
    "site" -> this.site
    "note" -> this.note
    "classifier" -> this.classifier
    "associatedParty" -> this.associatedParty
    "progressStatus" -> this.progressStatus
    "whyStopped" -> this.whyStopped
    "recruitment" -> this.recruitment
    "comparisonGroup" -> this.comparisonGroup
    "objective" -> this.objective
    "outcomeMeasure" -> this.outcomeMeasure
    "result" -> this.result
    else -> error("$name is not a valid property name")
  }

internal fun ResearchStudy.hasProperty(name: String): Boolean =
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
    "label" -> true
    "protocol" -> true
    "partOf" -> true
    "relatedArtifact" -> true
    "date" -> true
    "status" -> true
    "primaryPurposeType" -> true
    "phase" -> true
    "studyDesign" -> true
    "focus" -> true
    "condition" -> true
    "keyword" -> true
    "region" -> true
    "descriptionSummary" -> true
    "description" -> true
    "period" -> true
    "site" -> true
    "note" -> true
    "classifier" -> true
    "associatedParty" -> true
    "progressStatus" -> true
    "whyStopped" -> true
    "recruitment" -> true
    "comparisonGroup" -> true
    "objective" -> true
    "outcomeMeasure" -> true
    "result" -> true
    else -> false
  }

internal fun ResearchStudy.getAllChildren(): List<Any> = buildList {
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
  addAll(this@getAllChildren.label)
  addAll(this@getAllChildren.protocol)
  addAll(this@getAllChildren.partOf)
  addAll(this@getAllChildren.relatedArtifact)
  this@getAllChildren.date?.let { add(it) }
  add(this@getAllChildren.status)
  this@getAllChildren.primaryPurposeType?.let { add(it) }
  this@getAllChildren.phase?.let { add(it) }
  addAll(this@getAllChildren.studyDesign)
  addAll(this@getAllChildren.focus)
  addAll(this@getAllChildren.condition)
  addAll(this@getAllChildren.keyword)
  addAll(this@getAllChildren.region)
  this@getAllChildren.descriptionSummary?.let { add(it) }
  this@getAllChildren.description?.let { add(it) }
  this@getAllChildren.period?.let { add(it) }
  addAll(this@getAllChildren.site)
  addAll(this@getAllChildren.note)
  addAll(this@getAllChildren.classifier)
  addAll(this@getAllChildren.associatedParty)
  addAll(this@getAllChildren.progressStatus)
  this@getAllChildren.whyStopped?.let { add(it) }
  this@getAllChildren.recruitment?.let { add(it) }
  addAll(this@getAllChildren.comparisonGroup)
  addAll(this@getAllChildren.objective)
  addAll(this@getAllChildren.outcomeMeasure)
  addAll(this@getAllChildren.result)
}

internal fun ResearchStudy.Label.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "value" -> this.`value`
    else -> error("$name is not a valid property name")
  }

internal fun ResearchStudy.Label.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "value" -> true
    else -> false
  }

internal fun ResearchStudy.Label.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.type?.let { add(it) }
  this@getAllChildren.`value`?.let { add(it) }
}

internal fun ResearchStudy.AssociatedParty.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "name" -> this.name
    "role" -> this.role
    "period" -> this.period
    "classifier" -> this.classifier
    "party" -> this.party
    else -> error("$name is not a valid property name")
  }

internal fun ResearchStudy.AssociatedParty.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "name" -> true
    "role" -> true
    "period" -> true
    "classifier" -> true
    "party" -> true
    else -> false
  }

internal fun ResearchStudy.AssociatedParty.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.name?.let { add(it) }
  add(this@getAllChildren.role)
  addAll(this@getAllChildren.period)
  addAll(this@getAllChildren.classifier)
  this@getAllChildren.party?.let { add(it) }
}

internal fun ResearchStudy.ProgressStatus.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "state" -> this.state
    "actual" -> this.`actual`
    "period" -> this.period
    else -> error("$name is not a valid property name")
  }

internal fun ResearchStudy.ProgressStatus.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "state" -> true
    "actual" -> true
    "period" -> true
    else -> false
  }

internal fun ResearchStudy.ProgressStatus.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.state)
  this@getAllChildren.`actual`?.let { add(it) }
  this@getAllChildren.period?.let { add(it) }
}

internal fun ResearchStudy.Recruitment.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "targetNumber" -> this.targetNumber
    "actualNumber" -> this.actualNumber
    "eligibility" -> this.eligibility
    "actualGroup" -> this.actualGroup
    else -> error("$name is not a valid property name")
  }

internal fun ResearchStudy.Recruitment.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "targetNumber" -> true
    "actualNumber" -> true
    "eligibility" -> true
    "actualGroup" -> true
    else -> false
  }

internal fun ResearchStudy.Recruitment.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.targetNumber?.let { add(it) }
  this@getAllChildren.actualNumber?.let { add(it) }
  this@getAllChildren.eligibility?.let { add(it) }
  this@getAllChildren.actualGroup?.let { add(it) }
}

internal fun ResearchStudy.ComparisonGroup.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "linkId" -> this.linkId
    "name" -> this.name
    "type" -> this.type
    "description" -> this.description
    "intendedExposure" -> this.intendedExposure
    "observedGroup" -> this.observedGroup
    else -> error("$name is not a valid property name")
  }

internal fun ResearchStudy.ComparisonGroup.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "linkId" -> true
    "name" -> true
    "type" -> true
    "description" -> true
    "intendedExposure" -> true
    "observedGroup" -> true
    else -> false
  }

internal fun ResearchStudy.ComparisonGroup.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.linkId?.let { add(it) }
  add(this@getAllChildren.name)
  this@getAllChildren.type?.let { add(it) }
  this@getAllChildren.description?.let { add(it) }
  addAll(this@getAllChildren.intendedExposure)
  this@getAllChildren.observedGroup?.let { add(it) }
}

internal fun ResearchStudy.Objective.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "name" -> this.name
    "type" -> this.type
    "description" -> this.description
    else -> error("$name is not a valid property name")
  }

internal fun ResearchStudy.Objective.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "name" -> true
    "type" -> true
    "description" -> true
    else -> false
  }

internal fun ResearchStudy.Objective.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.name?.let { add(it) }
  this@getAllChildren.type?.let { add(it) }
  this@getAllChildren.description?.let { add(it) }
}

internal fun ResearchStudy.OutcomeMeasure.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "name" -> this.name
    "type" -> this.type
    "description" -> this.description
    "reference" -> this.reference
    else -> error("$name is not a valid property name")
  }

internal fun ResearchStudy.OutcomeMeasure.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "name" -> true
    "type" -> true
    "description" -> true
    "reference" -> true
    else -> false
  }

internal fun ResearchStudy.OutcomeMeasure.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.name?.let { add(it) }
  addAll(this@getAllChildren.type)
  this@getAllChildren.description?.let { add(it) }
  this@getAllChildren.reference?.let { add(it) }
}
