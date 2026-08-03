package dev.ohs.fhir.model.r4b.ext

import dev.ohs.fhir.model.r4b.HumanName
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun HumanName.getProperty(name: String): Any? = when(name) {
  "id" -> this.id
  "extension" -> this.extension
  "use" -> this.use
  "text" -> this.text
  "family" -> this.family
  "given" -> this.given
  "prefix" -> this.prefix
  "suffix" -> this.suffix
  "period" -> this.period
  else -> error("$name is not a valid property name")
}

internal fun HumanName.hasProperty(name: String): Boolean = when(name) {
  "id" -> true
  "extension" -> true
  "use" -> true
  "text" -> true
  "family" -> true
  "given" -> true
  "prefix" -> true
  "suffix" -> true
  "period" -> true
  else -> false
}

internal fun HumanName.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  this@getAllChildren.use?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  this@getAllChildren.family?.let { add(it) }
  addAll(this@getAllChildren.given)
  addAll(this@getAllChildren.prefix)
  addAll(this@getAllChildren.suffix)
  this@getAllChildren.period?.let { add(it) }
}
