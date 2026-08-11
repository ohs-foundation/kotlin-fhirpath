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

import dev.ohs.fhir.model.r4b.DeviceUseStatement
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun DeviceUseStatement.getProperty(name: String): Any? =
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
    "subject" -> this.subject
    "derivedFrom" -> this.derivedFrom
    "timing" -> this.timing
    "recordedOn" -> this.recordedOn
    "source" -> this.source
    "device" -> this.device
    "reasonCode" -> this.reasonCode
    "reasonReference" -> this.reasonReference
    "bodySite" -> this.bodySite
    "note" -> this.note
    else -> error("$name is not a valid property name")
  }

internal fun DeviceUseStatement.hasProperty(name: String): Boolean =
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
    "subject" -> true
    "derivedFrom" -> true
    "timing" -> true
    "recordedOn" -> true
    "source" -> true
    "device" -> true
    "reasonCode" -> true
    "reasonReference" -> true
    "bodySite" -> true
    "note" -> true
    else -> false
  }

internal fun DeviceUseStatement.getAllChildren(): List<Any> = buildList {
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
  add(this@getAllChildren.subject)
  addAll(this@getAllChildren.derivedFrom)
  this@getAllChildren.timing?.let { add(it) }
  this@getAllChildren.recordedOn?.let { add(it) }
  this@getAllChildren.source?.let { add(it) }
  add(this@getAllChildren.device)
  addAll(this@getAllChildren.reasonCode)
  addAll(this@getAllChildren.reasonReference)
  this@getAllChildren.bodySite?.let { add(it) }
  addAll(this@getAllChildren.note)
}
