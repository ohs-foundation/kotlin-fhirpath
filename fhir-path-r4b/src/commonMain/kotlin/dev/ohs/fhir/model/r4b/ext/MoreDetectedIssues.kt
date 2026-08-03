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

import dev.ohs.fhir.model.r4b.DetectedIssue
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun DetectedIssue.getProperty(name: String): Any? =
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
    "code" -> this.code
    "severity" -> this.severity
    "patient" -> this.patient
    "identified" -> this.identified
    "author" -> this.author
    "implicated" -> this.implicated
    "evidence" -> this.evidence
    "detail" -> this.detail
    "reference" -> this.reference
    "mitigation" -> this.mitigation
    else -> error("$name is not a valid property name")
  }

internal fun DetectedIssue.hasProperty(name: String): Boolean =
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
    "code" -> true
    "severity" -> true
    "patient" -> true
    "identified" -> true
    "author" -> true
    "implicated" -> true
    "evidence" -> true
    "detail" -> true
    "reference" -> true
    "mitigation" -> true
    else -> false
  }

internal fun DetectedIssue.getAllChildren(): List<Any> = buildList {
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
  this@getAllChildren.code?.let { add(it) }
  this@getAllChildren.severity?.let { add(it) }
  this@getAllChildren.patient?.let { add(it) }
  this@getAllChildren.identified?.let { add(it) }
  this@getAllChildren.author?.let { add(it) }
  addAll(this@getAllChildren.implicated)
  addAll(this@getAllChildren.evidence)
  this@getAllChildren.detail?.let { add(it) }
  this@getAllChildren.reference?.let { add(it) }
  addAll(this@getAllChildren.mitigation)
}

internal fun DetectedIssue.Evidence.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "code" -> this.code
    "detail" -> this.detail
    else -> error("$name is not a valid property name")
  }

internal fun DetectedIssue.Evidence.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "code" -> true
    "detail" -> true
    else -> false
  }

internal fun DetectedIssue.Evidence.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.code)
  addAll(this@getAllChildren.detail)
}

internal fun DetectedIssue.Mitigation.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "action" -> this.action
    "date" -> this.date
    "author" -> this.author
    else -> error("$name is not a valid property name")
  }

internal fun DetectedIssue.Mitigation.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "action" -> true
    "date" -> true
    "author" -> true
    else -> false
  }

internal fun DetectedIssue.Mitigation.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.action)
  this@getAllChildren.date?.let { add(it) }
  this@getAllChildren.author?.let { add(it) }
}
