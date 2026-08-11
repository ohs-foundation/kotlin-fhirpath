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

import dev.ohs.fhir.model.r4.BiologicallyDerivedProduct
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
    "identifier" -> this.identifier
    "productCategory" -> this.productCategory
    "productCode" -> this.productCode
    "status" -> this.status
    "request" -> this.request
    "quantity" -> this.quantity
    "parent" -> this.parent
    "collection" -> this.collection
    "processing" -> this.processing
    "manipulation" -> this.manipulation
    "storage" -> this.storage
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
    "identifier" -> true
    "productCategory" -> true
    "productCode" -> true
    "status" -> true
    "request" -> true
    "quantity" -> true
    "parent" -> true
    "collection" -> true
    "processing" -> true
    "manipulation" -> true
    "storage" -> true
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
  addAll(this@getAllChildren.identifier)
  this@getAllChildren.productCategory?.let { add(it) }
  this@getAllChildren.productCode?.let { add(it) }
  this@getAllChildren.status?.let { add(it) }
  addAll(this@getAllChildren.request)
  this@getAllChildren.quantity?.let { add(it) }
  addAll(this@getAllChildren.parent)
  this@getAllChildren.collection?.let { add(it) }
  addAll(this@getAllChildren.processing)
  this@getAllChildren.manipulation?.let { add(it) }
  addAll(this@getAllChildren.storage)
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

internal fun BiologicallyDerivedProduct.Processing.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "description" -> this.description
    "procedure" -> this.procedure
    "additive" -> this.additive
    "time" -> this.time
    else -> error("$name is not a valid property name")
  }

internal fun BiologicallyDerivedProduct.Processing.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "description" -> true
    "procedure" -> true
    "additive" -> true
    "time" -> true
    else -> false
  }

internal fun BiologicallyDerivedProduct.Processing.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.description?.let { add(it) }
  this@getAllChildren.procedure?.let { add(it) }
  this@getAllChildren.additive?.let { add(it) }
  this@getAllChildren.time?.let { add(it) }
}

internal fun BiologicallyDerivedProduct.Manipulation.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "description" -> this.description
    "time" -> this.time
    else -> error("$name is not a valid property name")
  }

internal fun BiologicallyDerivedProduct.Manipulation.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "description" -> true
    "time" -> true
    else -> false
  }

internal fun BiologicallyDerivedProduct.Manipulation.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.description?.let { add(it) }
  this@getAllChildren.time?.let { add(it) }
}

internal fun BiologicallyDerivedProduct.Storage.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "description" -> this.description
    "temperature" -> this.temperature
    "scale" -> this.scale
    "duration" -> this.duration
    else -> error("$name is not a valid property name")
  }

internal fun BiologicallyDerivedProduct.Storage.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "description" -> true
    "temperature" -> true
    "scale" -> true
    "duration" -> true
    else -> false
  }

internal fun BiologicallyDerivedProduct.Storage.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.description?.let { add(it) }
  this@getAllChildren.temperature?.let { add(it) }
  this@getAllChildren.scale?.let { add(it) }
  this@getAllChildren.duration?.let { add(it) }
}
