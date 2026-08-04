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

import dev.ohs.fhir.model.r5.Procedure
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun Procedure.getProperty(name: String): Any? =
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
    "instantiatesCanonical" -> this.instantiatesCanonical
    "instantiatesUri" -> this.instantiatesUri
    "basedOn" -> this.basedOn
    "partOf" -> this.partOf
    "status" -> this.status
    "statusReason" -> this.statusReason
    "category" -> this.category
    "code" -> this.code
    "subject" -> this.subject
    "focus" -> this.focus
    "encounter" -> this.encounter
    "occurrence" -> this.occurrence
    "recorded" -> this.recorded
    "recorder" -> this.recorder
    "reported" -> this.reported
    "performer" -> this.performer
    "location" -> this.location
    "reason" -> this.reason
    "bodySite" -> this.bodySite
    "outcome" -> this.outcome
    "report" -> this.report
    "complication" -> this.complication
    "followUp" -> this.followUp
    "note" -> this.note
    "focalDevice" -> this.focalDevice
    "used" -> this.used
    "supportingInfo" -> this.supportingInfo
    else -> error("$name is not a valid property name")
  }

internal fun Procedure.hasProperty(name: String): Boolean =
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
    "instantiatesCanonical" -> true
    "instantiatesUri" -> true
    "basedOn" -> true
    "partOf" -> true
    "status" -> true
    "statusReason" -> true
    "category" -> true
    "code" -> true
    "subject" -> true
    "focus" -> true
    "encounter" -> true
    "occurrence" -> true
    "recorded" -> true
    "recorder" -> true
    "reported" -> true
    "performer" -> true
    "location" -> true
    "reason" -> true
    "bodySite" -> true
    "outcome" -> true
    "report" -> true
    "complication" -> true
    "followUp" -> true
    "note" -> true
    "focalDevice" -> true
    "used" -> true
    "supportingInfo" -> true
    else -> false
  }

internal fun Procedure.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.meta?.let { add(it) }
  this@getAllChildren.implicitRules?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.contained)
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.identifier)
  addAll(this@getAllChildren.instantiatesCanonical)
  addAll(this@getAllChildren.instantiatesUri)
  addAll(this@getAllChildren.basedOn)
  addAll(this@getAllChildren.partOf)
  add(this@getAllChildren.status)
  this@getAllChildren.statusReason?.let { add(it) }
  addAll(this@getAllChildren.category)
  this@getAllChildren.code?.let { add(it) }
  add(this@getAllChildren.subject)
  this@getAllChildren.focus?.let { add(it) }
  this@getAllChildren.encounter?.let { add(it) }
  this@getAllChildren.occurrence?.let { add(it) }
  this@getAllChildren.recorded?.let { add(it) }
  this@getAllChildren.recorder?.let { add(it) }
  this@getAllChildren.reported?.let { add(it) }
  addAll(this@getAllChildren.performer)
  this@getAllChildren.location?.let { add(it) }
  addAll(this@getAllChildren.reason)
  addAll(this@getAllChildren.bodySite)
  this@getAllChildren.outcome?.let { add(it) }
  addAll(this@getAllChildren.report)
  addAll(this@getAllChildren.complication)
  addAll(this@getAllChildren.followUp)
  addAll(this@getAllChildren.note)
  addAll(this@getAllChildren.focalDevice)
  addAll(this@getAllChildren.used)
  addAll(this@getAllChildren.supportingInfo)
}

internal fun Procedure.Performer.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "function" -> this.function
    "actor" -> this.actor
    "onBehalfOf" -> this.onBehalfOf
    "period" -> this.period
    else -> error("$name is not a valid property name")
  }

internal fun Procedure.Performer.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "function" -> true
    "actor" -> true
    "onBehalfOf" -> true
    "period" -> true
    else -> false
  }

internal fun Procedure.Performer.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.function?.let { add(it) }
  add(this@getAllChildren.actor)
  this@getAllChildren.onBehalfOf?.let { add(it) }
  this@getAllChildren.period?.let { add(it) }
}

internal fun Procedure.FocalDevice.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "action" -> this.action
    "manipulated" -> this.manipulated
    else -> error("$name is not a valid property name")
  }

internal fun Procedure.FocalDevice.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "action" -> true
    "manipulated" -> true
    else -> false
  }

internal fun Procedure.FocalDevice.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.action?.let { add(it) }
  add(this@getAllChildren.manipulated)
}
