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

import dev.ohs.fhir.model.r5.DocumentReference
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
    "identifier" -> this.identifier
    "version" -> this.version
    "basedOn" -> this.basedOn
    "status" -> this.status
    "docStatus" -> this.docStatus
    "modality" -> this.modality
    "type" -> this.type
    "category" -> this.category
    "subject" -> this.subject
    "context" -> this.context
    "event" -> this.event
    "bodySite" -> this.bodySite
    "facilityType" -> this.facilityType
    "practiceSetting" -> this.practiceSetting
    "period" -> this.period
    "date" -> this.date
    "author" -> this.author
    "attester" -> this.attester
    "custodian" -> this.custodian
    "relatesTo" -> this.relatesTo
    "description" -> this.description
    "securityLabel" -> this.securityLabel
    "content" -> this.content
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
    "identifier" -> true
    "version" -> true
    "basedOn" -> true
    "status" -> true
    "docStatus" -> true
    "modality" -> true
    "type" -> true
    "category" -> true
    "subject" -> true
    "context" -> true
    "event" -> true
    "bodySite" -> true
    "facilityType" -> true
    "practiceSetting" -> true
    "period" -> true
    "date" -> true
    "author" -> true
    "attester" -> true
    "custodian" -> true
    "relatesTo" -> true
    "description" -> true
    "securityLabel" -> true
    "content" -> true
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
  addAll(this@getAllChildren.identifier)
  this@getAllChildren.version?.let { add(it) }
  addAll(this@getAllChildren.basedOn)
  add(this@getAllChildren.status)
  this@getAllChildren.docStatus?.let { add(it) }
  addAll(this@getAllChildren.modality)
  this@getAllChildren.type?.let { add(it) }
  addAll(this@getAllChildren.category)
  this@getAllChildren.subject?.let { add(it) }
  addAll(this@getAllChildren.context)
  addAll(this@getAllChildren.event)
  addAll(this@getAllChildren.bodySite)
  this@getAllChildren.facilityType?.let { add(it) }
  this@getAllChildren.practiceSetting?.let { add(it) }
  this@getAllChildren.period?.let { add(it) }
  this@getAllChildren.date?.let { add(it) }
  addAll(this@getAllChildren.author)
  addAll(this@getAllChildren.attester)
  this@getAllChildren.custodian?.let { add(it) }
  addAll(this@getAllChildren.relatesTo)
  this@getAllChildren.description?.let { add(it) }
  addAll(this@getAllChildren.securityLabel)
  addAll(this@getAllChildren.content)
}

internal fun DocumentReference.Attester.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "mode" -> this.mode
    "time" -> this.time
    "party" -> this.party
    else -> error("$name is not a valid property name")
  }

internal fun DocumentReference.Attester.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "mode" -> true
    "time" -> true
    "party" -> true
    else -> false
  }

internal fun DocumentReference.Attester.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.mode)
  this@getAllChildren.time?.let { add(it) }
  this@getAllChildren.party?.let { add(it) }
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
    "profile" -> this.profile
    else -> error("$name is not a valid property name")
  }

internal fun DocumentReference.Content.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "attachment" -> true
    "profile" -> true
    else -> false
  }

internal fun DocumentReference.Content.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.attachment)
  addAll(this@getAllChildren.profile)
}

internal fun DocumentReference.Content.Profile.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "value" -> this.`value`
    else -> error("$name is not a valid property name")
  }

internal fun DocumentReference.Content.Profile.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "value" -> true
    else -> false
  }

internal fun DocumentReference.Content.Profile.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.`value`)
}
