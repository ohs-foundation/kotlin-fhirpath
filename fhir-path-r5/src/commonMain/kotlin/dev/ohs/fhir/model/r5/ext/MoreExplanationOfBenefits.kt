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

import dev.ohs.fhir.model.r5.ExplanationOfBenefit
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun ExplanationOfBenefit.getProperty(name: String): Any? =
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
    "billablePeriod" -> this.billablePeriod
    "created" -> this.created
    "enterer" -> this.enterer
    "insurer" -> this.insurer
    "provider" -> this.provider
    "priority" -> this.priority
    "fundsReserveRequested" -> this.fundsReserveRequested
    "fundsReserve" -> this.fundsReserve
    "related" -> this.related
    "prescription" -> this.prescription
    "originalPrescription" -> this.originalPrescription
    "event" -> this.event
    "payee" -> this.payee
    "referral" -> this.referral
    "encounter" -> this.encounter
    "facility" -> this.facility
    "claim" -> this.claim
    "claimResponse" -> this.claimResponse
    "outcome" -> this.outcome
    "decision" -> this.decision
    "disposition" -> this.disposition
    "preAuthRef" -> this.preAuthRef
    "preAuthRefPeriod" -> this.preAuthRefPeriod
    "diagnosisRelatedGroup" -> this.diagnosisRelatedGroup
    "careTeam" -> this.careTeam
    "supportingInfo" -> this.supportingInfo
    "diagnosis" -> this.diagnosis
    "procedure" -> this.procedure
    "precedence" -> this.precedence
    "insurance" -> this.insurance
    "accident" -> this.accident
    "patientPaid" -> this.patientPaid
    "item" -> this.item
    "addItem" -> this.addItem
    "adjudication" -> this.adjudication
    "total" -> this.total
    "payment" -> this.payment
    "formCode" -> this.formCode
    "form" -> this.form
    "processNote" -> this.processNote
    "benefitPeriod" -> this.benefitPeriod
    "benefitBalance" -> this.benefitBalance
    else -> error("$name is not a valid property name")
  }

internal fun ExplanationOfBenefit.hasProperty(name: String): Boolean =
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
    "billablePeriod" -> true
    "created" -> true
    "enterer" -> true
    "insurer" -> true
    "provider" -> true
    "priority" -> true
    "fundsReserveRequested" -> true
    "fundsReserve" -> true
    "related" -> true
    "prescription" -> true
    "originalPrescription" -> true
    "event" -> true
    "payee" -> true
    "referral" -> true
    "encounter" -> true
    "facility" -> true
    "claim" -> true
    "claimResponse" -> true
    "outcome" -> true
    "decision" -> true
    "disposition" -> true
    "preAuthRef" -> true
    "preAuthRefPeriod" -> true
    "diagnosisRelatedGroup" -> true
    "careTeam" -> true
    "supportingInfo" -> true
    "diagnosis" -> true
    "procedure" -> true
    "precedence" -> true
    "insurance" -> true
    "accident" -> true
    "patientPaid" -> true
    "item" -> true
    "addItem" -> true
    "adjudication" -> true
    "total" -> true
    "payment" -> true
    "formCode" -> true
    "form" -> true
    "processNote" -> true
    "benefitPeriod" -> true
    "benefitBalance" -> true
    else -> false
  }

internal fun ExplanationOfBenefit.getAllChildren(): List<Any> = buildList {
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
  this@getAllChildren.billablePeriod?.let { add(it) }
  add(this@getAllChildren.created)
  this@getAllChildren.enterer?.let { add(it) }
  this@getAllChildren.insurer?.let { add(it) }
  this@getAllChildren.provider?.let { add(it) }
  this@getAllChildren.priority?.let { add(it) }
  this@getAllChildren.fundsReserveRequested?.let { add(it) }
  this@getAllChildren.fundsReserve?.let { add(it) }
  addAll(this@getAllChildren.related)
  this@getAllChildren.prescription?.let { add(it) }
  this@getAllChildren.originalPrescription?.let { add(it) }
  addAll(this@getAllChildren.event)
  this@getAllChildren.payee?.let { add(it) }
  this@getAllChildren.referral?.let { add(it) }
  addAll(this@getAllChildren.encounter)
  this@getAllChildren.facility?.let { add(it) }
  this@getAllChildren.claim?.let { add(it) }
  this@getAllChildren.claimResponse?.let { add(it) }
  add(this@getAllChildren.outcome)
  this@getAllChildren.decision?.let { add(it) }
  this@getAllChildren.disposition?.let { add(it) }
  addAll(this@getAllChildren.preAuthRef)
  addAll(this@getAllChildren.preAuthRefPeriod)
  this@getAllChildren.diagnosisRelatedGroup?.let { add(it) }
  addAll(this@getAllChildren.careTeam)
  addAll(this@getAllChildren.supportingInfo)
  addAll(this@getAllChildren.diagnosis)
  addAll(this@getAllChildren.procedure)
  this@getAllChildren.precedence?.let { add(it) }
  addAll(this@getAllChildren.insurance)
  this@getAllChildren.accident?.let { add(it) }
  this@getAllChildren.patientPaid?.let { add(it) }
  addAll(this@getAllChildren.item)
  addAll(this@getAllChildren.addItem)
  addAll(this@getAllChildren.adjudication)
  addAll(this@getAllChildren.total)
  this@getAllChildren.payment?.let { add(it) }
  this@getAllChildren.formCode?.let { add(it) }
  this@getAllChildren.form?.let { add(it) }
  addAll(this@getAllChildren.processNote)
  this@getAllChildren.benefitPeriod?.let { add(it) }
  addAll(this@getAllChildren.benefitBalance)
}

internal fun ExplanationOfBenefit.Related.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "claim" -> this.claim
    "relationship" -> this.relationship
    "reference" -> this.reference
    else -> error("$name is not a valid property name")
  }

internal fun ExplanationOfBenefit.Related.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "claim" -> true
    "relationship" -> true
    "reference" -> true
    else -> false
  }

internal fun ExplanationOfBenefit.Related.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.claim?.let { add(it) }
  this@getAllChildren.relationship?.let { add(it) }
  this@getAllChildren.reference?.let { add(it) }
}

internal fun ExplanationOfBenefit.Event.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "when" -> this.`when`
    else -> error("$name is not a valid property name")
  }

internal fun ExplanationOfBenefit.Event.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "when" -> true
    else -> false
  }

internal fun ExplanationOfBenefit.Event.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.type)
  add(this@getAllChildren.`when`)
}

internal fun ExplanationOfBenefit.Payee.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "party" -> this.party
    else -> error("$name is not a valid property name")
  }

internal fun ExplanationOfBenefit.Payee.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "party" -> true
    else -> false
  }

internal fun ExplanationOfBenefit.Payee.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.type?.let { add(it) }
  this@getAllChildren.party?.let { add(it) }
}

internal fun ExplanationOfBenefit.CareTeam.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "sequence" -> this.sequence
    "provider" -> this.provider
    "responsible" -> this.responsible
    "role" -> this.role
    "specialty" -> this.specialty
    else -> error("$name is not a valid property name")
  }

internal fun ExplanationOfBenefit.CareTeam.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "sequence" -> true
    "provider" -> true
    "responsible" -> true
    "role" -> true
    "specialty" -> true
    else -> false
  }

internal fun ExplanationOfBenefit.CareTeam.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.sequence)
  add(this@getAllChildren.provider)
  this@getAllChildren.responsible?.let { add(it) }
  this@getAllChildren.role?.let { add(it) }
  this@getAllChildren.specialty?.let { add(it) }
}

internal fun ExplanationOfBenefit.SupportingInfo.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "sequence" -> this.sequence
    "category" -> this.category
    "code" -> this.code
    "timing" -> this.timing
    "value" -> this.`value`
    "reason" -> this.reason
    else -> error("$name is not a valid property name")
  }

internal fun ExplanationOfBenefit.SupportingInfo.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "sequence" -> true
    "category" -> true
    "code" -> true
    "timing" -> true
    "value" -> true
    "reason" -> true
    else -> false
  }

internal fun ExplanationOfBenefit.SupportingInfo.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.sequence)
  add(this@getAllChildren.category)
  this@getAllChildren.code?.let { add(it) }
  this@getAllChildren.timing?.let { add(it) }
  this@getAllChildren.`value`?.let { add(it) }
  this@getAllChildren.reason?.let { add(it) }
}

internal fun ExplanationOfBenefit.Diagnosis.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "sequence" -> this.sequence
    "diagnosis" -> this.diagnosis
    "type" -> this.type
    "onAdmission" -> this.onAdmission
    else -> error("$name is not a valid property name")
  }

internal fun ExplanationOfBenefit.Diagnosis.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "sequence" -> true
    "diagnosis" -> true
    "type" -> true
    "onAdmission" -> true
    else -> false
  }

internal fun ExplanationOfBenefit.Diagnosis.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.sequence)
  add(this@getAllChildren.diagnosis)
  addAll(this@getAllChildren.type)
  this@getAllChildren.onAdmission?.let { add(it) }
}

internal fun ExplanationOfBenefit.Procedure.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "sequence" -> this.sequence
    "type" -> this.type
    "date" -> this.date
    "procedure" -> this.procedure
    "udi" -> this.udi
    else -> error("$name is not a valid property name")
  }

internal fun ExplanationOfBenefit.Procedure.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "sequence" -> true
    "type" -> true
    "date" -> true
    "procedure" -> true
    "udi" -> true
    else -> false
  }

internal fun ExplanationOfBenefit.Procedure.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.sequence)
  addAll(this@getAllChildren.type)
  this@getAllChildren.date?.let { add(it) }
  add(this@getAllChildren.procedure)
  addAll(this@getAllChildren.udi)
}

internal fun ExplanationOfBenefit.Insurance.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "focal" -> this.focal
    "coverage" -> this.coverage
    "preAuthRef" -> this.preAuthRef
    else -> error("$name is not a valid property name")
  }

internal fun ExplanationOfBenefit.Insurance.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "focal" -> true
    "coverage" -> true
    "preAuthRef" -> true
    else -> false
  }

internal fun ExplanationOfBenefit.Insurance.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.focal)
  add(this@getAllChildren.coverage)
  addAll(this@getAllChildren.preAuthRef)
}

internal fun ExplanationOfBenefit.Accident.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "date" -> this.date
    "type" -> this.type
    "location" -> this.location
    else -> error("$name is not a valid property name")
  }

internal fun ExplanationOfBenefit.Accident.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "date" -> true
    "type" -> true
    "location" -> true
    else -> false
  }

internal fun ExplanationOfBenefit.Accident.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.date?.let { add(it) }
  this@getAllChildren.type?.let { add(it) }
  this@getAllChildren.location?.let { add(it) }
}

internal fun ExplanationOfBenefit.Item.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "sequence" -> this.sequence
    "careTeamSequence" -> this.careTeamSequence
    "diagnosisSequence" -> this.diagnosisSequence
    "procedureSequence" -> this.procedureSequence
    "informationSequence" -> this.informationSequence
    "traceNumber" -> this.traceNumber
    "revenue" -> this.revenue
    "category" -> this.category
    "productOrService" -> this.productOrService
    "productOrServiceEnd" -> this.productOrServiceEnd
    "request" -> this.request
    "modifier" -> this.modifier
    "programCode" -> this.programCode
    "serviced" -> this.serviced
    "location" -> this.location
    "patientPaid" -> this.patientPaid
    "quantity" -> this.quantity
    "unitPrice" -> this.unitPrice
    "factor" -> this.factor
    "tax" -> this.tax
    "net" -> this.net
    "udi" -> this.udi
    "bodySite" -> this.bodySite
    "encounter" -> this.encounter
    "noteNumber" -> this.noteNumber
    "reviewOutcome" -> this.reviewOutcome
    "adjudication" -> this.adjudication
    "detail" -> this.detail
    else -> error("$name is not a valid property name")
  }

internal fun ExplanationOfBenefit.Item.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "sequence" -> true
    "careTeamSequence" -> true
    "diagnosisSequence" -> true
    "procedureSequence" -> true
    "informationSequence" -> true
    "traceNumber" -> true
    "revenue" -> true
    "category" -> true
    "productOrService" -> true
    "productOrServiceEnd" -> true
    "request" -> true
    "modifier" -> true
    "programCode" -> true
    "serviced" -> true
    "location" -> true
    "patientPaid" -> true
    "quantity" -> true
    "unitPrice" -> true
    "factor" -> true
    "tax" -> true
    "net" -> true
    "udi" -> true
    "bodySite" -> true
    "encounter" -> true
    "noteNumber" -> true
    "reviewOutcome" -> true
    "adjudication" -> true
    "detail" -> true
    else -> false
  }

internal fun ExplanationOfBenefit.Item.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.sequence)
  addAll(this@getAllChildren.careTeamSequence)
  addAll(this@getAllChildren.diagnosisSequence)
  addAll(this@getAllChildren.procedureSequence)
  addAll(this@getAllChildren.informationSequence)
  addAll(this@getAllChildren.traceNumber)
  this@getAllChildren.revenue?.let { add(it) }
  this@getAllChildren.category?.let { add(it) }
  this@getAllChildren.productOrService?.let { add(it) }
  this@getAllChildren.productOrServiceEnd?.let { add(it) }
  addAll(this@getAllChildren.request)
  addAll(this@getAllChildren.modifier)
  addAll(this@getAllChildren.programCode)
  this@getAllChildren.serviced?.let { add(it) }
  this@getAllChildren.location?.let { add(it) }
  this@getAllChildren.patientPaid?.let { add(it) }
  this@getAllChildren.quantity?.let { add(it) }
  this@getAllChildren.unitPrice?.let { add(it) }
  this@getAllChildren.factor?.let { add(it) }
  this@getAllChildren.tax?.let { add(it) }
  this@getAllChildren.net?.let { add(it) }
  addAll(this@getAllChildren.udi)
  addAll(this@getAllChildren.bodySite)
  addAll(this@getAllChildren.encounter)
  addAll(this@getAllChildren.noteNumber)
  this@getAllChildren.reviewOutcome?.let { add(it) }
  addAll(this@getAllChildren.adjudication)
  addAll(this@getAllChildren.detail)
}

internal fun ExplanationOfBenefit.Item.BodySite.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "site" -> this.site
    "subSite" -> this.subSite
    else -> error("$name is not a valid property name")
  }

internal fun ExplanationOfBenefit.Item.BodySite.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "site" -> true
    "subSite" -> true
    else -> false
  }

internal fun ExplanationOfBenefit.Item.BodySite.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.site)
  addAll(this@getAllChildren.subSite)
}

internal fun ExplanationOfBenefit.Item.ReviewOutcome.getProperty(name: String): Any? =
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

internal fun ExplanationOfBenefit.Item.ReviewOutcome.hasProperty(name: String): Boolean =
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

internal fun ExplanationOfBenefit.Item.ReviewOutcome.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.decision?.let { add(it) }
  addAll(this@getAllChildren.reason)
  this@getAllChildren.preAuthRef?.let { add(it) }
  this@getAllChildren.preAuthPeriod?.let { add(it) }
}

internal fun ExplanationOfBenefit.Item.Adjudication.getProperty(name: String): Any? =
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

internal fun ExplanationOfBenefit.Item.Adjudication.hasProperty(name: String): Boolean =
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

internal fun ExplanationOfBenefit.Item.Adjudication.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.category)
  this@getAllChildren.reason?.let { add(it) }
  this@getAllChildren.amount?.let { add(it) }
  this@getAllChildren.quantity?.let { add(it) }
}

internal fun ExplanationOfBenefit.Item.Detail.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "sequence" -> this.sequence
    "traceNumber" -> this.traceNumber
    "revenue" -> this.revenue
    "category" -> this.category
    "productOrService" -> this.productOrService
    "productOrServiceEnd" -> this.productOrServiceEnd
    "modifier" -> this.modifier
    "programCode" -> this.programCode
    "patientPaid" -> this.patientPaid
    "quantity" -> this.quantity
    "unitPrice" -> this.unitPrice
    "factor" -> this.factor
    "tax" -> this.tax
    "net" -> this.net
    "udi" -> this.udi
    "noteNumber" -> this.noteNumber
    "reviewOutcome" -> this.reviewOutcome
    "adjudication" -> this.adjudication
    "subDetail" -> this.subDetail
    else -> error("$name is not a valid property name")
  }

internal fun ExplanationOfBenefit.Item.Detail.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "sequence" -> true
    "traceNumber" -> true
    "revenue" -> true
    "category" -> true
    "productOrService" -> true
    "productOrServiceEnd" -> true
    "modifier" -> true
    "programCode" -> true
    "patientPaid" -> true
    "quantity" -> true
    "unitPrice" -> true
    "factor" -> true
    "tax" -> true
    "net" -> true
    "udi" -> true
    "noteNumber" -> true
    "reviewOutcome" -> true
    "adjudication" -> true
    "subDetail" -> true
    else -> false
  }

internal fun ExplanationOfBenefit.Item.Detail.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.sequence)
  addAll(this@getAllChildren.traceNumber)
  this@getAllChildren.revenue?.let { add(it) }
  this@getAllChildren.category?.let { add(it) }
  this@getAllChildren.productOrService?.let { add(it) }
  this@getAllChildren.productOrServiceEnd?.let { add(it) }
  addAll(this@getAllChildren.modifier)
  addAll(this@getAllChildren.programCode)
  this@getAllChildren.patientPaid?.let { add(it) }
  this@getAllChildren.quantity?.let { add(it) }
  this@getAllChildren.unitPrice?.let { add(it) }
  this@getAllChildren.factor?.let { add(it) }
  this@getAllChildren.tax?.let { add(it) }
  this@getAllChildren.net?.let { add(it) }
  addAll(this@getAllChildren.udi)
  addAll(this@getAllChildren.noteNumber)
  this@getAllChildren.reviewOutcome?.let { add(it) }
  addAll(this@getAllChildren.adjudication)
  addAll(this@getAllChildren.subDetail)
}

internal fun ExplanationOfBenefit.Item.Detail.SubDetail.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "sequence" -> this.sequence
    "traceNumber" -> this.traceNumber
    "revenue" -> this.revenue
    "category" -> this.category
    "productOrService" -> this.productOrService
    "productOrServiceEnd" -> this.productOrServiceEnd
    "modifier" -> this.modifier
    "programCode" -> this.programCode
    "patientPaid" -> this.patientPaid
    "quantity" -> this.quantity
    "unitPrice" -> this.unitPrice
    "factor" -> this.factor
    "tax" -> this.tax
    "net" -> this.net
    "udi" -> this.udi
    "noteNumber" -> this.noteNumber
    "reviewOutcome" -> this.reviewOutcome
    "adjudication" -> this.adjudication
    else -> error("$name is not a valid property name")
  }

internal fun ExplanationOfBenefit.Item.Detail.SubDetail.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "sequence" -> true
    "traceNumber" -> true
    "revenue" -> true
    "category" -> true
    "productOrService" -> true
    "productOrServiceEnd" -> true
    "modifier" -> true
    "programCode" -> true
    "patientPaid" -> true
    "quantity" -> true
    "unitPrice" -> true
    "factor" -> true
    "tax" -> true
    "net" -> true
    "udi" -> true
    "noteNumber" -> true
    "reviewOutcome" -> true
    "adjudication" -> true
    else -> false
  }

internal fun ExplanationOfBenefit.Item.Detail.SubDetail.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.sequence)
  addAll(this@getAllChildren.traceNumber)
  this@getAllChildren.revenue?.let { add(it) }
  this@getAllChildren.category?.let { add(it) }
  this@getAllChildren.productOrService?.let { add(it) }
  this@getAllChildren.productOrServiceEnd?.let { add(it) }
  addAll(this@getAllChildren.modifier)
  addAll(this@getAllChildren.programCode)
  this@getAllChildren.patientPaid?.let { add(it) }
  this@getAllChildren.quantity?.let { add(it) }
  this@getAllChildren.unitPrice?.let { add(it) }
  this@getAllChildren.factor?.let { add(it) }
  this@getAllChildren.tax?.let { add(it) }
  this@getAllChildren.net?.let { add(it) }
  addAll(this@getAllChildren.udi)
  addAll(this@getAllChildren.noteNumber)
  this@getAllChildren.reviewOutcome?.let { add(it) }
  addAll(this@getAllChildren.adjudication)
}

internal fun ExplanationOfBenefit.AddItem.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "itemSequence" -> this.itemSequence
    "detailSequence" -> this.detailSequence
    "subDetailSequence" -> this.subDetailSequence
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
    "patientPaid" -> this.patientPaid
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

internal fun ExplanationOfBenefit.AddItem.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "itemSequence" -> true
    "detailSequence" -> true
    "subDetailSequence" -> true
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
    "patientPaid" -> true
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

internal fun ExplanationOfBenefit.AddItem.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.itemSequence)
  addAll(this@getAllChildren.detailSequence)
  addAll(this@getAllChildren.subDetailSequence)
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
  this@getAllChildren.patientPaid?.let { add(it) }
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

internal fun ExplanationOfBenefit.AddItem.BodySite.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "site" -> this.site
    "subSite" -> this.subSite
    else -> error("$name is not a valid property name")
  }

internal fun ExplanationOfBenefit.AddItem.BodySite.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "site" -> true
    "subSite" -> true
    else -> false
  }

internal fun ExplanationOfBenefit.AddItem.BodySite.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.site)
  addAll(this@getAllChildren.subSite)
}

internal fun ExplanationOfBenefit.AddItem.Detail.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "traceNumber" -> this.traceNumber
    "revenue" -> this.revenue
    "productOrService" -> this.productOrService
    "productOrServiceEnd" -> this.productOrServiceEnd
    "modifier" -> this.modifier
    "patientPaid" -> this.patientPaid
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

internal fun ExplanationOfBenefit.AddItem.Detail.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "traceNumber" -> true
    "revenue" -> true
    "productOrService" -> true
    "productOrServiceEnd" -> true
    "modifier" -> true
    "patientPaid" -> true
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

internal fun ExplanationOfBenefit.AddItem.Detail.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.traceNumber)
  this@getAllChildren.revenue?.let { add(it) }
  this@getAllChildren.productOrService?.let { add(it) }
  this@getAllChildren.productOrServiceEnd?.let { add(it) }
  addAll(this@getAllChildren.modifier)
  this@getAllChildren.patientPaid?.let { add(it) }
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

internal fun ExplanationOfBenefit.AddItem.Detail.SubDetail.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "traceNumber" -> this.traceNumber
    "revenue" -> this.revenue
    "productOrService" -> this.productOrService
    "productOrServiceEnd" -> this.productOrServiceEnd
    "modifier" -> this.modifier
    "patientPaid" -> this.patientPaid
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

internal fun ExplanationOfBenefit.AddItem.Detail.SubDetail.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "traceNumber" -> true
    "revenue" -> true
    "productOrService" -> true
    "productOrServiceEnd" -> true
    "modifier" -> true
    "patientPaid" -> true
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

internal fun ExplanationOfBenefit.AddItem.Detail.SubDetail.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.traceNumber)
  this@getAllChildren.revenue?.let { add(it) }
  this@getAllChildren.productOrService?.let { add(it) }
  this@getAllChildren.productOrServiceEnd?.let { add(it) }
  addAll(this@getAllChildren.modifier)
  this@getAllChildren.patientPaid?.let { add(it) }
  this@getAllChildren.quantity?.let { add(it) }
  this@getAllChildren.unitPrice?.let { add(it) }
  this@getAllChildren.factor?.let { add(it) }
  this@getAllChildren.tax?.let { add(it) }
  this@getAllChildren.net?.let { add(it) }
  addAll(this@getAllChildren.noteNumber)
  this@getAllChildren.reviewOutcome?.let { add(it) }
  addAll(this@getAllChildren.adjudication)
}

internal fun ExplanationOfBenefit.Total.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "category" -> this.category
    "amount" -> this.amount
    else -> error("$name is not a valid property name")
  }

internal fun ExplanationOfBenefit.Total.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "category" -> true
    "amount" -> true
    else -> false
  }

internal fun ExplanationOfBenefit.Total.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.category)
  add(this@getAllChildren.amount)
}

internal fun ExplanationOfBenefit.Payment.getProperty(name: String): Any? =
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

internal fun ExplanationOfBenefit.Payment.hasProperty(name: String): Boolean =
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

internal fun ExplanationOfBenefit.Payment.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.type?.let { add(it) }
  this@getAllChildren.adjustment?.let { add(it) }
  this@getAllChildren.adjustmentReason?.let { add(it) }
  this@getAllChildren.date?.let { add(it) }
  this@getAllChildren.amount?.let { add(it) }
  this@getAllChildren.identifier?.let { add(it) }
}

internal fun ExplanationOfBenefit.ProcessNote.getProperty(name: String): Any? =
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

internal fun ExplanationOfBenefit.ProcessNote.hasProperty(name: String): Boolean =
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

internal fun ExplanationOfBenefit.ProcessNote.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.number?.let { add(it) }
  this@getAllChildren.type?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
}

internal fun ExplanationOfBenefit.BenefitBalance.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "category" -> this.category
    "excluded" -> this.excluded
    "name" -> this.name
    "description" -> this.description
    "network" -> this.network
    "unit" -> this.unit
    "term" -> this.term
    "financial" -> this.financial
    else -> error("$name is not a valid property name")
  }

internal fun ExplanationOfBenefit.BenefitBalance.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "category" -> true
    "excluded" -> true
    "name" -> true
    "description" -> true
    "network" -> true
    "unit" -> true
    "term" -> true
    "financial" -> true
    else -> false
  }

internal fun ExplanationOfBenefit.BenefitBalance.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.category)
  this@getAllChildren.excluded?.let { add(it) }
  this@getAllChildren.name?.let { add(it) }
  this@getAllChildren.description?.let { add(it) }
  this@getAllChildren.network?.let { add(it) }
  this@getAllChildren.unit?.let { add(it) }
  this@getAllChildren.term?.let { add(it) }
  addAll(this@getAllChildren.financial)
}

internal fun ExplanationOfBenefit.BenefitBalance.Financial.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "allowed" -> this.allowed
    "used" -> this.used
    else -> error("$name is not a valid property name")
  }

internal fun ExplanationOfBenefit.BenefitBalance.Financial.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "allowed" -> true
    "used" -> true
    else -> false
  }

internal fun ExplanationOfBenefit.BenefitBalance.Financial.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.type)
  this@getAllChildren.allowed?.let { add(it) }
  this@getAllChildren.used?.let { add(it) }
}
