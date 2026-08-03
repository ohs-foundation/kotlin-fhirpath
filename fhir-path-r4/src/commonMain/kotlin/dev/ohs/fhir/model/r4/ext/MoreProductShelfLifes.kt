package dev.ohs.fhir.model.r4.ext

import dev.ohs.fhir.model.r4.ProductShelfLife
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun ProductShelfLife.getProperty(name: String): Any? = when(name) {
  "id" -> this.id
  "extension" -> this.extension
  "modifierExtension" -> this.modifierExtension
  "identifier" -> this.identifier
  "type" -> this.type
  "period" -> this.period
  "specialPrecautionsForStorage" -> this.specialPrecautionsForStorage
  else -> error("$name is not a valid property name")
}

internal fun ProductShelfLife.hasProperty(name: String): Boolean = when(name) {
  "id" -> true
  "extension" -> true
  "modifierExtension" -> true
  "identifier" -> true
  "type" -> true
  "period" -> true
  "specialPrecautionsForStorage" -> true
  else -> false
}

internal fun ProductShelfLife.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.identifier?.let { add(it) }
  add(this@getAllChildren.type)
  add(this@getAllChildren.period)
  addAll(this@getAllChildren.specialPrecautionsForStorage)
}
