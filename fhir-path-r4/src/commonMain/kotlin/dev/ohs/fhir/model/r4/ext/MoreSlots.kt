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

import dev.ohs.fhir.model.r4.Slot
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun Slot.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "meta" -> this.meta
    "implicitRules" -> this.implicitRules
    "language" -> this.language
    "text" -> this.text
    "contained" -> this.contained
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "identifier" -> this.identifier
    "serviceCategory" -> this.serviceCategory
    "serviceType" -> this.serviceType
    "specialty" -> this.specialty
    "appointmentType" -> this.appointmentType
    "schedule" -> this.schedule
    "status" -> this.status
    "start" -> this.start
    "end" -> this.end
    "overbooked" -> this.overbooked
    "comment" -> this.comment
    else -> error("$name is not a valid property name")
  }

internal fun Slot.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "meta" -> true
    "implicitRules" -> true
    "language" -> true
    "text" -> true
    "contained" -> true
    "extension" -> true
    "modifierExtension" -> true
    "identifier" -> true
    "serviceCategory" -> true
    "serviceType" -> true
    "specialty" -> true
    "appointmentType" -> true
    "schedule" -> true
    "status" -> true
    "start" -> true
    "end" -> true
    "overbooked" -> true
    "comment" -> true
    else -> false
  }

internal fun Slot.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.meta?.let { add(it) }
  this@getAllChildren.implicitRules?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.contained)
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.identifier)
  addAll(this@getAllChildren.serviceCategory)
  addAll(this@getAllChildren.serviceType)
  addAll(this@getAllChildren.specialty)
  this@getAllChildren.appointmentType?.let { add(it) }
  add(this@getAllChildren.schedule)
  add(this@getAllChildren.status)
  add(this@getAllChildren.start)
  add(this@getAllChildren.end)
  this@getAllChildren.overbooked?.let { add(it) }
  this@getAllChildren.comment?.let { add(it) }
}
