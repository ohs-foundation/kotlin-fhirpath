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
 * Sorts subtypes before their ancestors (e.g. `HumanName` before `Element` before `Base`). Apply
 * this to the type list before generating type dispatchers, so every instance matches its own
 * type's branch instead of an ancestor's.
 *
 * The generated `Element.getProperty()` / `hasProperty()` / `getAllChildren()` helpers check types
 * in this list's order, like `when(this) { is HumanName -> ...; is Element -> ... }`, and `when`
 * picks the first matching branch.
 *
 * Without this sort, the list keeps the arbitrary order the files were read from disk, so an
 * ancestor like `Base` can end up listed first. A `HumanName` is also a `Base`, so it matches the
 * ancestor's branch, which calls the same helper again, recursing until a StackOverflowError.
 *
 * With this sort, each type's own branch always comes before its ancestors' branches, so every
 * instance is dispatched to its own type.
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
