package dev.ohs.fhir.model.r4b.ext

import dev.ohs.fhir.model.r4b.OrganizationAffiliation
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun OrganizationAffiliation.getProperty(name: String): Any? = when(name) {
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
  "period" -> this.period
  "organization" -> this.organization
  "participatingOrganization" -> this.participatingOrganization
  "network" -> this.network
  "code" -> this.code
  "specialty" -> this.specialty
  "location" -> this.location
  "healthcareService" -> this.healthcareService
  "telecom" -> this.telecom
  "endpoint" -> this.endpoint
  else -> error("$name is not a valid property name")
}

internal fun OrganizationAffiliation.hasProperty(name: String): Boolean = when(name) {
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
  "period" -> true
  "organization" -> true
  "participatingOrganization" -> true
  "network" -> true
  "code" -> true
  "specialty" -> true
  "location" -> true
  "healthcareService" -> true
  "telecom" -> true
  "endpoint" -> true
  else -> false
}

internal fun OrganizationAffiliation.getAllChildren(): List<Any> = buildList {
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
  this@getAllChildren.period?.let { add(it) }
  this@getAllChildren.organization?.let { add(it) }
  this@getAllChildren.participatingOrganization?.let { add(it) }
  addAll(this@getAllChildren.network)
  addAll(this@getAllChildren.code)
  addAll(this@getAllChildren.specialty)
  addAll(this@getAllChildren.location)
  addAll(this@getAllChildren.healthcareService)
  addAll(this@getAllChildren.telecom)
  addAll(this@getAllChildren.endpoint)
}
