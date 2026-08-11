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

import dev.ohs.fhir.model.r4.SubstanceNucleicAcid
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun SubstanceNucleicAcid.getProperty(name: String): Any? =
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
    "areaOfHybridisation" -> this.areaOfHybridisation
    "oligoNucleotideType" -> this.oligoNucleotideType
    "subunit" -> this.subunit
    else -> error("$name is not a valid property name")
  }

internal fun SubstanceNucleicAcid.hasProperty(name: String): Boolean =
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
    "areaOfHybridisation" -> true
    "oligoNucleotideType" -> true
    "subunit" -> true
    else -> false
  }

internal fun SubstanceNucleicAcid.getAllChildren(): List<Any> = buildList {
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
  this@getAllChildren.areaOfHybridisation?.let { add(it) }
  this@getAllChildren.oligoNucleotideType?.let { add(it) }
  addAll(this@getAllChildren.subunit)
}

internal fun SubstanceNucleicAcid.Subunit.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "subunit" -> this.subunit
    "sequence" -> this.sequence
    "length" -> this.length
    "sequenceAttachment" -> this.sequenceAttachment
    "fivePrime" -> this.fivePrime
    "threePrime" -> this.threePrime
    "linkage" -> this.linkage
    "sugar" -> this.sugar
    else -> error("$name is not a valid property name")
  }

internal fun SubstanceNucleicAcid.Subunit.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "subunit" -> true
    "sequence" -> true
    "length" -> true
    "sequenceAttachment" -> true
    "fivePrime" -> true
    "threePrime" -> true
    "linkage" -> true
    "sugar" -> true
    else -> false
  }

internal fun SubstanceNucleicAcid.Subunit.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.subunit?.let { add(it) }
  this@getAllChildren.sequence?.let { add(it) }
  this@getAllChildren.length?.let { add(it) }
  this@getAllChildren.sequenceAttachment?.let { add(it) }
  this@getAllChildren.fivePrime?.let { add(it) }
  this@getAllChildren.threePrime?.let { add(it) }
  addAll(this@getAllChildren.linkage)
  addAll(this@getAllChildren.sugar)
}

internal fun SubstanceNucleicAcid.Subunit.Linkage.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "connectivity" -> this.connectivity
    "identifier" -> this.identifier
    "name" -> this.name
    "residueSite" -> this.residueSite
    else -> error("$name is not a valid property name")
  }

internal fun SubstanceNucleicAcid.Subunit.Linkage.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "connectivity" -> true
    "identifier" -> true
    "name" -> true
    "residueSite" -> true
    else -> false
  }

internal fun SubstanceNucleicAcid.Subunit.Linkage.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.connectivity?.let { add(it) }
  this@getAllChildren.identifier?.let { add(it) }
  this@getAllChildren.name?.let { add(it) }
  this@getAllChildren.residueSite?.let { add(it) }
}

internal fun SubstanceNucleicAcid.Subunit.Sugar.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "identifier" -> this.identifier
    "name" -> this.name
    "residueSite" -> this.residueSite
    else -> error("$name is not a valid property name")
  }

internal fun SubstanceNucleicAcid.Subunit.Sugar.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "identifier" -> true
    "name" -> true
    "residueSite" -> true
    else -> false
  }

internal fun SubstanceNucleicAcid.Subunit.Sugar.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.identifier?.let { add(it) }
  this@getAllChildren.name?.let { add(it) }
  this@getAllChildren.residueSite?.let { add(it) }
}
