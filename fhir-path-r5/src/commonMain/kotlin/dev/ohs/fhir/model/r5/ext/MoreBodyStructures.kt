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

import dev.ohs.fhir.model.r5.BodyStructure
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun BodyStructure.getProperty(name: String): Any? =
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
    "active" -> this.active
    "morphology" -> this.morphology
    "includedStructure" -> this.includedStructure
    "excludedStructure" -> this.excludedStructure
    "description" -> this.description
    "image" -> this.image
    "patient" -> this.patient
    else -> error("$name is not a valid property name")
  }

internal fun BodyStructure.hasProperty(name: String): Boolean =
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
    "active" -> true
    "morphology" -> true
    "includedStructure" -> true
    "excludedStructure" -> true
    "description" -> true
    "image" -> true
    "patient" -> true
    else -> false
  }

internal fun BodyStructure.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.meta?.let { add(it) }
  this@getAllChildren.implicitRules?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.contained)
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.identifier)
  this@getAllChildren.active?.let { add(it) }
  this@getAllChildren.morphology?.let { add(it) }
  addAll(this@getAllChildren.includedStructure)
  addAll(this@getAllChildren.excludedStructure)
  this@getAllChildren.description?.let { add(it) }
  addAll(this@getAllChildren.image)
  add(this@getAllChildren.patient)
}

internal fun BodyStructure.IncludedStructure.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "structure" -> this.structure
    "laterality" -> this.laterality
    "bodyLandmarkOrientation" -> this.bodyLandmarkOrientation
    "spatialReference" -> this.spatialReference
    "qualifier" -> this.qualifier
    else -> error("$name is not a valid property name")
  }

internal fun BodyStructure.IncludedStructure.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "structure" -> true
    "laterality" -> true
    "bodyLandmarkOrientation" -> true
    "spatialReference" -> true
    "qualifier" -> true
    else -> false
  }

internal fun BodyStructure.IncludedStructure.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.structure)
  this@getAllChildren.laterality?.let { add(it) }
  addAll(this@getAllChildren.bodyLandmarkOrientation)
  addAll(this@getAllChildren.spatialReference)
  addAll(this@getAllChildren.qualifier)
}

internal fun BodyStructure.IncludedStructure.BodyLandmarkOrientation.getProperty(
  name: String
): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "landmarkDescription" -> this.landmarkDescription
    "clockFacePosition" -> this.clockFacePosition
    "distanceFromLandmark" -> this.distanceFromLandmark
    "surfaceOrientation" -> this.surfaceOrientation
    else -> error("$name is not a valid property name")
  }

internal fun BodyStructure.IncludedStructure.BodyLandmarkOrientation.hasProperty(
  name: String
): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "landmarkDescription" -> true
    "clockFacePosition" -> true
    "distanceFromLandmark" -> true
    "surfaceOrientation" -> true
    else -> false
  }

internal fun BodyStructure.IncludedStructure.BodyLandmarkOrientation.getAllChildren(): List<Any> =
  buildList {
    this@getAllChildren.id?.let { add(it) }
    addAll(this@getAllChildren.extension)
    addAll(this@getAllChildren.modifierExtension)
    addAll(this@getAllChildren.landmarkDescription)
    addAll(this@getAllChildren.clockFacePosition)
    addAll(this@getAllChildren.distanceFromLandmark)
    addAll(this@getAllChildren.surfaceOrientation)
  }

internal fun BodyStructure.IncludedStructure.BodyLandmarkOrientation.DistanceFromLandmark
  .getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "device" -> this.device
    "value" -> this.`value`
    else -> error("$name is not a valid property name")
  }

internal fun BodyStructure.IncludedStructure.BodyLandmarkOrientation.DistanceFromLandmark
  .hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "device" -> true
    "value" -> true
    else -> false
  }

internal fun BodyStructure.IncludedStructure.BodyLandmarkOrientation.DistanceFromLandmark
  .getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.device)
  addAll(this@getAllChildren.`value`)
}
