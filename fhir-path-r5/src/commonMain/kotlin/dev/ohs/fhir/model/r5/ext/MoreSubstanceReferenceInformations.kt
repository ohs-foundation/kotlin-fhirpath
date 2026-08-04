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

import dev.ohs.fhir.model.r5.SubstanceReferenceInformation
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun SubstanceReferenceInformation.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "meta" -> this.meta
    "implicitRules" -> this.implicitRules
    "language" -> this.language
    "text" -> this.text
    "contained" -> this.contained
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "comment" -> this.comment
    "gene" -> this.gene
    "geneElement" -> this.geneElement
    "target" -> this.target
    else -> error("$name is not a valid property name")
  }

internal fun SubstanceReferenceInformation.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "meta" -> true
    "implicitRules" -> true
    "language" -> true
    "text" -> true
    "contained" -> true
    "extension" -> true
    "modifierExtension" -> true
    "comment" -> true
    "gene" -> true
    "geneElement" -> true
    "target" -> true
    else -> false
  }

internal fun SubstanceReferenceInformation.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.meta?.let { add(it) }
  this@getAllChildren.implicitRules?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.contained)
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.comment?.let { add(it) }
  addAll(this@getAllChildren.gene)
  addAll(this@getAllChildren.geneElement)
  addAll(this@getAllChildren.target)
}

internal fun SubstanceReferenceInformation.Gene.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "geneSequenceOrigin" -> this.geneSequenceOrigin
    "gene" -> this.gene
    "source" -> this.source
    else -> error("$name is not a valid property name")
  }

internal fun SubstanceReferenceInformation.Gene.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "geneSequenceOrigin" -> true
    "gene" -> true
    "source" -> true
    else -> false
  }

internal fun SubstanceReferenceInformation.Gene.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.geneSequenceOrigin?.let { add(it) }
  this@getAllChildren.gene?.let { add(it) }
  addAll(this@getAllChildren.source)
}

internal fun SubstanceReferenceInformation.GeneElement.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "element" -> this.element
    "source" -> this.source
    else -> error("$name is not a valid property name")
  }

internal fun SubstanceReferenceInformation.GeneElement.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "element" -> true
    "source" -> true
    else -> false
  }

internal fun SubstanceReferenceInformation.GeneElement.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.type?.let { add(it) }
  this@getAllChildren.element?.let { add(it) }
  addAll(this@getAllChildren.source)
}

internal fun SubstanceReferenceInformation.Target.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "target" -> this.target
    "type" -> this.type
    "interaction" -> this.interaction
    "organism" -> this.organism
    "organismType" -> this.organismType
    "amount" -> this.amount
    "amountType" -> this.amountType
    "source" -> this.source
    else -> error("$name is not a valid property name")
  }

internal fun SubstanceReferenceInformation.Target.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "target" -> true
    "type" -> true
    "interaction" -> true
    "organism" -> true
    "organismType" -> true
    "amount" -> true
    "amountType" -> true
    "source" -> true
    else -> false
  }

internal fun SubstanceReferenceInformation.Target.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.target?.let { add(it) }
  this@getAllChildren.type?.let { add(it) }
  this@getAllChildren.interaction?.let { add(it) }
  this@getAllChildren.organism?.let { add(it) }
  this@getAllChildren.organismType?.let { add(it) }
  this@getAllChildren.amount?.let { add(it) }
  this@getAllChildren.amountType?.let { add(it) }
  addAll(this@getAllChildren.source)
}
