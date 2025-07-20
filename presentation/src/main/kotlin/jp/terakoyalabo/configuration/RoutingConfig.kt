package jp.terakoyalabo.configuration

import com.expediagroup.graphql.server.ktor.graphQLPostRoute
import io.ktor.server.application.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        route("/api") {
            route("/v1") {
                route("/travel") {
                    graphQLPostRoute("/graphql")
                }
            }
        }
    }
}
