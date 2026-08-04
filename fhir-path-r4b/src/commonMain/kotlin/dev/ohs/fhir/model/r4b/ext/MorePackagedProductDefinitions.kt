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

import dev.ohs.fhir.model.r4b.PackagedProductDefinition
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun PackagedProductDefinition.getProperty(name: String): Any? =
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
    "name" -> this.name
    "type" -> this.type
    "packageFor" -> this.packageFor
    "status" -> this.status
    "statusDate" -> this.statusDate
    "containedItemQuantity" -> this.containedItemQuantity
    "description" -> this.description
    "legalStatusOfSupply" -> this.legalStatusOfSupply
    "marketingStatus" -> this.marketingStatus
    "characteristic" -> this.characteristic
    "copackagedIndicator" -> this.copackagedIndicator
    "manufacturer" -> this.manufacturer
    "package" -> this.`package`
    else -> error("$name is not a valid property name")
  }

internal fun PackagedProductDefinition.hasProperty(name: String): Boolean =
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
    "name" -> true
    "type" -> true
    "packageFor" -> true
    "status" -> true
    "statusDate" -> true
    "containedItemQuantity" -> true
    "description" -> true
    "legalStatusOfSupply" -> true
    "marketingStatus" -> true
    "characteristic" -> true
    "copackagedIndicator" -> true
    "manufacturer" -> true
    "package" -> true
    else -> false
  }

internal fun PackagedProductDefinition.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.meta?.let { add(it) }
  this@getAllChildren.implicitRules?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.contained)
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.identifier)
  this@getAllChildren.name?.let { add(it) }
  this@getAllChildren.type?.let { add(it) }
  addAll(this@getAllChildren.packageFor)
  this@getAllChildren.status?.let { add(it) }
  this@getAllChildren.statusDate?.let { add(it) }
  addAll(this@getAllChildren.containedItemQuantity)
  this@getAllChildren.description?.let { add(it) }
  addAll(this@getAllChildren.legalStatusOfSupply)
  addAll(this@getAllChildren.marketingStatus)
  addAll(this@getAllChildren.characteristic)
  this@getAllChildren.copackagedIndicator?.let { add(it) }
  addAll(this@getAllChildren.manufacturer)
  this@getAllChildren.`package`?.let { add(it) }
}

internal fun PackagedProductDefinition.LegalStatusOfSupply.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "code" -> this.code
    "jurisdiction" -> this.jurisdiction
    else -> error("$name is not a valid property name")
  }

internal fun PackagedProductDefinition.LegalStatusOfSupply.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "code" -> true
    "jurisdiction" -> true
    else -> false
  }

internal fun PackagedProductDefinition.LegalStatusOfSupply.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.code?.let { add(it) }
  this@getAllChildren.jurisdiction?.let { add(it) }
}

internal fun PackagedProductDefinition.Package.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "identifier" -> this.identifier
    "type" -> this.type
    "quantity" -> this.quantity
    "material" -> this.material
    "alternateMaterial" -> this.alternateMaterial
    "shelfLifeStorage" -> this.shelfLifeStorage
    "manufacturer" -> this.manufacturer
    "property" -> this.`property`
    "containedItem" -> this.containedItem
    "package" -> this.`package`
    else -> error("$name is not a valid property name")
  }

internal fun PackagedProductDefinition.Package.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "identifier" -> true
    "type" -> true
    "quantity" -> true
    "material" -> true
    "alternateMaterial" -> true
    "shelfLifeStorage" -> true
    "manufacturer" -> true
    "property" -> true
    "containedItem" -> true
    "package" -> true
    else -> false
  }

internal fun PackagedProductDefinition.Package.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.identifier)
  this@getAllChildren.type?.let { add(it) }
  this@getAllChildren.quantity?.let { add(it) }
  addAll(this@getAllChildren.material)
  addAll(this@getAllChildren.alternateMaterial)
  addAll(this@getAllChildren.shelfLifeStorage)
  addAll(this@getAllChildren.manufacturer)
  addAll(this@getAllChildren.`property`)
  addAll(this@getAllChildren.containedItem)
  addAll(this@getAllChildren.`package`)
}

internal fun PackagedProductDefinition.Package.ShelfLifeStorage.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "period" -> this.period
    "specialPrecautionsForStorage" -> this.specialPrecautionsForStorage
    else -> error("$name is not a valid property name")
  }

internal fun PackagedProductDefinition.Package.ShelfLifeStorage.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "period" -> true
    "specialPrecautionsForStorage" -> true
    else -> false
  }

internal fun PackagedProductDefinition.Package.ShelfLifeStorage.getAllChildren(): List<Any> =
  buildList {
    this@getAllChildren.id?.let { add(it) }
    addAll(this@getAllChildren.extension)
    addAll(this@getAllChildren.modifierExtension)
    this@getAllChildren.type?.let { add(it) }
    this@getAllChildren.period?.let { add(it) }
    addAll(this@getAllChildren.specialPrecautionsForStorage)
  }

internal fun PackagedProductDefinition.Package.Property.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "value" -> this.`value`
    else -> error("$name is not a valid property name")
  }

internal fun PackagedProductDefinition.Package.Property.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "value" -> true
    else -> false
  }

internal fun PackagedProductDefinition.Package.Property.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.type)
  this@getAllChildren.`value`?.let { add(it) }
}

internal fun PackagedProductDefinition.Package.ContainedItem.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "item" -> this.item
    "amount" -> this.amount
    else -> error("$name is not a valid property name")
  }

internal fun PackagedProductDefinition.Package.ContainedItem.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "item" -> true
    "amount" -> true
    else -> false
  }

internal fun PackagedProductDefinition.Package.ContainedItem.getAllChildren(): List<Any> =
  buildList {
    this@getAllChildren.id?.let { add(it) }
    addAll(this@getAllChildren.extension)
    addAll(this@getAllChildren.modifierExtension)
    add(this@getAllChildren.item)
    this@getAllChildren.amount?.let { add(it) }
  }
