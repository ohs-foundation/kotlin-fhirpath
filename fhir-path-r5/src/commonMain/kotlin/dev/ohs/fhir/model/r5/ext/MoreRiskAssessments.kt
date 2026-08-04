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

import dev.ohs.fhir.model.r5.RiskAssessment
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun RiskAssessment.getProperty(name: String): Any? =
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
    "parent" -> this.parent
    "status" -> this.status
    "method" -> this.method
    "code" -> this.code
    "subject" -> this.subject
    "encounter" -> this.encounter
    "occurrence" -> this.occurrence
    "condition" -> this.condition
    "performer" -> this.performer
    "reason" -> this.reason
    "basis" -> this.basis
    "prediction" -> this.prediction
    "mitigation" -> this.mitigation
    "note" -> this.note
    else -> error("$name is not a valid property name")
  }

internal fun RiskAssessment.hasProperty(name: String): Boolean =
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
    "parent" -> true
    "status" -> true
    "method" -> true
    "code" -> true
    "subject" -> true
    "encounter" -> true
    "occurrence" -> true
    "condition" -> true
    "performer" -> true
    "reason" -> true
    "basis" -> true
    "prediction" -> true
    "mitigation" -> true
    "note" -> true
    else -> false
  }

internal fun RiskAssessment.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.meta?.let { add(it) }
  this@getAllChildren.implicitRules?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.contained)
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.identifier)
  this@getAllChildren.basedOn?.let { add(it) }
  this@getAllChildren.parent?.let { add(it) }
  add(this@getAllChildren.status)
  this@getAllChildren.method?.let { add(it) }
  this@getAllChildren.code?.let { add(it) }
  add(this@getAllChildren.subject)
  this@getAllChildren.encounter?.let { add(it) }
  this@getAllChildren.occurrence?.let { add(it) }
  this@getAllChildren.condition?.let { add(it) }
  this@getAllChildren.performer?.let { add(it) }
  addAll(this@getAllChildren.reason)
  addAll(this@getAllChildren.basis)
  addAll(this@getAllChildren.prediction)
  this@getAllChildren.mitigation?.let { add(it) }
  addAll(this@getAllChildren.note)
}

internal fun RiskAssessment.Prediction.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "outcome" -> this.outcome
    "probability" -> this.probability
    "qualitativeRisk" -> this.qualitativeRisk
    "relativeRisk" -> this.relativeRisk
    "when" -> this.`when`
    "rationale" -> this.rationale
    else -> error("$name is not a valid property name")
  }

internal fun RiskAssessment.Prediction.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "outcome" -> true
    "probability" -> true
    "qualitativeRisk" -> true
    "relativeRisk" -> true
    "when" -> true
    "rationale" -> true
    else -> false
  }

internal fun RiskAssessment.Prediction.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.outcome?.let { add(it) }
  this@getAllChildren.probability?.let { add(it) }
  this@getAllChildren.qualitativeRisk?.let { add(it) }
  this@getAllChildren.relativeRisk?.let { add(it) }
  this@getAllChildren.`when`?.let { add(it) }
  this@getAllChildren.rationale?.let { add(it) }
}
