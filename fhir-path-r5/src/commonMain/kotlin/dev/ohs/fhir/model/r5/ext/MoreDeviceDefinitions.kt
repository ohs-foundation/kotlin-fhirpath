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

import dev.ohs.fhir.model.r5.DeviceDefinition
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
    "description" -> this.description
    "identifier" -> this.identifier
    "udiDeviceIdentifier" -> this.udiDeviceIdentifier
    "regulatoryIdentifier" -> this.regulatoryIdentifier
    "partNumber" -> this.partNumber
    "manufacturer" -> this.manufacturer
    "deviceName" -> this.deviceName
    "modelNumber" -> this.modelNumber
    "classification" -> this.classification
    "conformsTo" -> this.conformsTo
    "hasPart" -> this.hasPart
    "packaging" -> this.packaging
    "version" -> this.version
    "safety" -> this.safety
    "shelfLifeStorage" -> this.shelfLifeStorage
    "languageCode" -> this.languageCode
    "property" -> this.`property`
    "owner" -> this.owner
    "contact" -> this.contact
    "link" -> this.link
    "note" -> this.note
    "material" -> this.material
    "productionIdentifierInUDI" -> this.productionIdentifierInUDI
    "guideline" -> this.guideline
    "correctiveAction" -> this.correctiveAction
    "chargeItem" -> this.chargeItem
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
    "description" -> true
    "identifier" -> true
    "udiDeviceIdentifier" -> true
    "regulatoryIdentifier" -> true
    "partNumber" -> true
    "manufacturer" -> true
    "deviceName" -> true
    "modelNumber" -> true
    "classification" -> true
    "conformsTo" -> true
    "hasPart" -> true
    "packaging" -> true
    "version" -> true
    "safety" -> true
    "shelfLifeStorage" -> true
    "languageCode" -> true
    "property" -> true
    "owner" -> true
    "contact" -> true
    "link" -> true
    "note" -> true
    "material" -> true
    "productionIdentifierInUDI" -> true
    "guideline" -> true
    "correctiveAction" -> true
    "chargeItem" -> true
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
  this@getAllChildren.description?.let { add(it) }
  addAll(this@getAllChildren.identifier)
  addAll(this@getAllChildren.udiDeviceIdentifier)
  addAll(this@getAllChildren.regulatoryIdentifier)
  this@getAllChildren.partNumber?.let { add(it) }
  this@getAllChildren.manufacturer?.let { add(it) }
  addAll(this@getAllChildren.deviceName)
  this@getAllChildren.modelNumber?.let { add(it) }
  addAll(this@getAllChildren.classification)
  addAll(this@getAllChildren.conformsTo)
  addAll(this@getAllChildren.hasPart)
  addAll(this@getAllChildren.packaging)
  addAll(this@getAllChildren.version)
  addAll(this@getAllChildren.safety)
  addAll(this@getAllChildren.shelfLifeStorage)
  addAll(this@getAllChildren.languageCode)
  addAll(this@getAllChildren.`property`)
  this@getAllChildren.owner?.let { add(it) }
  addAll(this@getAllChildren.contact)
  addAll(this@getAllChildren.link)
  addAll(this@getAllChildren.note)
  addAll(this@getAllChildren.material)
  addAll(this@getAllChildren.productionIdentifierInUDI)
  this@getAllChildren.guideline?.let { add(it) }
  this@getAllChildren.correctiveAction?.let { add(it) }
  addAll(this@getAllChildren.chargeItem)
}

internal fun DeviceDefinition.UdiDeviceIdentifier.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "deviceIdentifier" -> this.deviceIdentifier
    "issuer" -> this.issuer
    "jurisdiction" -> this.jurisdiction
    "marketDistribution" -> this.marketDistribution
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
    "marketDistribution" -> true
    else -> false
  }

internal fun DeviceDefinition.UdiDeviceIdentifier.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.deviceIdentifier)
  add(this@getAllChildren.issuer)
  add(this@getAllChildren.jurisdiction)
  addAll(this@getAllChildren.marketDistribution)
}

internal fun DeviceDefinition.UdiDeviceIdentifier.MarketDistribution.getProperty(
  name: String
): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "marketPeriod" -> this.marketPeriod
    "subJurisdiction" -> this.subJurisdiction
    else -> error("$name is not a valid property name")
  }

internal fun DeviceDefinition.UdiDeviceIdentifier.MarketDistribution.hasProperty(
  name: String
): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "marketPeriod" -> true
    "subJurisdiction" -> true
    else -> false
  }

internal fun DeviceDefinition.UdiDeviceIdentifier.MarketDistribution.getAllChildren(): List<Any> =
  buildList {
    this@getAllChildren.id?.let { add(it) }
    addAll(this@getAllChildren.extension)
    addAll(this@getAllChildren.modifierExtension)
    add(this@getAllChildren.marketPeriod)
    add(this@getAllChildren.subJurisdiction)
  }

internal fun DeviceDefinition.RegulatoryIdentifier.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "deviceIdentifier" -> this.deviceIdentifier
    "issuer" -> this.issuer
    "jurisdiction" -> this.jurisdiction
    else -> error("$name is not a valid property name")
  }

internal fun DeviceDefinition.RegulatoryIdentifier.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "deviceIdentifier" -> true
    "issuer" -> true
    "jurisdiction" -> true
    else -> false
  }

internal fun DeviceDefinition.RegulatoryIdentifier.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.type)
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

internal fun DeviceDefinition.Classification.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "justification" -> this.justification
    else -> error("$name is not a valid property name")
  }

internal fun DeviceDefinition.Classification.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "justification" -> true
    else -> false
  }

internal fun DeviceDefinition.Classification.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.type)
  addAll(this@getAllChildren.justification)
}

internal fun DeviceDefinition.ConformsTo.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "category" -> this.category
    "specification" -> this.specification
    "version" -> this.version
    "source" -> this.source
    else -> error("$name is not a valid property name")
  }

internal fun DeviceDefinition.ConformsTo.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "category" -> true
    "specification" -> true
    "version" -> true
    "source" -> true
    else -> false
  }

internal fun DeviceDefinition.ConformsTo.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.category?.let { add(it) }
  add(this@getAllChildren.specification)
  addAll(this@getAllChildren.version)
  addAll(this@getAllChildren.source)
}

internal fun DeviceDefinition.HasPart.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "reference" -> this.reference
    "count" -> this.count
    else -> error("$name is not a valid property name")
  }

internal fun DeviceDefinition.HasPart.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "reference" -> true
    "count" -> true
    else -> false
  }

internal fun DeviceDefinition.HasPart.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.reference)
  this@getAllChildren.count?.let { add(it) }
}

internal fun DeviceDefinition.Packaging.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "identifier" -> this.identifier
    "type" -> this.type
    "count" -> this.count
    "distributor" -> this.distributor
    "udiDeviceIdentifier" -> this.udiDeviceIdentifier
    "packaging" -> this.packaging
    else -> error("$name is not a valid property name")
  }

internal fun DeviceDefinition.Packaging.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "identifier" -> true
    "type" -> true
    "count" -> true
    "distributor" -> true
    "udiDeviceIdentifier" -> true
    "packaging" -> true
    else -> false
  }

internal fun DeviceDefinition.Packaging.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.identifier?.let { add(it) }
  this@getAllChildren.type?.let { add(it) }
  this@getAllChildren.count?.let { add(it) }
  addAll(this@getAllChildren.distributor)
  addAll(this@getAllChildren.udiDeviceIdentifier)
  addAll(this@getAllChildren.packaging)
}

internal fun DeviceDefinition.Packaging.Distributor.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "name" -> this.name
    "organizationReference" -> this.organizationReference
    else -> error("$name is not a valid property name")
  }

internal fun DeviceDefinition.Packaging.Distributor.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "name" -> true
    "organizationReference" -> true
    else -> false
  }

internal fun DeviceDefinition.Packaging.Distributor.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.name?.let { add(it) }
  addAll(this@getAllChildren.organizationReference)
}

internal fun DeviceDefinition.Version.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "component" -> this.component
    "value" -> this.`value`
    else -> error("$name is not a valid property name")
  }

internal fun DeviceDefinition.Version.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "component" -> true
    "value" -> true
    else -> false
  }

internal fun DeviceDefinition.Version.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.type?.let { add(it) }
  this@getAllChildren.component?.let { add(it) }
  add(this@getAllChildren.`value`)
}

internal fun DeviceDefinition.Property.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "value" -> this.`value`
    else -> error("$name is not a valid property name")
  }

internal fun DeviceDefinition.Property.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "value" -> true
    else -> false
  }

internal fun DeviceDefinition.Property.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.type)
  add(this@getAllChildren.`value`)
}

internal fun DeviceDefinition.Link.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "relation" -> this.relation
    "relatedDevice" -> this.relatedDevice
    else -> error("$name is not a valid property name")
  }

internal fun DeviceDefinition.Link.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "relation" -> true
    "relatedDevice" -> true
    else -> false
  }

internal fun DeviceDefinition.Link.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.relation)
  add(this@getAllChildren.relatedDevice)
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

internal fun DeviceDefinition.Guideline.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "useContext" -> this.useContext
    "usageInstruction" -> this.usageInstruction
    "relatedArtifact" -> this.relatedArtifact
    "indication" -> this.indication
    "contraindication" -> this.contraindication
    "warning" -> this.warning
    "intendedUse" -> this.intendedUse
    else -> error("$name is not a valid property name")
  }

internal fun DeviceDefinition.Guideline.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "useContext" -> true
    "usageInstruction" -> true
    "relatedArtifact" -> true
    "indication" -> true
    "contraindication" -> true
    "warning" -> true
    "intendedUse" -> true
    else -> false
  }

internal fun DeviceDefinition.Guideline.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.useContext)
  this@getAllChildren.usageInstruction?.let { add(it) }
  addAll(this@getAllChildren.relatedArtifact)
  addAll(this@getAllChildren.indication)
  addAll(this@getAllChildren.contraindication)
  addAll(this@getAllChildren.warning)
  this@getAllChildren.intendedUse?.let { add(it) }
}

internal fun DeviceDefinition.CorrectiveAction.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "recall" -> this.recall
    "scope" -> this.scope
    "period" -> this.period
    else -> error("$name is not a valid property name")
  }

internal fun DeviceDefinition.CorrectiveAction.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "recall" -> true
    "scope" -> true
    "period" -> true
    else -> false
  }

internal fun DeviceDefinition.CorrectiveAction.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.recall)
  this@getAllChildren.scope?.let { add(it) }
  add(this@getAllChildren.period)
}

internal fun DeviceDefinition.ChargeItem.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "chargeItemCode" -> this.chargeItemCode
    "count" -> this.count
    "effectivePeriod" -> this.effectivePeriod
    "useContext" -> this.useContext
    else -> error("$name is not a valid property name")
  }

internal fun DeviceDefinition.ChargeItem.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "chargeItemCode" -> true
    "count" -> true
    "effectivePeriod" -> true
    "useContext" -> true
    else -> false
  }

internal fun DeviceDefinition.ChargeItem.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.chargeItemCode)
  add(this@getAllChildren.count)
  this@getAllChildren.effectivePeriod?.let { add(it) }
  addAll(this@getAllChildren.useContext)
}
