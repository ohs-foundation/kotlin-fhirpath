package dev.ohs.fhir.model.r4b.ext

import kotlin.Any
import kotlin.Boolean
import kotlin.collections.List
import dev.ohs.fhir.model.r4b.String as R4bString
import kotlin.String as KotlinString

internal fun R4bString.getProperty(name: KotlinString): Any? = when(name) {
  "id" -> this.id
  "extension" -> this.extension
  "value" -> this.`value`
  else -> error("$name is not a valid property name")
}

internal fun R4bString.hasProperty(name: KotlinString): Boolean = when(name) {
  "id" -> true
  "extension" -> true
  "value" -> true
  else -> false
}

internal fun R4bString.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  this@getAllChildren.`value`?.let { add(it) }
}
