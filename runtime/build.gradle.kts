plugins {
    id("com.android.library")
    kotlin("android")
    id("kotlin-parcelize")
    id("org.jmailen.kotlinter")
    jacoco
    id("org.jetbrains.dokka")
    id("com.vanniktech.maven.publish")
}

apply(from = rootProject.file("gradle/jacoco.gradle.kts"))

android {
    compileSdkVersion(libs.versions.android.compile.get())

    defaultConfig {
        minSdkVersion(libs.versions.android.min.get())
    }
}

dependencies {
    api(libs.kotlin.parcelize.runtime)
    testImplementation(libs.assertj)
    testImplementation(kotlin("test-junit"))
    testImplementation(libs.robolectric)
}
