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

import dev.ohs.fhir.model.r4.SpecimenDefinition
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun SpecimenDefinition.getProperty(name: String): Any? =
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
    "typeCollected" -> this.typeCollected
    "patientPreparation" -> this.patientPreparation
    "timeAspect" -> this.timeAspect
    "collection" -> this.collection
    "typeTested" -> this.typeTested
    else -> error("$name is not a valid property name")
  }

internal fun SpecimenDefinition.hasProperty(name: String): Boolean =
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
    "typeCollected" -> true
    "patientPreparation" -> true
    "timeAspect" -> true
    "collection" -> true
    "typeTested" -> true
    else -> false
  }

internal fun SpecimenDefinition.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.meta?.let { add(it) }
  this@getAllChildren.implicitRules?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.contained)
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.identifier?.let { add(it) }
  this@getAllChildren.typeCollected?.let { add(it) }
  addAll(this@getAllChildren.patientPreparation)
  this@getAllChildren.timeAspect?.let { add(it) }
  addAll(this@getAllChildren.collection)
  addAll(this@getAllChildren.typeTested)
}

internal fun SpecimenDefinition.TypeTested.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "isDerived" -> this.isDerived
    "type" -> this.type
    "preference" -> this.preference
    "container" -> this.container
    "requirement" -> this.requirement
    "retentionTime" -> this.retentionTime
    "rejectionCriterion" -> this.rejectionCriterion
    "handling" -> this.handling
    else -> error("$name is not a valid property name")
  }

internal fun SpecimenDefinition.TypeTested.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "isDerived" -> true
    "type" -> true
    "preference" -> true
    "container" -> true
    "requirement" -> true
    "retentionTime" -> true
    "rejectionCriterion" -> true
    "handling" -> true
    else -> false
  }

internal fun SpecimenDefinition.TypeTested.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.isDerived?.let { add(it) }
  this@getAllChildren.type?.let { add(it) }
  add(this@getAllChildren.preference)
  this@getAllChildren.container?.let { add(it) }
  this@getAllChildren.requirement?.let { add(it) }
  this@getAllChildren.retentionTime?.let { add(it) }
  addAll(this@getAllChildren.rejectionCriterion)
  addAll(this@getAllChildren.handling)
}

internal fun SpecimenDefinition.TypeTested.Container.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "material" -> this.material
    "type" -> this.type
    "cap" -> this.cap
    "description" -> this.description
    "capacity" -> this.capacity
    "minimumVolume" -> this.minimumVolume
    "additive" -> this.additive
    "preparation" -> this.preparation
    else -> error("$name is not a valid property name")
  }

internal fun SpecimenDefinition.TypeTested.Container.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "material" -> true
    "type" -> true
    "cap" -> true
    "description" -> true
    "capacity" -> true
    "minimumVolume" -> true
    "additive" -> true
    "preparation" -> true
    else -> false
  }

internal fun SpecimenDefinition.TypeTested.Container.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.material?.let { add(it) }
  this@getAllChildren.type?.let { add(it) }
  this@getAllChildren.cap?.let { add(it) }
  this@getAllChildren.description?.let { add(it) }
  this@getAllChildren.capacity?.let { add(it) }
  this@getAllChildren.minimumVolume?.let { add(it) }
  addAll(this@getAllChildren.additive)
  this@getAllChildren.preparation?.let { add(it) }
}

internal fun SpecimenDefinition.TypeTested.Container.Additive.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "additive" -> this.additive
    else -> error("$name is not a valid property name")
  }

internal fun SpecimenDefinition.TypeTested.Container.Additive.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "additive" -> true
    else -> false
  }

internal fun SpecimenDefinition.TypeTested.Container.Additive.getAllChildren(): List<Any> =
  buildList {
    this@getAllChildren.id?.let { add(it) }
    addAll(this@getAllChildren.extension)
    addAll(this@getAllChildren.modifierExtension)
    add(this@getAllChildren.additive)
  }

internal fun SpecimenDefinition.TypeTested.Handling.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "temperatureQualifier" -> this.temperatureQualifier
    "temperatureRange" -> this.temperatureRange
    "maxDuration" -> this.maxDuration
    "instruction" -> this.instruction
    else -> error("$name is not a valid property name")
  }

internal fun SpecimenDefinition.TypeTested.Handling.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "temperatureQualifier" -> true
    "temperatureRange" -> true
    "maxDuration" -> true
    "instruction" -> true
    else -> false
  }

internal fun SpecimenDefinition.TypeTested.Handling.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.temperatureQualifier?.let { add(it) }
  this@getAllChildren.temperatureRange?.let { add(it) }
  this@getAllChildren.maxDuration?.let { add(it) }
  this@getAllChildren.instruction?.let { add(it) }
}
