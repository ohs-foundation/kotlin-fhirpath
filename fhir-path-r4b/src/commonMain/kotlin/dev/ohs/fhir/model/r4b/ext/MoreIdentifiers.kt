package dev.ohs.fhir.model.r4b.ext

import dev.ohs.fhir.model.r4b.Identifier
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun Identifier.getProperty(name: String): Any? = when(name) {
  "id" -> this.id
  "extension" -> this.extension
  "use" -> this.use
  "type" -> this.type
  "system" -> this.system
  "value" -> this.`value`
  "period" -> this.period
  "assigner" -> this.assigner
  else -> error("$name is not a valid property name")
}

internal fun Identifier.hasProperty(name: String): Boolean = when(name) {
  "id" -> true
  "extension" -> true
  "use" -> true
  "type" -> true
  "system" -> true
  "value" -> true
  "period" -> true
  "assigner" -> true
  else -> false
}

internal fun Identifier.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  this@getAllChildren.use?.let { add(it) }
  this@getAllChildren.type?.let { add(it) }
  this@getAllChildren.system?.let { add(it) }
  this@getAllChildren.`value`?.let { add(it) }
  this@getAllChildren.period?.let { add(it) }
  this@getAllChildren.assigner?.let { add(it) }
}
