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

package dev.ohs.fhir.model.r4.ext

import dev.ohs.fhir.model.r4.SubstanceProtein
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun SubstanceProtein.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "meta" -> this.meta
    "implicitRules" -> this.implicitRules
    "language" -> this.language
    "text" -> this.text
    "contained" -> this.contained
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "sequenceType" -> this.sequenceType
    "numberOfSubunits" -> this.numberOfSubunits
    "disulfideLinkage" -> this.disulfideLinkage
    "subunit" -> this.subunit
    else -> error("$name is not a valid property name")
  }

internal fun SubstanceProtein.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "meta" -> true
    "implicitRules" -> true
    "language" -> true
    "text" -> true
    "contained" -> true
    "extension" -> true
    "modifierExtension" -> true
    "sequenceType" -> true
    "numberOfSubunits" -> true
    "disulfideLinkage" -> true
    "subunit" -> true
    else -> false
  }

internal fun SubstanceProtein.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.meta?.let { add(it) }
  this@getAllChildren.implicitRules?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.contained)
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.sequenceType?.let { add(it) }
  this@getAllChildren.numberOfSubunits?.let { add(it) }
  addAll(this@getAllChildren.disulfideLinkage)
  addAll(this@getAllChildren.subunit)
}

internal fun SubstanceProtein.Subunit.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "subunit" -> this.subunit
    "sequence" -> this.sequence
    "length" -> this.length
    "sequenceAttachment" -> this.sequenceAttachment
    "nTerminalModificationId" -> this.nTerminalModificationId
    "nTerminalModification" -> this.nTerminalModification
    "cTerminalModificationId" -> this.cTerminalModificationId
    "cTerminalModification" -> this.cTerminalModification
    else -> error("$name is not a valid property name")
  }

internal fun SubstanceProtein.Subunit.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "subunit" -> true
    "sequence" -> true
    "length" -> true
    "sequenceAttachment" -> true
    "nTerminalModificationId" -> true
    "nTerminalModification" -> true
    "cTerminalModificationId" -> true
    "cTerminalModification" -> true
    else -> false
  }

internal fun SubstanceProtein.Subunit.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.subunit?.let { add(it) }
  this@getAllChildren.sequence?.let { add(it) }
  this@getAllChildren.length?.let { add(it) }
  this@getAllChildren.sequenceAttachment?.let { add(it) }
  this@getAllChildren.nTerminalModificationId?.let { add(it) }
  this@getAllChildren.nTerminalModification?.let { add(it) }
  this@getAllChildren.cTerminalModificationId?.let { add(it) }
  this@getAllChildren.cTerminalModification?.let { add(it) }
}
