package dev.ohs.fhir.model.r4.ext

import dev.ohs.fhir.model.r4.Schedule
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun Schedule.getProperty(name: String): Any? = when(name) {
  "id" -> this.id
  "meta" -> this.meta
  "implicitRules" -> this.implicitRules
  "language" -> this.language
  "text" -> this.text
  "contained" -> this.contained
  "extension" -> this.extension
  "modifierExtension" -> this.modifierExtension
  "identifier" -> this.identifier
  "active" -> this.active
  "serviceCategory" -> this.serviceCategory
  "serviceType" -> this.serviceType
  "specialty" -> this.specialty
  "actor" -> this.actor
  "planningHorizon" -> this.planningHorizon
  "comment" -> this.comment
  else -> error("$name is not a valid property name")
}

internal fun Schedule.hasProperty(name: String): Boolean = when(name) {
  "id" -> true
  "meta" -> true
  "implicitRules" -> true
  "language" -> true
  "text" -> true
  "contained" -> true
  "extension" -> true
  "modifierExtension" -> true
  "identifier" -> true
  "active" -> true
  "serviceCategory" -> true
  "serviceType" -> true
  "specialty" -> true
  "actor" -> true
  "planningHorizon" -> true
  "comment" -> true
  else -> false
}

internal fun Schedule.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.meta?.let { add(it) }
  this@getAllChildren.implicitRules?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.contained)
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.identifier)
  this@getAllChildren.active?.let { add(it) }
  addAll(this@getAllChildren.serviceCategory)
  addAll(this@getAllChildren.serviceType)
  addAll(this@getAllChildren.specialty)
  addAll(this@getAllChildren.actor)
  this@getAllChildren.planningHorizon?.let { add(it) }
  this@getAllChildren.comment?.let { add(it) }
}
