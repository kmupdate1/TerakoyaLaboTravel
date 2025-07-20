package jp.terakoyalabo.configuration

import com.expediagroup.graphql.server.ktor.GraphQL
import io.ktor.server.application.Application
import io.ktor.server.application.install
import jp.terakoyalabo.application.resolver.query.ItineraryQuery
import org.koin.ktor.ext.inject

fun Application.configureGraphQL() {
    val schemaConfig = environment.config.config("graphql.schema")
    val engineConfig = environment.config.config("graphql.engine")

    val itineraryQuery by inject<ItineraryQuery>()

    install(GraphQL) {
        schema {
            packages = schemaConfig.property("packages").getList()
            queries = listOf(
                itineraryQuery,
            )
            mutations = listOf(

            )
        }
        engine {}
    }
}
