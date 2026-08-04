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

import dev.ohs.fhir.model.r5.ImagingSelection
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun ImagingSelection.getProperty(name: String): Any? =
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
    "subject" -> this.subject
    "issued" -> this.issued
    "performer" -> this.performer
    "basedOn" -> this.basedOn
    "category" -> this.category
    "code" -> this.code
    "studyUid" -> this.studyUid
    "derivedFrom" -> this.derivedFrom
    "endpoint" -> this.endpoint
    "seriesUid" -> this.seriesUid
    "seriesNumber" -> this.seriesNumber
    "frameOfReferenceUid" -> this.frameOfReferenceUid
    "bodySite" -> this.bodySite
    "focus" -> this.focus
    "instance" -> this.instance
    else -> error("$name is not a valid property name")
  }

internal fun ImagingSelection.hasProperty(name: String): Boolean =
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
    "subject" -> true
    "issued" -> true
    "performer" -> true
    "basedOn" -> true
    "category" -> true
    "code" -> true
    "studyUid" -> true
    "derivedFrom" -> true
    "endpoint" -> true
    "seriesUid" -> true
    "seriesNumber" -> true
    "frameOfReferenceUid" -> true
    "bodySite" -> true
    "focus" -> true
    "instance" -> true
    else -> false
  }

internal fun ImagingSelection.getAllChildren(): List<Any> = buildList {
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
  this@getAllChildren.subject?.let { add(it) }
  this@getAllChildren.issued?.let { add(it) }
  addAll(this@getAllChildren.performer)
  addAll(this@getAllChildren.basedOn)
  addAll(this@getAllChildren.category)
  add(this@getAllChildren.code)
  this@getAllChildren.studyUid?.let { add(it) }
  addAll(this@getAllChildren.derivedFrom)
  addAll(this@getAllChildren.endpoint)
  this@getAllChildren.seriesUid?.let { add(it) }
  this@getAllChildren.seriesNumber?.let { add(it) }
  this@getAllChildren.frameOfReferenceUid?.let { add(it) }
  this@getAllChildren.bodySite?.let { add(it) }
  addAll(this@getAllChildren.focus)
  addAll(this@getAllChildren.instance)
}

internal fun ImagingSelection.Performer.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "function" -> this.function
    "actor" -> this.actor
    else -> error("$name is not a valid property name")
  }

internal fun ImagingSelection.Performer.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "function" -> true
    "actor" -> true
    else -> false
  }

internal fun ImagingSelection.Performer.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.function?.let { add(it) }
  this@getAllChildren.actor?.let { add(it) }
}

internal fun ImagingSelection.Instance.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "uid" -> this.uid
    "number" -> this.number
    "sopClass" -> this.sopClass
    "subset" -> this.subset
    "imageRegion2D" -> this.imageRegion2D
    "imageRegion3D" -> this.imageRegion3D
    else -> error("$name is not a valid property name")
  }

internal fun ImagingSelection.Instance.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "uid" -> true
    "number" -> true
    "sopClass" -> true
    "subset" -> true
    "imageRegion2D" -> true
    "imageRegion3D" -> true
    else -> false
  }

internal fun ImagingSelection.Instance.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.uid)
  this@getAllChildren.number?.let { add(it) }
  this@getAllChildren.sopClass?.let { add(it) }
  addAll(this@getAllChildren.subset)
  addAll(this@getAllChildren.imageRegion2D)
  addAll(this@getAllChildren.imageRegion3D)
}

internal fun ImagingSelection.Instance.ImageRegion2D.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "regionType" -> this.regionType
    "coordinate" -> this.coordinate
    else -> error("$name is not a valid property name")
  }

internal fun ImagingSelection.Instance.ImageRegion2D.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "regionType" -> true
    "coordinate" -> true
    else -> false
  }

internal fun ImagingSelection.Instance.ImageRegion2D.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.regionType)
  addAll(this@getAllChildren.coordinate)
}

internal fun ImagingSelection.Instance.ImageRegion3D.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "regionType" -> this.regionType
    "coordinate" -> this.coordinate
    else -> error("$name is not a valid property name")
  }

internal fun ImagingSelection.Instance.ImageRegion3D.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "regionType" -> true
    "coordinate" -> true
    else -> false
  }

internal fun ImagingSelection.Instance.ImageRegion3D.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.regionType)
  addAll(this@getAllChildren.coordinate)
}
