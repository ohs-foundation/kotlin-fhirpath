plugins {
    `kotlin-dsl`
    id("org.jetbrains.kotlin.plugin.serialization") version "2.2.0"
}

repositories {
    mavenCentral()
    google()
}

dependencies {
    implementation(libs.android.gradle.plugin)
    implementation(libs.kotlin.gradle.plugin)
    implementation(libs.kotlin.serialization.plugin)
    implementation(libs.ksp.gradle.plugin)
    implementation(libs.maven.publish.plugin)
    implementation(libs.kotlin.fhir)
    implementation(libs.kotlin.poet)
    implementation(libs.kotlinx.serialization.json)
    implementation(libs.xmlutil.core)
    implementation(libs.xmlutil.serialization)
}