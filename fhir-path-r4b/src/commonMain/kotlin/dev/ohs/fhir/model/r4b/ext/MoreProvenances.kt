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

import dev.ohs.fhir.model.r4b.Provenance
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun Provenance.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "meta" -> this.meta
    "implicitRules" -> this.implicitRules
    "language" -> this.language
    "text" -> this.text
    "contained" -> this.contained
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "target" -> this.target
    "occurred" -> this.occurred
    "recorded" -> this.recorded
    "policy" -> this.policy
    "location" -> this.location
    "reason" -> this.reason
    "activity" -> this.activity
    "agent" -> this.agent
    "entity" -> this.entity
    "signature" -> this.signature
    else -> error("$name is not a valid property name")
  }

internal fun Provenance.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "meta" -> true
    "implicitRules" -> true
    "language" -> true
    "text" -> true
    "contained" -> true
    "extension" -> true
    "modifierExtension" -> true
    "target" -> true
    "occurred" -> true
    "recorded" -> true
    "policy" -> true
    "location" -> true
    "reason" -> true
    "activity" -> true
    "agent" -> true
    "entity" -> true
    "signature" -> true
    else -> false
  }

internal fun Provenance.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.meta?.let { add(it) }
  this@getAllChildren.implicitRules?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.contained)
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.target)
  this@getAllChildren.occurred?.let { add(it) }
  add(this@getAllChildren.recorded)
  addAll(this@getAllChildren.policy)
  this@getAllChildren.location?.let { add(it) }
  addAll(this@getAllChildren.reason)
  this@getAllChildren.activity?.let { add(it) }
  addAll(this@getAllChildren.agent)
  addAll(this@getAllChildren.entity)
  addAll(this@getAllChildren.signature)
}

internal fun Provenance.Agent.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "role" -> this.role
    "who" -> this.who
    "onBehalfOf" -> this.onBehalfOf
    else -> error("$name is not a valid property name")
  }

internal fun Provenance.Agent.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "role" -> true
    "who" -> true
    "onBehalfOf" -> true
    else -> false
  }

internal fun Provenance.Agent.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.type?.let { add(it) }
  addAll(this@getAllChildren.role)
  add(this@getAllChildren.who)
  this@getAllChildren.onBehalfOf?.let { add(it) }
}

internal fun Provenance.Entity.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "role" -> this.role
    "what" -> this.what
    "agent" -> this.agent
    else -> error("$name is not a valid property name")
  }

internal fun Provenance.Entity.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "role" -> true
    "what" -> true
    "agent" -> true
    else -> false
  }

internal fun Provenance.Entity.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.role)
  add(this@getAllChildren.what)
  addAll(this@getAllChildren.agent)
}
