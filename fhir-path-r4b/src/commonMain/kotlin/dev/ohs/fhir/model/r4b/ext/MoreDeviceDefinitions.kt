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

import dev.ohs.fhir.model.r4b.DeviceDefinition
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun DeviceDefinition.getProperty(name: String): Any? =
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
    "udiDeviceIdentifier" -> this.udiDeviceIdentifier
    "manufacturer" -> this.manufacturer
    "deviceName" -> this.deviceName
    "modelNumber" -> this.modelNumber
    "type" -> this.type
    "specialization" -> this.specialization
    "version" -> this.version
    "safety" -> this.safety
    "shelfLifeStorage" -> this.shelfLifeStorage
    "physicalCharacteristics" -> this.physicalCharacteristics
    "languageCode" -> this.languageCode
    "capability" -> this.capability
    "property" -> this.`property`
    "owner" -> this.owner
    "contact" -> this.contact
    "url" -> this.url
    "onlineInformation" -> this.onlineInformation
    "note" -> this.note
    "quantity" -> this.quantity
    "parentDevice" -> this.parentDevice
    "material" -> this.material
    else -> error("$name is not a valid property name")
  }

internal fun DeviceDefinition.hasProperty(name: String): Boolean =
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
    "udiDeviceIdentifier" -> true
    "manufacturer" -> true
    "deviceName" -> true
    "modelNumber" -> true
    "type" -> true
    "specialization" -> true
    "version" -> true
    "safety" -> true
    "shelfLifeStorage" -> true
    "physicalCharacteristics" -> true
    "languageCode" -> true
    "capability" -> true
    "property" -> true
    "owner" -> true
    "contact" -> true
    "url" -> true
    "onlineInformation" -> true
    "note" -> true
    "quantity" -> true
    "parentDevice" -> true
    "material" -> true
    else -> false
  }

internal fun DeviceDefinition.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.meta?.let { add(it) }
  this@getAllChildren.implicitRules?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.contained)
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.identifier)
  addAll(this@getAllChildren.udiDeviceIdentifier)
  this@getAllChildren.manufacturer?.let { add(it) }
  addAll(this@getAllChildren.deviceName)
  this@getAllChildren.modelNumber?.let { add(it) }
  this@getAllChildren.type?.let { add(it) }
  addAll(this@getAllChildren.specialization)
  addAll(this@getAllChildren.version)
  addAll(this@getAllChildren.safety)
  addAll(this@getAllChildren.shelfLifeStorage)
  this@getAllChildren.physicalCharacteristics?.let { add(it) }
  addAll(this@getAllChildren.languageCode)
  addAll(this@getAllChildren.capability)
  addAll(this@getAllChildren.`property`)
  this@getAllChildren.owner?.let { add(it) }
  addAll(this@getAllChildren.contact)
  this@getAllChildren.url?.let { add(it) }
  this@getAllChildren.onlineInformation?.let { add(it) }
  addAll(this@getAllChildren.note)
  this@getAllChildren.quantity?.let { add(it) }
  this@getAllChildren.parentDevice?.let { add(it) }
  addAll(this@getAllChildren.material)
}

internal fun DeviceDefinition.UdiDeviceIdentifier.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "deviceIdentifier" -> this.deviceIdentifier
    "issuer" -> this.issuer
    "jurisdiction" -> this.jurisdiction
    else -> error("$name is not a valid property name")
  }

internal fun DeviceDefinition.UdiDeviceIdentifier.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "deviceIdentifier" -> true
    "issuer" -> true
    "jurisdiction" -> true
    else -> false
  }

internal fun DeviceDefinition.UdiDeviceIdentifier.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.deviceIdentifier)
  add(this@getAllChildren.issuer)
  add(this@getAllChildren.jurisdiction)
}

internal fun DeviceDefinition.DeviceName.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "name" -> this.name
    "type" -> this.type
    else -> error("$name is not a valid property name")
  }

internal fun DeviceDefinition.DeviceName.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "name" -> true
    "type" -> true
    else -> false
  }

internal fun DeviceDefinition.DeviceName.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.name)
  add(this@getAllChildren.type)
}

internal fun DeviceDefinition.Specialization.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "systemType" -> this.systemType
    "version" -> this.version
    else -> error("$name is not a valid property name")
  }

internal fun DeviceDefinition.Specialization.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "systemType" -> true
    "version" -> true
    else -> false
  }

internal fun DeviceDefinition.Specialization.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.systemType)
  this@getAllChildren.version?.let { add(it) }
}

internal fun DeviceDefinition.Capability.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "description" -> this.description
    else -> error("$name is not a valid property name")
  }

internal fun DeviceDefinition.Capability.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "description" -> true
    else -> false
  }

internal fun DeviceDefinition.Capability.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.type)
  addAll(this@getAllChildren.description)
}

internal fun DeviceDefinition.Property.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "valueQuantity" -> this.valueQuantity
    "valueCode" -> this.valueCode
    else -> error("$name is not a valid property name")
  }

internal fun DeviceDefinition.Property.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "valueQuantity" -> true
    "valueCode" -> true
    else -> false
  }

internal fun DeviceDefinition.Property.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.type)
  addAll(this@getAllChildren.valueQuantity)
  addAll(this@getAllChildren.valueCode)
}

internal fun DeviceDefinition.Material.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "substance" -> this.substance
    "alternate" -> this.alternate
    "allergenicIndicator" -> this.allergenicIndicator
    else -> error("$name is not a valid property name")
  }

internal fun DeviceDefinition.Material.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "substance" -> true
    "alternate" -> true
    "allergenicIndicator" -> true
    else -> false
  }

internal fun DeviceDefinition.Material.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.substance)
  this@getAllChildren.alternate?.let { add(it) }
  this@getAllChildren.allergenicIndicator?.let { add(it) }
}
