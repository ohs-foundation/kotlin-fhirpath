package dev.ohs.fhir.model.r4.ext

import dev.ohs.fhir.model.r4.MedicinalProductContraindication
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun MedicinalProductContraindication.getProperty(name: String): Any? = when(name) {
  "id" -> this.id
  "meta" -> this.meta
  "implicitRules" -> this.implicitRules
  "language" -> this.language
  "text" -> this.text
  "contained" -> this.contained
  "extension" -> this.extension
  "modifierExtension" -> this.modifierExtension
  "subject" -> this.subject
  "disease" -> this.disease
  "diseaseStatus" -> this.diseaseStatus
  "comorbidity" -> this.comorbidity
  "therapeuticIndication" -> this.therapeuticIndication
  "otherTherapy" -> this.otherTherapy
  "population" -> this.population
  else -> error("$name is not a valid property name")
}

internal fun MedicinalProductContraindication.hasProperty(name: String): Boolean = when(name) {
  "id" -> true
  "meta" -> true
  "implicitRules" -> true
  "language" -> true
  "text" -> true
  "contained" -> true
  "extension" -> true
  "modifierExtension" -> true
  "subject" -> true
  "disease" -> true
  "diseaseStatus" -> true
  "comorbidity" -> true
  "therapeuticIndication" -> true
  "otherTherapy" -> true
  "population" -> true
  else -> false
}

internal fun MedicinalProductContraindication.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.meta?.let { add(it) }
  this@getAllChildren.implicitRules?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.contained)
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.subject)
  this@getAllChildren.disease?.let { add(it) }
  this@getAllChildren.diseaseStatus?.let { add(it) }
  addAll(this@getAllChildren.comorbidity)
  addAll(this@getAllChildren.therapeuticIndication)
  addAll(this@getAllChildren.otherTherapy)
  addAll(this@getAllChildren.population)
}

internal fun MedicinalProductContraindication.OtherTherapy.getProperty(name: String): Any? = when(name) {
  "id" -> this.id
  "extension" -> this.extension
  "modifierExtension" -> this.modifierExtension
  "therapyRelationshipType" -> this.therapyRelationshipType
  "medication" -> this.medication
  else -> error("$name is not a valid property name")
}

internal fun MedicinalProductContraindication.OtherTherapy.hasProperty(name: String): Boolean = when(name) {
  "id" -> true
  "extension" -> true
  "modifierExtension" -> true
  "therapyRelationshipType" -> true
  "medication" -> true
  else -> false
}

internal fun MedicinalProductContraindication.OtherTherapy.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.therapyRelationshipType)
  add(this@getAllChildren.medication)
}
