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

import dev.ohs.fhir.model.r4.StructureDefinition
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun StructureDefinition.getProperty(name: String): Any? =
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
    "status" -> this.status
    "experimental" -> this.experimental
    "date" -> this.date
    "publisher" -> this.publisher
    "contact" -> this.contact
    "description" -> this.description
    "useContext" -> this.useContext
    "jurisdiction" -> this.jurisdiction
    "purpose" -> this.purpose
    "copyright" -> this.copyright
    "keyword" -> this.keyword
    "fhirVersion" -> this.fhirVersion
    "mapping" -> this.mapping
    "kind" -> this.kind
    "abstract" -> this.`abstract`
    "context" -> this.context
    "contextInvariant" -> this.contextInvariant
    "type" -> this.type
    "baseDefinition" -> this.baseDefinition
    "derivation" -> this.derivation
    "snapshot" -> this.snapshot
    "differential" -> this.differential
    else -> error("$name is not a valid property name")
  }

internal fun StructureDefinition.hasProperty(name: String): Boolean =
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
    "status" -> true
    "experimental" -> true
    "date" -> true
    "publisher" -> true
    "contact" -> true
    "description" -> true
    "useContext" -> true
    "jurisdiction" -> true
    "purpose" -> true
    "copyright" -> true
    "keyword" -> true
    "fhirVersion" -> true
    "mapping" -> true
    "kind" -> true
    "abstract" -> true
    "context" -> true
    "contextInvariant" -> true
    "type" -> true
    "baseDefinition" -> true
    "derivation" -> true
    "snapshot" -> true
    "differential" -> true
    else -> false
  }

internal fun StructureDefinition.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.meta?.let { add(it) }
  this@getAllChildren.implicitRules?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.contained)
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.url)
  addAll(this@getAllChildren.identifier)
  this@getAllChildren.version?.let { add(it) }
  add(this@getAllChildren.name)
  this@getAllChildren.title?.let { add(it) }
  add(this@getAllChildren.status)
  this@getAllChildren.experimental?.let { add(it) }
  this@getAllChildren.date?.let { add(it) }
  this@getAllChildren.publisher?.let { add(it) }
  addAll(this@getAllChildren.contact)
  this@getAllChildren.description?.let { add(it) }
  addAll(this@getAllChildren.useContext)
  addAll(this@getAllChildren.jurisdiction)
  this@getAllChildren.purpose?.let { add(it) }
  this@getAllChildren.copyright?.let { add(it) }
  addAll(this@getAllChildren.keyword)
  this@getAllChildren.fhirVersion?.let { add(it) }
  addAll(this@getAllChildren.mapping)
  add(this@getAllChildren.kind)
  add(this@getAllChildren.`abstract`)
  addAll(this@getAllChildren.context)
  addAll(this@getAllChildren.contextInvariant)
  add(this@getAllChildren.type)
  this@getAllChildren.baseDefinition?.let { add(it) }
  this@getAllChildren.derivation?.let { add(it) }
  this@getAllChildren.snapshot?.let { add(it) }
  this@getAllChildren.differential?.let { add(it) }
}

internal fun StructureDefinition.Mapping.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "identity" -> this.identity
    "uri" -> this.uri
    "name" -> this.name
    "comment" -> this.comment
    else -> error("$name is not a valid property name")
  }

internal fun StructureDefinition.Mapping.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "identity" -> true
    "uri" -> true
    "name" -> true
    "comment" -> true
    else -> false
  }

internal fun StructureDefinition.Mapping.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.identity)
  this@getAllChildren.uri?.let { add(it) }
  this@getAllChildren.name?.let { add(it) }
  this@getAllChildren.comment?.let { add(it) }
}

internal fun StructureDefinition.Context.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "expression" -> this.expression
    else -> error("$name is not a valid property name")
  }

internal fun StructureDefinition.Context.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "expression" -> true
    else -> false
  }

internal fun StructureDefinition.Context.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.type)
  add(this@getAllChildren.expression)
}

internal fun StructureDefinition.Snapshot.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "element" -> this.element
    else -> error("$name is not a valid property name")
  }

internal fun StructureDefinition.Snapshot.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "element" -> true
    else -> false
  }

internal fun StructureDefinition.Snapshot.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.element)
}

internal fun StructureDefinition.Differential.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "element" -> this.element
    else -> error("$name is not a valid property name")
  }

internal fun StructureDefinition.Differential.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "element" -> true
    else -> false
  }

internal fun StructureDefinition.Differential.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.element)
}
