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

import dev.ohs.fhir.model.r5.PlanDefinition
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
    "versionAlgorithm" -> this.versionAlgorithm
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
    "copyrightLabel" -> this.copyrightLabel
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
    "actor" -> this.actor
    "action" -> this.action
    "asNeeded" -> this.asNeeded
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
    "versionAlgorithm" -> true
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
    "copyrightLabel" -> true
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
    "actor" -> true
    "action" -> true
    "asNeeded" -> true
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
  this@getAllChildren.versionAlgorithm?.let { add(it) }
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
  this@getAllChildren.copyrightLabel?.let { add(it) }
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
  addAll(this@getAllChildren.actor)
  addAll(this@getAllChildren.action)
  this@getAllChildren.asNeeded?.let { add(it) }
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

internal fun PlanDefinition.Actor.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "title" -> this.title
    "description" -> this.description
    "option" -> this.option
    else -> error("$name is not a valid property name")
  }

internal fun PlanDefinition.Actor.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "title" -> true
    "description" -> true
    "option" -> true
    else -> false
  }

internal fun PlanDefinition.Actor.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.title?.let { add(it) }
  this@getAllChildren.description?.let { add(it) }
  addAll(this@getAllChildren.option)
}

internal fun PlanDefinition.Actor.Option.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "typeCanonical" -> this.typeCanonical
    "typeReference" -> this.typeReference
    "role" -> this.role
    else -> error("$name is not a valid property name")
  }

internal fun PlanDefinition.Actor.Option.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "typeCanonical" -> true
    "typeReference" -> true
    "role" -> true
    else -> false
  }

internal fun PlanDefinition.Actor.Option.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.type?.let { add(it) }
  this@getAllChildren.typeCanonical?.let { add(it) }
  this@getAllChildren.typeReference?.let { add(it) }
  this@getAllChildren.role?.let { add(it) }
}

internal fun PlanDefinition.Action.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "linkId" -> this.linkId
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
    "location" -> this.location
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
    "linkId" -> true
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
    "location" -> true
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
  this@getAllChildren.linkId?.let { add(it) }
  this@getAllChildren.prefix?.let { add(it) }
  this@getAllChildren.title?.let { add(it) }
  this@getAllChildren.description?.let { add(it) }
  this@getAllChildren.textEquivalent?.let { add(it) }
  this@getAllChildren.priority?.let { add(it) }
  this@getAllChildren.code?.let { add(it) }
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
  this@getAllChildren.location?.let { add(it) }
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

internal fun PlanDefinition.Action.Input.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "title" -> this.title
    "requirement" -> this.requirement
    "relatedData" -> this.relatedData
    else -> error("$name is not a valid property name")
  }

internal fun PlanDefinition.Action.Input.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "title" -> true
    "requirement" -> true
    "relatedData" -> true
    else -> false
  }

internal fun PlanDefinition.Action.Input.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.title?.let { add(it) }
  this@getAllChildren.requirement?.let { add(it) }
  this@getAllChildren.relatedData?.let { add(it) }
}

internal fun PlanDefinition.Action.Output.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "title" -> this.title
    "requirement" -> this.requirement
    "relatedData" -> this.relatedData
    else -> error("$name is not a valid property name")
  }

internal fun PlanDefinition.Action.Output.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "title" -> true
    "requirement" -> true
    "relatedData" -> true
    else -> false
  }

internal fun PlanDefinition.Action.Output.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.title?.let { add(it) }
  this@getAllChildren.requirement?.let { add(it) }
  this@getAllChildren.relatedData?.let { add(it) }
}

internal fun PlanDefinition.Action.RelatedAction.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "targetId" -> this.targetId
    "relationship" -> this.relationship
    "endRelationship" -> this.endRelationship
    "offset" -> this.offset
    else -> error("$name is not a valid property name")
  }

internal fun PlanDefinition.Action.RelatedAction.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "targetId" -> true
    "relationship" -> true
    "endRelationship" -> true
    "offset" -> true
    else -> false
  }

internal fun PlanDefinition.Action.RelatedAction.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.targetId)
  add(this@getAllChildren.relationship)
  this@getAllChildren.endRelationship?.let { add(it) }
  this@getAllChildren.offset?.let { add(it) }
}

internal fun PlanDefinition.Action.Participant.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "actorId" -> this.actorId
    "type" -> this.type
    "typeCanonical" -> this.typeCanonical
    "typeReference" -> this.typeReference
    "role" -> this.role
    "function" -> this.function
    else -> error("$name is not a valid property name")
  }

internal fun PlanDefinition.Action.Participant.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "actorId" -> true
    "type" -> true
    "typeCanonical" -> true
    "typeReference" -> true
    "role" -> true
    "function" -> true
    else -> false
  }

internal fun PlanDefinition.Action.Participant.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.actorId?.let { add(it) }
  this@getAllChildren.type?.let { add(it) }
  this@getAllChildren.typeCanonical?.let { add(it) }
  this@getAllChildren.typeReference?.let { add(it) }
  this@getAllChildren.role?.let { add(it) }
  this@getAllChildren.function?.let { add(it) }
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
