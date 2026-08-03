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

import dev.ohs.fhir.model.r4b.InsurancePlan
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun InsurancePlan.getProperty(name: String): Any? =
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
    "name" -> this.name
    "alias" -> this.alias
    "period" -> this.period
    "ownedBy" -> this.ownedBy
    "administeredBy" -> this.administeredBy
    "coverageArea" -> this.coverageArea
    "contact" -> this.contact
    "endpoint" -> this.endpoint
    "network" -> this.network
    "coverage" -> this.coverage
    "plan" -> this.plan
    else -> error("$name is not a valid property name")
  }

internal fun InsurancePlan.hasProperty(name: String): Boolean =
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
    "name" -> true
    "alias" -> true
    "period" -> true
    "ownedBy" -> true
    "administeredBy" -> true
    "coverageArea" -> true
    "contact" -> true
    "endpoint" -> true
    "network" -> true
    "coverage" -> true
    "plan" -> true
    else -> false
  }

internal fun InsurancePlan.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.meta?.let { add(it) }
  this@getAllChildren.implicitRules?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.contained)
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.identifier)
  this@getAllChildren.status?.let { add(it) }
  addAll(this@getAllChildren.type)
  this@getAllChildren.name?.let { add(it) }
  addAll(this@getAllChildren.alias)
  this@getAllChildren.period?.let { add(it) }
  this@getAllChildren.ownedBy?.let { add(it) }
  this@getAllChildren.administeredBy?.let { add(it) }
  addAll(this@getAllChildren.coverageArea)
  addAll(this@getAllChildren.contact)
  addAll(this@getAllChildren.endpoint)
  addAll(this@getAllChildren.network)
  addAll(this@getAllChildren.coverage)
  addAll(this@getAllChildren.plan)
}

internal fun InsurancePlan.Contact.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "purpose" -> this.purpose
    "name" -> this.name
    "telecom" -> this.telecom
    "address" -> this.address
    else -> error("$name is not a valid property name")
  }

internal fun InsurancePlan.Contact.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "purpose" -> true
    "name" -> true
    "telecom" -> true
    "address" -> true
    else -> false
  }

internal fun InsurancePlan.Contact.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.purpose?.let { add(it) }
  this@getAllChildren.name?.let { add(it) }
  addAll(this@getAllChildren.telecom)
  this@getAllChildren.address?.let { add(it) }
}

internal fun InsurancePlan.Coverage.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "network" -> this.network
    "benefit" -> this.benefit
    else -> error("$name is not a valid property name")
  }

internal fun InsurancePlan.Coverage.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "network" -> true
    "benefit" -> true
    else -> false
  }

internal fun InsurancePlan.Coverage.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.type)
  addAll(this@getAllChildren.network)
  addAll(this@getAllChildren.benefit)
}

internal fun InsurancePlan.Coverage.Benefit.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "requirement" -> this.requirement
    "limit" -> this.limit
    else -> error("$name is not a valid property name")
  }

internal fun InsurancePlan.Coverage.Benefit.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "requirement" -> true
    "limit" -> true
    else -> false
  }

internal fun InsurancePlan.Coverage.Benefit.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.type)
  this@getAllChildren.requirement?.let { add(it) }
  addAll(this@getAllChildren.limit)
}

internal fun InsurancePlan.Coverage.Benefit.Limit.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "value" -> this.`value`
    "code" -> this.code
    else -> error("$name is not a valid property name")
  }

internal fun InsurancePlan.Coverage.Benefit.Limit.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "value" -> true
    "code" -> true
    else -> false
  }

internal fun InsurancePlan.Coverage.Benefit.Limit.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.`value`?.let { add(it) }
  this@getAllChildren.code?.let { add(it) }
}

internal fun InsurancePlan.Plan.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "identifier" -> this.identifier
    "type" -> this.type
    "coverageArea" -> this.coverageArea
    "network" -> this.network
    "generalCost" -> this.generalCost
    "specificCost" -> this.specificCost
    else -> error("$name is not a valid property name")
  }

internal fun InsurancePlan.Plan.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "identifier" -> true
    "type" -> true
    "coverageArea" -> true
    "network" -> true
    "generalCost" -> true
    "specificCost" -> true
    else -> false
  }

internal fun InsurancePlan.Plan.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.identifier)
  this@getAllChildren.type?.let { add(it) }
  addAll(this@getAllChildren.coverageArea)
  addAll(this@getAllChildren.network)
  addAll(this@getAllChildren.generalCost)
  addAll(this@getAllChildren.specificCost)
}

internal fun InsurancePlan.Plan.GeneralCost.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "groupSize" -> this.groupSize
    "cost" -> this.cost
    "comment" -> this.comment
    else -> error("$name is not a valid property name")
  }

internal fun InsurancePlan.Plan.GeneralCost.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "groupSize" -> true
    "cost" -> true
    "comment" -> true
    else -> false
  }

internal fun InsurancePlan.Plan.GeneralCost.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.type?.let { add(it) }
  this@getAllChildren.groupSize?.let { add(it) }
  this@getAllChildren.cost?.let { add(it) }
  this@getAllChildren.comment?.let { add(it) }
}

internal fun InsurancePlan.Plan.SpecificCost.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "category" -> this.category
    "benefit" -> this.benefit
    else -> error("$name is not a valid property name")
  }

internal fun InsurancePlan.Plan.SpecificCost.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "category" -> true
    "benefit" -> true
    else -> false
  }

internal fun InsurancePlan.Plan.SpecificCost.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.category)
  addAll(this@getAllChildren.benefit)
}

internal fun InsurancePlan.Plan.SpecificCost.Benefit.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "cost" -> this.cost
    else -> error("$name is not a valid property name")
  }

internal fun InsurancePlan.Plan.SpecificCost.Benefit.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "cost" -> true
    else -> false
  }

internal fun InsurancePlan.Plan.SpecificCost.Benefit.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.type)
  addAll(this@getAllChildren.cost)
}

internal fun InsurancePlan.Plan.SpecificCost.Benefit.Cost.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "applicability" -> this.applicability
    "qualifiers" -> this.qualifiers
    "value" -> this.`value`
    else -> error("$name is not a valid property name")
  }

internal fun InsurancePlan.Plan.SpecificCost.Benefit.Cost.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "applicability" -> true
    "qualifiers" -> true
    "value" -> true
    else -> false
  }

internal fun InsurancePlan.Plan.SpecificCost.Benefit.Cost.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.type)
  this@getAllChildren.applicability?.let { add(it) }
  addAll(this@getAllChildren.qualifiers)
  this@getAllChildren.`value`?.let { add(it) }
}
