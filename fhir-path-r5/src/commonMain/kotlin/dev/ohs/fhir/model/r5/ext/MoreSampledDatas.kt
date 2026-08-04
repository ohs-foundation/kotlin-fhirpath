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

import dev.ohs.fhir.model.r5.SampledData
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun SampledData.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "origin" -> this.origin
    "interval" -> this.interval
    "intervalUnit" -> this.intervalUnit
    "factor" -> this.factor
    "lowerLimit" -> this.lowerLimit
    "upperLimit" -> this.upperLimit
    "dimensions" -> this.dimensions
    "codeMap" -> this.codeMap
    "offsets" -> this.offsets
    "data" -> this.`data`
    else -> error("$name is not a valid property name")
  }

internal fun SampledData.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "origin" -> true
    "interval" -> true
    "intervalUnit" -> true
    "factor" -> true
    "lowerLimit" -> true
    "upperLimit" -> true
    "dimensions" -> true
    "codeMap" -> true
    "offsets" -> true
    "data" -> true
    else -> false
  }

internal fun SampledData.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  add(this@getAllChildren.origin)
  this@getAllChildren.interval?.let { add(it) }
  add(this@getAllChildren.intervalUnit)
  this@getAllChildren.factor?.let { add(it) }
  this@getAllChildren.lowerLimit?.let { add(it) }
  this@getAllChildren.upperLimit?.let { add(it) }
  add(this@getAllChildren.dimensions)
  this@getAllChildren.codeMap?.let { add(it) }
  this@getAllChildren.offsets?.let { add(it) }
  this@getAllChildren.`data`?.let { add(it) }
}
