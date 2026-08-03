package dev.ohs.fhir.model.r4b.ext

import dev.ohs.fhir.model.r4b.ProdCharacteristic
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun ProdCharacteristic.getProperty(name: String): Any? = when(name) {
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

internal fun ProdCharacteristic.hasProperty(name: String): Boolean = when(name) {
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
