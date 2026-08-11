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

import dev.ohs.fhir.model.r5.TestPlan
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun TestPlan.getProperty(name: String): Any? =
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
    "category" -> this.category
    "scope" -> this.scope
    "testTools" -> this.testTools
    "dependency" -> this.dependency
    "exitCriteria" -> this.exitCriteria
    "testCase" -> this.testCase
    else -> error("$name is not a valid property name")
  }

internal fun TestPlan.hasProperty(name: String): Boolean =
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
    "category" -> true
    "scope" -> true
    "testTools" -> true
    "dependency" -> true
    "exitCriteria" -> true
    "testCase" -> true
    else -> false
  }

internal fun TestPlan.getAllChildren(): List<Any> = buildList {
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
  addAll(this@getAllChildren.category)
  addAll(this@getAllChildren.scope)
  this@getAllChildren.testTools?.let { add(it) }
  addAll(this@getAllChildren.dependency)
  this@getAllChildren.exitCriteria?.let { add(it) }
  addAll(this@getAllChildren.testCase)
}

internal fun TestPlan.Dependency.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "description" -> this.description
    "predecessor" -> this.predecessor
    else -> error("$name is not a valid property name")
  }

internal fun TestPlan.Dependency.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "description" -> true
    "predecessor" -> true
    else -> false
  }

internal fun TestPlan.Dependency.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.description?.let { add(it) }
  this@getAllChildren.predecessor?.let { add(it) }
}

internal fun TestPlan.TestCase.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "sequence" -> this.sequence
    "scope" -> this.scope
    "dependency" -> this.dependency
    "testRun" -> this.testRun
    "testData" -> this.testData
    "assertion" -> this.assertion
    else -> error("$name is not a valid property name")
  }

internal fun TestPlan.TestCase.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "sequence" -> true
    "scope" -> true
    "dependency" -> true
    "testRun" -> true
    "testData" -> true
    "assertion" -> true
    else -> false
  }

internal fun TestPlan.TestCase.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.sequence?.let { add(it) }
  addAll(this@getAllChildren.scope)
  addAll(this@getAllChildren.dependency)
  addAll(this@getAllChildren.testRun)
  addAll(this@getAllChildren.testData)
  addAll(this@getAllChildren.assertion)
}

internal fun TestPlan.TestCase.Dependency.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "description" -> this.description
    "predecessor" -> this.predecessor
    else -> error("$name is not a valid property name")
  }

internal fun TestPlan.TestCase.Dependency.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "description" -> true
    "predecessor" -> true
    else -> false
  }

internal fun TestPlan.TestCase.Dependency.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.description?.let { add(it) }
  this@getAllChildren.predecessor?.let { add(it) }
}

internal fun TestPlan.TestCase.TestRun.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "narrative" -> this.narrative
    "script" -> this.script
    else -> error("$name is not a valid property name")
  }

internal fun TestPlan.TestCase.TestRun.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "narrative" -> true
    "script" -> true
    else -> false
  }

internal fun TestPlan.TestCase.TestRun.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.narrative?.let { add(it) }
  this@getAllChildren.script?.let { add(it) }
}

internal fun TestPlan.TestCase.TestRun.Script.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "language" -> this.language
    "source" -> this.source
    else -> error("$name is not a valid property name")
  }

internal fun TestPlan.TestCase.TestRun.Script.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "language" -> true
    "source" -> true
    else -> false
  }

internal fun TestPlan.TestCase.TestRun.Script.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.source?.let { add(it) }
}

internal fun TestPlan.TestCase.TestData.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "content" -> this.content
    "source" -> this.source
    else -> error("$name is not a valid property name")
  }

internal fun TestPlan.TestCase.TestData.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "content" -> true
    "source" -> true
    else -> false
  }

internal fun TestPlan.TestCase.TestData.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.type)
  this@getAllChildren.content?.let { add(it) }
  this@getAllChildren.source?.let { add(it) }
}

internal fun TestPlan.TestCase.Assertion.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "object" -> this.`object`
    "result" -> this.result
    else -> error("$name is not a valid property name")
  }

internal fun TestPlan.TestCase.Assertion.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "object" -> true
    "result" -> true
    else -> false
  }

internal fun TestPlan.TestCase.Assertion.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.type)
  addAll(this@getAllChildren.`object`)
  addAll(this@getAllChildren.result)
}
