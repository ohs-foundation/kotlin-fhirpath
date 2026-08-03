package dev.ohs.fhir.model.r4.ext

import dev.ohs.fhir.model.r4.Substance
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun Substance.getProperty(name: String): Any? = when(name) {
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
  "description" -> this.description
  "instance" -> this.instance
  "ingredient" -> this.ingredient
  else -> error("$name is not a valid property name")
}

internal fun Substance.hasProperty(name: String): Boolean = when(name) {
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
  "description" -> true
  "instance" -> true
  "ingredient" -> true
  else -> false
}

internal fun Substance.getAllChildren(): List<Any> = buildList {
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
  addAll(this@getAllChildren.category)
  add(this@getAllChildren.code)
  this@getAllChildren.description?.let { add(it) }
  addAll(this@getAllChildren.instance)
  addAll(this@getAllChildren.ingredient)
}

internal fun Substance.Instance.getProperty(name: String): Any? = when(name) {
  "id" -> this.id
  "extension" -> this.extension
  "modifierExtension" -> this.modifierExtension
  "identifier" -> this.identifier
  "expiry" -> this.expiry
  "quantity" -> this.quantity
  else -> error("$name is not a valid property name")
}

internal fun Substance.Instance.hasProperty(name: String): Boolean = when(name) {
  "id" -> true
  "extension" -> true
  "modifierExtension" -> true
  "identifier" -> true
  "expiry" -> true
  "quantity" -> true
  else -> false
}

internal fun Substance.Instance.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.identifier?.let { add(it) }
  this@getAllChildren.expiry?.let { add(it) }
  this@getAllChildren.quantity?.let { add(it) }
}

internal fun Substance.Ingredient.getProperty(name: String): Any? = when(name) {
  "id" -> this.id
  "extension" -> this.extension
  "modifierExtension" -> this.modifierExtension
  "quantity" -> this.quantity
  "substance" -> this.substance
  else -> error("$name is not a valid property name")
}

internal fun Substance.Ingredient.hasProperty(name: String): Boolean = when(name) {
  "id" -> true
  "extension" -> true
  "modifierExtension" -> true
  "quantity" -> true
  "substance" -> true
  else -> false
}

internal fun Substance.Ingredient.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.quantity?.let { add(it) }
  add(this@getAllChildren.substance)
}
