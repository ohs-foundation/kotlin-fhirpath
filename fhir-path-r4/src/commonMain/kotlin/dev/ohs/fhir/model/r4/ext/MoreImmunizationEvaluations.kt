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

import dev.ohs.fhir.model.r4.ImmunizationEvaluation
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun ImmunizationEvaluation.getProperty(name: String): Any? =
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
    "status" -> this.status
    "patient" -> this.patient
    "date" -> this.date
    "authority" -> this.authority
    "targetDisease" -> this.targetDisease
    "immunizationEvent" -> this.immunizationEvent
    "doseStatus" -> this.doseStatus
    "doseStatusReason" -> this.doseStatusReason
    "description" -> this.description
    "series" -> this.series
    "doseNumber" -> this.doseNumber
    "seriesDoses" -> this.seriesDoses
    else -> error("$name is not a valid property name")
  }

internal fun ImmunizationEvaluation.hasProperty(name: String): Boolean =
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
    "status" -> true
    "patient" -> true
    "date" -> true
    "authority" -> true
    "targetDisease" -> true
    "immunizationEvent" -> true
    "doseStatus" -> true
    "doseStatusReason" -> true
    "description" -> true
    "series" -> true
    "doseNumber" -> true
    "seriesDoses" -> true
    else -> false
  }

internal fun ImmunizationEvaluation.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.meta?.let { add(it) }
  this@getAllChildren.implicitRules?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.contained)
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.identifier)
  add(this@getAllChildren.status)
  add(this@getAllChildren.patient)
  this@getAllChildren.date?.let { add(it) }
  this@getAllChildren.authority?.let { add(it) }
  add(this@getAllChildren.targetDisease)
  add(this@getAllChildren.immunizationEvent)
  add(this@getAllChildren.doseStatus)
  addAll(this@getAllChildren.doseStatusReason)
  this@getAllChildren.description?.let { add(it) }
  this@getAllChildren.series?.let { add(it) }
  this@getAllChildren.doseNumber?.let { add(it) }
  this@getAllChildren.seriesDoses?.let { add(it) }
}
