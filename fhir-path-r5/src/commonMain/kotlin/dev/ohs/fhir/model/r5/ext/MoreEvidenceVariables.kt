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

import dev.ohs.fhir.model.r5.EvidenceVariable
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
    "versionAlgorithm" -> this.versionAlgorithm
    "name" -> this.name
    "title" -> this.title
    "shortTitle" -> this.shortTitle
    "status" -> this.status
    "experimental" -> this.experimental
    "date" -> this.date
    "publisher" -> this.publisher
    "contact" -> this.contact
    "description" -> this.description
    "note" -> this.note
    "useContext" -> this.useContext
    "purpose" -> this.purpose
    "copyright" -> this.copyright
    "copyrightLabel" -> this.copyrightLabel
    "approvalDate" -> this.approvalDate
    "lastReviewDate" -> this.lastReviewDate
    "effectivePeriod" -> this.effectivePeriod
    "author" -> this.author
    "editor" -> this.editor
    "reviewer" -> this.reviewer
    "endorser" -> this.endorser
    "relatedArtifact" -> this.relatedArtifact
    "actual" -> this.`actual`
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
    "versionAlgorithm" -> true
    "name" -> true
    "title" -> true
    "shortTitle" -> true
    "status" -> true
    "experimental" -> true
    "date" -> true
    "publisher" -> true
    "contact" -> true
    "description" -> true
    "note" -> true
    "useContext" -> true
    "purpose" -> true
    "copyright" -> true
    "copyrightLabel" -> true
    "approvalDate" -> true
    "lastReviewDate" -> true
    "effectivePeriod" -> true
    "author" -> true
    "editor" -> true
    "reviewer" -> true
    "endorser" -> true
    "relatedArtifact" -> true
    "actual" -> true
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
  this@getAllChildren.versionAlgorithm?.let { add(it) }
  this@getAllChildren.name?.let { add(it) }
  this@getAllChildren.title?.let { add(it) }
  this@getAllChildren.shortTitle?.let { add(it) }
  add(this@getAllChildren.status)
  this@getAllChildren.experimental?.let { add(it) }
  this@getAllChildren.date?.let { add(it) }
  this@getAllChildren.publisher?.let { add(it) }
  addAll(this@getAllChildren.contact)
  this@getAllChildren.description?.let { add(it) }
  addAll(this@getAllChildren.note)
  addAll(this@getAllChildren.useContext)
  this@getAllChildren.purpose?.let { add(it) }
  this@getAllChildren.copyright?.let { add(it) }
  this@getAllChildren.copyrightLabel?.let { add(it) }
  this@getAllChildren.approvalDate?.let { add(it) }
  this@getAllChildren.lastReviewDate?.let { add(it) }
  this@getAllChildren.effectivePeriod?.let { add(it) }
  addAll(this@getAllChildren.author)
  addAll(this@getAllChildren.editor)
  addAll(this@getAllChildren.reviewer)
  addAll(this@getAllChildren.endorser)
  addAll(this@getAllChildren.relatedArtifact)
  this@getAllChildren.`actual`?.let { add(it) }
  addAll(this@getAllChildren.characteristic)
  this@getAllChildren.handling?.let { add(it) }
  addAll(this@getAllChildren.category)
}

internal fun EvidenceVariable.Characteristic.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "linkId" -> this.linkId
    "description" -> this.description
    "note" -> this.note
    "exclude" -> this.exclude
    "definitionReference" -> this.definitionReference
    "definitionCanonical" -> this.definitionCanonical
    "definitionCodeableConcept" -> this.definitionCodeableConcept
    "definitionExpression" -> this.definitionExpression
    "definitionId" -> this.definitionId
    "definitionByTypeAndValue" -> this.definitionByTypeAndValue
    "definitionByCombination" -> this.definitionByCombination
    "instances" -> this.instances
    "duration" -> this.duration
    "timeFromEvent" -> this.timeFromEvent
    else -> error("$name is not a valid property name")
  }

internal fun EvidenceVariable.Characteristic.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "linkId" -> true
    "description" -> true
    "note" -> true
    "exclude" -> true
    "definitionReference" -> true
    "definitionCanonical" -> true
    "definitionCodeableConcept" -> true
    "definitionExpression" -> true
    "definitionId" -> true
    "definitionByTypeAndValue" -> true
    "definitionByCombination" -> true
    "instances" -> true
    "duration" -> true
    "timeFromEvent" -> true
    else -> false
  }

internal fun EvidenceVariable.Characteristic.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.linkId?.let { add(it) }
  this@getAllChildren.description?.let { add(it) }
  addAll(this@getAllChildren.note)
  this@getAllChildren.exclude?.let { add(it) }
  this@getAllChildren.definitionReference?.let { add(it) }
  this@getAllChildren.definitionCanonical?.let { add(it) }
  this@getAllChildren.definitionCodeableConcept?.let { add(it) }
  this@getAllChildren.definitionExpression?.let { add(it) }
  this@getAllChildren.definitionId?.let { add(it) }
  this@getAllChildren.definitionByTypeAndValue?.let { add(it) }
  this@getAllChildren.definitionByCombination?.let { add(it) }
  this@getAllChildren.instances?.let { add(it) }
  this@getAllChildren.duration?.let { add(it) }
  addAll(this@getAllChildren.timeFromEvent)
}

internal fun EvidenceVariable.Characteristic.DefinitionByTypeAndValue.getProperty(
  name: String
): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "method" -> this.method
    "device" -> this.device
    "value" -> this.`value`
    "offset" -> this.offset
    else -> error("$name is not a valid property name")
  }

internal fun EvidenceVariable.Characteristic.DefinitionByTypeAndValue.hasProperty(
  name: String
): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "method" -> true
    "device" -> true
    "value" -> true
    "offset" -> true
    else -> false
  }

internal fun EvidenceVariable.Characteristic.DefinitionByTypeAndValue.getAllChildren(): List<Any> =
  buildList {
    this@getAllChildren.id?.let { add(it) }
    addAll(this@getAllChildren.extension)
    addAll(this@getAllChildren.modifierExtension)
    add(this@getAllChildren.type)
    addAll(this@getAllChildren.method)
    this@getAllChildren.device?.let { add(it) }
    add(this@getAllChildren.`value`)
    this@getAllChildren.offset?.let { add(it) }
  }

internal fun EvidenceVariable.Characteristic.DefinitionByCombination.getProperty(
  name: String
): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "code" -> this.code
    "threshold" -> this.threshold
    "characteristic" -> this.characteristic
    else -> error("$name is not a valid property name")
  }

internal fun EvidenceVariable.Characteristic.DefinitionByCombination.hasProperty(
  name: String
): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "code" -> true
    "threshold" -> true
    "characteristic" -> true
    else -> false
  }

internal fun EvidenceVariable.Characteristic.DefinitionByCombination.getAllChildren(): List<Any> =
  buildList {
    this@getAllChildren.id?.let { add(it) }
    addAll(this@getAllChildren.extension)
    addAll(this@getAllChildren.modifierExtension)
    add(this@getAllChildren.code)
    this@getAllChildren.threshold?.let { add(it) }
    addAll(this@getAllChildren.characteristic)
  }

internal fun EvidenceVariable.Characteristic.TimeFromEvent.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "description" -> this.description
    "note" -> this.note
    "event" -> this.event
    "quantity" -> this.quantity
    "range" -> this.range
    else -> error("$name is not a valid property name")
  }

internal fun EvidenceVariable.Characteristic.TimeFromEvent.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "description" -> true
    "note" -> true
    "event" -> true
    "quantity" -> true
    "range" -> true
    else -> false
  }

internal fun EvidenceVariable.Characteristic.TimeFromEvent.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.description?.let { add(it) }
  addAll(this@getAllChildren.note)
  this@getAllChildren.event?.let { add(it) }
  this@getAllChildren.quantity?.let { add(it) }
  this@getAllChildren.range?.let { add(it) }
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
