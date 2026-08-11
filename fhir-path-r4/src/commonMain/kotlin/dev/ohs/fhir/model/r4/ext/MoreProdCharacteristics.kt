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

import dev.ohs.fhir.model.r4.ProdCharacteristic
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun ProdCharacteristic.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "height" -> this.height
    "width" -> this.width
    "depth" -> this.depth
    "weight" -> this.weight
    "nominalVolume" -> this.nominalVolume
    "externalDiameter" -> this.externalDiameter
    "shape" -> this.shape
    "color" -> this.color
    "imprint" -> this.imprint
    "image" -> this.image
    "scoring" -> this.scoring
    else -> error("$name is not a valid property name")
  }

internal fun ProdCharacteristic.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "height" -> true
    "width" -> true
    "depth" -> true
    "weight" -> true
    "nominalVolume" -> true
    "externalDiameter" -> true
    "shape" -> true
    "color" -> true
    "imprint" -> true
    "image" -> true
    "scoring" -> true
    else -> false
  }

internal fun ProdCharacteristic.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.height?.let { add(it) }
  this@getAllChildren.width?.let { add(it) }
  this@getAllChildren.depth?.let { add(it) }
  this@getAllChildren.weight?.let { add(it) }
  this@getAllChildren.nominalVolume?.let { add(it) }
  this@getAllChildren.externalDiameter?.let { add(it) }
  this@getAllChildren.shape?.let { add(it) }
  addAll(this@getAllChildren.color)
  addAll(this@getAllChildren.imprint)
  addAll(this@getAllChildren.image)
  this@getAllChildren.scoring?.let { add(it) }
}
