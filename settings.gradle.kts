rootProject.name = "service-api-travel"

// Shared
include(":shared:common") // monitoring etc...
include(":shared:event")

// Travel API Service Specific
include(":domain")
include(":presentation")
include(":application")
include(":infrastructure")
