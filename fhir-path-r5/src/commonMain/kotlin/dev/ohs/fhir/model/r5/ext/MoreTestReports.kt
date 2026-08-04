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

import dev.ohs.fhir.model.r5.TestReport
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun TestReport.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "meta" -> this.meta
    "implicitRules" -> this.implicitRules
    "language" -> this.language
    "text" -> this.text
    "contained" -> this.contained
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "identifier" -> this.identifier
    "name" -> this.name
    "status" -> this.status
    "testScript" -> this.testScript
    "result" -> this.result
    "score" -> this.score
    "tester" -> this.tester
    "issued" -> this.issued
    "participant" -> this.participant
    "setup" -> this.setup
    "test" -> this.test
    "teardown" -> this.teardown
    else -> error("$name is not a valid property name")
  }

internal fun TestReport.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "meta" -> true
    "implicitRules" -> true
    "language" -> true
    "text" -> true
    "contained" -> true
    "extension" -> true
    "modifierExtension" -> true
    "identifier" -> true
    "name" -> true
    "status" -> true
    "testScript" -> true
    "result" -> true
    "score" -> true
    "tester" -> true
    "issued" -> true
    "participant" -> true
    "setup" -> true
    "test" -> true
    "teardown" -> true
    else -> false
  }

internal fun TestReport.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.meta?.let { add(it) }
  this@getAllChildren.implicitRules?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.contained)
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.identifier?.let { add(it) }
  this@getAllChildren.name?.let { add(it) }
  add(this@getAllChildren.status)
  add(this@getAllChildren.testScript)
  add(this@getAllChildren.result)
  this@getAllChildren.score?.let { add(it) }
  this@getAllChildren.tester?.let { add(it) }
  this@getAllChildren.issued?.let { add(it) }
  addAll(this@getAllChildren.participant)
  this@getAllChildren.setup?.let { add(it) }
  addAll(this@getAllChildren.test)
  this@getAllChildren.teardown?.let { add(it) }
}

internal fun TestReport.Participant.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "uri" -> this.uri
    "display" -> this.display
    else -> error("$name is not a valid property name")
  }

internal fun TestReport.Participant.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "uri" -> true
    "display" -> true
    else -> false
  }

internal fun TestReport.Participant.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.type)
  add(this@getAllChildren.uri)
  this@getAllChildren.display?.let { add(it) }
}

internal fun TestReport.Setup.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "action" -> this.action
    else -> error("$name is not a valid property name")
  }

internal fun TestReport.Setup.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "action" -> true
    else -> false
  }

internal fun TestReport.Setup.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.action)
}

internal fun TestReport.Setup.Action.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "operation" -> this.operation
    "assert" -> this.assert
    else -> error("$name is not a valid property name")
  }

internal fun TestReport.Setup.Action.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "operation" -> true
    "assert" -> true
    else -> false
  }

internal fun TestReport.Setup.Action.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.operation?.let { add(it) }
  this@getAllChildren.assert?.let { add(it) }
}

internal fun TestReport.Setup.Action.Operation.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "result" -> this.result
    "message" -> this.message
    "detail" -> this.detail
    else -> error("$name is not a valid property name")
  }

internal fun TestReport.Setup.Action.Operation.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "result" -> true
    "message" -> true
    "detail" -> true
    else -> false
  }

internal fun TestReport.Setup.Action.Operation.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.result)
  this@getAllChildren.message?.let { add(it) }
  this@getAllChildren.detail?.let { add(it) }
}

internal fun TestReport.Setup.Action.Assert.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "result" -> this.result
    "message" -> this.message
    "detail" -> this.detail
    "requirement" -> this.requirement
    else -> error("$name is not a valid property name")
  }

internal fun TestReport.Setup.Action.Assert.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "result" -> true
    "message" -> true
    "detail" -> true
    "requirement" -> true
    else -> false
  }

internal fun TestReport.Setup.Action.Assert.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.result)
  this@getAllChildren.message?.let { add(it) }
  this@getAllChildren.detail?.let { add(it) }
  addAll(this@getAllChildren.requirement)
}

internal fun TestReport.Setup.Action.Assert.Requirement.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "link" -> this.link
    else -> error("$name is not a valid property name")
  }

internal fun TestReport.Setup.Action.Assert.Requirement.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "link" -> true
    else -> false
  }

internal fun TestReport.Setup.Action.Assert.Requirement.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.link?.let { add(it) }
}

internal fun TestReport.Test.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "name" -> this.name
    "description" -> this.description
    "action" -> this.action
    else -> error("$name is not a valid property name")
  }

internal fun TestReport.Test.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "name" -> true
    "description" -> true
    "action" -> true
    else -> false
  }

internal fun TestReport.Test.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.name?.let { add(it) }
  this@getAllChildren.description?.let { add(it) }
  addAll(this@getAllChildren.action)
}

internal fun TestReport.Test.Action.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "operation" -> this.operation
    "assert" -> this.assert
    else -> error("$name is not a valid property name")
  }

internal fun TestReport.Test.Action.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "operation" -> true
    "assert" -> true
    else -> false
  }

internal fun TestReport.Test.Action.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.operation?.let { add(it) }
  this@getAllChildren.assert?.let { add(it) }
}

internal fun TestReport.Teardown.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "action" -> this.action
    else -> error("$name is not a valid property name")
  }

internal fun TestReport.Teardown.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "action" -> true
    else -> false
  }

internal fun TestReport.Teardown.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.action)
}

internal fun TestReport.Teardown.Action.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "operation" -> this.operation
    else -> error("$name is not a valid property name")
  }

internal fun TestReport.Teardown.Action.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "operation" -> true
    else -> false
  }

internal fun TestReport.Teardown.Action.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.operation)
}
