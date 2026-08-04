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

import dev.ohs.fhir.model.r4.TerminologyCapabilities
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun TerminologyCapabilities.getProperty(name: String): Any? =
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
    "kind" -> this.kind
    "software" -> this.software
    "implementation" -> this.implementation
    "lockedDate" -> this.lockedDate
    "codeSystem" -> this.codeSystem
    "expansion" -> this.expansion
    "codeSearch" -> this.codeSearch
    "validateCode" -> this.validateCode
    "translation" -> this.translation
    "closure" -> this.closure
    else -> error("$name is not a valid property name")
  }

internal fun TerminologyCapabilities.hasProperty(name: String): Boolean =
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
    "kind" -> true
    "software" -> true
    "implementation" -> true
    "lockedDate" -> true
    "codeSystem" -> true
    "expansion" -> true
    "codeSearch" -> true
    "validateCode" -> true
    "translation" -> true
    "closure" -> true
    else -> false
  }

internal fun TerminologyCapabilities.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.meta?.let { add(it) }
  this@getAllChildren.implicitRules?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.contained)
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.url?.let { add(it) }
  this@getAllChildren.version?.let { add(it) }
  this@getAllChildren.name?.let { add(it) }
  this@getAllChildren.title?.let { add(it) }
  add(this@getAllChildren.status)
  this@getAllChildren.experimental?.let { add(it) }
  add(this@getAllChildren.date)
  this@getAllChildren.publisher?.let { add(it) }
  addAll(this@getAllChildren.contact)
  this@getAllChildren.description?.let { add(it) }
  addAll(this@getAllChildren.useContext)
  addAll(this@getAllChildren.jurisdiction)
  this@getAllChildren.purpose?.let { add(it) }
  this@getAllChildren.copyright?.let { add(it) }
  add(this@getAllChildren.kind)
  this@getAllChildren.software?.let { add(it) }
  this@getAllChildren.implementation?.let { add(it) }
  this@getAllChildren.lockedDate?.let { add(it) }
  addAll(this@getAllChildren.codeSystem)
  this@getAllChildren.expansion?.let { add(it) }
  this@getAllChildren.codeSearch?.let { add(it) }
  this@getAllChildren.validateCode?.let { add(it) }
  this@getAllChildren.translation?.let { add(it) }
  this@getAllChildren.closure?.let { add(it) }
}

internal fun TerminologyCapabilities.Software.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "name" -> this.name
    "version" -> this.version
    else -> error("$name is not a valid property name")
  }

internal fun TerminologyCapabilities.Software.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "name" -> true
    "version" -> true
    else -> false
  }

internal fun TerminologyCapabilities.Software.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.name)
  this@getAllChildren.version?.let { add(it) }
}

internal fun TerminologyCapabilities.Implementation.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "description" -> this.description
    "url" -> this.url
    else -> error("$name is not a valid property name")
  }

internal fun TerminologyCapabilities.Implementation.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "description" -> true
    "url" -> true
    else -> false
  }

internal fun TerminologyCapabilities.Implementation.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.description)
  this@getAllChildren.url?.let { add(it) }
}

internal fun TerminologyCapabilities.CodeSystem.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "uri" -> this.uri
    "version" -> this.version
    "subsumption" -> this.subsumption
    else -> error("$name is not a valid property name")
  }

internal fun TerminologyCapabilities.CodeSystem.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "uri" -> true
    "version" -> true
    "subsumption" -> true
    else -> false
  }

internal fun TerminologyCapabilities.CodeSystem.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.uri?.let { add(it) }
  addAll(this@getAllChildren.version)
  this@getAllChildren.subsumption?.let { add(it) }
}

internal fun TerminologyCapabilities.CodeSystem.Version.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "code" -> this.code
    "isDefault" -> this.isDefault
    "compositional" -> this.compositional
    "language" -> this.language
    "filter" -> this.filter
    "property" -> this.`property`
    else -> error("$name is not a valid property name")
  }

internal fun TerminologyCapabilities.CodeSystem.Version.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "code" -> true
    "isDefault" -> true
    "compositional" -> true
    "language" -> true
    "filter" -> true
    "property" -> true
    else -> false
  }

internal fun TerminologyCapabilities.CodeSystem.Version.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.code?.let { add(it) }
  this@getAllChildren.isDefault?.let { add(it) }
  this@getAllChildren.compositional?.let { add(it) }
  addAll(this@getAllChildren.language)
  addAll(this@getAllChildren.filter)
  addAll(this@getAllChildren.`property`)
}

internal fun TerminologyCapabilities.CodeSystem.Version.Filter.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "code" -> this.code
    "op" -> this.op
    else -> error("$name is not a valid property name")
  }

internal fun TerminologyCapabilities.CodeSystem.Version.Filter.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "code" -> true
    "op" -> true
    else -> false
  }

internal fun TerminologyCapabilities.CodeSystem.Version.Filter.getAllChildren(): List<Any> =
  buildList {
    this@getAllChildren.id?.let { add(it) }
    addAll(this@getAllChildren.extension)
    addAll(this@getAllChildren.modifierExtension)
    add(this@getAllChildren.code)
    addAll(this@getAllChildren.op)
  }

internal fun TerminologyCapabilities.Expansion.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "hierarchical" -> this.hierarchical
    "paging" -> this.paging
    "incomplete" -> this.incomplete
    "parameter" -> this.parameter
    "textFilter" -> this.textFilter
    else -> error("$name is not a valid property name")
  }

internal fun TerminologyCapabilities.Expansion.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "hierarchical" -> true
    "paging" -> true
    "incomplete" -> true
    "parameter" -> true
    "textFilter" -> true
    else -> false
  }

internal fun TerminologyCapabilities.Expansion.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.hierarchical?.let { add(it) }
  this@getAllChildren.paging?.let { add(it) }
  this@getAllChildren.incomplete?.let { add(it) }
  addAll(this@getAllChildren.parameter)
  this@getAllChildren.textFilter?.let { add(it) }
}

internal fun TerminologyCapabilities.Expansion.Parameter.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "name" -> this.name
    "documentation" -> this.documentation
    else -> error("$name is not a valid property name")
  }

internal fun TerminologyCapabilities.Expansion.Parameter.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "name" -> true
    "documentation" -> true
    else -> false
  }

internal fun TerminologyCapabilities.Expansion.Parameter.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.name)
  this@getAllChildren.documentation?.let { add(it) }
}

internal fun TerminologyCapabilities.ValidateCode.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "translations" -> this.translations
    else -> error("$name is not a valid property name")
  }

internal fun TerminologyCapabilities.ValidateCode.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "translations" -> true
    else -> false
  }

internal fun TerminologyCapabilities.ValidateCode.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.translations)
}

internal fun TerminologyCapabilities.Translation.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "needsMap" -> this.needsMap
    else -> error("$name is not a valid property name")
  }

internal fun TerminologyCapabilities.Translation.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "needsMap" -> true
    else -> false
  }

internal fun TerminologyCapabilities.Translation.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.needsMap)
}

internal fun TerminologyCapabilities.Closure.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "translation" -> this.translation
    else -> error("$name is not a valid property name")
  }

internal fun TerminologyCapabilities.Closure.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "translation" -> true
    else -> false
  }

internal fun TerminologyCapabilities.Closure.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.translation?.let { add(it) }
}
