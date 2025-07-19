package jp.terakoyalabo.configuration

import io.github.smiley4.ktoropenapi.OpenApi
import io.ktor.server.application.*

fun Application.configureSpecification() {
    install(OpenApi)
}
