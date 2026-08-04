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

import dev.ohs.fhir.model.r4.Device
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun Device.getProperty(name: String): Any? =
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
    "definition" -> this.definition
    "udiCarrier" -> this.udiCarrier
    "status" -> this.status
    "statusReason" -> this.statusReason
    "distinctIdentifier" -> this.distinctIdentifier
    "manufacturer" -> this.manufacturer
    "manufactureDate" -> this.manufactureDate
    "expirationDate" -> this.expirationDate
    "lotNumber" -> this.lotNumber
    "serialNumber" -> this.serialNumber
    "deviceName" -> this.deviceName
    "modelNumber" -> this.modelNumber
    "partNumber" -> this.partNumber
    "type" -> this.type
    "specialization" -> this.specialization
    "version" -> this.version
    "property" -> this.`property`
    "patient" -> this.patient
    "owner" -> this.owner
    "contact" -> this.contact
    "location" -> this.location
    "url" -> this.url
    "note" -> this.note
    "safety" -> this.safety
    "parent" -> this.parent
    else -> error("$name is not a valid property name")
  }

internal fun Device.hasProperty(name: String): Boolean =
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
    "definition" -> true
    "udiCarrier" -> true
    "status" -> true
    "statusReason" -> true
    "distinctIdentifier" -> true
    "manufacturer" -> true
    "manufactureDate" -> true
    "expirationDate" -> true
    "lotNumber" -> true
    "serialNumber" -> true
    "deviceName" -> true
    "modelNumber" -> true
    "partNumber" -> true
    "type" -> true
    "specialization" -> true
    "version" -> true
    "property" -> true
    "patient" -> true
    "owner" -> true
    "contact" -> true
    "location" -> true
    "url" -> true
    "note" -> true
    "safety" -> true
    "parent" -> true
    else -> false
  }

internal fun Device.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.meta?.let { add(it) }
  this@getAllChildren.implicitRules?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.contained)
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.identifier)
  this@getAllChildren.definition?.let { add(it) }
  addAll(this@getAllChildren.udiCarrier)
  this@getAllChildren.status?.let { add(it) }
  addAll(this@getAllChildren.statusReason)
  this@getAllChildren.distinctIdentifier?.let { add(it) }
  this@getAllChildren.manufacturer?.let { add(it) }
  this@getAllChildren.manufactureDate?.let { add(it) }
  this@getAllChildren.expirationDate?.let { add(it) }
  this@getAllChildren.lotNumber?.let { add(it) }
  this@getAllChildren.serialNumber?.let { add(it) }
  addAll(this@getAllChildren.deviceName)
  this@getAllChildren.modelNumber?.let { add(it) }
  this@getAllChildren.partNumber?.let { add(it) }
  this@getAllChildren.type?.let { add(it) }
  addAll(this@getAllChildren.specialization)
  addAll(this@getAllChildren.version)
  addAll(this@getAllChildren.`property`)
  this@getAllChildren.patient?.let { add(it) }
  this@getAllChildren.owner?.let { add(it) }
  addAll(this@getAllChildren.contact)
  this@getAllChildren.location?.let { add(it) }
  this@getAllChildren.url?.let { add(it) }
  addAll(this@getAllChildren.note)
  addAll(this@getAllChildren.safety)
  this@getAllChildren.parent?.let { add(it) }
}

internal fun Device.UdiCarrier.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "deviceIdentifier" -> this.deviceIdentifier
    "issuer" -> this.issuer
    "jurisdiction" -> this.jurisdiction
    "carrierAIDC" -> this.carrierAIDC
    "carrierHRF" -> this.carrierHRF
    "entryType" -> this.entryType
    else -> error("$name is not a valid property name")
  }

internal fun Device.UdiCarrier.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "deviceIdentifier" -> true
    "issuer" -> true
    "jurisdiction" -> true
    "carrierAIDC" -> true
    "carrierHRF" -> true
    "entryType" -> true
    else -> false
  }

internal fun Device.UdiCarrier.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.deviceIdentifier?.let { add(it) }
  this@getAllChildren.issuer?.let { add(it) }
  this@getAllChildren.jurisdiction?.let { add(it) }
  this@getAllChildren.carrierAIDC?.let { add(it) }
  this@getAllChildren.carrierHRF?.let { add(it) }
  this@getAllChildren.entryType?.let { add(it) }
}

internal fun Device.DeviceName.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "name" -> this.name
    "type" -> this.type
    else -> error("$name is not a valid property name")
  }

internal fun Device.DeviceName.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "name" -> true
    "type" -> true
    else -> false
  }

internal fun Device.DeviceName.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.name)
  add(this@getAllChildren.type)
}

internal fun Device.Specialization.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "systemType" -> this.systemType
    "version" -> this.version
    else -> error("$name is not a valid property name")
  }

internal fun Device.Specialization.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "systemType" -> true
    "version" -> true
    else -> false
  }

internal fun Device.Specialization.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.systemType)
  this@getAllChildren.version?.let { add(it) }
}

internal fun Device.Version.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "component" -> this.component
    "value" -> this.`value`
    else -> error("$name is not a valid property name")
  }

internal fun Device.Version.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "component" -> true
    "value" -> true
    else -> false
  }

internal fun Device.Version.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.type?.let { add(it) }
  this@getAllChildren.component?.let { add(it) }
  add(this@getAllChildren.`value`)
}

internal fun Device.Property.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "valueQuantity" -> this.valueQuantity
    "valueCode" -> this.valueCode
    else -> error("$name is not a valid property name")
  }

internal fun Device.Property.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "valueQuantity" -> true
    "valueCode" -> true
    else -> false
  }

internal fun Device.Property.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.type)
  addAll(this@getAllChildren.valueQuantity)
  addAll(this@getAllChildren.valueCode)
}
