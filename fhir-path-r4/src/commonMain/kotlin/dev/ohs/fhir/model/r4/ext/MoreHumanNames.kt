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

import dev.ohs.fhir.model.r4.HumanName
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun HumanName.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "use" -> this.use
    "text" -> this.text
    "family" -> this.family
    "given" -> this.given
    "prefix" -> this.prefix
    "suffix" -> this.suffix
    "period" -> this.period
    else -> error("$name is not a valid property name")
  }

internal fun HumanName.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "use" -> true
    "text" -> true
    "family" -> true
    "given" -> true
    "prefix" -> true
    "suffix" -> true
    "period" -> true
    else -> false
  }

internal fun HumanName.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  this@getAllChildren.use?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  this@getAllChildren.family?.let { add(it) }
  addAll(this@getAllChildren.given)
  addAll(this@getAllChildren.prefix)
  addAll(this@getAllChildren.suffix)
  this@getAllChildren.period?.let { add(it) }
}
