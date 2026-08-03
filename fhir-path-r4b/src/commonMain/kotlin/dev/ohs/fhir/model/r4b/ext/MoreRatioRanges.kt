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

import dev.ohs.fhir.model.r4b.RatioRange
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun RatioRange.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "lowNumerator" -> this.lowNumerator
    "highNumerator" -> this.highNumerator
    "denominator" -> this.denominator
    else -> error("$name is not a valid property name")
  }

internal fun RatioRange.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "lowNumerator" -> true
    "highNumerator" -> true
    "denominator" -> true
    else -> false
  }

internal fun RatioRange.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  this@getAllChildren.lowNumerator?.let { add(it) }
  this@getAllChildren.highNumerator?.let { add(it) }
  this@getAllChildren.denominator?.let { add(it) }
}
