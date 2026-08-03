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

import dev.ohs.fhir.model.r5.ArtifactAssessment
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun ArtifactAssessment.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "meta" -> this.meta
    "implicitRules" -> this.implicitRules
    "language" -> this.language
    "text" -> this.text
    "contained" -> this.contained
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "identifier" -> this.identifier
    "title" -> this.title
    "citeAs" -> this.citeAs
    "date" -> this.date
    "copyright" -> this.copyright
    "approvalDate" -> this.approvalDate
    "lastReviewDate" -> this.lastReviewDate
    "artifact" -> this.artifact
    "content" -> this.content
    "workflowStatus" -> this.workflowStatus
    "disposition" -> this.disposition
    else -> error("$name is not a valid property name")
  }

internal fun ArtifactAssessment.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "meta" -> true
    "implicitRules" -> true
    "language" -> true
    "text" -> true
    "contained" -> true
    "extension" -> true
    "modifierExtension" -> true
    "identifier" -> true
    "title" -> true
    "citeAs" -> true
    "date" -> true
    "copyright" -> true
    "approvalDate" -> true
    "lastReviewDate" -> true
    "artifact" -> true
    "content" -> true
    "workflowStatus" -> true
    "disposition" -> true
    else -> false
  }

internal fun ArtifactAssessment.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.meta?.let { add(it) }
  this@getAllChildren.implicitRules?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.contained)
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.identifier)
  this@getAllChildren.title?.let { add(it) }
  this@getAllChildren.citeAs?.let { add(it) }
  this@getAllChildren.date?.let { add(it) }
  this@getAllChildren.copyright?.let { add(it) }
  this@getAllChildren.approvalDate?.let { add(it) }
  this@getAllChildren.lastReviewDate?.let { add(it) }
  add(this@getAllChildren.artifact)
  addAll(this@getAllChildren.content)
  this@getAllChildren.workflowStatus?.let { add(it) }
  this@getAllChildren.disposition?.let { add(it) }
}

internal fun ArtifactAssessment.Content.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "informationType" -> this.informationType
    "summary" -> this.summary
    "type" -> this.type
    "classifier" -> this.classifier
    "quantity" -> this.quantity
    "author" -> this.author
    "path" -> this.path
    "relatedArtifact" -> this.relatedArtifact
    "freeToShare" -> this.freeToShare
    "component" -> this.component
    else -> error("$name is not a valid property name")
  }

internal fun ArtifactAssessment.Content.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "informationType" -> true
    "summary" -> true
    "type" -> true
    "classifier" -> true
    "quantity" -> true
    "author" -> true
    "path" -> true
    "relatedArtifact" -> true
    "freeToShare" -> true
    "component" -> true
    else -> false
  }

internal fun ArtifactAssessment.Content.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.informationType?.let { add(it) }
  this@getAllChildren.summary?.let { add(it) }
  this@getAllChildren.type?.let { add(it) }
  addAll(this@getAllChildren.classifier)
  this@getAllChildren.quantity?.let { add(it) }
  this@getAllChildren.author?.let { add(it) }
  addAll(this@getAllChildren.path)
  addAll(this@getAllChildren.relatedArtifact)
  this@getAllChildren.freeToShare?.let { add(it) }
  addAll(this@getAllChildren.component)
}
