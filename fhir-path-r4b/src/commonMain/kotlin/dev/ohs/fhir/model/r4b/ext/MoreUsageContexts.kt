package dev.ohs.fhir.model.r4b.ext

import dev.ohs.fhir.model.r4b.UsageContext
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun UsageContext.getProperty(name: String): Any? = when(name) {
  "id" -> this.id
  "extension" -> this.extension
  "code" -> this.code
  "value" -> this.`value`
  else -> error("$name is not a valid property name")
}

internal fun UsageContext.hasProperty(name: String): Boolean = when(name) {
  "id" -> true
  "extension" -> true
  "code" -> true
  "value" -> true
  else -> false
}

internal fun UsageContext.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  add(this@getAllChildren.code)
  add(this@getAllChildren.`value`)
}
