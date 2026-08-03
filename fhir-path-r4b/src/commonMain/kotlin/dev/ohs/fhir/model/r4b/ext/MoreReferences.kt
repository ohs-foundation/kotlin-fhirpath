package dev.ohs.fhir.model.r4b.ext

import dev.ohs.fhir.model.r4b.Reference
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun Reference.getProperty(name: String): Any? = when(name) {
  "id" -> this.id
  "extension" -> this.extension
  "reference" -> this.reference
  "type" -> this.type
  "identifier" -> this.identifier
  "display" -> this.display
  else -> error("$name is not a valid property name")
}

internal fun Reference.hasProperty(name: String): Boolean = when(name) {
  "id" -> true
  "extension" -> true
  "reference" -> true
  "type" -> true
  "identifier" -> true
  "display" -> true
  else -> false
}

internal fun Reference.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  this@getAllChildren.reference?.let { add(it) }
  this@getAllChildren.type?.let { add(it) }
  this@getAllChildren.identifier?.let { add(it) }
  this@getAllChildren.display?.let { add(it) }
}
