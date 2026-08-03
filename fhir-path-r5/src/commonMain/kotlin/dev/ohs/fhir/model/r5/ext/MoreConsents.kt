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

import dev.ohs.fhir.model.r5.Consent
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun Consent.getProperty(name: String): Any? =
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
    "category" -> this.category
    "subject" -> this.subject
    "date" -> this.date
    "period" -> this.period
    "grantor" -> this.grantor
    "grantee" -> this.grantee
    "manager" -> this.manager
    "controller" -> this.controller
    "sourceAttachment" -> this.sourceAttachment
    "sourceReference" -> this.sourceReference
    "regulatoryBasis" -> this.regulatoryBasis
    "policyBasis" -> this.policyBasis
    "policyText" -> this.policyText
    "verification" -> this.verification
    "decision" -> this.decision
    "provision" -> this.provision
    else -> error("$name is not a valid property name")
  }

internal fun Consent.hasProperty(name: String): Boolean =
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
    "category" -> true
    "subject" -> true
    "date" -> true
    "period" -> true
    "grantor" -> true
    "grantee" -> true
    "manager" -> true
    "controller" -> true
    "sourceAttachment" -> true
    "sourceReference" -> true
    "regulatoryBasis" -> true
    "policyBasis" -> true
    "policyText" -> true
    "verification" -> true
    "decision" -> true
    "provision" -> true
    else -> false
  }

internal fun Consent.getAllChildren(): List<Any> = buildList {
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
  addAll(this@getAllChildren.category)
  this@getAllChildren.subject?.let { add(it) }
  this@getAllChildren.date?.let { add(it) }
  this@getAllChildren.period?.let { add(it) }
  addAll(this@getAllChildren.grantor)
  addAll(this@getAllChildren.grantee)
  addAll(this@getAllChildren.manager)
  addAll(this@getAllChildren.controller)
  addAll(this@getAllChildren.sourceAttachment)
  addAll(this@getAllChildren.sourceReference)
  addAll(this@getAllChildren.regulatoryBasis)
  this@getAllChildren.policyBasis?.let { add(it) }
  addAll(this@getAllChildren.policyText)
  addAll(this@getAllChildren.verification)
  this@getAllChildren.decision?.let { add(it) }
  addAll(this@getAllChildren.provision)
}

internal fun Consent.PolicyBasis.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "reference" -> this.reference
    "url" -> this.url
    else -> error("$name is not a valid property name")
  }

internal fun Consent.PolicyBasis.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "reference" -> true
    "url" -> true
    else -> false
  }

internal fun Consent.PolicyBasis.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.reference?.let { add(it) }
  this@getAllChildren.url?.let { add(it) }
}

internal fun Consent.Verification.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "verified" -> this.verified
    "verificationType" -> this.verificationType
    "verifiedBy" -> this.verifiedBy
    "verifiedWith" -> this.verifiedWith
    "verificationDate" -> this.verificationDate
    else -> error("$name is not a valid property name")
  }

internal fun Consent.Verification.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "verified" -> true
    "verificationType" -> true
    "verifiedBy" -> true
    "verifiedWith" -> true
    "verificationDate" -> true
    else -> false
  }

internal fun Consent.Verification.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.verified)
  this@getAllChildren.verificationType?.let { add(it) }
  this@getAllChildren.verifiedBy?.let { add(it) }
  this@getAllChildren.verifiedWith?.let { add(it) }
  addAll(this@getAllChildren.verificationDate)
}

internal fun Consent.Provision.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "period" -> this.period
    "actor" -> this.actor
    "action" -> this.action
    "securityLabel" -> this.securityLabel
    "purpose" -> this.purpose
    "documentType" -> this.documentType
    "resourceType" -> this.resourceType
    "code" -> this.code
    "dataPeriod" -> this.dataPeriod
    "data" -> this.`data`
    "expression" -> this.expression
    "provision" -> this.provision
    else -> error("$name is not a valid property name")
  }

internal fun Consent.Provision.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "period" -> true
    "actor" -> true
    "action" -> true
    "securityLabel" -> true
    "purpose" -> true
    "documentType" -> true
    "resourceType" -> true
    "code" -> true
    "dataPeriod" -> true
    "data" -> true
    "expression" -> true
    "provision" -> true
    else -> false
  }

internal fun Consent.Provision.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.period?.let { add(it) }
  addAll(this@getAllChildren.actor)
  addAll(this@getAllChildren.action)
  addAll(this@getAllChildren.securityLabel)
  addAll(this@getAllChildren.purpose)
  addAll(this@getAllChildren.documentType)
  addAll(this@getAllChildren.resourceType)
  addAll(this@getAllChildren.code)
  this@getAllChildren.dataPeriod?.let { add(it) }
  addAll(this@getAllChildren.`data`)
  this@getAllChildren.expression?.let { add(it) }
  addAll(this@getAllChildren.provision)
}

internal fun Consent.Provision.Actor.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "role" -> this.role
    "reference" -> this.reference
    else -> error("$name is not a valid property name")
  }

internal fun Consent.Provision.Actor.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "role" -> true
    "reference" -> true
    else -> false
  }

internal fun Consent.Provision.Actor.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.role?.let { add(it) }
  this@getAllChildren.reference?.let { add(it) }
}

internal fun Consent.Provision.Data.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "meaning" -> this.meaning
    "reference" -> this.reference
    else -> error("$name is not a valid property name")
  }

internal fun Consent.Provision.Data.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "meaning" -> true
    "reference" -> true
    else -> false
  }

internal fun Consent.Provision.Data.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.meaning)
  add(this@getAllChildren.reference)
}
