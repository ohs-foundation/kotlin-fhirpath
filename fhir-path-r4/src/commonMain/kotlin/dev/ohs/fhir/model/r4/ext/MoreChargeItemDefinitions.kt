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

import dev.ohs.fhir.model.r4.ChargeItemDefinition
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun ChargeItemDefinition.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "meta" -> this.meta
    "implicitRules" -> this.implicitRules
    "language" -> this.language
    "text" -> this.text
    "contained" -> this.contained
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "url" -> this.url
    "identifier" -> this.identifier
    "version" -> this.version
    "title" -> this.title
    "derivedFromUri" -> this.derivedFromUri
    "partOf" -> this.partOf
    "replaces" -> this.replaces
    "status" -> this.status
    "experimental" -> this.experimental
    "date" -> this.date
    "publisher" -> this.publisher
    "contact" -> this.contact
    "description" -> this.description
    "useContext" -> this.useContext
    "jurisdiction" -> this.jurisdiction
    "copyright" -> this.copyright
    "approvalDate" -> this.approvalDate
    "lastReviewDate" -> this.lastReviewDate
    "effectivePeriod" -> this.effectivePeriod
    "code" -> this.code
    "instance" -> this.instance
    "applicability" -> this.applicability
    "propertyGroup" -> this.propertyGroup
    else -> error("$name is not a valid property name")
  }

internal fun ChargeItemDefinition.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "meta" -> true
    "implicitRules" -> true
    "language" -> true
    "text" -> true
    "contained" -> true
    "extension" -> true
    "modifierExtension" -> true
    "url" -> true
    "identifier" -> true
    "version" -> true
    "title" -> true
    "derivedFromUri" -> true
    "partOf" -> true
    "replaces" -> true
    "status" -> true
    "experimental" -> true
    "date" -> true
    "publisher" -> true
    "contact" -> true
    "description" -> true
    "useContext" -> true
    "jurisdiction" -> true
    "copyright" -> true
    "approvalDate" -> true
    "lastReviewDate" -> true
    "effectivePeriod" -> true
    "code" -> true
    "instance" -> true
    "applicability" -> true
    "propertyGroup" -> true
    else -> false
  }

internal fun ChargeItemDefinition.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.meta?.let { add(it) }
  this@getAllChildren.implicitRules?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.contained)
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.url)
  addAll(this@getAllChildren.identifier)
  this@getAllChildren.version?.let { add(it) }
  this@getAllChildren.title?.let { add(it) }
  addAll(this@getAllChildren.derivedFromUri)
  addAll(this@getAllChildren.partOf)
  addAll(this@getAllChildren.replaces)
  add(this@getAllChildren.status)
  this@getAllChildren.experimental?.let { add(it) }
  this@getAllChildren.date?.let { add(it) }
  this@getAllChildren.publisher?.let { add(it) }
  addAll(this@getAllChildren.contact)
  this@getAllChildren.description?.let { add(it) }
  addAll(this@getAllChildren.useContext)
  addAll(this@getAllChildren.jurisdiction)
  this@getAllChildren.copyright?.let { add(it) }
  this@getAllChildren.approvalDate?.let { add(it) }
  this@getAllChildren.lastReviewDate?.let { add(it) }
  this@getAllChildren.effectivePeriod?.let { add(it) }
  this@getAllChildren.code?.let { add(it) }
  addAll(this@getAllChildren.instance)
  addAll(this@getAllChildren.applicability)
  addAll(this@getAllChildren.propertyGroup)
}

internal fun ChargeItemDefinition.Applicability.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "description" -> this.description
    "language" -> this.language
    "expression" -> this.expression
    else -> error("$name is not a valid property name")
  }

internal fun ChargeItemDefinition.Applicability.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "description" -> true
    "language" -> true
    "expression" -> true
    else -> false
  }

internal fun ChargeItemDefinition.Applicability.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.description?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.expression?.let { add(it) }
}

internal fun ChargeItemDefinition.PropertyGroup.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "applicability" -> this.applicability
    "priceComponent" -> this.priceComponent
    else -> error("$name is not a valid property name")
  }

internal fun ChargeItemDefinition.PropertyGroup.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "applicability" -> true
    "priceComponent" -> true
    else -> false
  }

internal fun ChargeItemDefinition.PropertyGroup.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.applicability)
  addAll(this@getAllChildren.priceComponent)
}

internal fun ChargeItemDefinition.PropertyGroup.PriceComponent.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "code" -> this.code
    "factor" -> this.factor
    "amount" -> this.amount
    else -> error("$name is not a valid property name")
  }

internal fun ChargeItemDefinition.PropertyGroup.PriceComponent.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "code" -> true
    "factor" -> true
    "amount" -> true
    else -> false
  }

internal fun ChargeItemDefinition.PropertyGroup.PriceComponent.getAllChildren(): List<Any> =
  buildList {
    this@getAllChildren.id?.let { add(it) }
    addAll(this@getAllChildren.extension)
    addAll(this@getAllChildren.modifierExtension)
    add(this@getAllChildren.type)
    this@getAllChildren.code?.let { add(it) }
    this@getAllChildren.factor?.let { add(it) }
    this@getAllChildren.amount?.let { add(it) }
  }
