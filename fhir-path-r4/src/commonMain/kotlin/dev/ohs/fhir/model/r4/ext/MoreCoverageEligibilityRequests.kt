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

import dev.ohs.fhir.model.r4.CoverageEligibilityRequest
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun CoverageEligibilityRequest.getProperty(name: String): Any? =
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
    "priority" -> this.priority
    "purpose" -> this.purpose
    "patient" -> this.patient
    "serviced" -> this.serviced
    "created" -> this.created
    "enterer" -> this.enterer
    "provider" -> this.provider
    "insurer" -> this.insurer
    "facility" -> this.facility
    "supportingInfo" -> this.supportingInfo
    "insurance" -> this.insurance
    "item" -> this.item
    else -> error("$name is not a valid property name")
  }

internal fun CoverageEligibilityRequest.hasProperty(name: String): Boolean =
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
    "priority" -> true
    "purpose" -> true
    "patient" -> true
    "serviced" -> true
    "created" -> true
    "enterer" -> true
    "provider" -> true
    "insurer" -> true
    "facility" -> true
    "supportingInfo" -> true
    "insurance" -> true
    "item" -> true
    else -> false
  }

internal fun CoverageEligibilityRequest.getAllChildren(): List<Any> = buildList {
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
  this@getAllChildren.priority?.let { add(it) }
  addAll(this@getAllChildren.purpose)
  add(this@getAllChildren.patient)
  this@getAllChildren.serviced?.let { add(it) }
  add(this@getAllChildren.created)
  this@getAllChildren.enterer?.let { add(it) }
  this@getAllChildren.provider?.let { add(it) }
  add(this@getAllChildren.insurer)
  this@getAllChildren.facility?.let { add(it) }
  addAll(this@getAllChildren.supportingInfo)
  addAll(this@getAllChildren.insurance)
  addAll(this@getAllChildren.item)
}

internal fun CoverageEligibilityRequest.SupportingInfo.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "sequence" -> this.sequence
    "information" -> this.information
    "appliesToAll" -> this.appliesToAll
    else -> error("$name is not a valid property name")
  }

internal fun CoverageEligibilityRequest.SupportingInfo.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "sequence" -> true
    "information" -> true
    "appliesToAll" -> true
    else -> false
  }

internal fun CoverageEligibilityRequest.SupportingInfo.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.sequence)
  add(this@getAllChildren.information)
  this@getAllChildren.appliesToAll?.let { add(it) }
}

internal fun CoverageEligibilityRequest.Insurance.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "focal" -> this.focal
    "coverage" -> this.coverage
    "businessArrangement" -> this.businessArrangement
    else -> error("$name is not a valid property name")
  }

internal fun CoverageEligibilityRequest.Insurance.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "focal" -> true
    "coverage" -> true
    "businessArrangement" -> true
    else -> false
  }

internal fun CoverageEligibilityRequest.Insurance.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.focal?.let { add(it) }
  add(this@getAllChildren.coverage)
  this@getAllChildren.businessArrangement?.let { add(it) }
}

internal fun CoverageEligibilityRequest.Item.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "supportingInfoSequence" -> this.supportingInfoSequence
    "category" -> this.category
    "productOrService" -> this.productOrService
    "modifier" -> this.modifier
    "provider" -> this.provider
    "quantity" -> this.quantity
    "unitPrice" -> this.unitPrice
    "facility" -> this.facility
    "diagnosis" -> this.diagnosis
    "detail" -> this.detail
    else -> error("$name is not a valid property name")
  }

internal fun CoverageEligibilityRequest.Item.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "supportingInfoSequence" -> true
    "category" -> true
    "productOrService" -> true
    "modifier" -> true
    "provider" -> true
    "quantity" -> true
    "unitPrice" -> true
    "facility" -> true
    "diagnosis" -> true
    "detail" -> true
    else -> false
  }

internal fun CoverageEligibilityRequest.Item.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.supportingInfoSequence)
  this@getAllChildren.category?.let { add(it) }
  this@getAllChildren.productOrService?.let { add(it) }
  addAll(this@getAllChildren.modifier)
  this@getAllChildren.provider?.let { add(it) }
  this@getAllChildren.quantity?.let { add(it) }
  this@getAllChildren.unitPrice?.let { add(it) }
  this@getAllChildren.facility?.let { add(it) }
  addAll(this@getAllChildren.diagnosis)
  addAll(this@getAllChildren.detail)
}

internal fun CoverageEligibilityRequest.Item.Diagnosis.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "diagnosis" -> this.diagnosis
    else -> error("$name is not a valid property name")
  }

internal fun CoverageEligibilityRequest.Item.Diagnosis.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "diagnosis" -> true
    else -> false
  }

internal fun CoverageEligibilityRequest.Item.Diagnosis.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.diagnosis?.let { add(it) }
}
