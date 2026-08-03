package dev.ohs.fhir.model.r4.ext

import dev.ohs.fhir.model.r4.TriggerDefinition
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun TriggerDefinition.getProperty(name: String): Any? = when(name) {
  "id" -> this.id
  "extension" -> this.extension
  "type" -> this.type
  "name" -> this.name
  "timing" -> this.timing
  "data" -> this.`data`
  "condition" -> this.condition
  else -> error("$name is not a valid property name")
}

internal fun TriggerDefinition.hasProperty(name: String): Boolean = when(name) {
  "id" -> true
  "extension" -> true
  "type" -> true
  "name" -> true
  "timing" -> true
  "data" -> true
  "condition" -> true
  else -> false
}

internal fun TriggerDefinition.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  add(this@getAllChildren.type)
  this@getAllChildren.name?.let { add(it) }
  this@getAllChildren.timing?.let { add(it) }
  addAll(this@getAllChildren.`data`)
  this@getAllChildren.condition?.let { add(it) }
}
