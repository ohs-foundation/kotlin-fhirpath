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

import dev.ohs.fhir.model.r4.ChargeItem
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun ChargeItem.getProperty(name: String): Any? =
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
    "definitionUri" -> this.definitionUri
    "definitionCanonical" -> this.definitionCanonical
    "status" -> this.status
    "partOf" -> this.partOf
    "code" -> this.code
    "subject" -> this.subject
    "context" -> this.context
    "occurrence" -> this.occurrence
    "performer" -> this.performer
    "performingOrganization" -> this.performingOrganization
    "requestingOrganization" -> this.requestingOrganization
    "costCenter" -> this.costCenter
    "quantity" -> this.quantity
    "bodysite" -> this.bodysite
    "factorOverride" -> this.factorOverride
    "priceOverride" -> this.priceOverride
    "overrideReason" -> this.overrideReason
    "enterer" -> this.enterer
    "enteredDate" -> this.enteredDate
    "reason" -> this.reason
    "service" -> this.service
    "product" -> this.product
    "account" -> this.account
    "note" -> this.note
    "supportingInformation" -> this.supportingInformation
    else -> error("$name is not a valid property name")
  }

internal fun ChargeItem.hasProperty(name: String): Boolean =
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
    "definitionUri" -> true
    "definitionCanonical" -> true
    "status" -> true
    "partOf" -> true
    "code" -> true
    "subject" -> true
    "context" -> true
    "occurrence" -> true
    "performer" -> true
    "performingOrganization" -> true
    "requestingOrganization" -> true
    "costCenter" -> true
    "quantity" -> true
    "bodysite" -> true
    "factorOverride" -> true
    "priceOverride" -> true
    "overrideReason" -> true
    "enterer" -> true
    "enteredDate" -> true
    "reason" -> true
    "service" -> true
    "product" -> true
    "account" -> true
    "note" -> true
    "supportingInformation" -> true
    else -> false
  }

internal fun ChargeItem.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.meta?.let { add(it) }
  this@getAllChildren.implicitRules?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.contained)
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.identifier)
  addAll(this@getAllChildren.definitionUri)
  addAll(this@getAllChildren.definitionCanonical)
  add(this@getAllChildren.status)
  addAll(this@getAllChildren.partOf)
  add(this@getAllChildren.code)
  add(this@getAllChildren.subject)
  this@getAllChildren.context?.let { add(it) }
  this@getAllChildren.occurrence?.let { add(it) }
  addAll(this@getAllChildren.performer)
  this@getAllChildren.performingOrganization?.let { add(it) }
  this@getAllChildren.requestingOrganization?.let { add(it) }
  this@getAllChildren.costCenter?.let { add(it) }
  this@getAllChildren.quantity?.let { add(it) }
  addAll(this@getAllChildren.bodysite)
  this@getAllChildren.factorOverride?.let { add(it) }
  this@getAllChildren.priceOverride?.let { add(it) }
  this@getAllChildren.overrideReason?.let { add(it) }
  this@getAllChildren.enterer?.let { add(it) }
  this@getAllChildren.enteredDate?.let { add(it) }
  addAll(this@getAllChildren.reason)
  addAll(this@getAllChildren.service)
  this@getAllChildren.product?.let { add(it) }
  addAll(this@getAllChildren.account)
  addAll(this@getAllChildren.note)
  addAll(this@getAllChildren.supportingInformation)
}

internal fun ChargeItem.Performer.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "function" -> this.function
    "actor" -> this.actor
    else -> error("$name is not a valid property name")
  }

internal fun ChargeItem.Performer.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "function" -> true
    "actor" -> true
    else -> false
  }

internal fun ChargeItem.Performer.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.function?.let { add(it) }
  add(this@getAllChildren.actor)
}
