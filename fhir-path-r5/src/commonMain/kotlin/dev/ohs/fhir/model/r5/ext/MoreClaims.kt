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

import dev.ohs.fhir.model.r5.Claim
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun Claim.getProperty(name: String): Any? =
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
    "fundsReserve" -> this.fundsReserve
    "related" -> this.related
    "prescription" -> this.prescription
    "originalPrescription" -> this.originalPrescription
    "payee" -> this.payee
    "referral" -> this.referral
    "encounter" -> this.encounter
    "facility" -> this.facility
    "diagnosisRelatedGroup" -> this.diagnosisRelatedGroup
    "event" -> this.event
    "careTeam" -> this.careTeam
    "supportingInfo" -> this.supportingInfo
    "diagnosis" -> this.diagnosis
    "procedure" -> this.procedure
    "insurance" -> this.insurance
    "accident" -> this.accident
    "patientPaid" -> this.patientPaid
    "item" -> this.item
    "total" -> this.total
    else -> error("$name is not a valid property name")
  }

internal fun Claim.hasProperty(name: String): Boolean =
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
    "fundsReserve" -> true
    "related" -> true
    "prescription" -> true
    "originalPrescription" -> true
    "payee" -> true
    "referral" -> true
    "encounter" -> true
    "facility" -> true
    "diagnosisRelatedGroup" -> true
    "event" -> true
    "careTeam" -> true
    "supportingInfo" -> true
    "diagnosis" -> true
    "procedure" -> true
    "insurance" -> true
    "accident" -> true
    "patientPaid" -> true
    "item" -> true
    "total" -> true
    else -> false
  }

internal fun Claim.getAllChildren(): List<Any> = buildList {
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
  this@getAllChildren.fundsReserve?.let { add(it) }
  addAll(this@getAllChildren.related)
  this@getAllChildren.prescription?.let { add(it) }
  this@getAllChildren.originalPrescription?.let { add(it) }
  this@getAllChildren.payee?.let { add(it) }
  this@getAllChildren.referral?.let { add(it) }
  addAll(this@getAllChildren.encounter)
  this@getAllChildren.facility?.let { add(it) }
  this@getAllChildren.diagnosisRelatedGroup?.let { add(it) }
  addAll(this@getAllChildren.event)
  addAll(this@getAllChildren.careTeam)
  addAll(this@getAllChildren.supportingInfo)
  addAll(this@getAllChildren.diagnosis)
  addAll(this@getAllChildren.procedure)
  addAll(this@getAllChildren.insurance)
  this@getAllChildren.accident?.let { add(it) }
  this@getAllChildren.patientPaid?.let { add(it) }
  addAll(this@getAllChildren.item)
  this@getAllChildren.total?.let { add(it) }
}

internal fun Claim.Related.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "claim" -> this.claim
    "relationship" -> this.relationship
    "reference" -> this.reference
    else -> error("$name is not a valid property name")
  }

internal fun Claim.Related.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "claim" -> true
    "relationship" -> true
    "reference" -> true
    else -> false
  }

internal fun Claim.Related.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.claim?.let { add(it) }
  this@getAllChildren.relationship?.let { add(it) }
  this@getAllChildren.reference?.let { add(it) }
}

internal fun Claim.Payee.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "party" -> this.party
    else -> error("$name is not a valid property name")
  }

internal fun Claim.Payee.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "party" -> true
    else -> false
  }

internal fun Claim.Payee.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.type)
  this@getAllChildren.party?.let { add(it) }
}

internal fun Claim.Event.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "when" -> this.`when`
    else -> error("$name is not a valid property name")
  }

internal fun Claim.Event.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "when" -> true
    else -> false
  }

internal fun Claim.Event.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.type)
  add(this@getAllChildren.`when`)
}

internal fun Claim.CareTeam.getProperty(name: String): Any? =
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

internal fun Claim.CareTeam.hasProperty(name: String): Boolean =
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

internal fun Claim.CareTeam.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.sequence)
  add(this@getAllChildren.provider)
  this@getAllChildren.responsible?.let { add(it) }
  this@getAllChildren.role?.let { add(it) }
  this@getAllChildren.specialty?.let { add(it) }
}

internal fun Claim.SupportingInfo.getProperty(name: String): Any? =
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

internal fun Claim.SupportingInfo.hasProperty(name: String): Boolean =
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

internal fun Claim.SupportingInfo.getAllChildren(): List<Any> = buildList {
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

internal fun Claim.Diagnosis.getProperty(name: String): Any? =
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

internal fun Claim.Diagnosis.hasProperty(name: String): Boolean =
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

internal fun Claim.Diagnosis.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.sequence)
  add(this@getAllChildren.diagnosis)
  addAll(this@getAllChildren.type)
  this@getAllChildren.onAdmission?.let { add(it) }
}

internal fun Claim.Procedure.getProperty(name: String): Any? =
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

internal fun Claim.Procedure.hasProperty(name: String): Boolean =
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

internal fun Claim.Procedure.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.sequence)
  addAll(this@getAllChildren.type)
  this@getAllChildren.date?.let { add(it) }
  add(this@getAllChildren.procedure)
  addAll(this@getAllChildren.udi)
}

internal fun Claim.Insurance.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "sequence" -> this.sequence
    "focal" -> this.focal
    "identifier" -> this.identifier
    "coverage" -> this.coverage
    "businessArrangement" -> this.businessArrangement
    "preAuthRef" -> this.preAuthRef
    "claimResponse" -> this.claimResponse
    else -> error("$name is not a valid property name")
  }

internal fun Claim.Insurance.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "sequence" -> true
    "focal" -> true
    "identifier" -> true
    "coverage" -> true
    "businessArrangement" -> true
    "preAuthRef" -> true
    "claimResponse" -> true
    else -> false
  }

internal fun Claim.Insurance.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.sequence)
  add(this@getAllChildren.focal)
  this@getAllChildren.identifier?.let { add(it) }
  add(this@getAllChildren.coverage)
  this@getAllChildren.businessArrangement?.let { add(it) }
  addAll(this@getAllChildren.preAuthRef)
  this@getAllChildren.claimResponse?.let { add(it) }
}

internal fun Claim.Accident.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "date" -> this.date
    "type" -> this.type
    "location" -> this.location
    else -> error("$name is not a valid property name")
  }

internal fun Claim.Accident.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "date" -> true
    "type" -> true
    "location" -> true
    else -> false
  }

internal fun Claim.Accident.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.date)
  this@getAllChildren.type?.let { add(it) }
  this@getAllChildren.location?.let { add(it) }
}

internal fun Claim.Item.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "sequence" -> this.sequence
    "traceNumber" -> this.traceNumber
    "careTeamSequence" -> this.careTeamSequence
    "diagnosisSequence" -> this.diagnosisSequence
    "procedureSequence" -> this.procedureSequence
    "informationSequence" -> this.informationSequence
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
    "detail" -> this.detail
    else -> error("$name is not a valid property name")
  }

internal fun Claim.Item.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "sequence" -> true
    "traceNumber" -> true
    "careTeamSequence" -> true
    "diagnosisSequence" -> true
    "procedureSequence" -> true
    "informationSequence" -> true
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
    "detail" -> true
    else -> false
  }

internal fun Claim.Item.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.sequence)
  addAll(this@getAllChildren.traceNumber)
  addAll(this@getAllChildren.careTeamSequence)
  addAll(this@getAllChildren.diagnosisSequence)
  addAll(this@getAllChildren.procedureSequence)
  addAll(this@getAllChildren.informationSequence)
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
  addAll(this@getAllChildren.detail)
}

internal fun Claim.Item.BodySite.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "site" -> this.site
    "subSite" -> this.subSite
    else -> error("$name is not a valid property name")
  }

internal fun Claim.Item.BodySite.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "site" -> true
    "subSite" -> true
    else -> false
  }

internal fun Claim.Item.BodySite.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.site)
  addAll(this@getAllChildren.subSite)
}

internal fun Claim.Item.Detail.getProperty(name: String): Any? =
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
    "subDetail" -> this.subDetail
    else -> error("$name is not a valid property name")
  }

internal fun Claim.Item.Detail.hasProperty(name: String): Boolean =
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
    "subDetail" -> true
    else -> false
  }

internal fun Claim.Item.Detail.getAllChildren(): List<Any> = buildList {
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
  addAll(this@getAllChildren.subDetail)
}

internal fun Claim.Item.Detail.SubDetail.getProperty(name: String): Any? =
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
    else -> error("$name is not a valid property name")
  }

internal fun Claim.Item.Detail.SubDetail.hasProperty(name: String): Boolean =
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
    else -> false
  }

internal fun Claim.Item.Detail.SubDetail.getAllChildren(): List<Any> = buildList {
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
}
