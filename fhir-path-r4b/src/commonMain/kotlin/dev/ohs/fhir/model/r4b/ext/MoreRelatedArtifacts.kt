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

package dev.ohs.fhir.model.r4b.ext

import dev.ohs.fhir.model.r4b.RelatedArtifact
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun RelatedArtifact.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "type" -> this.type
    "label" -> this.label
    "display" -> this.display
    "citation" -> this.citation
    "url" -> this.url
    "document" -> this.document
    "resource" -> this.resource
    else -> error("$name is not a valid property name")
  }

internal fun RelatedArtifact.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "type" -> true
    "label" -> true
    "display" -> true
    "citation" -> true
    "url" -> true
    "document" -> true
    "resource" -> true
    else -> false
  }

internal fun RelatedArtifact.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  add(this@getAllChildren.type)
  this@getAllChildren.label?.let { add(it) }
  this@getAllChildren.display?.let { add(it) }
  this@getAllChildren.citation?.let { add(it) }
  this@getAllChildren.url?.let { add(it) }
  this@getAllChildren.document?.let { add(it) }
  this@getAllChildren.resource?.let { add(it) }
}
