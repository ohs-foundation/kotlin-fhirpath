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

import dev.ohs.fhir.model.r4b.PlanDefinition
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun PlanDefinition.getProperty(name: String): Any? =
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
    "subtitle" -> this.subtitle
    "type" -> this.type
    "status" -> this.status
    "experimental" -> this.experimental
    "subject" -> this.subject
    "date" -> this.date
    "publisher" -> this.publisher
    "contact" -> this.contact
    "description" -> this.description
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
    "goal" -> this.goal
    "action" -> this.action
    else -> error("$name is not a valid property name")
  }

internal fun PlanDefinition.hasProperty(name: String): Boolean =
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
    "subtitle" -> true
    "type" -> true
    "status" -> true
    "experimental" -> true
    "subject" -> true
    "date" -> true
    "publisher" -> true
    "contact" -> true
    "description" -> true
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
    "goal" -> true
    "action" -> true
    else -> false
  }

internal fun PlanDefinition.getAllChildren(): List<Any> = buildList {
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
  this@getAllChildren.subtitle?.let { add(it) }
  this@getAllChildren.type?.let { add(it) }
  add(this@getAllChildren.status)
  this@getAllChildren.experimental?.let { add(it) }
  this@getAllChildren.subject?.let { add(it) }
  this@getAllChildren.date?.let { add(it) }
  this@getAllChildren.publisher?.let { add(it) }
  addAll(this@getAllChildren.contact)
  this@getAllChildren.description?.let { add(it) }
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
  addAll(this@getAllChildren.goal)
  addAll(this@getAllChildren.action)
}

internal fun PlanDefinition.Goal.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "category" -> this.category
    "description" -> this.description
    "priority" -> this.priority
    "start" -> this.start
    "addresses" -> this.addresses
    "documentation" -> this.documentation
    "target" -> this.target
    else -> error("$name is not a valid property name")
  }

internal fun PlanDefinition.Goal.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "category" -> true
    "description" -> true
    "priority" -> true
    "start" -> true
    "addresses" -> true
    "documentation" -> true
    "target" -> true
    else -> false
  }

internal fun PlanDefinition.Goal.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.category?.let { add(it) }
  add(this@getAllChildren.description)
  this@getAllChildren.priority?.let { add(it) }
  this@getAllChildren.start?.let { add(it) }
  addAll(this@getAllChildren.addresses)
  addAll(this@getAllChildren.documentation)
  addAll(this@getAllChildren.target)
}

internal fun PlanDefinition.Goal.Target.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "measure" -> this.measure
    "detail" -> this.detail
    "due" -> this.due
    else -> error("$name is not a valid property name")
  }

internal fun PlanDefinition.Goal.Target.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "measure" -> true
    "detail" -> true
    "due" -> true
    else -> false
  }

internal fun PlanDefinition.Goal.Target.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.measure?.let { add(it) }
  this@getAllChildren.detail?.let { add(it) }
  this@getAllChildren.due?.let { add(it) }
}

internal fun PlanDefinition.Action.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "prefix" -> this.prefix
    "title" -> this.title
    "description" -> this.description
    "textEquivalent" -> this.textEquivalent
    "priority" -> this.priority
    "code" -> this.code
    "reason" -> this.reason
    "documentation" -> this.documentation
    "goalId" -> this.goalId
    "subject" -> this.subject
    "trigger" -> this.trigger
    "condition" -> this.condition
    "input" -> this.input
    "output" -> this.output
    "relatedAction" -> this.relatedAction
    "timing" -> this.timing
    "participant" -> this.participant
    "type" -> this.type
    "groupingBehavior" -> this.groupingBehavior
    "selectionBehavior" -> this.selectionBehavior
    "requiredBehavior" -> this.requiredBehavior
    "precheckBehavior" -> this.precheckBehavior
    "cardinalityBehavior" -> this.cardinalityBehavior
    "definition" -> this.definition
    "transform" -> this.transform
    "dynamicValue" -> this.dynamicValue
    "action" -> this.action
    else -> error("$name is not a valid property name")
  }

internal fun PlanDefinition.Action.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "prefix" -> true
    "title" -> true
    "description" -> true
    "textEquivalent" -> true
    "priority" -> true
    "code" -> true
    "reason" -> true
    "documentation" -> true
    "goalId" -> true
    "subject" -> true
    "trigger" -> true
    "condition" -> true
    "input" -> true
    "output" -> true
    "relatedAction" -> true
    "timing" -> true
    "participant" -> true
    "type" -> true
    "groupingBehavior" -> true
    "selectionBehavior" -> true
    "requiredBehavior" -> true
    "precheckBehavior" -> true
    "cardinalityBehavior" -> true
    "definition" -> true
    "transform" -> true
    "dynamicValue" -> true
    "action" -> true
    else -> false
  }

internal fun PlanDefinition.Action.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.prefix?.let { add(it) }
  this@getAllChildren.title?.let { add(it) }
  this@getAllChildren.description?.let { add(it) }
  this@getAllChildren.textEquivalent?.let { add(it) }
  this@getAllChildren.priority?.let { add(it) }
  addAll(this@getAllChildren.code)
  addAll(this@getAllChildren.reason)
  addAll(this@getAllChildren.documentation)
  addAll(this@getAllChildren.goalId)
  this@getAllChildren.subject?.let { add(it) }
  addAll(this@getAllChildren.trigger)
  addAll(this@getAllChildren.condition)
  addAll(this@getAllChildren.input)
  addAll(this@getAllChildren.output)
  addAll(this@getAllChildren.relatedAction)
  this@getAllChildren.timing?.let { add(it) }
  addAll(this@getAllChildren.participant)
  this@getAllChildren.type?.let { add(it) }
  this@getAllChildren.groupingBehavior?.let { add(it) }
  this@getAllChildren.selectionBehavior?.let { add(it) }
  this@getAllChildren.requiredBehavior?.let { add(it) }
  this@getAllChildren.precheckBehavior?.let { add(it) }
  this@getAllChildren.cardinalityBehavior?.let { add(it) }
  this@getAllChildren.definition?.let { add(it) }
  this@getAllChildren.transform?.let { add(it) }
  addAll(this@getAllChildren.dynamicValue)
  addAll(this@getAllChildren.action)
}

internal fun PlanDefinition.Action.Condition.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "kind" -> this.kind
    "expression" -> this.expression
    else -> error("$name is not a valid property name")
  }

internal fun PlanDefinition.Action.Condition.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "kind" -> true
    "expression" -> true
    else -> false
  }

internal fun PlanDefinition.Action.Condition.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.kind)
  this@getAllChildren.expression?.let { add(it) }
}

internal fun PlanDefinition.Action.RelatedAction.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "actionId" -> this.actionId
    "relationship" -> this.relationship
    "offset" -> this.offset
    else -> error("$name is not a valid property name")
  }

internal fun PlanDefinition.Action.RelatedAction.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "actionId" -> true
    "relationship" -> true
    "offset" -> true
    else -> false
  }

internal fun PlanDefinition.Action.RelatedAction.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.actionId)
  add(this@getAllChildren.relationship)
  this@getAllChildren.offset?.let { add(it) }
}

internal fun PlanDefinition.Action.Participant.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "role" -> this.role
    else -> error("$name is not a valid property name")
  }

internal fun PlanDefinition.Action.Participant.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "role" -> true
    else -> false
  }

internal fun PlanDefinition.Action.Participant.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.type)
  this@getAllChildren.role?.let { add(it) }
}

internal fun PlanDefinition.Action.DynamicValue.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "path" -> this.path
    "expression" -> this.expression
    else -> error("$name is not a valid property name")
  }

internal fun PlanDefinition.Action.DynamicValue.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "path" -> true
    "expression" -> true
    else -> false
  }

internal fun PlanDefinition.Action.DynamicValue.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.path?.let { add(it) }
  this@getAllChildren.expression?.let { add(it) }
}
