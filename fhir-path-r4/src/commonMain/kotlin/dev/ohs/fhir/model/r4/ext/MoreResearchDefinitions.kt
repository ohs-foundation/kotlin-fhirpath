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

import dev.ohs.fhir.model.r4.ResearchDefinition
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun ResearchDefinition.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "meta" -> this.meta
    "implicitRules" -> this.implicitRules
    "language" -> this.language
    "text" -> this.text
    "contained" -> this.contained
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "url" -> this.url
    "identifier" -> this.identifier
    "version" -> this.version
    "name" -> this.name
    "title" -> this.title
    "shortTitle" -> this.shortTitle
    "subtitle" -> this.subtitle
    "status" -> this.status
    "experimental" -> this.experimental
    "subject" -> this.subject
    "date" -> this.date
    "publisher" -> this.publisher
    "contact" -> this.contact
    "description" -> this.description
    "comment" -> this.comment
    "useContext" -> this.useContext
    "jurisdiction" -> this.jurisdiction
    "purpose" -> this.purpose
    "usage" -> this.usage
    "copyright" -> this.copyright
    "approvalDate" -> this.approvalDate
    "lastReviewDate" -> this.lastReviewDate
    "effectivePeriod" -> this.effectivePeriod
    "topic" -> this.topic
    "author" -> this.author
    "editor" -> this.editor
    "reviewer" -> this.reviewer
    "endorser" -> this.endorser
    "relatedArtifact" -> this.relatedArtifact
    "library" -> this.library
    "population" -> this.population
    "exposure" -> this.exposure
    "exposureAlternative" -> this.exposureAlternative
    "outcome" -> this.outcome
    else -> error("$name is not a valid property name")
  }

internal fun ResearchDefinition.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "meta" -> true
    "implicitRules" -> true
    "language" -> true
    "text" -> true
    "contained" -> true
    "extension" -> true
    "modifierExtension" -> true
    "url" -> true
    "identifier" -> true
    "version" -> true
    "name" -> true
    "title" -> true
    "shortTitle" -> true
    "subtitle" -> true
    "status" -> true
    "experimental" -> true
    "subject" -> true
    "date" -> true
    "publisher" -> true
    "contact" -> true
    "description" -> true
    "comment" -> true
    "useContext" -> true
    "jurisdiction" -> true
    "purpose" -> true
    "usage" -> true
    "copyright" -> true
    "approvalDate" -> true
    "lastReviewDate" -> true
    "effectivePeriod" -> true
    "topic" -> true
    "author" -> true
    "editor" -> true
    "reviewer" -> true
    "endorser" -> true
    "relatedArtifact" -> true
    "library" -> true
    "population" -> true
    "exposure" -> true
    "exposureAlternative" -> true
    "outcome" -> true
    else -> false
  }

internal fun ResearchDefinition.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.meta?.let { add(it) }
  this@getAllChildren.implicitRules?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.contained)
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.url?.let { add(it) }
  addAll(this@getAllChildren.identifier)
  this@getAllChildren.version?.let { add(it) }
  this@getAllChildren.name?.let { add(it) }
  this@getAllChildren.title?.let { add(it) }
  this@getAllChildren.shortTitle?.let { add(it) }
  this@getAllChildren.subtitle?.let { add(it) }
  add(this@getAllChildren.status)
  this@getAllChildren.experimental?.let { add(it) }
  this@getAllChildren.subject?.let { add(it) }
  this@getAllChildren.date?.let { add(it) }
  this@getAllChildren.publisher?.let { add(it) }
  addAll(this@getAllChildren.contact)
  this@getAllChildren.description?.let { add(it) }
  addAll(this@getAllChildren.comment)
  addAll(this@getAllChildren.useContext)
  addAll(this@getAllChildren.jurisdiction)
  this@getAllChildren.purpose?.let { add(it) }
  this@getAllChildren.usage?.let { add(it) }
  this@getAllChildren.copyright?.let { add(it) }
  this@getAllChildren.approvalDate?.let { add(it) }
  this@getAllChildren.lastReviewDate?.let { add(it) }
  this@getAllChildren.effectivePeriod?.let { add(it) }
  addAll(this@getAllChildren.topic)
  addAll(this@getAllChildren.author)
  addAll(this@getAllChildren.editor)
  addAll(this@getAllChildren.reviewer)
  addAll(this@getAllChildren.endorser)
  addAll(this@getAllChildren.relatedArtifact)
  addAll(this@getAllChildren.library)
  add(this@getAllChildren.population)
  this@getAllChildren.exposure?.let { add(it) }
  this@getAllChildren.exposureAlternative?.let { add(it) }
  this@getAllChildren.outcome?.let { add(it) }
}
