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

import dev.ohs.fhir.model.r4b.Subscription
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun Subscription.getProperty(name: String): Any? =
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
    "contact" -> this.contact
    "end" -> this.end
    "reason" -> this.reason
    "criteria" -> this.criteria
    "error" -> this.error
    "channel" -> this.channel
    else -> error("$name is not a valid property name")
  }

internal fun Subscription.hasProperty(name: String): Boolean =
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
    "contact" -> true
    "end" -> true
    "reason" -> true
    "criteria" -> true
    "error" -> true
    "channel" -> true
    else -> false
  }

internal fun Subscription.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.meta?.let { add(it) }
  this@getAllChildren.implicitRules?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.contained)
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.status)
  addAll(this@getAllChildren.contact)
  this@getAllChildren.end?.let { add(it) }
  add(this@getAllChildren.reason)
  add(this@getAllChildren.criteria)
  this@getAllChildren.error?.let { add(it) }
  add(this@getAllChildren.channel)
}

internal fun Subscription.Channel.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "endpoint" -> this.endpoint
    "payload" -> this.payload
    "header" -> this.`header`
    else -> error("$name is not a valid property name")
  }

internal fun Subscription.Channel.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "endpoint" -> true
    "payload" -> true
    "header" -> true
    else -> false
  }

internal fun Subscription.Channel.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.type)
  this@getAllChildren.endpoint?.let { add(it) }
  this@getAllChildren.payload?.let { add(it) }
  addAll(this@getAllChildren.`header`)
}
