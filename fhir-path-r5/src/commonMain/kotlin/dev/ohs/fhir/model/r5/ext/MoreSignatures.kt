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

import dev.ohs.fhir.model.r5.Signature
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun Signature.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "type" -> this.type
    "when" -> this.`when`
    "who" -> this.who
    "onBehalfOf" -> this.onBehalfOf
    "targetFormat" -> this.targetFormat
    "sigFormat" -> this.sigFormat
    "data" -> this.`data`
    else -> error("$name is not a valid property name")
  }

internal fun Signature.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "type" -> true
    "when" -> true
    "who" -> true
    "onBehalfOf" -> true
    "targetFormat" -> true
    "sigFormat" -> true
    "data" -> true
    else -> false
  }

internal fun Signature.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.type)
  this@getAllChildren.`when`?.let { add(it) }
  this@getAllChildren.who?.let { add(it) }
  this@getAllChildren.onBehalfOf?.let { add(it) }
  this@getAllChildren.targetFormat?.let { add(it) }
  this@getAllChildren.sigFormat?.let { add(it) }
  this@getAllChildren.`data`?.let { add(it) }
}
