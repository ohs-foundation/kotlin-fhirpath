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

import dev.ohs.fhir.model.r4.MedicinalProductAuthorization
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun MedicinalProductAuthorization.getProperty(name: String): Any? =
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
    "subject" -> this.subject
    "country" -> this.country
    "jurisdiction" -> this.jurisdiction
    "status" -> this.status
    "statusDate" -> this.statusDate
    "restoreDate" -> this.restoreDate
    "validityPeriod" -> this.validityPeriod
    "dataExclusivityPeriod" -> this.dataExclusivityPeriod
    "dateOfFirstAuthorization" -> this.dateOfFirstAuthorization
    "internationalBirthDate" -> this.internationalBirthDate
    "legalBasis" -> this.legalBasis
    "jurisdictionalAuthorization" -> this.jurisdictionalAuthorization
    "holder" -> this.holder
    "regulator" -> this.regulator
    "procedure" -> this.procedure
    else -> error("$name is not a valid property name")
  }

internal fun MedicinalProductAuthorization.hasProperty(name: String): Boolean =
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
    "subject" -> true
    "country" -> true
    "jurisdiction" -> true
    "status" -> true
    "statusDate" -> true
    "restoreDate" -> true
    "validityPeriod" -> true
    "dataExclusivityPeriod" -> true
    "dateOfFirstAuthorization" -> true
    "internationalBirthDate" -> true
    "legalBasis" -> true
    "jurisdictionalAuthorization" -> true
    "holder" -> true
    "regulator" -> true
    "procedure" -> true
    else -> false
  }

internal fun MedicinalProductAuthorization.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.meta?.let { add(it) }
  this@getAllChildren.implicitRules?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.contained)
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.identifier)
  this@getAllChildren.subject?.let { add(it) }
  addAll(this@getAllChildren.country)
  addAll(this@getAllChildren.jurisdiction)
  this@getAllChildren.status?.let { add(it) }
  this@getAllChildren.statusDate?.let { add(it) }
  this@getAllChildren.restoreDate?.let { add(it) }
  this@getAllChildren.validityPeriod?.let { add(it) }
  this@getAllChildren.dataExclusivityPeriod?.let { add(it) }
  this@getAllChildren.dateOfFirstAuthorization?.let { add(it) }
  this@getAllChildren.internationalBirthDate?.let { add(it) }
  this@getAllChildren.legalBasis?.let { add(it) }
  addAll(this@getAllChildren.jurisdictionalAuthorization)
  this@getAllChildren.holder?.let { add(it) }
  this@getAllChildren.regulator?.let { add(it) }
  this@getAllChildren.procedure?.let { add(it) }
}

internal fun MedicinalProductAuthorization.JurisdictionalAuthorization.getProperty(
  name: String
): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "identifier" -> this.identifier
    "country" -> this.country
    "jurisdiction" -> this.jurisdiction
    "legalStatusOfSupply" -> this.legalStatusOfSupply
    "validityPeriod" -> this.validityPeriod
    else -> error("$name is not a valid property name")
  }

internal fun MedicinalProductAuthorization.JurisdictionalAuthorization.hasProperty(
  name: String
): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "identifier" -> true
    "country" -> true
    "jurisdiction" -> true
    "legalStatusOfSupply" -> true
    "validityPeriod" -> true
    else -> false
  }

internal fun MedicinalProductAuthorization.JurisdictionalAuthorization.getAllChildren(): List<Any> =
  buildList {
    this@getAllChildren.id?.let { add(it) }
    addAll(this@getAllChildren.extension)
    addAll(this@getAllChildren.modifierExtension)
    addAll(this@getAllChildren.identifier)
    this@getAllChildren.country?.let { add(it) }
    addAll(this@getAllChildren.jurisdiction)
    this@getAllChildren.legalStatusOfSupply?.let { add(it) }
    this@getAllChildren.validityPeriod?.let { add(it) }
  }

internal fun MedicinalProductAuthorization.Procedure.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "identifier" -> this.identifier
    "type" -> this.type
    "date" -> this.date
    "application" -> this.application
    else -> error("$name is not a valid property name")
  }

internal fun MedicinalProductAuthorization.Procedure.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "identifier" -> true
    "type" -> true
    "date" -> true
    "application" -> true
    else -> false
  }

internal fun MedicinalProductAuthorization.Procedure.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.identifier?.let { add(it) }
  add(this@getAllChildren.type)
  this@getAllChildren.date?.let { add(it) }
  addAll(this@getAllChildren.application)
}
