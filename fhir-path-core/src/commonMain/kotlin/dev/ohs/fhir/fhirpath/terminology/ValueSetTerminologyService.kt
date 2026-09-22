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

package dev.ohs.fhir.fhirpath.terminology

import dev.ohs.fhir.fhirpath.functions.primitiveValue
import dev.ohs.fhir.fhirpath.model.FhirModelNavigator
import dev.ohs.fhir.fhirpath.terminology.ValueSetMembership.IN
import dev.ohs.fhir.fhirpath.terminology.ValueSetMembership.OUT
import dev.ohs.fhir.fhirpath.terminology.ValueSetMembership.UNKNOWN

/**
 * A [TerminologyService] that answers from a collection of ValueSet resources, without a code
 * system or a terminology server.
 *
 * A code is in a value set if it is in `expansion.contains`, or in a `compose.include` that lists
 * its concepts. `compose.include.valueSet` is followed if the imported value set is in the
 * collection. An include that selects by filter, or takes a whole code system, cannot be evaluated
 * and gives [UNKNOWN] unless the value set has an expansion.
 */
class ValueSetTerminologyService(
  valueSets: Collection<Any>,
  private val fhirModelNavigator: FhirModelNavigator,
) : TerminologyService {

  private val valueSetsByUrl: Map<String, List<Any>> =
    valueSets.filter { url(it) != null }.groupBy { url(it)!! }

  override fun memberOf(valueSet: String, system: String?, code: String): ValueSetMembership =
    membership(valueSet, system, code, visited = emptySet())

  private fun membership(
    canonical: String,
    system: String?,
    code: String,
    visited: Set<String>,
  ): ValueSetMembership {
    // A value set that imports itself, directly or not, cannot be evaluated.
    if (canonical in visited) return UNKNOWN
    val valueSet = resolve(canonical) ?: return UNKNOWN

    val expansion = fhirModelNavigator.accessProperty(valueSet, "expansion")
    val compose = fhirModelNavigator.accessProperty(valueSet, "compose")
    if (expansion != null && children(expansion, "contains").any { contains(it, system, code) }) {
      return IN
    }
    val composeMembership =
      compose?.let { composeMembership(it, system, code, visited + canonical) }
    return when {
      composeMembership == IN -> IN
      // The expansion lists every code in the value set.
      expansion != null -> OUT
      else -> composeMembership ?: UNKNOWN
    }
  }

  private fun resolve(canonical: String): Any? {
    val url = canonical.substringBefore('|')
    val version = canonical.substringAfter('|', missingDelimiterValue = "").ifEmpty { null }
    val candidates = valueSetsByUrl[url].orEmpty()
    return if (version != null) {
      candidates.firstOrNull { version(it) == version }
    } else {
      candidates.maxWithOrNull(compareBy(versionComparator) { version(it) })
    }
  }

  private fun contains(entry: Any, system: String?, code: String): Boolean =
    matches(entry, fhirModelNavigator.primitiveValue(entry, "system"), system, code) ||
      children(entry, "contains").any { contains(it, system, code) }

  private fun composeMembership(
    compose: Any,
    system: String?,
    code: String,
    visited: Set<String>,
  ): ValueSetMembership {
    val included = anyOf(children(compose, "include").map { conceptSet(it, system, code, visited) })
    if (included != IN) return included
    return when (
      anyOf(children(compose, "exclude").map { conceptSet(it, system, code, visited) })
    ) {
      IN -> OUT
      OUT -> IN
      UNKNOWN -> UNKNOWN
    }
  }

  /** Membership in one `compose.include` or `compose.exclude`. */
  private fun conceptSet(
    conceptSet: Any,
    system: String?,
    code: String,
    visited: Set<String>,
  ): ValueSetMembership {
    val memberships =
      children(conceptSet, "valueSet").map { imported ->
        val canonical = imported as? String ?: fhirModelNavigator.accessProperty(imported, "value")
        (canonical as? String)?.let { membership(it, system, code, visited) } ?: UNKNOWN
      } + listOfNotNull(systemMembership(conceptSet, system, code))
    // A code is in the concept set if it is in the system part and in every imported value set.
    return when {
      memberships.isEmpty() -> UNKNOWN
      OUT in memberships -> OUT
      UNKNOWN in memberships -> UNKNOWN
      else -> IN
    }
  }

  /** Membership in the `system` part of a concept set, or null if it has none. */
  private fun systemMembership(
    conceptSet: Any,
    system: String?,
    code: String,
  ): ValueSetMembership? {
    val conceptSetSystem = fhirModelNavigator.primitiveValue(conceptSet, "system") ?: return null
    if (system != null && system != conceptSetSystem) return OUT
    val concepts = children(conceptSet, "concept")
    // A filter, or a whole code system, needs the code system to evaluate.
    if (concepts.isEmpty() || children(conceptSet, "filter").isNotEmpty()) return UNKNOWN
    return if (concepts.any { matches(it, conceptSetSystem, system, code) }) IN else OUT
  }

  private fun matches(element: Any, elementSystem: String?, system: String?, code: String) =
    fhirModelNavigator.primitiveValue(element, "code") == code &&
      (system == null || system == elementSystem)

  private fun anyOf(memberships: List<ValueSetMembership>): ValueSetMembership =
    when {
      IN in memberships -> IN
      UNKNOWN in memberships -> UNKNOWN
      else -> OUT
    }

  private fun children(obj: Any, propertyName: String): List<Any> =
    (fhirModelNavigator.accessProperty(obj, propertyName) as? List<*>).orEmpty().filterNotNull()

  private fun url(valueSet: Any): String? = fhirModelNavigator.primitiveValue(valueSet, "url")

  private fun version(valueSet: Any): String? =
    fhirModelNavigator.primitiveValue(valueSet, "version")

  private companion object {
    /** Orders versions part by part, numerically where both parts are numbers. Null is lowest. */
    val versionComparator: Comparator<String?> = Comparator { a, b ->
      if (a == null || b == null) return@Comparator compareValues(a, b)
      val (partsA, partsB) = a.split('.') to b.split('.')
      for (i in 0 until maxOf(partsA.size, partsB.size)) {
        val (partA, partB) = partsA.getOrElse(i) { "0" } to partsB.getOrElse(i) { "0" }
        val (numberA, numberB) = partA.toIntOrNull() to partB.toIntOrNull()
        val order =
          if (numberA != null && numberB != null) numberA.compareTo(numberB)
          else partA.compareTo(partB)
        if (order != 0) return@Comparator order
      }
      0
    }
  }
}
