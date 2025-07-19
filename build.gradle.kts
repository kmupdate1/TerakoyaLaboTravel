plugins {
    alias { libs.plugins.kotlin.jvm } apply false
    alias { libs.plugins.johnrengelman.shadow } apply false
}

allprojects {
    repositories {
        mavenCentral()
        google()
    }
}
