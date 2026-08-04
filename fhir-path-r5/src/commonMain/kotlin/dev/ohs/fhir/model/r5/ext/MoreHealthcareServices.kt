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

import dev.ohs.fhir.model.r5.HealthcareService
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun HealthcareService.getProperty(name: String): Any? =
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
    "active" -> this.active
    "providedBy" -> this.providedBy
    "offeredIn" -> this.offeredIn
    "category" -> this.category
    "type" -> this.type
    "specialty" -> this.specialty
    "location" -> this.location
    "name" -> this.name
    "comment" -> this.comment
    "extraDetails" -> this.extraDetails
    "photo" -> this.photo
    "contact" -> this.contact
    "coverageArea" -> this.coverageArea
    "serviceProvisionCode" -> this.serviceProvisionCode
    "eligibility" -> this.eligibility
    "program" -> this.program
    "characteristic" -> this.characteristic
    "communication" -> this.communication
    "referralMethod" -> this.referralMethod
    "appointmentRequired" -> this.appointmentRequired
    "availability" -> this.availability
    "endpoint" -> this.endpoint
    else -> error("$name is not a valid property name")
  }

internal fun HealthcareService.hasProperty(name: String): Boolean =
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
    "active" -> true
    "providedBy" -> true
    "offeredIn" -> true
    "category" -> true
    "type" -> true
    "specialty" -> true
    "location" -> true
    "name" -> true
    "comment" -> true
    "extraDetails" -> true
    "photo" -> true
    "contact" -> true
    "coverageArea" -> true
    "serviceProvisionCode" -> true
    "eligibility" -> true
    "program" -> true
    "characteristic" -> true
    "communication" -> true
    "referralMethod" -> true
    "appointmentRequired" -> true
    "availability" -> true
    "endpoint" -> true
    else -> false
  }

internal fun HealthcareService.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.meta?.let { add(it) }
  this@getAllChildren.implicitRules?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.contained)
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.identifier)
  this@getAllChildren.active?.let { add(it) }
  this@getAllChildren.providedBy?.let { add(it) }
  addAll(this@getAllChildren.offeredIn)
  addAll(this@getAllChildren.category)
  addAll(this@getAllChildren.type)
  addAll(this@getAllChildren.specialty)
  addAll(this@getAllChildren.location)
  this@getAllChildren.name?.let { add(it) }
  this@getAllChildren.comment?.let { add(it) }
  this@getAllChildren.extraDetails?.let { add(it) }
  this@getAllChildren.photo?.let { add(it) }
  addAll(this@getAllChildren.contact)
  addAll(this@getAllChildren.coverageArea)
  addAll(this@getAllChildren.serviceProvisionCode)
  addAll(this@getAllChildren.eligibility)
  addAll(this@getAllChildren.program)
  addAll(this@getAllChildren.characteristic)
  addAll(this@getAllChildren.communication)
  addAll(this@getAllChildren.referralMethod)
  this@getAllChildren.appointmentRequired?.let { add(it) }
  addAll(this@getAllChildren.availability)
  addAll(this@getAllChildren.endpoint)
}

internal fun HealthcareService.Eligibility.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "code" -> this.code
    "comment" -> this.comment
    else -> error("$name is not a valid property name")
  }

internal fun HealthcareService.Eligibility.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "code" -> true
    "comment" -> true
    else -> false
  }

internal fun HealthcareService.Eligibility.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.code?.let { add(it) }
  this@getAllChildren.comment?.let { add(it) }
}
