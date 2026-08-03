package dev.ohs.fhir.model.r4.ext

import dev.ohs.fhir.model.r4.EnrollmentResponse
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun EnrollmentResponse.getProperty(name: String): Any? = when(name) {
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
  "request" -> this.request
  "outcome" -> this.outcome
  "disposition" -> this.disposition
  "created" -> this.created
  "organization" -> this.organization
  "requestProvider" -> this.requestProvider
  else -> error("$name is not a valid property name")
}

internal fun EnrollmentResponse.hasProperty(name: String): Boolean = when(name) {
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
  "request" -> true
  "outcome" -> true
  "disposition" -> true
  "created" -> true
  "organization" -> true
  "requestProvider" -> true
  else -> false
}

internal fun EnrollmentResponse.getAllChildren(): List<Any> = buildList {
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
  this@getAllChildren.request?.let { add(it) }
  this@getAllChildren.outcome?.let { add(it) }
  this@getAllChildren.disposition?.let { add(it) }
  this@getAllChildren.created?.let { add(it) }
  this@getAllChildren.organization?.let { add(it) }
  this@getAllChildren.requestProvider?.let { add(it) }
}
