package dev.ohs.fhir.model.r4.ext

import dev.ohs.fhir.model.r4.Endpoint
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun Endpoint.getProperty(name: String): Any? = when(name) {
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
  "connectionType" -> this.connectionType
  "name" -> this.name
  "managingOrganization" -> this.managingOrganization
  "contact" -> this.contact
  "period" -> this.period
  "payloadType" -> this.payloadType
  "payloadMimeType" -> this.payloadMimeType
  "address" -> this.address
  "header" -> this.`header`
  else -> error("$name is not a valid property name")
}

internal fun Endpoint.hasProperty(name: String): Boolean = when(name) {
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
  "connectionType" -> true
  "name" -> true
  "managingOrganization" -> true
  "contact" -> true
  "period" -> true
  "payloadType" -> true
  "payloadMimeType" -> true
  "address" -> true
  "header" -> true
  else -> false
}

internal fun Endpoint.getAllChildren(): List<Any> = buildList {
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
  add(this@getAllChildren.connectionType)
  this@getAllChildren.name?.let { add(it) }
  this@getAllChildren.managingOrganization?.let { add(it) }
  addAll(this@getAllChildren.contact)
  this@getAllChildren.period?.let { add(it) }
  addAll(this@getAllChildren.payloadType)
  addAll(this@getAllChildren.payloadMimeType)
  add(this@getAllChildren.address)
  addAll(this@getAllChildren.`header`)
}
