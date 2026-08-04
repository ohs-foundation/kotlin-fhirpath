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

import dev.ohs.fhir.model.r4.EvidenceVariable
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
    "publisher" -> this.publisher
    "contact" -> this.contact
    "description" -> this.description
    "note" -> this.note
    "useContext" -> this.useContext
    "jurisdiction" -> this.jurisdiction
    "copyright" -> this.copyright
    "approvalDate" -> this.approvalDate
    "lastReviewDate" -> this.lastReviewDate
    "effectivePeriod" -> this.effectivePeriod
    "topic" -> this.topic
    "author" -> this.author
    "editor" -> this.editor
    "reviewer" -> this.reviewer
    "endorser" -> this.endorser
    "relatedArtifact" -> this.relatedArtifact
    "type" -> this.type
    "characteristic" -> this.characteristic
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
    "publisher" -> true
    "contact" -> true
    "description" -> true
    "note" -> true
    "useContext" -> true
    "jurisdiction" -> true
    "copyright" -> true
    "approvalDate" -> true
    "lastReviewDate" -> true
    "effectivePeriod" -> true
    "topic" -> true
    "author" -> true
    "editor" -> true
    "reviewer" -> true
    "endorser" -> true
    "relatedArtifact" -> true
    "type" -> true
    "characteristic" -> true
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
  this@getAllChildren.publisher?.let { add(it) }
  addAll(this@getAllChildren.contact)
  this@getAllChildren.description?.let { add(it) }
  addAll(this@getAllChildren.note)
  addAll(this@getAllChildren.useContext)
  addAll(this@getAllChildren.jurisdiction)
  this@getAllChildren.copyright?.let { add(it) }
  this@getAllChildren.approvalDate?.let { add(it) }
  this@getAllChildren.lastReviewDate?.let { add(it) }
  this@getAllChildren.effectivePeriod?.let { add(it) }
  addAll(this@getAllChildren.topic)
  addAll(this@getAllChildren.author)
  addAll(this@getAllChildren.editor)
  addAll(this@getAllChildren.reviewer)
  addAll(this@getAllChildren.endorser)
  addAll(this@getAllChildren.relatedArtifact)
  this@getAllChildren.type?.let { add(it) }
  addAll(this@getAllChildren.characteristic)
}

internal fun EvidenceVariable.Characteristic.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "description" -> this.description
    "definition" -> this.definition
    "usageContext" -> this.usageContext
    "exclude" -> this.exclude
    "participantEffective" -> this.participantEffective
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
    "usageContext" -> true
    "exclude" -> true
    "participantEffective" -> true
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
  addAll(this@getAllChildren.usageContext)
  this@getAllChildren.exclude?.let { add(it) }
  this@getAllChildren.participantEffective?.let { add(it) }
  this@getAllChildren.timeFromStart?.let { add(it) }
  this@getAllChildren.groupMeasure?.let { add(it) }
}
