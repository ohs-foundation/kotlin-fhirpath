package dev.ohs.fhir.model.r4b.ext

import dev.ohs.fhir.model.r4b.Annotation
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun Annotation.getProperty(name: String): Any? = when(name) {
  "id" -> this.id
  "extension" -> this.extension
  "author" -> this.author
  "time" -> this.time
  "text" -> this.text
  else -> error("$name is not a valid property name")
}

internal fun Annotation.hasProperty(name: String): Boolean = when(name) {
  "id" -> true
  "extension" -> true
  "author" -> true
  "time" -> true
  "text" -> true
  else -> false
}

internal fun Annotation.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  this@getAllChildren.author?.let { add(it) }
  this@getAllChildren.time?.let { add(it) }
  add(this@getAllChildren.text)
}
