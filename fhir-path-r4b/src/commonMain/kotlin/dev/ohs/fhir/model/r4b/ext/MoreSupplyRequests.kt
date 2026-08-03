package dev.ohs.fhir.model.r4b.ext

import dev.ohs.fhir.model.r4b.SupplyRequest
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun SupplyRequest.getProperty(name: String): Any? = when(name) {
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
  "priority" -> this.priority
  "item" -> this.item
  "quantity" -> this.quantity
  "parameter" -> this.parameter
  "occurrence" -> this.occurrence
  "authoredOn" -> this.authoredOn
  "requester" -> this.requester
  "supplier" -> this.supplier
  "reasonCode" -> this.reasonCode
  "reasonReference" -> this.reasonReference
  "deliverFrom" -> this.deliverFrom
  "deliverTo" -> this.deliverTo
  else -> error("$name is not a valid property name")
}

internal fun SupplyRequest.hasProperty(name: String): Boolean = when(name) {
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
  "priority" -> true
  "item" -> true
  "quantity" -> true
  "parameter" -> true
  "occurrence" -> true
  "authoredOn" -> true
  "requester" -> true
  "supplier" -> true
  "reasonCode" -> true
  "reasonReference" -> true
  "deliverFrom" -> true
  "deliverTo" -> true
  else -> false
}

internal fun SupplyRequest.getAllChildren(): List<Any> = buildList {
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
  this@getAllChildren.category?.let { add(it) }
  this@getAllChildren.priority?.let { add(it) }
  add(this@getAllChildren.item)
  add(this@getAllChildren.quantity)
  addAll(this@getAllChildren.parameter)
  this@getAllChildren.occurrence?.let { add(it) }
  this@getAllChildren.authoredOn?.let { add(it) }
  this@getAllChildren.requester?.let { add(it) }
  addAll(this@getAllChildren.supplier)
  addAll(this@getAllChildren.reasonCode)
  addAll(this@getAllChildren.reasonReference)
  this@getAllChildren.deliverFrom?.let { add(it) }
  this@getAllChildren.deliverTo?.let { add(it) }
}

internal fun SupplyRequest.Parameter.getProperty(name: String): Any? = when(name) {
  "id" -> this.id
  "extension" -> this.extension
  "modifierExtension" -> this.modifierExtension
  "code" -> this.code
  "value" -> this.`value`
  else -> error("$name is not a valid property name")
}

internal fun SupplyRequest.Parameter.hasProperty(name: String): Boolean = when(name) {
  "id" -> true
  "extension" -> true
  "modifierExtension" -> true
  "code" -> true
  "value" -> true
  else -> false
}

internal fun SupplyRequest.Parameter.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.code?.let { add(it) }
  this@getAllChildren.`value`?.let { add(it) }
}
