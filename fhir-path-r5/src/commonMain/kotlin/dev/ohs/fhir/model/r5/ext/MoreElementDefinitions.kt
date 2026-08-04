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

import dev.ohs.fhir.model.r5.ElementDefinition
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun ElementDefinition.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "path" -> this.path
    "representation" -> this.representation
    "sliceName" -> this.sliceName
    "sliceIsConstraining" -> this.sliceIsConstraining
    "label" -> this.label
    "code" -> this.code
    "slicing" -> this.slicing
    "short" -> this.short
    "definition" -> this.definition
    "comment" -> this.comment
    "requirements" -> this.requirements
    "alias" -> this.alias
    "min" -> this.min
    "max" -> this.max
    "base" -> this.base
    "contentReference" -> this.contentReference
    "type" -> this.type
    "defaultValue" -> this.defaultValue
    "meaningWhenMissing" -> this.meaningWhenMissing
    "orderMeaning" -> this.orderMeaning
    "fixed" -> this.fixed
    "pattern" -> this.pattern
    "example" -> this.example
    "minValue" -> this.minValue
    "maxValue" -> this.maxValue
    "maxLength" -> this.maxLength
    "condition" -> this.condition
    "constraint" -> this.constraint
    "mustHaveValue" -> this.mustHaveValue
    "valueAlternatives" -> this.valueAlternatives
    "mustSupport" -> this.mustSupport
    "isModifier" -> this.isModifier
    "isModifierReason" -> this.isModifierReason
    "isSummary" -> this.isSummary
    "binding" -> this.binding
    "mapping" -> this.mapping
    else -> error("$name is not a valid property name")
  }

internal fun ElementDefinition.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "path" -> true
    "representation" -> true
    "sliceName" -> true
    "sliceIsConstraining" -> true
    "label" -> true
    "code" -> true
    "slicing" -> true
    "short" -> true
    "definition" -> true
    "comment" -> true
    "requirements" -> true
    "alias" -> true
    "min" -> true
    "max" -> true
    "base" -> true
    "contentReference" -> true
    "type" -> true
    "defaultValue" -> true
    "meaningWhenMissing" -> true
    "orderMeaning" -> true
    "fixed" -> true
    "pattern" -> true
    "example" -> true
    "minValue" -> true
    "maxValue" -> true
    "maxLength" -> true
    "condition" -> true
    "constraint" -> true
    "mustHaveValue" -> true
    "valueAlternatives" -> true
    "mustSupport" -> true
    "isModifier" -> true
    "isModifierReason" -> true
    "isSummary" -> true
    "binding" -> true
    "mapping" -> true
    else -> false
  }

internal fun ElementDefinition.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.path)
  addAll(this@getAllChildren.representation)
  this@getAllChildren.sliceName?.let { add(it) }
  this@getAllChildren.sliceIsConstraining?.let { add(it) }
  this@getAllChildren.label?.let { add(it) }
  addAll(this@getAllChildren.code)
  this@getAllChildren.slicing?.let { add(it) }
  this@getAllChildren.short?.let { add(it) }
  this@getAllChildren.definition?.let { add(it) }
  this@getAllChildren.comment?.let { add(it) }
  this@getAllChildren.requirements?.let { add(it) }
  addAll(this@getAllChildren.alias)
  this@getAllChildren.min?.let { add(it) }
  this@getAllChildren.max?.let { add(it) }
  this@getAllChildren.base?.let { add(it) }
  this@getAllChildren.contentReference?.let { add(it) }
  addAll(this@getAllChildren.type)
  this@getAllChildren.defaultValue?.let { add(it) }
  this@getAllChildren.meaningWhenMissing?.let { add(it) }
  this@getAllChildren.orderMeaning?.let { add(it) }
  this@getAllChildren.fixed?.let { add(it) }
  this@getAllChildren.pattern?.let { add(it) }
  addAll(this@getAllChildren.example)
  this@getAllChildren.minValue?.let { add(it) }
  this@getAllChildren.maxValue?.let { add(it) }
  this@getAllChildren.maxLength?.let { add(it) }
  addAll(this@getAllChildren.condition)
  addAll(this@getAllChildren.constraint)
  this@getAllChildren.mustHaveValue?.let { add(it) }
  addAll(this@getAllChildren.valueAlternatives)
  this@getAllChildren.mustSupport?.let { add(it) }
  this@getAllChildren.isModifier?.let { add(it) }
  this@getAllChildren.isModifierReason?.let { add(it) }
  this@getAllChildren.isSummary?.let { add(it) }
  this@getAllChildren.binding?.let { add(it) }
  addAll(this@getAllChildren.mapping)
}

internal fun ElementDefinition.Slicing.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "discriminator" -> this.discriminator
    "description" -> this.description
    "ordered" -> this.ordered
    "rules" -> this.rules
    else -> error("$name is not a valid property name")
  }

internal fun ElementDefinition.Slicing.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "discriminator" -> true
    "description" -> true
    "ordered" -> true
    "rules" -> true
    else -> false
  }

internal fun ElementDefinition.Slicing.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.discriminator)
  this@getAllChildren.description?.let { add(it) }
  this@getAllChildren.ordered?.let { add(it) }
  add(this@getAllChildren.rules)
}

internal fun ElementDefinition.Slicing.Discriminator.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "type" -> this.type
    "path" -> this.path
    else -> error("$name is not a valid property name")
  }

internal fun ElementDefinition.Slicing.Discriminator.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "type" -> true
    "path" -> true
    else -> false
  }

internal fun ElementDefinition.Slicing.Discriminator.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  add(this@getAllChildren.type)
  add(this@getAllChildren.path)
}

internal fun ElementDefinition.Base.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "path" -> this.path
    "min" -> this.min
    "max" -> this.max
    else -> error("$name is not a valid property name")
  }

internal fun ElementDefinition.Base.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "path" -> true
    "min" -> true
    "max" -> true
    else -> false
  }

internal fun ElementDefinition.Base.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  add(this@getAllChildren.path)
  add(this@getAllChildren.min)
  add(this@getAllChildren.max)
}

internal fun ElementDefinition.Type.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "code" -> this.code
    "profile" -> this.profile
    "targetProfile" -> this.targetProfile
    "aggregation" -> this.aggregation
    "versioning" -> this.versioning
    else -> error("$name is not a valid property name")
  }

internal fun ElementDefinition.Type.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "code" -> true
    "profile" -> true
    "targetProfile" -> true
    "aggregation" -> true
    "versioning" -> true
    else -> false
  }

internal fun ElementDefinition.Type.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  add(this@getAllChildren.code)
  addAll(this@getAllChildren.profile)
  addAll(this@getAllChildren.targetProfile)
  addAll(this@getAllChildren.aggregation)
  this@getAllChildren.versioning?.let { add(it) }
}

internal fun ElementDefinition.Example.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "label" -> this.label
    "value" -> this.`value`
    else -> error("$name is not a valid property name")
  }

internal fun ElementDefinition.Example.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "label" -> true
    "value" -> true
    else -> false
  }

internal fun ElementDefinition.Example.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  add(this@getAllChildren.label)
  add(this@getAllChildren.`value`)
}

internal fun ElementDefinition.Constraint.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "key" -> this.key
    "requirements" -> this.requirements
    "severity" -> this.severity
    "suppress" -> this.suppress
    "human" -> this.human
    "expression" -> this.expression
    "source" -> this.source
    else -> error("$name is not a valid property name")
  }

internal fun ElementDefinition.Constraint.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "key" -> true
    "requirements" -> true
    "severity" -> true
    "suppress" -> true
    "human" -> true
    "expression" -> true
    "source" -> true
    else -> false
  }

internal fun ElementDefinition.Constraint.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  add(this@getAllChildren.key)
  this@getAllChildren.requirements?.let { add(it) }
  add(this@getAllChildren.severity)
  this@getAllChildren.suppress?.let { add(it) }
  add(this@getAllChildren.human)
  this@getAllChildren.expression?.let { add(it) }
  this@getAllChildren.source?.let { add(it) }
}

internal fun ElementDefinition.Binding.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "strength" -> this.strength
    "description" -> this.description
    "valueSet" -> this.valueSet
    "additional" -> this.additional
    else -> error("$name is not a valid property name")
  }

internal fun ElementDefinition.Binding.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "strength" -> true
    "description" -> true
    "valueSet" -> true
    "additional" -> true
    else -> false
  }

internal fun ElementDefinition.Binding.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  add(this@getAllChildren.strength)
  this@getAllChildren.description?.let { add(it) }
  this@getAllChildren.valueSet?.let { add(it) }
  addAll(this@getAllChildren.additional)
}

internal fun ElementDefinition.Binding.Additional.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "purpose" -> this.purpose
    "valueSet" -> this.valueSet
    "documentation" -> this.documentation
    "shortDoco" -> this.shortDoco
    "usage" -> this.usage
    "any" -> this.any
    else -> error("$name is not a valid property name")
  }

internal fun ElementDefinition.Binding.Additional.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "purpose" -> true
    "valueSet" -> true
    "documentation" -> true
    "shortDoco" -> true
    "usage" -> true
    "any" -> true
    else -> false
  }

internal fun ElementDefinition.Binding.Additional.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  add(this@getAllChildren.purpose)
  add(this@getAllChildren.valueSet)
  this@getAllChildren.documentation?.let { add(it) }
  this@getAllChildren.shortDoco?.let { add(it) }
  addAll(this@getAllChildren.usage)
  this@getAllChildren.any?.let { add(it) }
}

internal fun ElementDefinition.Mapping.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "identity" -> this.identity
    "language" -> this.language
    "map" -> this.map
    "comment" -> this.comment
    else -> error("$name is not a valid property name")
  }

internal fun ElementDefinition.Mapping.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "identity" -> true
    "language" -> true
    "map" -> true
    "comment" -> true
    else -> false
  }

internal fun ElementDefinition.Mapping.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  add(this@getAllChildren.identity)
  this@getAllChildren.language?.let { add(it) }
  add(this@getAllChildren.map)
  this@getAllChildren.comment?.let { add(it) }
}
