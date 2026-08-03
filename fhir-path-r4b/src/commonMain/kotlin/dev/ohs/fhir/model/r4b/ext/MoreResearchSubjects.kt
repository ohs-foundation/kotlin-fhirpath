package dev.ohs.fhir.model.r4b.ext

import dev.ohs.fhir.model.r4b.ResearchSubject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun ResearchSubject.getProperty(name: String): Any? = when(name) {
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
  "period" -> this.period
  "study" -> this.study
  "individual" -> this.individual
  "assignedArm" -> this.assignedArm
  "actualArm" -> this.actualArm
  "consent" -> this.consent
  else -> error("$name is not a valid property name")
}

internal fun ResearchSubject.hasProperty(name: String): Boolean = when(name) {
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
  "period" -> true
  "study" -> true
  "individual" -> true
  "assignedArm" -> true
  "actualArm" -> true
  "consent" -> true
  else -> false
}

internal fun ResearchSubject.getAllChildren(): List<Any> = buildList {
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
  this@getAllChildren.period?.let { add(it) }
  add(this@getAllChildren.study)
  add(this@getAllChildren.individual)
  this@getAllChildren.assignedArm?.let { add(it) }
  this@getAllChildren.actualArm?.let { add(it) }
  this@getAllChildren.consent?.let { add(it) }
}
