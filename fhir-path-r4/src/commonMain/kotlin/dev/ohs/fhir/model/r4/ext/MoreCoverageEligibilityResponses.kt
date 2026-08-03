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

import dev.ohs.fhir.model.r4.CoverageEligibilityResponse
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun CoverageEligibilityResponse.getProperty(name: String): Any? =
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
    "purpose" -> this.purpose
    "patient" -> this.patient
    "serviced" -> this.serviced
    "created" -> this.created
    "requestor" -> this.requestor
    "request" -> this.request
    "outcome" -> this.outcome
    "disposition" -> this.disposition
    "insurer" -> this.insurer
    "insurance" -> this.insurance
    "preAuthRef" -> this.preAuthRef
    "form" -> this.form
    "error" -> this.error
    else -> error("$name is not a valid property name")
  }

internal fun CoverageEligibilityResponse.hasProperty(name: String): Boolean =
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
    "purpose" -> true
    "patient" -> true
    "serviced" -> true
    "created" -> true
    "requestor" -> true
    "request" -> true
    "outcome" -> true
    "disposition" -> true
    "insurer" -> true
    "insurance" -> true
    "preAuthRef" -> true
    "form" -> true
    "error" -> true
    else -> false
  }

internal fun CoverageEligibilityResponse.getAllChildren(): List<Any> = buildList {
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
  addAll(this@getAllChildren.purpose)
  add(this@getAllChildren.patient)
  this@getAllChildren.serviced?.let { add(it) }
  add(this@getAllChildren.created)
  this@getAllChildren.requestor?.let { add(it) }
  add(this@getAllChildren.request)
  add(this@getAllChildren.outcome)
  this@getAllChildren.disposition?.let { add(it) }
  add(this@getAllChildren.insurer)
  addAll(this@getAllChildren.insurance)
  this@getAllChildren.preAuthRef?.let { add(it) }
  this@getAllChildren.form?.let { add(it) }
  addAll(this@getAllChildren.error)
}

internal fun CoverageEligibilityResponse.Insurance.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "coverage" -> this.coverage
    "inforce" -> this.inforce
    "benefitPeriod" -> this.benefitPeriod
    "item" -> this.item
    else -> error("$name is not a valid property name")
  }

internal fun CoverageEligibilityResponse.Insurance.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "coverage" -> true
    "inforce" -> true
    "benefitPeriod" -> true
    "item" -> true
    else -> false
  }

internal fun CoverageEligibilityResponse.Insurance.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.coverage)
  this@getAllChildren.inforce?.let { add(it) }
  this@getAllChildren.benefitPeriod?.let { add(it) }
  addAll(this@getAllChildren.item)
}

internal fun CoverageEligibilityResponse.Insurance.Item.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "category" -> this.category
    "productOrService" -> this.productOrService
    "modifier" -> this.modifier
    "provider" -> this.provider
    "excluded" -> this.excluded
    "name" -> this.name
    "description" -> this.description
    "network" -> this.network
    "unit" -> this.unit
    "term" -> this.term
    "benefit" -> this.benefit
    "authorizationRequired" -> this.authorizationRequired
    "authorizationSupporting" -> this.authorizationSupporting
    "authorizationUrl" -> this.authorizationUrl
    else -> error("$name is not a valid property name")
  }

internal fun CoverageEligibilityResponse.Insurance.Item.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "category" -> true
    "productOrService" -> true
    "modifier" -> true
    "provider" -> true
    "excluded" -> true
    "name" -> true
    "description" -> true
    "network" -> true
    "unit" -> true
    "term" -> true
    "benefit" -> true
    "authorizationRequired" -> true
    "authorizationSupporting" -> true
    "authorizationUrl" -> true
    else -> false
  }

internal fun CoverageEligibilityResponse.Insurance.Item.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.category?.let { add(it) }
  this@getAllChildren.productOrService?.let { add(it) }
  addAll(this@getAllChildren.modifier)
  this@getAllChildren.provider?.let { add(it) }
  this@getAllChildren.excluded?.let { add(it) }
  this@getAllChildren.name?.let { add(it) }
  this@getAllChildren.description?.let { add(it) }
  this@getAllChildren.network?.let { add(it) }
  this@getAllChildren.unit?.let { add(it) }
  this@getAllChildren.term?.let { add(it) }
  addAll(this@getAllChildren.benefit)
  this@getAllChildren.authorizationRequired?.let { add(it) }
  addAll(this@getAllChildren.authorizationSupporting)
  this@getAllChildren.authorizationUrl?.let { add(it) }
}

internal fun CoverageEligibilityResponse.Insurance.Item.Benefit.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "allowed" -> this.allowed
    "used" -> this.used
    else -> error("$name is not a valid property name")
  }

internal fun CoverageEligibilityResponse.Insurance.Item.Benefit.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "allowed" -> true
    "used" -> true
    else -> false
  }

internal fun CoverageEligibilityResponse.Insurance.Item.Benefit.getAllChildren(): List<Any> =
  buildList {
    this@getAllChildren.id?.let { add(it) }
    addAll(this@getAllChildren.extension)
    addAll(this@getAllChildren.modifierExtension)
    add(this@getAllChildren.type)
    this@getAllChildren.allowed?.let { add(it) }
    this@getAllChildren.used?.let { add(it) }
  }

internal fun CoverageEligibilityResponse.Error.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "code" -> this.code
    else -> error("$name is not a valid property name")
  }

internal fun CoverageEligibilityResponse.Error.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "code" -> true
    else -> false
  }

internal fun CoverageEligibilityResponse.Error.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.code)
}
