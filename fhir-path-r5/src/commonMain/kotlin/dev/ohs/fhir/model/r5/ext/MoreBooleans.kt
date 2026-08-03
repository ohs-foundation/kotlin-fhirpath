package dev.ohs.fhir.model.r5.ext

import kotlin.Any
import kotlin.String
import kotlin.collections.List
import dev.ohs.fhir.model.r5.Boolean as R5Boolean
import kotlin.Boolean as KotlinBoolean

internal fun R5Boolean.getProperty(name: String): Any? = when(name) {
  "id" -> this.id
  "extension" -> this.extension
  "value" -> this.`value`
  else -> error("$name is not a valid property name")
}

internal fun R5Boolean.hasProperty(name: String): KotlinBoolean = when(name) {
  "id" -> true
  "extension" -> true
  "value" -> true
  else -> false
}

internal fun R5Boolean.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  this@getAllChildren.`value`?.let { add(it) }
}
