enableFeaturePreview("VERSION_CATALOGS")

pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }

    resolutionStrategy {
        eachPlugin {
            when (requested.id.id) {
                "binary-compatibility-validator" ->
                    useModule("org.jetbrains.kotlinx:binary-compatibility-validator:${requested.version}")

                else -> when (requested.id.namespace) {
                    "com.android" ->
                        useModule("com.android.tools.build:gradle:${requested.version}")
                }
            }
        }
    }
}

include(
    "annotations",
    "compile",
    "runtime",
    "stubs",
)
