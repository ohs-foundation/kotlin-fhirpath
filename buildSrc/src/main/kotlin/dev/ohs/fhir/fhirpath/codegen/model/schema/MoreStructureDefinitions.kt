/*
 * Copyright 2025-2026 Open Health Stack Foundation
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

package dev.ohs.fhir.fhirpath.codegen.model.schema

val StructureDefinition.rootElements
  get() =
    snapshot?.element?.filter { it.id.matches("$name\\.[A-Za-z0-9]+(\\[x])?".toRegex()) }
      ?: emptyList()

val StructureDefinition.backboneElements
  get() =
    snapshot?.element?.let { elements ->
      elements
        .filter { it.isBackboneElement() }
        .associateWith { backboneElement ->
          elements.filter {
            it.path.matches("${backboneElement.path}\\.[A-Za-z0-9]+(\\[x])?".toRegex())
          }
        }
    } ?: emptyMap()

/**
 * Sorts so that subtypes always appear before their ancestors (e.g. `HumanName` before `Element`
 * before `Base`).
 *
 * Generators that emit a single `when(this) { is X -> ...; is Y -> ... }` dispatcher over a flat
 * list of [StructureDefinition]s rely on the FIRST matching `is` branch. If an ancestor type (e.g.
 * `Base`, which every FHIR type derives from) is listed before one of its subtypes, the ancestor's
 * branch silently shadows the subtype's branch for every instance of that subtype, since the
 * subtype also satisfies `is <ancestor>`. Sorting by descending inheritance depth (most-derived
 * first) guarantees a type's own branch is always checked before any of its ancestors' branches,
 * regardless of the arbitrary order structure definition files were read from disk.
 */
fun List<StructureDefinition>.sortedByInheritanceDepthDescending(): List<StructureDefinition> {
  val baseNameByName = associate { it.name to it.baseDefinition?.substringAfterLast('/') }
  val depthByName = mutableMapOf<String, Int>()
  val inProgress = mutableSetOf<String>()

  fun depthOf(name: String): Int {
    depthByName[name]?.let {
      return it
    }
    check(inProgress.add(name)) {
      "Cycle detected while computing inheritance depth for structure definition '$name'"
    }
    val baseName = baseNameByName[name]
    val depth = if (baseName == null || baseName == name) 0 else 1 + depthOf(baseName)
    inProgress.remove(name)
    depthByName[name] = depth
    return depth
  }

  return sortedByDescending { depthOf(it.name) }
}
