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

import dev.ohs.fhir.model.r4.CodeSystem
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun CodeSystem.getProperty(name: String): Any? =
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
    "caseSensitive" -> this.caseSensitive
    "valueSet" -> this.valueSet
    "hierarchyMeaning" -> this.hierarchyMeaning
    "compositional" -> this.compositional
    "versionNeeded" -> this.versionNeeded
    "content" -> this.content
    "supplements" -> this.supplements
    "count" -> this.count
    "filter" -> this.filter
    "property" -> this.`property`
    "concept" -> this.concept
    else -> error("$name is not a valid property name")
  }

internal fun CodeSystem.hasProperty(name: String): Boolean =
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
    "caseSensitive" -> true
    "valueSet" -> true
    "hierarchyMeaning" -> true
    "compositional" -> true
    "versionNeeded" -> true
    "content" -> true
    "supplements" -> true
    "count" -> true
    "filter" -> true
    "property" -> true
    "concept" -> true
    else -> false
  }

internal fun CodeSystem.getAllChildren(): List<Any> = buildList {
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
  this@getAllChildren.caseSensitive?.let { add(it) }
  this@getAllChildren.valueSet?.let { add(it) }
  this@getAllChildren.hierarchyMeaning?.let { add(it) }
  this@getAllChildren.compositional?.let { add(it) }
  this@getAllChildren.versionNeeded?.let { add(it) }
  add(this@getAllChildren.content)
  this@getAllChildren.supplements?.let { add(it) }
  this@getAllChildren.count?.let { add(it) }
  addAll(this@getAllChildren.filter)
  addAll(this@getAllChildren.`property`)
  addAll(this@getAllChildren.concept)
}

internal fun CodeSystem.Filter.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "code" -> this.code
    "description" -> this.description
    "operator" -> this.`operator`
    "value" -> this.`value`
    else -> error("$name is not a valid property name")
  }

internal fun CodeSystem.Filter.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "code" -> true
    "description" -> true
    "operator" -> true
    "value" -> true
    else -> false
  }

internal fun CodeSystem.Filter.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.code)
  this@getAllChildren.description?.let { add(it) }
  addAll(this@getAllChildren.`operator`)
  add(this@getAllChildren.`value`)
}

internal fun CodeSystem.Property.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "code" -> this.code
    "uri" -> this.uri
    "description" -> this.description
    "type" -> this.type
    else -> error("$name is not a valid property name")
  }

internal fun CodeSystem.Property.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "code" -> true
    "uri" -> true
    "description" -> true
    "type" -> true
    else -> false
  }

internal fun CodeSystem.Property.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.code)
  this@getAllChildren.uri?.let { add(it) }
  this@getAllChildren.description?.let { add(it) }
  add(this@getAllChildren.type)
}

internal fun CodeSystem.Concept.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "code" -> this.code
    "display" -> this.display
    "definition" -> this.definition
    "designation" -> this.designation
    "property" -> this.`property`
    "concept" -> this.concept
    else -> error("$name is not a valid property name")
  }

internal fun CodeSystem.Concept.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "code" -> true
    "display" -> true
    "definition" -> true
    "designation" -> true
    "property" -> true
    "concept" -> true
    else -> false
  }

internal fun CodeSystem.Concept.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.code)
  this@getAllChildren.display?.let { add(it) }
  this@getAllChildren.definition?.let { add(it) }
  addAll(this@getAllChildren.designation)
  addAll(this@getAllChildren.`property`)
  addAll(this@getAllChildren.concept)
}

internal fun CodeSystem.Concept.Designation.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "language" -> this.language
    "use" -> this.use
    "value" -> this.`value`
    else -> error("$name is not a valid property name")
  }

internal fun CodeSystem.Concept.Designation.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "language" -> true
    "use" -> true
    "value" -> true
    else -> false
  }

internal fun CodeSystem.Concept.Designation.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.use?.let { add(it) }
  add(this@getAllChildren.`value`)
}

internal fun CodeSystem.Concept.Property.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "code" -> this.code
    "value" -> this.`value`
    else -> error("$name is not a valid property name")
  }

internal fun CodeSystem.Concept.Property.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "code" -> true
    "value" -> true
    else -> false
  }

internal fun CodeSystem.Concept.Property.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.code)
  add(this@getAllChildren.`value`)
}
