package dev.ohs.fhir.model.r4b.ext

import dev.ohs.fhir.model.r4b.CodeableReference
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun CodeableReference.getProperty(name: String): Any? = when(name) {
  "id" -> this.id
  "extension" -> this.extension
  "concept" -> this.concept
  "reference" -> this.reference
  else -> error("$name is not a valid property name")
}

internal fun CodeableReference.hasProperty(name: String): Boolean = when(name) {
  "id" -> true
  "extension" -> true
  "concept" -> true
  "reference" -> true
  else -> false
}

internal fun CodeableReference.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  this@getAllChildren.concept?.let { add(it) }
  this@getAllChildren.reference?.let { add(it) }
}
