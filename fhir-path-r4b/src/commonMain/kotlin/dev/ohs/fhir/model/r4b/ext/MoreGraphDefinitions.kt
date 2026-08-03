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

import dev.ohs.fhir.model.r4b.GraphDefinition
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun GraphDefinition.getProperty(name: String): Any? =
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
    "status" -> this.status
    "experimental" -> this.experimental
    "date" -> this.date
    "publisher" -> this.publisher
    "contact" -> this.contact
    "description" -> this.description
    "useContext" -> this.useContext
    "jurisdiction" -> this.jurisdiction
    "purpose" -> this.purpose
    "start" -> this.start
    "profile" -> this.profile
    "link" -> this.link
    else -> error("$name is not a valid property name")
  }

internal fun GraphDefinition.hasProperty(name: String): Boolean =
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
    "status" -> true
    "experimental" -> true
    "date" -> true
    "publisher" -> true
    "contact" -> true
    "description" -> true
    "useContext" -> true
    "jurisdiction" -> true
    "purpose" -> true
    "start" -> true
    "profile" -> true
    "link" -> true
    else -> false
  }

internal fun GraphDefinition.getAllChildren(): List<Any> = buildList {
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
  add(this@getAllChildren.name)
  add(this@getAllChildren.status)
  this@getAllChildren.experimental?.let { add(it) }
  this@getAllChildren.date?.let { add(it) }
  this@getAllChildren.publisher?.let { add(it) }
  addAll(this@getAllChildren.contact)
  this@getAllChildren.description?.let { add(it) }
  addAll(this@getAllChildren.useContext)
  addAll(this@getAllChildren.jurisdiction)
  this@getAllChildren.purpose?.let { add(it) }
  add(this@getAllChildren.start)
  this@getAllChildren.profile?.let { add(it) }
  addAll(this@getAllChildren.link)
}

internal fun GraphDefinition.Link.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "path" -> this.path
    "sliceName" -> this.sliceName
    "min" -> this.min
    "max" -> this.max
    "description" -> this.description
    "target" -> this.target
    else -> error("$name is not a valid property name")
  }

internal fun GraphDefinition.Link.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "path" -> true
    "sliceName" -> true
    "min" -> true
    "max" -> true
    "description" -> true
    "target" -> true
    else -> false
  }

internal fun GraphDefinition.Link.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.path?.let { add(it) }
  this@getAllChildren.sliceName?.let { add(it) }
  this@getAllChildren.min?.let { add(it) }
  this@getAllChildren.max?.let { add(it) }
  this@getAllChildren.description?.let { add(it) }
  addAll(this@getAllChildren.target)
}

internal fun GraphDefinition.Link.Target.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "params" -> this.params
    "profile" -> this.profile
    "compartment" -> this.compartment
    "link" -> this.link
    else -> error("$name is not a valid property name")
  }

internal fun GraphDefinition.Link.Target.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "params" -> true
    "profile" -> true
    "compartment" -> true
    "link" -> true
    else -> false
  }

internal fun GraphDefinition.Link.Target.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.type)
  this@getAllChildren.params?.let { add(it) }
  this@getAllChildren.profile?.let { add(it) }
  addAll(this@getAllChildren.compartment)
  addAll(this@getAllChildren.link)
}

internal fun GraphDefinition.Link.Target.Compartment.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "use" -> this.use
    "code" -> this.code
    "rule" -> this.rule
    "expression" -> this.expression
    "description" -> this.description
    else -> error("$name is not a valid property name")
  }

internal fun GraphDefinition.Link.Target.Compartment.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "use" -> true
    "code" -> true
    "rule" -> true
    "expression" -> true
    "description" -> true
    else -> false
  }

internal fun GraphDefinition.Link.Target.Compartment.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.use)
  add(this@getAllChildren.code)
  add(this@getAllChildren.rule)
  this@getAllChildren.expression?.let { add(it) }
  this@getAllChildren.description?.let { add(it) }
}
