package dev.ohs.fhir.model.r4b.ext

import dev.ohs.fhir.model.r4b.ManufacturedItemDefinition
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun ManufacturedItemDefinition.getProperty(name: String): Any? = when(name) {
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
  "manufacturedDoseForm" -> this.manufacturedDoseForm
  "unitOfPresentation" -> this.unitOfPresentation
  "manufacturer" -> this.manufacturer
  "ingredient" -> this.ingredient
  "property" -> this.`property`
  else -> error("$name is not a valid property name")
}

internal fun ManufacturedItemDefinition.hasProperty(name: String): Boolean = when(name) {
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
  "manufacturedDoseForm" -> true
  "unitOfPresentation" -> true
  "manufacturer" -> true
  "ingredient" -> true
  "property" -> true
  else -> false
}

internal fun ManufacturedItemDefinition.getAllChildren(): List<Any> = buildList {
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
  add(this@getAllChildren.manufacturedDoseForm)
  this@getAllChildren.unitOfPresentation?.let { add(it) }
  addAll(this@getAllChildren.manufacturer)
  addAll(this@getAllChildren.ingredient)
  addAll(this@getAllChildren.`property`)
}

internal fun ManufacturedItemDefinition.Property.getProperty(name: String): Any? = when(name) {
  "id" -> this.id
  "extension" -> this.extension
  "modifierExtension" -> this.modifierExtension
  "type" -> this.type
  "value" -> this.`value`
  else -> error("$name is not a valid property name")
}

internal fun ManufacturedItemDefinition.Property.hasProperty(name: String): Boolean = when(name) {
  "id" -> true
  "extension" -> true
  "modifierExtension" -> true
  "type" -> true
  "value" -> true
  else -> false
}

internal fun ManufacturedItemDefinition.Property.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.type)
  this@getAllChildren.`value`?.let { add(it) }
}
