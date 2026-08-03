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

import dev.ohs.fhir.model.r5.ConditionDefinition
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun ConditionDefinition.getProperty(name: String): Any? =
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
    "date" -> this.date
    "publisher" -> this.publisher
    "contact" -> this.contact
    "description" -> this.description
    "useContext" -> this.useContext
    "jurisdiction" -> this.jurisdiction
    "code" -> this.code
    "severity" -> this.severity
    "bodySite" -> this.bodySite
    "stage" -> this.stage
    "hasSeverity" -> this.hasSeverity
    "hasBodySite" -> this.hasBodySite
    "hasStage" -> this.hasStage
    "definition" -> this.definition
    "observation" -> this.observation
    "medication" -> this.medication
    "precondition" -> this.precondition
    "team" -> this.team
    "questionnaire" -> this.questionnaire
    "plan" -> this.plan
    else -> error("$name is not a valid property name")
  }

internal fun ConditionDefinition.hasProperty(name: String): Boolean =
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
    "date" -> true
    "publisher" -> true
    "contact" -> true
    "description" -> true
    "useContext" -> true
    "jurisdiction" -> true
    "code" -> true
    "severity" -> true
    "bodySite" -> true
    "stage" -> true
    "hasSeverity" -> true
    "hasBodySite" -> true
    "hasStage" -> true
    "definition" -> true
    "observation" -> true
    "medication" -> true
    "precondition" -> true
    "team" -> true
    "questionnaire" -> true
    "plan" -> true
    else -> false
  }

internal fun ConditionDefinition.getAllChildren(): List<Any> = buildList {
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
  this@getAllChildren.date?.let { add(it) }
  this@getAllChildren.publisher?.let { add(it) }
  addAll(this@getAllChildren.contact)
  this@getAllChildren.description?.let { add(it) }
  addAll(this@getAllChildren.useContext)
  addAll(this@getAllChildren.jurisdiction)
  add(this@getAllChildren.code)
  this@getAllChildren.severity?.let { add(it) }
  this@getAllChildren.bodySite?.let { add(it) }
  this@getAllChildren.stage?.let { add(it) }
  this@getAllChildren.hasSeverity?.let { add(it) }
  this@getAllChildren.hasBodySite?.let { add(it) }
  this@getAllChildren.hasStage?.let { add(it) }
  addAll(this@getAllChildren.definition)
  addAll(this@getAllChildren.observation)
  addAll(this@getAllChildren.medication)
  addAll(this@getAllChildren.precondition)
  addAll(this@getAllChildren.team)
  addAll(this@getAllChildren.questionnaire)
  addAll(this@getAllChildren.plan)
}

internal fun ConditionDefinition.Observation.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "category" -> this.category
    "code" -> this.code
    else -> error("$name is not a valid property name")
  }

internal fun ConditionDefinition.Observation.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "category" -> true
    "code" -> true
    else -> false
  }

internal fun ConditionDefinition.Observation.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.category?.let { add(it) }
  this@getAllChildren.code?.let { add(it) }
}

internal fun ConditionDefinition.Medication.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "category" -> this.category
    "code" -> this.code
    else -> error("$name is not a valid property name")
  }

internal fun ConditionDefinition.Medication.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "category" -> true
    "code" -> true
    else -> false
  }

internal fun ConditionDefinition.Medication.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.category?.let { add(it) }
  this@getAllChildren.code?.let { add(it) }
}

internal fun ConditionDefinition.Precondition.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "code" -> this.code
    "value" -> this.`value`
    else -> error("$name is not a valid property name")
  }

internal fun ConditionDefinition.Precondition.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "code" -> true
    "value" -> true
    else -> false
  }

internal fun ConditionDefinition.Precondition.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.type)
  add(this@getAllChildren.code)
  this@getAllChildren.`value`?.let { add(it) }
}

internal fun ConditionDefinition.Questionnaire.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "purpose" -> this.purpose
    "reference" -> this.reference
    else -> error("$name is not a valid property name")
  }

internal fun ConditionDefinition.Questionnaire.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "purpose" -> true
    "reference" -> true
    else -> false
  }

internal fun ConditionDefinition.Questionnaire.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.purpose)
  add(this@getAllChildren.reference)
}

internal fun ConditionDefinition.Plan.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "role" -> this.role
    "reference" -> this.reference
    else -> error("$name is not a valid property name")
  }

internal fun ConditionDefinition.Plan.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "role" -> true
    "reference" -> true
    else -> false
  }

internal fun ConditionDefinition.Plan.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.role?.let { add(it) }
  add(this@getAllChildren.reference)
}
