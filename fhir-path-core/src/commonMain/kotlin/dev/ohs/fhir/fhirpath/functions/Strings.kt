/*
 * Copyright 2025-2026 Open Health Stack Foundation
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

package dev.ohs.fhir.fhirpath.functions

import dev.ohs.fhir.fhirpath.types.FhirPathTypeResolver
import kotlin.math.min

/**
 * Makes the dot match all characters, including line breaks.
 *
 * See https://www.regular-expressions.info/modifiers.html.
 */
const val SINGLE_LINE_MODE_REGEX_PREFIX = "(?s)"

/** See [specification](https://hl7.org/fhirpath/N1/#indexofsubstring-string-integer). */
internal fun Collection<Any>.indexOf(
  params: List<Any>,
  fhirPathTypeResolver: FhirPathTypeResolver,
): Collection<Any> {
  check(size <= 1) { "indexOf() cannot be called on a collection with more than 1 item" }
  val input = singleOrNull()?.unwrapString(fhirPathTypeResolver) ?: return emptyList()
  val substring = params.singleOrNull()?.unwrapString(fhirPathTypeResolver) ?: return emptyList()
  return listOf(input.indexOf(substring))
}

/**
 * See [specification](https://hl7.org/fhirpath/N1/#substringstart-integer-length-integer-string).
 */
internal fun Collection<Any>.substring(
  params: List<Any>,
  fhirPathTypeResolver: FhirPathTypeResolver,
): Collection<Any> {
  check(size <= 1) { "substring() cannot be called on a collection with more than 1 item" }
  val input = singleOrNull()?.unwrapString(fhirPathTypeResolver) ?: return emptyList()
  val start = params.firstOrNull() as? Int ?: return emptyList()
  val length = params.getOrNull(1)?.let { it as Int }

  if (start >= input.length || start < 0) {
    return emptyList()
  }

  if (length != null) {
    val endIndex = min(start + length, input.length)
    return listOf(input.substring(start, endIndex))
  }

  return listOf(input.substring(start))
}

/** See [specification](https://hl7.org/fhirpath/N1/#startsprefix-string-boolean). */
internal fun Collection<Any>.startsWith(
  params: List<Any>,
  fhirPathTypeResolver: FhirPathTypeResolver,
): Collection<Any> {
  check(size <= 1) { "startsWith() cannot be called on a collection with more than 1 item" }
  val input = singleOrNull()?.unwrapString(fhirPathTypeResolver) ?: return emptyList()
  val prefix = params.single().unwrapString(fhirPathTypeResolver)!!
  return listOf(input.startsWith(prefix))
}

/** See [specification](https://hl7.org/fhirpath/N1/#endssuffix-string-boolean). */
internal fun Collection<Any>.endsWith(
  params: List<Any>,
  fhirPathTypeResolver: FhirPathTypeResolver,
): Collection<Any> {
  check(size <= 1) { "endsWith() cannot be called on a collection with more than 1 item" }
  val input = singleOrNull()?.unwrapString(fhirPathTypeResolver) ?: return emptyList()
  val suffix = params.single().unwrapString(fhirPathTypeResolver)!!
  return listOf(input.endsWith(suffix))
}

/** See [specification](https://hl7.org/fhirpath/N1/#containssubstring-string-boolean). */
internal fun Collection<Any>.strContains(
  params: List<Any>,
  fhirPathTypeResolver: FhirPathTypeResolver,
): Collection<Any> {
  check(size <= 1) { "contains() cannot be called on a collection with more than 1 item" }
  val input = singleOrNull()?.unwrapString(fhirPathTypeResolver) ?: return emptyList()
  val substring = params.single().unwrapString(fhirPathTypeResolver)!!
  return listOf(input.contains(substring))
}

/** See [specification](https://hl7.org/fhirpath/N1/#upper-string). */
internal fun Collection<Any>.upper(fhirPathTypeResolver: FhirPathTypeResolver): Collection<Any> {
  check(size <= 1) { "upper() cannot be called on a collection with more than 1 item" }
  val input = singleOrNull()?.unwrapString(fhirPathTypeResolver) ?: return emptyList()
  return listOf(input.uppercase())
}

/** See [specification](https://hl7.org/fhirpath/N1/#lower-string). */
internal fun Collection<Any>.lower(fhirPathTypeResolver: FhirPathTypeResolver): Collection<Any> {
  check(size <= 1) { "lower() cannot be called on a collection with more than 1 item" }
  val input = singleOrNull()?.unwrapString(fhirPathTypeResolver) ?: return emptyList()
  return listOf(input.lowercase())
}

/**
 * See
 * [specification](https://hl7.org/fhirpath/N1/#replacepattern-string-substitution-string-string).
 */
internal fun Collection<Any>.replace(
  params: List<Any>,
  fhirPathTypeResolver: FhirPathTypeResolver,
): Collection<Any> {
  check(size <= 1) { "replace() cannot be called on a collection with more than 1 item" }
  val input = singleOrNull()?.unwrapString(fhirPathTypeResolver) ?: return emptyList()
  val pattern = params.getOrNull(0)?.unwrapString(fhirPathTypeResolver) ?: return emptyList()
  val substitution = params.getOrNull(1)?.unwrapString(fhirPathTypeResolver) ?: return emptyList()
  return listOf(input.replace(pattern, substitution))
}

/** See [specification](https://hl7.org/fhirpath/N1/#matchesregex-string-boolean). */
internal fun Collection<Any>.matches(
  params: List<Any>,
  fhirPathTypeResolver: FhirPathTypeResolver,
): Collection<Any> {
  check(size <= 1) { "matches() cannot be called on a collection with more than 1 item" }
  val input = singleOrNull()?.unwrapString(fhirPathTypeResolver) ?: return emptyList()
  val regexText = params.singleOrNull()?.unwrapString(fhirPathTypeResolver) ?: return emptyList()
  return listOf(regexText.toSingleLineModeRegex().containsMatchIn(input))
}

/**
 * See [specification](https://build.fhir.org/ig/HL7/FHIRPath/#matchesfullregex--string--boolean).
 */
internal fun Collection<Any>.matchesFull(
  params: List<Any>,
  fhirPathTypeResolver: FhirPathTypeResolver,
): Collection<Any> {
  check(size <= 1) { "matches() cannot be called on a collection with more than 1 item" }
  val input = singleOrNull()?.unwrapString(fhirPathTypeResolver) ?: return emptyList()
  val regex = params.singleOrNull()?.unwrapString(fhirPathTypeResolver) ?: return emptyList()
  return listOf(input.matches(regex.toSingleLineModeRegex()))
}

/**
 * See
 * [specification](https://hl7.org/fhirpath/N1/#replacematchesregex-string-substitution-string-string).
 */
internal fun Collection<Any>.replaceMatches(
  params: List<Any>,
  fhirPathTypeResolver: FhirPathTypeResolver,
): Collection<Any> {
  check(size <= 1) { "replaceMatches() cannot be called on a collection with more than 1 item" }
  val input = singleOrNull()?.unwrapString(fhirPathTypeResolver) ?: return emptyList()

  if (params.size < 2) {
    return emptyList()
  }
  val regex = params[0].unwrapString(fhirPathTypeResolver)!!
  val substitution = params[1].unwrapString(fhirPathTypeResolver)!!

  if (regex.isEmpty()) {
    return this
  }
  return listOf(input.replace(regex.toSingleLineModeRegex(), substitution))
}

/** See [specification](https://hl7.org/fhirpath/N1/#length-integer). */
internal fun Collection<Any>.length(fhirPathTypeResolver: FhirPathTypeResolver): Collection<Any> {
  check(size <= 1) { "length() cannot be called on a collection with more than 1 item" }
  val input = singleOrNull()?.unwrapString(fhirPathTypeResolver) ?: return emptyList()
  return listOf(input.length)
}

/** See [specification](https://hl7.org/fhirpath/N1/#tochars-collection). */
internal fun Collection<Any>.toChars(fhirPathTypeResolver: FhirPathTypeResolver): Collection<Any> {
  check(size <= 1) { "toChars() cannot be called on a collection with more than 1 item" }
  val input = singleOrNull()?.unwrapString(fhirPathTypeResolver) ?: return emptyList()
  return input.toCharArray().map { it.toString() }
}

// Standard for Trial Use (STU)

/**
 * Encodes the single string item in the input collection using the specified format. Supported
 * formats: `'base64'`, `'urlbase64'`, `'hex'`, and `'url'`.
 *
 * See [specification](https://build.fhir.org/ig/HL7/FHIRPath/#encodeformat--string--string).
 */
@OptIn(kotlin.io.encoding.ExperimentalEncodingApi::class)
internal fun Collection<Any>.encode(
  params: List<Any>,
  fhirPathTypeResolver: FhirPathTypeResolver,
): Collection<String> {
  check(size <= 1) { "encode() cannot be called on a collection with more than 1 item" }
  val input = singleOrNull()?.unwrapString(fhirPathTypeResolver) ?: return emptyList()
  val format = params.firstOrNull()?.unwrapString(fhirPathTypeResolver) ?: return emptyList()

  val result =
    try {
      when (format.lowercase()) {
        "base64" -> kotlin.io.encoding.Base64.encode(input.encodeToByteArray())
        "urlbase64" -> kotlin.io.encoding.Base64.UrlSafe.encode(input.encodeToByteArray())
        "hex" -> hexEncode(input)
        "url" -> urlEncode(input)
        else -> return emptyList()
      }
    } catch (_: Exception) {
      return emptyList()
    }

  return listOf(result)
}

/**
 * Decodes the single string item in the input collection encoded in the specified format. Supported
 * formats: `'base64'`, `'urlbase64'`, `'hex'`, and `'url'`.
 *
 * See [specification](https://build.fhir.org/ig/HL7/FHIRPath/#decodeformat--string--string).
 */
@OptIn(kotlin.io.encoding.ExperimentalEncodingApi::class)
internal fun Collection<Any>.decode(
  params: List<Any>,
  fhirPathTypeResolver: FhirPathTypeResolver,
): Collection<String> {
  check(size <= 1) { "decode() cannot be called on a collection with more than 1 item" }
  val input = singleOrNull()?.unwrapString(fhirPathTypeResolver) ?: return emptyList()
  val format = params.firstOrNull()?.unwrapString(fhirPathTypeResolver) ?: return emptyList()

  val result =
    try {
      when (format.lowercase()) {
        "base64" -> kotlin.io.encoding.Base64.decode(input).decodeToString()
        "urlbase64" -> kotlin.io.encoding.Base64.UrlSafe.decode(input).decodeToString()
        "hex" -> hexDecode(input)
        "url" -> urlDecode(input)
        else -> return emptyList()
      }
    } catch (_: Exception) {
      return emptyList()
    }

  return listOf(result)
}

/** See [specification](https://build.fhir.org/ig/HL7/FHIRPath/#trim--string). */
internal fun Collection<Any>.trim(fhirPathTypeResolver: FhirPathTypeResolver): Collection<Any> {
  check(size <= 1) { "trim() cannot be called on a collection with more than 1 item" }
  val input = singleOrNull()?.unwrapString(fhirPathTypeResolver) ?: return emptyList()
  return listOf(input.trim())
}

/**
 * See [specification](https://build.fhir.org/ig/HL7/FHIRPath/#splitseparator-string--collection).
 */
internal fun Collection<Any>.split(
  params: List<Any>,
  fhirPathTypeResolver: FhirPathTypeResolver,
): Collection<Any> {
  check(size <= 1) { "split() cannot be called on a collection with more than 1 item" }
  val input = singleOrNull()?.unwrapString(fhirPathTypeResolver) ?: return emptyList()
  return input.split(
    params.singleOrNull()?.unwrapString(fhirPathTypeResolver) ?: return emptyList()
  )
}

/** See [specification](https://build.fhir.org/ig/HL7/FHIRPath/#joinseparator-string--string). */
internal fun Collection<Any>.join(
  params: List<Any>,
  fhirPathTypeResolver: FhirPathTypeResolver,
): Collection<Any> {
  if (isEmpty()) return emptyList()
  return listOf(
    joinToString(params.singleOrNull()?.unwrapString(fhirPathTypeResolver) ?: "") {
      it.unwrapString(fhirPathTypeResolver)!!
    }
  )
}

private fun Any.unwrapString(fhirPathTypeResolver: FhirPathTypeResolver): String? {
  if (this is String) {
    return this
  }
  return fhirPathTypeResolver.convertToString(this)
}

private fun String.toSingleLineModeRegex(): Regex = "$SINGLE_LINE_MODE_REGEX_PREFIX$this".toRegex()

/** Converts a UTF-8 string to a lowercase hexadecimal representation (2 hex digits per byte). */
private fun hexEncode(input: String): String =
  input.encodeToByteArray().joinToString("") { byte ->
    // Mask signed Kotlin Byte to unsigned 0..255 integer, convert to base-16 string,
    // and left-pad with '0' to ensure every byte produces 2 hex digits.
    (byte.toInt() and 0xFF).toString(16).padStart(2, '0')
  }

/** Decodes a hexadecimal string (case-insensitive) back to a UTF-8 string. */
private fun hexDecode(hex: String): String {
  require(hex.length % 2 == 0) { "Hexadecimal string must have an even length" }
  val bytes = ByteArray(hex.length / 2) { i -> hex.substring(i * 2, i * 2 + 2).toInt(16).toByte() }
  return bytes.decodeToString()
}

/** Encodes non-unreserved characters in a UTF-8 string using URI percent-encoding (%XX). */
private fun urlEncode(input: String): String {
  val sb = StringBuilder()
  for (byte in input.encodeToByteArray()) {
    val unsignedByte = byte.toInt() and 0xFF
    val char = unsignedByte.toChar()
    if (isUnreservedUrlChar(char)) {
      sb.append(char)
    } else {
      sb.append('%')
      sb.append(unsignedByte.toString(16).uppercase().padStart(2, '0'))
    }
  }
  return sb.toString()
}

/** Decodes URI percent-encoded (%XX) sequences back to a UTF-8 string. */
private fun urlDecode(input: String): String {
  val bytes = mutableListOf<Byte>()
  var i = 0
  while (i < input.length) {
    when (val c = input[i]) {
      '%' -> {
        require(i + 2 < input.length)
        val hexByte = input.substring(i + 1, i + 3).toInt(16).toByte()
        bytes.add(hexByte)
        i += 3
      }
      '+' -> {
        bytes.add(' '.code.toByte())
        i++
      }
      else -> {
        bytes.add(c.code.toByte())
        i++
      }
    }
  }
  return bytes.toByteArray().decodeToString()
}

/**
 * Checks whether a character is an unreserved URI character per RFC 3986 Section 2.3
 * (alphanumerics, hyphen, underscore, period, and tilde). Unreserved characters do not require
 * percent-encoding.
 */
private fun isUnreservedUrlChar(ch: Char): Boolean =
  ch in 'a'..'z' ||
    ch in 'A'..'Z' ||
    ch in '0'..'9' ||
    ch == '-' ||
    ch == '_' ||
    ch == '.' ||
    ch == '~'
