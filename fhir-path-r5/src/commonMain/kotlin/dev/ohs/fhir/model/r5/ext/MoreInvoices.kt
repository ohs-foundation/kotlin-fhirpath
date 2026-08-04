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

import dev.ohs.fhir.model.r5.Invoice
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun Invoice.getProperty(name: String): Any? =
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
    "cancelledReason" -> this.cancelledReason
    "type" -> this.type
    "subject" -> this.subject
    "recipient" -> this.recipient
    "date" -> this.date
    "creation" -> this.creation
    "period" -> this.period
    "participant" -> this.participant
    "issuer" -> this.issuer
    "account" -> this.account
    "lineItem" -> this.lineItem
    "totalPriceComponent" -> this.totalPriceComponent
    "totalNet" -> this.totalNet
    "totalGross" -> this.totalGross
    "paymentTerms" -> this.paymentTerms
    "note" -> this.note
    else -> error("$name is not a valid property name")
  }

internal fun Invoice.hasProperty(name: String): Boolean =
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
    "cancelledReason" -> true
    "type" -> true
    "subject" -> true
    "recipient" -> true
    "date" -> true
    "creation" -> true
    "period" -> true
    "participant" -> true
    "issuer" -> true
    "account" -> true
    "lineItem" -> true
    "totalPriceComponent" -> true
    "totalNet" -> true
    "totalGross" -> true
    "paymentTerms" -> true
    "note" -> true
    else -> false
  }

internal fun Invoice.getAllChildren(): List<Any> = buildList {
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
  this@getAllChildren.cancelledReason?.let { add(it) }
  this@getAllChildren.type?.let { add(it) }
  this@getAllChildren.subject?.let { add(it) }
  this@getAllChildren.recipient?.let { add(it) }
  this@getAllChildren.date?.let { add(it) }
  this@getAllChildren.creation?.let { add(it) }
  this@getAllChildren.period?.let { add(it) }
  addAll(this@getAllChildren.participant)
  this@getAllChildren.issuer?.let { add(it) }
  this@getAllChildren.account?.let { add(it) }
  addAll(this@getAllChildren.lineItem)
  addAll(this@getAllChildren.totalPriceComponent)
  this@getAllChildren.totalNet?.let { add(it) }
  this@getAllChildren.totalGross?.let { add(it) }
  this@getAllChildren.paymentTerms?.let { add(it) }
  addAll(this@getAllChildren.note)
}

internal fun Invoice.Participant.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "role" -> this.role
    "actor" -> this.actor
    else -> error("$name is not a valid property name")
  }

internal fun Invoice.Participant.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "role" -> true
    "actor" -> true
    else -> false
  }

internal fun Invoice.Participant.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.role?.let { add(it) }
  add(this@getAllChildren.actor)
}

internal fun Invoice.LineItem.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "sequence" -> this.sequence
    "serviced" -> this.serviced
    "chargeItem" -> this.chargeItem
    "priceComponent" -> this.priceComponent
    else -> error("$name is not a valid property name")
  }

internal fun Invoice.LineItem.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "sequence" -> true
    "serviced" -> true
    "chargeItem" -> true
    "priceComponent" -> true
    else -> false
  }

internal fun Invoice.LineItem.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.sequence?.let { add(it) }
  this@getAllChildren.serviced?.let { add(it) }
  add(this@getAllChildren.chargeItem)
  addAll(this@getAllChildren.priceComponent)
}
