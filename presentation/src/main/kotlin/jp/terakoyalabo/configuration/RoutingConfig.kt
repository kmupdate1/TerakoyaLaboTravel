package jp.terakoyalabo.configuration

import com.expediagroup.graphql.server.ktor.graphQLPostRoute
import io.ktor.server.application.Application
import io.ktor.server.routing.route
import io.ktor.server.routing.routing

fun Application.configureRouting() {
    routing {
        route("/api") {
            route("/v1") {
                route("/travel") {
                    graphQLPostRoute()
                }
            }
        }
    }
}
