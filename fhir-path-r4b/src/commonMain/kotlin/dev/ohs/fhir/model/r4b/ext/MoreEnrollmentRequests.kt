package dev.ohs.fhir.model.r4b.ext

import dev.ohs.fhir.model.r4b.EnrollmentRequest
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun EnrollmentRequest.getProperty(name: String): Any? = when(name) {
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
  "created" -> this.created
  "insurer" -> this.insurer
  "provider" -> this.provider
  "candidate" -> this.candidate
  "coverage" -> this.coverage
  else -> error("$name is not a valid property name")
}

internal fun EnrollmentRequest.hasProperty(name: String): Boolean = when(name) {
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
  "created" -> true
  "insurer" -> true
  "provider" -> true
  "candidate" -> true
  "coverage" -> true
  else -> false
}

internal fun EnrollmentRequest.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.meta?.let { add(it) }
  this@getAllChildren.implicitRules?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.contained)
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.identifier)
  this@getAllChildren.status?.let { add(it) }
  this@getAllChildren.created?.let { add(it) }
  this@getAllChildren.insurer?.let { add(it) }
  this@getAllChildren.provider?.let { add(it) }
  this@getAllChildren.candidate?.let { add(it) }
  this@getAllChildren.coverage?.let { add(it) }
}
