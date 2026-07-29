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

class EncodeDecodeTest {

  @Test
  fun `encode and decode base64`() {
    val encoded = fhirPathEngine.evaluateExpression("'Hello World!'.encode('base64')", null)
    assertEquals(listOf("SGVsbG8gV29ybGQh"), encoded.toList())

    val decoded = fhirPathEngine.evaluateExpression("'SGVsbG8gV29ybGQh'.decode('base64')", null)
    assertEquals(listOf("Hello World!"), decoded.toList())
  }

  @Test
  fun `encode and decode urlbase64`() {
    val encoded = fhirPathEngine.evaluateExpression("'subjects?_d'.encode('urlbase64')", null)
    assertEquals(listOf("c3ViamVjdHM_X2Q="), encoded.toList())

    val decoded = fhirPathEngine.evaluateExpression("'c3ViamVjdHM_X2Q='.decode('urlbase64')", null)
    assertEquals(listOf("subjects?_d"), decoded.toList())
  }

  @Test
  fun `encode and decode hex`() {
    val encoded = fhirPathEngine.evaluateExpression("'Hello'.encode('hex')", null)
    assertEquals(listOf("48656c6c6f"), encoded.toList())

    val decoded = fhirPathEngine.evaluateExpression("'48656c6c6f'.decode('hex')", null)
    assertEquals(listOf("Hello"), decoded.toList())
  }

  @Test
  fun `encode and decode url`() {
    val encoded = fhirPathEngine.evaluateExpression("'Hello World!'.encode('url')", null)
    assertEquals(listOf("Hello%20World%21"), encoded.toList())

    val decoded = fhirPathEngine.evaluateExpression("'Hello%20World%21'.decode('url')", null)
    assertEquals(listOf("Hello World!"), decoded.toList())
  }

  @Test
  fun `encode and decode with unsupported format returns empty`() {
    val encoded = fhirPathEngine.evaluateExpression("'test'.encode('unknown')", null)
    assertEquals(emptyList(), encoded.toList())

    val decoded = fhirPathEngine.evaluateExpression("'test'.decode('unknown')", null)
    assertEquals(emptyList(), decoded.toList())
  }

  @Test
  fun `decode invalid payload returns empty`() {
    val decodedBase64 =
      fhirPathEngine.evaluateExpression("'!invalid_base64!'.decode('base64')", null)
    assertEquals(emptyList(), decodedBase64.toList())

    val decodedHex = fhirPathEngine.evaluateExpression("'invalid_hex'.decode('hex')", null)
    assertEquals(emptyList(), decodedHex.toList())
  }
}
