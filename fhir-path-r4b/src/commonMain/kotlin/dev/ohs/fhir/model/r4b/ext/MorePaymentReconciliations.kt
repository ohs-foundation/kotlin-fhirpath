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

import dev.ohs.fhir.model.r4b.PaymentReconciliation
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun PaymentReconciliation.getProperty(name: String): Any? =
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
    "period" -> this.period
    "created" -> this.created
    "paymentIssuer" -> this.paymentIssuer
    "request" -> this.request
    "requestor" -> this.requestor
    "outcome" -> this.outcome
    "disposition" -> this.disposition
    "paymentDate" -> this.paymentDate
    "paymentAmount" -> this.paymentAmount
    "paymentIdentifier" -> this.paymentIdentifier
    "detail" -> this.detail
    "formCode" -> this.formCode
    "processNote" -> this.processNote
    else -> error("$name is not a valid property name")
  }

internal fun PaymentReconciliation.hasProperty(name: String): Boolean =
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
    "period" -> true
    "created" -> true
    "paymentIssuer" -> true
    "request" -> true
    "requestor" -> true
    "outcome" -> true
    "disposition" -> true
    "paymentDate" -> true
    "paymentAmount" -> true
    "paymentIdentifier" -> true
    "detail" -> true
    "formCode" -> true
    "processNote" -> true
    else -> false
  }

internal fun PaymentReconciliation.getAllChildren(): List<Any> = buildList {
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
  this@getAllChildren.period?.let { add(it) }
  add(this@getAllChildren.created)
  this@getAllChildren.paymentIssuer?.let { add(it) }
  this@getAllChildren.request?.let { add(it) }
  this@getAllChildren.requestor?.let { add(it) }
  this@getAllChildren.outcome?.let { add(it) }
  this@getAllChildren.disposition?.let { add(it) }
  add(this@getAllChildren.paymentDate)
  add(this@getAllChildren.paymentAmount)
  this@getAllChildren.paymentIdentifier?.let { add(it) }
  addAll(this@getAllChildren.detail)
  this@getAllChildren.formCode?.let { add(it) }
  addAll(this@getAllChildren.processNote)
}

internal fun PaymentReconciliation.Detail.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "identifier" -> this.identifier
    "predecessor" -> this.predecessor
    "type" -> this.type
    "request" -> this.request
    "submitter" -> this.submitter
    "response" -> this.response
    "date" -> this.date
    "responsible" -> this.responsible
    "payee" -> this.payee
    "amount" -> this.amount
    else -> error("$name is not a valid property name")
  }

internal fun PaymentReconciliation.Detail.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "identifier" -> true
    "predecessor" -> true
    "type" -> true
    "request" -> true
    "submitter" -> true
    "response" -> true
    "date" -> true
    "responsible" -> true
    "payee" -> true
    "amount" -> true
    else -> false
  }

internal fun PaymentReconciliation.Detail.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.identifier?.let { add(it) }
  this@getAllChildren.predecessor?.let { add(it) }
  add(this@getAllChildren.type)
  this@getAllChildren.request?.let { add(it) }
  this@getAllChildren.submitter?.let { add(it) }
  this@getAllChildren.response?.let { add(it) }
  this@getAllChildren.date?.let { add(it) }
  this@getAllChildren.responsible?.let { add(it) }
  this@getAllChildren.payee?.let { add(it) }
  this@getAllChildren.amount?.let { add(it) }
}

internal fun PaymentReconciliation.ProcessNote.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "text" -> this.text
    else -> error("$name is not a valid property name")
  }

internal fun PaymentReconciliation.ProcessNote.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "text" -> true
    else -> false
  }

internal fun PaymentReconciliation.ProcessNote.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.type?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
}
