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

import dev.ohs.fhir.model.r5.ConceptMap
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
    "approvalDate" -> this.approvalDate
    "lastReviewDate" -> this.lastReviewDate
    "effectivePeriod" -> this.effectivePeriod
    "topic" -> this.topic
    "author" -> this.author
    "editor" -> this.editor
    "reviewer" -> this.reviewer
    "endorser" -> this.endorser
    "relatedArtifact" -> this.relatedArtifact
    "property" -> this.`property`
    "additionalAttribute" -> this.additionalAttribute
    "sourceScope" -> this.sourceScope
    "targetScope" -> this.targetScope
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
    "approvalDate" -> true
    "lastReviewDate" -> true
    "effectivePeriod" -> true
    "topic" -> true
    "author" -> true
    "editor" -> true
    "reviewer" -> true
    "endorser" -> true
    "relatedArtifact" -> true
    "property" -> true
    "additionalAttribute" -> true
    "sourceScope" -> true
    "targetScope" -> true
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
  addAll(this@getAllChildren.identifier)
  this@getAllChildren.version?.let { add(it) }
  this@getAllChildren.versionAlgorithm?.let { add(it) }
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
  this@getAllChildren.copyrightLabel?.let { add(it) }
  this@getAllChildren.approvalDate?.let { add(it) }
  this@getAllChildren.lastReviewDate?.let { add(it) }
  this@getAllChildren.effectivePeriod?.let { add(it) }
  addAll(this@getAllChildren.topic)
  addAll(this@getAllChildren.author)
  addAll(this@getAllChildren.editor)
  addAll(this@getAllChildren.reviewer)
  addAll(this@getAllChildren.endorser)
  addAll(this@getAllChildren.relatedArtifact)
  addAll(this@getAllChildren.`property`)
  addAll(this@getAllChildren.additionalAttribute)
  this@getAllChildren.sourceScope?.let { add(it) }
  this@getAllChildren.targetScope?.let { add(it) }
  addAll(this@getAllChildren.group)
}

internal fun ConceptMap.Property.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "code" -> this.code
    "uri" -> this.uri
    "description" -> this.description
    "type" -> this.type
    "system" -> this.system
    else -> error("$name is not a valid property name")
  }

internal fun ConceptMap.Property.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "code" -> true
    "uri" -> true
    "description" -> true
    "type" -> true
    "system" -> true
    else -> false
  }

internal fun ConceptMap.Property.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.code)
  this@getAllChildren.uri?.let { add(it) }
  this@getAllChildren.description?.let { add(it) }
  add(this@getAllChildren.type)
  this@getAllChildren.system?.let { add(it) }
}

internal fun ConceptMap.AdditionalAttribute.getProperty(name: String): Any? =
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

internal fun ConceptMap.AdditionalAttribute.hasProperty(name: String): Boolean =
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

internal fun ConceptMap.AdditionalAttribute.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.code)
  this@getAllChildren.uri?.let { add(it) }
  this@getAllChildren.description?.let { add(it) }
  add(this@getAllChildren.type)
}

internal fun ConceptMap.Group.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "source" -> this.source
    "target" -> this.target
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
    "target" -> true
    "element" -> true
    "unmapped" -> true
    else -> false
  }

internal fun ConceptMap.Group.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.source?.let { add(it) }
  this@getAllChildren.target?.let { add(it) }
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
    "valueSet" -> this.valueSet
    "noMap" -> this.noMap
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
    "valueSet" -> true
    "noMap" -> true
    "target" -> true
    else -> false
  }

internal fun ConceptMap.Group.Element.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.code?.let { add(it) }
  this@getAllChildren.display?.let { add(it) }
  this@getAllChildren.valueSet?.let { add(it) }
  this@getAllChildren.noMap?.let { add(it) }
  addAll(this@getAllChildren.target)
}

internal fun ConceptMap.Group.Element.Target.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "code" -> this.code
    "display" -> this.display
    "valueSet" -> this.valueSet
    "relationship" -> this.relationship
    "comment" -> this.comment
    "property" -> this.`property`
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
    "valueSet" -> true
    "relationship" -> true
    "comment" -> true
    "property" -> true
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
  this@getAllChildren.valueSet?.let { add(it) }
  add(this@getAllChildren.relationship)
  this@getAllChildren.comment?.let { add(it) }
  addAll(this@getAllChildren.`property`)
  addAll(this@getAllChildren.dependsOn)
  addAll(this@getAllChildren.product)
}

internal fun ConceptMap.Group.Element.Target.Property.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "code" -> this.code
    "value" -> this.`value`
    else -> error("$name is not a valid property name")
  }

internal fun ConceptMap.Group.Element.Target.Property.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "code" -> true
    "value" -> true
    else -> false
  }

internal fun ConceptMap.Group.Element.Target.Property.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.code)
  add(this@getAllChildren.`value`)
}

internal fun ConceptMap.Group.Element.Target.DependsOn.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "attribute" -> this.attribute
    "value" -> this.`value`
    "valueSet" -> this.valueSet
    else -> error("$name is not a valid property name")
  }

internal fun ConceptMap.Group.Element.Target.DependsOn.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "attribute" -> true
    "value" -> true
    "valueSet" -> true
    else -> false
  }

internal fun ConceptMap.Group.Element.Target.DependsOn.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.attribute)
  this@getAllChildren.`value`?.let { add(it) }
  this@getAllChildren.valueSet?.let { add(it) }
}

internal fun ConceptMap.Group.Unmapped.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "mode" -> this.mode
    "code" -> this.code
    "display" -> this.display
    "valueSet" -> this.valueSet
    "relationship" -> this.relationship
    "otherMap" -> this.otherMap
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
    "valueSet" -> true
    "relationship" -> true
    "otherMap" -> true
    else -> false
  }

internal fun ConceptMap.Group.Unmapped.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.mode)
  this@getAllChildren.code?.let { add(it) }
  this@getAllChildren.display?.let { add(it) }
  this@getAllChildren.valueSet?.let { add(it) }
  this@getAllChildren.relationship?.let { add(it) }
  this@getAllChildren.otherMap?.let { add(it) }
}
