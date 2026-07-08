import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.targets.js.webpack.KotlinWebpackConfig
import com.android.build.gradle.LibraryExtension
import com.vanniktech.maven.publish.MavenPublishBaseExtension

plugins {
    id("org.jetbrains.kotlin.multiplatform")
    id("com.android.library")
    id("com.google.devtools.ksp")
    id("org.jetbrains.kotlin.plugin.serialization")
    id("com.vanniktech.maven.publish")
    id("maven-publish")
}

// Derive FHIR version label from module name: "fhir-path-r4" -> "r4"
val fhirVersionSuffix = name.substringAfter("fhir-path-")
val fhirVersionLabel = fhirVersionSuffix.uppercase()

val mavenGroupId: String by project
val mavenVersion: String by project
val androidNamespace: String by project

// Access version catalog
val libs = extensions.getByType(VersionCatalogsExtension::class.java).named("libs")

kotlin {
    jvmToolchain(21)

    jvm()
    wasmJs {
        browser {
            val rootDirPath = project.rootDir.path
            val projectDirPath = project.projectDir.path
            commonWebpackConfig {
                devServer = (devServer ?: KotlinWebpackConfig.DevServer()).apply {
                    static = (static ?: mutableListOf()).apply {
                        // Serve sources to debug inside browser
                        add(rootDirPath)
                        add(projectDirPath)
                    }
                }
            }
        }
    }
    wasmWasi {
        nodejs()
        binaries.library()
    }
    js {
        browser()
        binaries.library()
    }
    androidTarget {
        publishLibraryVariants("release")
        compilations.all {
            compileTaskProvider.configure {
                compilerOptions {
                    jvmTarget.set(JvmTarget.JVM_1_8)
                }
            }
        }
    }

    listOf(
        iosSimulatorArm64(),
        iosArm64(),
        iosX64(),
    ).forEach {
        it.binaries.framework {
            baseName = "KotlinFhirPath" + fhirVersionLabel
            isStatic = true
        }
    }

    sourceSets {
        commonMain {
            dependencies {
                api(project(":fhir-path-core"))
                // Dynamically fetch the matching dev.ohs.fhir:fhir-model-<version> dependency
                api(libs.findLibrary("kotlin-fhir-$fhirVersionSuffix").get())
            }
        }
    }
}

configure<LibraryExtension> {
    namespace = "$androidNamespace.$fhirVersionSuffix"
    compileSdk = 35
    defaultConfig {
        minSdk = 24
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

// Configure Maven Central publishing base extension
configure<MavenPublishBaseExtension> {
    publishToMavenCentral()
    signAllPublications()
    coordinates(mavenGroupId, project.name, mavenVersion)

    pom {
        name.set("Kotlin FHIRPath $fhirVersionLabel")
        description.set("A Kotlin Multiplatform library for FHIRPath evaluation on FHIR $fhirVersionLabel")
        inceptionYear.set("2026")
        url.set("https://github.com/ohs-foundation/kotlin-fhirpath")
        licenses {
            license {
                name.set("The Apache License, Version 2.0")
                url.set("https://www.apache.org/licenses/LICENSE-2.0.txt")
                distribution.set("https://www.apache.org/licenses/LICENSE-2.0.txt")
            }
        }
        developers {
            developer {
                id.set("ohs-foundation")
                name.set("Open Health Stack Foundation")
                url.set("https://ohs.dev/")
            }
        }
        scm {
            url.set("https://github.com/ohs-foundation/kotlin-fhirpath/")
            connection.set("scm:git:git://github.com/ohs-foundation/kotlin-fhirpath.git")
            developerConnection.set("scm:git:ssh://git@github.com/ohs-foundation/kotlin-fhirpath.git")
        }
    }
}
