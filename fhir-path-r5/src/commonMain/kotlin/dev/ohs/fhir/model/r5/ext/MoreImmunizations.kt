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

import dev.ohs.fhir.model.r5.Immunization
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
    "basedOn" -> this.basedOn
    "status" -> this.status
    "statusReason" -> this.statusReason
    "vaccineCode" -> this.vaccineCode
    "administeredProduct" -> this.administeredProduct
    "manufacturer" -> this.manufacturer
    "lotNumber" -> this.lotNumber
    "expirationDate" -> this.expirationDate
    "patient" -> this.patient
    "encounter" -> this.encounter
    "supportingInformation" -> this.supportingInformation
    "occurrence" -> this.occurrence
    "primarySource" -> this.primarySource
    "informationSource" -> this.informationSource
    "location" -> this.location
    "site" -> this.site
    "route" -> this.route
    "doseQuantity" -> this.doseQuantity
    "performer" -> this.performer
    "note" -> this.note
    "reason" -> this.reason
    "isSubpotent" -> this.isSubpotent
    "subpotentReason" -> this.subpotentReason
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
    "basedOn" -> true
    "status" -> true
    "statusReason" -> true
    "vaccineCode" -> true
    "administeredProduct" -> true
    "manufacturer" -> true
    "lotNumber" -> true
    "expirationDate" -> true
    "patient" -> true
    "encounter" -> true
    "supportingInformation" -> true
    "occurrence" -> true
    "primarySource" -> true
    "informationSource" -> true
    "location" -> true
    "site" -> true
    "route" -> true
    "doseQuantity" -> true
    "performer" -> true
    "note" -> true
    "reason" -> true
    "isSubpotent" -> true
    "subpotentReason" -> true
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
  addAll(this@getAllChildren.basedOn)
  add(this@getAllChildren.status)
  this@getAllChildren.statusReason?.let { add(it) }
  add(this@getAllChildren.vaccineCode)
  this@getAllChildren.administeredProduct?.let { add(it) }
  this@getAllChildren.manufacturer?.let { add(it) }
  this@getAllChildren.lotNumber?.let { add(it) }
  this@getAllChildren.expirationDate?.let { add(it) }
  add(this@getAllChildren.patient)
  this@getAllChildren.encounter?.let { add(it) }
  addAll(this@getAllChildren.supportingInformation)
  add(this@getAllChildren.occurrence)
  this@getAllChildren.primarySource?.let { add(it) }
  this@getAllChildren.informationSource?.let { add(it) }
  this@getAllChildren.location?.let { add(it) }
  this@getAllChildren.site?.let { add(it) }
  this@getAllChildren.route?.let { add(it) }
  this@getAllChildren.doseQuantity?.let { add(it) }
  addAll(this@getAllChildren.performer)
  addAll(this@getAllChildren.note)
  addAll(this@getAllChildren.reason)
  this@getAllChildren.isSubpotent?.let { add(it) }
  addAll(this@getAllChildren.subpotentReason)
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

internal fun Immunization.ProgramEligibility.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "program" -> this.program
    "programStatus" -> this.programStatus
    else -> error("$name is not a valid property name")
  }

internal fun Immunization.ProgramEligibility.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "program" -> true
    "programStatus" -> true
    else -> false
  }

internal fun Immunization.ProgramEligibility.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.program)
  add(this@getAllChildren.programStatus)
}

internal fun Immunization.Reaction.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "date" -> this.date
    "manifestation" -> this.manifestation
    "reported" -> this.reported
    else -> error("$name is not a valid property name")
  }

internal fun Immunization.Reaction.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "date" -> true
    "manifestation" -> true
    "reported" -> true
    else -> false
  }

internal fun Immunization.Reaction.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.date?.let { add(it) }
  this@getAllChildren.manifestation?.let { add(it) }
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
