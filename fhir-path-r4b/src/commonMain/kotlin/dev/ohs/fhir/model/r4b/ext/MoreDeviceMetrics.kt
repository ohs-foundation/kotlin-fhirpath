package dev.ohs.fhir.model.r4b.ext

import dev.ohs.fhir.model.r4b.DeviceMetric
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun DeviceMetric.getProperty(name: String): Any? = when(name) {
  "id" -> this.id
  "meta" -> this.meta
  "implicitRules" -> this.implicitRules
  "language" -> this.language
  "text" -> this.text
  "contained" -> this.contained
  "extension" -> this.extension
  "modifierExtension" -> this.modifierExtension
  "identifier" -> this.identifier
  "type" -> this.type
  "unit" -> this.unit
  "source" -> this.source
  "parent" -> this.parent
  "operationalStatus" -> this.operationalStatus
  "color" -> this.color
  "category" -> this.category
  "measurementPeriod" -> this.measurementPeriod
  "calibration" -> this.calibration
  else -> error("$name is not a valid property name")
}

internal fun DeviceMetric.hasProperty(name: String): Boolean = when(name) {
  "id" -> true
  "meta" -> true
  "implicitRules" -> true
  "language" -> true
  "text" -> true
  "contained" -> true
  "extension" -> true
  "modifierExtension" -> true
  "identifier" -> true
  "type" -> true
  "unit" -> true
  "source" -> true
  "parent" -> true
  "operationalStatus" -> true
  "color" -> true
  "category" -> true
  "measurementPeriod" -> true
  "calibration" -> true
  else -> false
}

internal fun DeviceMetric.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.meta?.let { add(it) }
  this@getAllChildren.implicitRules?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.contained)
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.identifier)
  add(this@getAllChildren.type)
  this@getAllChildren.unit?.let { add(it) }
  this@getAllChildren.source?.let { add(it) }
  this@getAllChildren.parent?.let { add(it) }
  this@getAllChildren.operationalStatus?.let { add(it) }
  this@getAllChildren.color?.let { add(it) }
  add(this@getAllChildren.category)
  this@getAllChildren.measurementPeriod?.let { add(it) }
  addAll(this@getAllChildren.calibration)
}

internal fun DeviceMetric.Calibration.getProperty(name: String): Any? = when(name) {
  "id" -> this.id
  "extension" -> this.extension
  "modifierExtension" -> this.modifierExtension
  "type" -> this.type
  "state" -> this.state
  "time" -> this.time
  else -> error("$name is not a valid property name")
}

internal fun DeviceMetric.Calibration.hasProperty(name: String): Boolean = when(name) {
  "id" -> true
  "extension" -> true
  "modifierExtension" -> true
  "type" -> true
  "state" -> true
  "time" -> true
  else -> false
}

internal fun DeviceMetric.Calibration.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.type?.let { add(it) }
  this@getAllChildren.state?.let { add(it) }
  this@getAllChildren.time?.let { add(it) }
}
