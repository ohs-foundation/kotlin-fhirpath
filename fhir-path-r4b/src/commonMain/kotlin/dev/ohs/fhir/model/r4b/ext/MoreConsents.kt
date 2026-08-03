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

import dev.ohs.fhir.model.r4b.Consent
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
    "scope" -> this.scope
    "category" -> this.category
    "patient" -> this.patient
    "dateTime" -> this.dateTime
    "performer" -> this.performer
    "organization" -> this.organization
    "source" -> this.source
    "policy" -> this.policy
    "policyRule" -> this.policyRule
    "verification" -> this.verification
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
    "scope" -> true
    "category" -> true
    "patient" -> true
    "dateTime" -> true
    "performer" -> true
    "organization" -> true
    "source" -> true
    "policy" -> true
    "policyRule" -> true
    "verification" -> true
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
  add(this@getAllChildren.scope)
  addAll(this@getAllChildren.category)
  this@getAllChildren.patient?.let { add(it) }
  this@getAllChildren.dateTime?.let { add(it) }
  addAll(this@getAllChildren.performer)
  addAll(this@getAllChildren.organization)
  this@getAllChildren.source?.let { add(it) }
  addAll(this@getAllChildren.policy)
  this@getAllChildren.policyRule?.let { add(it) }
  addAll(this@getAllChildren.verification)
  this@getAllChildren.provision?.let { add(it) }
}

internal fun Consent.Policy.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "authority" -> this.authority
    "uri" -> this.uri
    else -> error("$name is not a valid property name")
  }

internal fun Consent.Policy.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "authority" -> true
    "uri" -> true
    else -> false
  }

internal fun Consent.Policy.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.authority?.let { add(it) }
  this@getAllChildren.uri?.let { add(it) }
}

internal fun Consent.Verification.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "verified" -> this.verified
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
    "verifiedWith" -> true
    "verificationDate" -> true
    else -> false
  }

internal fun Consent.Verification.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.verified)
  this@getAllChildren.verifiedWith?.let { add(it) }
  this@getAllChildren.verificationDate?.let { add(it) }
}

internal fun Consent.Provision.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "period" -> this.period
    "actor" -> this.actor
    "action" -> this.action
    "securityLabel" -> this.securityLabel
    "purpose" -> this.purpose
    "class" -> this.`class`
    "code" -> this.code
    "dataPeriod" -> this.dataPeriod
    "data" -> this.`data`
    "provision" -> this.provision
    else -> error("$name is not a valid property name")
  }

internal fun Consent.Provision.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "period" -> true
    "actor" -> true
    "action" -> true
    "securityLabel" -> true
    "purpose" -> true
    "class" -> true
    "code" -> true
    "dataPeriod" -> true
    "data" -> true
    "provision" -> true
    else -> false
  }

internal fun Consent.Provision.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.type?.let { add(it) }
  this@getAllChildren.period?.let { add(it) }
  addAll(this@getAllChildren.actor)
  addAll(this@getAllChildren.action)
  addAll(this@getAllChildren.securityLabel)
  addAll(this@getAllChildren.purpose)
  addAll(this@getAllChildren.`class`)
  addAll(this@getAllChildren.code)
  this@getAllChildren.dataPeriod?.let { add(it) }
  addAll(this@getAllChildren.`data`)
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
  add(this@getAllChildren.role)
  add(this@getAllChildren.reference)
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
