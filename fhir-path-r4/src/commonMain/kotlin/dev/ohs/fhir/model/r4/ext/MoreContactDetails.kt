package dev.ohs.fhir.model.r4.ext

import dev.ohs.fhir.model.r4.ContactDetail
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun ContactDetail.getProperty(name: String): Any? = when(name) {
  "id" -> this.id
  "extension" -> this.extension
  "name" -> this.name
  "telecom" -> this.telecom
  else -> error("$name is not a valid property name")
}

internal fun ContactDetail.hasProperty(name: String): Boolean = when(name) {
  "id" -> true
  "extension" -> true
  "name" -> true
  "telecom" -> true
  else -> false
}

internal fun ContactDetail.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  this@getAllChildren.name?.let { add(it) }
  addAll(this@getAllChildren.telecom)
}
