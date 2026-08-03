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

import dev.ohs.fhir.model.r4b.CatalogEntry
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun CatalogEntry.getProperty(name: String): Any? =
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
    "type" -> this.type
    "orderable" -> this.orderable
    "referencedItem" -> this.referencedItem
    "additionalIdentifier" -> this.additionalIdentifier
    "classification" -> this.classification
    "status" -> this.status
    "validityPeriod" -> this.validityPeriod
    "validTo" -> this.validTo
    "lastUpdated" -> this.lastUpdated
    "additionalCharacteristic" -> this.additionalCharacteristic
    "additionalClassification" -> this.additionalClassification
    "relatedEntry" -> this.relatedEntry
    else -> error("$name is not a valid property name")
  }

internal fun CatalogEntry.hasProperty(name: String): Boolean =
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
    "type" -> true
    "orderable" -> true
    "referencedItem" -> true
    "additionalIdentifier" -> true
    "classification" -> true
    "status" -> true
    "validityPeriod" -> true
    "validTo" -> true
    "lastUpdated" -> true
    "additionalCharacteristic" -> true
    "additionalClassification" -> true
    "relatedEntry" -> true
    else -> false
  }

internal fun CatalogEntry.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.meta?.let { add(it) }
  this@getAllChildren.implicitRules?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.contained)
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.identifier)
  this@getAllChildren.type?.let { add(it) }
  add(this@getAllChildren.orderable)
  add(this@getAllChildren.referencedItem)
  addAll(this@getAllChildren.additionalIdentifier)
  addAll(this@getAllChildren.classification)
  this@getAllChildren.status?.let { add(it) }
  this@getAllChildren.validityPeriod?.let { add(it) }
  this@getAllChildren.validTo?.let { add(it) }
  this@getAllChildren.lastUpdated?.let { add(it) }
  addAll(this@getAllChildren.additionalCharacteristic)
  addAll(this@getAllChildren.additionalClassification)
  addAll(this@getAllChildren.relatedEntry)
}

internal fun CatalogEntry.RelatedEntry.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "relationtype" -> this.relationtype
    "item" -> this.item
    else -> error("$name is not a valid property name")
  }

internal fun CatalogEntry.RelatedEntry.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "relationtype" -> true
    "item" -> true
    else -> false
  }

internal fun CatalogEntry.RelatedEntry.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.relationtype)
  add(this@getAllChildren.item)
}
