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

import dev.ohs.fhir.model.r4b.DiagnosticReport
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun DiagnosticReport.getProperty(name: String): Any? =
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
    "basedOn" -> this.basedOn
    "status" -> this.status
    "category" -> this.category
    "code" -> this.code
    "subject" -> this.subject
    "encounter" -> this.encounter
    "effective" -> this.effective
    "issued" -> this.issued
    "performer" -> this.performer
    "resultsInterpreter" -> this.resultsInterpreter
    "specimen" -> this.specimen
    "result" -> this.result
    "imagingStudy" -> this.imagingStudy
    "media" -> this.media
    "conclusion" -> this.conclusion
    "conclusionCode" -> this.conclusionCode
    "presentedForm" -> this.presentedForm
    else -> error("$name is not a valid property name")
  }

internal fun DiagnosticReport.hasProperty(name: String): Boolean =
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
    "basedOn" -> true
    "status" -> true
    "category" -> true
    "code" -> true
    "subject" -> true
    "encounter" -> true
    "effective" -> true
    "issued" -> true
    "performer" -> true
    "resultsInterpreter" -> true
    "specimen" -> true
    "result" -> true
    "imagingStudy" -> true
    "media" -> true
    "conclusion" -> true
    "conclusionCode" -> true
    "presentedForm" -> true
    else -> false
  }

internal fun DiagnosticReport.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.meta?.let { add(it) }
  this@getAllChildren.implicitRules?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.contained)
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.identifier)
  addAll(this@getAllChildren.basedOn)
  add(this@getAllChildren.status)
  addAll(this@getAllChildren.category)
  add(this@getAllChildren.code)
  this@getAllChildren.subject?.let { add(it) }
  this@getAllChildren.encounter?.let { add(it) }
  this@getAllChildren.effective?.let { add(it) }
  this@getAllChildren.issued?.let { add(it) }
  addAll(this@getAllChildren.performer)
  addAll(this@getAllChildren.resultsInterpreter)
  addAll(this@getAllChildren.specimen)
  addAll(this@getAllChildren.result)
  addAll(this@getAllChildren.imagingStudy)
  addAll(this@getAllChildren.media)
  this@getAllChildren.conclusion?.let { add(it) }
  addAll(this@getAllChildren.conclusionCode)
  addAll(this@getAllChildren.presentedForm)
}

internal fun DiagnosticReport.Media.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "comment" -> this.comment
    "link" -> this.link
    else -> error("$name is not a valid property name")
  }

internal fun DiagnosticReport.Media.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "comment" -> true
    "link" -> true
    else -> false
  }

internal fun DiagnosticReport.Media.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.comment?.let { add(it) }
  add(this@getAllChildren.link)
}
