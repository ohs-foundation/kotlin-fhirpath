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

import dev.ohs.fhir.model.r5.InventoryReport
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun InventoryReport.getProperty(name: String): Any? =
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
    "countType" -> this.countType
    "operationType" -> this.operationType
    "operationTypeReason" -> this.operationTypeReason
    "reportedDateTime" -> this.reportedDateTime
    "reporter" -> this.reporter
    "reportingPeriod" -> this.reportingPeriod
    "inventoryListing" -> this.inventoryListing
    "note" -> this.note
    else -> error("$name is not a valid property name")
  }

internal fun InventoryReport.hasProperty(name: String): Boolean =
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
    "countType" -> true
    "operationType" -> true
    "operationTypeReason" -> true
    "reportedDateTime" -> true
    "reporter" -> true
    "reportingPeriod" -> true
    "inventoryListing" -> true
    "note" -> true
    else -> false
  }

internal fun InventoryReport.getAllChildren(): List<Any> = buildList {
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
  add(this@getAllChildren.countType)
  this@getAllChildren.operationType?.let { add(it) }
  this@getAllChildren.operationTypeReason?.let { add(it) }
  add(this@getAllChildren.reportedDateTime)
  this@getAllChildren.reporter?.let { add(it) }
  this@getAllChildren.reportingPeriod?.let { add(it) }
  addAll(this@getAllChildren.inventoryListing)
  addAll(this@getAllChildren.note)
}

internal fun InventoryReport.InventoryListing.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "location" -> this.location
    "itemStatus" -> this.itemStatus
    "countingDateTime" -> this.countingDateTime
    "item" -> this.item
    else -> error("$name is not a valid property name")
  }

internal fun InventoryReport.InventoryListing.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "location" -> true
    "itemStatus" -> true
    "countingDateTime" -> true
    "item" -> true
    else -> false
  }

internal fun InventoryReport.InventoryListing.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.location?.let { add(it) }
  this@getAllChildren.itemStatus?.let { add(it) }
  this@getAllChildren.countingDateTime?.let { add(it) }
  addAll(this@getAllChildren.item)
}

internal fun InventoryReport.InventoryListing.Item.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "category" -> this.category
    "quantity" -> this.quantity
    "item" -> this.item
    else -> error("$name is not a valid property name")
  }

internal fun InventoryReport.InventoryListing.Item.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "category" -> true
    "quantity" -> true
    "item" -> true
    else -> false
  }

internal fun InventoryReport.InventoryListing.Item.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.category?.let { add(it) }
  add(this@getAllChildren.quantity)
  add(this@getAllChildren.item)
}
