package dev.ohs.fhir.model.r4b.ext

import dev.ohs.fhir.model.r4b.Duration
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun Duration.getProperty(name: String): Any? = when(name) {
  "id" -> this.id
  "extension" -> this.extension
  "value" -> this.`value`
  "comparator" -> this.comparator
  "unit" -> this.unit
  "system" -> this.system
  "code" -> this.code
  else -> error("$name is not a valid property name")
}

internal fun Duration.hasProperty(name: String): Boolean = when(name) {
  "id" -> true
  "extension" -> true
  "value" -> true
  "comparator" -> true
  "unit" -> true
  "system" -> true
  "code" -> true
  else -> false
}

internal fun Duration.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  this@getAllChildren.`value`?.let { add(it) }
  this@getAllChildren.comparator?.let { add(it) }
  this@getAllChildren.unit?.let { add(it) }
  this@getAllChildren.system?.let { add(it) }
  this@getAllChildren.code?.let { add(it) }
}
