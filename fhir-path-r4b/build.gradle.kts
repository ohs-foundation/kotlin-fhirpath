import dev.ohs.fhir.fhirpath.codegen.model.FhirModelHelperGenerationTask

plugins {
    id("fhir-path-version-conventions")
}

val generateR4BHelpers = tasks.register<FhirModelHelperGenerationTask>("generateR4BHelpers") {
    description = "Generate FHIR model extensions for R4B"
    this.corePackageFiles.from(
        File(project.rootDir, "third_party/hl7.fhir.r4b.core/package").listFiles()
    )
    this.fhirVersion.set("r4b")
    outputDirectory.set(layout.buildDirectory.dir("generated/r4b/kotlin"))
}

kotlin {
    sourceSets {
        commonMain {
            kotlin {
                srcDir(generateR4BHelpers)
            }
        }
    }
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
    dependsOn(generateR4BHelpers)
}

