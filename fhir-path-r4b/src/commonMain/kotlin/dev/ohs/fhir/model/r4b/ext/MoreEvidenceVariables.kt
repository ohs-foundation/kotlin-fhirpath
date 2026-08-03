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

import dev.ohs.fhir.model.r4b.EvidenceVariable
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun EvidenceVariable.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "meta" -> this.meta
    "implicitRules" -> this.implicitRules
    "language" -> this.language
    "text" -> this.text
    "contained" -> this.contained
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "url" -> this.url
    "identifier" -> this.identifier
    "version" -> this.version
    "name" -> this.name
    "title" -> this.title
    "shortTitle" -> this.shortTitle
    "subtitle" -> this.subtitle
    "status" -> this.status
    "date" -> this.date
    "description" -> this.description
    "note" -> this.note
    "useContext" -> this.useContext
    "publisher" -> this.publisher
    "contact" -> this.contact
    "author" -> this.author
    "editor" -> this.editor
    "reviewer" -> this.reviewer
    "endorser" -> this.endorser
    "relatedArtifact" -> this.relatedArtifact
    "actual" -> this.`actual`
    "characteristicCombination" -> this.characteristicCombination
    "characteristic" -> this.characteristic
    "handling" -> this.handling
    "category" -> this.category
    else -> error("$name is not a valid property name")
  }

internal fun EvidenceVariable.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "meta" -> true
    "implicitRules" -> true
    "language" -> true
    "text" -> true
    "contained" -> true
    "extension" -> true
    "modifierExtension" -> true
    "url" -> true
    "identifier" -> true
    "version" -> true
    "name" -> true
    "title" -> true
    "shortTitle" -> true
    "subtitle" -> true
    "status" -> true
    "date" -> true
    "description" -> true
    "note" -> true
    "useContext" -> true
    "publisher" -> true
    "contact" -> true
    "author" -> true
    "editor" -> true
    "reviewer" -> true
    "endorser" -> true
    "relatedArtifact" -> true
    "actual" -> true
    "characteristicCombination" -> true
    "characteristic" -> true
    "handling" -> true
    "category" -> true
    else -> false
  }

internal fun EvidenceVariable.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.meta?.let { add(it) }
  this@getAllChildren.implicitRules?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.contained)
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.url?.let { add(it) }
  addAll(this@getAllChildren.identifier)
  this@getAllChildren.version?.let { add(it) }
  this@getAllChildren.name?.let { add(it) }
  this@getAllChildren.title?.let { add(it) }
  this@getAllChildren.shortTitle?.let { add(it) }
  this@getAllChildren.subtitle?.let { add(it) }
  add(this@getAllChildren.status)
  this@getAllChildren.date?.let { add(it) }
  this@getAllChildren.description?.let { add(it) }
  addAll(this@getAllChildren.note)
  addAll(this@getAllChildren.useContext)
  this@getAllChildren.publisher?.let { add(it) }
  addAll(this@getAllChildren.contact)
  addAll(this@getAllChildren.author)
  addAll(this@getAllChildren.editor)
  addAll(this@getAllChildren.reviewer)
  addAll(this@getAllChildren.endorser)
  addAll(this@getAllChildren.relatedArtifact)
  this@getAllChildren.`actual`?.let { add(it) }
  this@getAllChildren.characteristicCombination?.let { add(it) }
  addAll(this@getAllChildren.characteristic)
  this@getAllChildren.handling?.let { add(it) }
  addAll(this@getAllChildren.category)
}

internal fun EvidenceVariable.Characteristic.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "description" -> this.description
    "definition" -> this.definition
    "method" -> this.method
    "device" -> this.device
    "exclude" -> this.exclude
    "timeFromStart" -> this.timeFromStart
    "groupMeasure" -> this.groupMeasure
    else -> error("$name is not a valid property name")
  }

internal fun EvidenceVariable.Characteristic.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "description" -> true
    "definition" -> true
    "method" -> true
    "device" -> true
    "exclude" -> true
    "timeFromStart" -> true
    "groupMeasure" -> true
    else -> false
  }

internal fun EvidenceVariable.Characteristic.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.description?.let { add(it) }
  add(this@getAllChildren.definition)
  this@getAllChildren.method?.let { add(it) }
  this@getAllChildren.device?.let { add(it) }
  this@getAllChildren.exclude?.let { add(it) }
  this@getAllChildren.timeFromStart?.let { add(it) }
  this@getAllChildren.groupMeasure?.let { add(it) }
}

internal fun EvidenceVariable.Characteristic.TimeFromStart.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "description" -> this.description
    "quantity" -> this.quantity
    "range" -> this.range
    "note" -> this.note
    else -> error("$name is not a valid property name")
  }

internal fun EvidenceVariable.Characteristic.TimeFromStart.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "description" -> true
    "quantity" -> true
    "range" -> true
    "note" -> true
    else -> false
  }

internal fun EvidenceVariable.Characteristic.TimeFromStart.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.description?.let { add(it) }
  this@getAllChildren.quantity?.let { add(it) }
  this@getAllChildren.range?.let { add(it) }
  addAll(this@getAllChildren.note)
}

internal fun EvidenceVariable.Category.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "name" -> this.name
    "value" -> this.`value`
    else -> error("$name is not a valid property name")
  }

internal fun EvidenceVariable.Category.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "name" -> true
    "value" -> true
    else -> false
  }

internal fun EvidenceVariable.Category.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.name?.let { add(it) }
  this@getAllChildren.`value`?.let { add(it) }
}
