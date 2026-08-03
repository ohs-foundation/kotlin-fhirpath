package dev.ohs.fhir.model.r5.ext

import dev.ohs.fhir.model.r5.Binary
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun Binary.getProperty(name: String): Any? = when(name) {
  "id" -> this.id
  "meta" -> this.meta
  "implicitRules" -> this.implicitRules
  "language" -> this.language
  "contentType" -> this.contentType
  "securityContext" -> this.securityContext
  "data" -> this.`data`
  else -> error("$name is not a valid property name")
}

internal fun Binary.hasProperty(name: String): Boolean = when(name) {
  "id" -> true
  "meta" -> true
  "implicitRules" -> true
  "language" -> true
  "contentType" -> true
  "securityContext" -> true
  "data" -> true
  else -> false
}

internal fun Binary.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.meta?.let { add(it) }
  this@getAllChildren.implicitRules?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  add(this@getAllChildren.contentType)
  this@getAllChildren.securityContext?.let { add(it) }
  this@getAllChildren.`data`?.let { add(it) }
}
