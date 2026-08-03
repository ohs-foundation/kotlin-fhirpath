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

import dev.ohs.fhir.model.r4.Goal
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun Goal.getProperty(name: String): Any? =
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
    "lifecycleStatus" -> this.lifecycleStatus
    "achievementStatus" -> this.achievementStatus
    "category" -> this.category
    "priority" -> this.priority
    "description" -> this.description
    "subject" -> this.subject
    "start" -> this.start
    "target" -> this.target
    "statusDate" -> this.statusDate
    "statusReason" -> this.statusReason
    "expressedBy" -> this.expressedBy
    "addresses" -> this.addresses
    "note" -> this.note
    "outcomeCode" -> this.outcomeCode
    "outcomeReference" -> this.outcomeReference
    else -> error("$name is not a valid property name")
  }

internal fun Goal.hasProperty(name: String): Boolean =
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
    "lifecycleStatus" -> true
    "achievementStatus" -> true
    "category" -> true
    "priority" -> true
    "description" -> true
    "subject" -> true
    "start" -> true
    "target" -> true
    "statusDate" -> true
    "statusReason" -> true
    "expressedBy" -> true
    "addresses" -> true
    "note" -> true
    "outcomeCode" -> true
    "outcomeReference" -> true
    else -> false
  }

internal fun Goal.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.meta?.let { add(it) }
  this@getAllChildren.implicitRules?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.contained)
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.identifier)
  add(this@getAllChildren.lifecycleStatus)
  this@getAllChildren.achievementStatus?.let { add(it) }
  addAll(this@getAllChildren.category)
  this@getAllChildren.priority?.let { add(it) }
  add(this@getAllChildren.description)
  add(this@getAllChildren.subject)
  this@getAllChildren.start?.let { add(it) }
  addAll(this@getAllChildren.target)
  this@getAllChildren.statusDate?.let { add(it) }
  this@getAllChildren.statusReason?.let { add(it) }
  this@getAllChildren.expressedBy?.let { add(it) }
  addAll(this@getAllChildren.addresses)
  addAll(this@getAllChildren.note)
  addAll(this@getAllChildren.outcomeCode)
  addAll(this@getAllChildren.outcomeReference)
}

internal fun Goal.Target.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "measure" -> this.measure
    "detail" -> this.detail
    "due" -> this.due
    else -> error("$name is not a valid property name")
  }

internal fun Goal.Target.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "measure" -> true
    "detail" -> true
    "due" -> true
    else -> false
  }

internal fun Goal.Target.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.measure?.let { add(it) }
  this@getAllChildren.detail?.let { add(it) }
  this@getAllChildren.due?.let { add(it) }
}
