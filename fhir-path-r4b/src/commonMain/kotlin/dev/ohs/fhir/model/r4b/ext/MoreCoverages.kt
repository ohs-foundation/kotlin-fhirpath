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

import dev.ohs.fhir.model.r4b.Coverage
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun Coverage.getProperty(name: String): Any? =
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
    "status" -> this.status
    "type" -> this.type
    "policyHolder" -> this.policyHolder
    "subscriber" -> this.subscriber
    "subscriberId" -> this.subscriberId
    "beneficiary" -> this.beneficiary
    "dependent" -> this.dependent
    "relationship" -> this.relationship
    "period" -> this.period
    "payor" -> this.payor
    "class" -> this.`class`
    "order" -> this.order
    "network" -> this.network
    "costToBeneficiary" -> this.costToBeneficiary
    "subrogation" -> this.subrogation
    "contract" -> this.contract
    else -> error("$name is not a valid property name")
  }

internal fun Coverage.hasProperty(name: String): Boolean =
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
    "status" -> true
    "type" -> true
    "policyHolder" -> true
    "subscriber" -> true
    "subscriberId" -> true
    "beneficiary" -> true
    "dependent" -> true
    "relationship" -> true
    "period" -> true
    "payor" -> true
    "class" -> true
    "order" -> true
    "network" -> true
    "costToBeneficiary" -> true
    "subrogation" -> true
    "contract" -> true
    else -> false
  }

internal fun Coverage.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.meta?.let { add(it) }
  this@getAllChildren.implicitRules?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.contained)
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.identifier)
  add(this@getAllChildren.status)
  this@getAllChildren.type?.let { add(it) }
  this@getAllChildren.policyHolder?.let { add(it) }
  this@getAllChildren.subscriber?.let { add(it) }
  this@getAllChildren.subscriberId?.let { add(it) }
  add(this@getAllChildren.beneficiary)
  this@getAllChildren.dependent?.let { add(it) }
  this@getAllChildren.relationship?.let { add(it) }
  this@getAllChildren.period?.let { add(it) }
  addAll(this@getAllChildren.payor)
  addAll(this@getAllChildren.`class`)
  this@getAllChildren.order?.let { add(it) }
  this@getAllChildren.network?.let { add(it) }
  addAll(this@getAllChildren.costToBeneficiary)
  this@getAllChildren.subrogation?.let { add(it) }
  addAll(this@getAllChildren.contract)
}

internal fun Coverage.Class.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "value" -> this.`value`
    "name" -> this.name
    else -> error("$name is not a valid property name")
  }

internal fun Coverage.Class.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "value" -> true
    "name" -> true
    else -> false
  }

internal fun Coverage.Class.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.type)
  add(this@getAllChildren.`value`)
  this@getAllChildren.name?.let { add(it) }
}

internal fun Coverage.CostToBeneficiary.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "value" -> this.`value`
    "exception" -> this.exception
    else -> error("$name is not a valid property name")
  }

internal fun Coverage.CostToBeneficiary.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "value" -> true
    "exception" -> true
    else -> false
  }

internal fun Coverage.CostToBeneficiary.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.type?.let { add(it) }
  add(this@getAllChildren.`value`)
  addAll(this@getAllChildren.exception)
}

internal fun Coverage.CostToBeneficiary.Exception.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "period" -> this.period
    else -> error("$name is not a valid property name")
  }

internal fun Coverage.CostToBeneficiary.Exception.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "period" -> true
    else -> false
  }

internal fun Coverage.CostToBeneficiary.Exception.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.type)
  this@getAllChildren.period?.let { add(it) }
}
