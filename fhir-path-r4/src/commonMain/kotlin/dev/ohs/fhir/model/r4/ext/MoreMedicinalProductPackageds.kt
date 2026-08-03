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

import dev.ohs.fhir.model.r4.MedicinalProductPackaged
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun MedicinalProductPackaged.getProperty(name: String): Any? =
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
    "subject" -> this.subject
    "description" -> this.description
    "legalStatusOfSupply" -> this.legalStatusOfSupply
    "marketingStatus" -> this.marketingStatus
    "marketingAuthorization" -> this.marketingAuthorization
    "manufacturer" -> this.manufacturer
    "batchIdentifier" -> this.batchIdentifier
    "packageItem" -> this.packageItem
    else -> error("$name is not a valid property name")
  }

internal fun MedicinalProductPackaged.hasProperty(name: String): Boolean =
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
    "subject" -> true
    "description" -> true
    "legalStatusOfSupply" -> true
    "marketingStatus" -> true
    "marketingAuthorization" -> true
    "manufacturer" -> true
    "batchIdentifier" -> true
    "packageItem" -> true
    else -> false
  }

internal fun MedicinalProductPackaged.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.meta?.let { add(it) }
  this@getAllChildren.implicitRules?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.contained)
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.identifier)
  addAll(this@getAllChildren.subject)
  this@getAllChildren.description?.let { add(it) }
  this@getAllChildren.legalStatusOfSupply?.let { add(it) }
  addAll(this@getAllChildren.marketingStatus)
  this@getAllChildren.marketingAuthorization?.let { add(it) }
  addAll(this@getAllChildren.manufacturer)
  addAll(this@getAllChildren.batchIdentifier)
  addAll(this@getAllChildren.packageItem)
}

internal fun MedicinalProductPackaged.BatchIdentifier.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "outerPackaging" -> this.outerPackaging
    "immediatePackaging" -> this.immediatePackaging
    else -> error("$name is not a valid property name")
  }

internal fun MedicinalProductPackaged.BatchIdentifier.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "outerPackaging" -> true
    "immediatePackaging" -> true
    else -> false
  }

internal fun MedicinalProductPackaged.BatchIdentifier.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.outerPackaging)
  this@getAllChildren.immediatePackaging?.let { add(it) }
}

internal fun MedicinalProductPackaged.PackageItem.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "identifier" -> this.identifier
    "type" -> this.type
    "quantity" -> this.quantity
    "material" -> this.material
    "alternateMaterial" -> this.alternateMaterial
    "device" -> this.device
    "manufacturedItem" -> this.manufacturedItem
    "packageItem" -> this.packageItem
    "physicalCharacteristics" -> this.physicalCharacteristics
    "otherCharacteristics" -> this.otherCharacteristics
    "shelfLifeStorage" -> this.shelfLifeStorage
    "manufacturer" -> this.manufacturer
    else -> error("$name is not a valid property name")
  }

internal fun MedicinalProductPackaged.PackageItem.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "identifier" -> true
    "type" -> true
    "quantity" -> true
    "material" -> true
    "alternateMaterial" -> true
    "device" -> true
    "manufacturedItem" -> true
    "packageItem" -> true
    "physicalCharacteristics" -> true
    "otherCharacteristics" -> true
    "shelfLifeStorage" -> true
    "manufacturer" -> true
    else -> false
  }

internal fun MedicinalProductPackaged.PackageItem.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.identifier)
  add(this@getAllChildren.type)
  add(this@getAllChildren.quantity)
  addAll(this@getAllChildren.material)
  addAll(this@getAllChildren.alternateMaterial)
  addAll(this@getAllChildren.device)
  addAll(this@getAllChildren.manufacturedItem)
  addAll(this@getAllChildren.packageItem)
  this@getAllChildren.physicalCharacteristics?.let { add(it) }
  addAll(this@getAllChildren.otherCharacteristics)
  addAll(this@getAllChildren.shelfLifeStorage)
  addAll(this@getAllChildren.manufacturer)
}
