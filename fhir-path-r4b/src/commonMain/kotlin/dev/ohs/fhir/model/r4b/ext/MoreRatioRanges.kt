package dev.ohs.fhir.model.r4b.ext

import dev.ohs.fhir.model.r4b.RatioRange
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun RatioRange.getProperty(name: String): Any? = when(name) {
  "id" -> this.id
  "extension" -> this.extension
  "lowNumerator" -> this.lowNumerator
  "highNumerator" -> this.highNumerator
  "denominator" -> this.denominator
  else -> error("$name is not a valid property name")
}

internal fun RatioRange.hasProperty(name: String): Boolean = when(name) {
  "id" -> true
  "extension" -> true
  "lowNumerator" -> true
  "highNumerator" -> true
  "denominator" -> true
  else -> false
}

internal fun RatioRange.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  this@getAllChildren.lowNumerator?.let { add(it) }
  this@getAllChildren.highNumerator?.let { add(it) }
  this@getAllChildren.denominator?.let { add(it) }
}
