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
import com.squareup.kotlinpoet.asTypeName
import dev.ohs.fhir.fhirpath.codegen.model.schema.StructureDefinition
import dev.ohs.fhir.fhirpath.codegen.model.schema.capitalized

object SealedInterfaceExtensionFileSpecGenerator {
  fun generate(
    modelPackageName: String,
    modelExtensionPackageName: String,
    structureDefinitions: List<StructureDefinition>,
  ): FileSpec {
    val typeClassNames = mutableListOf<ClassName>()
    for (structureDefinition in structureDefinitions) {
      val modelClassName =
        ClassName(modelPackageName, structureDefinition.name.capitalized())
      for (sealedInterface in
        structureDefinition.snapshot!!.element.filter { it.path.endsWith("[x]") }) {
        val sealedInterfaceClassName =
          sealedInterface.id.removeSuffix("[x]").split('.').drop(1).fold(modelClassName) { acc, it ->
            acc.nestedClass(it.capitalized())
          }
        for (type in sealedInterface.type!!) {
          val typeClassName = sealedInterfaceClassName.nestedClass(type.code.capitalized())
          typeClassNames.add(typeClassName)
        }
      }
    }

    // Split the massive type check expressions into chunks of 150.
    // Kotlin JS compiles `when(this)` expressions with type checks (`is Type`) into nested JS `if/else` AST scopes.
    // Having a single `when` expression with several hundred branches translates to several hundred levels of JS
    // AST block nesting, which exceeds the JS engine's (e.g. Chrome/V8/Node) stack limits during execution/parsing,
    // throwing "RangeError: Maximum call stack size exceeded". Chunking prevents this call-stack crash.
    val chunks = typeClassNames.chunked(150)
    val fileSpecBuilder = FileSpec.builder(modelExtensionPackageName, "MoreSealedInterfaces")
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
        FunSpec.builder("getPropertyInChoiceValue$index")
          .addModifiers(KModifier.PRIVATE)
          .receiver(Any::class.asTypeName())
          .returns(Any::class.asTypeName().copy(nullable = true))
          .addParameter(name = "name", type = String::class)
          .beginControlFlow("return when(this)")
          .apply {
            for (typeClassName in chunk) {
              addStatement("is %T -> this.value.getProperty(name)", typeClassName)
            }
            addStatement("else -> null")
          }
          .endControlFlow()
          .build()
      )
    }
    fileSpecBuilder.addFunction(
      FunSpec.builder("getPropertyInChoiceValue")
        .addModifiers(KModifier.INTERNAL)
        .receiver(Any::class.asTypeName())
        .returns(Any::class.asTypeName().copy(nullable = true))
        .addParameter(name = "name", type = String::class)
        .apply {
          chunks.forEachIndexed { index, _ ->
            addStatement("getPropertyInChoiceValue$index(name)?.let { return it }")
          }
          addStatement("return null")
        }
        .build()
    )

    chunks.forEachIndexed { index, chunk ->
      fileSpecBuilder.addFunction(
        FunSpec.builder("hasPropertyInChoiceValue$index")
          .addModifiers(KModifier.PRIVATE)
          .receiver(Any::class.asTypeName())
          .returns(Boolean::class)
          .addParameter(name = "name", type = String::class)
          .beginControlFlow("return when(this)")
          .apply {
            for (typeClassName in chunk) {
              addStatement("is %T -> this.value.hasProperty(name)", typeClassName)
            }
            addStatement("else -> false")
          }
          .endControlFlow()
          .build()
      )
    }
    fileSpecBuilder.addFunction(
      FunSpec.builder("hasPropertyInChoiceValue")
        .addModifiers(KModifier.INTERNAL)
        .receiver(Any::class.asTypeName())
        .returns(Boolean::class)
        .addParameter(name = "name", type = String::class)
        .apply {
          chunks.forEachIndexed { index, _ ->
            addStatement("if (hasPropertyInChoiceValue$index(name)) return true")
          }
          addStatement("return false")
        }
        .build()
    )

    chunks.forEachIndexed { index, chunk ->
      fileSpecBuilder.addFunction(
        FunSpec.builder("unwrapChoiceValue$index")
          .addModifiers(KModifier.PRIVATE)
          .receiver(Any::class.asTypeName())
          .returns(Any::class.asTypeName().copy(nullable = true))
          .beginControlFlow("return when(this)")
          .apply {
            for (typeClassName in chunk) {
              addStatement("is %T -> this.value", typeClassName)
            }
            addStatement("else -> null")
          }
          .endControlFlow()
          .build()
      )
    }
    fileSpecBuilder.addFunction(
      FunSpec.builder("unwrapChoiceValue")
        .addModifiers(KModifier.INTERNAL)
        .receiver(Any::class.asTypeName())
        .returns(Any::class.asTypeName().copy(nullable = true))
        .apply {
          chunks.forEachIndexed { index, _ ->
            addStatement("unwrapChoiceValue$index()?.let { return it }")
          }
          addStatement("return null")
        }
        .build()
    )

    return fileSpecBuilder.build()
  }
}
