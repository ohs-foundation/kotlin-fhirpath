package dev.ohs.fhir.model.r4.ext

import dev.ohs.fhir.model.r4.MedicationStatement
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun MedicationStatement.getProperty(name: String): Any? = when(name) {
  "id" -> this.id
  "meta" -> this.meta
  "implicitRules" -> this.implicitRules
  "language" -> this.language
  "text" -> this.text
  "contained" -> this.contained
  "extension" -> this.extension
  "modifierExtension" -> this.modifierExtension
  "identifier" -> this.identifier
  "basedOn" -> this.basedOn
  "partOf" -> this.partOf
  "status" -> this.status
  "statusReason" -> this.statusReason
  "category" -> this.category
  "medication" -> this.medication
  "subject" -> this.subject
  "context" -> this.context
  "effective" -> this.effective
  "dateAsserted" -> this.dateAsserted
  "informationSource" -> this.informationSource
  "derivedFrom" -> this.derivedFrom
  "reasonCode" -> this.reasonCode
  "reasonReference" -> this.reasonReference
  "note" -> this.note
  "dosage" -> this.dosage
  else -> error("$name is not a valid property name")
}

internal fun MedicationStatement.hasProperty(name: String): Boolean = when(name) {
  "id" -> true
  "meta" -> true
  "implicitRules" -> true
  "language" -> true
  "text" -> true
  "contained" -> true
  "extension" -> true
  "modifierExtension" -> true
  "identifier" -> true
  "basedOn" -> true
  "partOf" -> true
  "status" -> true
  "statusReason" -> true
  "category" -> true
  "medication" -> true
  "subject" -> true
  "context" -> true
  "effective" -> true
  "dateAsserted" -> true
  "informationSource" -> true
  "derivedFrom" -> true
  "reasonCode" -> true
  "reasonReference" -> true
  "note" -> true
  "dosage" -> true
  else -> false
}

internal fun MedicationStatement.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.meta?.let { add(it) }
  this@getAllChildren.implicitRules?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.contained)
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.identifier)
  addAll(this@getAllChildren.basedOn)
  addAll(this@getAllChildren.partOf)
  add(this@getAllChildren.status)
  addAll(this@getAllChildren.statusReason)
  this@getAllChildren.category?.let { add(it) }
  add(this@getAllChildren.medication)
  add(this@getAllChildren.subject)
  this@getAllChildren.context?.let { add(it) }
  this@getAllChildren.effective?.let { add(it) }
  this@getAllChildren.dateAsserted?.let { add(it) }
  this@getAllChildren.informationSource?.let { add(it) }
  addAll(this@getAllChildren.derivedFrom)
  addAll(this@getAllChildren.reasonCode)
  addAll(this@getAllChildren.reasonReference)
  addAll(this@getAllChildren.note)
  addAll(this@getAllChildren.dosage)
}
