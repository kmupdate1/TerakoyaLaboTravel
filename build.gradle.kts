plugins {
    alias { libs.plugins.kotlin.jvm } apply false
}

group = "jp.terakoyalabo"
version = "1.0-SNAPSHOT"

allprojects {
    repositories {
        mavenCentral()
        google()
    }
}
