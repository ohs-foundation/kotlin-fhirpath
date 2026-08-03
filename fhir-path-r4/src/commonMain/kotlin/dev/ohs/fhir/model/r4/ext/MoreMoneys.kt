package dev.ohs.fhir.model.r4.ext

import dev.ohs.fhir.model.r4.Money
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun Money.getProperty(name: String): Any? = when(name) {
  "id" -> this.id
  "extension" -> this.extension
  "value" -> this.`value`
  "currency" -> this.currency
  else -> error("$name is not a valid property name")
}

internal fun Money.hasProperty(name: String): Boolean = when(name) {
  "id" -> true
  "extension" -> true
  "value" -> true
  "currency" -> true
  else -> false
}

internal fun Money.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  this@getAllChildren.`value`?.let { add(it) }
  this@getAllChildren.currency?.let { add(it) }
}
