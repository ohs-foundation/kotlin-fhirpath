package dev.ohs.fhir.model.r4.ext

import dev.ohs.fhir.model.r4.Ratio
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun Ratio.getProperty(name: String): Any? = when(name) {
  "id" -> this.id
  "extension" -> this.extension
  "numerator" -> this.numerator
  "denominator" -> this.denominator
  else -> error("$name is not a valid property name")
}

internal fun Ratio.hasProperty(name: String): Boolean = when(name) {
  "id" -> true
  "extension" -> true
  "numerator" -> true
  "denominator" -> true
  else -> false
}

internal fun Ratio.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  this@getAllChildren.numerator?.let { add(it) }
  this@getAllChildren.denominator?.let { add(it) }
}
