package dev.ohs.fhir.model.r4b.ext

import dev.ohs.fhir.model.r4b.Parameters
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun Parameters.getProperty(name: String): Any? = when(name) {
  "id" -> this.id
  "meta" -> this.meta
  "implicitRules" -> this.implicitRules
  "language" -> this.language
  "parameter" -> this.parameter
  else -> error("$name is not a valid property name")
}

internal fun Parameters.hasProperty(name: String): Boolean = when(name) {
  "id" -> true
  "meta" -> true
  "implicitRules" -> true
  "language" -> true
  "parameter" -> true
  else -> false
}

internal fun Parameters.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.meta?.let { add(it) }
  this@getAllChildren.implicitRules?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  addAll(this@getAllChildren.parameter)
}

internal fun Parameters.Parameter.getProperty(name: String): Any? = when(name) {
  "id" -> this.id
  "extension" -> this.extension
  "modifierExtension" -> this.modifierExtension
  "name" -> this.name
  "value" -> this.`value`
  "resource" -> this.resource
  "part" -> this.part
  else -> error("$name is not a valid property name")
}

internal fun Parameters.Parameter.hasProperty(name: String): Boolean = when(name) {
  "id" -> true
  "extension" -> true
  "modifierExtension" -> true
  "name" -> true
  "value" -> true
  "resource" -> true
  "part" -> true
  else -> false
}

internal fun Parameters.Parameter.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.name)
  this@getAllChildren.`value`?.let { add(it) }
  this@getAllChildren.resource?.let { add(it) }
  addAll(this@getAllChildren.part)
}
