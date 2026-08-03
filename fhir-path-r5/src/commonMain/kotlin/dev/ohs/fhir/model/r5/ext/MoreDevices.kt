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

import dev.ohs.fhir.model.r5.Device
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
    "displayName" -> this.displayName
    "definition" -> this.definition
    "udiCarrier" -> this.udiCarrier
    "status" -> this.status
    "availabilityStatus" -> this.availabilityStatus
    "biologicalSourceEvent" -> this.biologicalSourceEvent
    "manufacturer" -> this.manufacturer
    "manufactureDate" -> this.manufactureDate
    "expirationDate" -> this.expirationDate
    "lotNumber" -> this.lotNumber
    "serialNumber" -> this.serialNumber
    "name" -> this.name
    "modelNumber" -> this.modelNumber
    "partNumber" -> this.partNumber
    "category" -> this.category
    "type" -> this.type
    "version" -> this.version
    "conformsTo" -> this.conformsTo
    "property" -> this.`property`
    "mode" -> this.mode
    "cycle" -> this.cycle
    "duration" -> this.duration
    "owner" -> this.owner
    "contact" -> this.contact
    "location" -> this.location
    "url" -> this.url
    "endpoint" -> this.endpoint
    "gateway" -> this.gateway
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
    "displayName" -> true
    "definition" -> true
    "udiCarrier" -> true
    "status" -> true
    "availabilityStatus" -> true
    "biologicalSourceEvent" -> true
    "manufacturer" -> true
    "manufactureDate" -> true
    "expirationDate" -> true
    "lotNumber" -> true
    "serialNumber" -> true
    "name" -> true
    "modelNumber" -> true
    "partNumber" -> true
    "category" -> true
    "type" -> true
    "version" -> true
    "conformsTo" -> true
    "property" -> true
    "mode" -> true
    "cycle" -> true
    "duration" -> true
    "owner" -> true
    "contact" -> true
    "location" -> true
    "url" -> true
    "endpoint" -> true
    "gateway" -> true
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
  this@getAllChildren.displayName?.let { add(it) }
  this@getAllChildren.definition?.let { add(it) }
  addAll(this@getAllChildren.udiCarrier)
  this@getAllChildren.status?.let { add(it) }
  this@getAllChildren.availabilityStatus?.let { add(it) }
  this@getAllChildren.biologicalSourceEvent?.let { add(it) }
  this@getAllChildren.manufacturer?.let { add(it) }
  this@getAllChildren.manufactureDate?.let { add(it) }
  this@getAllChildren.expirationDate?.let { add(it) }
  this@getAllChildren.lotNumber?.let { add(it) }
  this@getAllChildren.serialNumber?.let { add(it) }
  addAll(this@getAllChildren.name)
  this@getAllChildren.modelNumber?.let { add(it) }
  this@getAllChildren.partNumber?.let { add(it) }
  addAll(this@getAllChildren.category)
  addAll(this@getAllChildren.type)
  addAll(this@getAllChildren.version)
  addAll(this@getAllChildren.conformsTo)
  addAll(this@getAllChildren.`property`)
  this@getAllChildren.mode?.let { add(it) }
  this@getAllChildren.cycle?.let { add(it) }
  this@getAllChildren.duration?.let { add(it) }
  this@getAllChildren.owner?.let { add(it) }
  addAll(this@getAllChildren.contact)
  this@getAllChildren.location?.let { add(it) }
  this@getAllChildren.url?.let { add(it) }
  addAll(this@getAllChildren.endpoint)
  addAll(this@getAllChildren.gateway)
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
  add(this@getAllChildren.deviceIdentifier)
  add(this@getAllChildren.issuer)
  this@getAllChildren.jurisdiction?.let { add(it) }
  this@getAllChildren.carrierAIDC?.let { add(it) }
  this@getAllChildren.carrierHRF?.let { add(it) }
  this@getAllChildren.entryType?.let { add(it) }
}

internal fun Device.Name.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "value" -> this.`value`
    "type" -> this.type
    "display" -> this.display
    else -> error("$name is not a valid property name")
  }

internal fun Device.Name.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "value" -> true
    "type" -> true
    "display" -> true
    else -> false
  }

internal fun Device.Name.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.`value`)
  add(this@getAllChildren.type)
  this@getAllChildren.display?.let { add(it) }
}

internal fun Device.Version.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "component" -> this.component
    "installDate" -> this.installDate
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
    "installDate" -> true
    "value" -> true
    else -> false
  }

internal fun Device.Version.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.type?.let { add(it) }
  this@getAllChildren.component?.let { add(it) }
  this@getAllChildren.installDate?.let { add(it) }
  add(this@getAllChildren.`value`)
}

internal fun Device.ConformsTo.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "category" -> this.category
    "specification" -> this.specification
    "version" -> this.version
    else -> error("$name is not a valid property name")
  }

internal fun Device.ConformsTo.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "category" -> true
    "specification" -> true
    "version" -> true
    else -> false
  }

internal fun Device.ConformsTo.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.category?.let { add(it) }
  add(this@getAllChildren.specification)
  this@getAllChildren.version?.let { add(it) }
}

internal fun Device.Property.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "value" -> this.`value`
    else -> error("$name is not a valid property name")
  }

internal fun Device.Property.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "value" -> true
    else -> false
  }

internal fun Device.Property.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.type)
  add(this@getAllChildren.`value`)
}
