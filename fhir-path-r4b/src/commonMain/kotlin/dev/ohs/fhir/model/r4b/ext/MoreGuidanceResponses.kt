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

import dev.ohs.fhir.model.r4b.GuidanceResponse
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun GuidanceResponse.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "meta" -> this.meta
    "implicitRules" -> this.implicitRules
    "language" -> this.language
    "text" -> this.text
    "contained" -> this.contained
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "requestIdentifier" -> this.requestIdentifier
    "identifier" -> this.identifier
    "module" -> this.module
    "status" -> this.status
    "subject" -> this.subject
    "encounter" -> this.encounter
    "occurrenceDateTime" -> this.occurrenceDateTime
    "performer" -> this.performer
    "reasonCode" -> this.reasonCode
    "reasonReference" -> this.reasonReference
    "note" -> this.note
    "evaluationMessage" -> this.evaluationMessage
    "outputParameters" -> this.outputParameters
    "result" -> this.result
    "dataRequirement" -> this.dataRequirement
    else -> error("$name is not a valid property name")
  }

internal fun GuidanceResponse.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "meta" -> true
    "implicitRules" -> true
    "language" -> true
    "text" -> true
    "contained" -> true
    "extension" -> true
    "modifierExtension" -> true
    "requestIdentifier" -> true
    "identifier" -> true
    "module" -> true
    "status" -> true
    "subject" -> true
    "encounter" -> true
    "occurrenceDateTime" -> true
    "performer" -> true
    "reasonCode" -> true
    "reasonReference" -> true
    "note" -> true
    "evaluationMessage" -> true
    "outputParameters" -> true
    "result" -> true
    "dataRequirement" -> true
    else -> false
  }

internal fun GuidanceResponse.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.meta?.let { add(it) }
  this@getAllChildren.implicitRules?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.contained)
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.requestIdentifier?.let { add(it) }
  addAll(this@getAllChildren.identifier)
  add(this@getAllChildren.module)
  add(this@getAllChildren.status)
  this@getAllChildren.subject?.let { add(it) }
  this@getAllChildren.encounter?.let { add(it) }
  this@getAllChildren.occurrenceDateTime?.let { add(it) }
  this@getAllChildren.performer?.let { add(it) }
  addAll(this@getAllChildren.reasonCode)
  addAll(this@getAllChildren.reasonReference)
  addAll(this@getAllChildren.note)
  addAll(this@getAllChildren.evaluationMessage)
  this@getAllChildren.outputParameters?.let { add(it) }
  this@getAllChildren.result?.let { add(it) }
  addAll(this@getAllChildren.dataRequirement)
}
