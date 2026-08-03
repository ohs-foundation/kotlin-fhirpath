package dev.ohs.fhir.model.r4.ext

import dev.ohs.fhir.model.r4.OperationOutcome
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun OperationOutcome.getProperty(name: String): Any? = when(name) {
  "id" -> this.id
  "meta" -> this.meta
  "implicitRules" -> this.implicitRules
  "language" -> this.language
  "text" -> this.text
  "contained" -> this.contained
  "extension" -> this.extension
  "modifierExtension" -> this.modifierExtension
  "issue" -> this.issue
  else -> error("$name is not a valid property name")
}

internal fun OperationOutcome.hasProperty(name: String): Boolean = when(name) {
  "id" -> true
  "meta" -> true
  "implicitRules" -> true
  "language" -> true
  "text" -> true
  "contained" -> true
  "extension" -> true
  "modifierExtension" -> true
  "issue" -> true
  else -> false
}

internal fun OperationOutcome.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.meta?.let { add(it) }
  this@getAllChildren.implicitRules?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.contained)
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.issue)
}

internal fun OperationOutcome.Issue.getProperty(name: String): Any? = when(name) {
  "id" -> this.id
  "extension" -> this.extension
  "modifierExtension" -> this.modifierExtension
  "severity" -> this.severity
  "code" -> this.code
  "details" -> this.details
  "diagnostics" -> this.diagnostics
  "location" -> this.location
  "expression" -> this.expression
  else -> error("$name is not a valid property name")
}

internal fun OperationOutcome.Issue.hasProperty(name: String): Boolean = when(name) {
  "id" -> true
  "extension" -> true
  "modifierExtension" -> true
  "severity" -> true
  "code" -> true
  "details" -> true
  "diagnostics" -> true
  "location" -> true
  "expression" -> true
  else -> false
}

internal fun OperationOutcome.Issue.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.severity)
  add(this@getAllChildren.code)
  this@getAllChildren.details?.let { add(it) }
  this@getAllChildren.diagnostics?.let { add(it) }
  addAll(this@getAllChildren.location)
  addAll(this@getAllChildren.expression)
}
