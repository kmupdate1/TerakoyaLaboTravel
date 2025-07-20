plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}

rootProject.name = "service-api-travel"

// Shared
include(":shared:common") // monitoring etc...
include(":shared:event")

// Travel API Service Specific
include(":common")
include(":presentation")
include(":application")
include(":infrastructure")
