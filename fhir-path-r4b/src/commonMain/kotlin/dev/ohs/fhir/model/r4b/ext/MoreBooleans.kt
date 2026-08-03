package dev.ohs.fhir.model.r4b.ext

import kotlin.Any
import kotlin.String
import kotlin.collections.List
import dev.ohs.fhir.model.r4b.Boolean as R4bBoolean
import kotlin.Boolean as KotlinBoolean

internal fun R4bBoolean.getProperty(name: String): Any? = when(name) {
  "id" -> this.id
  "extension" -> this.extension
  "value" -> this.`value`
  else -> error("$name is not a valid property name")
}

internal fun R4bBoolean.hasProperty(name: String): KotlinBoolean = when(name) {
  "id" -> true
  "extension" -> true
  "value" -> true
  else -> false
}

internal fun R4bBoolean.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  this@getAllChildren.`value`?.let { add(it) }
}
