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

package dev.ohs.fhir.model.r4.ext

import dev.ohs.fhir.model.r4.AuditEvent
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun AuditEvent.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "meta" -> this.meta
    "implicitRules" -> this.implicitRules
    "language" -> this.language
    "text" -> this.text
    "contained" -> this.contained
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "subtype" -> this.subtype
    "action" -> this.action
    "period" -> this.period
    "recorded" -> this.recorded
    "outcome" -> this.outcome
    "outcomeDesc" -> this.outcomeDesc
    "purposeOfEvent" -> this.purposeOfEvent
    "agent" -> this.agent
    "source" -> this.source
    "entity" -> this.entity
    else -> error("$name is not a valid property name")
  }

internal fun AuditEvent.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "meta" -> true
    "implicitRules" -> true
    "language" -> true
    "text" -> true
    "contained" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "subtype" -> true
    "action" -> true
    "period" -> true
    "recorded" -> true
    "outcome" -> true
    "outcomeDesc" -> true
    "purposeOfEvent" -> true
    "agent" -> true
    "source" -> true
    "entity" -> true
    else -> false
  }

internal fun AuditEvent.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.meta?.let { add(it) }
  this@getAllChildren.implicitRules?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.contained)
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.type)
  addAll(this@getAllChildren.subtype)
  this@getAllChildren.action?.let { add(it) }
  this@getAllChildren.period?.let { add(it) }
  add(this@getAllChildren.recorded)
  this@getAllChildren.outcome?.let { add(it) }
  this@getAllChildren.outcomeDesc?.let { add(it) }
  addAll(this@getAllChildren.purposeOfEvent)
  addAll(this@getAllChildren.agent)
  add(this@getAllChildren.source)
  addAll(this@getAllChildren.entity)
}

internal fun AuditEvent.Agent.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "role" -> this.role
    "who" -> this.who
    "altId" -> this.altId
    "name" -> this.name
    "requestor" -> this.requestor
    "location" -> this.location
    "policy" -> this.policy
    "media" -> this.media
    "network" -> this.network
    "purposeOfUse" -> this.purposeOfUse
    else -> error("$name is not a valid property name")
  }

internal fun AuditEvent.Agent.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "role" -> true
    "who" -> true
    "altId" -> true
    "name" -> true
    "requestor" -> true
    "location" -> true
    "policy" -> true
    "media" -> true
    "network" -> true
    "purposeOfUse" -> true
    else -> false
  }

internal fun AuditEvent.Agent.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.type?.let { add(it) }
  addAll(this@getAllChildren.role)
  this@getAllChildren.who?.let { add(it) }
  this@getAllChildren.altId?.let { add(it) }
  this@getAllChildren.name?.let { add(it) }
  add(this@getAllChildren.requestor)
  this@getAllChildren.location?.let { add(it) }
  addAll(this@getAllChildren.policy)
  this@getAllChildren.media?.let { add(it) }
  this@getAllChildren.network?.let { add(it) }
  addAll(this@getAllChildren.purposeOfUse)
}

internal fun AuditEvent.Agent.Network.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "address" -> this.address
    "type" -> this.type
    else -> error("$name is not a valid property name")
  }

internal fun AuditEvent.Agent.Network.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "address" -> true
    "type" -> true
    else -> false
  }

internal fun AuditEvent.Agent.Network.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.address?.let { add(it) }
  this@getAllChildren.type?.let { add(it) }
}

internal fun AuditEvent.Source.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "site" -> this.site
    "observer" -> this.observer
    "type" -> this.type
    else -> error("$name is not a valid property name")
  }

internal fun AuditEvent.Source.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "site" -> true
    "observer" -> true
    "type" -> true
    else -> false
  }

internal fun AuditEvent.Source.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.site?.let { add(it) }
  add(this@getAllChildren.observer)
  addAll(this@getAllChildren.type)
}

internal fun AuditEvent.Entity.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "what" -> this.what
    "type" -> this.type
    "role" -> this.role
    "lifecycle" -> this.lifecycle
    "securityLabel" -> this.securityLabel
    "name" -> this.name
    "description" -> this.description
    "query" -> this.query
    "detail" -> this.detail
    else -> error("$name is not a valid property name")
  }

internal fun AuditEvent.Entity.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "what" -> true
    "type" -> true
    "role" -> true
    "lifecycle" -> true
    "securityLabel" -> true
    "name" -> true
    "description" -> true
    "query" -> true
    "detail" -> true
    else -> false
  }

internal fun AuditEvent.Entity.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.what?.let { add(it) }
  this@getAllChildren.type?.let { add(it) }
  this@getAllChildren.role?.let { add(it) }
  this@getAllChildren.lifecycle?.let { add(it) }
  addAll(this@getAllChildren.securityLabel)
  this@getAllChildren.name?.let { add(it) }
  this@getAllChildren.description?.let { add(it) }
  this@getAllChildren.query?.let { add(it) }
  addAll(this@getAllChildren.detail)
}

internal fun AuditEvent.Entity.Detail.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "value" -> this.`value`
    else -> error("$name is not a valid property name")
  }

internal fun AuditEvent.Entity.Detail.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "value" -> true
    else -> false
  }

internal fun AuditEvent.Entity.Detail.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.type)
  add(this@getAllChildren.`value`)
}
