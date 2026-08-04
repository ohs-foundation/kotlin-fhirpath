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

import dev.ohs.fhir.model.r5.TestScript
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun TestScript.getProperty(name: String): Any? =
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
    "origin" -> this.origin
    "destination" -> this.destination
    "metadata" -> this.metadata
    "scope" -> this.scope
    "fixture" -> this.fixture
    "profile" -> this.profile
    "variable" -> this.variable
    "setup" -> this.setup
    "test" -> this.test
    "teardown" -> this.teardown
    else -> error("$name is not a valid property name")
  }

internal fun TestScript.hasProperty(name: String): Boolean =
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
    "origin" -> true
    "destination" -> true
    "metadata" -> true
    "scope" -> true
    "fixture" -> true
    "profile" -> true
    "variable" -> true
    "setup" -> true
    "test" -> true
    "teardown" -> true
    else -> false
  }

internal fun TestScript.getAllChildren(): List<Any> = buildList {
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
  addAll(this@getAllChildren.origin)
  addAll(this@getAllChildren.destination)
  this@getAllChildren.metadata?.let { add(it) }
  addAll(this@getAllChildren.scope)
  addAll(this@getAllChildren.fixture)
  addAll(this@getAllChildren.profile)
  addAll(this@getAllChildren.variable)
  this@getAllChildren.setup?.let { add(it) }
  addAll(this@getAllChildren.test)
  this@getAllChildren.teardown?.let { add(it) }
}

internal fun TestScript.Origin.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "index" -> this.index
    "profile" -> this.profile
    "url" -> this.url
    else -> error("$name is not a valid property name")
  }

internal fun TestScript.Origin.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "index" -> true
    "profile" -> true
    "url" -> true
    else -> false
  }

internal fun TestScript.Origin.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.index)
  add(this@getAllChildren.profile)
  this@getAllChildren.url?.let { add(it) }
}

internal fun TestScript.Destination.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "index" -> this.index
    "profile" -> this.profile
    "url" -> this.url
    else -> error("$name is not a valid property name")
  }

internal fun TestScript.Destination.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "index" -> true
    "profile" -> true
    "url" -> true
    else -> false
  }

internal fun TestScript.Destination.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.index)
  add(this@getAllChildren.profile)
  this@getAllChildren.url?.let { add(it) }
}

internal fun TestScript.Metadata.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "link" -> this.link
    "capability" -> this.capability
    else -> error("$name is not a valid property name")
  }

internal fun TestScript.Metadata.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "link" -> true
    "capability" -> true
    else -> false
  }

internal fun TestScript.Metadata.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.link)
  addAll(this@getAllChildren.capability)
}

internal fun TestScript.Metadata.Link.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "url" -> this.url
    "description" -> this.description
    else -> error("$name is not a valid property name")
  }

internal fun TestScript.Metadata.Link.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "url" -> true
    "description" -> true
    else -> false
  }

internal fun TestScript.Metadata.Link.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.url)
  this@getAllChildren.description?.let { add(it) }
}

internal fun TestScript.Metadata.Capability.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "required" -> this.required
    "validated" -> this.validated
    "description" -> this.description
    "origin" -> this.origin
    "destination" -> this.destination
    "link" -> this.link
    "capabilities" -> this.capabilities
    else -> error("$name is not a valid property name")
  }

internal fun TestScript.Metadata.Capability.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "required" -> true
    "validated" -> true
    "description" -> true
    "origin" -> true
    "destination" -> true
    "link" -> true
    "capabilities" -> true
    else -> false
  }

internal fun TestScript.Metadata.Capability.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.required)
  add(this@getAllChildren.validated)
  this@getAllChildren.description?.let { add(it) }
  addAll(this@getAllChildren.origin)
  this@getAllChildren.destination?.let { add(it) }
  addAll(this@getAllChildren.link)
  add(this@getAllChildren.capabilities)
}

internal fun TestScript.Scope.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "artifact" -> this.artifact
    "conformance" -> this.conformance
    "phase" -> this.phase
    else -> error("$name is not a valid property name")
  }

internal fun TestScript.Scope.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "artifact" -> true
    "conformance" -> true
    "phase" -> true
    else -> false
  }

internal fun TestScript.Scope.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.artifact)
  this@getAllChildren.conformance?.let { add(it) }
  this@getAllChildren.phase?.let { add(it) }
}

internal fun TestScript.Fixture.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "autocreate" -> this.autocreate
    "autodelete" -> this.autodelete
    "resource" -> this.resource
    else -> error("$name is not a valid property name")
  }

internal fun TestScript.Fixture.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "autocreate" -> true
    "autodelete" -> true
    "resource" -> true
    else -> false
  }

internal fun TestScript.Fixture.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.autocreate)
  add(this@getAllChildren.autodelete)
  this@getAllChildren.resource?.let { add(it) }
}

internal fun TestScript.Variable.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "name" -> this.name
    "defaultValue" -> this.defaultValue
    "description" -> this.description
    "expression" -> this.expression
    "headerField" -> this.headerField
    "hint" -> this.hint
    "path" -> this.path
    "sourceId" -> this.sourceId
    else -> error("$name is not a valid property name")
  }

internal fun TestScript.Variable.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "name" -> true
    "defaultValue" -> true
    "description" -> true
    "expression" -> true
    "headerField" -> true
    "hint" -> true
    "path" -> true
    "sourceId" -> true
    else -> false
  }

internal fun TestScript.Variable.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.name)
  this@getAllChildren.defaultValue?.let { add(it) }
  this@getAllChildren.description?.let { add(it) }
  this@getAllChildren.expression?.let { add(it) }
  this@getAllChildren.headerField?.let { add(it) }
  this@getAllChildren.hint?.let { add(it) }
  this@getAllChildren.path?.let { add(it) }
  this@getAllChildren.sourceId?.let { add(it) }
}

internal fun TestScript.Setup.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "action" -> this.action
    else -> error("$name is not a valid property name")
  }

internal fun TestScript.Setup.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "action" -> true
    else -> false
  }

internal fun TestScript.Setup.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.action)
}

internal fun TestScript.Setup.Action.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "operation" -> this.operation
    "assert" -> this.assert
    else -> error("$name is not a valid property name")
  }

internal fun TestScript.Setup.Action.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "operation" -> true
    "assert" -> true
    else -> false
  }

internal fun TestScript.Setup.Action.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.operation?.let { add(it) }
  this@getAllChildren.assert?.let { add(it) }
}

internal fun TestScript.Setup.Action.Operation.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "resource" -> this.resource
    "label" -> this.label
    "description" -> this.description
    "accept" -> this.accept
    "contentType" -> this.contentType
    "destination" -> this.destination
    "encodeRequestUrl" -> this.encodeRequestUrl
    "method" -> this.method
    "origin" -> this.origin
    "params" -> this.params
    "requestHeader" -> this.requestHeader
    "requestId" -> this.requestId
    "responseId" -> this.responseId
    "sourceId" -> this.sourceId
    "targetId" -> this.targetId
    "url" -> this.url
    else -> error("$name is not a valid property name")
  }

internal fun TestScript.Setup.Action.Operation.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "resource" -> true
    "label" -> true
    "description" -> true
    "accept" -> true
    "contentType" -> true
    "destination" -> true
    "encodeRequestUrl" -> true
    "method" -> true
    "origin" -> true
    "params" -> true
    "requestHeader" -> true
    "requestId" -> true
    "responseId" -> true
    "sourceId" -> true
    "targetId" -> true
    "url" -> true
    else -> false
  }

internal fun TestScript.Setup.Action.Operation.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.type?.let { add(it) }
  this@getAllChildren.resource?.let { add(it) }
  this@getAllChildren.label?.let { add(it) }
  this@getAllChildren.description?.let { add(it) }
  this@getAllChildren.accept?.let { add(it) }
  this@getAllChildren.contentType?.let { add(it) }
  this@getAllChildren.destination?.let { add(it) }
  add(this@getAllChildren.encodeRequestUrl)
  this@getAllChildren.method?.let { add(it) }
  this@getAllChildren.origin?.let { add(it) }
  this@getAllChildren.params?.let { add(it) }
  addAll(this@getAllChildren.requestHeader)
  this@getAllChildren.requestId?.let { add(it) }
  this@getAllChildren.responseId?.let { add(it) }
  this@getAllChildren.sourceId?.let { add(it) }
  this@getAllChildren.targetId?.let { add(it) }
  this@getAllChildren.url?.let { add(it) }
}

internal fun TestScript.Setup.Action.Operation.RequestHeader.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "field" -> this.`field`
    "value" -> this.`value`
    else -> error("$name is not a valid property name")
  }

internal fun TestScript.Setup.Action.Operation.RequestHeader.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "field" -> true
    "value" -> true
    else -> false
  }

internal fun TestScript.Setup.Action.Operation.RequestHeader.getAllChildren(): List<Any> =
  buildList {
    this@getAllChildren.id?.let { add(it) }
    addAll(this@getAllChildren.extension)
    addAll(this@getAllChildren.modifierExtension)
    add(this@getAllChildren.`field`)
    add(this@getAllChildren.`value`)
  }

internal fun TestScript.Setup.Action.Assert.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "label" -> this.label
    "description" -> this.description
    "direction" -> this.direction
    "compareToSourceId" -> this.compareToSourceId
    "compareToSourceExpression" -> this.compareToSourceExpression
    "compareToSourcePath" -> this.compareToSourcePath
    "contentType" -> this.contentType
    "defaultManualCompletion" -> this.defaultManualCompletion
    "expression" -> this.expression
    "headerField" -> this.headerField
    "minimumId" -> this.minimumId
    "navigationLinks" -> this.navigationLinks
    "operator" -> this.`operator`
    "path" -> this.path
    "requestMethod" -> this.requestMethod
    "requestURL" -> this.requestURL
    "resource" -> this.resource
    "response" -> this.response
    "responseCode" -> this.responseCode
    "sourceId" -> this.sourceId
    "stopTestOnFail" -> this.stopTestOnFail
    "validateProfileId" -> this.validateProfileId
    "value" -> this.`value`
    "warningOnly" -> this.warningOnly
    "requirement" -> this.requirement
    else -> error("$name is not a valid property name")
  }

internal fun TestScript.Setup.Action.Assert.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "label" -> true
    "description" -> true
    "direction" -> true
    "compareToSourceId" -> true
    "compareToSourceExpression" -> true
    "compareToSourcePath" -> true
    "contentType" -> true
    "defaultManualCompletion" -> true
    "expression" -> true
    "headerField" -> true
    "minimumId" -> true
    "navigationLinks" -> true
    "operator" -> true
    "path" -> true
    "requestMethod" -> true
    "requestURL" -> true
    "resource" -> true
    "response" -> true
    "responseCode" -> true
    "sourceId" -> true
    "stopTestOnFail" -> true
    "validateProfileId" -> true
    "value" -> true
    "warningOnly" -> true
    "requirement" -> true
    else -> false
  }

internal fun TestScript.Setup.Action.Assert.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.label?.let { add(it) }
  this@getAllChildren.description?.let { add(it) }
  this@getAllChildren.direction?.let { add(it) }
  this@getAllChildren.compareToSourceId?.let { add(it) }
  this@getAllChildren.compareToSourceExpression?.let { add(it) }
  this@getAllChildren.compareToSourcePath?.let { add(it) }
  this@getAllChildren.contentType?.let { add(it) }
  this@getAllChildren.defaultManualCompletion?.let { add(it) }
  this@getAllChildren.expression?.let { add(it) }
  this@getAllChildren.headerField?.let { add(it) }
  this@getAllChildren.minimumId?.let { add(it) }
  this@getAllChildren.navigationLinks?.let { add(it) }
  this@getAllChildren.`operator`?.let { add(it) }
  this@getAllChildren.path?.let { add(it) }
  this@getAllChildren.requestMethod?.let { add(it) }
  this@getAllChildren.requestURL?.let { add(it) }
  this@getAllChildren.resource?.let { add(it) }
  this@getAllChildren.response?.let { add(it) }
  this@getAllChildren.responseCode?.let { add(it) }
  this@getAllChildren.sourceId?.let { add(it) }
  add(this@getAllChildren.stopTestOnFail)
  this@getAllChildren.validateProfileId?.let { add(it) }
  this@getAllChildren.`value`?.let { add(it) }
  add(this@getAllChildren.warningOnly)
  addAll(this@getAllChildren.requirement)
}

internal fun TestScript.Setup.Action.Assert.Requirement.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "link" -> this.link
    else -> error("$name is not a valid property name")
  }

internal fun TestScript.Setup.Action.Assert.Requirement.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "link" -> true
    else -> false
  }

internal fun TestScript.Setup.Action.Assert.Requirement.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.link?.let { add(it) }
}

internal fun TestScript.Test.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "name" -> this.name
    "description" -> this.description
    "action" -> this.action
    else -> error("$name is not a valid property name")
  }

internal fun TestScript.Test.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "name" -> true
    "description" -> true
    "action" -> true
    else -> false
  }

internal fun TestScript.Test.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.name?.let { add(it) }
  this@getAllChildren.description?.let { add(it) }
  addAll(this@getAllChildren.action)
}

internal fun TestScript.Test.Action.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "operation" -> this.operation
    "assert" -> this.assert
    else -> error("$name is not a valid property name")
  }

internal fun TestScript.Test.Action.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "operation" -> true
    "assert" -> true
    else -> false
  }

internal fun TestScript.Test.Action.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.operation?.let { add(it) }
  this@getAllChildren.assert?.let { add(it) }
}

internal fun TestScript.Teardown.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "action" -> this.action
    else -> error("$name is not a valid property name")
  }

internal fun TestScript.Teardown.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "action" -> true
    else -> false
  }

internal fun TestScript.Teardown.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.action)
}

internal fun TestScript.Teardown.Action.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "operation" -> this.operation
    else -> error("$name is not a valid property name")
  }

internal fun TestScript.Teardown.Action.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "operation" -> true
    else -> false
  }

internal fun TestScript.Teardown.Action.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.operation)
}
