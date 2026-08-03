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

import dev.ohs.fhir.model.r5.Condition
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun Condition.getProperty(name: String): Any? =
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
    "clinicalStatus" -> this.clinicalStatus
    "verificationStatus" -> this.verificationStatus
    "category" -> this.category
    "severity" -> this.severity
    "code" -> this.code
    "bodySite" -> this.bodySite
    "subject" -> this.subject
    "encounter" -> this.encounter
    "onset" -> this.onset
    "abatement" -> this.abatement
    "recordedDate" -> this.recordedDate
    "participant" -> this.participant
    "stage" -> this.stage
    "evidence" -> this.evidence
    "note" -> this.note
    else -> error("$name is not a valid property name")
  }

internal fun Condition.hasProperty(name: String): Boolean =
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
    "clinicalStatus" -> true
    "verificationStatus" -> true
    "category" -> true
    "severity" -> true
    "code" -> true
    "bodySite" -> true
    "subject" -> true
    "encounter" -> true
    "onset" -> true
    "abatement" -> true
    "recordedDate" -> true
    "participant" -> true
    "stage" -> true
    "evidence" -> true
    "note" -> true
    else -> false
  }

internal fun Condition.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.meta?.let { add(it) }
  this@getAllChildren.implicitRules?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.contained)
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.identifier)
  add(this@getAllChildren.clinicalStatus)
  this@getAllChildren.verificationStatus?.let { add(it) }
  addAll(this@getAllChildren.category)
  this@getAllChildren.severity?.let { add(it) }
  this@getAllChildren.code?.let { add(it) }
  addAll(this@getAllChildren.bodySite)
  add(this@getAllChildren.subject)
  this@getAllChildren.encounter?.let { add(it) }
  this@getAllChildren.onset?.let { add(it) }
  this@getAllChildren.abatement?.let { add(it) }
  this@getAllChildren.recordedDate?.let { add(it) }
  addAll(this@getAllChildren.participant)
  addAll(this@getAllChildren.stage)
  addAll(this@getAllChildren.evidence)
  addAll(this@getAllChildren.note)
}

internal fun Condition.Participant.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "function" -> this.function
    "actor" -> this.actor
    else -> error("$name is not a valid property name")
  }

internal fun Condition.Participant.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "function" -> true
    "actor" -> true
    else -> false
  }

internal fun Condition.Participant.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.function?.let { add(it) }
  add(this@getAllChildren.actor)
}

internal fun Condition.Stage.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "summary" -> this.summary
    "assessment" -> this.assessment
    "type" -> this.type
    else -> error("$name is not a valid property name")
  }

internal fun Condition.Stage.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "summary" -> true
    "assessment" -> true
    "type" -> true
    else -> false
  }

internal fun Condition.Stage.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.summary?.let { add(it) }
  addAll(this@getAllChildren.assessment)
  this@getAllChildren.type?.let { add(it) }
}
