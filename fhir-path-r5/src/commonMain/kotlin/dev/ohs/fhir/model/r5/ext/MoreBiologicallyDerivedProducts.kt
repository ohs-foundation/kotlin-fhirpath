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

import dev.ohs.fhir.model.r5.BiologicallyDerivedProduct
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun BiologicallyDerivedProduct.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "meta" -> this.meta
    "implicitRules" -> this.implicitRules
    "language" -> this.language
    "text" -> this.text
    "contained" -> this.contained
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "productCategory" -> this.productCategory
    "productCode" -> this.productCode
    "parent" -> this.parent
    "request" -> this.request
    "identifier" -> this.identifier
    "biologicalSourceEvent" -> this.biologicalSourceEvent
    "processingFacility" -> this.processingFacility
    "division" -> this.division
    "productStatus" -> this.productStatus
    "expirationDate" -> this.expirationDate
    "collection" -> this.collection
    "storageTempRequirements" -> this.storageTempRequirements
    "property" -> this.`property`
    else -> error("$name is not a valid property name")
  }

internal fun BiologicallyDerivedProduct.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "meta" -> true
    "implicitRules" -> true
    "language" -> true
    "text" -> true
    "contained" -> true
    "extension" -> true
    "modifierExtension" -> true
    "productCategory" -> true
    "productCode" -> true
    "parent" -> true
    "request" -> true
    "identifier" -> true
    "biologicalSourceEvent" -> true
    "processingFacility" -> true
    "division" -> true
    "productStatus" -> true
    "expirationDate" -> true
    "collection" -> true
    "storageTempRequirements" -> true
    "property" -> true
    else -> false
  }

internal fun BiologicallyDerivedProduct.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.meta?.let { add(it) }
  this@getAllChildren.implicitRules?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.contained)
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.productCategory?.let { add(it) }
  this@getAllChildren.productCode?.let { add(it) }
  addAll(this@getAllChildren.parent)
  addAll(this@getAllChildren.request)
  addAll(this@getAllChildren.identifier)
  this@getAllChildren.biologicalSourceEvent?.let { add(it) }
  addAll(this@getAllChildren.processingFacility)
  this@getAllChildren.division?.let { add(it) }
  this@getAllChildren.productStatus?.let { add(it) }
  this@getAllChildren.expirationDate?.let { add(it) }
  this@getAllChildren.collection?.let { add(it) }
  this@getAllChildren.storageTempRequirements?.let { add(it) }
  addAll(this@getAllChildren.`property`)
}

internal fun BiologicallyDerivedProduct.Collection.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "collector" -> this.collector
    "source" -> this.source
    "collected" -> this.collected
    else -> error("$name is not a valid property name")
  }

internal fun BiologicallyDerivedProduct.Collection.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "collector" -> true
    "source" -> true
    "collected" -> true
    else -> false
  }

internal fun BiologicallyDerivedProduct.Collection.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.collector?.let { add(it) }
  this@getAllChildren.source?.let { add(it) }
  this@getAllChildren.collected?.let { add(it) }
}

internal fun BiologicallyDerivedProduct.Property.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "value" -> this.`value`
    else -> error("$name is not a valid property name")
  }

internal fun BiologicallyDerivedProduct.Property.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "value" -> true
    else -> false
  }

internal fun BiologicallyDerivedProduct.Property.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.type)
  add(this@getAllChildren.`value`)
}
