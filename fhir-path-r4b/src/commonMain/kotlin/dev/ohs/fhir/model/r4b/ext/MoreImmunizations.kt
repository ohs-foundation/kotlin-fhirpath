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

import dev.ohs.fhir.model.r4b.Immunization
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun Immunization.getProperty(name: String): Any? =
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
    "statusReason" -> this.statusReason
    "vaccineCode" -> this.vaccineCode
    "patient" -> this.patient
    "encounter" -> this.encounter
    "occurrence" -> this.occurrence
    "recorded" -> this.recorded
    "primarySource" -> this.primarySource
    "reportOrigin" -> this.reportOrigin
    "location" -> this.location
    "manufacturer" -> this.manufacturer
    "lotNumber" -> this.lotNumber
    "expirationDate" -> this.expirationDate
    "site" -> this.site
    "route" -> this.route
    "doseQuantity" -> this.doseQuantity
    "performer" -> this.performer
    "note" -> this.note
    "reasonCode" -> this.reasonCode
    "reasonReference" -> this.reasonReference
    "isSubpotent" -> this.isSubpotent
    "subpotentReason" -> this.subpotentReason
    "education" -> this.education
    "programEligibility" -> this.programEligibility
    "fundingSource" -> this.fundingSource
    "reaction" -> this.reaction
    "protocolApplied" -> this.protocolApplied
    else -> error("$name is not a valid property name")
  }

internal fun Immunization.hasProperty(name: String): Boolean =
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
    "statusReason" -> true
    "vaccineCode" -> true
    "patient" -> true
    "encounter" -> true
    "occurrence" -> true
    "recorded" -> true
    "primarySource" -> true
    "reportOrigin" -> true
    "location" -> true
    "manufacturer" -> true
    "lotNumber" -> true
    "expirationDate" -> true
    "site" -> true
    "route" -> true
    "doseQuantity" -> true
    "performer" -> true
    "note" -> true
    "reasonCode" -> true
    "reasonReference" -> true
    "isSubpotent" -> true
    "subpotentReason" -> true
    "education" -> true
    "programEligibility" -> true
    "fundingSource" -> true
    "reaction" -> true
    "protocolApplied" -> true
    else -> false
  }

internal fun Immunization.getAllChildren(): List<Any> = buildList {
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
  this@getAllChildren.statusReason?.let { add(it) }
  add(this@getAllChildren.vaccineCode)
  add(this@getAllChildren.patient)
  this@getAllChildren.encounter?.let { add(it) }
  add(this@getAllChildren.occurrence)
  this@getAllChildren.recorded?.let { add(it) }
  this@getAllChildren.primarySource?.let { add(it) }
  this@getAllChildren.reportOrigin?.let { add(it) }
  this@getAllChildren.location?.let { add(it) }
  this@getAllChildren.manufacturer?.let { add(it) }
  this@getAllChildren.lotNumber?.let { add(it) }
  this@getAllChildren.expirationDate?.let { add(it) }
  this@getAllChildren.site?.let { add(it) }
  this@getAllChildren.route?.let { add(it) }
  this@getAllChildren.doseQuantity?.let { add(it) }
  addAll(this@getAllChildren.performer)
  addAll(this@getAllChildren.note)
  addAll(this@getAllChildren.reasonCode)
  addAll(this@getAllChildren.reasonReference)
  this@getAllChildren.isSubpotent?.let { add(it) }
  addAll(this@getAllChildren.subpotentReason)
  addAll(this@getAllChildren.education)
  addAll(this@getAllChildren.programEligibility)
  this@getAllChildren.fundingSource?.let { add(it) }
  addAll(this@getAllChildren.reaction)
  addAll(this@getAllChildren.protocolApplied)
}

internal fun Immunization.Performer.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "function" -> this.function
    "actor" -> this.actor
    else -> error("$name is not a valid property name")
  }

internal fun Immunization.Performer.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "function" -> true
    "actor" -> true
    else -> false
  }

internal fun Immunization.Performer.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.function?.let { add(it) }
  add(this@getAllChildren.actor)
}

internal fun Immunization.Education.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "documentType" -> this.documentType
    "reference" -> this.reference
    "publicationDate" -> this.publicationDate
    "presentationDate" -> this.presentationDate
    else -> error("$name is not a valid property name")
  }

internal fun Immunization.Education.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "documentType" -> true
    "reference" -> true
    "publicationDate" -> true
    "presentationDate" -> true
    else -> false
  }

internal fun Immunization.Education.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.documentType?.let { add(it) }
  this@getAllChildren.reference?.let { add(it) }
  this@getAllChildren.publicationDate?.let { add(it) }
  this@getAllChildren.presentationDate?.let { add(it) }
}

internal fun Immunization.Reaction.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "date" -> this.date
    "detail" -> this.detail
    "reported" -> this.reported
    else -> error("$name is not a valid property name")
  }

internal fun Immunization.Reaction.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "date" -> true
    "detail" -> true
    "reported" -> true
    else -> false
  }

internal fun Immunization.Reaction.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.date?.let { add(it) }
  this@getAllChildren.detail?.let { add(it) }
  this@getAllChildren.reported?.let { add(it) }
}

internal fun Immunization.ProtocolApplied.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "series" -> this.series
    "authority" -> this.authority
    "targetDisease" -> this.targetDisease
    "doseNumber" -> this.doseNumber
    "seriesDoses" -> this.seriesDoses
    else -> error("$name is not a valid property name")
  }

internal fun Immunization.ProtocolApplied.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "series" -> true
    "authority" -> true
    "targetDisease" -> true
    "doseNumber" -> true
    "seriesDoses" -> true
    else -> false
  }

internal fun Immunization.ProtocolApplied.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.series?.let { add(it) }
  this@getAllChildren.authority?.let { add(it) }
  addAll(this@getAllChildren.targetDisease)
  add(this@getAllChildren.doseNumber)
  this@getAllChildren.seriesDoses?.let { add(it) }
}
