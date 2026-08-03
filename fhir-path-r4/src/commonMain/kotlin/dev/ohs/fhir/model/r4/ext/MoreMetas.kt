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

import dev.ohs.fhir.model.r4.Meta
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun Meta.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "versionId" -> this.versionId
    "lastUpdated" -> this.lastUpdated
    "source" -> this.source
    "profile" -> this.profile
    "security" -> this.security
    "tag" -> this.tag
    else -> error("$name is not a valid property name")
  }

internal fun Meta.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "versionId" -> true
    "lastUpdated" -> true
    "source" -> true
    "profile" -> true
    "security" -> true
    "tag" -> true
    else -> false
  }

internal fun Meta.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  this@getAllChildren.versionId?.let { add(it) }
  this@getAllChildren.lastUpdated?.let { add(it) }
  this@getAllChildren.source?.let { add(it) }
  addAll(this@getAllChildren.profile)
  addAll(this@getAllChildren.security)
  addAll(this@getAllChildren.tag)
}
