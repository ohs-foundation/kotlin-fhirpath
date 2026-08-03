package dev.ohs.fhir.model.r4.ext

import dev.ohs.fhir.model.r4.Xhtml
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun Xhtml.getProperty(name: String): Any? = when(name) {
  "id" -> this.id
  "extension" -> this.extension
  "value" -> this.`value`
  else -> error("$name is not a valid property name")
}

internal fun Xhtml.hasProperty(name: String): Boolean = when(name) {
  "id" -> true
  "extension" -> true
  "value" -> true
  else -> false
}

internal fun Xhtml.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.extension?.let { add(it) }
  add(this@getAllChildren.`value`)
}
