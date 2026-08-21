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

package dev.ohs.fhir.fhirpath

import com.ionspin.kotlin.bignum.decimal.BigDecimal
import dev.ohs.fhir.fhirpath.types.FhirPathDate
import dev.ohs.fhir.fhirpath.types.FhirPathDateTime
import dev.ohs.fhir.fhirpath.types.FhirPathQuantity
import dev.ohs.fhir.fhirpath.types.FhirPathTime
import io.kotest.common.ExperimentalKotest
import io.kotest.core.spec.style.FunSpec
import io.kotest.core.test.Enabled
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import nl.adaptivity.xmlutil.serialization.XML

internal class ConformanceSuiteConfig(
  val suiteFile: String,
  val inputDir: String,
  val engine: FhirPathEngine,
  val strictEngine: FhirPathEngine,
  val decodeResource: (String) -> Any,
  val fhirStringValue: (Any) -> String?,
  val fhirQuantityString: (Any) -> String?,
  val skippedGroups: Map<String, String>,
  val skippedCases: Map<String, String>,
)

@OptIn(ExperimentalKotest::class)
internal fun FunSpec.conformanceSuite(config: ConformanceSuiteConfig) {
  val inputMap: Map<String, Any> =
    listJsonFiles(config.inputDir)
      .flatMap { entry ->
        val resource =
          try {
            config.decodeResource(entry.value)
          } catch (e: Exception) {
            println("Cannot decode ${config.inputDir}/${entry.key}: ${e.message}")
            return@flatMap emptyList()
          }
        listOf(entry.key to resource, entry.key.replace(".json$".toRegex(), ".xml") to resource)
      }
      .toMap()
  val suiteXml = loadFile(config.suiteFile).replace(" xmlns=\"http://hl7.org/fhirpath/tests\"", "")
  val testSuite = XML.decodeFromString<Tests>(suiteXml)

  testSuite.groups.forEach { group ->
    context(group.name).config(
      enabledOrReasonIf = {
        config.skippedGroups[group.name]?.let { Enabled.disabled(it) } ?: Enabled.enabled
      }
    ) {
      group.tests.forEach { testCase ->
        test(testCase.name).config(
          enabledOrReasonIf = {
            config.skippedCases[testCase.name]?.let { Enabled.disabled(it) } ?: Enabled.enabled
          }
        ) {
          val engine =
            if (testCase.mode == "strict" || testCase.expression.mode == "strict") {
              config.strictEngine
            } else {
              config.engine
            }

          if (testCase.expression.invalid != null) {
            assertFailsWith<Exception> {
              engine.evaluateExpression(
                testCase.expression.value,
                testCase.inputfile?.let { inputMap[it] },
              )
            }
          } else {
            val results =
              engine.evaluateExpression(
                testCase.expression.value,
                testCase.inputfile?.let { inputMap[it] },
              )
            assertOutputsEqual(config, testCase.outputs, results)
          }
        }
      }
    }
  }
}

private fun assertOutputsEqual(
  config: ConformanceSuiteConfig,
  expected: List<Output>,
  actual: Collection<Any>,
) {
  assertEquals(expected.size, actual.size)
  expected.zip(actual).forEach { (output, value) -> assertOutputEquals(config, output, value) }
}

private fun assertOutputEquals(config: ConformanceSuiteConfig, expected: Output, actual: Any) {
  val type = expected.type ?: inferType(config, actual)
  when (type) {
    "date" -> assertEquals(FhirPathDate.fromString(expected.value.trimStart('@')), actual)
    "dateTime" -> assertEquals(FhirPathDateTime.fromString(expected.value.trimStart('@')), actual)
    "time" -> assertEquals(FhirPathTime.fromString(expected.value.trimStart('@', 'T')), actual)
    "code",
    "id",
    "string" -> assertEquals(expected.value, actual.toStringValue(config))
    "boolean" -> assertEquals(expected.value, if (actual is Boolean) actual.toString() else "true")
    "integer" -> assertEquals(expected.value, (actual as Int).toString())
    "decimal" -> assertEquals(expected.value.toBigDecimalPreservingScale(), actual as BigDecimal)
    "Quantity" -> assertEquals(expected.value, actual.toQuantityString(config))
    else -> throw AssertionError("Unknown type: $type")
  }
}

private fun inferType(config: ConformanceSuiteConfig, actual: Any): String =
  when {
    actual is Boolean -> "boolean"
    actual is Int -> "integer"
    actual is BigDecimal -> "decimal"
    actual is FhirPathDate -> "date"
    actual is FhirPathDateTime -> "dateTime"
    actual is FhirPathTime -> "time"
    actual is FhirPathQuantity || config.fhirQuantityString(actual) != null -> "Quantity"
    actual is String || config.fhirStringValue(actual) != null -> "string"
    else -> throw AssertionError("Unknown actual type: ${actual::class}")
  }

private fun Any.toStringValue(config: ConformanceSuiteConfig): String =
  when {
    this is String -> this
    else ->
      config.fhirStringValue(this)
        ?: throw AssertionError("Cannot extract string value from: $this")
  }

private fun Any.toQuantityString(config: ConformanceSuiteConfig): String =
  when {
    this is FhirPathQuantity -> {
      val cleanUnit = unit?.trim('\'')
      val formattedVal = value?.toPlainStringPreservingDecimalPlaces()
      "$formattedVal '$cleanUnit'"
    }
    else ->
      config.fhirQuantityString(this)
        ?: throw AssertionError("Cannot extract Quantity value from: $this")
  }

expect fun loadFile(file: String): String

expect fun listJsonFiles(dir: String): Map<String, String>
