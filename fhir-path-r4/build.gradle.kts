import dev.ohs.fhir.fhirpath.codegen.model.FhirModelHelperGenerationTask

plugins {
    id("fhir-path-version-conventions")
}

val generateR4Helpers = tasks.register<FhirModelHelperGenerationTask>("generateR4Helpers") {
    description = "Generate FHIR model extensions for R4"
    this.corePackageFiles.from(
        layout.projectDirectory.dir("../third_party/hl7.fhir.r4.core/package")
    )
    this.fhirVersion.set("r4")
    outputDirectory.set(layout.buildDirectory.dir("generated/r4/kotlin"))
}

kotlin {
    sourceSets {
        commonMain {
            kotlin {
                srcDir(generateR4Helpers)
            }
        }
    }
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
    dependsOn(generateR4Helpers)
}

