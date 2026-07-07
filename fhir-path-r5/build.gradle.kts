import dev.ohs.fhir.fhirpath.codegen.model.FhirModelHelperGenerationTask

plugins {
    id("fhir-path-version-conventions")
}

val generateR5Helpers = tasks.register<FhirModelHelperGenerationTask>("generateR5Helpers") {
    description = "Generate FHIR model extensions for R5"
    this.corePackageFiles.from(
        File(project.rootDir, "third_party/hl7.fhir.r5.core/package").listFiles()
    )
    this.fhirVersion.set("r5")
    outputDirectory.set(layout.buildDirectory.dir("generated/r5/kotlin"))
}

kotlin {
    sourceSets {
        commonMain {
            kotlin {
                srcDir(generateR5Helpers)
            }
        }
    }
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
    dependsOn(generateR5Helpers)
}

