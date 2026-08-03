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

import dev.ohs.fhir.model.r5.ObservationDefinition
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
    "url" -> this.url
    "identifier" -> this.identifier
    "version" -> this.version
    "versionAlgorithm" -> this.versionAlgorithm
    "name" -> this.name
    "title" -> this.title
    "status" -> this.status
    "experimental" -> this.experimental
    "date" -> this.date
    "publisher" -> this.publisher
    "contact" -> this.contact
    "description" -> this.description
    "useContext" -> this.useContext
    "jurisdiction" -> this.jurisdiction
    "purpose" -> this.purpose
    "copyright" -> this.copyright
    "copyrightLabel" -> this.copyrightLabel
    "approvalDate" -> this.approvalDate
    "lastReviewDate" -> this.lastReviewDate
    "effectivePeriod" -> this.effectivePeriod
    "derivedFromCanonical" -> this.derivedFromCanonical
    "derivedFromUri" -> this.derivedFromUri
    "subject" -> this.subject
    "performerType" -> this.performerType
    "category" -> this.category
    "code" -> this.code
    "permittedDataType" -> this.permittedDataType
    "multipleResultsAllowed" -> this.multipleResultsAllowed
    "bodySite" -> this.bodySite
    "method" -> this.method
    "specimen" -> this.specimen
    "device" -> this.device
    "preferredReportName" -> this.preferredReportName
    "permittedUnit" -> this.permittedUnit
    "qualifiedValue" -> this.qualifiedValue
    "hasMember" -> this.hasMember
    "component" -> this.component
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
    "url" -> true
    "identifier" -> true
    "version" -> true
    "versionAlgorithm" -> true
    "name" -> true
    "title" -> true
    "status" -> true
    "experimental" -> true
    "date" -> true
    "publisher" -> true
    "contact" -> true
    "description" -> true
    "useContext" -> true
    "jurisdiction" -> true
    "purpose" -> true
    "copyright" -> true
    "copyrightLabel" -> true
    "approvalDate" -> true
    "lastReviewDate" -> true
    "effectivePeriod" -> true
    "derivedFromCanonical" -> true
    "derivedFromUri" -> true
    "subject" -> true
    "performerType" -> true
    "category" -> true
    "code" -> true
    "permittedDataType" -> true
    "multipleResultsAllowed" -> true
    "bodySite" -> true
    "method" -> true
    "specimen" -> true
    "device" -> true
    "preferredReportName" -> true
    "permittedUnit" -> true
    "qualifiedValue" -> true
    "hasMember" -> true
    "component" -> true
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
  this@getAllChildren.url?.let { add(it) }
  this@getAllChildren.identifier?.let { add(it) }
  this@getAllChildren.version?.let { add(it) }
  this@getAllChildren.versionAlgorithm?.let { add(it) }
  this@getAllChildren.name?.let { add(it) }
  this@getAllChildren.title?.let { add(it) }
  add(this@getAllChildren.status)
  this@getAllChildren.experimental?.let { add(it) }
  this@getAllChildren.date?.let { add(it) }
  this@getAllChildren.publisher?.let { add(it) }
  addAll(this@getAllChildren.contact)
  this@getAllChildren.description?.let { add(it) }
  addAll(this@getAllChildren.useContext)
  addAll(this@getAllChildren.jurisdiction)
  this@getAllChildren.purpose?.let { add(it) }
  this@getAllChildren.copyright?.let { add(it) }
  this@getAllChildren.copyrightLabel?.let { add(it) }
  this@getAllChildren.approvalDate?.let { add(it) }
  this@getAllChildren.lastReviewDate?.let { add(it) }
  this@getAllChildren.effectivePeriod?.let { add(it) }
  addAll(this@getAllChildren.derivedFromCanonical)
  addAll(this@getAllChildren.derivedFromUri)
  addAll(this@getAllChildren.subject)
  this@getAllChildren.performerType?.let { add(it) }
  addAll(this@getAllChildren.category)
  add(this@getAllChildren.code)
  addAll(this@getAllChildren.permittedDataType)
  this@getAllChildren.multipleResultsAllowed?.let { add(it) }
  this@getAllChildren.bodySite?.let { add(it) }
  this@getAllChildren.method?.let { add(it) }
  addAll(this@getAllChildren.specimen)
  addAll(this@getAllChildren.device)
  this@getAllChildren.preferredReportName?.let { add(it) }
  addAll(this@getAllChildren.permittedUnit)
  addAll(this@getAllChildren.qualifiedValue)
  addAll(this@getAllChildren.hasMember)
  addAll(this@getAllChildren.component)
}

internal fun ObservationDefinition.QualifiedValue.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "context" -> this.context
    "appliesTo" -> this.appliesTo
    "gender" -> this.gender
    "age" -> this.age
    "gestationalAge" -> this.gestationalAge
    "condition" -> this.condition
    "rangeCategory" -> this.rangeCategory
    "range" -> this.range
    "validCodedValueSet" -> this.validCodedValueSet
    "normalCodedValueSet" -> this.normalCodedValueSet
    "abnormalCodedValueSet" -> this.abnormalCodedValueSet
    "criticalCodedValueSet" -> this.criticalCodedValueSet
    else -> error("$name is not a valid property name")
  }

internal fun ObservationDefinition.QualifiedValue.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "context" -> true
    "appliesTo" -> true
    "gender" -> true
    "age" -> true
    "gestationalAge" -> true
    "condition" -> true
    "rangeCategory" -> true
    "range" -> true
    "validCodedValueSet" -> true
    "normalCodedValueSet" -> true
    "abnormalCodedValueSet" -> true
    "criticalCodedValueSet" -> true
    else -> false
  }

internal fun ObservationDefinition.QualifiedValue.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.context?.let { add(it) }
  addAll(this@getAllChildren.appliesTo)
  this@getAllChildren.gender?.let { add(it) }
  this@getAllChildren.age?.let { add(it) }
  this@getAllChildren.gestationalAge?.let { add(it) }
  this@getAllChildren.condition?.let { add(it) }
  this@getAllChildren.rangeCategory?.let { add(it) }
  this@getAllChildren.range?.let { add(it) }
  this@getAllChildren.validCodedValueSet?.let { add(it) }
  this@getAllChildren.normalCodedValueSet?.let { add(it) }
  this@getAllChildren.abnormalCodedValueSet?.let { add(it) }
  this@getAllChildren.criticalCodedValueSet?.let { add(it) }
}

internal fun ObservationDefinition.Component.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "code" -> this.code
    "permittedDataType" -> this.permittedDataType
    "permittedUnit" -> this.permittedUnit
    "qualifiedValue" -> this.qualifiedValue
    else -> error("$name is not a valid property name")
  }

internal fun ObservationDefinition.Component.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "code" -> true
    "permittedDataType" -> true
    "permittedUnit" -> true
    "qualifiedValue" -> true
    else -> false
  }

internal fun ObservationDefinition.Component.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.code)
  addAll(this@getAllChildren.permittedDataType)
  addAll(this@getAllChildren.permittedUnit)
  addAll(this@getAllChildren.qualifiedValue)
}
