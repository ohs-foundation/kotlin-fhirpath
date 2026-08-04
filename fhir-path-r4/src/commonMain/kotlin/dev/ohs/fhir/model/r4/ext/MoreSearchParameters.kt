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

import dev.ohs.fhir.model.r4.SearchParameter
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun SearchParameter.getProperty(name: String): Any? =
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
    "derivedFrom" -> this.derivedFrom
    "status" -> this.status
    "experimental" -> this.experimental
    "date" -> this.date
    "publisher" -> this.publisher
    "contact" -> this.contact
    "description" -> this.description
    "useContext" -> this.useContext
    "jurisdiction" -> this.jurisdiction
    "purpose" -> this.purpose
    "code" -> this.code
    "base" -> this.base
    "type" -> this.type
    "expression" -> this.expression
    "xpath" -> this.xpath
    "xpathUsage" -> this.xpathUsage
    "target" -> this.target
    "multipleOr" -> this.multipleOr
    "multipleAnd" -> this.multipleAnd
    "comparator" -> this.comparator
    "modifier" -> this.modifier
    "chain" -> this.chain
    "component" -> this.component
    else -> error("$name is not a valid property name")
  }

internal fun SearchParameter.hasProperty(name: String): Boolean =
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
    "derivedFrom" -> true
    "status" -> true
    "experimental" -> true
    "date" -> true
    "publisher" -> true
    "contact" -> true
    "description" -> true
    "useContext" -> true
    "jurisdiction" -> true
    "purpose" -> true
    "code" -> true
    "base" -> true
    "type" -> true
    "expression" -> true
    "xpath" -> true
    "xpathUsage" -> true
    "target" -> true
    "multipleOr" -> true
    "multipleAnd" -> true
    "comparator" -> true
    "modifier" -> true
    "chain" -> true
    "component" -> true
    else -> false
  }

internal fun SearchParameter.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.meta?.let { add(it) }
  this@getAllChildren.implicitRules?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.contained)
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.url)
  this@getAllChildren.version?.let { add(it) }
  add(this@getAllChildren.name)
  this@getAllChildren.derivedFrom?.let { add(it) }
  add(this@getAllChildren.status)
  this@getAllChildren.experimental?.let { add(it) }
  this@getAllChildren.date?.let { add(it) }
  this@getAllChildren.publisher?.let { add(it) }
  addAll(this@getAllChildren.contact)
  add(this@getAllChildren.description)
  addAll(this@getAllChildren.useContext)
  addAll(this@getAllChildren.jurisdiction)
  this@getAllChildren.purpose?.let { add(it) }
  add(this@getAllChildren.code)
  addAll(this@getAllChildren.base)
  add(this@getAllChildren.type)
  this@getAllChildren.expression?.let { add(it) }
  this@getAllChildren.xpath?.let { add(it) }
  this@getAllChildren.xpathUsage?.let { add(it) }
  addAll(this@getAllChildren.target)
  this@getAllChildren.multipleOr?.let { add(it) }
  this@getAllChildren.multipleAnd?.let { add(it) }
  addAll(this@getAllChildren.comparator)
  addAll(this@getAllChildren.modifier)
  addAll(this@getAllChildren.chain)
  addAll(this@getAllChildren.component)
}

internal fun SearchParameter.Component.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "definition" -> this.definition
    "expression" -> this.expression
    else -> error("$name is not a valid property name")
  }

internal fun SearchParameter.Component.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "definition" -> true
    "expression" -> true
    else -> false
  }

internal fun SearchParameter.Component.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.definition)
  add(this@getAllChildren.expression)
}
