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

import dev.ohs.fhir.model.r4b.ResearchStudy
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
    "identifier" -> this.identifier
    "title" -> this.title
    "protocol" -> this.protocol
    "partOf" -> this.partOf
    "status" -> this.status
    "primaryPurposeType" -> this.primaryPurposeType
    "phase" -> this.phase
    "category" -> this.category
    "focus" -> this.focus
    "condition" -> this.condition
    "contact" -> this.contact
    "relatedArtifact" -> this.relatedArtifact
    "keyword" -> this.keyword
    "location" -> this.location
    "description" -> this.description
    "enrollment" -> this.enrollment
    "period" -> this.period
    "sponsor" -> this.sponsor
    "principalInvestigator" -> this.principalInvestigator
    "site" -> this.site
    "reasonStopped" -> this.reasonStopped
    "note" -> this.note
    "arm" -> this.arm
    "objective" -> this.objective
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
    "identifier" -> true
    "title" -> true
    "protocol" -> true
    "partOf" -> true
    "status" -> true
    "primaryPurposeType" -> true
    "phase" -> true
    "category" -> true
    "focus" -> true
    "condition" -> true
    "contact" -> true
    "relatedArtifact" -> true
    "keyword" -> true
    "location" -> true
    "description" -> true
    "enrollment" -> true
    "period" -> true
    "sponsor" -> true
    "principalInvestigator" -> true
    "site" -> true
    "reasonStopped" -> true
    "note" -> true
    "arm" -> true
    "objective" -> true
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
  addAll(this@getAllChildren.identifier)
  this@getAllChildren.title?.let { add(it) }
  addAll(this@getAllChildren.protocol)
  addAll(this@getAllChildren.partOf)
  add(this@getAllChildren.status)
  this@getAllChildren.primaryPurposeType?.let { add(it) }
  this@getAllChildren.phase?.let { add(it) }
  addAll(this@getAllChildren.category)
  addAll(this@getAllChildren.focus)
  addAll(this@getAllChildren.condition)
  addAll(this@getAllChildren.contact)
  addAll(this@getAllChildren.relatedArtifact)
  addAll(this@getAllChildren.keyword)
  addAll(this@getAllChildren.location)
  this@getAllChildren.description?.let { add(it) }
  addAll(this@getAllChildren.enrollment)
  this@getAllChildren.period?.let { add(it) }
  this@getAllChildren.sponsor?.let { add(it) }
  this@getAllChildren.principalInvestigator?.let { add(it) }
  addAll(this@getAllChildren.site)
  this@getAllChildren.reasonStopped?.let { add(it) }
  addAll(this@getAllChildren.note)
  addAll(this@getAllChildren.arm)
  addAll(this@getAllChildren.objective)
}

internal fun ResearchStudy.Arm.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "name" -> this.name
    "type" -> this.type
    "description" -> this.description
    else -> error("$name is not a valid property name")
  }

internal fun ResearchStudy.Arm.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "name" -> true
    "type" -> true
    "description" -> true
    else -> false
  }

internal fun ResearchStudy.Arm.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.name)
  this@getAllChildren.type?.let { add(it) }
  this@getAllChildren.description?.let { add(it) }
}

internal fun ResearchStudy.Objective.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "name" -> this.name
    "type" -> this.type
    else -> error("$name is not a valid property name")
  }

internal fun ResearchStudy.Objective.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "name" -> true
    "type" -> true
    else -> false
  }

internal fun ResearchStudy.Objective.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.name?.let { add(it) }
  this@getAllChildren.type?.let { add(it) }
}
