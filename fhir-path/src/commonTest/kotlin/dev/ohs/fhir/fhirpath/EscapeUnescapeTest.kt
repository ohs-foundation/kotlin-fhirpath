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

package dev.ohs.fhir.fhirpath

import kotlin.test.Test
import kotlin.test.assertEquals

private val fhirPathEngine = FhirPathEngine.forR4()

class EscapeUnescapeTest {

  @Test
  fun `escape html`() {
    val escaped = fhirPathEngine.evaluateExpression("'a & b < c'.escape('html')", null)
    assertEquals(listOf("a &amp; b &lt; c"), escaped.toList())
  }

  @Test
  fun `escape non-ascii characters in html`() {
    // A surrogate pair becomes a single entity for the full code point, not one per half.
    val escaped = fhirPathEngine.evaluateExpression("'café 😀'.escape('html')", null)
    assertEquals(listOf("caf&#233; &#128512;"), escaped.toList())
  }

  @Test
  fun `unescape named html entities`() {
    val unescaped = fhirPathEngine.evaluateExpression("'a &amp; b &lt; c'.unescape('html')", null)
    assertEquals(listOf("a & b < c"), unescaped.toList())
  }

  @Test
  fun `unescape numeric html entities`() {
    val unescaped = fhirPathEngine.evaluateExpression("'&#65;&#x42;'.unescape('html')", null)
    assertEquals(listOf("AB"), unescaped.toList())
  }

  @Test
  fun `unescape non-ascii characters in html`() {
    val unescaped =
      fhirPathEngine.evaluateExpression("'caf&#233; &#128512;'.unescape('html')", null)
    assertEquals(listOf("café 😀"), unescaped.toList())
  }

  @Test
  fun `escape json`() {
    val escaped = fhirPathEngine.evaluateExpression("'say \"hi\"'.escape('json')", null)
    assertEquals(listOf("say \\\"hi\\\""), escaped.toList())
  }

  @Test
  fun `unescape json`() {
    val unescaped = fhirPathEngine.evaluateExpression("'a\\\\u0041'.unescape('json')", null)
    assertEquals(listOf("aA"), unescaped.toList())
  }

  @Test
  fun `escape control characters in json`() {
    // The input contains a real backspace and form feed, written with FHIRPath's `\u0008` and
    // `\u000C` string escapes. JSON has two character shorthands for these, so escape('json')
    // produces `\b` and `\f` instead of `\u0008` and `\u000C`.
    val escaped = fhirPathEngine.evaluateExpression("'a\\u0008b\\u000Cf'.escape('json')", null)
    assertEquals(listOf("a\\bb\\ff"), escaped.toList())
  }

  @Test
  fun `escape single quote and backtick in json`() {
    // JSON only allows `" \ / b f n r t u` after a backslash
    // (https://datatracker.ietf.org/doc/html/rfc8259#section-7), so `'` and the backtick must
    // pass through unescaped to keep the output valid JSON.
    val escaped = fhirPathEngine.evaluateExpression("'a \\' b \\` c'.escape('json')", null)
    assertEquals(listOf("a ' b ` c"), escaped.toList())
  }

  @Test
  fun `unescape single quote and backtick in json`() {
    // The input string is `a\'b\`c`. `\'` and `\`` are not JSON escapes, but unescape('json')
    // keeps the character after an unrecognized backslash, so they decode to the plain characters.
    val unescaped = fhirPathEngine.evaluateExpression("'a\\\\\\'b\\\\`c'.unescape('json')", null)
    assertEquals(listOf("a'b`c"), unescaped.toList())
  }

  @Test
  fun `unescape control characters in json`() {
    // The input string is `a\bb\ff`; each backslash is doubled in the FHIRPath literal since
    // `\b` alone would be consumed by FHIRPath's own string escape handling before unescape()
    // runs. unescape('json') decodes `\b` and `\f` to the real control characters.
    val unescaped = fhirPathEngine.evaluateExpression("'a\\\\bb\\\\ff'.unescape('json')", null)
    assertEquals(listOf("a\bb\u000Cf"), unescaped.toList())
  }

  @Test
  fun `unescape surrogate pair in json`() {
    // A code point above 0xFFFF appears in JSON as two \uXXXX escapes, a surrogate pair.
    val unescaped = fhirPathEngine.evaluateExpression("'\\\\uD83D\\\\uDE00'.unescape('json')", null)
    assertEquals(listOf("\uD83D\uDE00"), unescaped.toList())
  }

  @Test
  fun `escape with extra arguments returns empty`() {
    // The target must be a single argument; extra arguments are rejected rather than ignored.
    assertEquals(
      emptyList(),
      fhirPathEngine.evaluateExpression("'test'.escape('html', 'json')", null).toList(),
    )
  }

  @Test
  fun `unescape with extra arguments returns empty`() {
    assertEquals(
      emptyList(),
      fhirPathEngine.evaluateExpression("'test'.unescape('html', 'json')", null).toList(),
    )
  }

  @Test
  fun `escape with unknown target returns empty`() {
    assertEquals(
      emptyList(),
      fhirPathEngine.evaluateExpression("'test'.escape('xml1')", null).toList(),
    )
  }

  @Test
  fun `unescape with unknown target returns empty`() {
    assertEquals(
      emptyList(),
      fhirPathEngine.evaluateExpression("'test'.unescape('xml1')", null).toList(),
    )
  }

  @Test
  fun `unescape with malformed escape in json returns empty`() {
    // The input string is `a\u12`, a unicode escape truncated at the end of the string.
    assertEquals(
      emptyList(),
      fhirPathEngine.evaluateExpression("'a\\\\u12'.unescape('json')", null).toList(),
    )
  }

  @Test
  fun `unescape with malformed entity in html returns empty`() {
    assertEquals(
      emptyList(),
      fhirPathEngine.evaluateExpression("'&#abc;'.unescape('html')", null).toList(),
    )
  }

  @Test
  fun `unescape with entity above the unicode range in html returns empty`() {
    // 1114112 is one past the last code point, 0x10FFFF.
    assertEquals(
      emptyList(),
      fhirPathEngine.evaluateExpression("'&#1114112;'.unescape('html')", null).toList(),
    )
  }

  @Test
  fun `unescape with surrogate entity in html returns empty`() {
    // 55296 is 0xD800, a surrogate: reserved for UTF-16 encoding, not a character on its own.
    assertEquals(
      emptyList(),
      fhirPathEngine.evaluateExpression("'&#55296;'.unescape('html')", null).toList(),
    )
  }

  @Test
  fun `escape with empty input returns empty`() {
    assertEquals(emptyList(), fhirPathEngine.evaluateExpression("{}.escape('html')", null).toList())
  }

  @Test
  fun `unescape with empty input returns empty`() {
    assertEquals(
      emptyList(),
      fhirPathEngine.evaluateExpression("{}.unescape('html')", null).toList(),
    )
  }
}
