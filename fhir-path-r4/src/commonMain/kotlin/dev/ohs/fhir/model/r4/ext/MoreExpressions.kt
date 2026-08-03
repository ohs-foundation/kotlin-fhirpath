package dev.ohs.fhir.model.r4.ext

import dev.ohs.fhir.model.r4.Expression
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun Expression.getProperty(name: String): Any? = when(name) {
  "id" -> this.id
  "extension" -> this.extension
  "description" -> this.description
  "name" -> this.name
  "language" -> this.language
  "expression" -> this.expression
  "reference" -> this.reference
  else -> error("$name is not a valid property name")
}

internal fun Expression.hasProperty(name: String): Boolean = when(name) {
  "id" -> true
  "extension" -> true
  "description" -> true
  "name" -> true
  "language" -> true
  "expression" -> true
  "reference" -> true
  else -> false
}

internal fun Expression.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  this@getAllChildren.description?.let { add(it) }
  this@getAllChildren.name?.let { add(it) }
  add(this@getAllChildren.language)
  this@getAllChildren.expression?.let { add(it) }
  this@getAllChildren.reference?.let { add(it) }
}
