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

import dev.ohs.fhir.model.r4.ImagingStudy
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun ImagingStudy.getProperty(name: String): Any? =
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
    "modality" -> this.modality
    "subject" -> this.subject
    "encounter" -> this.encounter
    "started" -> this.started
    "basedOn" -> this.basedOn
    "referrer" -> this.referrer
    "interpreter" -> this.interpreter
    "endpoint" -> this.endpoint
    "numberOfSeries" -> this.numberOfSeries
    "numberOfInstances" -> this.numberOfInstances
    "procedureReference" -> this.procedureReference
    "procedureCode" -> this.procedureCode
    "location" -> this.location
    "reasonCode" -> this.reasonCode
    "reasonReference" -> this.reasonReference
    "note" -> this.note
    "description" -> this.description
    "series" -> this.series
    else -> error("$name is not a valid property name")
  }

internal fun ImagingStudy.hasProperty(name: String): Boolean =
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
    "modality" -> true
    "subject" -> true
    "encounter" -> true
    "started" -> true
    "basedOn" -> true
    "referrer" -> true
    "interpreter" -> true
    "endpoint" -> true
    "numberOfSeries" -> true
    "numberOfInstances" -> true
    "procedureReference" -> true
    "procedureCode" -> true
    "location" -> true
    "reasonCode" -> true
    "reasonReference" -> true
    "note" -> true
    "description" -> true
    "series" -> true
    else -> false
  }

internal fun ImagingStudy.getAllChildren(): List<Any> = buildList {
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
  addAll(this@getAllChildren.modality)
  add(this@getAllChildren.subject)
  this@getAllChildren.encounter?.let { add(it) }
  this@getAllChildren.started?.let { add(it) }
  addAll(this@getAllChildren.basedOn)
  this@getAllChildren.referrer?.let { add(it) }
  addAll(this@getAllChildren.interpreter)
  addAll(this@getAllChildren.endpoint)
  this@getAllChildren.numberOfSeries?.let { add(it) }
  this@getAllChildren.numberOfInstances?.let { add(it) }
  this@getAllChildren.procedureReference?.let { add(it) }
  addAll(this@getAllChildren.procedureCode)
  this@getAllChildren.location?.let { add(it) }
  addAll(this@getAllChildren.reasonCode)
  addAll(this@getAllChildren.reasonReference)
  addAll(this@getAllChildren.note)
  this@getAllChildren.description?.let { add(it) }
  addAll(this@getAllChildren.series)
}

internal fun ImagingStudy.Series.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "uid" -> this.uid
    "number" -> this.number
    "modality" -> this.modality
    "description" -> this.description
    "numberOfInstances" -> this.numberOfInstances
    "endpoint" -> this.endpoint
    "bodySite" -> this.bodySite
    "laterality" -> this.laterality
    "specimen" -> this.specimen
    "started" -> this.started
    "performer" -> this.performer
    "instance" -> this.instance
    else -> error("$name is not a valid property name")
  }

internal fun ImagingStudy.Series.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "uid" -> true
    "number" -> true
    "modality" -> true
    "description" -> true
    "numberOfInstances" -> true
    "endpoint" -> true
    "bodySite" -> true
    "laterality" -> true
    "specimen" -> true
    "started" -> true
    "performer" -> true
    "instance" -> true
    else -> false
  }

internal fun ImagingStudy.Series.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.uid)
  this@getAllChildren.number?.let { add(it) }
  add(this@getAllChildren.modality)
  this@getAllChildren.description?.let { add(it) }
  this@getAllChildren.numberOfInstances?.let { add(it) }
  addAll(this@getAllChildren.endpoint)
  this@getAllChildren.bodySite?.let { add(it) }
  this@getAllChildren.laterality?.let { add(it) }
  addAll(this@getAllChildren.specimen)
  this@getAllChildren.started?.let { add(it) }
  addAll(this@getAllChildren.performer)
  addAll(this@getAllChildren.instance)
}

internal fun ImagingStudy.Series.Performer.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "function" -> this.function
    "actor" -> this.actor
    else -> error("$name is not a valid property name")
  }

internal fun ImagingStudy.Series.Performer.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "function" -> true
    "actor" -> true
    else -> false
  }

internal fun ImagingStudy.Series.Performer.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.function?.let { add(it) }
  add(this@getAllChildren.actor)
}

internal fun ImagingStudy.Series.Instance.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "uid" -> this.uid
    "sopClass" -> this.sopClass
    "number" -> this.number
    "title" -> this.title
    else -> error("$name is not a valid property name")
  }

internal fun ImagingStudy.Series.Instance.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "uid" -> true
    "sopClass" -> true
    "number" -> true
    "title" -> true
    else -> false
  }

internal fun ImagingStudy.Series.Instance.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.uid)
  add(this@getAllChildren.sopClass)
  this@getAllChildren.number?.let { add(it) }
  this@getAllChildren.title?.let { add(it) }
}
