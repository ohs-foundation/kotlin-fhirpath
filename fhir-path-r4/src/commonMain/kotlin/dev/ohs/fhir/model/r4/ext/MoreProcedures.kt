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

import dev.ohs.fhir.model.r4.Procedure
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
    "encounter" -> this.encounter
    "performed" -> this.performed
    "recorder" -> this.recorder
    "asserter" -> this.asserter
    "performer" -> this.performer
    "location" -> this.location
    "reasonCode" -> this.reasonCode
    "reasonReference" -> this.reasonReference
    "bodySite" -> this.bodySite
    "outcome" -> this.outcome
    "report" -> this.report
    "complication" -> this.complication
    "complicationDetail" -> this.complicationDetail
    "followUp" -> this.followUp
    "note" -> this.note
    "focalDevice" -> this.focalDevice
    "usedReference" -> this.usedReference
    "usedCode" -> this.usedCode
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
    "encounter" -> true
    "performed" -> true
    "recorder" -> true
    "asserter" -> true
    "performer" -> true
    "location" -> true
    "reasonCode" -> true
    "reasonReference" -> true
    "bodySite" -> true
    "outcome" -> true
    "report" -> true
    "complication" -> true
    "complicationDetail" -> true
    "followUp" -> true
    "note" -> true
    "focalDevice" -> true
    "usedReference" -> true
    "usedCode" -> true
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
  this@getAllChildren.category?.let { add(it) }
  this@getAllChildren.code?.let { add(it) }
  add(this@getAllChildren.subject)
  this@getAllChildren.encounter?.let { add(it) }
  this@getAllChildren.performed?.let { add(it) }
  this@getAllChildren.recorder?.let { add(it) }
  this@getAllChildren.asserter?.let { add(it) }
  addAll(this@getAllChildren.performer)
  this@getAllChildren.location?.let { add(it) }
  addAll(this@getAllChildren.reasonCode)
  addAll(this@getAllChildren.reasonReference)
  addAll(this@getAllChildren.bodySite)
  this@getAllChildren.outcome?.let { add(it) }
  addAll(this@getAllChildren.report)
  addAll(this@getAllChildren.complication)
  addAll(this@getAllChildren.complicationDetail)
  addAll(this@getAllChildren.followUp)
  addAll(this@getAllChildren.note)
  addAll(this@getAllChildren.focalDevice)
  addAll(this@getAllChildren.usedReference)
  addAll(this@getAllChildren.usedCode)
}

internal fun Procedure.Performer.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "function" -> this.function
    "actor" -> this.actor
    "onBehalfOf" -> this.onBehalfOf
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
    else -> false
  }

internal fun Procedure.Performer.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.function?.let { add(it) }
  add(this@getAllChildren.actor)
  this@getAllChildren.onBehalfOf?.let { add(it) }
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
