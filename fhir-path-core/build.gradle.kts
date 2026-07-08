import com.strumenta.antlrkotlin.gradle.AntlrKotlinTask
import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import dev.ohs.fhir.fhirpath.codegen.ucum.UcumHelperGenerationTask
import org.jetbrains.kotlin.gradle.targets.js.webpack.KotlinWebpackConfig

plugins {
    id("org.jetbrains.kotlin.multiplatform")
    id("com.android.library")
    id("com.google.devtools.ksp")
    alias(libs.plugins.antlr.kotlin)
    id("org.jetbrains.kotlin.plugin.serialization")
    id("com.vanniktech.maven.publish")
}

val mavenGroupId: String by project
val mavenVersion: String by project
val androidNamespace: String by project

// Run `./gradlew generateUcumHelpers` to generate helper functions for UCUM in `fhirpath/build/generated`
val generateUcumHelpers = tasks.register<UcumHelperGenerationTask>("generateUcumHelpers") {
    description = "Generate FHIR model extensions for R4"
    this.ucumFile.set(
        File(project.rootDir, "third_party/ucum/ucum-essence.xml")
    )
    this.packageName.set("dev.ohs.fhir.fhirpath.ucum")
    outputDirectory.set(layout.buildDirectory.dir("generated/ucum/kotlin"))
}

// Run `./gradlew generateKotlinGrammarSource` to generate parser in `fhirpath/build/generatedAntlr`
val generateKotlinGrammarSource = tasks.register<AntlrKotlinTask>("generateKotlinGrammarSource") {
    dependsOn("cleanGenerateKotlinGrammarSource")
    source = fileTree(rootProject.file("third_party/fhirpath-2.0.0")) {
        include("**/*.g4")
    }
    packageName = "dev.ohs.fhir.fhirpath.parsers"
    arguments = listOf("-visitor")  // Generate visitors alongside listeners

    val outDir = "generated/grammar/kotlin/${packageName!!.replace(".", "/")}"
    outputDirectory = layout.buildDirectory.dir(outDir).get().asFile
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
            baseName = "KotlinFhirPathCore"
            isStatic = true
        }
    }

    sourceSets {
        commonMain {
            kotlin {
                srcDir(generateUcumHelpers)
                srcDir(generateKotlinGrammarSource)
            }
            dependencies {
                api(libs.bignum)
                api(libs.kotlinx.datetime)
                implementation(libs.antlr.kotlin.runtime)
                implementation(libs.kotlinx.serialization.json)
            }
        }
    }
}

configure<com.android.build.gradle.LibraryExtension> {
    namespace = "$androidNamespace.core"
    compileSdk = 35
    defaultConfig {
        minSdk = 24
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
    dependsOn(generateUcumHelpers)
    dependsOn(generateKotlinGrammarSource)
}

mavenPublishing {
    publishToMavenCentral()
    signAllPublications()
    coordinates(mavenGroupId, "fhir-path-core", mavenVersion)

    pom {
        name = "Kotlin FHIRPath Core"
        description = "Core engine for Kotlin FHIRPath"
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
