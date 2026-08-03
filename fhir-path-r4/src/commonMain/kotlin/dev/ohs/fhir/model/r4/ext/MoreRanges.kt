package dev.ohs.fhir.model.r4.ext

import dev.ohs.fhir.model.r4.Range
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun Range.getProperty(name: String): Any? = when(name) {
  "id" -> this.id
  "extension" -> this.extension
  "low" -> this.low
  "high" -> this.high
  else -> error("$name is not a valid property name")
}

internal fun Range.hasProperty(name: String): Boolean = when(name) {
  "id" -> true
  "extension" -> true
  "low" -> true
  "high" -> true
  else -> false
}

internal fun Range.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  this@getAllChildren.low?.let { add(it) }
  this@getAllChildren.high?.let { add(it) }
}
