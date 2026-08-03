package dev.ohs.fhir.model.r4.ext

import dev.ohs.fhir.model.r4.Flag
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun Flag.getProperty(name: String): Any? = when(name) {
  "id" -> this.id
  "meta" -> this.meta
  "implicitRules" -> this.implicitRules
  "language" -> this.language
  "text" -> this.text
  "contained" -> this.contained
  "extension" -> this.extension
  "modifierExtension" -> this.modifierExtension
  "identifier" -> this.identifier
  "status" -> this.status
  "category" -> this.category
  "code" -> this.code
  "subject" -> this.subject
  "period" -> this.period
  "encounter" -> this.encounter
  "author" -> this.author
  else -> error("$name is not a valid property name")
}

internal fun Flag.hasProperty(name: String): Boolean = when(name) {
  "id" -> true
  "meta" -> true
  "implicitRules" -> true
  "language" -> true
  "text" -> true
  "contained" -> true
  "extension" -> true
  "modifierExtension" -> true
  "identifier" -> true
  "status" -> true
  "category" -> true
  "code" -> true
  "subject" -> true
  "period" -> true
  "encounter" -> true
  "author" -> true
  else -> false
}

internal fun Flag.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.meta?.let { add(it) }
  this@getAllChildren.implicitRules?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.contained)
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.identifier)
  add(this@getAllChildren.status)
  addAll(this@getAllChildren.category)
  add(this@getAllChildren.code)
  add(this@getAllChildren.subject)
  this@getAllChildren.period?.let { add(it) }
  this@getAllChildren.encounter?.let { add(it) }
  this@getAllChildren.author?.let { add(it) }
}
