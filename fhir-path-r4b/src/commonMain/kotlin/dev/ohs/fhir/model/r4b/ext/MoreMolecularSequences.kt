/*
 * Copyright 2026 Open Health Stack Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package dev.ohs.fhir.model.r4b.ext

import dev.ohs.fhir.model.r4b.MolecularSequence
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun MolecularSequence.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "meta" -> this.meta
    "implicitRules" -> this.implicitRules
    "language" -> this.language
    "text" -> this.text
    "contained" -> this.contained
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "identifier" -> this.identifier
    "type" -> this.type
    "coordinateSystem" -> this.coordinateSystem
    "patient" -> this.patient
    "specimen" -> this.specimen
    "device" -> this.device
    "performer" -> this.performer
    "quantity" -> this.quantity
    "referenceSeq" -> this.referenceSeq
    "variant" -> this.variant
    "observedSeq" -> this.observedSeq
    "quality" -> this.quality
    "readCoverage" -> this.readCoverage
    "repository" -> this.repository
    "pointer" -> this.pointer
    "structureVariant" -> this.structureVariant
    else -> error("$name is not a valid property name")
  }

internal fun MolecularSequence.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "meta" -> true
    "implicitRules" -> true
    "language" -> true
    "text" -> true
    "contained" -> true
    "extension" -> true
    "modifierExtension" -> true
    "identifier" -> true
    "type" -> true
    "coordinateSystem" -> true
    "patient" -> true
    "specimen" -> true
    "device" -> true
    "performer" -> true
    "quantity" -> true
    "referenceSeq" -> true
    "variant" -> true
    "observedSeq" -> true
    "quality" -> true
    "readCoverage" -> true
    "repository" -> true
    "pointer" -> true
    "structureVariant" -> true
    else -> false
  }

internal fun MolecularSequence.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.meta?.let { add(it) }
  this@getAllChildren.implicitRules?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.contained)
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.identifier)
  this@getAllChildren.type?.let { add(it) }
  add(this@getAllChildren.coordinateSystem)
  this@getAllChildren.patient?.let { add(it) }
  this@getAllChildren.specimen?.let { add(it) }
  this@getAllChildren.device?.let { add(it) }
  this@getAllChildren.performer?.let { add(it) }
  this@getAllChildren.quantity?.let { add(it) }
  this@getAllChildren.referenceSeq?.let { add(it) }
  addAll(this@getAllChildren.variant)
  this@getAllChildren.observedSeq?.let { add(it) }
  addAll(this@getAllChildren.quality)
  this@getAllChildren.readCoverage?.let { add(it) }
  addAll(this@getAllChildren.repository)
  addAll(this@getAllChildren.pointer)
  addAll(this@getAllChildren.structureVariant)
}

internal fun MolecularSequence.ReferenceSeq.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "chromosome" -> this.chromosome
    "genomeBuild" -> this.genomeBuild
    "orientation" -> this.orientation
    "referenceSeqId" -> this.referenceSeqId
    "referenceSeqPointer" -> this.referenceSeqPointer
    "referenceSeqString" -> this.referenceSeqString
    "strand" -> this.strand
    "windowStart" -> this.windowStart
    "windowEnd" -> this.windowEnd
    else -> error("$name is not a valid property name")
  }

internal fun MolecularSequence.ReferenceSeq.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "chromosome" -> true
    "genomeBuild" -> true
    "orientation" -> true
    "referenceSeqId" -> true
    "referenceSeqPointer" -> true
    "referenceSeqString" -> true
    "strand" -> true
    "windowStart" -> true
    "windowEnd" -> true
    else -> false
  }

internal fun MolecularSequence.ReferenceSeq.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.chromosome?.let { add(it) }
  this@getAllChildren.genomeBuild?.let { add(it) }
  this@getAllChildren.orientation?.let { add(it) }
  this@getAllChildren.referenceSeqId?.let { add(it) }
  this@getAllChildren.referenceSeqPointer?.let { add(it) }
  this@getAllChildren.referenceSeqString?.let { add(it) }
  this@getAllChildren.strand?.let { add(it) }
  this@getAllChildren.windowStart?.let { add(it) }
  this@getAllChildren.windowEnd?.let { add(it) }
}

internal fun MolecularSequence.Variant.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "start" -> this.start
    "end" -> this.end
    "observedAllele" -> this.observedAllele
    "referenceAllele" -> this.referenceAllele
    "cigar" -> this.cigar
    "variantPointer" -> this.variantPointer
    else -> error("$name is not a valid property name")
  }

internal fun MolecularSequence.Variant.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "start" -> true
    "end" -> true
    "observedAllele" -> true
    "referenceAllele" -> true
    "cigar" -> true
    "variantPointer" -> true
    else -> false
  }

internal fun MolecularSequence.Variant.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.start?.let { add(it) }
  this@getAllChildren.end?.let { add(it) }
  this@getAllChildren.observedAllele?.let { add(it) }
  this@getAllChildren.referenceAllele?.let { add(it) }
  this@getAllChildren.cigar?.let { add(it) }
  this@getAllChildren.variantPointer?.let { add(it) }
}

internal fun MolecularSequence.Quality.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "standardSequence" -> this.standardSequence
    "start" -> this.start
    "end" -> this.end
    "score" -> this.score
    "method" -> this.method
    "truthTP" -> this.truthTP
    "queryTP" -> this.queryTP
    "truthFN" -> this.truthFN
    "queryFP" -> this.queryFP
    "gtFP" -> this.gtFP
    "precision" -> this.precision
    "recall" -> this.recall
    "fScore" -> this.fScore
    "roc" -> this.roc
    else -> error("$name is not a valid property name")
  }

internal fun MolecularSequence.Quality.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "standardSequence" -> true
    "start" -> true
    "end" -> true
    "score" -> true
    "method" -> true
    "truthTP" -> true
    "queryTP" -> true
    "truthFN" -> true
    "queryFP" -> true
    "gtFP" -> true
    "precision" -> true
    "recall" -> true
    "fScore" -> true
    "roc" -> true
    else -> false
  }

internal fun MolecularSequence.Quality.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.type)
  this@getAllChildren.standardSequence?.let { add(it) }
  this@getAllChildren.start?.let { add(it) }
  this@getAllChildren.end?.let { add(it) }
  this@getAllChildren.score?.let { add(it) }
  this@getAllChildren.method?.let { add(it) }
  this@getAllChildren.truthTP?.let { add(it) }
  this@getAllChildren.queryTP?.let { add(it) }
  this@getAllChildren.truthFN?.let { add(it) }
  this@getAllChildren.queryFP?.let { add(it) }
  this@getAllChildren.gtFP?.let { add(it) }
  this@getAllChildren.precision?.let { add(it) }
  this@getAllChildren.recall?.let { add(it) }
  this@getAllChildren.fScore?.let { add(it) }
  this@getAllChildren.roc?.let { add(it) }
}

internal fun MolecularSequence.Quality.Roc.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "score" -> this.score
    "numTP" -> this.numTP
    "numFP" -> this.numFP
    "numFN" -> this.numFN
    "precision" -> this.precision
    "sensitivity" -> this.sensitivity
    "fMeasure" -> this.fMeasure
    else -> error("$name is not a valid property name")
  }

internal fun MolecularSequence.Quality.Roc.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "score" -> true
    "numTP" -> true
    "numFP" -> true
    "numFN" -> true
    "precision" -> true
    "sensitivity" -> true
    "fMeasure" -> true
    else -> false
  }

internal fun MolecularSequence.Quality.Roc.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.score)
  addAll(this@getAllChildren.numTP)
  addAll(this@getAllChildren.numFP)
  addAll(this@getAllChildren.numFN)
  addAll(this@getAllChildren.precision)
  addAll(this@getAllChildren.sensitivity)
  addAll(this@getAllChildren.fMeasure)
}

internal fun MolecularSequence.Repository.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "url" -> this.url
    "name" -> this.name
    "datasetId" -> this.datasetId
    "variantsetId" -> this.variantsetId
    "readsetId" -> this.readsetId
    else -> error("$name is not a valid property name")
  }

internal fun MolecularSequence.Repository.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "url" -> true
    "name" -> true
    "datasetId" -> true
    "variantsetId" -> true
    "readsetId" -> true
    else -> false
  }

internal fun MolecularSequence.Repository.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.type)
  this@getAllChildren.url?.let { add(it) }
  this@getAllChildren.name?.let { add(it) }
  this@getAllChildren.datasetId?.let { add(it) }
  this@getAllChildren.variantsetId?.let { add(it) }
  this@getAllChildren.readsetId?.let { add(it) }
}

internal fun MolecularSequence.StructureVariant.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "variantType" -> this.variantType
    "exact" -> this.exact
    "length" -> this.length
    "outer" -> this.outer
    "inner" -> this.`inner`
    else -> error("$name is not a valid property name")
  }

internal fun MolecularSequence.StructureVariant.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "variantType" -> true
    "exact" -> true
    "length" -> true
    "outer" -> true
    "inner" -> true
    else -> false
  }

internal fun MolecularSequence.StructureVariant.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.variantType?.let { add(it) }
  this@getAllChildren.exact?.let { add(it) }
  this@getAllChildren.length?.let { add(it) }
  this@getAllChildren.outer?.let { add(it) }
  this@getAllChildren.`inner`?.let { add(it) }
}

internal fun MolecularSequence.StructureVariant.Outer.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "start" -> this.start
    "end" -> this.end
    else -> error("$name is not a valid property name")
  }

internal fun MolecularSequence.StructureVariant.Outer.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "start" -> true
    "end" -> true
    else -> false
  }

internal fun MolecularSequence.StructureVariant.Outer.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.start?.let { add(it) }
  this@getAllChildren.end?.let { add(it) }
}

internal fun MolecularSequence.StructureVariant.Inner.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "start" -> this.start
    "end" -> this.end
    else -> error("$name is not a valid property name")
  }

internal fun MolecularSequence.StructureVariant.Inner.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "start" -> true
    "end" -> true
    else -> false
  }

internal fun MolecularSequence.StructureVariant.Inner.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.start?.let { add(it) }
  this@getAllChildren.end?.let { add(it) }
}
