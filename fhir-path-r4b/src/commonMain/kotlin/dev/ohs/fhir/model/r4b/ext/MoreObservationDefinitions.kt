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

import dev.ohs.fhir.model.r4b.ObservationDefinition
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun ObservationDefinition.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "meta" -> this.meta
    "implicitRules" -> this.implicitRules
    "language" -> this.language
    "text" -> this.text
    "contained" -> this.contained
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "category" -> this.category
    "code" -> this.code
    "identifier" -> this.identifier
    "permittedDataType" -> this.permittedDataType
    "multipleResultsAllowed" -> this.multipleResultsAllowed
    "method" -> this.method
    "preferredReportName" -> this.preferredReportName
    "quantitativeDetails" -> this.quantitativeDetails
    "qualifiedInterval" -> this.qualifiedInterval
    "validCodedValueSet" -> this.validCodedValueSet
    "normalCodedValueSet" -> this.normalCodedValueSet
    "abnormalCodedValueSet" -> this.abnormalCodedValueSet
    "criticalCodedValueSet" -> this.criticalCodedValueSet
    else -> error("$name is not a valid property name")
  }

internal fun ObservationDefinition.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "meta" -> true
    "implicitRules" -> true
    "language" -> true
    "text" -> true
    "contained" -> true
    "extension" -> true
    "modifierExtension" -> true
    "category" -> true
    "code" -> true
    "identifier" -> true
    "permittedDataType" -> true
    "multipleResultsAllowed" -> true
    "method" -> true
    "preferredReportName" -> true
    "quantitativeDetails" -> true
    "qualifiedInterval" -> true
    "validCodedValueSet" -> true
    "normalCodedValueSet" -> true
    "abnormalCodedValueSet" -> true
    "criticalCodedValueSet" -> true
    else -> false
  }

internal fun ObservationDefinition.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.meta?.let { add(it) }
  this@getAllChildren.implicitRules?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.contained)
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.category)
  add(this@getAllChildren.code)
  addAll(this@getAllChildren.identifier)
  addAll(this@getAllChildren.permittedDataType)
  this@getAllChildren.multipleResultsAllowed?.let { add(it) }
  this@getAllChildren.method?.let { add(it) }
  this@getAllChildren.preferredReportName?.let { add(it) }
  this@getAllChildren.quantitativeDetails?.let { add(it) }
  addAll(this@getAllChildren.qualifiedInterval)
  this@getAllChildren.validCodedValueSet?.let { add(it) }
  this@getAllChildren.normalCodedValueSet?.let { add(it) }
  this@getAllChildren.abnormalCodedValueSet?.let { add(it) }
  this@getAllChildren.criticalCodedValueSet?.let { add(it) }
}

internal fun ObservationDefinition.QuantitativeDetails.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "customaryUnit" -> this.customaryUnit
    "unit" -> this.unit
    "conversionFactor" -> this.conversionFactor
    "decimalPrecision" -> this.decimalPrecision
    else -> error("$name is not a valid property name")
  }

internal fun ObservationDefinition.QuantitativeDetails.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "customaryUnit" -> true
    "unit" -> true
    "conversionFactor" -> true
    "decimalPrecision" -> true
    else -> false
  }

internal fun ObservationDefinition.QuantitativeDetails.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.customaryUnit?.let { add(it) }
  this@getAllChildren.unit?.let { add(it) }
  this@getAllChildren.conversionFactor?.let { add(it) }
  this@getAllChildren.decimalPrecision?.let { add(it) }
}

internal fun ObservationDefinition.QualifiedInterval.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "category" -> this.category
    "range" -> this.range
    "context" -> this.context
    "appliesTo" -> this.appliesTo
    "gender" -> this.gender
    "age" -> this.age
    "gestationalAge" -> this.gestationalAge
    "condition" -> this.condition
    else -> error("$name is not a valid property name")
  }

internal fun ObservationDefinition.QualifiedInterval.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "category" -> true
    "range" -> true
    "context" -> true
    "appliesTo" -> true
    "gender" -> true
    "age" -> true
    "gestationalAge" -> true
    "condition" -> true
    else -> false
  }

internal fun ObservationDefinition.QualifiedInterval.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.category?.let { add(it) }
  this@getAllChildren.range?.let { add(it) }
  this@getAllChildren.context?.let { add(it) }
  addAll(this@getAllChildren.appliesTo)
  this@getAllChildren.gender?.let { add(it) }
  this@getAllChildren.age?.let { add(it) }
  this@getAllChildren.gestationalAge?.let { add(it) }
  this@getAllChildren.condition?.let { add(it) }
}
