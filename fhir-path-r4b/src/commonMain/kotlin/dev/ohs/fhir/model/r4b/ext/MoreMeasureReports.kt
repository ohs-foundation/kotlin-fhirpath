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

import dev.ohs.fhir.model.r4b.MeasureReport
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun MeasureReport.getProperty(name: String): Any? =
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
    "type" -> this.type
    "measure" -> this.measure
    "subject" -> this.subject
    "date" -> this.date
    "reporter" -> this.reporter
    "period" -> this.period
    "improvementNotation" -> this.improvementNotation
    "group" -> this.group
    "evaluatedResource" -> this.evaluatedResource
    else -> error("$name is not a valid property name")
  }

internal fun MeasureReport.hasProperty(name: String): Boolean =
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
    "type" -> true
    "measure" -> true
    "subject" -> true
    "date" -> true
    "reporter" -> true
    "period" -> true
    "improvementNotation" -> true
    "group" -> true
    "evaluatedResource" -> true
    else -> false
  }

internal fun MeasureReport.getAllChildren(): List<Any> = buildList {
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
  add(this@getAllChildren.type)
  add(this@getAllChildren.measure)
  this@getAllChildren.subject?.let { add(it) }
  this@getAllChildren.date?.let { add(it) }
  this@getAllChildren.reporter?.let { add(it) }
  add(this@getAllChildren.period)
  this@getAllChildren.improvementNotation?.let { add(it) }
  addAll(this@getAllChildren.group)
  addAll(this@getAllChildren.evaluatedResource)
}

internal fun MeasureReport.Group.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "code" -> this.code
    "population" -> this.population
    "measureScore" -> this.measureScore
    "stratifier" -> this.stratifier
    else -> error("$name is not a valid property name")
  }

internal fun MeasureReport.Group.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "code" -> true
    "population" -> true
    "measureScore" -> true
    "stratifier" -> true
    else -> false
  }

internal fun MeasureReport.Group.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.code?.let { add(it) }
  addAll(this@getAllChildren.population)
  this@getAllChildren.measureScore?.let { add(it) }
  addAll(this@getAllChildren.stratifier)
}

internal fun MeasureReport.Group.Population.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "code" -> this.code
    "count" -> this.count
    "subjectResults" -> this.subjectResults
    else -> error("$name is not a valid property name")
  }

internal fun MeasureReport.Group.Population.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "code" -> true
    "count" -> true
    "subjectResults" -> true
    else -> false
  }

internal fun MeasureReport.Group.Population.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.code?.let { add(it) }
  this@getAllChildren.count?.let { add(it) }
  this@getAllChildren.subjectResults?.let { add(it) }
}

internal fun MeasureReport.Group.Stratifier.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "code" -> this.code
    "stratum" -> this.stratum
    else -> error("$name is not a valid property name")
  }

internal fun MeasureReport.Group.Stratifier.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "code" -> true
    "stratum" -> true
    else -> false
  }

internal fun MeasureReport.Group.Stratifier.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.code)
  addAll(this@getAllChildren.stratum)
}

internal fun MeasureReport.Group.Stratifier.Stratum.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "value" -> this.`value`
    "component" -> this.component
    "population" -> this.population
    "measureScore" -> this.measureScore
    else -> error("$name is not a valid property name")
  }

internal fun MeasureReport.Group.Stratifier.Stratum.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "value" -> true
    "component" -> true
    "population" -> true
    "measureScore" -> true
    else -> false
  }

internal fun MeasureReport.Group.Stratifier.Stratum.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.`value`?.let { add(it) }
  addAll(this@getAllChildren.component)
  addAll(this@getAllChildren.population)
  this@getAllChildren.measureScore?.let { add(it) }
}

internal fun MeasureReport.Group.Stratifier.Stratum.Component.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "code" -> this.code
    "value" -> this.`value`
    else -> error("$name is not a valid property name")
  }

internal fun MeasureReport.Group.Stratifier.Stratum.Component.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "code" -> true
    "value" -> true
    else -> false
  }

internal fun MeasureReport.Group.Stratifier.Stratum.Component.getAllChildren(): List<Any> =
  buildList {
    this@getAllChildren.id?.let { add(it) }
    addAll(this@getAllChildren.extension)
    addAll(this@getAllChildren.modifierExtension)
    add(this@getAllChildren.code)
    add(this@getAllChildren.`value`)
  }

internal fun MeasureReport.Group.Stratifier.Stratum.Population.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "code" -> this.code
    "count" -> this.count
    "subjectResults" -> this.subjectResults
    else -> error("$name is not a valid property name")
  }

internal fun MeasureReport.Group.Stratifier.Stratum.Population.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "code" -> true
    "count" -> true
    "subjectResults" -> true
    else -> false
  }

internal fun MeasureReport.Group.Stratifier.Stratum.Population.getAllChildren(): List<Any> =
  buildList {
    this@getAllChildren.id?.let { add(it) }
    addAll(this@getAllChildren.extension)
    addAll(this@getAllChildren.modifierExtension)
    this@getAllChildren.code?.let { add(it) }
    this@getAllChildren.count?.let { add(it) }
    this@getAllChildren.subjectResults?.let { add(it) }
  }
