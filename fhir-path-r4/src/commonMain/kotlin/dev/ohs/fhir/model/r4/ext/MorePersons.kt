package dev.ohs.fhir.model.r4.ext

import dev.ohs.fhir.model.r4.Person
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun Person.getProperty(name: String): Any? = when(name) {
  "id" -> this.id
  "meta" -> this.meta
  "implicitRules" -> this.implicitRules
  "language" -> this.language
  "text" -> this.text
  "contained" -> this.contained
  "extension" -> this.extension
  "modifierExtension" -> this.modifierExtension
  "identifier" -> this.identifier
  "name" -> this.name
  "telecom" -> this.telecom
  "gender" -> this.gender
  "birthDate" -> this.birthDate
  "address" -> this.address
  "photo" -> this.photo
  "managingOrganization" -> this.managingOrganization
  "active" -> this.active
  "link" -> this.link
  else -> error("$name is not a valid property name")
}

internal fun Person.hasProperty(name: String): Boolean = when(name) {
  "id" -> true
  "meta" -> true
  "implicitRules" -> true
  "language" -> true
  "text" -> true
  "contained" -> true
  "extension" -> true
  "modifierExtension" -> true
  "identifier" -> true
  "name" -> true
  "telecom" -> true
  "gender" -> true
  "birthDate" -> true
  "address" -> true
  "photo" -> true
  "managingOrganization" -> true
  "active" -> true
  "link" -> true
  else -> false
}

internal fun Person.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.meta?.let { add(it) }
  this@getAllChildren.implicitRules?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.contained)
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.identifier)
  addAll(this@getAllChildren.name)
  addAll(this@getAllChildren.telecom)
  this@getAllChildren.gender?.let { add(it) }
  this@getAllChildren.birthDate?.let { add(it) }
  addAll(this@getAllChildren.address)
  this@getAllChildren.photo?.let { add(it) }
  this@getAllChildren.managingOrganization?.let { add(it) }
  this@getAllChildren.active?.let { add(it) }
  addAll(this@getAllChildren.link)
}

internal fun Person.Link.getProperty(name: String): Any? = when(name) {
  "id" -> this.id
  "extension" -> this.extension
  "modifierExtension" -> this.modifierExtension
  "target" -> this.target
  "assurance" -> this.assurance
  else -> error("$name is not a valid property name")
}

internal fun Person.Link.hasProperty(name: String): Boolean = when(name) {
  "id" -> true
  "extension" -> true
  "modifierExtension" -> true
  "target" -> true
  "assurance" -> true
  else -> false
}

internal fun Person.Link.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.target)
  this@getAllChildren.assurance?.let { add(it) }
}
