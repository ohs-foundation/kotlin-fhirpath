package dev.ohs.fhir.model.r4b.ext

import dev.ohs.fhir.model.r4b.Narrative
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun Narrative.getProperty(name: String): Any? = when(name) {
  "id" -> this.id
  "extension" -> this.extension
  "status" -> this.status
  "div" -> this.div
  else -> error("$name is not a valid property name")
}

internal fun Narrative.hasProperty(name: String): Boolean = when(name) {
  "id" -> true
  "extension" -> true
  "status" -> true
  "div" -> true
  else -> false
}

internal fun Narrative.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  add(this@getAllChildren.status)
  add(this@getAllChildren.div)
}
