package dev.ohs.fhir.model.r4b.ext

import dev.ohs.fhir.model.r4b.MarketingStatus
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun MarketingStatus.getProperty(name: String): Any? = when(name) {
  "id" -> this.id
  "extension" -> this.extension
  "modifierExtension" -> this.modifierExtension
  "country" -> this.country
  "jurisdiction" -> this.jurisdiction
  "status" -> this.status
  "dateRange" -> this.dateRange
  "restoreDate" -> this.restoreDate
  else -> error("$name is not a valid property name")
}

internal fun MarketingStatus.hasProperty(name: String): Boolean = when(name) {
  "id" -> true
  "extension" -> true
  "modifierExtension" -> true
  "country" -> true
  "jurisdiction" -> true
  "status" -> true
  "dateRange" -> true
  "restoreDate" -> true
  else -> false
}

internal fun MarketingStatus.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.country?.let { add(it) }
  this@getAllChildren.jurisdiction?.let { add(it) }
  add(this@getAllChildren.status)
  this@getAllChildren.dateRange?.let { add(it) }
  this@getAllChildren.restoreDate?.let { add(it) }
}
