package dev.ohs.fhir.model.r4b.ext

import dev.ohs.fhir.model.r4b.ParameterDefinition
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun ParameterDefinition.getProperty(name: String): Any? = when(name) {
  "id" -> this.id
  "extension" -> this.extension
  "name" -> this.name
  "use" -> this.use
  "min" -> this.min
  "max" -> this.max
  "documentation" -> this.documentation
  "type" -> this.type
  "profile" -> this.profile
  else -> error("$name is not a valid property name")
}

internal fun ParameterDefinition.hasProperty(name: String): Boolean = when(name) {
  "id" -> true
  "extension" -> true
  "name" -> true
  "use" -> true
  "min" -> true
  "max" -> true
  "documentation" -> true
  "type" -> true
  "profile" -> true
  else -> false
}

internal fun ParameterDefinition.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  this@getAllChildren.name?.let { add(it) }
  add(this@getAllChildren.use)
  this@getAllChildren.min?.let { add(it) }
  this@getAllChildren.max?.let { add(it) }
  this@getAllChildren.documentation?.let { add(it) }
  add(this@getAllChildren.type)
  this@getAllChildren.profile?.let { add(it) }
}
