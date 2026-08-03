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

import dev.ohs.fhir.model.r4b.SubscriptionTopic
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun SubscriptionTopic.getProperty(name: String): Any? =
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
    "title" -> this.title
    "derivedFrom" -> this.derivedFrom
    "status" -> this.status
    "experimental" -> this.experimental
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
    "resourceTrigger" -> this.resourceTrigger
    "eventTrigger" -> this.eventTrigger
    "canFilterBy" -> this.canFilterBy
    "notificationShape" -> this.notificationShape
    else -> error("$name is not a valid property name")
  }

internal fun SubscriptionTopic.hasProperty(name: String): Boolean =
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
    "title" -> true
    "derivedFrom" -> true
    "status" -> true
    "experimental" -> true
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
    "resourceTrigger" -> true
    "eventTrigger" -> true
    "canFilterBy" -> true
    "notificationShape" -> true
    else -> false
  }

internal fun SubscriptionTopic.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.meta?.let { add(it) }
  this@getAllChildren.implicitRules?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.contained)
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.url)
  addAll(this@getAllChildren.identifier)
  this@getAllChildren.version?.let { add(it) }
  this@getAllChildren.title?.let { add(it) }
  addAll(this@getAllChildren.derivedFrom)
  add(this@getAllChildren.status)
  this@getAllChildren.experimental?.let { add(it) }
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
  addAll(this@getAllChildren.resourceTrigger)
  addAll(this@getAllChildren.eventTrigger)
  addAll(this@getAllChildren.canFilterBy)
  addAll(this@getAllChildren.notificationShape)
}

internal fun SubscriptionTopic.ResourceTrigger.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "description" -> this.description
    "resource" -> this.resource
    "supportedInteraction" -> this.supportedInteraction
    "queryCriteria" -> this.queryCriteria
    "fhirPathCriteria" -> this.fhirPathCriteria
    else -> error("$name is not a valid property name")
  }

internal fun SubscriptionTopic.ResourceTrigger.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "description" -> true
    "resource" -> true
    "supportedInteraction" -> true
    "queryCriteria" -> true
    "fhirPathCriteria" -> true
    else -> false
  }

internal fun SubscriptionTopic.ResourceTrigger.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.description?.let { add(it) }
  add(this@getAllChildren.resource)
  addAll(this@getAllChildren.supportedInteraction)
  this@getAllChildren.queryCriteria?.let { add(it) }
  this@getAllChildren.fhirPathCriteria?.let { add(it) }
}

internal fun SubscriptionTopic.ResourceTrigger.QueryCriteria.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "previous" -> this.previous
    "resultForCreate" -> this.resultForCreate
    "current" -> this.current
    "resultForDelete" -> this.resultForDelete
    "requireBoth" -> this.requireBoth
    else -> error("$name is not a valid property name")
  }

internal fun SubscriptionTopic.ResourceTrigger.QueryCriteria.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "previous" -> true
    "resultForCreate" -> true
    "current" -> true
    "resultForDelete" -> true
    "requireBoth" -> true
    else -> false
  }

internal fun SubscriptionTopic.ResourceTrigger.QueryCriteria.getAllChildren(): List<Any> =
  buildList {
    this@getAllChildren.id?.let { add(it) }
    addAll(this@getAllChildren.extension)
    addAll(this@getAllChildren.modifierExtension)
    this@getAllChildren.previous?.let { add(it) }
    this@getAllChildren.resultForCreate?.let { add(it) }
    this@getAllChildren.current?.let { add(it) }
    this@getAllChildren.resultForDelete?.let { add(it) }
    this@getAllChildren.requireBoth?.let { add(it) }
  }

internal fun SubscriptionTopic.EventTrigger.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "description" -> this.description
    "event" -> this.event
    "resource" -> this.resource
    else -> error("$name is not a valid property name")
  }

internal fun SubscriptionTopic.EventTrigger.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "description" -> true
    "event" -> true
    "resource" -> true
    else -> false
  }

internal fun SubscriptionTopic.EventTrigger.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.description?.let { add(it) }
  add(this@getAllChildren.event)
  add(this@getAllChildren.resource)
}

internal fun SubscriptionTopic.CanFilterBy.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "description" -> this.description
    "resource" -> this.resource
    "filterParameter" -> this.filterParameter
    "filterDefinition" -> this.filterDefinition
    "modifier" -> this.modifier
    else -> error("$name is not a valid property name")
  }

internal fun SubscriptionTopic.CanFilterBy.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "description" -> true
    "resource" -> true
    "filterParameter" -> true
    "filterDefinition" -> true
    "modifier" -> true
    else -> false
  }

internal fun SubscriptionTopic.CanFilterBy.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.description?.let { add(it) }
  this@getAllChildren.resource?.let { add(it) }
  add(this@getAllChildren.filterParameter)
  this@getAllChildren.filterDefinition?.let { add(it) }
  addAll(this@getAllChildren.modifier)
}

internal fun SubscriptionTopic.NotificationShape.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "resource" -> this.resource
    "include" -> this.include
    "revInclude" -> this.revInclude
    else -> error("$name is not a valid property name")
  }

internal fun SubscriptionTopic.NotificationShape.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "resource" -> true
    "include" -> true
    "revInclude" -> true
    else -> false
  }

internal fun SubscriptionTopic.NotificationShape.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.resource)
  addAll(this@getAllChildren.include)
  addAll(this@getAllChildren.revInclude)
}
