package dev.ohs.fhir.model.r4b.ext

import dev.ohs.fhir.model.r4b.Period
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun Period.getProperty(name: String): Any? = when(name) {
  "id" -> this.id
  "extension" -> this.extension
  "start" -> this.start
  "end" -> this.end
  else -> error("$name is not a valid property name")
}

internal fun Period.hasProperty(name: String): Boolean = when(name) {
  "id" -> true
  "extension" -> true
  "start" -> true
  "end" -> true
  else -> false
}

internal fun Period.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  this@getAllChildren.start?.let { add(it) }
  this@getAllChildren.end?.let { add(it) }
}
