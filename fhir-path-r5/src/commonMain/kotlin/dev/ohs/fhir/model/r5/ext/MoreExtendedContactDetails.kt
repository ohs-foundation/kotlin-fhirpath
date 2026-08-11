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

import dev.ohs.fhir.model.r5.ExtendedContactDetail
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun ExtendedContactDetail.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "purpose" -> this.purpose
    "name" -> this.name
    "telecom" -> this.telecom
    "address" -> this.address
    "organization" -> this.organization
    "period" -> this.period
    else -> error("$name is not a valid property name")
  }

internal fun ExtendedContactDetail.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "purpose" -> true
    "name" -> true
    "telecom" -> true
    "address" -> true
    "organization" -> true
    "period" -> true
    else -> false
  }

internal fun ExtendedContactDetail.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  this@getAllChildren.purpose?.let { add(it) }
  addAll(this@getAllChildren.name)
  addAll(this@getAllChildren.telecom)
  this@getAllChildren.address?.let { add(it) }
  this@getAllChildren.organization?.let { add(it) }
  this@getAllChildren.period?.let { add(it) }
}
