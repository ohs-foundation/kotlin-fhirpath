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

import dev.ohs.fhir.model.r4b.Bundle
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun Bundle.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "meta" -> this.meta
    "implicitRules" -> this.implicitRules
    "language" -> this.language
    "identifier" -> this.identifier
    "type" -> this.type
    "timestamp" -> this.timestamp
    "total" -> this.total
    "link" -> this.link
    "entry" -> this.entry
    "signature" -> this.signature
    else -> error("$name is not a valid property name")
  }

internal fun Bundle.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "meta" -> true
    "implicitRules" -> true
    "language" -> true
    "identifier" -> true
    "type" -> true
    "timestamp" -> true
    "total" -> true
    "link" -> true
    "entry" -> true
    "signature" -> true
    else -> false
  }

internal fun Bundle.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  this@getAllChildren.meta?.let { add(it) }
  this@getAllChildren.implicitRules?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.identifier?.let { add(it) }
  add(this@getAllChildren.type)
  this@getAllChildren.timestamp?.let { add(it) }
  this@getAllChildren.total?.let { add(it) }
  addAll(this@getAllChildren.link)
  addAll(this@getAllChildren.entry)
  this@getAllChildren.signature?.let { add(it) }
}

internal fun Bundle.Link.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "relation" -> this.relation
    "url" -> this.url
    else -> error("$name is not a valid property name")
  }

internal fun Bundle.Link.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "relation" -> true
    "url" -> true
    else -> false
  }

internal fun Bundle.Link.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.relation)
  add(this@getAllChildren.url)
}

internal fun Bundle.Entry.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "link" -> this.link
    "fullUrl" -> this.fullUrl
    "resource" -> this.resource
    "search" -> this.search
    "request" -> this.request
    "response" -> this.response
    else -> error("$name is not a valid property name")
  }

internal fun Bundle.Entry.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "link" -> true
    "fullUrl" -> true
    "resource" -> true
    "search" -> true
    "request" -> true
    "response" -> true
    else -> false
  }

internal fun Bundle.Entry.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  addAll(this@getAllChildren.link)
  this@getAllChildren.fullUrl?.let { add(it) }
  this@getAllChildren.resource?.let { add(it) }
  this@getAllChildren.search?.let { add(it) }
  this@getAllChildren.request?.let { add(it) }
  this@getAllChildren.response?.let { add(it) }
}

internal fun Bundle.Entry.Search.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "mode" -> this.mode
    "score" -> this.score
    else -> error("$name is not a valid property name")
  }

internal fun Bundle.Entry.Search.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "mode" -> true
    "score" -> true
    else -> false
  }

internal fun Bundle.Entry.Search.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  this@getAllChildren.mode?.let { add(it) }
  this@getAllChildren.score?.let { add(it) }
}

internal fun Bundle.Entry.Request.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "method" -> this.method
    "url" -> this.url
    "ifNoneMatch" -> this.ifNoneMatch
    "ifModifiedSince" -> this.ifModifiedSince
    "ifMatch" -> this.ifMatch
    "ifNoneExist" -> this.ifNoneExist
    else -> error("$name is not a valid property name")
  }

internal fun Bundle.Entry.Request.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "method" -> true
    "url" -> true
    "ifNoneMatch" -> true
    "ifModifiedSince" -> true
    "ifMatch" -> true
    "ifNoneExist" -> true
    else -> false
  }

internal fun Bundle.Entry.Request.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.method)
  add(this@getAllChildren.url)
  this@getAllChildren.ifNoneMatch?.let { add(it) }
  this@getAllChildren.ifModifiedSince?.let { add(it) }
  this@getAllChildren.ifMatch?.let { add(it) }
  this@getAllChildren.ifNoneExist?.let { add(it) }
}

internal fun Bundle.Entry.Response.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "modifierExtension" -> this.modifierExtension
    "status" -> this.status
    "location" -> this.location
    "etag" -> this.etag
    "lastModified" -> this.lastModified
    "outcome" -> this.outcome
    else -> error("$name is not a valid property name")
  }

internal fun Bundle.Entry.Response.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "modifierExtension" -> true
    "status" -> true
    "location" -> true
    "etag" -> true
    "lastModified" -> true
    "outcome" -> true
    else -> false
  }

internal fun Bundle.Entry.Response.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  addAll(this@getAllChildren.modifierExtension)
  add(this@getAllChildren.status)
  this@getAllChildren.location?.let { add(it) }
  this@getAllChildren.etag?.let { add(it) }
  this@getAllChildren.lastModified?.let { add(it) }
  this@getAllChildren.outcome?.let { add(it) }
}
