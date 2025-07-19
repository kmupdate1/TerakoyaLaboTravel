package jp.terakoyalabo.configuration

import io.github.smiley4.ktoropenapi.openApi
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        route("api") {
            route("v1") {
                route("travel") {
                    // graphQLPostRoute()
                }
            }
        }
        route("v1") {
            route("terakoyalabo-travel") {
                get { call.respondText { "Hello this is TERAKOYALABO TRAVEL." } }

                route("api.json") {
                    openApi()
                }
            }
        }
    }
}
