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

import dev.ohs.fhir.model.r5.ImplementationGuide
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun ImplementationGuide.getProperty(name: String): Any? =
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
    "packageId" -> this.packageId
    "license" -> this.license
    "fhirVersion" -> this.fhirVersion
    "dependsOn" -> this.dependsOn
    "global" -> this.global
    "definition" -> this.definition
    "manifest" -> this.manifest
    else -> error("$name is not a valid property name")
  }

internal fun ImplementationGuide.hasProperty(name: String): Boolean =
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
    "packageId" -> true
    "license" -> true
    "fhirVersion" -> true
    "dependsOn" -> true
    "global" -> true
    "definition" -> true
    "manifest" -> true
    else -> false
  }

internal fun ImplementationGuide.getAllChildren(): List<Any> = buildList {
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
  add(this@getAllChildren.packageId)
  this@getAllChildren.license?.let { add(it) }
  addAll(this@getAllChildren.fhirVersion)
  addAll(this@getAllChildren.dependsOn)
  addAll(this@getAllChildren.global)
  this@getAllChildren.definition?.let { add(it) }
  this@getAllChildren.manifest?.let { add(it) }
}

internal fun ImplementationGuide.DependsOn.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "uri" -> this.uri
    "packageId" -> this.packageId
    "version" -> this.version
    "reason" -> this.reason
    else -> error("$name is not a valid property name")
  }

internal fun ImplementationGuide.DependsOn.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "uri" -> true
    "packageId" -> true
    "version" -> true
    "reason" -> true
    else -> false
  }

internal fun ImplementationGuide.DependsOn.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.uri)
  this@getAllChildren.packageId?.let { add(it) }
  this@getAllChildren.version?.let { add(it) }
  this@getAllChildren.reason?.let { add(it) }
}

internal fun ImplementationGuide.Global.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "profile" -> this.profile
    else -> error("$name is not a valid property name")
  }

internal fun ImplementationGuide.Global.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "profile" -> true
    else -> false
  }

internal fun ImplementationGuide.Global.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.type)
  add(this@getAllChildren.profile)
}

internal fun ImplementationGuide.Definition.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "grouping" -> this.grouping
    "resource" -> this.resource
    "page" -> this.page
    "parameter" -> this.parameter
    "template" -> this.template
    else -> error("$name is not a valid property name")
  }

internal fun ImplementationGuide.Definition.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "grouping" -> true
    "resource" -> true
    "page" -> true
    "parameter" -> true
    "template" -> true
    else -> false
  }

internal fun ImplementationGuide.Definition.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.grouping)
  addAll(this@getAllChildren.resource)
  this@getAllChildren.page?.let { add(it) }
  addAll(this@getAllChildren.parameter)
  addAll(this@getAllChildren.template)
}

internal fun ImplementationGuide.Definition.Grouping.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "name" -> this.name
    "description" -> this.description
    else -> error("$name is not a valid property name")
  }

internal fun ImplementationGuide.Definition.Grouping.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "name" -> true
    "description" -> true
    else -> false
  }

internal fun ImplementationGuide.Definition.Grouping.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.name)
  this@getAllChildren.description?.let { add(it) }
}

internal fun ImplementationGuide.Definition.Resource.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "reference" -> this.reference
    "fhirVersion" -> this.fhirVersion
    "name" -> this.name
    "description" -> this.description
    "isExample" -> this.isExample
    "profile" -> this.profile
    "groupingId" -> this.groupingId
    else -> error("$name is not a valid property name")
  }

internal fun ImplementationGuide.Definition.Resource.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "reference" -> true
    "fhirVersion" -> true
    "name" -> true
    "description" -> true
    "isExample" -> true
    "profile" -> true
    "groupingId" -> true
    else -> false
  }

internal fun ImplementationGuide.Definition.Resource.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.reference)
  addAll(this@getAllChildren.fhirVersion)
  this@getAllChildren.name?.let { add(it) }
  this@getAllChildren.description?.let { add(it) }
  this@getAllChildren.isExample?.let { add(it) }
  addAll(this@getAllChildren.profile)
  this@getAllChildren.groupingId?.let { add(it) }
}

internal fun ImplementationGuide.Definition.Page.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "source" -> this.source
    "name" -> this.name
    "title" -> this.title
    "generation" -> this.generation
    "page" -> this.page
    else -> error("$name is not a valid property name")
  }

internal fun ImplementationGuide.Definition.Page.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "source" -> true
    "name" -> true
    "title" -> true
    "generation" -> true
    "page" -> true
    else -> false
  }

internal fun ImplementationGuide.Definition.Page.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.source?.let { add(it) }
  add(this@getAllChildren.name)
  add(this@getAllChildren.title)
  add(this@getAllChildren.generation)
  addAll(this@getAllChildren.page)
}

internal fun ImplementationGuide.Definition.Parameter.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "code" -> this.code
    "value" -> this.`value`
    else -> error("$name is not a valid property name")
  }

internal fun ImplementationGuide.Definition.Parameter.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "code" -> true
    "value" -> true
    else -> false
  }

internal fun ImplementationGuide.Definition.Parameter.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.code)
  add(this@getAllChildren.`value`)
}

internal fun ImplementationGuide.Definition.Template.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "code" -> this.code
    "source" -> this.source
    "scope" -> this.scope
    else -> error("$name is not a valid property name")
  }

internal fun ImplementationGuide.Definition.Template.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "code" -> true
    "source" -> true
    "scope" -> true
    else -> false
  }

internal fun ImplementationGuide.Definition.Template.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.code)
  add(this@getAllChildren.source)
  this@getAllChildren.scope?.let { add(it) }
}

internal fun ImplementationGuide.Manifest.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "rendering" -> this.rendering
    "resource" -> this.resource
    "page" -> this.page
    "image" -> this.image
    "other" -> this.other
    else -> error("$name is not a valid property name")
  }

internal fun ImplementationGuide.Manifest.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "rendering" -> true
    "resource" -> true
    "page" -> true
    "image" -> true
    "other" -> true
    else -> false
  }

internal fun ImplementationGuide.Manifest.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.rendering?.let { add(it) }
  addAll(this@getAllChildren.resource)
  addAll(this@getAllChildren.page)
  addAll(this@getAllChildren.image)
  addAll(this@getAllChildren.other)
}

internal fun ImplementationGuide.Manifest.Resource.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "reference" -> this.reference
    "isExample" -> this.isExample
    "profile" -> this.profile
    "relativePath" -> this.relativePath
    else -> error("$name is not a valid property name")
  }

internal fun ImplementationGuide.Manifest.Resource.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "reference" -> true
    "isExample" -> true
    "profile" -> true
    "relativePath" -> true
    else -> false
  }

internal fun ImplementationGuide.Manifest.Resource.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.reference)
  this@getAllChildren.isExample?.let { add(it) }
  addAll(this@getAllChildren.profile)
  this@getAllChildren.relativePath?.let { add(it) }
}

internal fun ImplementationGuide.Manifest.Page.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "name" -> this.name
    "title" -> this.title
    "anchor" -> this.anchor
    else -> error("$name is not a valid property name")
  }

internal fun ImplementationGuide.Manifest.Page.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "name" -> true
    "title" -> true
    "anchor" -> true
    else -> false
  }

internal fun ImplementationGuide.Manifest.Page.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.name)
  this@getAllChildren.title?.let { add(it) }
  addAll(this@getAllChildren.anchor)
}
