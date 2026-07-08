plugins {
    `kotlin-dsl`
    alias(libs.plugins.kotlin.serialization)
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