package dev.ohs.fhir.model.r4b.ext

import dev.ohs.fhir.model.r4b.Meta
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun Meta.getProperty(name: String): Any? = when(name) {
  "id" -> this.id
  "extension" -> this.extension
  "versionId" -> this.versionId
  "lastUpdated" -> this.lastUpdated
  "source" -> this.source
  "profile" -> this.profile
  "security" -> this.security
  "tag" -> this.tag
  else -> error("$name is not a valid property name")
}

internal fun Meta.hasProperty(name: String): Boolean = when(name) {
  "id" -> true
  "extension" -> true
  "versionId" -> true
  "lastUpdated" -> true
  "source" -> true
  "profile" -> true
  "security" -> true
  "tag" -> true
  else -> false
}

internal fun Meta.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  this@getAllChildren.versionId?.let { add(it) }
  this@getAllChildren.lastUpdated?.let { add(it) }
  this@getAllChildren.source?.let { add(it) }
  addAll(this@getAllChildren.profile)
  addAll(this@getAllChildren.security)
  addAll(this@getAllChildren.tag)
}
