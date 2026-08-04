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

import dev.ohs.fhir.model.r5.GraphDefinition
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
    "identifier" -> this.identifier
    "version" -> this.version
    "versionAlgorithm" -> this.versionAlgorithm
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
    "copyrightLabel" -> this.copyrightLabel
    "start" -> this.start
    "node" -> this.node
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
    "identifier" -> true
    "version" -> true
    "versionAlgorithm" -> true
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
    "copyrightLabel" -> true
    "start" -> true
    "node" -> true
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
  addAll(this@getAllChildren.identifier)
  this@getAllChildren.version?.let { add(it) }
  this@getAllChildren.versionAlgorithm?.let { add(it) }
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
  this@getAllChildren.copyrightLabel?.let { add(it) }
  this@getAllChildren.start?.let { add(it) }
  addAll(this@getAllChildren.node)
  addAll(this@getAllChildren.link)
}

internal fun GraphDefinition.Node.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "nodeId" -> this.nodeId
    "description" -> this.description
    "type" -> this.type
    "profile" -> this.profile
    else -> error("$name is not a valid property name")
  }

internal fun GraphDefinition.Node.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "nodeId" -> true
    "description" -> true
    "type" -> true
    "profile" -> true
    else -> false
  }

internal fun GraphDefinition.Node.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.nodeId)
  this@getAllChildren.description?.let { add(it) }
  add(this@getAllChildren.type)
  this@getAllChildren.profile?.let { add(it) }
}

internal fun GraphDefinition.Link.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "description" -> this.description
    "min" -> this.min
    "max" -> this.max
    "sourceId" -> this.sourceId
    "path" -> this.path
    "sliceName" -> this.sliceName
    "targetId" -> this.targetId
    "params" -> this.params
    "compartment" -> this.compartment
    else -> error("$name is not a valid property name")
  }

internal fun GraphDefinition.Link.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "description" -> true
    "min" -> true
    "max" -> true
    "sourceId" -> true
    "path" -> true
    "sliceName" -> true
    "targetId" -> true
    "params" -> true
    "compartment" -> true
    else -> false
  }

internal fun GraphDefinition.Link.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.description?.let { add(it) }
  this@getAllChildren.min?.let { add(it) }
  this@getAllChildren.max?.let { add(it) }
  add(this@getAllChildren.sourceId)
  this@getAllChildren.path?.let { add(it) }
  this@getAllChildren.sliceName?.let { add(it) }
  add(this@getAllChildren.targetId)
  this@getAllChildren.params?.let { add(it) }
  addAll(this@getAllChildren.compartment)
}

internal fun GraphDefinition.Link.Compartment.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "use" -> this.use
    "rule" -> this.rule
    "code" -> this.code
    "expression" -> this.expression
    "description" -> this.description
    else -> error("$name is not a valid property name")
  }

internal fun GraphDefinition.Link.Compartment.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "use" -> true
    "rule" -> true
    "code" -> true
    "expression" -> true
    "description" -> true
    else -> false
  }

internal fun GraphDefinition.Link.Compartment.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.use)
  add(this@getAllChildren.rule)
  add(this@getAllChildren.code)
  this@getAllChildren.expression?.let { add(it) }
  this@getAllChildren.description?.let { add(it) }
}
