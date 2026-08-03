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

import dev.ohs.fhir.model.r4b.EvidenceReport
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun EvidenceReport.getProperty(name: String): Any? =
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
    "status" -> this.status
    "useContext" -> this.useContext
    "identifier" -> this.identifier
    "relatedIdentifier" -> this.relatedIdentifier
    "citeAs" -> this.citeAs
    "type" -> this.type
    "note" -> this.note
    "relatedArtifact" -> this.relatedArtifact
    "subject" -> this.subject
    "publisher" -> this.publisher
    "contact" -> this.contact
    "author" -> this.author
    "editor" -> this.editor
    "reviewer" -> this.reviewer
    "endorser" -> this.endorser
    "relatesTo" -> this.relatesTo
    "section" -> this.section
    else -> error("$name is not a valid property name")
  }

internal fun EvidenceReport.hasProperty(name: String): Boolean =
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
    "status" -> true
    "useContext" -> true
    "identifier" -> true
    "relatedIdentifier" -> true
    "citeAs" -> true
    "type" -> true
    "note" -> true
    "relatedArtifact" -> true
    "subject" -> true
    "publisher" -> true
    "contact" -> true
    "author" -> true
    "editor" -> true
    "reviewer" -> true
    "endorser" -> true
    "relatesTo" -> true
    "section" -> true
    else -> false
  }

internal fun EvidenceReport.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.meta?.let { add(it) }
  this@getAllChildren.implicitRules?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.contained)
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.url?.let { add(it) }
  add(this@getAllChildren.status)
  addAll(this@getAllChildren.useContext)
  addAll(this@getAllChildren.identifier)
  addAll(this@getAllChildren.relatedIdentifier)
  this@getAllChildren.citeAs?.let { add(it) }
  this@getAllChildren.type?.let { add(it) }
  addAll(this@getAllChildren.note)
  addAll(this@getAllChildren.relatedArtifact)
  add(this@getAllChildren.subject)
  this@getAllChildren.publisher?.let { add(it) }
  addAll(this@getAllChildren.contact)
  addAll(this@getAllChildren.author)
  addAll(this@getAllChildren.editor)
  addAll(this@getAllChildren.reviewer)
  addAll(this@getAllChildren.endorser)
  addAll(this@getAllChildren.relatesTo)
  addAll(this@getAllChildren.section)
}

internal fun EvidenceReport.Subject.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "characteristic" -> this.characteristic
    "note" -> this.note
    else -> error("$name is not a valid property name")
  }

internal fun EvidenceReport.Subject.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "characteristic" -> true
    "note" -> true
    else -> false
  }

internal fun EvidenceReport.Subject.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.characteristic)
  addAll(this@getAllChildren.note)
}

internal fun EvidenceReport.Subject.Characteristic.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "code" -> this.code
    "value" -> this.`value`
    "exclude" -> this.exclude
    "period" -> this.period
    else -> error("$name is not a valid property name")
  }

internal fun EvidenceReport.Subject.Characteristic.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "code" -> true
    "value" -> true
    "exclude" -> true
    "period" -> true
    else -> false
  }

internal fun EvidenceReport.Subject.Characteristic.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.code)
  add(this@getAllChildren.`value`)
  this@getAllChildren.exclude?.let { add(it) }
  this@getAllChildren.period?.let { add(it) }
}

internal fun EvidenceReport.RelatesTo.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "code" -> this.code
    "target" -> this.target
    else -> error("$name is not a valid property name")
  }

internal fun EvidenceReport.RelatesTo.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "code" -> true
    "target" -> true
    else -> false
  }

internal fun EvidenceReport.RelatesTo.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.code)
  add(this@getAllChildren.target)
}

internal fun EvidenceReport.Section.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "title" -> this.title
    "focus" -> this.focus
    "focusReference" -> this.focusReference
    "author" -> this.author
    "text" -> this.text
    "mode" -> this.mode
    "orderedBy" -> this.orderedBy
    "entryClassifier" -> this.entryClassifier
    "entryReference" -> this.entryReference
    "entryQuantity" -> this.entryQuantity
    "emptyReason" -> this.emptyReason
    "section" -> this.section
    else -> error("$name is not a valid property name")
  }

internal fun EvidenceReport.Section.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "title" -> true
    "focus" -> true
    "focusReference" -> true
    "author" -> true
    "text" -> true
    "mode" -> true
    "orderedBy" -> true
    "entryClassifier" -> true
    "entryReference" -> true
    "entryQuantity" -> true
    "emptyReason" -> true
    "section" -> true
    else -> false
  }

internal fun EvidenceReport.Section.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.title?.let { add(it) }
  this@getAllChildren.focus?.let { add(it) }
  this@getAllChildren.focusReference?.let { add(it) }
  addAll(this@getAllChildren.author)
  this@getAllChildren.text?.let { add(it) }
  this@getAllChildren.mode?.let { add(it) }
  this@getAllChildren.orderedBy?.let { add(it) }
  addAll(this@getAllChildren.entryClassifier)
  addAll(this@getAllChildren.entryReference)
  addAll(this@getAllChildren.entryQuantity)
  this@getAllChildren.emptyReason?.let { add(it) }
  addAll(this@getAllChildren.section)
}
