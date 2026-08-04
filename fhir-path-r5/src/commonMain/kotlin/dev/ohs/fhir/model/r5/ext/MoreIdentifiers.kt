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

import dev.ohs.fhir.model.r5.Identifier
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun Identifier.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "use" -> this.use
    "type" -> this.type
    "system" -> this.system
    "value" -> this.`value`
    "period" -> this.period
    "assigner" -> this.assigner
    else -> error("$name is not a valid property name")
  }

internal fun Identifier.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "use" -> true
    "type" -> true
    "system" -> true
    "value" -> true
    "period" -> true
    "assigner" -> true
    else -> false
  }

internal fun Identifier.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  this@getAllChildren.use?.let { add(it) }
  this@getAllChildren.type?.let { add(it) }
  this@getAllChildren.system?.let { add(it) }
  this@getAllChildren.`value`?.let { add(it) }
  this@getAllChildren.period?.let { add(it) }
  this@getAllChildren.assigner?.let { add(it) }
}
