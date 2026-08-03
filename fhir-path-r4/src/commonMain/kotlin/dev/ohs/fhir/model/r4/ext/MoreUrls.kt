package dev.ohs.fhir.model.r4.ext

import dev.ohs.fhir.model.r4.Url
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun Url.getProperty(name: String): Any? = when(name) {
  "id" -> this.id
  "extension" -> this.extension
  "value" -> this.`value`
  else -> error("$name is not a valid property name")
}

internal fun Url.hasProperty(name: String): Boolean = when(name) {
  "id" -> true
  "extension" -> true
  "value" -> true
  else -> false
}

internal fun Url.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  this@getAllChildren.`value`?.let { add(it) }
}
