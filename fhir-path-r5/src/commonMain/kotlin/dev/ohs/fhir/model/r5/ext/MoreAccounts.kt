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

import dev.ohs.fhir.model.r5.Account
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun Account.getProperty(name: String): Any? =
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
    "billingStatus" -> this.billingStatus
    "type" -> this.type
    "name" -> this.name
    "subject" -> this.subject
    "servicePeriod" -> this.servicePeriod
    "coverage" -> this.coverage
    "owner" -> this.owner
    "description" -> this.description
    "guarantor" -> this.guarantor
    "diagnosis" -> this.diagnosis
    "procedure" -> this.procedure
    "relatedAccount" -> this.relatedAccount
    "currency" -> this.currency
    "balance" -> this.balance
    "calculatedAt" -> this.calculatedAt
    else -> error("$name is not a valid property name")
  }

internal fun Account.hasProperty(name: String): Boolean =
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
    "billingStatus" -> true
    "type" -> true
    "name" -> true
    "subject" -> true
    "servicePeriod" -> true
    "coverage" -> true
    "owner" -> true
    "description" -> true
    "guarantor" -> true
    "diagnosis" -> true
    "procedure" -> true
    "relatedAccount" -> true
    "currency" -> true
    "balance" -> true
    "calculatedAt" -> true
    else -> false
  }

internal fun Account.getAllChildren(): List<Any> = buildList {
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
  this@getAllChildren.billingStatus?.let { add(it) }
  this@getAllChildren.type?.let { add(it) }
  this@getAllChildren.name?.let { add(it) }
  addAll(this@getAllChildren.subject)
  this@getAllChildren.servicePeriod?.let { add(it) }
  addAll(this@getAllChildren.coverage)
  this@getAllChildren.owner?.let { add(it) }
  this@getAllChildren.description?.let { add(it) }
  addAll(this@getAllChildren.guarantor)
  addAll(this@getAllChildren.diagnosis)
  addAll(this@getAllChildren.procedure)
  addAll(this@getAllChildren.relatedAccount)
  this@getAllChildren.currency?.let { add(it) }
  addAll(this@getAllChildren.balance)
  this@getAllChildren.calculatedAt?.let { add(it) }
}

internal fun Account.Coverage.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "coverage" -> this.coverage
    "priority" -> this.priority
    else -> error("$name is not a valid property name")
  }

internal fun Account.Coverage.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "coverage" -> true
    "priority" -> true
    else -> false
  }

internal fun Account.Coverage.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.coverage)
  this@getAllChildren.priority?.let { add(it) }
}

internal fun Account.Guarantor.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "party" -> this.party
    "onHold" -> this.onHold
    "period" -> this.period
    else -> error("$name is not a valid property name")
  }

internal fun Account.Guarantor.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "party" -> true
    "onHold" -> true
    "period" -> true
    else -> false
  }

internal fun Account.Guarantor.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.party)
  this@getAllChildren.onHold?.let { add(it) }
  this@getAllChildren.period?.let { add(it) }
}

internal fun Account.Diagnosis.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "sequence" -> this.sequence
    "condition" -> this.condition
    "dateOfDiagnosis" -> this.dateOfDiagnosis
    "type" -> this.type
    "onAdmission" -> this.onAdmission
    "packageCode" -> this.packageCode
    else -> error("$name is not a valid property name")
  }

internal fun Account.Diagnosis.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "sequence" -> true
    "condition" -> true
    "dateOfDiagnosis" -> true
    "type" -> true
    "onAdmission" -> true
    "packageCode" -> true
    else -> false
  }

internal fun Account.Diagnosis.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.sequence?.let { add(it) }
  add(this@getAllChildren.condition)
  this@getAllChildren.dateOfDiagnosis?.let { add(it) }
  addAll(this@getAllChildren.type)
  this@getAllChildren.onAdmission?.let { add(it) }
  addAll(this@getAllChildren.packageCode)
}

internal fun Account.Procedure.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "sequence" -> this.sequence
    "code" -> this.code
    "dateOfService" -> this.dateOfService
    "type" -> this.type
    "packageCode" -> this.packageCode
    "device" -> this.device
    else -> error("$name is not a valid property name")
  }

internal fun Account.Procedure.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "sequence" -> true
    "code" -> true
    "dateOfService" -> true
    "type" -> true
    "packageCode" -> true
    "device" -> true
    else -> false
  }

internal fun Account.Procedure.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.sequence?.let { add(it) }
  add(this@getAllChildren.code)
  this@getAllChildren.dateOfService?.let { add(it) }
  addAll(this@getAllChildren.type)
  addAll(this@getAllChildren.packageCode)
  addAll(this@getAllChildren.device)
}

internal fun Account.RelatedAccount.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "relationship" -> this.relationship
    "account" -> this.account
    else -> error("$name is not a valid property name")
  }

internal fun Account.RelatedAccount.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "relationship" -> true
    "account" -> true
    else -> false
  }

internal fun Account.RelatedAccount.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.relationship?.let { add(it) }
  add(this@getAllChildren.account)
}

internal fun Account.Balance.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "aggregate" -> this.aggregate
    "term" -> this.term
    "estimate" -> this.estimate
    "amount" -> this.amount
    else -> error("$name is not a valid property name")
  }

internal fun Account.Balance.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "aggregate" -> true
    "term" -> true
    "estimate" -> true
    "amount" -> true
    else -> false
  }

internal fun Account.Balance.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.aggregate?.let { add(it) }
  this@getAllChildren.term?.let { add(it) }
  this@getAllChildren.estimate?.let { add(it) }
  add(this@getAllChildren.amount)
}
