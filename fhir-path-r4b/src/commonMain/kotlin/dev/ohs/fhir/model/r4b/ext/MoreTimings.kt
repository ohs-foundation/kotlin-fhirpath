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

import dev.ohs.fhir.model.r4b.Timing
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun Timing.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "event" -> this.event
    "repeat" -> this.repeat
    "code" -> this.code
    else -> error("$name is not a valid property name")
  }

internal fun Timing.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "event" -> true
    "repeat" -> true
    "code" -> true
    else -> false
  }

internal fun Timing.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.event)
  this@getAllChildren.repeat?.let { add(it) }
  this@getAllChildren.code?.let { add(it) }
}

internal fun Timing.Repeat.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "bounds" -> this.bounds
    "count" -> this.count
    "countMax" -> this.countMax
    "duration" -> this.duration
    "durationMax" -> this.durationMax
    "durationUnit" -> this.durationUnit
    "frequency" -> this.frequency
    "frequencyMax" -> this.frequencyMax
    "period" -> this.period
    "periodMax" -> this.periodMax
    "periodUnit" -> this.periodUnit
    "dayOfWeek" -> this.dayOfWeek
    "timeOfDay" -> this.timeOfDay
    "when" -> this.`when`
    "offset" -> this.offset
    else -> error("$name is not a valid property name")
  }

internal fun Timing.Repeat.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "bounds" -> true
    "count" -> true
    "countMax" -> true
    "duration" -> true
    "durationMax" -> true
    "durationUnit" -> true
    "frequency" -> true
    "frequencyMax" -> true
    "period" -> true
    "periodMax" -> true
    "periodUnit" -> true
    "dayOfWeek" -> true
    "timeOfDay" -> true
    "when" -> true
    "offset" -> true
    else -> false
  }

internal fun Timing.Repeat.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  this@getAllChildren.bounds?.let { add(it) }
  this@getAllChildren.count?.let { add(it) }
  this@getAllChildren.countMax?.let { add(it) }
  this@getAllChildren.duration?.let { add(it) }
  this@getAllChildren.durationMax?.let { add(it) }
  this@getAllChildren.durationUnit?.let { add(it) }
  this@getAllChildren.frequency?.let { add(it) }
  this@getAllChildren.frequencyMax?.let { add(it) }
  this@getAllChildren.period?.let { add(it) }
  this@getAllChildren.periodMax?.let { add(it) }
  this@getAllChildren.periodUnit?.let { add(it) }
  addAll(this@getAllChildren.dayOfWeek)
  addAll(this@getAllChildren.timeOfDay)
  addAll(this@getAllChildren.`when`)
  this@getAllChildren.offset?.let { add(it) }
}
