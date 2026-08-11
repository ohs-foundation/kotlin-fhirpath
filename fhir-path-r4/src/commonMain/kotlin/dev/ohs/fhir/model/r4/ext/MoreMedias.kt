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

import dev.ohs.fhir.model.r4.Media
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun Media.getProperty(name: String): Any? =
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
    "partOf" -> this.partOf
    "status" -> this.status
    "type" -> this.type
    "modality" -> this.modality
    "view" -> this.view
    "subject" -> this.subject
    "encounter" -> this.encounter
    "created" -> this.created
    "issued" -> this.issued
    "operator" -> this.`operator`
    "reasonCode" -> this.reasonCode
    "bodySite" -> this.bodySite
    "deviceName" -> this.deviceName
    "device" -> this.device
    "height" -> this.height
    "width" -> this.width
    "frames" -> this.frames
    "duration" -> this.duration
    "content" -> this.content
    "note" -> this.note
    else -> error("$name is not a valid property name")
  }

internal fun Media.hasProperty(name: String): Boolean =
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
    "partOf" -> true
    "status" -> true
    "type" -> true
    "modality" -> true
    "view" -> true
    "subject" -> true
    "encounter" -> true
    "created" -> true
    "issued" -> true
    "operator" -> true
    "reasonCode" -> true
    "bodySite" -> true
    "deviceName" -> true
    "device" -> true
    "height" -> true
    "width" -> true
    "frames" -> true
    "duration" -> true
    "content" -> true
    "note" -> true
    else -> false
  }

internal fun Media.getAllChildren(): List<Any> = buildList {
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
  addAll(this@getAllChildren.partOf)
  add(this@getAllChildren.status)
  this@getAllChildren.type?.let { add(it) }
  this@getAllChildren.modality?.let { add(it) }
  this@getAllChildren.view?.let { add(it) }
  this@getAllChildren.subject?.let { add(it) }
  this@getAllChildren.encounter?.let { add(it) }
  this@getAllChildren.created?.let { add(it) }
  this@getAllChildren.issued?.let { add(it) }
  this@getAllChildren.`operator`?.let { add(it) }
  addAll(this@getAllChildren.reasonCode)
  this@getAllChildren.bodySite?.let { add(it) }
  this@getAllChildren.deviceName?.let { add(it) }
  this@getAllChildren.device?.let { add(it) }
  this@getAllChildren.height?.let { add(it) }
  this@getAllChildren.width?.let { add(it) }
  this@getAllChildren.frames?.let { add(it) }
  this@getAllChildren.duration?.let { add(it) }
  add(this@getAllChildren.content)
  addAll(this@getAllChildren.note)
}
