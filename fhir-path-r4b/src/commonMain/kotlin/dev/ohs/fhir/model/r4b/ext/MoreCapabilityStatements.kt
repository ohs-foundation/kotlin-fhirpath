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

import dev.ohs.fhir.model.r4b.CapabilityStatement
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun CapabilityStatement.getProperty(name: String): Any? =
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
    "experimental" -> this.experimental
    "date" -> this.date
    "publisher" -> this.publisher
    "contact" -> this.contact
    "description" -> this.description
    "useContext" -> this.useContext
    "jurisdiction" -> this.jurisdiction
    "purpose" -> this.purpose
    "copyright" -> this.copyright
    "kind" -> this.kind
    "instantiates" -> this.instantiates
    "imports" -> this.imports
    "software" -> this.software
    "implementation" -> this.implementation
    "fhirVersion" -> this.fhirVersion
    "format" -> this.format
    "patchFormat" -> this.patchFormat
    "implementationGuide" -> this.implementationGuide
    "rest" -> this.rest
    "messaging" -> this.messaging
    "document" -> this.document
    else -> error("$name is not a valid property name")
  }

internal fun CapabilityStatement.hasProperty(name: String): Boolean =
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
    "experimental" -> true
    "date" -> true
    "publisher" -> true
    "contact" -> true
    "description" -> true
    "useContext" -> true
    "jurisdiction" -> true
    "purpose" -> true
    "copyright" -> true
    "kind" -> true
    "instantiates" -> true
    "imports" -> true
    "software" -> true
    "implementation" -> true
    "fhirVersion" -> true
    "format" -> true
    "patchFormat" -> true
    "implementationGuide" -> true
    "rest" -> true
    "messaging" -> true
    "document" -> true
    else -> false
  }

internal fun CapabilityStatement.getAllChildren(): List<Any> = buildList {
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
  this@getAllChildren.name?.let { add(it) }
  this@getAllChildren.title?.let { add(it) }
  add(this@getAllChildren.status)
  this@getAllChildren.experimental?.let { add(it) }
  add(this@getAllChildren.date)
  this@getAllChildren.publisher?.let { add(it) }
  addAll(this@getAllChildren.contact)
  this@getAllChildren.description?.let { add(it) }
  addAll(this@getAllChildren.useContext)
  addAll(this@getAllChildren.jurisdiction)
  this@getAllChildren.purpose?.let { add(it) }
  this@getAllChildren.copyright?.let { add(it) }
  add(this@getAllChildren.kind)
  addAll(this@getAllChildren.instantiates)
  addAll(this@getAllChildren.imports)
  this@getAllChildren.software?.let { add(it) }
  this@getAllChildren.implementation?.let { add(it) }
  add(this@getAllChildren.fhirVersion)
  addAll(this@getAllChildren.format)
  addAll(this@getAllChildren.patchFormat)
  addAll(this@getAllChildren.implementationGuide)
  addAll(this@getAllChildren.rest)
  addAll(this@getAllChildren.messaging)
  addAll(this@getAllChildren.document)
}

internal fun CapabilityStatement.Software.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "name" -> this.name
    "version" -> this.version
    "releaseDate" -> this.releaseDate
    else -> error("$name is not a valid property name")
  }

internal fun CapabilityStatement.Software.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "name" -> true
    "version" -> true
    "releaseDate" -> true
    else -> false
  }

internal fun CapabilityStatement.Software.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.name)
  this@getAllChildren.version?.let { add(it) }
  this@getAllChildren.releaseDate?.let { add(it) }
}

internal fun CapabilityStatement.Implementation.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "description" -> this.description
    "url" -> this.url
    "custodian" -> this.custodian
    else -> error("$name is not a valid property name")
  }

internal fun CapabilityStatement.Implementation.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "description" -> true
    "url" -> true
    "custodian" -> true
    else -> false
  }

internal fun CapabilityStatement.Implementation.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.description)
  this@getAllChildren.url?.let { add(it) }
  this@getAllChildren.custodian?.let { add(it) }
}

internal fun CapabilityStatement.Rest.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "mode" -> this.mode
    "documentation" -> this.documentation
    "security" -> this.security
    "resource" -> this.resource
    "interaction" -> this.interaction
    "searchParam" -> this.searchParam
    "operation" -> this.operation
    "compartment" -> this.compartment
    else -> error("$name is not a valid property name")
  }

internal fun CapabilityStatement.Rest.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "mode" -> true
    "documentation" -> true
    "security" -> true
    "resource" -> true
    "interaction" -> true
    "searchParam" -> true
    "operation" -> true
    "compartment" -> true
    else -> false
  }

internal fun CapabilityStatement.Rest.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.mode)
  this@getAllChildren.documentation?.let { add(it) }
  this@getAllChildren.security?.let { add(it) }
  addAll(this@getAllChildren.resource)
  addAll(this@getAllChildren.interaction)
  addAll(this@getAllChildren.searchParam)
  addAll(this@getAllChildren.operation)
  addAll(this@getAllChildren.compartment)
}

internal fun CapabilityStatement.Rest.Security.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "cors" -> this.cors
    "service" -> this.service
    "description" -> this.description
    else -> error("$name is not a valid property name")
  }

internal fun CapabilityStatement.Rest.Security.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "cors" -> true
    "service" -> true
    "description" -> true
    else -> false
  }

internal fun CapabilityStatement.Rest.Security.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.cors?.let { add(it) }
  addAll(this@getAllChildren.service)
  this@getAllChildren.description?.let { add(it) }
}

internal fun CapabilityStatement.Rest.Resource.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "profile" -> this.profile
    "supportedProfile" -> this.supportedProfile
    "documentation" -> this.documentation
    "interaction" -> this.interaction
    "versioning" -> this.versioning
    "readHistory" -> this.readHistory
    "updateCreate" -> this.updateCreate
    "conditionalCreate" -> this.conditionalCreate
    "conditionalRead" -> this.conditionalRead
    "conditionalUpdate" -> this.conditionalUpdate
    "conditionalDelete" -> this.conditionalDelete
    "referencePolicy" -> this.referencePolicy
    "searchInclude" -> this.searchInclude
    "searchRevInclude" -> this.searchRevInclude
    "searchParam" -> this.searchParam
    "operation" -> this.operation
    else -> error("$name is not a valid property name")
  }

internal fun CapabilityStatement.Rest.Resource.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "profile" -> true
    "supportedProfile" -> true
    "documentation" -> true
    "interaction" -> true
    "versioning" -> true
    "readHistory" -> true
    "updateCreate" -> true
    "conditionalCreate" -> true
    "conditionalRead" -> true
    "conditionalUpdate" -> true
    "conditionalDelete" -> true
    "referencePolicy" -> true
    "searchInclude" -> true
    "searchRevInclude" -> true
    "searchParam" -> true
    "operation" -> true
    else -> false
  }

internal fun CapabilityStatement.Rest.Resource.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.type)
  this@getAllChildren.profile?.let { add(it) }
  addAll(this@getAllChildren.supportedProfile)
  this@getAllChildren.documentation?.let { add(it) }
  addAll(this@getAllChildren.interaction)
  this@getAllChildren.versioning?.let { add(it) }
  this@getAllChildren.readHistory?.let { add(it) }
  this@getAllChildren.updateCreate?.let { add(it) }
  this@getAllChildren.conditionalCreate?.let { add(it) }
  this@getAllChildren.conditionalRead?.let { add(it) }
  this@getAllChildren.conditionalUpdate?.let { add(it) }
  this@getAllChildren.conditionalDelete?.let { add(it) }
  addAll(this@getAllChildren.referencePolicy)
  addAll(this@getAllChildren.searchInclude)
  addAll(this@getAllChildren.searchRevInclude)
  addAll(this@getAllChildren.searchParam)
  addAll(this@getAllChildren.operation)
}

internal fun CapabilityStatement.Rest.Resource.Interaction.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "code" -> this.code
    "documentation" -> this.documentation
    else -> error("$name is not a valid property name")
  }

internal fun CapabilityStatement.Rest.Resource.Interaction.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "code" -> true
    "documentation" -> true
    else -> false
  }

internal fun CapabilityStatement.Rest.Resource.Interaction.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.code)
  this@getAllChildren.documentation?.let { add(it) }
}

internal fun CapabilityStatement.Rest.Resource.SearchParam.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "name" -> this.name
    "definition" -> this.definition
    "type" -> this.type
    "documentation" -> this.documentation
    else -> error("$name is not a valid property name")
  }

internal fun CapabilityStatement.Rest.Resource.SearchParam.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "name" -> true
    "definition" -> true
    "type" -> true
    "documentation" -> true
    else -> false
  }

internal fun CapabilityStatement.Rest.Resource.SearchParam.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.name)
  this@getAllChildren.definition?.let { add(it) }
  add(this@getAllChildren.type)
  this@getAllChildren.documentation?.let { add(it) }
}

internal fun CapabilityStatement.Rest.Resource.Operation.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "name" -> this.name
    "definition" -> this.definition
    "documentation" -> this.documentation
    else -> error("$name is not a valid property name")
  }

internal fun CapabilityStatement.Rest.Resource.Operation.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "name" -> true
    "definition" -> true
    "documentation" -> true
    else -> false
  }

internal fun CapabilityStatement.Rest.Resource.Operation.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.name)
  add(this@getAllChildren.definition)
  this@getAllChildren.documentation?.let { add(it) }
}

internal fun CapabilityStatement.Rest.Interaction.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "code" -> this.code
    "documentation" -> this.documentation
    else -> error("$name is not a valid property name")
  }

internal fun CapabilityStatement.Rest.Interaction.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "code" -> true
    "documentation" -> true
    else -> false
  }

internal fun CapabilityStatement.Rest.Interaction.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.code)
  this@getAllChildren.documentation?.let { add(it) }
}

internal fun CapabilityStatement.Messaging.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "endpoint" -> this.endpoint
    "reliableCache" -> this.reliableCache
    "documentation" -> this.documentation
    "supportedMessage" -> this.supportedMessage
    else -> error("$name is not a valid property name")
  }

internal fun CapabilityStatement.Messaging.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "endpoint" -> true
    "reliableCache" -> true
    "documentation" -> true
    "supportedMessage" -> true
    else -> false
  }

internal fun CapabilityStatement.Messaging.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.endpoint)
  this@getAllChildren.reliableCache?.let { add(it) }
  this@getAllChildren.documentation?.let { add(it) }
  addAll(this@getAllChildren.supportedMessage)
}

internal fun CapabilityStatement.Messaging.Endpoint.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "protocol" -> this.protocol
    "address" -> this.address
    else -> error("$name is not a valid property name")
  }

internal fun CapabilityStatement.Messaging.Endpoint.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "protocol" -> true
    "address" -> true
    else -> false
  }

internal fun CapabilityStatement.Messaging.Endpoint.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.protocol)
  add(this@getAllChildren.address)
}

internal fun CapabilityStatement.Messaging.SupportedMessage.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "mode" -> this.mode
    "definition" -> this.definition
    else -> error("$name is not a valid property name")
  }

internal fun CapabilityStatement.Messaging.SupportedMessage.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "mode" -> true
    "definition" -> true
    else -> false
  }

internal fun CapabilityStatement.Messaging.SupportedMessage.getAllChildren(): List<Any> =
  buildList {
    this@getAllChildren.id?.let { add(it) }
    addAll(this@getAllChildren.extension)
    addAll(this@getAllChildren.modifierExtension)
    add(this@getAllChildren.mode)
    add(this@getAllChildren.definition)
  }

internal fun CapabilityStatement.Document.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "mode" -> this.mode
    "documentation" -> this.documentation
    "profile" -> this.profile
    else -> error("$name is not a valid property name")
  }

internal fun CapabilityStatement.Document.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "mode" -> true
    "documentation" -> true
    "profile" -> true
    else -> false
  }

internal fun CapabilityStatement.Document.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.mode)
  this@getAllChildren.documentation?.let { add(it) }
  add(this@getAllChildren.profile)
}
