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

import dev.ohs.fhir.model.r5.SupplyDelivery
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun SupplyDelivery.getProperty(name: String): Any? =
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
    "basedOn" -> this.basedOn
    "partOf" -> this.partOf
    "status" -> this.status
    "patient" -> this.patient
    "type" -> this.type
    "suppliedItem" -> this.suppliedItem
    "occurrence" -> this.occurrence
    "supplier" -> this.supplier
    "destination" -> this.destination
    "receiver" -> this.`receiver`
    else -> error("$name is not a valid property name")
  }

internal fun SupplyDelivery.hasProperty(name: String): Boolean =
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
    "basedOn" -> true
    "partOf" -> true
    "status" -> true
    "patient" -> true
    "type" -> true
    "suppliedItem" -> true
    "occurrence" -> true
    "supplier" -> true
    "destination" -> true
    "receiver" -> true
    else -> false
  }

internal fun SupplyDelivery.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.meta?.let { add(it) }
  this@getAllChildren.implicitRules?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.contained)
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.identifier)
  addAll(this@getAllChildren.basedOn)
  addAll(this@getAllChildren.partOf)
  this@getAllChildren.status?.let { add(it) }
  this@getAllChildren.patient?.let { add(it) }
  this@getAllChildren.type?.let { add(it) }
  addAll(this@getAllChildren.suppliedItem)
  this@getAllChildren.occurrence?.let { add(it) }
  this@getAllChildren.supplier?.let { add(it) }
  this@getAllChildren.destination?.let { add(it) }
  addAll(this@getAllChildren.`receiver`)
}

internal fun SupplyDelivery.SuppliedItem.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "quantity" -> this.quantity
    "item" -> this.item
    else -> error("$name is not a valid property name")
  }

internal fun SupplyDelivery.SuppliedItem.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "quantity" -> true
    "item" -> true
    else -> false
  }

internal fun SupplyDelivery.SuppliedItem.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.quantity?.let { add(it) }
  this@getAllChildren.item?.let { add(it) }
}
