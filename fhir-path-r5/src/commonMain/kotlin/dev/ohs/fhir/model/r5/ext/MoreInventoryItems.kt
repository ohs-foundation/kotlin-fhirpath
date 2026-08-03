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

import dev.ohs.fhir.model.r5.InventoryItem
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun InventoryItem.getProperty(name: String): Any? =
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
    "category" -> this.category
    "code" -> this.code
    "name" -> this.name
    "responsibleOrganization" -> this.responsibleOrganization
    "description" -> this.description
    "inventoryStatus" -> this.inventoryStatus
    "baseUnit" -> this.baseUnit
    "netContent" -> this.netContent
    "association" -> this.association
    "characteristic" -> this.characteristic
    "instance" -> this.instance
    "productReference" -> this.productReference
    else -> error("$name is not a valid property name")
  }

internal fun InventoryItem.hasProperty(name: String): Boolean =
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
    "category" -> true
    "code" -> true
    "name" -> true
    "responsibleOrganization" -> true
    "description" -> true
    "inventoryStatus" -> true
    "baseUnit" -> true
    "netContent" -> true
    "association" -> true
    "characteristic" -> true
    "instance" -> true
    "productReference" -> true
    else -> false
  }

internal fun InventoryItem.getAllChildren(): List<Any> = buildList {
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
  addAll(this@getAllChildren.category)
  addAll(this@getAllChildren.code)
  addAll(this@getAllChildren.name)
  addAll(this@getAllChildren.responsibleOrganization)
  this@getAllChildren.description?.let { add(it) }
  addAll(this@getAllChildren.inventoryStatus)
  this@getAllChildren.baseUnit?.let { add(it) }
  this@getAllChildren.netContent?.let { add(it) }
  addAll(this@getAllChildren.association)
  addAll(this@getAllChildren.characteristic)
  this@getAllChildren.instance?.let { add(it) }
  this@getAllChildren.productReference?.let { add(it) }
}

internal fun InventoryItem.Name.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "nameType" -> this.nameType
    "language" -> this.language
    "name" -> this.name
    else -> error("$name is not a valid property name")
  }

internal fun InventoryItem.Name.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "nameType" -> true
    "language" -> true
    "name" -> true
    else -> false
  }

internal fun InventoryItem.Name.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.nameType)
  add(this@getAllChildren.language)
  add(this@getAllChildren.name)
}

internal fun InventoryItem.ResponsibleOrganization.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "role" -> this.role
    "organization" -> this.organization
    else -> error("$name is not a valid property name")
  }

internal fun InventoryItem.ResponsibleOrganization.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "role" -> true
    "organization" -> true
    else -> false
  }

internal fun InventoryItem.ResponsibleOrganization.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.role)
  add(this@getAllChildren.organization)
}

internal fun InventoryItem.Description.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "language" -> this.language
    "description" -> this.description
    else -> error("$name is not a valid property name")
  }

internal fun InventoryItem.Description.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "language" -> true
    "description" -> true
    else -> false
  }

internal fun InventoryItem.Description.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.description?.let { add(it) }
}

internal fun InventoryItem.Association.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "associationType" -> this.associationType
    "relatedItem" -> this.relatedItem
    "quantity" -> this.quantity
    else -> error("$name is not a valid property name")
  }

internal fun InventoryItem.Association.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "associationType" -> true
    "relatedItem" -> true
    "quantity" -> true
    else -> false
  }

internal fun InventoryItem.Association.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.associationType)
  add(this@getAllChildren.relatedItem)
  add(this@getAllChildren.quantity)
}

internal fun InventoryItem.Characteristic.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "characteristicType" -> this.characteristicType
    "value" -> this.`value`
    else -> error("$name is not a valid property name")
  }

internal fun InventoryItem.Characteristic.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "characteristicType" -> true
    "value" -> true
    else -> false
  }

internal fun InventoryItem.Characteristic.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.characteristicType)
  add(this@getAllChildren.`value`)
}

internal fun InventoryItem.Instance.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "identifier" -> this.identifier
    "lotNumber" -> this.lotNumber
    "expiry" -> this.expiry
    "subject" -> this.subject
    "location" -> this.location
    else -> error("$name is not a valid property name")
  }

internal fun InventoryItem.Instance.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "identifier" -> true
    "lotNumber" -> true
    "expiry" -> true
    "subject" -> true
    "location" -> true
    else -> false
  }

internal fun InventoryItem.Instance.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.identifier)
  this@getAllChildren.lotNumber?.let { add(it) }
  this@getAllChildren.expiry?.let { add(it) }
  this@getAllChildren.subject?.let { add(it) }
  this@getAllChildren.location?.let { add(it) }
}
