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

import dev.ohs.fhir.model.r5.RegulatedAuthorization
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun RegulatedAuthorization.getProperty(name: String): Any? =
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
    "subject" -> this.subject
    "type" -> this.type
    "description" -> this.description
    "region" -> this.region
    "status" -> this.status
    "statusDate" -> this.statusDate
    "validityPeriod" -> this.validityPeriod
    "indication" -> this.indication
    "intendedUse" -> this.intendedUse
    "basis" -> this.basis
    "holder" -> this.holder
    "regulator" -> this.regulator
    "attachedDocument" -> this.attachedDocument
    "case" -> this.case
    else -> error("$name is not a valid property name")
  }

internal fun RegulatedAuthorization.hasProperty(name: String): Boolean =
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
    "subject" -> true
    "type" -> true
    "description" -> true
    "region" -> true
    "status" -> true
    "statusDate" -> true
    "validityPeriod" -> true
    "indication" -> true
    "intendedUse" -> true
    "basis" -> true
    "holder" -> true
    "regulator" -> true
    "attachedDocument" -> true
    "case" -> true
    else -> false
  }

internal fun RegulatedAuthorization.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.meta?.let { add(it) }
  this@getAllChildren.implicitRules?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.contained)
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.identifier)
  addAll(this@getAllChildren.subject)
  this@getAllChildren.type?.let { add(it) }
  this@getAllChildren.description?.let { add(it) }
  addAll(this@getAllChildren.region)
  this@getAllChildren.status?.let { add(it) }
  this@getAllChildren.statusDate?.let { add(it) }
  this@getAllChildren.validityPeriod?.let { add(it) }
  addAll(this@getAllChildren.indication)
  this@getAllChildren.intendedUse?.let { add(it) }
  addAll(this@getAllChildren.basis)
  this@getAllChildren.holder?.let { add(it) }
  this@getAllChildren.regulator?.let { add(it) }
  addAll(this@getAllChildren.attachedDocument)
  this@getAllChildren.case?.let { add(it) }
}

internal fun RegulatedAuthorization.Case.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "identifier" -> this.identifier
    "type" -> this.type
    "status" -> this.status
    "date" -> this.date
    "application" -> this.application
    else -> error("$name is not a valid property name")
  }

internal fun RegulatedAuthorization.Case.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "identifier" -> true
    "type" -> true
    "status" -> true
    "date" -> true
    "application" -> true
    else -> false
  }

internal fun RegulatedAuthorization.Case.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.identifier?.let { add(it) }
  this@getAllChildren.type?.let { add(it) }
  this@getAllChildren.status?.let { add(it) }
  this@getAllChildren.date?.let { add(it) }
  addAll(this@getAllChildren.application)
}
