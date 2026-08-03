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

import dev.ohs.fhir.model.r5.ResearchSubject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun ResearchSubject.getProperty(name: String): Any? =
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
    "progress" -> this.progress
    "period" -> this.period
    "study" -> this.study
    "subject" -> this.subject
    "assignedComparisonGroup" -> this.assignedComparisonGroup
    "actualComparisonGroup" -> this.actualComparisonGroup
    "consent" -> this.consent
    else -> error("$name is not a valid property name")
  }

internal fun ResearchSubject.hasProperty(name: String): Boolean =
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
    "progress" -> true
    "period" -> true
    "study" -> true
    "subject" -> true
    "assignedComparisonGroup" -> true
    "actualComparisonGroup" -> true
    "consent" -> true
    else -> false
  }

internal fun ResearchSubject.getAllChildren(): List<Any> = buildList {
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
  addAll(this@getAllChildren.progress)
  this@getAllChildren.period?.let { add(it) }
  add(this@getAllChildren.study)
  add(this@getAllChildren.subject)
  this@getAllChildren.assignedComparisonGroup?.let { add(it) }
  this@getAllChildren.actualComparisonGroup?.let { add(it) }
  addAll(this@getAllChildren.consent)
}

internal fun ResearchSubject.Progress.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "subjectState" -> this.subjectState
    "milestone" -> this.milestone
    "reason" -> this.reason
    "startDate" -> this.startDate
    "endDate" -> this.endDate
    else -> error("$name is not a valid property name")
  }

internal fun ResearchSubject.Progress.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "subjectState" -> true
    "milestone" -> true
    "reason" -> true
    "startDate" -> true
    "endDate" -> true
    else -> false
  }

internal fun ResearchSubject.Progress.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.type?.let { add(it) }
  this@getAllChildren.subjectState?.let { add(it) }
  this@getAllChildren.milestone?.let { add(it) }
  this@getAllChildren.reason?.let { add(it) }
  this@getAllChildren.startDate?.let { add(it) }
  this@getAllChildren.endDate?.let { add(it) }
}
