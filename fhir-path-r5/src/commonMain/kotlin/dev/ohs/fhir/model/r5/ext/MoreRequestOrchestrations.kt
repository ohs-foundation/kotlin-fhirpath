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

import dev.ohs.fhir.model.r5.RequestOrchestration
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun RequestOrchestration.getProperty(name: String): Any? =
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
    "instantiatesCanonical" -> this.instantiatesCanonical
    "instantiatesUri" -> this.instantiatesUri
    "basedOn" -> this.basedOn
    "replaces" -> this.replaces
    "groupIdentifier" -> this.groupIdentifier
    "status" -> this.status
    "intent" -> this.intent
    "priority" -> this.priority
    "code" -> this.code
    "subject" -> this.subject
    "encounter" -> this.encounter
    "authoredOn" -> this.authoredOn
    "author" -> this.author
    "reason" -> this.reason
    "goal" -> this.goal
    "note" -> this.note
    "action" -> this.action
    else -> error("$name is not a valid property name")
  }

internal fun RequestOrchestration.hasProperty(name: String): Boolean =
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
    "instantiatesCanonical" -> true
    "instantiatesUri" -> true
    "basedOn" -> true
    "replaces" -> true
    "groupIdentifier" -> true
    "status" -> true
    "intent" -> true
    "priority" -> true
    "code" -> true
    "subject" -> true
    "encounter" -> true
    "authoredOn" -> true
    "author" -> true
    "reason" -> true
    "goal" -> true
    "note" -> true
    "action" -> true
    else -> false
  }

internal fun RequestOrchestration.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.meta?.let { add(it) }
  this@getAllChildren.implicitRules?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.contained)
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.identifier)
  addAll(this@getAllChildren.instantiatesCanonical)
  addAll(this@getAllChildren.instantiatesUri)
  addAll(this@getAllChildren.basedOn)
  addAll(this@getAllChildren.replaces)
  this@getAllChildren.groupIdentifier?.let { add(it) }
  add(this@getAllChildren.status)
  add(this@getAllChildren.intent)
  this@getAllChildren.priority?.let { add(it) }
  this@getAllChildren.code?.let { add(it) }
  this@getAllChildren.subject?.let { add(it) }
  this@getAllChildren.encounter?.let { add(it) }
  this@getAllChildren.authoredOn?.let { add(it) }
  this@getAllChildren.author?.let { add(it) }
  addAll(this@getAllChildren.reason)
  addAll(this@getAllChildren.goal)
  addAll(this@getAllChildren.note)
  addAll(this@getAllChildren.action)
}

internal fun RequestOrchestration.Action.getProperty(name: String): Any? =
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
    "documentation" -> this.documentation
    "goal" -> this.goal
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
    "resource" -> this.resource
    "definition" -> this.definition
    "transform" -> this.transform
    "dynamicValue" -> this.dynamicValue
    "action" -> this.action
    else -> error("$name is not a valid property name")
  }

internal fun RequestOrchestration.Action.hasProperty(name: String): Boolean =
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
    "documentation" -> true
    "goal" -> true
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
    "resource" -> true
    "definition" -> true
    "transform" -> true
    "dynamicValue" -> true
    "action" -> true
    else -> false
  }

internal fun RequestOrchestration.Action.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.linkId?.let { add(it) }
  this@getAllChildren.prefix?.let { add(it) }
  this@getAllChildren.title?.let { add(it) }
  this@getAllChildren.description?.let { add(it) }
  this@getAllChildren.textEquivalent?.let { add(it) }
  this@getAllChildren.priority?.let { add(it) }
  addAll(this@getAllChildren.code)
  addAll(this@getAllChildren.documentation)
  addAll(this@getAllChildren.goal)
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
  this@getAllChildren.resource?.let { add(it) }
  this@getAllChildren.definition?.let { add(it) }
  this@getAllChildren.transform?.let { add(it) }
  addAll(this@getAllChildren.dynamicValue)
  addAll(this@getAllChildren.action)
}

internal fun RequestOrchestration.Action.Condition.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "kind" -> this.kind
    "expression" -> this.expression
    else -> error("$name is not a valid property name")
  }

internal fun RequestOrchestration.Action.Condition.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "kind" -> true
    "expression" -> true
    else -> false
  }

internal fun RequestOrchestration.Action.Condition.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.kind)
  this@getAllChildren.expression?.let { add(it) }
}

internal fun RequestOrchestration.Action.Input.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "title" -> this.title
    "requirement" -> this.requirement
    "relatedData" -> this.relatedData
    else -> error("$name is not a valid property name")
  }

internal fun RequestOrchestration.Action.Input.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "title" -> true
    "requirement" -> true
    "relatedData" -> true
    else -> false
  }

internal fun RequestOrchestration.Action.Input.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.title?.let { add(it) }
  this@getAllChildren.requirement?.let { add(it) }
  this@getAllChildren.relatedData?.let { add(it) }
}

internal fun RequestOrchestration.Action.Output.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "title" -> this.title
    "requirement" -> this.requirement
    "relatedData" -> this.relatedData
    else -> error("$name is not a valid property name")
  }

internal fun RequestOrchestration.Action.Output.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "title" -> true
    "requirement" -> true
    "relatedData" -> true
    else -> false
  }

internal fun RequestOrchestration.Action.Output.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.title?.let { add(it) }
  this@getAllChildren.requirement?.let { add(it) }
  this@getAllChildren.relatedData?.let { add(it) }
}

internal fun RequestOrchestration.Action.RelatedAction.getProperty(name: String): Any? =
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

internal fun RequestOrchestration.Action.RelatedAction.hasProperty(name: String): Boolean =
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

internal fun RequestOrchestration.Action.RelatedAction.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.targetId)
  add(this@getAllChildren.relationship)
  this@getAllChildren.endRelationship?.let { add(it) }
  this@getAllChildren.offset?.let { add(it) }
}

internal fun RequestOrchestration.Action.Participant.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "type" -> this.type
    "typeCanonical" -> this.typeCanonical
    "typeReference" -> this.typeReference
    "role" -> this.role
    "function" -> this.function
    "actor" -> this.actor
    else -> error("$name is not a valid property name")
  }

internal fun RequestOrchestration.Action.Participant.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "type" -> true
    "typeCanonical" -> true
    "typeReference" -> true
    "role" -> true
    "function" -> true
    "actor" -> true
    else -> false
  }

internal fun RequestOrchestration.Action.Participant.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.type?.let { add(it) }
  this@getAllChildren.typeCanonical?.let { add(it) }
  this@getAllChildren.typeReference?.let { add(it) }
  this@getAllChildren.role?.let { add(it) }
  this@getAllChildren.function?.let { add(it) }
  this@getAllChildren.actor?.let { add(it) }
}

internal fun RequestOrchestration.Action.DynamicValue.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "path" -> this.path
    "expression" -> this.expression
    else -> error("$name is not a valid property name")
  }

internal fun RequestOrchestration.Action.DynamicValue.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "path" -> true
    "expression" -> true
    else -> false
  }

internal fun RequestOrchestration.Action.DynamicValue.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.path?.let { add(it) }
  this@getAllChildren.expression?.let { add(it) }
}
