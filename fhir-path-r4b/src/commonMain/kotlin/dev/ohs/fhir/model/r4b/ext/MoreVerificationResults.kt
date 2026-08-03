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

import dev.ohs.fhir.model.r4b.VerificationResult
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun VerificationResult.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "meta" -> this.meta
    "implicitRules" -> this.implicitRules
    "language" -> this.language
    "text" -> this.text
    "contained" -> this.contained
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "target" -> this.target
    "targetLocation" -> this.targetLocation
    "need" -> this.need
    "status" -> this.status
    "statusDate" -> this.statusDate
    "validationType" -> this.validationType
    "validationProcess" -> this.validationProcess
    "frequency" -> this.frequency
    "lastPerformed" -> this.lastPerformed
    "nextScheduled" -> this.nextScheduled
    "failureAction" -> this.failureAction
    "primarySource" -> this.primarySource
    "attestation" -> this.attestation
    "validator" -> this.validator
    else -> error("$name is not a valid property name")
  }

internal fun VerificationResult.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "meta" -> true
    "implicitRules" -> true
    "language" -> true
    "text" -> true
    "contained" -> true
    "extension" -> true
    "modifierExtension" -> true
    "target" -> true
    "targetLocation" -> true
    "need" -> true
    "status" -> true
    "statusDate" -> true
    "validationType" -> true
    "validationProcess" -> true
    "frequency" -> true
    "lastPerformed" -> true
    "nextScheduled" -> true
    "failureAction" -> true
    "primarySource" -> true
    "attestation" -> true
    "validator" -> true
    else -> false
  }

internal fun VerificationResult.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.meta?.let { add(it) }
  this@getAllChildren.implicitRules?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.contained)
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.target)
  addAll(this@getAllChildren.targetLocation)
  this@getAllChildren.need?.let { add(it) }
  add(this@getAllChildren.status)
  this@getAllChildren.statusDate?.let { add(it) }
  this@getAllChildren.validationType?.let { add(it) }
  addAll(this@getAllChildren.validationProcess)
  this@getAllChildren.frequency?.let { add(it) }
  this@getAllChildren.lastPerformed?.let { add(it) }
  this@getAllChildren.nextScheduled?.let { add(it) }
  this@getAllChildren.failureAction?.let { add(it) }
  addAll(this@getAllChildren.primarySource)
  this@getAllChildren.attestation?.let { add(it) }
  addAll(this@getAllChildren.validator)
}

internal fun VerificationResult.PrimarySource.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "who" -> this.who
    "type" -> this.type
    "communicationMethod" -> this.communicationMethod
    "validationStatus" -> this.validationStatus
    "validationDate" -> this.validationDate
    "canPushUpdates" -> this.canPushUpdates
    "pushTypeAvailable" -> this.pushTypeAvailable
    else -> error("$name is not a valid property name")
  }

internal fun VerificationResult.PrimarySource.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "who" -> true
    "type" -> true
    "communicationMethod" -> true
    "validationStatus" -> true
    "validationDate" -> true
    "canPushUpdates" -> true
    "pushTypeAvailable" -> true
    else -> false
  }

internal fun VerificationResult.PrimarySource.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.who?.let { add(it) }
  addAll(this@getAllChildren.type)
  addAll(this@getAllChildren.communicationMethod)
  this@getAllChildren.validationStatus?.let { add(it) }
  this@getAllChildren.validationDate?.let { add(it) }
  this@getAllChildren.canPushUpdates?.let { add(it) }
  addAll(this@getAllChildren.pushTypeAvailable)
}

internal fun VerificationResult.Attestation.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "who" -> this.who
    "onBehalfOf" -> this.onBehalfOf
    "communicationMethod" -> this.communicationMethod
    "date" -> this.date
    "sourceIdentityCertificate" -> this.sourceIdentityCertificate
    "proxyIdentityCertificate" -> this.proxyIdentityCertificate
    "proxySignature" -> this.proxySignature
    "sourceSignature" -> this.sourceSignature
    else -> error("$name is not a valid property name")
  }

internal fun VerificationResult.Attestation.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "who" -> true
    "onBehalfOf" -> true
    "communicationMethod" -> true
    "date" -> true
    "sourceIdentityCertificate" -> true
    "proxyIdentityCertificate" -> true
    "proxySignature" -> true
    "sourceSignature" -> true
    else -> false
  }

internal fun VerificationResult.Attestation.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.who?.let { add(it) }
  this@getAllChildren.onBehalfOf?.let { add(it) }
  this@getAllChildren.communicationMethod?.let { add(it) }
  this@getAllChildren.date?.let { add(it) }
  this@getAllChildren.sourceIdentityCertificate?.let { add(it) }
  this@getAllChildren.proxyIdentityCertificate?.let { add(it) }
  this@getAllChildren.proxySignature?.let { add(it) }
  this@getAllChildren.sourceSignature?.let { add(it) }
}

internal fun VerificationResult.Validator.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "organization" -> this.organization
    "identityCertificate" -> this.identityCertificate
    "attestationSignature" -> this.attestationSignature
    else -> error("$name is not a valid property name")
  }

internal fun VerificationResult.Validator.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "organization" -> true
    "identityCertificate" -> true
    "attestationSignature" -> true
    else -> false
  }

internal fun VerificationResult.Validator.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.organization)
  this@getAllChildren.identityCertificate?.let { add(it) }
  this@getAllChildren.attestationSignature?.let { add(it) }
}
