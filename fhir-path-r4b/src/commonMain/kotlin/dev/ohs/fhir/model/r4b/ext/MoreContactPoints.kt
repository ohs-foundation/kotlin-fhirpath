package dev.ohs.fhir.model.r4b.ext

import dev.ohs.fhir.model.r4b.ContactPoint
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun ContactPoint.getProperty(name: String): Any? = when(name) {
  "id" -> this.id
  "extension" -> this.extension
  "system" -> this.system
  "value" -> this.`value`
  "use" -> this.use
  "rank" -> this.rank
  "period" -> this.period
  else -> error("$name is not a valid property name")
}

internal fun ContactPoint.hasProperty(name: String): Boolean = when(name) {
  "id" -> true
  "extension" -> true
  "system" -> true
  "value" -> true
  "use" -> true
  "rank" -> true
  "period" -> true
  else -> false
}

internal fun ContactPoint.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  this@getAllChildren.system?.let { add(it) }
  this@getAllChildren.`value`?.let { add(it) }
  this@getAllChildren.use?.let { add(it) }
  this@getAllChildren.rank?.let { add(it) }
  this@getAllChildren.period?.let { add(it) }
}
