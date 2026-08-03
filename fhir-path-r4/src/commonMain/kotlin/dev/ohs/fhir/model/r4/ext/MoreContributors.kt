package dev.ohs.fhir.model.r4.ext

import dev.ohs.fhir.model.r4.Contributor
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun Contributor.getProperty(name: String): Any? = when(name) {
  "id" -> this.id
  "extension" -> this.extension
  "type" -> this.type
  "name" -> this.name
  "contact" -> this.contact
  else -> error("$name is not a valid property name")
}

internal fun Contributor.hasProperty(name: String): Boolean = when(name) {
  "id" -> true
  "extension" -> true
  "type" -> true
  "name" -> true
  "contact" -> true
  else -> false
}

internal fun Contributor.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  add(this@getAllChildren.type)
  add(this@getAllChildren.name)
  addAll(this@getAllChildren.contact)
}
