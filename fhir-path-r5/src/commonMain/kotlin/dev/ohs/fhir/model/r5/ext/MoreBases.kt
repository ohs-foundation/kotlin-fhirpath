package dev.ohs.fhir.model.r5.ext

import dev.ohs.fhir.model.r5.Base
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun Base.getProperty(name: String): Any? = when(name) {
  else -> error("$name is not a valid property name")
}

internal fun Base.hasProperty(name: String): Boolean = when(name) {
  else -> false
}

internal fun Base.getAllChildren(): List<Any> = buildList {
}
