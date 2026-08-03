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

import dev.ohs.fhir.model.r4.Composition
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun Composition.getProperty(name: String): Any? =
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
    "type" -> this.type
    "category" -> this.category
    "subject" -> this.subject
    "encounter" -> this.encounter
    "date" -> this.date
    "author" -> this.author
    "title" -> this.title
    "confidentiality" -> this.confidentiality
    "attester" -> this.attester
    "custodian" -> this.custodian
    "relatesTo" -> this.relatesTo
    "event" -> this.event
    "section" -> this.section
    else -> error("$name is not a valid property name")
  }

internal fun Composition.hasProperty(name: String): Boolean =
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
    "type" -> true
    "category" -> true
    "subject" -> true
    "encounter" -> true
    "date" -> true
    "author" -> true
    "title" -> true
    "confidentiality" -> true
    "attester" -> true
    "custodian" -> true
    "relatesTo" -> true
    "event" -> true
    "section" -> true
    else -> false
  }

internal fun Composition.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.meta?.let { add(it) }
  this@getAllChildren.implicitRules?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.contained)
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.identifier?.let { add(it) }
  add(this@getAllChildren.status)
  add(this@getAllChildren.type)
  addAll(this@getAllChildren.category)
  this@getAllChildren.subject?.let { add(it) }
  this@getAllChildren.encounter?.let { add(it) }
  add(this@getAllChildren.date)
  addAll(this@getAllChildren.author)
  add(this@getAllChildren.title)
  this@getAllChildren.confidentiality?.let { add(it) }
  addAll(this@getAllChildren.attester)
  this@getAllChildren.custodian?.let { add(it) }
  addAll(this@getAllChildren.relatesTo)
  addAll(this@getAllChildren.event)
  addAll(this@getAllChildren.section)
}

internal fun Composition.Attester.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "mode" -> this.mode
    "time" -> this.time
    "party" -> this.party
    else -> error("$name is not a valid property name")
  }

internal fun Composition.Attester.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "mode" -> true
    "time" -> true
    "party" -> true
    else -> false
  }

internal fun Composition.Attester.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.mode)
  this@getAllChildren.time?.let { add(it) }
  this@getAllChildren.party?.let { add(it) }
}

internal fun Composition.RelatesTo.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "code" -> this.code
    "target" -> this.target
    else -> error("$name is not a valid property name")
  }

internal fun Composition.RelatesTo.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "code" -> true
    "target" -> true
    else -> false
  }

internal fun Composition.RelatesTo.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.code)
  add(this@getAllChildren.target)
}

internal fun Composition.Event.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "code" -> this.code
    "period" -> this.period
    "detail" -> this.detail
    else -> error("$name is not a valid property name")
  }

internal fun Composition.Event.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "code" -> true
    "period" -> true
    "detail" -> true
    else -> false
  }

internal fun Composition.Event.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.code)
  this@getAllChildren.period?.let { add(it) }
  addAll(this@getAllChildren.detail)
}

internal fun Composition.Section.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "title" -> this.title
    "code" -> this.code
    "author" -> this.author
    "focus" -> this.focus
    "text" -> this.text
    "mode" -> this.mode
    "orderedBy" -> this.orderedBy
    "entry" -> this.entry
    "emptyReason" -> this.emptyReason
    "section" -> this.section
    else -> error("$name is not a valid property name")
  }

internal fun Composition.Section.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "title" -> true
    "code" -> true
    "author" -> true
    "focus" -> true
    "text" -> true
    "mode" -> true
    "orderedBy" -> true
    "entry" -> true
    "emptyReason" -> true
    "section" -> true
    else -> false
  }

internal fun Composition.Section.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.title?.let { add(it) }
  this@getAllChildren.code?.let { add(it) }
  addAll(this@getAllChildren.author)
  this@getAllChildren.focus?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  this@getAllChildren.mode?.let { add(it) }
  this@getAllChildren.orderedBy?.let { add(it) }
  addAll(this@getAllChildren.entry)
  this@getAllChildren.emptyReason?.let { add(it) }
  addAll(this@getAllChildren.section)
}
