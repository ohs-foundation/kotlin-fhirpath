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

import dev.ohs.fhir.model.r4b.DocumentManifest
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun DocumentManifest.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "meta" -> this.meta
    "implicitRules" -> this.implicitRules
    "language" -> this.language
    "text" -> this.text
    "contained" -> this.contained
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "masterIdentifier" -> this.masterIdentifier
    "identifier" -> this.identifier
    "status" -> this.status
    "type" -> this.type
    "subject" -> this.subject
    "created" -> this.created
    "author" -> this.author
    "recipient" -> this.recipient
    "source" -> this.source
    "description" -> this.description
    "content" -> this.content
    "related" -> this.related
    else -> error("$name is not a valid property name")
  }

internal fun DocumentManifest.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "meta" -> true
    "implicitRules" -> true
    "language" -> true
    "text" -> true
    "contained" -> true
    "extension" -> true
    "modifierExtension" -> true
    "masterIdentifier" -> true
    "identifier" -> true
    "status" -> true
    "type" -> true
    "subject" -> true
    "created" -> true
    "author" -> true
    "recipient" -> true
    "source" -> true
    "description" -> true
    "content" -> true
    "related" -> true
    else -> false
  }

internal fun DocumentManifest.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.meta?.let { add(it) }
  this@getAllChildren.implicitRules?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.contained)
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.masterIdentifier?.let { add(it) }
  addAll(this@getAllChildren.identifier)
  add(this@getAllChildren.status)
  this@getAllChildren.type?.let { add(it) }
  this@getAllChildren.subject?.let { add(it) }
  this@getAllChildren.created?.let { add(it) }
  addAll(this@getAllChildren.author)
  addAll(this@getAllChildren.recipient)
  this@getAllChildren.source?.let { add(it) }
  this@getAllChildren.description?.let { add(it) }
  addAll(this@getAllChildren.content)
  addAll(this@getAllChildren.related)
}

internal fun DocumentManifest.Related.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "identifier" -> this.identifier
    "ref" -> this.ref
    else -> error("$name is not a valid property name")
  }

internal fun DocumentManifest.Related.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "identifier" -> true
    "ref" -> true
    else -> false
  }

internal fun DocumentManifest.Related.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.identifier?.let { add(it) }
  this@getAllChildren.ref?.let { add(it) }
}
