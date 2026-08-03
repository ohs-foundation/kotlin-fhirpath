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

import dev.ohs.fhir.model.r5.AdverseEvent
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun AdverseEvent.getProperty(name: String): Any? =
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
    "status" -> this.status
    "actuality" -> this.actuality
    "category" -> this.category
    "code" -> this.code
    "subject" -> this.subject
    "encounter" -> this.encounter
    "occurrence" -> this.occurrence
    "detected" -> this.detected
    "recordedDate" -> this.recordedDate
    "resultingEffect" -> this.resultingEffect
    "location" -> this.location
    "seriousness" -> this.seriousness
    "outcome" -> this.outcome
    "recorder" -> this.recorder
    "participant" -> this.participant
    "study" -> this.study
    "expectedInResearchStudy" -> this.expectedInResearchStudy
    "suspectEntity" -> this.suspectEntity
    "contributingFactor" -> this.contributingFactor
    "preventiveAction" -> this.preventiveAction
    "mitigatingAction" -> this.mitigatingAction
    "supportingInfo" -> this.supportingInfo
    "note" -> this.note
    else -> error("$name is not a valid property name")
  }

internal fun AdverseEvent.hasProperty(name: String): Boolean =
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
    "status" -> true
    "actuality" -> true
    "category" -> true
    "code" -> true
    "subject" -> true
    "encounter" -> true
    "occurrence" -> true
    "detected" -> true
    "recordedDate" -> true
    "resultingEffect" -> true
    "location" -> true
    "seriousness" -> true
    "outcome" -> true
    "recorder" -> true
    "participant" -> true
    "study" -> true
    "expectedInResearchStudy" -> true
    "suspectEntity" -> true
    "contributingFactor" -> true
    "preventiveAction" -> true
    "mitigatingAction" -> true
    "supportingInfo" -> true
    "note" -> true
    else -> false
  }

internal fun AdverseEvent.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.meta?.let { add(it) }
  this@getAllChildren.implicitRules?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.contained)
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.identifier)
  add(this@getAllChildren.status)
  add(this@getAllChildren.actuality)
  addAll(this@getAllChildren.category)
  this@getAllChildren.code?.let { add(it) }
  add(this@getAllChildren.subject)
  this@getAllChildren.encounter?.let { add(it) }
  this@getAllChildren.occurrence?.let { add(it) }
  this@getAllChildren.detected?.let { add(it) }
  this@getAllChildren.recordedDate?.let { add(it) }
  addAll(this@getAllChildren.resultingEffect)
  this@getAllChildren.location?.let { add(it) }
  this@getAllChildren.seriousness?.let { add(it) }
  addAll(this@getAllChildren.outcome)
  this@getAllChildren.recorder?.let { add(it) }
  addAll(this@getAllChildren.participant)
  addAll(this@getAllChildren.study)
  this@getAllChildren.expectedInResearchStudy?.let { add(it) }
  addAll(this@getAllChildren.suspectEntity)
  addAll(this@getAllChildren.contributingFactor)
  addAll(this@getAllChildren.preventiveAction)
  addAll(this@getAllChildren.mitigatingAction)
  addAll(this@getAllChildren.supportingInfo)
  addAll(this@getAllChildren.note)
}

internal fun AdverseEvent.Participant.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "function" -> this.function
    "actor" -> this.actor
    else -> error("$name is not a valid property name")
  }

internal fun AdverseEvent.Participant.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "function" -> true
    "actor" -> true
    else -> false
  }

internal fun AdverseEvent.Participant.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.function?.let { add(it) }
  add(this@getAllChildren.actor)
}

internal fun AdverseEvent.SuspectEntity.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "instance" -> this.instance
    "causality" -> this.causality
    else -> error("$name is not a valid property name")
  }

internal fun AdverseEvent.SuspectEntity.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "instance" -> true
    "causality" -> true
    else -> false
  }

internal fun AdverseEvent.SuspectEntity.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.instance)
  this@getAllChildren.causality?.let { add(it) }
}

internal fun AdverseEvent.SuspectEntity.Causality.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "assessmentMethod" -> this.assessmentMethod
    "entityRelatedness" -> this.entityRelatedness
    "author" -> this.author
    else -> error("$name is not a valid property name")
  }

internal fun AdverseEvent.SuspectEntity.Causality.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "assessmentMethod" -> true
    "entityRelatedness" -> true
    "author" -> true
    else -> false
  }

internal fun AdverseEvent.SuspectEntity.Causality.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.assessmentMethod?.let { add(it) }
  this@getAllChildren.entityRelatedness?.let { add(it) }
  this@getAllChildren.author?.let { add(it) }
}

internal fun AdverseEvent.ContributingFactor.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "item" -> this.item
    else -> error("$name is not a valid property name")
  }

internal fun AdverseEvent.ContributingFactor.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "item" -> true
    else -> false
  }

internal fun AdverseEvent.ContributingFactor.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.item)
}

internal fun AdverseEvent.PreventiveAction.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "item" -> this.item
    else -> error("$name is not a valid property name")
  }

internal fun AdverseEvent.PreventiveAction.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "item" -> true
    else -> false
  }

internal fun AdverseEvent.PreventiveAction.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.item)
}

internal fun AdverseEvent.MitigatingAction.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "item" -> this.item
    else -> error("$name is not a valid property name")
  }

internal fun AdverseEvent.MitigatingAction.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "item" -> true
    else -> false
  }

internal fun AdverseEvent.MitigatingAction.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.item)
}

internal fun AdverseEvent.SupportingInfo.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "item" -> this.item
    else -> error("$name is not a valid property name")
  }

internal fun AdverseEvent.SupportingInfo.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "item" -> true
    else -> false
  }

internal fun AdverseEvent.SupportingInfo.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.item)
}
