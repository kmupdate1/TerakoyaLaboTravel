package jp.terakoyalabo.configuration

import com.expediagroup.graphql.server.ktor.graphQLPostRoute
import io.ktor.server.application.Application
import io.ktor.server.response.respondText
import io.ktor.server.routing.get
import io.ktor.server.routing.route
import io.ktor.server.routing.routing

fun Application.configureRouting() {
    routing {
        route("/api") {
            route("/v1") {
                route("/travel") {
                    // graphQLPostRoute()
                }
            }
        }
        route("/v1") {
            route("/terakoyalabo-travel") {
                get { call.respondText { "Hello this is TERAKOYALABO TRAVEL." } }
            }
        }
    }
}
