package dev.ohs.fhir.model.r4.ext

import dev.ohs.fhir.model.r4.Extension
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun Extension.getProperty(name: String): Any? = when(name) {
  "id" -> this.id
  "extension" -> this.extension
  "url" -> this.url
  "value" -> this.`value`
  else -> error("$name is not a valid property name")
}

internal fun Extension.hasProperty(name: String): Boolean = when(name) {
  "id" -> true
  "extension" -> true
  "url" -> true
  "value" -> true
  else -> false
}

internal fun Extension.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  add(this@getAllChildren.url)
  this@getAllChildren.`value`?.let { add(it) }
}
