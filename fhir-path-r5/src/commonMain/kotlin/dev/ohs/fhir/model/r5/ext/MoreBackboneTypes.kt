package dev.ohs.fhir.model.r5.ext

import dev.ohs.fhir.model.r5.BackboneType
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun BackboneType.getProperty(name: String): Any? = when(name) {
  "id" -> this.id
  "extension" -> this.extension
  "modifierExtension" -> this.modifierExtension
  else -> error("$name is not a valid property name")
}

internal fun BackboneType.hasProperty(name: String): Boolean = when(name) {
  "id" -> true
  "extension" -> true
  "modifierExtension" -> true
  else -> false
}

internal fun BackboneType.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
}
