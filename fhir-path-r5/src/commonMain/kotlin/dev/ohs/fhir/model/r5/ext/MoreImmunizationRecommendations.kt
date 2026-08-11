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

import dev.ohs.fhir.model.r5.ImmunizationRecommendation
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun ImmunizationRecommendation.getProperty(name: String): Any? =
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
    "patient" -> this.patient
    "date" -> this.date
    "authority" -> this.authority
    "recommendation" -> this.recommendation
    else -> error("$name is not a valid property name")
  }

internal fun ImmunizationRecommendation.hasProperty(name: String): Boolean =
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
    "patient" -> true
    "date" -> true
    "authority" -> true
    "recommendation" -> true
    else -> false
  }

internal fun ImmunizationRecommendation.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.meta?.let { add(it) }
  this@getAllChildren.implicitRules?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.contained)
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.identifier)
  add(this@getAllChildren.patient)
  add(this@getAllChildren.date)
  this@getAllChildren.authority?.let { add(it) }
  addAll(this@getAllChildren.recommendation)
}

internal fun ImmunizationRecommendation.Recommendation.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "vaccineCode" -> this.vaccineCode
    "targetDisease" -> this.targetDisease
    "contraindicatedVaccineCode" -> this.contraindicatedVaccineCode
    "forecastStatus" -> this.forecastStatus
    "forecastReason" -> this.forecastReason
    "dateCriterion" -> this.dateCriterion
    "description" -> this.description
    "series" -> this.series
    "doseNumber" -> this.doseNumber
    "seriesDoses" -> this.seriesDoses
    "supportingImmunization" -> this.supportingImmunization
    "supportingPatientInformation" -> this.supportingPatientInformation
    else -> error("$name is not a valid property name")
  }

internal fun ImmunizationRecommendation.Recommendation.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "vaccineCode" -> true
    "targetDisease" -> true
    "contraindicatedVaccineCode" -> true
    "forecastStatus" -> true
    "forecastReason" -> true
    "dateCriterion" -> true
    "description" -> true
    "series" -> true
    "doseNumber" -> true
    "seriesDoses" -> true
    "supportingImmunization" -> true
    "supportingPatientInformation" -> true
    else -> false
  }

internal fun ImmunizationRecommendation.Recommendation.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.vaccineCode)
  addAll(this@getAllChildren.targetDisease)
  addAll(this@getAllChildren.contraindicatedVaccineCode)
  add(this@getAllChildren.forecastStatus)
  addAll(this@getAllChildren.forecastReason)
  addAll(this@getAllChildren.dateCriterion)
  this@getAllChildren.description?.let { add(it) }
  this@getAllChildren.series?.let { add(it) }
  this@getAllChildren.doseNumber?.let { add(it) }
  this@getAllChildren.seriesDoses?.let { add(it) }
  addAll(this@getAllChildren.supportingImmunization)
  addAll(this@getAllChildren.supportingPatientInformation)
}

internal fun ImmunizationRecommendation.Recommendation.DateCriterion.getProperty(
  name: String
): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "code" -> this.code
    "value" -> this.`value`
    else -> error("$name is not a valid property name")
  }

internal fun ImmunizationRecommendation.Recommendation.DateCriterion.hasProperty(
  name: String
): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "code" -> true
    "value" -> true
    else -> false
  }

internal fun ImmunizationRecommendation.Recommendation.DateCriterion.getAllChildren(): List<Any> =
  buildList {
    this@getAllChildren.id?.let { add(it) }
    addAll(this@getAllChildren.extension)
    addAll(this@getAllChildren.modifierExtension)
    add(this@getAllChildren.code)
    add(this@getAllChildren.`value`)
  }
