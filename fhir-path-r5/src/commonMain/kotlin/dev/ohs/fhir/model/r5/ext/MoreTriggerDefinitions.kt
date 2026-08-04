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

import dev.ohs.fhir.model.r5.TriggerDefinition
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun TriggerDefinition.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "type" -> this.type
    "name" -> this.name
    "code" -> this.code
    "subscriptionTopic" -> this.subscriptionTopic
    "timing" -> this.timing
    "data" -> this.`data`
    "condition" -> this.condition
    else -> error("$name is not a valid property name")
  }

internal fun TriggerDefinition.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "type" -> true
    "name" -> true
    "code" -> true
    "subscriptionTopic" -> true
    "timing" -> true
    "data" -> true
    "condition" -> true
    else -> false
  }

internal fun TriggerDefinition.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  add(this@getAllChildren.type)
  this@getAllChildren.name?.let { add(it) }
  this@getAllChildren.code?.let { add(it) }
  this@getAllChildren.subscriptionTopic?.let { add(it) }
  this@getAllChildren.timing?.let { add(it) }
  addAll(this@getAllChildren.`data`)
  this@getAllChildren.condition?.let { add(it) }
}
