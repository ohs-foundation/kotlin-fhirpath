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

import dev.ohs.fhir.model.r4.AdverseEvent
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
    "actuality" -> this.actuality
    "category" -> this.category
    "event" -> this.event
    "subject" -> this.subject
    "encounter" -> this.encounter
    "date" -> this.date
    "detected" -> this.detected
    "recordedDate" -> this.recordedDate
    "resultingCondition" -> this.resultingCondition
    "location" -> this.location
    "seriousness" -> this.seriousness
    "severity" -> this.severity
    "outcome" -> this.outcome
    "recorder" -> this.recorder
    "contributor" -> this.contributor
    "suspectEntity" -> this.suspectEntity
    "subjectMedicalHistory" -> this.subjectMedicalHistory
    "referenceDocument" -> this.referenceDocument
    "study" -> this.study
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
    "actuality" -> true
    "category" -> true
    "event" -> true
    "subject" -> true
    "encounter" -> true
    "date" -> true
    "detected" -> true
    "recordedDate" -> true
    "resultingCondition" -> true
    "location" -> true
    "seriousness" -> true
    "severity" -> true
    "outcome" -> true
    "recorder" -> true
    "contributor" -> true
    "suspectEntity" -> true
    "subjectMedicalHistory" -> true
    "referenceDocument" -> true
    "study" -> true
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
  this@getAllChildren.identifier?.let { add(it) }
  add(this@getAllChildren.actuality)
  addAll(this@getAllChildren.category)
  this@getAllChildren.event?.let { add(it) }
  add(this@getAllChildren.subject)
  this@getAllChildren.encounter?.let { add(it) }
  this@getAllChildren.date?.let { add(it) }
  this@getAllChildren.detected?.let { add(it) }
  this@getAllChildren.recordedDate?.let { add(it) }
  addAll(this@getAllChildren.resultingCondition)
  this@getAllChildren.location?.let { add(it) }
  this@getAllChildren.seriousness?.let { add(it) }
  this@getAllChildren.severity?.let { add(it) }
  this@getAllChildren.outcome?.let { add(it) }
  this@getAllChildren.recorder?.let { add(it) }
  addAll(this@getAllChildren.contributor)
  addAll(this@getAllChildren.suspectEntity)
  addAll(this@getAllChildren.subjectMedicalHistory)
  addAll(this@getAllChildren.referenceDocument)
  addAll(this@getAllChildren.study)
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
  addAll(this@getAllChildren.causality)
}

internal fun AdverseEvent.SuspectEntity.Causality.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "assessment" -> this.assessment
    "productRelatedness" -> this.productRelatedness
    "author" -> this.author
    "method" -> this.method
    else -> error("$name is not a valid property name")
  }

internal fun AdverseEvent.SuspectEntity.Causality.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "assessment" -> true
    "productRelatedness" -> true
    "author" -> true
    "method" -> true
    else -> false
  }

internal fun AdverseEvent.SuspectEntity.Causality.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.assessment?.let { add(it) }
  this@getAllChildren.productRelatedness?.let { add(it) }
  this@getAllChildren.author?.let { add(it) }
  this@getAllChildren.method?.let { add(it) }
}
