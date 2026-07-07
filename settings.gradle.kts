enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "kotlin-fhirpath"
include(":fhir-path-core")
include(":fhir-path-r4")
include(":fhir-path-r4b")
include(":fhir-path-r5")
include(":fhir-path")
