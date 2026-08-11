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

import dev.ohs.fhir.model.r4.DocumentReference
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun DocumentReference.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "meta" -> this.meta
    "implicitRules" -> this.implicitRules
    "language" -> this.language
    "text" -> this.text
    "contained" -> this.contained
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "masterIdentifier" -> this.masterIdentifier
    "identifier" -> this.identifier
    "status" -> this.status
    "docStatus" -> this.docStatus
    "type" -> this.type
    "category" -> this.category
    "subject" -> this.subject
    "date" -> this.date
    "author" -> this.author
    "authenticator" -> this.authenticator
    "custodian" -> this.custodian
    "relatesTo" -> this.relatesTo
    "description" -> this.description
    "securityLabel" -> this.securityLabel
    "content" -> this.content
    "context" -> this.context
    else -> error("$name is not a valid property name")
  }

internal fun DocumentReference.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "meta" -> true
    "implicitRules" -> true
    "language" -> true
    "text" -> true
    "contained" -> true
    "extension" -> true
    "modifierExtension" -> true
    "masterIdentifier" -> true
    "identifier" -> true
    "status" -> true
    "docStatus" -> true
    "type" -> true
    "category" -> true
    "subject" -> true
    "date" -> true
    "author" -> true
    "authenticator" -> true
    "custodian" -> true
    "relatesTo" -> true
    "description" -> true
    "securityLabel" -> true
    "content" -> true
    "context" -> true
    else -> false
  }

internal fun DocumentReference.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.meta?.let { add(it) }
  this@getAllChildren.implicitRules?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.contained)
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.masterIdentifier?.let { add(it) }
  addAll(this@getAllChildren.identifier)
  add(this@getAllChildren.status)
  this@getAllChildren.docStatus?.let { add(it) }
  this@getAllChildren.type?.let { add(it) }
  addAll(this@getAllChildren.category)
  this@getAllChildren.subject?.let { add(it) }
  this@getAllChildren.date?.let { add(it) }
  addAll(this@getAllChildren.author)
  this@getAllChildren.authenticator?.let { add(it) }
  this@getAllChildren.custodian?.let { add(it) }
  addAll(this@getAllChildren.relatesTo)
  this@getAllChildren.description?.let { add(it) }
  addAll(this@getAllChildren.securityLabel)
  addAll(this@getAllChildren.content)
  this@getAllChildren.context?.let { add(it) }
}

internal fun DocumentReference.RelatesTo.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "code" -> this.code
    "target" -> this.target
    else -> error("$name is not a valid property name")
  }

internal fun DocumentReference.RelatesTo.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "code" -> true
    "target" -> true
    else -> false
  }

internal fun DocumentReference.RelatesTo.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.code)
  add(this@getAllChildren.target)
}

internal fun DocumentReference.Content.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "attachment" -> this.attachment
    "format" -> this.format
    else -> error("$name is not a valid property name")
  }

internal fun DocumentReference.Content.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "attachment" -> true
    "format" -> true
    else -> false
  }

internal fun DocumentReference.Content.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.attachment)
  this@getAllChildren.format?.let { add(it) }
}

internal fun DocumentReference.Context.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "encounter" -> this.encounter
    "event" -> this.event
    "period" -> this.period
    "facilityType" -> this.facilityType
    "practiceSetting" -> this.practiceSetting
    "sourcePatientInfo" -> this.sourcePatientInfo
    "related" -> this.related
    else -> error("$name is not a valid property name")
  }

internal fun DocumentReference.Context.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "encounter" -> true
    "event" -> true
    "period" -> true
    "facilityType" -> true
    "practiceSetting" -> true
    "sourcePatientInfo" -> true
    "related" -> true
    else -> false
  }

internal fun DocumentReference.Context.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.encounter)
  addAll(this@getAllChildren.event)
  this@getAllChildren.period?.let { add(it) }
  this@getAllChildren.facilityType?.let { add(it) }
  this@getAllChildren.practiceSetting?.let { add(it) }
  this@getAllChildren.sourcePatientInfo?.let { add(it) }
  addAll(this@getAllChildren.related)
}
