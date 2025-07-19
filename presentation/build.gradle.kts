plugins {
    alias { libs.plugins.kotlin.jvm }
    id("application")
}

application {
    mainClass.set("jp.terakoyalabo.ApiServiceMainKt")
}

dependencies {
    implementation(Dependencies.Ktor.Server.CORE)
    implementation(Dependencies.Ktor.Server.CIO)
    implementation(Dependencies.Ktor.Server.STATUS_PAGES)

    implementation(Dependencies.GraphQL.Kotlin.KTOR_SERVER)

    implementation(Dependencies.Koin.CORE)
    implementation(Dependencies.Koin.KTOR)
    implementation(Dependencies.Koin.LOGGER_SLF4J)

    implementation(Dependencies.Logback.CLASSIC)

    implementation(project(Projects.DOMAIN))
    implementation(project(Projects.APPLICATION))
    implementation(project(Projects.INFRASTRUCTURE))
}
