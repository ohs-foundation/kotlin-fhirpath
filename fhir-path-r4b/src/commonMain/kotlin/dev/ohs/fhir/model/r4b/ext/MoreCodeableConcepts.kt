package dev.ohs.fhir.model.r4b.ext

import dev.ohs.fhir.model.r4b.CodeableConcept
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun CodeableConcept.getProperty(name: String): Any? = when(name) {
  "id" -> this.id
  "extension" -> this.extension
  "coding" -> this.coding
  "text" -> this.text
  else -> error("$name is not a valid property name")
}

internal fun CodeableConcept.hasProperty(name: String): Boolean = when(name) {
  "id" -> true
  "extension" -> true
  "coding" -> true
  "text" -> true
  else -> false
}

internal fun CodeableConcept.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.coding)
  this@getAllChildren.text?.let { add(it) }
}
