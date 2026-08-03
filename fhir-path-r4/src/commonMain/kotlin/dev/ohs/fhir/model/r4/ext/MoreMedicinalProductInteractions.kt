package dev.ohs.fhir.model.r4.ext

import dev.ohs.fhir.model.r4.MedicinalProductInteraction
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun MedicinalProductInteraction.getProperty(name: String): Any? = when(name) {
  "id" -> this.id
  "meta" -> this.meta
  "implicitRules" -> this.implicitRules
  "language" -> this.language
  "text" -> this.text
  "contained" -> this.contained
  "extension" -> this.extension
  "modifierExtension" -> this.modifierExtension
  "subject" -> this.subject
  "description" -> this.description
  "interactant" -> this.interactant
  "type" -> this.type
  "effect" -> this.effect
  "incidence" -> this.incidence
  "management" -> this.management
  else -> error("$name is not a valid property name")
}

internal fun MedicinalProductInteraction.hasProperty(name: String): Boolean = when(name) {
  "id" -> true
  "meta" -> true
  "implicitRules" -> true
  "language" -> true
  "text" -> true
  "contained" -> true
  "extension" -> true
  "modifierExtension" -> true
  "subject" -> true
  "description" -> true
  "interactant" -> true
  "type" -> true
  "effect" -> true
  "incidence" -> true
  "management" -> true
  else -> false
}

internal fun MedicinalProductInteraction.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.meta?.let { add(it) }
  this@getAllChildren.implicitRules?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.contained)
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.subject)
  this@getAllChildren.description?.let { add(it) }
  addAll(this@getAllChildren.interactant)
  this@getAllChildren.type?.let { add(it) }
  this@getAllChildren.effect?.let { add(it) }
  this@getAllChildren.incidence?.let { add(it) }
  this@getAllChildren.management?.let { add(it) }
}

internal fun MedicinalProductInteraction.Interactant.getProperty(name: String): Any? = when(name) {
  "id" -> this.id
  "extension" -> this.extension
  "modifierExtension" -> this.modifierExtension
  "item" -> this.item
  else -> error("$name is not a valid property name")
}

internal fun MedicinalProductInteraction.Interactant.hasProperty(name: String): Boolean = when(name) {
  "id" -> true
  "extension" -> true
  "modifierExtension" -> true
  "item" -> true
  else -> false
}

internal fun MedicinalProductInteraction.Interactant.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.item)
}
