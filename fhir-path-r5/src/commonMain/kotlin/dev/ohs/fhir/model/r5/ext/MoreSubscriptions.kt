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

import dev.ohs.fhir.model.r5.Subscription
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
    "identifier" -> this.identifier
    "name" -> this.name
    "status" -> this.status
    "topic" -> this.topic
    "contact" -> this.contact
    "end" -> this.end
    "managingEntity" -> this.managingEntity
    "reason" -> this.reason
    "filterBy" -> this.filterBy
    "channelType" -> this.channelType
    "endpoint" -> this.endpoint
    "parameter" -> this.parameter
    "heartbeatPeriod" -> this.heartbeatPeriod
    "timeout" -> this.timeout
    "contentType" -> this.contentType
    "content" -> this.content
    "maxCount" -> this.maxCount
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
    "identifier" -> true
    "name" -> true
    "status" -> true
    "topic" -> true
    "contact" -> true
    "end" -> true
    "managingEntity" -> true
    "reason" -> true
    "filterBy" -> true
    "channelType" -> true
    "endpoint" -> true
    "parameter" -> true
    "heartbeatPeriod" -> true
    "timeout" -> true
    "contentType" -> true
    "content" -> true
    "maxCount" -> true
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
  addAll(this@getAllChildren.identifier)
  this@getAllChildren.name?.let { add(it) }
  add(this@getAllChildren.status)
  add(this@getAllChildren.topic)
  addAll(this@getAllChildren.contact)
  this@getAllChildren.end?.let { add(it) }
  this@getAllChildren.managingEntity?.let { add(it) }
  this@getAllChildren.reason?.let { add(it) }
  addAll(this@getAllChildren.filterBy)
  add(this@getAllChildren.channelType)
  this@getAllChildren.endpoint?.let { add(it) }
  addAll(this@getAllChildren.parameter)
  this@getAllChildren.heartbeatPeriod?.let { add(it) }
  this@getAllChildren.timeout?.let { add(it) }
  this@getAllChildren.contentType?.let { add(it) }
  this@getAllChildren.content?.let { add(it) }
  this@getAllChildren.maxCount?.let { add(it) }
}

internal fun Subscription.FilterBy.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "resourceType" -> this.resourceType
    "filterParameter" -> this.filterParameter
    "comparator" -> this.comparator
    "modifier" -> this.modifier
    "value" -> this.`value`
    else -> error("$name is not a valid property name")
  }

internal fun Subscription.FilterBy.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "resourceType" -> true
    "filterParameter" -> true
    "comparator" -> true
    "modifier" -> true
    "value" -> true
    else -> false
  }

internal fun Subscription.FilterBy.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.resourceType?.let { add(it) }
  add(this@getAllChildren.filterParameter)
  this@getAllChildren.comparator?.let { add(it) }
  this@getAllChildren.modifier?.let { add(it) }
  add(this@getAllChildren.`value`)
}

internal fun Subscription.Parameter.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "name" -> this.name
    "value" -> this.`value`
    else -> error("$name is not a valid property name")
  }

internal fun Subscription.Parameter.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "name" -> true
    "value" -> true
    else -> false
  }

internal fun Subscription.Parameter.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.name)
  add(this@getAllChildren.`value`)
}
