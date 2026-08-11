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

import dev.ohs.fhir.model.r5.VisionPrescription
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun VisionPrescription.getProperty(name: String): Any? =
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
    "created" -> this.created
    "patient" -> this.patient
    "encounter" -> this.encounter
    "dateWritten" -> this.dateWritten
    "prescriber" -> this.prescriber
    "lensSpecification" -> this.lensSpecification
    else -> error("$name is not a valid property name")
  }

internal fun VisionPrescription.hasProperty(name: String): Boolean =
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
    "created" -> true
    "patient" -> true
    "encounter" -> true
    "dateWritten" -> true
    "prescriber" -> true
    "lensSpecification" -> true
    else -> false
  }

internal fun VisionPrescription.getAllChildren(): List<Any> = buildList {
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
  add(this@getAllChildren.created)
  add(this@getAllChildren.patient)
  this@getAllChildren.encounter?.let { add(it) }
  add(this@getAllChildren.dateWritten)
  add(this@getAllChildren.prescriber)
  addAll(this@getAllChildren.lensSpecification)
}

internal fun VisionPrescription.LensSpecification.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "product" -> this.product
    "eye" -> this.eye
    "sphere" -> this.sphere
    "cylinder" -> this.cylinder
    "axis" -> this.axis
    "prism" -> this.prism
    "add" -> this.add
    "power" -> this.power
    "backCurve" -> this.backCurve
    "diameter" -> this.diameter
    "duration" -> this.duration
    "color" -> this.color
    "brand" -> this.brand
    "note" -> this.note
    else -> error("$name is not a valid property name")
  }

internal fun VisionPrescription.LensSpecification.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "product" -> true
    "eye" -> true
    "sphere" -> true
    "cylinder" -> true
    "axis" -> true
    "prism" -> true
    "add" -> true
    "power" -> true
    "backCurve" -> true
    "diameter" -> true
    "duration" -> true
    "color" -> true
    "brand" -> true
    "note" -> true
    else -> false
  }

internal fun VisionPrescription.LensSpecification.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.product)
  add(this@getAllChildren.eye)
  this@getAllChildren.sphere?.let { add(it) }
  this@getAllChildren.cylinder?.let { add(it) }
  this@getAllChildren.axis?.let { add(it) }
  addAll(this@getAllChildren.prism)
  this@getAllChildren.add?.let { add(it) }
  this@getAllChildren.power?.let { add(it) }
  this@getAllChildren.backCurve?.let { add(it) }
  this@getAllChildren.diameter?.let { add(it) }
  this@getAllChildren.duration?.let { add(it) }
  this@getAllChildren.color?.let { add(it) }
  this@getAllChildren.brand?.let { add(it) }
  addAll(this@getAllChildren.note)
}

internal fun VisionPrescription.LensSpecification.Prism.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "amount" -> this.amount
    "base" -> this.base
    else -> error("$name is not a valid property name")
  }

internal fun VisionPrescription.LensSpecification.Prism.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "amount" -> true
    "base" -> true
    else -> false
  }

internal fun VisionPrescription.LensSpecification.Prism.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.amount)
  add(this@getAllChildren.base)
}
