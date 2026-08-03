package dev.ohs.fhir.model.r4b.ext

import dev.ohs.fhir.model.r4b.Organization
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun Organization.getProperty(name: String): Any? = when(name) {
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
  "type" -> this.type
  "name" -> this.name
  "alias" -> this.alias
  "telecom" -> this.telecom
  "address" -> this.address
  "partOf" -> this.partOf
  "contact" -> this.contact
  "endpoint" -> this.endpoint
  else -> error("$name is not a valid property name")
}

internal fun Organization.hasProperty(name: String): Boolean = when(name) {
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
  "type" -> true
  "name" -> true
  "alias" -> true
  "telecom" -> true
  "address" -> true
  "partOf" -> true
  "contact" -> true
  "endpoint" -> true
  else -> false
}

internal fun Organization.getAllChildren(): List<Any> = buildList {
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
  addAll(this@getAllChildren.type)
  this@getAllChildren.name?.let { add(it) }
  addAll(this@getAllChildren.alias)
  addAll(this@getAllChildren.telecom)
  addAll(this@getAllChildren.address)
  this@getAllChildren.partOf?.let { add(it) }
  addAll(this@getAllChildren.contact)
  addAll(this@getAllChildren.endpoint)
}

internal fun Organization.Contact.getProperty(name: String): Any? = when(name) {
  "id" -> this.id
  "extension" -> this.extension
  "modifierExtension" -> this.modifierExtension
  "purpose" -> this.purpose
  "name" -> this.name
  "telecom" -> this.telecom
  "address" -> this.address
  else -> error("$name is not a valid property name")
}

internal fun Organization.Contact.hasProperty(name: String): Boolean = when(name) {
  "id" -> true
  "extension" -> true
  "modifierExtension" -> true
  "purpose" -> true
  "name" -> true
  "telecom" -> true
  "address" -> true
  else -> false
}

internal fun Organization.Contact.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.purpose?.let { add(it) }
  this@getAllChildren.name?.let { add(it) }
  addAll(this@getAllChildren.telecom)
  this@getAllChildren.address?.let { add(it) }
}
