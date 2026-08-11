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

import dev.ohs.fhir.model.r5.ClaimResponse
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun ClaimResponse.getProperty(name: String): Any? =
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
    "traceNumber" -> this.traceNumber
    "status" -> this.status
    "type" -> this.type
    "subType" -> this.subType
    "use" -> this.use
    "patient" -> this.patient
    "created" -> this.created
    "insurer" -> this.insurer
    "requestor" -> this.requestor
    "request" -> this.request
    "outcome" -> this.outcome
    "decision" -> this.decision
    "disposition" -> this.disposition
    "preAuthRef" -> this.preAuthRef
    "preAuthPeriod" -> this.preAuthPeriod
    "event" -> this.event
    "payeeType" -> this.payeeType
    "encounter" -> this.encounter
    "diagnosisRelatedGroup" -> this.diagnosisRelatedGroup
    "item" -> this.item
    "addItem" -> this.addItem
    "adjudication" -> this.adjudication
    "total" -> this.total
    "payment" -> this.payment
    "fundsReserve" -> this.fundsReserve
    "formCode" -> this.formCode
    "form" -> this.form
    "processNote" -> this.processNote
    "communicationRequest" -> this.communicationRequest
    "insurance" -> this.insurance
    "error" -> this.error
    else -> error("$name is not a valid property name")
  }

internal fun ClaimResponse.hasProperty(name: String): Boolean =
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
    "traceNumber" -> true
    "status" -> true
    "type" -> true
    "subType" -> true
    "use" -> true
    "patient" -> true
    "created" -> true
    "insurer" -> true
    "requestor" -> true
    "request" -> true
    "outcome" -> true
    "decision" -> true
    "disposition" -> true
    "preAuthRef" -> true
    "preAuthPeriod" -> true
    "event" -> true
    "payeeType" -> true
    "encounter" -> true
    "diagnosisRelatedGroup" -> true
    "item" -> true
    "addItem" -> true
    "adjudication" -> true
    "total" -> true
    "payment" -> true
    "fundsReserve" -> true
    "formCode" -> true
    "form" -> true
    "processNote" -> true
    "communicationRequest" -> true
    "insurance" -> true
    "error" -> true
    else -> false
  }

internal fun ClaimResponse.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.meta?.let { add(it) }
  this@getAllChildren.implicitRules?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.contained)
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.identifier)
  addAll(this@getAllChildren.traceNumber)
  add(this@getAllChildren.status)
  add(this@getAllChildren.type)
  this@getAllChildren.subType?.let { add(it) }
  add(this@getAllChildren.use)
  add(this@getAllChildren.patient)
  add(this@getAllChildren.created)
  this@getAllChildren.insurer?.let { add(it) }
  this@getAllChildren.requestor?.let { add(it) }
  this@getAllChildren.request?.let { add(it) }
  add(this@getAllChildren.outcome)
  this@getAllChildren.decision?.let { add(it) }
  this@getAllChildren.disposition?.let { add(it) }
  this@getAllChildren.preAuthRef?.let { add(it) }
  this@getAllChildren.preAuthPeriod?.let { add(it) }
  addAll(this@getAllChildren.event)
  this@getAllChildren.payeeType?.let { add(it) }
  addAll(this@getAllChildren.encounter)
  this@getAllChildren.diagnosisRelatedGroup?.let { add(it) }
  addAll(this@getAllChildren.item)
  addAll(this@getAllChildren.addItem)
  addAll(this@getAllChildren.adjudication)
  addAll(this@getAllChildren.total)
  this@getAllChildren.payment?.let { add(it) }
  this@getAllChildren.fundsReserve?.let { add(it) }
  this@getAllChildren.formCode?.let { add(it) }
  this@getAllChildren.form?.let { add(it) }
  addAll(this@getAllChildren.processNote)
  addAll(this@getAllChildren.communicationRequest)
  addAll(this@getAllChildren.insurance)
  addAll(this@getAllChildren.error)
}

internal fun ClaimResponse.Event.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "when" -> this.`when`
    else -> error("$name is not a valid property name")
  }

internal fun ClaimResponse.Event.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "when" -> true
    else -> false
  }

internal fun ClaimResponse.Event.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.type)
  add(this@getAllChildren.`when`)
}

internal fun ClaimResponse.Item.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "itemSequence" -> this.itemSequence
    "traceNumber" -> this.traceNumber
    "noteNumber" -> this.noteNumber
    "reviewOutcome" -> this.reviewOutcome
    "adjudication" -> this.adjudication
    "detail" -> this.detail
    else -> error("$name is not a valid property name")
  }

internal fun ClaimResponse.Item.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "itemSequence" -> true
    "traceNumber" -> true
    "noteNumber" -> true
    "reviewOutcome" -> true
    "adjudication" -> true
    "detail" -> true
    else -> false
  }

internal fun ClaimResponse.Item.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.itemSequence)
  addAll(this@getAllChildren.traceNumber)
  addAll(this@getAllChildren.noteNumber)
  this@getAllChildren.reviewOutcome?.let { add(it) }
  addAll(this@getAllChildren.adjudication)
  addAll(this@getAllChildren.detail)
}

internal fun ClaimResponse.Item.ReviewOutcome.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "decision" -> this.decision
    "reason" -> this.reason
    "preAuthRef" -> this.preAuthRef
    "preAuthPeriod" -> this.preAuthPeriod
    else -> error("$name is not a valid property name")
  }

internal fun ClaimResponse.Item.ReviewOutcome.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "decision" -> true
    "reason" -> true
    "preAuthRef" -> true
    "preAuthPeriod" -> true
    else -> false
  }

internal fun ClaimResponse.Item.ReviewOutcome.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.decision?.let { add(it) }
  addAll(this@getAllChildren.reason)
  this@getAllChildren.preAuthRef?.let { add(it) }
  this@getAllChildren.preAuthPeriod?.let { add(it) }
}

internal fun ClaimResponse.Item.Adjudication.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "category" -> this.category
    "reason" -> this.reason
    "amount" -> this.amount
    "quantity" -> this.quantity
    else -> error("$name is not a valid property name")
  }

internal fun ClaimResponse.Item.Adjudication.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "category" -> true
    "reason" -> true
    "amount" -> true
    "quantity" -> true
    else -> false
  }

internal fun ClaimResponse.Item.Adjudication.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.category)
  this@getAllChildren.reason?.let { add(it) }
  this@getAllChildren.amount?.let { add(it) }
  this@getAllChildren.quantity?.let { add(it) }
}

internal fun ClaimResponse.Item.Detail.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "detailSequence" -> this.detailSequence
    "traceNumber" -> this.traceNumber
    "noteNumber" -> this.noteNumber
    "reviewOutcome" -> this.reviewOutcome
    "adjudication" -> this.adjudication
    "subDetail" -> this.subDetail
    else -> error("$name is not a valid property name")
  }

internal fun ClaimResponse.Item.Detail.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "detailSequence" -> true
    "traceNumber" -> true
    "noteNumber" -> true
    "reviewOutcome" -> true
    "adjudication" -> true
    "subDetail" -> true
    else -> false
  }

internal fun ClaimResponse.Item.Detail.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.detailSequence)
  addAll(this@getAllChildren.traceNumber)
  addAll(this@getAllChildren.noteNumber)
  this@getAllChildren.reviewOutcome?.let { add(it) }
  addAll(this@getAllChildren.adjudication)
  addAll(this@getAllChildren.subDetail)
}

internal fun ClaimResponse.Item.Detail.SubDetail.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "subDetailSequence" -> this.subDetailSequence
    "traceNumber" -> this.traceNumber
    "noteNumber" -> this.noteNumber
    "reviewOutcome" -> this.reviewOutcome
    "adjudication" -> this.adjudication
    else -> error("$name is not a valid property name")
  }

internal fun ClaimResponse.Item.Detail.SubDetail.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "subDetailSequence" -> true
    "traceNumber" -> true
    "noteNumber" -> true
    "reviewOutcome" -> true
    "adjudication" -> true
    else -> false
  }

internal fun ClaimResponse.Item.Detail.SubDetail.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.subDetailSequence)
  addAll(this@getAllChildren.traceNumber)
  addAll(this@getAllChildren.noteNumber)
  this@getAllChildren.reviewOutcome?.let { add(it) }
  addAll(this@getAllChildren.adjudication)
}

internal fun ClaimResponse.AddItem.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "itemSequence" -> this.itemSequence
    "detailSequence" -> this.detailSequence
    "subdetailSequence" -> this.subdetailSequence
    "traceNumber" -> this.traceNumber
    "provider" -> this.provider
    "revenue" -> this.revenue
    "productOrService" -> this.productOrService
    "productOrServiceEnd" -> this.productOrServiceEnd
    "request" -> this.request
    "modifier" -> this.modifier
    "programCode" -> this.programCode
    "serviced" -> this.serviced
    "location" -> this.location
    "quantity" -> this.quantity
    "unitPrice" -> this.unitPrice
    "factor" -> this.factor
    "tax" -> this.tax
    "net" -> this.net
    "bodySite" -> this.bodySite
    "noteNumber" -> this.noteNumber
    "reviewOutcome" -> this.reviewOutcome
    "adjudication" -> this.adjudication
    "detail" -> this.detail
    else -> error("$name is not a valid property name")
  }

internal fun ClaimResponse.AddItem.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "itemSequence" -> true
    "detailSequence" -> true
    "subdetailSequence" -> true
    "traceNumber" -> true
    "provider" -> true
    "revenue" -> true
    "productOrService" -> true
    "productOrServiceEnd" -> true
    "request" -> true
    "modifier" -> true
    "programCode" -> true
    "serviced" -> true
    "location" -> true
    "quantity" -> true
    "unitPrice" -> true
    "factor" -> true
    "tax" -> true
    "net" -> true
    "bodySite" -> true
    "noteNumber" -> true
    "reviewOutcome" -> true
    "adjudication" -> true
    "detail" -> true
    else -> false
  }

internal fun ClaimResponse.AddItem.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.itemSequence)
  addAll(this@getAllChildren.detailSequence)
  addAll(this@getAllChildren.subdetailSequence)
  addAll(this@getAllChildren.traceNumber)
  addAll(this@getAllChildren.provider)
  this@getAllChildren.revenue?.let { add(it) }
  this@getAllChildren.productOrService?.let { add(it) }
  this@getAllChildren.productOrServiceEnd?.let { add(it) }
  addAll(this@getAllChildren.request)
  addAll(this@getAllChildren.modifier)
  addAll(this@getAllChildren.programCode)
  this@getAllChildren.serviced?.let { add(it) }
  this@getAllChildren.location?.let { add(it) }
  this@getAllChildren.quantity?.let { add(it) }
  this@getAllChildren.unitPrice?.let { add(it) }
  this@getAllChildren.factor?.let { add(it) }
  this@getAllChildren.tax?.let { add(it) }
  this@getAllChildren.net?.let { add(it) }
  addAll(this@getAllChildren.bodySite)
  addAll(this@getAllChildren.noteNumber)
  this@getAllChildren.reviewOutcome?.let { add(it) }
  addAll(this@getAllChildren.adjudication)
  addAll(this@getAllChildren.detail)
}

internal fun ClaimResponse.AddItem.BodySite.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "site" -> this.site
    "subSite" -> this.subSite
    else -> error("$name is not a valid property name")
  }

internal fun ClaimResponse.AddItem.BodySite.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "site" -> true
    "subSite" -> true
    else -> false
  }

internal fun ClaimResponse.AddItem.BodySite.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.site)
  addAll(this@getAllChildren.subSite)
}

internal fun ClaimResponse.AddItem.Detail.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "traceNumber" -> this.traceNumber
    "revenue" -> this.revenue
    "productOrService" -> this.productOrService
    "productOrServiceEnd" -> this.productOrServiceEnd
    "modifier" -> this.modifier
    "quantity" -> this.quantity
    "unitPrice" -> this.unitPrice
    "factor" -> this.factor
    "tax" -> this.tax
    "net" -> this.net
    "noteNumber" -> this.noteNumber
    "reviewOutcome" -> this.reviewOutcome
    "adjudication" -> this.adjudication
    "subDetail" -> this.subDetail
    else -> error("$name is not a valid property name")
  }

internal fun ClaimResponse.AddItem.Detail.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "traceNumber" -> true
    "revenue" -> true
    "productOrService" -> true
    "productOrServiceEnd" -> true
    "modifier" -> true
    "quantity" -> true
    "unitPrice" -> true
    "factor" -> true
    "tax" -> true
    "net" -> true
    "noteNumber" -> true
    "reviewOutcome" -> true
    "adjudication" -> true
    "subDetail" -> true
    else -> false
  }

internal fun ClaimResponse.AddItem.Detail.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.traceNumber)
  this@getAllChildren.revenue?.let { add(it) }
  this@getAllChildren.productOrService?.let { add(it) }
  this@getAllChildren.productOrServiceEnd?.let { add(it) }
  addAll(this@getAllChildren.modifier)
  this@getAllChildren.quantity?.let { add(it) }
  this@getAllChildren.unitPrice?.let { add(it) }
  this@getAllChildren.factor?.let { add(it) }
  this@getAllChildren.tax?.let { add(it) }
  this@getAllChildren.net?.let { add(it) }
  addAll(this@getAllChildren.noteNumber)
  this@getAllChildren.reviewOutcome?.let { add(it) }
  addAll(this@getAllChildren.adjudication)
  addAll(this@getAllChildren.subDetail)
}

internal fun ClaimResponse.AddItem.Detail.SubDetail.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "traceNumber" -> this.traceNumber
    "revenue" -> this.revenue
    "productOrService" -> this.productOrService
    "productOrServiceEnd" -> this.productOrServiceEnd
    "modifier" -> this.modifier
    "quantity" -> this.quantity
    "unitPrice" -> this.unitPrice
    "factor" -> this.factor
    "tax" -> this.tax
    "net" -> this.net
    "noteNumber" -> this.noteNumber
    "reviewOutcome" -> this.reviewOutcome
    "adjudication" -> this.adjudication
    else -> error("$name is not a valid property name")
  }

internal fun ClaimResponse.AddItem.Detail.SubDetail.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "traceNumber" -> true
    "revenue" -> true
    "productOrService" -> true
    "productOrServiceEnd" -> true
    "modifier" -> true
    "quantity" -> true
    "unitPrice" -> true
    "factor" -> true
    "tax" -> true
    "net" -> true
    "noteNumber" -> true
    "reviewOutcome" -> true
    "adjudication" -> true
    else -> false
  }

internal fun ClaimResponse.AddItem.Detail.SubDetail.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.traceNumber)
  this@getAllChildren.revenue?.let { add(it) }
  this@getAllChildren.productOrService?.let { add(it) }
  this@getAllChildren.productOrServiceEnd?.let { add(it) }
  addAll(this@getAllChildren.modifier)
  this@getAllChildren.quantity?.let { add(it) }
  this@getAllChildren.unitPrice?.let { add(it) }
  this@getAllChildren.factor?.let { add(it) }
  this@getAllChildren.tax?.let { add(it) }
  this@getAllChildren.net?.let { add(it) }
  addAll(this@getAllChildren.noteNumber)
  this@getAllChildren.reviewOutcome?.let { add(it) }
  addAll(this@getAllChildren.adjudication)
}

internal fun ClaimResponse.Total.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "category" -> this.category
    "amount" -> this.amount
    else -> error("$name is not a valid property name")
  }

internal fun ClaimResponse.Total.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "category" -> true
    "amount" -> true
    else -> false
  }

internal fun ClaimResponse.Total.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.category)
  add(this@getAllChildren.amount)
}

internal fun ClaimResponse.Payment.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "adjustment" -> this.adjustment
    "adjustmentReason" -> this.adjustmentReason
    "date" -> this.date
    "amount" -> this.amount
    "identifier" -> this.identifier
    else -> error("$name is not a valid property name")
  }

internal fun ClaimResponse.Payment.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "adjustment" -> true
    "adjustmentReason" -> true
    "date" -> true
    "amount" -> true
    "identifier" -> true
    else -> false
  }

internal fun ClaimResponse.Payment.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.type)
  this@getAllChildren.adjustment?.let { add(it) }
  this@getAllChildren.adjustmentReason?.let { add(it) }
  this@getAllChildren.date?.let { add(it) }
  add(this@getAllChildren.amount)
  this@getAllChildren.identifier?.let { add(it) }
}

internal fun ClaimResponse.ProcessNote.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "number" -> this.number
    "type" -> this.type
    "text" -> this.text
    "language" -> this.language
    else -> error("$name is not a valid property name")
  }

internal fun ClaimResponse.ProcessNote.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "number" -> true
    "type" -> true
    "text" -> true
    "language" -> true
    else -> false
  }

internal fun ClaimResponse.ProcessNote.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.number?.let { add(it) }
  this@getAllChildren.type?.let { add(it) }
  add(this@getAllChildren.text)
  this@getAllChildren.language?.let { add(it) }
}

internal fun ClaimResponse.Insurance.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "sequence" -> this.sequence
    "focal" -> this.focal
    "coverage" -> this.coverage
    "businessArrangement" -> this.businessArrangement
    "claimResponse" -> this.claimResponse
    else -> error("$name is not a valid property name")
  }

internal fun ClaimResponse.Insurance.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "sequence" -> true
    "focal" -> true
    "coverage" -> true
    "businessArrangement" -> true
    "claimResponse" -> true
    else -> false
  }

internal fun ClaimResponse.Insurance.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.sequence)
  add(this@getAllChildren.focal)
  add(this@getAllChildren.coverage)
  this@getAllChildren.businessArrangement?.let { add(it) }
  this@getAllChildren.claimResponse?.let { add(it) }
}

internal fun ClaimResponse.Error.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "itemSequence" -> this.itemSequence
    "detailSequence" -> this.detailSequence
    "subDetailSequence" -> this.subDetailSequence
    "code" -> this.code
    "expression" -> this.expression
    else -> error("$name is not a valid property name")
  }

internal fun ClaimResponse.Error.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "itemSequence" -> true
    "detailSequence" -> true
    "subDetailSequence" -> true
    "code" -> true
    "expression" -> true
    else -> false
  }

internal fun ClaimResponse.Error.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.itemSequence?.let { add(it) }
  this@getAllChildren.detailSequence?.let { add(it) }
  this@getAllChildren.subDetailSequence?.let { add(it) }
  add(this@getAllChildren.code)
  addAll(this@getAllChildren.expression)
}
