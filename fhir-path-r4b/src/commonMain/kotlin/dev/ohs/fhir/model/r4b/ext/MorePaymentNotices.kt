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

import dev.ohs.fhir.model.r4b.PaymentNotice
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun PaymentNotice.getProperty(name: String): Any? =
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
    "request" -> this.request
    "response" -> this.response
    "created" -> this.created
    "provider" -> this.provider
    "payment" -> this.payment
    "paymentDate" -> this.paymentDate
    "payee" -> this.payee
    "recipient" -> this.recipient
    "amount" -> this.amount
    "paymentStatus" -> this.paymentStatus
    else -> error("$name is not a valid property name")
  }

internal fun PaymentNotice.hasProperty(name: String): Boolean =
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
    "request" -> true
    "response" -> true
    "created" -> true
    "provider" -> true
    "payment" -> true
    "paymentDate" -> true
    "payee" -> true
    "recipient" -> true
    "amount" -> true
    "paymentStatus" -> true
    else -> false
  }

internal fun PaymentNotice.getAllChildren(): List<Any> = buildList {
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
  this@getAllChildren.request?.let { add(it) }
  this@getAllChildren.response?.let { add(it) }
  add(this@getAllChildren.created)
  this@getAllChildren.provider?.let { add(it) }
  add(this@getAllChildren.payment)
  this@getAllChildren.paymentDate?.let { add(it) }
  this@getAllChildren.payee?.let { add(it) }
  add(this@getAllChildren.recipient)
  add(this@getAllChildren.amount)
  this@getAllChildren.paymentStatus?.let { add(it) }
}
