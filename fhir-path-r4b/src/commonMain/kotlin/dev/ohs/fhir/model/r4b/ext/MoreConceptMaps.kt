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

import dev.ohs.fhir.model.r4b.ConceptMap
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun ConceptMap.getProperty(name: String): Any? =
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
    "source" -> this.source
    "target" -> this.target
    "group" -> this.group
    else -> error("$name is not a valid property name")
  }

internal fun ConceptMap.hasProperty(name: String): Boolean =
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
    "source" -> true
    "target" -> true
    "group" -> true
    else -> false
  }

internal fun ConceptMap.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.meta?.let { add(it) }
  this@getAllChildren.implicitRules?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.contained)
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.url?.let { add(it) }
  this@getAllChildren.identifier?.let { add(it) }
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
  this@getAllChildren.source?.let { add(it) }
  this@getAllChildren.target?.let { add(it) }
  addAll(this@getAllChildren.group)
}

internal fun ConceptMap.Group.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "source" -> this.source
    "sourceVersion" -> this.sourceVersion
    "target" -> this.target
    "targetVersion" -> this.targetVersion
    "element" -> this.element
    "unmapped" -> this.unmapped
    else -> error("$name is not a valid property name")
  }

internal fun ConceptMap.Group.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "source" -> true
    "sourceVersion" -> true
    "target" -> true
    "targetVersion" -> true
    "element" -> true
    "unmapped" -> true
    else -> false
  }

internal fun ConceptMap.Group.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.source?.let { add(it) }
  this@getAllChildren.sourceVersion?.let { add(it) }
  this@getAllChildren.target?.let { add(it) }
  this@getAllChildren.targetVersion?.let { add(it) }
  addAll(this@getAllChildren.element)
  this@getAllChildren.unmapped?.let { add(it) }
}

internal fun ConceptMap.Group.Element.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "code" -> this.code
    "display" -> this.display
    "target" -> this.target
    else -> error("$name is not a valid property name")
  }

internal fun ConceptMap.Group.Element.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "code" -> true
    "display" -> true
    "target" -> true
    else -> false
  }

internal fun ConceptMap.Group.Element.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.code?.let { add(it) }
  this@getAllChildren.display?.let { add(it) }
  addAll(this@getAllChildren.target)
}

internal fun ConceptMap.Group.Element.Target.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "code" -> this.code
    "display" -> this.display
    "equivalence" -> this.equivalence
    "comment" -> this.comment
    "dependsOn" -> this.dependsOn
    "product" -> this.product
    else -> error("$name is not a valid property name")
  }

internal fun ConceptMap.Group.Element.Target.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "code" -> true
    "display" -> true
    "equivalence" -> true
    "comment" -> true
    "dependsOn" -> true
    "product" -> true
    else -> false
  }

internal fun ConceptMap.Group.Element.Target.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.code?.let { add(it) }
  this@getAllChildren.display?.let { add(it) }
  add(this@getAllChildren.equivalence)
  this@getAllChildren.comment?.let { add(it) }
  addAll(this@getAllChildren.dependsOn)
  addAll(this@getAllChildren.product)
}

internal fun ConceptMap.Group.Element.Target.DependsOn.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "property" -> this.`property`
    "system" -> this.system
    "value" -> this.`value`
    "display" -> this.display
    else -> error("$name is not a valid property name")
  }

internal fun ConceptMap.Group.Element.Target.DependsOn.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "property" -> true
    "system" -> true
    "value" -> true
    "display" -> true
    else -> false
  }

internal fun ConceptMap.Group.Element.Target.DependsOn.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.`property`)
  this@getAllChildren.system?.let { add(it) }
  add(this@getAllChildren.`value`)
  this@getAllChildren.display?.let { add(it) }
}

internal fun ConceptMap.Group.Unmapped.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "mode" -> this.mode
    "code" -> this.code
    "display" -> this.display
    "url" -> this.url
    else -> error("$name is not a valid property name")
  }

internal fun ConceptMap.Group.Unmapped.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "mode" -> true
    "code" -> true
    "display" -> true
    "url" -> true
    else -> false
  }

internal fun ConceptMap.Group.Unmapped.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.mode)
  this@getAllChildren.code?.let { add(it) }
  this@getAllChildren.display?.let { add(it) }
  this@getAllChildren.url?.let { add(it) }
}
