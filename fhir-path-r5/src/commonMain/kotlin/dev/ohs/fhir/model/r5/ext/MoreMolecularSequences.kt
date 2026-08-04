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

package dev.ohs.fhir.model.r5.ext

import dev.ohs.fhir.model.r5.MolecularSequence
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
    "subject" -> this.subject
    "focus" -> this.focus
    "specimen" -> this.specimen
    "device" -> this.device
    "performer" -> this.performer
    "literal" -> this.literal
    "formatted" -> this.formatted
    "relative" -> this.relative
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
    "subject" -> true
    "focus" -> true
    "specimen" -> true
    "device" -> true
    "performer" -> true
    "literal" -> true
    "formatted" -> true
    "relative" -> true
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
  this@getAllChildren.subject?.let { add(it) }
  addAll(this@getAllChildren.focus)
  this@getAllChildren.specimen?.let { add(it) }
  this@getAllChildren.device?.let { add(it) }
  this@getAllChildren.performer?.let { add(it) }
  this@getAllChildren.literal?.let { add(it) }
  addAll(this@getAllChildren.formatted)
  addAll(this@getAllChildren.relative)
}

internal fun MolecularSequence.Relative.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "coordinateSystem" -> this.coordinateSystem
    "ordinalPosition" -> this.ordinalPosition
    "sequenceRange" -> this.sequenceRange
    "startingSequence" -> this.startingSequence
    "edit" -> this.edit
    else -> error("$name is not a valid property name")
  }

internal fun MolecularSequence.Relative.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "coordinateSystem" -> true
    "ordinalPosition" -> true
    "sequenceRange" -> true
    "startingSequence" -> true
    "edit" -> true
    else -> false
  }

internal fun MolecularSequence.Relative.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.coordinateSystem)
  this@getAllChildren.ordinalPosition?.let { add(it) }
  this@getAllChildren.sequenceRange?.let { add(it) }
  this@getAllChildren.startingSequence?.let { add(it) }
  addAll(this@getAllChildren.edit)
}

internal fun MolecularSequence.Relative.StartingSequence.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "genomeAssembly" -> this.genomeAssembly
    "chromosome" -> this.chromosome
    "sequence" -> this.sequence
    "windowStart" -> this.windowStart
    "windowEnd" -> this.windowEnd
    "orientation" -> this.orientation
    "strand" -> this.strand
    else -> error("$name is not a valid property name")
  }

internal fun MolecularSequence.Relative.StartingSequence.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "genomeAssembly" -> true
    "chromosome" -> true
    "sequence" -> true
    "windowStart" -> true
    "windowEnd" -> true
    "orientation" -> true
    "strand" -> true
    else -> false
  }

internal fun MolecularSequence.Relative.StartingSequence.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.genomeAssembly?.let { add(it) }
  this@getAllChildren.chromosome?.let { add(it) }
  this@getAllChildren.sequence?.let { add(it) }
  this@getAllChildren.windowStart?.let { add(it) }
  this@getAllChildren.windowEnd?.let { add(it) }
  this@getAllChildren.orientation?.let { add(it) }
  this@getAllChildren.strand?.let { add(it) }
}

internal fun MolecularSequence.Relative.Edit.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "start" -> this.start
    "end" -> this.end
    "replacementSequence" -> this.replacementSequence
    "replacedSequence" -> this.replacedSequence
    else -> error("$name is not a valid property name")
  }

internal fun MolecularSequence.Relative.Edit.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "start" -> true
    "end" -> true
    "replacementSequence" -> true
    "replacedSequence" -> true
    else -> false
  }

internal fun MolecularSequence.Relative.Edit.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.start?.let { add(it) }
  this@getAllChildren.end?.let { add(it) }
  this@getAllChildren.replacementSequence?.let { add(it) }
  this@getAllChildren.replacedSequence?.let { add(it) }
}
