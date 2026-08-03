package dev.ohs.fhir.model.r4b.ext

import dev.ohs.fhir.model.r4b.DataType
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun DataType.getProperty(name: String): Any? = when(name) {
  "id" -> this.id
  "extension" -> this.extension
  else -> error("$name is not a valid property name")
}

internal fun DataType.hasProperty(name: String): Boolean = when(name) {
  "id" -> true
  "extension" -> true
  else -> false
}

internal fun DataType.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
}
