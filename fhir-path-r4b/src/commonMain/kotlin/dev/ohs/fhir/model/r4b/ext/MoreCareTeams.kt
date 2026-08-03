package dev.ohs.fhir.model.r4b.ext

import dev.ohs.fhir.model.r4b.CareTeam
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun CareTeam.getProperty(name: String): Any? = when(name) {
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
  "name" -> this.name
  "subject" -> this.subject
  "encounter" -> this.encounter
  "period" -> this.period
  "participant" -> this.participant
  "reasonCode" -> this.reasonCode
  "reasonReference" -> this.reasonReference
  "managingOrganization" -> this.managingOrganization
  "telecom" -> this.telecom
  "note" -> this.note
  else -> error("$name is not a valid property name")
}

internal fun CareTeam.hasProperty(name: String): Boolean = when(name) {
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
  "name" -> true
  "subject" -> true
  "encounter" -> true
  "period" -> true
  "participant" -> true
  "reasonCode" -> true
  "reasonReference" -> true
  "managingOrganization" -> true
  "telecom" -> true
  "note" -> true
  else -> false
}

internal fun CareTeam.getAllChildren(): List<Any> = buildList {
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
  this@getAllChildren.name?.let { add(it) }
  this@getAllChildren.subject?.let { add(it) }
  this@getAllChildren.encounter?.let { add(it) }
  this@getAllChildren.period?.let { add(it) }
  addAll(this@getAllChildren.participant)
  addAll(this@getAllChildren.reasonCode)
  addAll(this@getAllChildren.reasonReference)
  addAll(this@getAllChildren.managingOrganization)
  addAll(this@getAllChildren.telecom)
  addAll(this@getAllChildren.note)
}

internal fun CareTeam.Participant.getProperty(name: String): Any? = when(name) {
  "id" -> this.id
  "extension" -> this.extension
  "modifierExtension" -> this.modifierExtension
  "role" -> this.role
  "member" -> this.member
  "onBehalfOf" -> this.onBehalfOf
  "period" -> this.period
  else -> error("$name is not a valid property name")
}

internal fun CareTeam.Participant.hasProperty(name: String): Boolean = when(name) {
  "id" -> true
  "extension" -> true
  "modifierExtension" -> true
  "role" -> true
  "member" -> true
  "onBehalfOf" -> true
  "period" -> true
  else -> false
}

internal fun CareTeam.Participant.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.role)
  this@getAllChildren.member?.let { add(it) }
  this@getAllChildren.onBehalfOf?.let { add(it) }
  this@getAllChildren.period?.let { add(it) }
}
