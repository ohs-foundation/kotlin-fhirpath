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

import dev.ohs.fhir.model.r4b.StructureMap
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun StructureMap.getProperty(name: String): Any? =
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
    "structure" -> this.structure
    "import" -> this.`import`
    "group" -> this.group
    else -> error("$name is not a valid property name")
  }

internal fun StructureMap.hasProperty(name: String): Boolean =
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
    "structure" -> true
    "import" -> true
    "group" -> true
    else -> false
  }

internal fun StructureMap.getAllChildren(): List<Any> = buildList {
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
  addAll(this@getAllChildren.structure)
  addAll(this@getAllChildren.`import`)
  addAll(this@getAllChildren.group)
}

internal fun StructureMap.Structure.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "url" -> this.url
    "mode" -> this.mode
    "alias" -> this.alias
    "documentation" -> this.documentation
    else -> error("$name is not a valid property name")
  }

internal fun StructureMap.Structure.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "url" -> true
    "mode" -> true
    "alias" -> true
    "documentation" -> true
    else -> false
  }

internal fun StructureMap.Structure.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.url)
  add(this@getAllChildren.mode)
  this@getAllChildren.alias?.let { add(it) }
  this@getAllChildren.documentation?.let { add(it) }
}

internal fun StructureMap.Group.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "name" -> this.name
    "extends" -> this.extends
    "typeMode" -> this.typeMode
    "documentation" -> this.documentation
    "input" -> this.input
    "rule" -> this.rule
    else -> error("$name is not a valid property name")
  }

internal fun StructureMap.Group.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "name" -> true
    "extends" -> true
    "typeMode" -> true
    "documentation" -> true
    "input" -> true
    "rule" -> true
    else -> false
  }

internal fun StructureMap.Group.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.name)
  this@getAllChildren.extends?.let { add(it) }
  add(this@getAllChildren.typeMode)
  this@getAllChildren.documentation?.let { add(it) }
  addAll(this@getAllChildren.input)
  addAll(this@getAllChildren.rule)
}

internal fun StructureMap.Group.Input.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "name" -> this.name
    "type" -> this.type
    "mode" -> this.mode
    "documentation" -> this.documentation
    else -> error("$name is not a valid property name")
  }

internal fun StructureMap.Group.Input.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "name" -> true
    "type" -> true
    "mode" -> true
    "documentation" -> true
    else -> false
  }

internal fun StructureMap.Group.Input.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.name)
  this@getAllChildren.type?.let { add(it) }
  add(this@getAllChildren.mode)
  this@getAllChildren.documentation?.let { add(it) }
}

internal fun StructureMap.Group.Rule.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "name" -> this.name
    "source" -> this.source
    "target" -> this.target
    "rule" -> this.rule
    "dependent" -> this.dependent
    "documentation" -> this.documentation
    else -> error("$name is not a valid property name")
  }

internal fun StructureMap.Group.Rule.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "name" -> true
    "source" -> true
    "target" -> true
    "rule" -> true
    "dependent" -> true
    "documentation" -> true
    else -> false
  }

internal fun StructureMap.Group.Rule.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.name)
  addAll(this@getAllChildren.source)
  addAll(this@getAllChildren.target)
  addAll(this@getAllChildren.rule)
  addAll(this@getAllChildren.dependent)
  this@getAllChildren.documentation?.let { add(it) }
}

internal fun StructureMap.Group.Rule.Source.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "context" -> this.context
    "min" -> this.min
    "max" -> this.max
    "type" -> this.type
    "defaultValue" -> this.defaultValue
    "element" -> this.element
    "listMode" -> this.listMode
    "variable" -> this.variable
    "condition" -> this.condition
    "check" -> this.check
    "logMessage" -> this.logMessage
    else -> error("$name is not a valid property name")
  }

internal fun StructureMap.Group.Rule.Source.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "context" -> true
    "min" -> true
    "max" -> true
    "type" -> true
    "defaultValue" -> true
    "element" -> true
    "listMode" -> true
    "variable" -> true
    "condition" -> true
    "check" -> true
    "logMessage" -> true
    else -> false
  }

internal fun StructureMap.Group.Rule.Source.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.context)
  this@getAllChildren.min?.let { add(it) }
  this@getAllChildren.max?.let { add(it) }
  this@getAllChildren.type?.let { add(it) }
  this@getAllChildren.defaultValue?.let { add(it) }
  this@getAllChildren.element?.let { add(it) }
  this@getAllChildren.listMode?.let { add(it) }
  this@getAllChildren.variable?.let { add(it) }
  this@getAllChildren.condition?.let { add(it) }
  this@getAllChildren.check?.let { add(it) }
  this@getAllChildren.logMessage?.let { add(it) }
}

internal fun StructureMap.Group.Rule.Target.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "context" -> this.context
    "contextType" -> this.contextType
    "element" -> this.element
    "variable" -> this.variable
    "listMode" -> this.listMode
    "listRuleId" -> this.listRuleId
    "transform" -> this.transform
    "parameter" -> this.parameter
    else -> error("$name is not a valid property name")
  }

internal fun StructureMap.Group.Rule.Target.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "context" -> true
    "contextType" -> true
    "element" -> true
    "variable" -> true
    "listMode" -> true
    "listRuleId" -> true
    "transform" -> true
    "parameter" -> true
    else -> false
  }

internal fun StructureMap.Group.Rule.Target.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.context?.let { add(it) }
  this@getAllChildren.contextType?.let { add(it) }
  this@getAllChildren.element?.let { add(it) }
  this@getAllChildren.variable?.let { add(it) }
  addAll(this@getAllChildren.listMode)
  this@getAllChildren.listRuleId?.let { add(it) }
  this@getAllChildren.transform?.let { add(it) }
  addAll(this@getAllChildren.parameter)
}

internal fun StructureMap.Group.Rule.Target.Parameter.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "value" -> this.`value`
    else -> error("$name is not a valid property name")
  }

internal fun StructureMap.Group.Rule.Target.Parameter.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "value" -> true
    else -> false
  }

internal fun StructureMap.Group.Rule.Target.Parameter.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.`value`)
}

internal fun StructureMap.Group.Rule.Dependent.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "name" -> this.name
    "variable" -> this.variable
    else -> error("$name is not a valid property name")
  }

internal fun StructureMap.Group.Rule.Dependent.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "name" -> true
    "variable" -> true
    else -> false
  }

internal fun StructureMap.Group.Rule.Dependent.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.name)
  addAll(this@getAllChildren.variable)
}
