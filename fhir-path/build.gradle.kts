import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.targets.js.webpack.KotlinWebpackConfig

plugins {
    id("org.jetbrains.kotlin.multiplatform")
    id("com.android.library")
    id("com.google.devtools.ksp")
    id("org.jetbrains.kotlin.plugin.serialization")
    alias(libs.plugins.kotest)
    id("com.vanniktech.maven.publish")
}

val mavenGroupId: String by project
val mavenVersion: String by project
val androidNamespace: String by project

tasks.withType<Test>().configureEach {
    // Provide root directory reference for test code to access third_party
    systemProperty("projectRootDir", project.rootDir.absolutePath)
    // Show stdout/stderr from tests (useful for trace function debugging)
    testLogging {
        showStandardStreams = true
    }
}

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
    ).forEach {
        it.binaries.framework {
            baseName = "KotlinFhirPath"
            isStatic = true
        }
    }

    sourceSets {
        commonMain {
            dependencies {
                api(project(":fhir-path-r4"))
                api(project(":fhir-path-r4b"))
                api(project(":fhir-path-r5"))
            }
        }
        commonTest.dependencies {
            implementation(libs.kotlin.fhir.r4)
            implementation(libs.kotlin.fhir.r4b)
            implementation(libs.kotlin.fhir.r5)
            implementation(libs.kotest.assertions.core)
            implementation(libs.kotest.framework.engine)
            implementation(libs.kotlin.test)
            implementation(libs.kotlinx.serialization.json)
            implementation(libs.xmlutil.serialization)
            implementation(libs.xmlutil.core)
        }
        val jvmTest by getting {
            dependencies {
                implementation(libs.kotest.runner.junit5)
            }
        }
        val androidUnitTest by getting {
            dependencies {
                implementation(libs.kotest.runner.junit5)
            }
        }
    }
}

configure<com.android.build.gradle.LibraryExtension> {
    namespace = androidNamespace
    compileSdk = 35
    defaultConfig {
        minSdk = 24
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    testOptions {
        unitTests.all {
            val test = it as @Suppress("UNRESOLVED_REFERENCE") org.gradle.api.tasks.testing.Test
            test.systemProperty("projectRootDir", project.rootDir.absolutePath)
            test.useJUnitPlatform()
        }
    }
}

tasks.withType<Test>().configureEach {
    useJUnitPlatform()
}

mavenPublishing {
    publishToMavenCentral()
    signAllPublications()
    coordinates(mavenGroupId, "fhir-path", mavenVersion)

    pom {
        name = "Kotlin FHIRPath"
        description = "A Kotlin Multiplatform library for FHIRPath (Aggregate Bundle)"
        inceptionYear = "2025"
        url = "https://github.com/ohs-foundation/kotlin-fhirpath"
        licenses {
            license {
                name = "The Apache License, Version 2.0"
                url = "https://www.apache.org/licenses/LICENSE-2.0.txt"
                distribution = "https://www.apache.org/licenses/LICENSE-2.0.txt"
            }
        }
        developers {
            developer {
                id = "ohs-foundation"
                name = "Open Heath Stack Foundation"
                url = "https://ohs.dev/"
            }
        }
        scm {
            url = "https://github.com/ohs-foundation/kotlin-fhirpath/"
            connection = "scm:git:git://github.com/ohs-foundation/kotlin-fhirpath.git"
            developerConnection = "scm:git:ssh://git@github.com/ohs-foundation/kotlin-fhirpath.git"
        }
    }
}

tasks.named<org.jetbrains.kotlin.gradle.targets.js.testing.KotlinJsTest>("jsBrowserTest") {
    environment("NODE_OPTIONS", "--max-old-space-size=8192")
}
