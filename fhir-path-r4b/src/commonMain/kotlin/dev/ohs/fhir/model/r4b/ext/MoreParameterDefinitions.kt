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

import dev.ohs.fhir.model.r4b.ParameterDefinition
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun ParameterDefinition.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "name" -> this.name
    "use" -> this.use
    "min" -> this.min
    "max" -> this.max
    "documentation" -> this.documentation
    "type" -> this.type
    "profile" -> this.profile
    else -> error("$name is not a valid property name")
  }

internal fun ParameterDefinition.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "name" -> true
    "use" -> true
    "min" -> true
    "max" -> true
    "documentation" -> true
    "type" -> true
    "profile" -> true
    else -> false
  }

internal fun ParameterDefinition.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  this@getAllChildren.name?.let { add(it) }
  add(this@getAllChildren.use)
  this@getAllChildren.min?.let { add(it) }
  this@getAllChildren.max?.let { add(it) }
  this@getAllChildren.documentation?.let { add(it) }
  add(this@getAllChildren.type)
  this@getAllChildren.profile?.let { add(it) }
}
