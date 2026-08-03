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

import dev.ohs.fhir.model.r4.OperationDefinition
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun OperationDefinition.getProperty(name: String): Any? =
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
    "kind" -> this.kind
    "experimental" -> this.experimental
    "date" -> this.date
    "publisher" -> this.publisher
    "contact" -> this.contact
    "description" -> this.description
    "useContext" -> this.useContext
    "jurisdiction" -> this.jurisdiction
    "purpose" -> this.purpose
    "affectsState" -> this.affectsState
    "code" -> this.code
    "comment" -> this.comment
    "base" -> this.base
    "resource" -> this.resource
    "system" -> this.system
    "type" -> this.type
    "instance" -> this.instance
    "inputProfile" -> this.inputProfile
    "outputProfile" -> this.outputProfile
    "parameter" -> this.parameter
    "overload" -> this.overload
    else -> error("$name is not a valid property name")
  }

internal fun OperationDefinition.hasProperty(name: String): Boolean =
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
    "kind" -> true
    "experimental" -> true
    "date" -> true
    "publisher" -> true
    "contact" -> true
    "description" -> true
    "useContext" -> true
    "jurisdiction" -> true
    "purpose" -> true
    "affectsState" -> true
    "code" -> true
    "comment" -> true
    "base" -> true
    "resource" -> true
    "system" -> true
    "type" -> true
    "instance" -> true
    "inputProfile" -> true
    "outputProfile" -> true
    "parameter" -> true
    "overload" -> true
    else -> false
  }

internal fun OperationDefinition.getAllChildren(): List<Any> = buildList {
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
  this@getAllChildren.title?.let { add(it) }
  add(this@getAllChildren.status)
  add(this@getAllChildren.kind)
  this@getAllChildren.experimental?.let { add(it) }
  this@getAllChildren.date?.let { add(it) }
  this@getAllChildren.publisher?.let { add(it) }
  addAll(this@getAllChildren.contact)
  this@getAllChildren.description?.let { add(it) }
  addAll(this@getAllChildren.useContext)
  addAll(this@getAllChildren.jurisdiction)
  this@getAllChildren.purpose?.let { add(it) }
  this@getAllChildren.affectsState?.let { add(it) }
  add(this@getAllChildren.code)
  this@getAllChildren.comment?.let { add(it) }
  this@getAllChildren.base?.let { add(it) }
  addAll(this@getAllChildren.resource)
  add(this@getAllChildren.system)
  add(this@getAllChildren.type)
  add(this@getAllChildren.instance)
  this@getAllChildren.inputProfile?.let { add(it) }
  this@getAllChildren.outputProfile?.let { add(it) }
  addAll(this@getAllChildren.parameter)
  addAll(this@getAllChildren.overload)
}

internal fun OperationDefinition.Parameter.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "name" -> this.name
    "use" -> this.use
    "min" -> this.min
    "max" -> this.max
    "documentation" -> this.documentation
    "type" -> this.type
    "targetProfile" -> this.targetProfile
    "searchType" -> this.searchType
    "binding" -> this.binding
    "referencedFrom" -> this.referencedFrom
    "part" -> this.part
    else -> error("$name is not a valid property name")
  }

internal fun OperationDefinition.Parameter.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "name" -> true
    "use" -> true
    "min" -> true
    "max" -> true
    "documentation" -> true
    "type" -> true
    "targetProfile" -> true
    "searchType" -> true
    "binding" -> true
    "referencedFrom" -> true
    "part" -> true
    else -> false
  }

internal fun OperationDefinition.Parameter.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.name)
  add(this@getAllChildren.use)
  add(this@getAllChildren.min)
  add(this@getAllChildren.max)
  this@getAllChildren.documentation?.let { add(it) }
  this@getAllChildren.type?.let { add(it) }
  addAll(this@getAllChildren.targetProfile)
  this@getAllChildren.searchType?.let { add(it) }
  this@getAllChildren.binding?.let { add(it) }
  addAll(this@getAllChildren.referencedFrom)
  addAll(this@getAllChildren.part)
}

internal fun OperationDefinition.Parameter.Binding.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "strength" -> this.strength
    "valueSet" -> this.valueSet
    else -> error("$name is not a valid property name")
  }

internal fun OperationDefinition.Parameter.Binding.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "strength" -> true
    "valueSet" -> true
    else -> false
  }

internal fun OperationDefinition.Parameter.Binding.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.strength)
  add(this@getAllChildren.valueSet)
}

internal fun OperationDefinition.Parameter.ReferencedFrom.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "source" -> this.source
    "sourceId" -> this.sourceId
    else -> error("$name is not a valid property name")
  }

internal fun OperationDefinition.Parameter.ReferencedFrom.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "source" -> true
    "sourceId" -> true
    else -> false
  }

internal fun OperationDefinition.Parameter.ReferencedFrom.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.source)
  this@getAllChildren.sourceId?.let { add(it) }
}

internal fun OperationDefinition.Overload.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "parameterName" -> this.parameterName
    "comment" -> this.comment
    else -> error("$name is not a valid property name")
  }

internal fun OperationDefinition.Overload.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "parameterName" -> true
    "comment" -> true
    else -> false
  }

internal fun OperationDefinition.Overload.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.parameterName)
  this@getAllChildren.comment?.let { add(it) }
}
