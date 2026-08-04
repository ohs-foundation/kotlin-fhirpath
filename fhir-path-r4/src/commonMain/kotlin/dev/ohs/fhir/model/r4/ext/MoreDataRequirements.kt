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

import dev.ohs.fhir.model.r4.DataRequirement
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun DataRequirement.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "type" -> this.type
    "profile" -> this.profile
    "subject" -> this.subject
    "mustSupport" -> this.mustSupport
    "codeFilter" -> this.codeFilter
    "dateFilter" -> this.dateFilter
    "limit" -> this.limit
    "sort" -> this.sort
    else -> error("$name is not a valid property name")
  }

internal fun DataRequirement.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "type" -> true
    "profile" -> true
    "subject" -> true
    "mustSupport" -> true
    "codeFilter" -> true
    "dateFilter" -> true
    "limit" -> true
    "sort" -> true
    else -> false
  }

internal fun DataRequirement.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  add(this@getAllChildren.type)
  addAll(this@getAllChildren.profile)
  this@getAllChildren.subject?.let { add(it) }
  addAll(this@getAllChildren.mustSupport)
  addAll(this@getAllChildren.codeFilter)
  addAll(this@getAllChildren.dateFilter)
  this@getAllChildren.limit?.let { add(it) }
  addAll(this@getAllChildren.sort)
}

internal fun DataRequirement.CodeFilter.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "path" -> this.path
    "searchParam" -> this.searchParam
    "valueSet" -> this.valueSet
    "code" -> this.code
    else -> error("$name is not a valid property name")
  }

internal fun DataRequirement.CodeFilter.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "path" -> true
    "searchParam" -> true
    "valueSet" -> true
    "code" -> true
    else -> false
  }

internal fun DataRequirement.CodeFilter.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  this@getAllChildren.path?.let { add(it) }
  this@getAllChildren.searchParam?.let { add(it) }
  this@getAllChildren.valueSet?.let { add(it) }
  addAll(this@getAllChildren.code)
}

internal fun DataRequirement.DateFilter.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "path" -> this.path
    "searchParam" -> this.searchParam
    "value" -> this.`value`
    else -> error("$name is not a valid property name")
  }

internal fun DataRequirement.DateFilter.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "path" -> true
    "searchParam" -> true
    "value" -> true
    else -> false
  }

internal fun DataRequirement.DateFilter.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  this@getAllChildren.path?.let { add(it) }
  this@getAllChildren.searchParam?.let { add(it) }
  this@getAllChildren.`value`?.let { add(it) }
}

internal fun DataRequirement.Sort.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "path" -> this.path
    "direction" -> this.direction
    else -> error("$name is not a valid property name")
  }

internal fun DataRequirement.Sort.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "path" -> true
    "direction" -> true
    else -> false
  }

internal fun DataRequirement.Sort.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  add(this@getAllChildren.path)
  add(this@getAllChildren.direction)
}
