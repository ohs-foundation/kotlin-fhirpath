package dev.ohs.fhir.model.r4b.ext

import dev.ohs.fhir.model.r4b.UnsignedInt
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun UnsignedInt.getProperty(name: String): Any? = when(name) {
  "id" -> this.id
  "extension" -> this.extension
  "value" -> this.`value`
  else -> error("$name is not a valid property name")
}

internal fun UnsignedInt.hasProperty(name: String): Boolean = when(name) {
  "id" -> true
  "extension" -> true
  "value" -> true
  else -> false
}

internal fun UnsignedInt.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  this@getAllChildren.`value`?.let { add(it) }
}
