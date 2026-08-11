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

import dev.ohs.fhir.model.r5.Permission
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun Permission.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "meta" -> this.meta
    "implicitRules" -> this.implicitRules
    "language" -> this.language
    "text" -> this.text
    "contained" -> this.contained
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "status" -> this.status
    "asserter" -> this.asserter
    "date" -> this.date
    "validity" -> this.validity
    "justification" -> this.justification
    "combining" -> this.combining
    "rule" -> this.rule
    else -> error("$name is not a valid property name")
  }

internal fun Permission.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "meta" -> true
    "implicitRules" -> true
    "language" -> true
    "text" -> true
    "contained" -> true
    "extension" -> true
    "modifierExtension" -> true
    "status" -> true
    "asserter" -> true
    "date" -> true
    "validity" -> true
    "justification" -> true
    "combining" -> true
    "rule" -> true
    else -> false
  }

internal fun Permission.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.meta?.let { add(it) }
  this@getAllChildren.implicitRules?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.contained)
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.status)
  this@getAllChildren.asserter?.let { add(it) }
  addAll(this@getAllChildren.date)
  this@getAllChildren.validity?.let { add(it) }
  this@getAllChildren.justification?.let { add(it) }
  add(this@getAllChildren.combining)
  addAll(this@getAllChildren.rule)
}

internal fun Permission.Justification.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "basis" -> this.basis
    "evidence" -> this.evidence
    else -> error("$name is not a valid property name")
  }

internal fun Permission.Justification.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "basis" -> true
    "evidence" -> true
    else -> false
  }

internal fun Permission.Justification.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.basis)
  addAll(this@getAllChildren.evidence)
}

internal fun Permission.Rule.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "data" -> this.`data`
    "activity" -> this.activity
    "limit" -> this.limit
    else -> error("$name is not a valid property name")
  }

internal fun Permission.Rule.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "data" -> true
    "activity" -> true
    "limit" -> true
    else -> false
  }

internal fun Permission.Rule.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.type?.let { add(it) }
  addAll(this@getAllChildren.`data`)
  addAll(this@getAllChildren.activity)
  addAll(this@getAllChildren.limit)
}

internal fun Permission.Rule.Data.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "resource" -> this.resource
    "security" -> this.security
    "period" -> this.period
    "expression" -> this.expression
    else -> error("$name is not a valid property name")
  }

internal fun Permission.Rule.Data.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "resource" -> true
    "security" -> true
    "period" -> true
    "expression" -> true
    else -> false
  }

internal fun Permission.Rule.Data.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.resource)
  addAll(this@getAllChildren.security)
  addAll(this@getAllChildren.period)
  this@getAllChildren.expression?.let { add(it) }
}

internal fun Permission.Rule.Data.Resource.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "meaning" -> this.meaning
    "reference" -> this.reference
    else -> error("$name is not a valid property name")
  }

internal fun Permission.Rule.Data.Resource.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "meaning" -> true
    "reference" -> true
    else -> false
  }

internal fun Permission.Rule.Data.Resource.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.meaning)
  add(this@getAllChildren.reference)
}

internal fun Permission.Rule.Activity.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "actor" -> this.actor
    "action" -> this.action
    "purpose" -> this.purpose
    else -> error("$name is not a valid property name")
  }

internal fun Permission.Rule.Activity.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "actor" -> true
    "action" -> true
    "purpose" -> true
    else -> false
  }

internal fun Permission.Rule.Activity.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.actor)
  addAll(this@getAllChildren.action)
  addAll(this@getAllChildren.purpose)
}
