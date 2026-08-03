package dev.ohs.fhir.model.r4b.ext

import dev.ohs.fhir.model.r4b.Address
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun Address.getProperty(name: String): Any? = when(name) {
  "id" -> this.id
  "extension" -> this.extension
  "use" -> this.use
  "type" -> this.type
  "text" -> this.text
  "line" -> this.line
  "city" -> this.city
  "district" -> this.district
  "state" -> this.state
  "postalCode" -> this.postalCode
  "country" -> this.country
  "period" -> this.period
  else -> error("$name is not a valid property name")
}

internal fun Address.hasProperty(name: String): Boolean = when(name) {
  "id" -> true
  "extension" -> true
  "use" -> true
  "type" -> true
  "text" -> true
  "line" -> true
  "city" -> true
  "district" -> true
  "state" -> true
  "postalCode" -> true
  "country" -> true
  "period" -> true
  else -> false
}

internal fun Address.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  this@getAllChildren.use?.let { add(it) }
  this@getAllChildren.type?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.line)
  this@getAllChildren.city?.let { add(it) }
  this@getAllChildren.district?.let { add(it) }
  this@getAllChildren.state?.let { add(it) }
  this@getAllChildren.postalCode?.let { add(it) }
  this@getAllChildren.country?.let { add(it) }
  this@getAllChildren.period?.let { add(it) }
}
