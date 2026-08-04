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

import dev.ohs.fhir.model.r4.MedicinalProductPharmaceutical
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun MedicinalProductPharmaceutical.getProperty(name: String): Any? =
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
    "administrableDoseForm" -> this.administrableDoseForm
    "unitOfPresentation" -> this.unitOfPresentation
    "ingredient" -> this.ingredient
    "device" -> this.device
    "characteristics" -> this.characteristics
    "routeOfAdministration" -> this.routeOfAdministration
    else -> error("$name is not a valid property name")
  }

internal fun MedicinalProductPharmaceutical.hasProperty(name: String): Boolean =
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
    "administrableDoseForm" -> true
    "unitOfPresentation" -> true
    "ingredient" -> true
    "device" -> true
    "characteristics" -> true
    "routeOfAdministration" -> true
    else -> false
  }

internal fun MedicinalProductPharmaceutical.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.meta?.let { add(it) }
  this@getAllChildren.implicitRules?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.contained)
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.identifier)
  add(this@getAllChildren.administrableDoseForm)
  this@getAllChildren.unitOfPresentation?.let { add(it) }
  addAll(this@getAllChildren.ingredient)
  addAll(this@getAllChildren.device)
  addAll(this@getAllChildren.characteristics)
  addAll(this@getAllChildren.routeOfAdministration)
}

internal fun MedicinalProductPharmaceutical.Characteristics.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "code" -> this.code
    "status" -> this.status
    else -> error("$name is not a valid property name")
  }

internal fun MedicinalProductPharmaceutical.Characteristics.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "code" -> true
    "status" -> true
    else -> false
  }

internal fun MedicinalProductPharmaceutical.Characteristics.getAllChildren(): List<Any> =
  buildList {
    this@getAllChildren.id?.let { add(it) }
    addAll(this@getAllChildren.extension)
    addAll(this@getAllChildren.modifierExtension)
    add(this@getAllChildren.code)
    this@getAllChildren.status?.let { add(it) }
  }

internal fun MedicinalProductPharmaceutical.RouteOfAdministration.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "code" -> this.code
    "firstDose" -> this.firstDose
    "maxSingleDose" -> this.maxSingleDose
    "maxDosePerDay" -> this.maxDosePerDay
    "maxDosePerTreatmentPeriod" -> this.maxDosePerTreatmentPeriod
    "maxTreatmentPeriod" -> this.maxTreatmentPeriod
    "targetSpecies" -> this.targetSpecies
    else -> error("$name is not a valid property name")
  }

internal fun MedicinalProductPharmaceutical.RouteOfAdministration.hasProperty(
  name: String
): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "code" -> true
    "firstDose" -> true
    "maxSingleDose" -> true
    "maxDosePerDay" -> true
    "maxDosePerTreatmentPeriod" -> true
    "maxTreatmentPeriod" -> true
    "targetSpecies" -> true
    else -> false
  }

internal fun MedicinalProductPharmaceutical.RouteOfAdministration.getAllChildren(): List<Any> =
  buildList {
    this@getAllChildren.id?.let { add(it) }
    addAll(this@getAllChildren.extension)
    addAll(this@getAllChildren.modifierExtension)
    add(this@getAllChildren.code)
    this@getAllChildren.firstDose?.let { add(it) }
    this@getAllChildren.maxSingleDose?.let { add(it) }
    this@getAllChildren.maxDosePerDay?.let { add(it) }
    this@getAllChildren.maxDosePerTreatmentPeriod?.let { add(it) }
    this@getAllChildren.maxTreatmentPeriod?.let { add(it) }
    addAll(this@getAllChildren.targetSpecies)
  }

internal fun MedicinalProductPharmaceutical.RouteOfAdministration.TargetSpecies.getProperty(
  name: String
): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "code" -> this.code
    "withdrawalPeriod" -> this.withdrawalPeriod
    else -> error("$name is not a valid property name")
  }

internal fun MedicinalProductPharmaceutical.RouteOfAdministration.TargetSpecies.hasProperty(
  name: String
): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "code" -> true
    "withdrawalPeriod" -> true
    else -> false
  }

internal fun MedicinalProductPharmaceutical.RouteOfAdministration.TargetSpecies.getAllChildren():
  List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.code)
  addAll(this@getAllChildren.withdrawalPeriod)
}

internal fun MedicinalProductPharmaceutical.RouteOfAdministration.TargetSpecies.WithdrawalPeriod
  .getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "tissue" -> this.tissue
    "value" -> this.`value`
    "supportingInformation" -> this.supportingInformation
    else -> error("$name is not a valid property name")
  }

internal fun MedicinalProductPharmaceutical.RouteOfAdministration.TargetSpecies.WithdrawalPeriod
  .hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "tissue" -> true
    "value" -> true
    "supportingInformation" -> true
    else -> false
  }

internal fun MedicinalProductPharmaceutical.RouteOfAdministration.TargetSpecies.WithdrawalPeriod
  .getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.tissue)
  add(this@getAllChildren.`value`)
  this@getAllChildren.supportingInformation?.let { add(it) }
}
