package dev.ohs.fhir.model.r4b.ext

import dev.ohs.fhir.model.r4b.Signature
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun Signature.getProperty(name: String): Any? = when(name) {
  "id" -> this.id
  "extension" -> this.extension
  "type" -> this.type
  "when" -> this.`when`
  "who" -> this.who
  "onBehalfOf" -> this.onBehalfOf
  "targetFormat" -> this.targetFormat
  "sigFormat" -> this.sigFormat
  "data" -> this.`data`
  else -> error("$name is not a valid property name")
}

internal fun Signature.hasProperty(name: String): Boolean = when(name) {
  "id" -> true
  "extension" -> true
  "type" -> true
  "when" -> true
  "who" -> true
  "onBehalfOf" -> true
  "targetFormat" -> true
  "sigFormat" -> true
  "data" -> true
  else -> false
}

internal fun Signature.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.type)
  add(this@getAllChildren.`when`)
  add(this@getAllChildren.who)
  this@getAllChildren.onBehalfOf?.let { add(it) }
  this@getAllChildren.targetFormat?.let { add(it) }
  this@getAllChildren.sigFormat?.let { add(it) }
  this@getAllChildren.`data`?.let { add(it) }
}
