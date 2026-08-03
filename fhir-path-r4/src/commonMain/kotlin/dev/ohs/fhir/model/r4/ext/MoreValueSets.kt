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

import dev.ohs.fhir.model.r4.ValueSet
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun ValueSet.getProperty(name: String): Any? =
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
    "immutable" -> this.immutable
    "purpose" -> this.purpose
    "copyright" -> this.copyright
    "compose" -> this.compose
    "expansion" -> this.expansion
    else -> error("$name is not a valid property name")
  }

internal fun ValueSet.hasProperty(name: String): Boolean =
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
    "immutable" -> true
    "purpose" -> true
    "copyright" -> true
    "compose" -> true
    "expansion" -> true
    else -> false
  }

internal fun ValueSet.getAllChildren(): List<Any> = buildList {
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
  this@getAllChildren.immutable?.let { add(it) }
  this@getAllChildren.purpose?.let { add(it) }
  this@getAllChildren.copyright?.let { add(it) }
  this@getAllChildren.compose?.let { add(it) }
  this@getAllChildren.expansion?.let { add(it) }
}

internal fun ValueSet.Compose.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "lockedDate" -> this.lockedDate
    "inactive" -> this.inactive
    "include" -> this.include
    "exclude" -> this.exclude
    else -> error("$name is not a valid property name")
  }

internal fun ValueSet.Compose.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "lockedDate" -> true
    "inactive" -> true
    "include" -> true
    "exclude" -> true
    else -> false
  }

internal fun ValueSet.Compose.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.lockedDate?.let { add(it) }
  this@getAllChildren.inactive?.let { add(it) }
  addAll(this@getAllChildren.include)
  addAll(this@getAllChildren.exclude)
}

internal fun ValueSet.Compose.Include.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "system" -> this.system
    "version" -> this.version
    "concept" -> this.concept
    "filter" -> this.filter
    "valueSet" -> this.valueSet
    else -> error("$name is not a valid property name")
  }

internal fun ValueSet.Compose.Include.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "system" -> true
    "version" -> true
    "concept" -> true
    "filter" -> true
    "valueSet" -> true
    else -> false
  }

internal fun ValueSet.Compose.Include.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.system?.let { add(it) }
  this@getAllChildren.version?.let { add(it) }
  addAll(this@getAllChildren.concept)
  addAll(this@getAllChildren.filter)
  addAll(this@getAllChildren.valueSet)
}

internal fun ValueSet.Compose.Include.Concept.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "code" -> this.code
    "display" -> this.display
    "designation" -> this.designation
    else -> error("$name is not a valid property name")
  }

internal fun ValueSet.Compose.Include.Concept.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "code" -> true
    "display" -> true
    "designation" -> true
    else -> false
  }

internal fun ValueSet.Compose.Include.Concept.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.code)
  this@getAllChildren.display?.let { add(it) }
  addAll(this@getAllChildren.designation)
}

internal fun ValueSet.Compose.Include.Concept.Designation.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "language" -> this.language
    "use" -> this.use
    "value" -> this.`value`
    else -> error("$name is not a valid property name")
  }

internal fun ValueSet.Compose.Include.Concept.Designation.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "language" -> true
    "use" -> true
    "value" -> true
    else -> false
  }

internal fun ValueSet.Compose.Include.Concept.Designation.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.use?.let { add(it) }
  add(this@getAllChildren.`value`)
}

internal fun ValueSet.Compose.Include.Filter.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "property" -> this.`property`
    "op" -> this.op
    "value" -> this.`value`
    else -> error("$name is not a valid property name")
  }

internal fun ValueSet.Compose.Include.Filter.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "property" -> true
    "op" -> true
    "value" -> true
    else -> false
  }

internal fun ValueSet.Compose.Include.Filter.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.`property`)
  add(this@getAllChildren.op)
  add(this@getAllChildren.`value`)
}

internal fun ValueSet.Expansion.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "identifier" -> this.identifier
    "timestamp" -> this.timestamp
    "total" -> this.total
    "offset" -> this.offset
    "parameter" -> this.parameter
    "contains" -> this.contains
    else -> error("$name is not a valid property name")
  }

internal fun ValueSet.Expansion.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "identifier" -> true
    "timestamp" -> true
    "total" -> true
    "offset" -> true
    "parameter" -> true
    "contains" -> true
    else -> false
  }

internal fun ValueSet.Expansion.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.identifier?.let { add(it) }
  add(this@getAllChildren.timestamp)
  this@getAllChildren.total?.let { add(it) }
  this@getAllChildren.offset?.let { add(it) }
  addAll(this@getAllChildren.parameter)
  addAll(this@getAllChildren.contains)
}

internal fun ValueSet.Expansion.Parameter.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "name" -> this.name
    "value" -> this.`value`
    else -> error("$name is not a valid property name")
  }

internal fun ValueSet.Expansion.Parameter.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "name" -> true
    "value" -> true
    else -> false
  }

internal fun ValueSet.Expansion.Parameter.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.name)
  this@getAllChildren.`value`?.let { add(it) }
}

internal fun ValueSet.Expansion.Contains.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "system" -> this.system
    "abstract" -> this.`abstract`
    "inactive" -> this.inactive
    "version" -> this.version
    "code" -> this.code
    "display" -> this.display
    "designation" -> this.designation
    "contains" -> this.contains
    else -> error("$name is not a valid property name")
  }

internal fun ValueSet.Expansion.Contains.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "system" -> true
    "abstract" -> true
    "inactive" -> true
    "version" -> true
    "code" -> true
    "display" -> true
    "designation" -> true
    "contains" -> true
    else -> false
  }

internal fun ValueSet.Expansion.Contains.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.system?.let { add(it) }
  this@getAllChildren.`abstract`?.let { add(it) }
  this@getAllChildren.inactive?.let { add(it) }
  this@getAllChildren.version?.let { add(it) }
  this@getAllChildren.code?.let { add(it) }
  this@getAllChildren.display?.let { add(it) }
  addAll(this@getAllChildren.designation)
  addAll(this@getAllChildren.contains)
}
