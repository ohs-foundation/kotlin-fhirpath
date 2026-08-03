package dev.ohs.fhir.model.r5.ext

import dev.ohs.fhir.model.r5.ClinicalImpression
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun ClinicalImpression.getProperty(name: String): Any? = when(name) {
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
  "statusReason" -> this.statusReason
  "description" -> this.description
  "subject" -> this.subject
  "encounter" -> this.encounter
  "effective" -> this.effective
  "date" -> this.date
  "performer" -> this.performer
  "previous" -> this.previous
  "problem" -> this.problem
  "changePattern" -> this.changePattern
  "protocol" -> this.protocol
  "summary" -> this.summary
  "finding" -> this.finding
  "prognosisCodeableConcept" -> this.prognosisCodeableConcept
  "prognosisReference" -> this.prognosisReference
  "supportingInfo" -> this.supportingInfo
  "note" -> this.note
  else -> error("$name is not a valid property name")
}

internal fun ClinicalImpression.hasProperty(name: String): Boolean = when(name) {
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
  "statusReason" -> true
  "description" -> true
  "subject" -> true
  "encounter" -> true
  "effective" -> true
  "date" -> true
  "performer" -> true
  "previous" -> true
  "problem" -> true
  "changePattern" -> true
  "protocol" -> true
  "summary" -> true
  "finding" -> true
  "prognosisCodeableConcept" -> true
  "prognosisReference" -> true
  "supportingInfo" -> true
  "note" -> true
  else -> false
}

internal fun ClinicalImpression.getAllChildren(): List<Any> = buildList {
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
  this@getAllChildren.statusReason?.let { add(it) }
  this@getAllChildren.description?.let { add(it) }
  add(this@getAllChildren.subject)
  this@getAllChildren.encounter?.let { add(it) }
  this@getAllChildren.effective?.let { add(it) }
  this@getAllChildren.date?.let { add(it) }
  this@getAllChildren.performer?.let { add(it) }
  this@getAllChildren.previous?.let { add(it) }
  addAll(this@getAllChildren.problem)
  this@getAllChildren.changePattern?.let { add(it) }
  addAll(this@getAllChildren.protocol)
  this@getAllChildren.summary?.let { add(it) }
  addAll(this@getAllChildren.finding)
  addAll(this@getAllChildren.prognosisCodeableConcept)
  addAll(this@getAllChildren.prognosisReference)
  addAll(this@getAllChildren.supportingInfo)
  addAll(this@getAllChildren.note)
}

internal fun ClinicalImpression.Finding.getProperty(name: String): Any? = when(name) {
  "id" -> this.id
  "extension" -> this.extension
  "modifierExtension" -> this.modifierExtension
  "item" -> this.item
  "basis" -> this.basis
  else -> error("$name is not a valid property name")
}

internal fun ClinicalImpression.Finding.hasProperty(name: String): Boolean = when(name) {
  "id" -> true
  "extension" -> true
  "modifierExtension" -> true
  "item" -> true
  "basis" -> true
  else -> false
}

internal fun ClinicalImpression.Finding.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.item?.let { add(it) }
  this@getAllChildren.basis?.let { add(it) }
}
