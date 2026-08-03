package dev.ohs.fhir.model.r5.ext

import dev.ohs.fhir.model.r5.Availability
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun Availability.getProperty(name: String): Any? = when(name) {
  "id" -> this.id
  "extension" -> this.extension
  "availableTime" -> this.availableTime
  "notAvailableTime" -> this.notAvailableTime
  else -> error("$name is not a valid property name")
}

internal fun Availability.hasProperty(name: String): Boolean = when(name) {
  "id" -> true
  "extension" -> true
  "availableTime" -> true
  "notAvailableTime" -> true
  else -> false
}

internal fun Availability.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.availableTime)
  addAll(this@getAllChildren.notAvailableTime)
}

internal fun Availability.AvailableTime.getProperty(name: String): Any? = when(name) {
  "id" -> this.id
  "extension" -> this.extension
  "daysOfWeek" -> this.daysOfWeek
  "allDay" -> this.allDay
  "availableStartTime" -> this.availableStartTime
  "availableEndTime" -> this.availableEndTime
  else -> error("$name is not a valid property name")
}

internal fun Availability.AvailableTime.hasProperty(name: String): Boolean = when(name) {
  "id" -> true
  "extension" -> true
  "daysOfWeek" -> true
  "allDay" -> true
  "availableStartTime" -> true
  "availableEndTime" -> true
  else -> false
}

internal fun Availability.AvailableTime.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.daysOfWeek)
  this@getAllChildren.allDay?.let { add(it) }
  this@getAllChildren.availableStartTime?.let { add(it) }
  this@getAllChildren.availableEndTime?.let { add(it) }
}

internal fun Availability.NotAvailableTime.getProperty(name: String): Any? = when(name) {
  "id" -> this.id
  "extension" -> this.extension
  "description" -> this.description
  "during" -> this.during
  else -> error("$name is not a valid property name")
}

internal fun Availability.NotAvailableTime.hasProperty(name: String): Boolean = when(name) {
  "id" -> true
  "extension" -> true
  "description" -> true
  "during" -> true
  else -> false
}

internal fun Availability.NotAvailableTime.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  this@getAllChildren.description?.let { add(it) }
  this@getAllChildren.during?.let { add(it) }
}
