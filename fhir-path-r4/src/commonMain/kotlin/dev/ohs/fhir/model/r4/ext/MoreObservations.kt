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

import dev.ohs.fhir.model.r4.Observation
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun Observation.getProperty(name: String): Any? =
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
    "category" -> this.category
    "code" -> this.code
    "subject" -> this.subject
    "focus" -> this.focus
    "encounter" -> this.encounter
    "effective" -> this.effective
    "issued" -> this.issued
    "performer" -> this.performer
    "value" -> this.`value`
    "dataAbsentReason" -> this.dataAbsentReason
    "interpretation" -> this.interpretation
    "note" -> this.note
    "bodySite" -> this.bodySite
    "method" -> this.method
    "specimen" -> this.specimen
    "device" -> this.device
    "referenceRange" -> this.referenceRange
    "hasMember" -> this.hasMember
    "derivedFrom" -> this.derivedFrom
    "component" -> this.component
    else -> error("$name is not a valid property name")
  }

internal fun Observation.hasProperty(name: String): Boolean =
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
    "category" -> true
    "code" -> true
    "subject" -> true
    "focus" -> true
    "encounter" -> true
    "effective" -> true
    "issued" -> true
    "performer" -> true
    "value" -> true
    "dataAbsentReason" -> true
    "interpretation" -> true
    "note" -> true
    "bodySite" -> true
    "method" -> true
    "specimen" -> true
    "device" -> true
    "referenceRange" -> true
    "hasMember" -> true
    "derivedFrom" -> true
    "component" -> true
    else -> false
  }

internal fun Observation.getAllChildren(): List<Any> = buildList {
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
  addAll(this@getAllChildren.category)
  add(this@getAllChildren.code)
  this@getAllChildren.subject?.let { add(it) }
  addAll(this@getAllChildren.focus)
  this@getAllChildren.encounter?.let { add(it) }
  this@getAllChildren.effective?.let { add(it) }
  this@getAllChildren.issued?.let { add(it) }
  addAll(this@getAllChildren.performer)
  this@getAllChildren.`value`?.let { add(it) }
  this@getAllChildren.dataAbsentReason?.let { add(it) }
  addAll(this@getAllChildren.interpretation)
  addAll(this@getAllChildren.note)
  this@getAllChildren.bodySite?.let { add(it) }
  this@getAllChildren.method?.let { add(it) }
  this@getAllChildren.specimen?.let { add(it) }
  this@getAllChildren.device?.let { add(it) }
  addAll(this@getAllChildren.referenceRange)
  addAll(this@getAllChildren.hasMember)
  addAll(this@getAllChildren.derivedFrom)
  addAll(this@getAllChildren.component)
}

internal fun Observation.ReferenceRange.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "low" -> this.low
    "high" -> this.high
    "type" -> this.type
    "appliesTo" -> this.appliesTo
    "age" -> this.age
    "text" -> this.text
    else -> error("$name is not a valid property name")
  }

internal fun Observation.ReferenceRange.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "low" -> true
    "high" -> true
    "type" -> true
    "appliesTo" -> true
    "age" -> true
    "text" -> true
    else -> false
  }

internal fun Observation.ReferenceRange.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.low?.let { add(it) }
  this@getAllChildren.high?.let { add(it) }
  this@getAllChildren.type?.let { add(it) }
  addAll(this@getAllChildren.appliesTo)
  this@getAllChildren.age?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
}

internal fun Observation.Component.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "code" -> this.code
    "value" -> this.`value`
    "dataAbsentReason" -> this.dataAbsentReason
    "interpretation" -> this.interpretation
    "referenceRange" -> this.referenceRange
    else -> error("$name is not a valid property name")
  }

internal fun Observation.Component.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "code" -> true
    "value" -> true
    "dataAbsentReason" -> true
    "interpretation" -> true
    "referenceRange" -> true
    else -> false
  }

internal fun Observation.Component.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.code)
  this@getAllChildren.`value`?.let { add(it) }
  this@getAllChildren.dataAbsentReason?.let { add(it) }
  addAll(this@getAllChildren.interpretation)
  addAll(this@getAllChildren.referenceRange)
}
