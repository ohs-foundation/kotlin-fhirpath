package dev.ohs.fhir.model.r4.ext

import kotlin.Any
import kotlin.Boolean
import kotlin.collections.List
import dev.ohs.fhir.model.r4.String as R4String
import kotlin.String as KotlinString

internal fun R4String.getProperty(name: KotlinString): Any? = when(name) {
  "id" -> this.id
  "extension" -> this.extension
  "value" -> this.`value`
  else -> error("$name is not a valid property name")
}

internal fun R4String.hasProperty(name: KotlinString): Boolean = when(name) {
  "id" -> true
  "extension" -> true
  "value" -> true
  else -> false
}

internal fun R4String.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  this@getAllChildren.`value`?.let { add(it) }
}
