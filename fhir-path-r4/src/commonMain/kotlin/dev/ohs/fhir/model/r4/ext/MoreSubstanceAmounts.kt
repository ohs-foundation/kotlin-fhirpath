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

import dev.ohs.fhir.model.r4.SubstanceAmount
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun SubstanceAmount.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "amount" -> this.amount
    "amountType" -> this.amountType
    "amountText" -> this.amountText
    "referenceRange" -> this.referenceRange
    else -> error("$name is not a valid property name")
  }

internal fun SubstanceAmount.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "amount" -> true
    "amountType" -> true
    "amountText" -> true
    "referenceRange" -> true
    else -> false
  }

internal fun SubstanceAmount.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.amount?.let { add(it) }
  this@getAllChildren.amountType?.let { add(it) }
  this@getAllChildren.amountText?.let { add(it) }
  this@getAllChildren.referenceRange?.let { add(it) }
}

internal fun SubstanceAmount.ReferenceRange.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "lowLimit" -> this.lowLimit
    "highLimit" -> this.highLimit
    else -> error("$name is not a valid property name")
  }

internal fun SubstanceAmount.ReferenceRange.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "lowLimit" -> true
    "highLimit" -> true
    else -> false
  }

internal fun SubstanceAmount.ReferenceRange.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  this@getAllChildren.lowLimit?.let { add(it) }
  this@getAllChildren.highLimit?.let { add(it) }
}
