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

import dev.ohs.fhir.model.r5.Attachment
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

internal fun Attachment.getProperty(name: String): Any? =
  when (name) {
    "id" -> this.id
    "extension" -> this.extension
    "contentType" -> this.contentType
    "language" -> this.language
    "data" -> this.`data`
    "url" -> this.url
    "size" -> this.size
    "hash" -> this.hash
    "title" -> this.title
    "creation" -> this.creation
    "height" -> this.height
    "width" -> this.width
    "frames" -> this.frames
    "duration" -> this.duration
    "pages" -> this.pages
    else -> error("$name is not a valid property name")
  }

internal fun Attachment.hasProperty(name: String): Boolean =
  when (name) {
    "id" -> true
    "extension" -> true
    "contentType" -> true
    "language" -> true
    "data" -> true
    "url" -> true
    "size" -> true
    "hash" -> true
    "title" -> true
    "creation" -> true
    "height" -> true
    "width" -> true
    "frames" -> true
    "duration" -> true
    "pages" -> true
    else -> false
  }

internal fun Attachment.getAllChildren(): List<Any> = buildList {
  this@getAllChildren.id?.let { add(it) }
  addAll(this@getAllChildren.extension)
  this@getAllChildren.contentType?.let { add(it) }
  this@getAllChildren.language?.let { add(it) }
  this@getAllChildren.`data`?.let { add(it) }
  this@getAllChildren.url?.let { add(it) }
  this@getAllChildren.size?.let { add(it) }
  this@getAllChildren.hash?.let { add(it) }
  this@getAllChildren.title?.let { add(it) }
  this@getAllChildren.creation?.let { add(it) }
  this@getAllChildren.height?.let { add(it) }
  this@getAllChildren.width?.let { add(it) }
  this@getAllChildren.frames?.let { add(it) }
  this@getAllChildren.duration?.let { add(it) }
  this@getAllChildren.pages?.let { add(it) }
}
