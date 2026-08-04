plugins {
    alias(libs.plugins.spotless)
}

configure<com.diffplug.gradle.spotless.SpotlessExtension> {
    ratchetFrom = "origin/main"
    kotlin {
        target("**/*.kt")
        ktfmt().googleStyle()
        licenseHeaderFile(
            "license-header.txt",
        )
    }
    flexmark {
        target("**/*.md")
        flexmark()
    }
}

val codegenTasks = listOf(
    ":fhir-path-core:generateUcumHelpers",
    ":fhir-path-core:generateKotlinGrammarSource",
    ":fhir-path-r4:generateR4Helpers",
    ":fhir-path-r4b:generateR4BHelpers",
    ":fhir-path-r5:generateR5Helpers",
)

tasks.named("spotlessKotlin") {
    dependsOn(codegenTasks)
}

tasks.named("spotlessFlexmark") {
    dependsOn(codegenTasks)
}
