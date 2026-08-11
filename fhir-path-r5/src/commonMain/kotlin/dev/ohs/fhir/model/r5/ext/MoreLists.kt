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

import dev.ohs.fhir.model.r5.List as R5List
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List as CollectionsList

internal fun R5List.getProperty(name: String): Any? =
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
    "mode" -> this.mode
    "title" -> this.title
    "code" -> this.code
    "subject" -> this.subject
    "encounter" -> this.encounter
    "date" -> this.date
    "source" -> this.source
    "orderedBy" -> this.orderedBy
    "note" -> this.note
    "entry" -> this.entry
    "emptyReason" -> this.emptyReason
    else -> error("$name is not a valid property name")
  }

internal fun R5List.hasProperty(name: String): Boolean =
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
    "mode" -> true
    "title" -> true
    "code" -> true
    "subject" -> true
    "encounter" -> true
    "date" -> true
    "source" -> true
    "orderedBy" -> true
    "note" -> true
    "entry" -> true
    "emptyReason" -> true
    else -> false
  }

internal fun R5List.getAllChildren(): CollectionsList<Any> = buildList {
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
  add(this@getAllChildren.mode)
  this@getAllChildren.title?.let { add(it) }
  this@getAllChildren.code?.let { add(it) }
  addAll(this@getAllChildren.subject)
  this@getAllChildren.encounter?.let { add(it) }
  this@getAllChildren.date?.let { add(it) }
  this@getAllChildren.source?.let { add(it) }
  this@getAllChildren.orderedBy?.let { add(it) }
  addAll(this@getAllChildren.note)
  addAll(this@getAllChildren.entry)
  this@getAllChildren.emptyReason?.let { add(it) }
}

internal fun R5List.Entry.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "flag" -> this.flag
    "deleted" -> this.deleted
    "date" -> this.date
    "item" -> this.item
    else -> error("$name is not a valid property name")
  }

internal fun R5List.Entry.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "flag" -> true
    "deleted" -> true
    "date" -> true
    "item" -> true
    else -> false
  }

internal fun R5List.Entry.getAllChildren(): CollectionsList<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.flag?.let { add(it) }
  this@getAllChildren.deleted?.let { add(it) }
  this@getAllChildren.date?.let { add(it) }
  add(this@getAllChildren.item)
}
