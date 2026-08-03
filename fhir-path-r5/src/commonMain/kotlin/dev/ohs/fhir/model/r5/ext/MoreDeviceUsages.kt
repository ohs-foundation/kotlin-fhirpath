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

import dev.ohs.fhir.model.r5.DeviceUsage
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun DeviceUsage.getProperty(name: String): Any? =
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
    "patient" -> this.patient
    "derivedFrom" -> this.derivedFrom
    "context" -> this.context
    "timing" -> this.timing
    "dateAsserted" -> this.dateAsserted
    "usageStatus" -> this.usageStatus
    "usageReason" -> this.usageReason
    "adherence" -> this.adherence
    "informationSource" -> this.informationSource
    "device" -> this.device
    "reason" -> this.reason
    "bodySite" -> this.bodySite
    "note" -> this.note
    else -> error("$name is not a valid property name")
  }

internal fun DeviceUsage.hasProperty(name: String): Boolean =
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
    "patient" -> true
    "derivedFrom" -> true
    "context" -> true
    "timing" -> true
    "dateAsserted" -> true
    "usageStatus" -> true
    "usageReason" -> true
    "adherence" -> true
    "informationSource" -> true
    "device" -> true
    "reason" -> true
    "bodySite" -> true
    "note" -> true
    else -> false
  }

internal fun DeviceUsage.getAllChildren(): List<Any> = buildList {
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
  add(this@getAllChildren.patient)
  addAll(this@getAllChildren.derivedFrom)
  this@getAllChildren.context?.let { add(it) }
  this@getAllChildren.timing?.let { add(it) }
  this@getAllChildren.dateAsserted?.let { add(it) }
  this@getAllChildren.usageStatus?.let { add(it) }
  addAll(this@getAllChildren.usageReason)
  this@getAllChildren.adherence?.let { add(it) }
  this@getAllChildren.informationSource?.let { add(it) }
  add(this@getAllChildren.device)
  addAll(this@getAllChildren.reason)
  this@getAllChildren.bodySite?.let { add(it) }
  addAll(this@getAllChildren.note)
}

internal fun DeviceUsage.Adherence.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "code" -> this.code
    "reason" -> this.reason
    else -> error("$name is not a valid property name")
  }

internal fun DeviceUsage.Adherence.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "code" -> true
    "reason" -> true
    else -> false
  }

internal fun DeviceUsage.Adherence.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.code)
  addAll(this@getAllChildren.reason)
}
