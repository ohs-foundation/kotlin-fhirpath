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

import dev.ohs.fhir.model.r5.Organization
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun Organization.getProperty(name: String): Any? =
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
    "active" -> this.active
    "type" -> this.type
    "name" -> this.name
    "alias" -> this.alias
    "description" -> this.description
    "contact" -> this.contact
    "partOf" -> this.partOf
    "endpoint" -> this.endpoint
    "qualification" -> this.qualification
    else -> error("$name is not a valid property name")
  }

internal fun Organization.hasProperty(name: String): Boolean =
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
    "active" -> true
    "type" -> true
    "name" -> true
    "alias" -> true
    "description" -> true
    "contact" -> true
    "partOf" -> true
    "endpoint" -> true
    "qualification" -> true
    else -> false
  }

internal fun Organization.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.meta?.let { add(it) }
  this@getAllChildren.implicitRules?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.text?.let { add(it) }
  addAll(this@getAllChildren.contained)
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.identifier)
  this@getAllChildren.active?.let { add(it) }
  addAll(this@getAllChildren.type)
  this@getAllChildren.name?.let { add(it) }
  addAll(this@getAllChildren.alias)
  this@getAllChildren.description?.let { add(it) }
  addAll(this@getAllChildren.contact)
  this@getAllChildren.partOf?.let { add(it) }
  addAll(this@getAllChildren.endpoint)
  addAll(this@getAllChildren.qualification)
}

internal fun Organization.Qualification.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "identifier" -> this.identifier
    "code" -> this.code
    "period" -> this.period
    "issuer" -> this.issuer
    else -> error("$name is not a valid property name")
  }

internal fun Organization.Qualification.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "identifier" -> true
    "code" -> true
    "period" -> true
    "issuer" -> true
    else -> false
  }

internal fun Organization.Qualification.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.identifier)
  add(this@getAllChildren.code)
  this@getAllChildren.period?.let { add(it) }
  this@getAllChildren.issuer?.let { add(it) }
}
