package dev.ohs.fhir.model.r4.ext

import dev.ohs.fhir.model.r4.RelatedArtifact
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun RelatedArtifact.getProperty(name: String): Any? = when(name) {
  "id" -> this.id
  "extension" -> this.extension
  "type" -> this.type
  "label" -> this.label
  "display" -> this.display
  "citation" -> this.citation
  "url" -> this.url
  "document" -> this.document
  "resource" -> this.resource
  else -> error("$name is not a valid property name")
}

internal fun RelatedArtifact.hasProperty(name: String): Boolean = when(name) {
  "id" -> true
  "extension" -> true
  "type" -> true
  "label" -> true
  "display" -> true
  "citation" -> true
  "url" -> true
  "document" -> true
  "resource" -> true
  else -> false
}

internal fun RelatedArtifact.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  add(this@getAllChildren.type)
  this@getAllChildren.label?.let { add(it) }
  this@getAllChildren.display?.let { add(it) }
  this@getAllChildren.citation?.let { add(it) }
  this@getAllChildren.url?.let { add(it) }
  this@getAllChildren.document?.let { add(it) }
  this@getAllChildren.resource?.let { add(it) }
}
