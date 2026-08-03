package dev.ohs.fhir.model.r4.ext

import dev.ohs.fhir.model.r4.Attachment
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun Attachment.getProperty(name: String): Any? = when(name) {
  "id" -> this.id
  "extension" -> this.extension
  "contentType" -> this.contentType
  "language" -> this.language
  "data" -> this.`data`
  "url" -> this.url
  "size" -> this.size
  "hash" -> this.hash
  "title" -> this.title
  "creation" -> this.creation
  else -> error("$name is not a valid property name")
}

internal fun Attachment.hasProperty(name: String): Boolean = when(name) {
  "id" -> true
  "extension" -> true
  "contentType" -> true
  "language" -> true
  "data" -> true
  "url" -> true
  "size" -> true
  "hash" -> true
  "title" -> true
  "creation" -> true
  else -> false
}

internal fun Attachment.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  this@getAllChildren.contentType?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.`data`?.let { add(it) }
  this@getAllChildren.url?.let { add(it) }
  this@getAllChildren.size?.let { add(it) }
  this@getAllChildren.hash?.let { add(it) }
  this@getAllChildren.title?.let { add(it) }
  this@getAllChildren.creation?.let { add(it) }
}
