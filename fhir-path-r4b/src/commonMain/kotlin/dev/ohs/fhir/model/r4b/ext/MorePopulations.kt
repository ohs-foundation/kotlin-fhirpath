package dev.ohs.fhir.model.r4b.ext

import dev.ohs.fhir.model.r4b.Population
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun Population.getProperty(name: String): Any? = when(name) {
  "id" -> this.id
  "extension" -> this.extension
  "modifierExtension" -> this.modifierExtension
  "age" -> this.age
  "gender" -> this.gender
  "race" -> this.race
  "physiologicalCondition" -> this.physiologicalCondition
  else -> error("$name is not a valid property name")
}

internal fun Population.hasProperty(name: String): Boolean = when(name) {
  "id" -> true
  "extension" -> true
  "modifierExtension" -> true
  "age" -> true
  "gender" -> true
  "race" -> true
  "physiologicalCondition" -> true
  else -> false
}

internal fun Population.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.age?.let { add(it) }
  this@getAllChildren.gender?.let { add(it) }
  this@getAllChildren.race?.let { add(it) }
  this@getAllChildren.physiologicalCondition?.let { add(it) }
}
