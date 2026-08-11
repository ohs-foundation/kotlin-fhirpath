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

import dev.ohs.fhir.model.r4.Specimen
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun Specimen.getProperty(name: String): Any? =
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
    "accessionIdentifier" -> this.accessionIdentifier
    "status" -> this.status
    "type" -> this.type
    "subject" -> this.subject
    "receivedTime" -> this.receivedTime
    "parent" -> this.parent
    "request" -> this.request
    "collection" -> this.collection
    "processing" -> this.processing
    "container" -> this.container
    "condition" -> this.condition
    "note" -> this.note
    else -> error("$name is not a valid property name")
  }

internal fun Specimen.hasProperty(name: String): Boolean =
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
    "accessionIdentifier" -> true
    "status" -> true
    "type" -> true
    "subject" -> true
    "receivedTime" -> true
    "parent" -> true
    "request" -> true
    "collection" -> true
    "processing" -> true
    "container" -> true
    "condition" -> true
    "note" -> true
    else -> false
  }

internal fun Specimen.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.meta?.let { add(it) }
  this@getAllChildren.implicitRules?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.contained)
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.identifier)
  this@getAllChildren.accessionIdentifier?.let { add(it) }
  this@getAllChildren.status?.let { add(it) }
  this@getAllChildren.type?.let { add(it) }
  this@getAllChildren.subject?.let { add(it) }
  this@getAllChildren.receivedTime?.let { add(it) }
  addAll(this@getAllChildren.parent)
  addAll(this@getAllChildren.request)
  this@getAllChildren.collection?.let { add(it) }
  addAll(this@getAllChildren.processing)
  addAll(this@getAllChildren.container)
  addAll(this@getAllChildren.condition)
  addAll(this@getAllChildren.note)
}

internal fun Specimen.Collection.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "collector" -> this.collector
    "collected" -> this.collected
    "duration" -> this.duration
    "quantity" -> this.quantity
    "method" -> this.method
    "bodySite" -> this.bodySite
    "fastingStatus" -> this.fastingStatus
    else -> error("$name is not a valid property name")
  }

internal fun Specimen.Collection.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "collector" -> true
    "collected" -> true
    "duration" -> true
    "quantity" -> true
    "method" -> true
    "bodySite" -> true
    "fastingStatus" -> true
    else -> false
  }

internal fun Specimen.Collection.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.collector?.let { add(it) }
  this@getAllChildren.collected?.let { add(it) }
  this@getAllChildren.duration?.let { add(it) }
  this@getAllChildren.quantity?.let { add(it) }
  this@getAllChildren.method?.let { add(it) }
  this@getAllChildren.bodySite?.let { add(it) }
  this@getAllChildren.fastingStatus?.let { add(it) }
}

internal fun Specimen.Processing.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "description" -> this.description
    "procedure" -> this.procedure
    "additive" -> this.additive
    "time" -> this.time
    else -> error("$name is not a valid property name")
  }

internal fun Specimen.Processing.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "description" -> true
    "procedure" -> true
    "additive" -> true
    "time" -> true
    else -> false
  }

internal fun Specimen.Processing.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.description?.let { add(it) }
  this@getAllChildren.procedure?.let { add(it) }
  addAll(this@getAllChildren.additive)
  this@getAllChildren.time?.let { add(it) }
}

internal fun Specimen.Container.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "identifier" -> this.identifier
    "description" -> this.description
    "type" -> this.type
    "capacity" -> this.capacity
    "specimenQuantity" -> this.specimenQuantity
    "additive" -> this.additive
    else -> error("$name is not a valid property name")
  }

internal fun Specimen.Container.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "identifier" -> true
    "description" -> true
    "type" -> true
    "capacity" -> true
    "specimenQuantity" -> true
    "additive" -> true
    else -> false
  }

internal fun Specimen.Container.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.identifier)
  this@getAllChildren.description?.let { add(it) }
  this@getAllChildren.type?.let { add(it) }
  this@getAllChildren.capacity?.let { add(it) }
  this@getAllChildren.specimenQuantity?.let { add(it) }
  this@getAllChildren.additive?.let { add(it) }
}
