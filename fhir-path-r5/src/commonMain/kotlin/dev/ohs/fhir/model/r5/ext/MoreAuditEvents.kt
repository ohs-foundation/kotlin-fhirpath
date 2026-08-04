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

import dev.ohs.fhir.model.r5.AuditEvent
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
    "category" -> this.category
    "code" -> this.code
    "action" -> this.action
    "severity" -> this.severity
    "occurred" -> this.occurred
    "recorded" -> this.recorded
    "outcome" -> this.outcome
    "authorization" -> this.authorization
    "basedOn" -> this.basedOn
    "patient" -> this.patient
    "encounter" -> this.encounter
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
    "category" -> true
    "code" -> true
    "action" -> true
    "severity" -> true
    "occurred" -> true
    "recorded" -> true
    "outcome" -> true
    "authorization" -> true
    "basedOn" -> true
    "patient" -> true
    "encounter" -> true
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
  addAll(this@getAllChildren.category)
  add(this@getAllChildren.code)
  this@getAllChildren.action?.let { add(it) }
  this@getAllChildren.severity?.let { add(it) }
  this@getAllChildren.occurred?.let { add(it) }
  add(this@getAllChildren.recorded)
  this@getAllChildren.outcome?.let { add(it) }
  addAll(this@getAllChildren.authorization)
  addAll(this@getAllChildren.basedOn)
  this@getAllChildren.patient?.let { add(it) }
  this@getAllChildren.encounter?.let { add(it) }
  addAll(this@getAllChildren.agent)
  add(this@getAllChildren.source)
  addAll(this@getAllChildren.entity)
}

internal fun AuditEvent.Outcome.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "code" -> this.code
    "detail" -> this.detail
    else -> error("$name is not a valid property name")
  }

internal fun AuditEvent.Outcome.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "code" -> true
    "detail" -> true
    else -> false
  }

internal fun AuditEvent.Outcome.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.code)
  addAll(this@getAllChildren.detail)
}

internal fun AuditEvent.Agent.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "role" -> this.role
    "who" -> this.who
    "requestor" -> this.requestor
    "location" -> this.location
    "policy" -> this.policy
    "network" -> this.network
    "authorization" -> this.authorization
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
    "requestor" -> true
    "location" -> true
    "policy" -> true
    "network" -> true
    "authorization" -> true
    else -> false
  }

internal fun AuditEvent.Agent.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.type?.let { add(it) }
  addAll(this@getAllChildren.role)
  add(this@getAllChildren.who)
  this@getAllChildren.requestor?.let { add(it) }
  this@getAllChildren.location?.let { add(it) }
  addAll(this@getAllChildren.policy)
  this@getAllChildren.network?.let { add(it) }
  addAll(this@getAllChildren.authorization)
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
    "role" -> this.role
    "securityLabel" -> this.securityLabel
    "query" -> this.query
    "detail" -> this.detail
    "agent" -> this.agent
    else -> error("$name is not a valid property name")
  }

internal fun AuditEvent.Entity.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "what" -> true
    "role" -> true
    "securityLabel" -> true
    "query" -> true
    "detail" -> true
    "agent" -> true
    else -> false
  }

internal fun AuditEvent.Entity.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.what?.let { add(it) }
  this@getAllChildren.role?.let { add(it) }
  addAll(this@getAllChildren.securityLabel)
  this@getAllChildren.query?.let { add(it) }
  addAll(this@getAllChildren.detail)
  addAll(this@getAllChildren.agent)
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
