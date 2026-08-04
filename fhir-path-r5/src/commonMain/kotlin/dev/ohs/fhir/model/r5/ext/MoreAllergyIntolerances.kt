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

import dev.ohs.fhir.model.r5.AllergyIntolerance
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun AllergyIntolerance.getProperty(name: String): Any? =
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
    "type" -> this.type
    "category" -> this.category
    "criticality" -> this.criticality
    "code" -> this.code
    "patient" -> this.patient
    "encounter" -> this.encounter
    "onset" -> this.onset
    "recordedDate" -> this.recordedDate
    "participant" -> this.participant
    "lastOccurrence" -> this.lastOccurrence
    "note" -> this.note
    "reaction" -> this.reaction
    else -> error("$name is not a valid property name")
  }

internal fun AllergyIntolerance.hasProperty(name: String): Boolean =
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
    "type" -> true
    "category" -> true
    "criticality" -> true
    "code" -> true
    "patient" -> true
    "encounter" -> true
    "onset" -> true
    "recordedDate" -> true
    "participant" -> true
    "lastOccurrence" -> true
    "note" -> true
    "reaction" -> true
    else -> false
  }

internal fun AllergyIntolerance.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.meta?.let { add(it) }
  this@getAllChildren.implicitRules?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.contained)
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.identifier)
  this@getAllChildren.clinicalStatus?.let { add(it) }
  this@getAllChildren.verificationStatus?.let { add(it) }
  this@getAllChildren.type?.let { add(it) }
  addAll(this@getAllChildren.category)
  this@getAllChildren.criticality?.let { add(it) }
  this@getAllChildren.code?.let { add(it) }
  add(this@getAllChildren.patient)
  this@getAllChildren.encounter?.let { add(it) }
  this@getAllChildren.onset?.let { add(it) }
  this@getAllChildren.recordedDate?.let { add(it) }
  addAll(this@getAllChildren.participant)
  this@getAllChildren.lastOccurrence?.let { add(it) }
  addAll(this@getAllChildren.note)
  addAll(this@getAllChildren.reaction)
}

internal fun AllergyIntolerance.Participant.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "function" -> this.function
    "actor" -> this.actor
    else -> error("$name is not a valid property name")
  }

internal fun AllergyIntolerance.Participant.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "function" -> true
    "actor" -> true
    else -> false
  }

internal fun AllergyIntolerance.Participant.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.function?.let { add(it) }
  add(this@getAllChildren.actor)
}

internal fun AllergyIntolerance.Reaction.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "substance" -> this.substance
    "manifestation" -> this.manifestation
    "description" -> this.description
    "onset" -> this.onset
    "severity" -> this.severity
    "exposureRoute" -> this.exposureRoute
    "note" -> this.note
    else -> error("$name is not a valid property name")
  }

internal fun AllergyIntolerance.Reaction.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "substance" -> true
    "manifestation" -> true
    "description" -> true
    "onset" -> true
    "severity" -> true
    "exposureRoute" -> true
    "note" -> true
    else -> false
  }

internal fun AllergyIntolerance.Reaction.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.substance?.let { add(it) }
  addAll(this@getAllChildren.manifestation)
  this@getAllChildren.description?.let { add(it) }
  this@getAllChildren.onset?.let { add(it) }
  this@getAllChildren.severity?.let { add(it) }
  this@getAllChildren.exposureRoute?.let { add(it) }
  addAll(this@getAllChildren.note)
}
