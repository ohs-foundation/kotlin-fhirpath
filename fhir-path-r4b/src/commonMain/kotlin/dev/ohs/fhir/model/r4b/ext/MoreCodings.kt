package dev.ohs.fhir.model.r4b.ext

import dev.ohs.fhir.model.r4b.Coding
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun Coding.getProperty(name: String): Any? = when(name) {
  "id" -> this.id
  "extension" -> this.extension
  "system" -> this.system
  "version" -> this.version
  "code" -> this.code
  "display" -> this.display
  "userSelected" -> this.userSelected
  else -> error("$name is not a valid property name")
}

internal fun Coding.hasProperty(name: String): Boolean = when(name) {
  "id" -> true
  "extension" -> true
  "system" -> true
  "version" -> true
  "code" -> true
  "display" -> true
  "userSelected" -> true
  else -> false
}

internal fun Coding.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  this@getAllChildren.system?.let { add(it) }
  this@getAllChildren.version?.let { add(it) }
  this@getAllChildren.code?.let { add(it) }
  this@getAllChildren.display?.let { add(it) }
  this@getAllChildren.userSelected?.let { add(it) }
}
