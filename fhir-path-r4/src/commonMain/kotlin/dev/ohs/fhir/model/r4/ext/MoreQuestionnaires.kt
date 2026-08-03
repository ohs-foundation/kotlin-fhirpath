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

import dev.ohs.fhir.model.r4.Questionnaire
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun Questionnaire.getProperty(name: String): Any? =
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
    "derivedFrom" -> this.derivedFrom
    "status" -> this.status
    "experimental" -> this.experimental
    "subjectType" -> this.subjectType
    "date" -> this.date
    "publisher" -> this.publisher
    "contact" -> this.contact
    "description" -> this.description
    "useContext" -> this.useContext
    "jurisdiction" -> this.jurisdiction
    "purpose" -> this.purpose
    "copyright" -> this.copyright
    "approvalDate" -> this.approvalDate
    "lastReviewDate" -> this.lastReviewDate
    "effectivePeriod" -> this.effectivePeriod
    "code" -> this.code
    "item" -> this.item
    else -> error("$name is not a valid property name")
  }

internal fun Questionnaire.hasProperty(name: String): Boolean =
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
    "derivedFrom" -> true
    "status" -> true
    "experimental" -> true
    "subjectType" -> true
    "date" -> true
    "publisher" -> true
    "contact" -> true
    "description" -> true
    "useContext" -> true
    "jurisdiction" -> true
    "purpose" -> true
    "copyright" -> true
    "approvalDate" -> true
    "lastReviewDate" -> true
    "effectivePeriod" -> true
    "code" -> true
    "item" -> true
    else -> false
  }

internal fun Questionnaire.getAllChildren(): List<Any> = buildList {
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
  addAll(this@getAllChildren.derivedFrom)
  add(this@getAllChildren.status)
  this@getAllChildren.experimental?.let { add(it) }
  addAll(this@getAllChildren.subjectType)
  this@getAllChildren.date?.let { add(it) }
  this@getAllChildren.publisher?.let { add(it) }
  addAll(this@getAllChildren.contact)
  this@getAllChildren.description?.let { add(it) }
  addAll(this@getAllChildren.useContext)
  addAll(this@getAllChildren.jurisdiction)
  this@getAllChildren.purpose?.let { add(it) }
  this@getAllChildren.copyright?.let { add(it) }
  this@getAllChildren.approvalDate?.let { add(it) }
  this@getAllChildren.lastReviewDate?.let { add(it) }
  this@getAllChildren.effectivePeriod?.let { add(it) }
  addAll(this@getAllChildren.code)
  addAll(this@getAllChildren.item)
}

internal fun Questionnaire.Item.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "linkId" -> this.linkId
    "definition" -> this.definition
    "code" -> this.code
    "prefix" -> this.prefix
    "text" -> this.text
    "type" -> this.type
    "enableWhen" -> this.enableWhen
    "enableBehavior" -> this.enableBehavior
    "required" -> this.required
    "repeats" -> this.repeats
    "readOnly" -> this.readOnly
    "maxLength" -> this.maxLength
    "answerValueSet" -> this.answerValueSet
    "answerOption" -> this.answerOption
    "initial" -> this.initial
    "item" -> this.item
    else -> error("$name is not a valid property name")
  }

internal fun Questionnaire.Item.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "linkId" -> true
    "definition" -> true
    "code" -> true
    "prefix" -> true
    "text" -> true
    "type" -> true
    "enableWhen" -> true
    "enableBehavior" -> true
    "required" -> true
    "repeats" -> true
    "readOnly" -> true
    "maxLength" -> true
    "answerValueSet" -> true
    "answerOption" -> true
    "initial" -> true
    "item" -> true
    else -> false
  }

internal fun Questionnaire.Item.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.linkId)
  this@getAllChildren.definition?.let { add(it) }
  addAll(this@getAllChildren.code)
  this@getAllChildren.prefix?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  add(this@getAllChildren.type)
  addAll(this@getAllChildren.enableWhen)
  this@getAllChildren.enableBehavior?.let { add(it) }
  this@getAllChildren.required?.let { add(it) }
  this@getAllChildren.repeats?.let { add(it) }
  this@getAllChildren.readOnly?.let { add(it) }
  this@getAllChildren.maxLength?.let { add(it) }
  this@getAllChildren.answerValueSet?.let { add(it) }
  addAll(this@getAllChildren.answerOption)
  addAll(this@getAllChildren.initial)
  addAll(this@getAllChildren.item)
}

internal fun Questionnaire.Item.EnableWhen.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "question" -> this.question
    "operator" -> this.`operator`
    "answer" -> this.answer
    else -> error("$name is not a valid property name")
  }

internal fun Questionnaire.Item.EnableWhen.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "question" -> true
    "operator" -> true
    "answer" -> true
    else -> false
  }

internal fun Questionnaire.Item.EnableWhen.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.question)
  add(this@getAllChildren.`operator`)
  add(this@getAllChildren.answer)
}

internal fun Questionnaire.Item.AnswerOption.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "value" -> this.`value`
    "initialSelected" -> this.initialSelected
    else -> error("$name is not a valid property name")
  }

internal fun Questionnaire.Item.AnswerOption.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "value" -> true
    "initialSelected" -> true
    else -> false
  }

internal fun Questionnaire.Item.AnswerOption.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.`value`)
  this@getAllChildren.initialSelected?.let { add(it) }
}

internal fun Questionnaire.Item.Initial.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "value" -> this.`value`
    else -> error("$name is not a valid property name")
  }

internal fun Questionnaire.Item.Initial.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "value" -> true
    else -> false
  }

internal fun Questionnaire.Item.Initial.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.`value`)
}
