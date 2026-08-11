import dev.ohs.fhir.fhirpath.codegen.model.FhirModelHelperGenerationTask

plugins {
    id("fhir-path-version-conventions")
}

val generateR5Helpers = tasks.register<FhirModelHelperGenerationTask>("generateR5Helpers") {
    description = "Generate FHIR model extensions for R5"
    this.corePackageFiles.from(
        layout.projectDirectory.dir("../third_party/hl7.fhir.r5.core/package")
    )
    this.fhirVersion.set("r5")
    outputDirectory.set(layout.projectDirectory.dir("src/commonMain/kotlin"))
    finalizedBy(rootProject.tasks.named("spotlessApply"))
}

// Ensure Kotlin compilation tasks depend on code generation
tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompilationTask<*>>().configureEach {
    dependsOn(generateR5Helpers)
}

// Ensure Jar packaging tasks depend on code generation
tasks.withType<org.gradle.jvm.tasks.Jar>().configureEach {
    dependsOn(generateR5Helpers)
}

