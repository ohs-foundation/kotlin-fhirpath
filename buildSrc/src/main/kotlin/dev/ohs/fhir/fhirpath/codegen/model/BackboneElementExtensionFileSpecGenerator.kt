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

package dev.ohs.fhir.fhirpath.codegen.model

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.LIST
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.asTypeName
import dev.ohs.fhir.fhirpath.codegen.model.schema.StructureDefinition
import dev.ohs.fhir.fhirpath.codegen.model.schema.backboneElements
import dev.ohs.fhir.fhirpath.codegen.model.schema.capitalized
import dev.ohs.fhir.fhirpath.codegen.model.schema.getNestedClassName
import kotlin.collections.iterator

object BackboneElementExtensionFileSpecGenerator {
  fun generate(
    modelPackageName: String,
    modelExtPackageName: String,
    structureDefinitions: List<StructureDefinition>,
  ): FileSpec {
    val typeClassNames = mutableListOf<ClassName>()
    for (structureDefinition in structureDefinitions) {
      val modelClassName =
        ClassName(modelPackageName, structureDefinition.name.capitalized())
      for (backboneElement in structureDefinition.backboneElements) {
        typeClassNames.add(backboneElement.key.getNestedClassName(modelClassName))
      }
    }

    // Split the massive type check expressions into chunks of 150.
    // Kotlin JS compiles `when(this)` expressions with type checks (`is Type`) into nested JS `if/else` AST scopes.
    // Having a single `when` expression with several hundred branches translates to several hundred levels of JS
    // AST block nesting, which exceeds the JS engine's (e.g. Chrome/V8/Node) stack limits during execution/parsing,
    // throwing "RangeError: Maximum call stack size exceeded". Chunking prevents this call-stack crash.
    val chunks = typeClassNames.chunked(150)
    val fileSpecBuilder = FileSpec.builder(modelExtPackageName, "MoreBackboneElements")
      .addFileComment(
        """
        |Generated file. Do not edit.
        |
        |Helper functions are split into chunks of 150 branches to prevent deeply nested JS AST blocks
        |and avoid 'RangeError: Maximum call stack size exceeded' in JavaScript runtimes.
        """.trimMargin()
      )

    chunks.forEachIndexed { index, chunk ->
      fileSpecBuilder.addFunction(
        FunSpec.builder("getProperty$index")
          .addModifiers(KModifier.PRIVATE)
          .receiver(ClassName(modelPackageName, "BackboneElement"))
          .returns(Any::class.asTypeName().copy(nullable = true))
          .addParameter(name = "name", type = String::class)
          .beginControlFlow("return when(this)")
          .apply {
            for (typeClassName in chunk) {
              addStatement("is %T -> getProperty(name)", typeClassName)
            }
            addStatement("else -> null")
          }
          .endControlFlow()
          .build()
      )
    }
    fileSpecBuilder.addFunction(
      FunSpec.builder("getProperty")
        .addModifiers(KModifier.INTERNAL)
        .receiver(ClassName(modelPackageName, "BackboneElement"))
        .returns(Any::class.asTypeName().copy(nullable = true))
        .addParameter(name = "name", type = String::class)
        .apply {
          chunks.forEachIndexed { index, _ ->
            addStatement("getProperty$index(name)?.let { return it }")
          }
          addStatement("return null")
        }
        .build()
    )

    chunks.forEachIndexed { index, chunk ->
      fileSpecBuilder.addFunction(
        FunSpec.builder("hasProperty$index")
          .addModifiers(KModifier.PRIVATE)
          .receiver(ClassName(modelPackageName, "BackboneElement"))
          .returns(Boolean::class)
          .addParameter(name = "name", type = String::class)
          .beginControlFlow("return when(this)")
          .apply {
            for (typeClassName in chunk) {
              addStatement("is %T -> hasProperty(name)", typeClassName)
            }
            addStatement("else -> false")
          }
          .endControlFlow()
          .build()
      )
    }
    fileSpecBuilder.addFunction(
      FunSpec.builder("hasProperty")
        .addModifiers(KModifier.INTERNAL)
        .receiver(ClassName(modelPackageName, "BackboneElement"))
        .returns(Boolean::class)
        .addParameter(name = "name", type = String::class)
        .apply {
          chunks.forEachIndexed { index, _ ->
            addStatement("if (hasProperty$index(name)) return true")
          }
          addStatement("return false")
        }
        .build()
    )

    chunks.forEachIndexed { index, chunk ->
      fileSpecBuilder.addFunction(
        FunSpec.builder("getAllChildren$index")
          .addModifiers(KModifier.PRIVATE)
          .receiver(ClassName(modelPackageName, "BackboneElement"))
          .returns(LIST.parameterizedBy(Any::class.asTypeName()))
          .beginControlFlow("return when(this)")
          .apply {
            for (typeClassName in chunk) {
              addStatement("is %T -> getAllChildren()", typeClassName)
            }
            addStatement("else -> emptyList()")
          }
          .endControlFlow()
          .build()
      )
    }
    fileSpecBuilder.addFunction(
      FunSpec.builder("getAllChildren")
        .addModifiers(KModifier.INTERNAL)
        .receiver(ClassName(modelPackageName, "BackboneElement"))
        .returns(LIST.parameterizedBy(Any::class.asTypeName()))
        .apply {
          chunks.forEachIndexed { index, _ ->
            addStatement("getAllChildren$index().let { if (it.isNotEmpty()) return it }")
          }
          addStatement("return emptyList()")
        }
        .build()
    )

    return fileSpecBuilder.build()
  }
}
