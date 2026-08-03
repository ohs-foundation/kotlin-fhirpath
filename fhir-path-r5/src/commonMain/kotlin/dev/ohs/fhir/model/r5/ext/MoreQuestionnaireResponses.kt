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

import dev.ohs.fhir.model.r5.QuestionnaireResponse
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun QuestionnaireResponse.getProperty(name: String): Any? =
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
    "basedOn" -> this.basedOn
    "partOf" -> this.partOf
    "questionnaire" -> this.questionnaire
    "status" -> this.status
    "subject" -> this.subject
    "encounter" -> this.encounter
    "authored" -> this.authored
    "author" -> this.author
    "source" -> this.source
    "item" -> this.item
    else -> error("$name is not a valid property name")
  }

internal fun QuestionnaireResponse.hasProperty(name: String): Boolean =
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
    "basedOn" -> true
    "partOf" -> true
    "questionnaire" -> true
    "status" -> true
    "subject" -> true
    "encounter" -> true
    "authored" -> true
    "author" -> true
    "source" -> true
    "item" -> true
    else -> false
  }

internal fun QuestionnaireResponse.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.meta?.let { add(it) }
  this@getAllChildren.implicitRules?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.contained)
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.identifier)
  addAll(this@getAllChildren.basedOn)
  addAll(this@getAllChildren.partOf)
  add(this@getAllChildren.questionnaire)
  add(this@getAllChildren.status)
  this@getAllChildren.subject?.let { add(it) }
  this@getAllChildren.encounter?.let { add(it) }
  this@getAllChildren.authored?.let { add(it) }
  this@getAllChildren.author?.let { add(it) }
  this@getAllChildren.source?.let { add(it) }
  addAll(this@getAllChildren.item)
}

internal fun QuestionnaireResponse.Item.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "linkId" -> this.linkId
    "definition" -> this.definition
    "text" -> this.text
    "answer" -> this.answer
    "item" -> this.item
    else -> error("$name is not a valid property name")
  }

internal fun QuestionnaireResponse.Item.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "linkId" -> true
    "definition" -> true
    "text" -> true
    "answer" -> true
    "item" -> true
    else -> false
  }

internal fun QuestionnaireResponse.Item.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.linkId)
  this@getAllChildren.definition?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.answer)
  addAll(this@getAllChildren.item)
}

internal fun QuestionnaireResponse.Item.Answer.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "value" -> this.`value`
    "item" -> this.item
    else -> error("$name is not a valid property name")
  }

internal fun QuestionnaireResponse.Item.Answer.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "value" -> true
    "item" -> true
    else -> false
  }

internal fun QuestionnaireResponse.Item.Answer.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.`value`)
  addAll(this@getAllChildren.item)
}
