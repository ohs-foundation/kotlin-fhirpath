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

import dev.ohs.fhir.model.r5.ExampleScenario
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun ExampleScenario.getProperty(name: String): Any? =
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
    "actor" -> this.actor
    "instance" -> this.instance
    "process" -> this.process
    else -> error("$name is not a valid property name")
  }

internal fun ExampleScenario.hasProperty(name: String): Boolean =
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
    "actor" -> true
    "instance" -> true
    "process" -> true
    else -> false
  }

internal fun ExampleScenario.getAllChildren(): List<Any> = buildList {
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
  addAll(this@getAllChildren.actor)
  addAll(this@getAllChildren.instance)
  addAll(this@getAllChildren.process)
}

internal fun ExampleScenario.Actor.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "key" -> this.key
    "type" -> this.type
    "title" -> this.title
    "description" -> this.description
    else -> error("$name is not a valid property name")
  }

internal fun ExampleScenario.Actor.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "key" -> true
    "type" -> true
    "title" -> true
    "description" -> true
    else -> false
  }

internal fun ExampleScenario.Actor.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.key)
  add(this@getAllChildren.type)
  add(this@getAllChildren.title)
  this@getAllChildren.description?.let { add(it) }
}

internal fun ExampleScenario.Instance.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "key" -> this.key
    "structureType" -> this.structureType
    "structureVersion" -> this.structureVersion
    "structureProfile" -> this.structureProfile
    "title" -> this.title
    "description" -> this.description
    "content" -> this.content
    "version" -> this.version
    "containedInstance" -> this.containedInstance
    else -> error("$name is not a valid property name")
  }

internal fun ExampleScenario.Instance.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "key" -> true
    "structureType" -> true
    "structureVersion" -> true
    "structureProfile" -> true
    "title" -> true
    "description" -> true
    "content" -> true
    "version" -> true
    "containedInstance" -> true
    else -> false
  }

internal fun ExampleScenario.Instance.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.key)
  add(this@getAllChildren.structureType)
  this@getAllChildren.structureVersion?.let { add(it) }
  this@getAllChildren.structureProfile?.let { add(it) }
  add(this@getAllChildren.title)
  this@getAllChildren.description?.let { add(it) }
  this@getAllChildren.content?.let { add(it) }
  addAll(this@getAllChildren.version)
  addAll(this@getAllChildren.containedInstance)
}

internal fun ExampleScenario.Instance.Version.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "key" -> this.key
    "title" -> this.title
    "description" -> this.description
    "content" -> this.content
    else -> error("$name is not a valid property name")
  }

internal fun ExampleScenario.Instance.Version.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "key" -> true
    "title" -> true
    "description" -> true
    "content" -> true
    else -> false
  }

internal fun ExampleScenario.Instance.Version.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.key)
  add(this@getAllChildren.title)
  this@getAllChildren.description?.let { add(it) }
  this@getAllChildren.content?.let { add(it) }
}

internal fun ExampleScenario.Instance.ContainedInstance.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "instanceReference" -> this.instanceReference
    "versionReference" -> this.versionReference
    else -> error("$name is not a valid property name")
  }

internal fun ExampleScenario.Instance.ContainedInstance.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "instanceReference" -> true
    "versionReference" -> true
    else -> false
  }

internal fun ExampleScenario.Instance.ContainedInstance.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.instanceReference)
  this@getAllChildren.versionReference?.let { add(it) }
}

internal fun ExampleScenario.Process.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "title" -> this.title
    "description" -> this.description
    "preConditions" -> this.preConditions
    "postConditions" -> this.postConditions
    "step" -> this.step
    else -> error("$name is not a valid property name")
  }

internal fun ExampleScenario.Process.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "title" -> true
    "description" -> true
    "preConditions" -> true
    "postConditions" -> true
    "step" -> true
    else -> false
  }

internal fun ExampleScenario.Process.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.title)
  this@getAllChildren.description?.let { add(it) }
  this@getAllChildren.preConditions?.let { add(it) }
  this@getAllChildren.postConditions?.let { add(it) }
  addAll(this@getAllChildren.step)
}

internal fun ExampleScenario.Process.Step.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "number" -> this.number
    "process" -> this.process
    "workflow" -> this.workflow
    "operation" -> this.operation
    "alternative" -> this.alternative
    "pause" -> this.pause
    else -> error("$name is not a valid property name")
  }

internal fun ExampleScenario.Process.Step.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "number" -> true
    "process" -> true
    "workflow" -> true
    "operation" -> true
    "alternative" -> true
    "pause" -> true
    else -> false
  }

internal fun ExampleScenario.Process.Step.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.number?.let { add(it) }
  this@getAllChildren.process?.let { add(it) }
  this@getAllChildren.workflow?.let { add(it) }
  this@getAllChildren.operation?.let { add(it) }
  addAll(this@getAllChildren.alternative)
  this@getAllChildren.pause?.let { add(it) }
}

internal fun ExampleScenario.Process.Step.Operation.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "title" -> this.title
    "initiator" -> this.initiator
    "receiver" -> this.`receiver`
    "description" -> this.description
    "initiatorActive" -> this.initiatorActive
    "receiverActive" -> this.receiverActive
    "request" -> this.request
    "response" -> this.response
    else -> error("$name is not a valid property name")
  }

internal fun ExampleScenario.Process.Step.Operation.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "title" -> true
    "initiator" -> true
    "receiver" -> true
    "description" -> true
    "initiatorActive" -> true
    "receiverActive" -> true
    "request" -> true
    "response" -> true
    else -> false
  }

internal fun ExampleScenario.Process.Step.Operation.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.type?.let { add(it) }
  add(this@getAllChildren.title)
  this@getAllChildren.initiator?.let { add(it) }
  this@getAllChildren.`receiver`?.let { add(it) }
  this@getAllChildren.description?.let { add(it) }
  this@getAllChildren.initiatorActive?.let { add(it) }
  this@getAllChildren.receiverActive?.let { add(it) }
  this@getAllChildren.request?.let { add(it) }
  this@getAllChildren.response?.let { add(it) }
}

internal fun ExampleScenario.Process.Step.Alternative.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "title" -> this.title
    "description" -> this.description
    "step" -> this.step
    else -> error("$name is not a valid property name")
  }

internal fun ExampleScenario.Process.Step.Alternative.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "title" -> true
    "description" -> true
    "step" -> true
    else -> false
  }

internal fun ExampleScenario.Process.Step.Alternative.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.title)
  this@getAllChildren.description?.let { add(it) }
  addAll(this@getAllChildren.step)
}
