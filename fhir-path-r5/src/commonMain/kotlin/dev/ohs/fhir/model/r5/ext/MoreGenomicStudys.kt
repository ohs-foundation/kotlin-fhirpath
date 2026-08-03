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

import dev.ohs.fhir.model.r5.GenomicStudy
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun GenomicStudy.getProperty(name: String): Any? =
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
    "type" -> this.type
    "subject" -> this.subject
    "encounter" -> this.encounter
    "startDate" -> this.startDate
    "basedOn" -> this.basedOn
    "referrer" -> this.referrer
    "interpreter" -> this.interpreter
    "reason" -> this.reason
    "instantiatesCanonical" -> this.instantiatesCanonical
    "instantiatesUri" -> this.instantiatesUri
    "note" -> this.note
    "description" -> this.description
    "analysis" -> this.analysis
    else -> error("$name is not a valid property name")
  }

internal fun GenomicStudy.hasProperty(name: String): Boolean =
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
    "type" -> true
    "subject" -> true
    "encounter" -> true
    "startDate" -> true
    "basedOn" -> true
    "referrer" -> true
    "interpreter" -> true
    "reason" -> true
    "instantiatesCanonical" -> true
    "instantiatesUri" -> true
    "note" -> true
    "description" -> true
    "analysis" -> true
    else -> false
  }

internal fun GenomicStudy.getAllChildren(): List<Any> = buildList {
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
  addAll(this@getAllChildren.type)
  add(this@getAllChildren.subject)
  this@getAllChildren.encounter?.let { add(it) }
  this@getAllChildren.startDate?.let { add(it) }
  addAll(this@getAllChildren.basedOn)
  this@getAllChildren.referrer?.let { add(it) }
  addAll(this@getAllChildren.interpreter)
  addAll(this@getAllChildren.reason)
  this@getAllChildren.instantiatesCanonical?.let { add(it) }
  this@getAllChildren.instantiatesUri?.let { add(it) }
  addAll(this@getAllChildren.note)
  this@getAllChildren.description?.let { add(it) }
  addAll(this@getAllChildren.analysis)
}

internal fun GenomicStudy.Analysis.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "identifier" -> this.identifier
    "methodType" -> this.methodType
    "changeType" -> this.changeType
    "genomeBuild" -> this.genomeBuild
    "instantiatesCanonical" -> this.instantiatesCanonical
    "instantiatesUri" -> this.instantiatesUri
    "title" -> this.title
    "focus" -> this.focus
    "specimen" -> this.specimen
    "date" -> this.date
    "note" -> this.note
    "protocolPerformed" -> this.protocolPerformed
    "regionsStudied" -> this.regionsStudied
    "regionsCalled" -> this.regionsCalled
    "input" -> this.input
    "output" -> this.output
    "performer" -> this.performer
    "device" -> this.device
    else -> error("$name is not a valid property name")
  }

internal fun GenomicStudy.Analysis.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "identifier" -> true
    "methodType" -> true
    "changeType" -> true
    "genomeBuild" -> true
    "instantiatesCanonical" -> true
    "instantiatesUri" -> true
    "title" -> true
    "focus" -> true
    "specimen" -> true
    "date" -> true
    "note" -> true
    "protocolPerformed" -> true
    "regionsStudied" -> true
    "regionsCalled" -> true
    "input" -> true
    "output" -> true
    "performer" -> true
    "device" -> true
    else -> false
  }

internal fun GenomicStudy.Analysis.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.identifier)
  addAll(this@getAllChildren.methodType)
  addAll(this@getAllChildren.changeType)
  this@getAllChildren.genomeBuild?.let { add(it) }
  this@getAllChildren.instantiatesCanonical?.let { add(it) }
  this@getAllChildren.instantiatesUri?.let { add(it) }
  this@getAllChildren.title?.let { add(it) }
  addAll(this@getAllChildren.focus)
  addAll(this@getAllChildren.specimen)
  this@getAllChildren.date?.let { add(it) }
  addAll(this@getAllChildren.note)
  this@getAllChildren.protocolPerformed?.let { add(it) }
  addAll(this@getAllChildren.regionsStudied)
  addAll(this@getAllChildren.regionsCalled)
  addAll(this@getAllChildren.input)
  addAll(this@getAllChildren.output)
  addAll(this@getAllChildren.performer)
  addAll(this@getAllChildren.device)
}

internal fun GenomicStudy.Analysis.Input.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "file" -> this.`file`
    "type" -> this.type
    "generatedBy" -> this.generatedBy
    else -> error("$name is not a valid property name")
  }

internal fun GenomicStudy.Analysis.Input.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "file" -> true
    "type" -> true
    "generatedBy" -> true
    else -> false
  }

internal fun GenomicStudy.Analysis.Input.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.`file`?.let { add(it) }
  this@getAllChildren.type?.let { add(it) }
  this@getAllChildren.generatedBy?.let { add(it) }
}

internal fun GenomicStudy.Analysis.Output.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "file" -> this.`file`
    "type" -> this.type
    else -> error("$name is not a valid property name")
  }

internal fun GenomicStudy.Analysis.Output.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "file" -> true
    "type" -> true
    else -> false
  }

internal fun GenomicStudy.Analysis.Output.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.`file`?.let { add(it) }
  this@getAllChildren.type?.let { add(it) }
}

internal fun GenomicStudy.Analysis.Performer.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "actor" -> this.actor
    "role" -> this.role
    else -> error("$name is not a valid property name")
  }

internal fun GenomicStudy.Analysis.Performer.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "actor" -> true
    "role" -> true
    else -> false
  }

internal fun GenomicStudy.Analysis.Performer.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.actor?.let { add(it) }
  this@getAllChildren.role?.let { add(it) }
}

internal fun GenomicStudy.Analysis.Device.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "device" -> this.device
    "function" -> this.function
    else -> error("$name is not a valid property name")
  }

internal fun GenomicStudy.Analysis.Device.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "device" -> true
    "function" -> true
    else -> false
  }

internal fun GenomicStudy.Analysis.Device.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.device?.let { add(it) }
  this@getAllChildren.function?.let { add(it) }
}
