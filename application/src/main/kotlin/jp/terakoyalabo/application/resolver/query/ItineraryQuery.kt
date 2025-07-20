package jp.terakoyalabo.application.resolver.query

import com.expediagroup.graphql.generator.annotations.GraphQLDescription
import com.expediagroup.graphql.server.operations.Query
import jp.terakoyalabo.common.util.Log
import jp.terakoyalabo.common.util.executeOperation
import jp.terakoyalabo.domain.graphql.type.ItineraryInformationType

class ItineraryQuery(
    private val log: Log,
): Query {
    @GraphQLDescription("QUERY: Gets an itinerary information by itinerary_id.")
    fun getItineraryById(itineraryId: String): ItineraryInformationType = executeOperation(log = log) {
        ItineraryInformationType(
            value = "This is ${this::class.qualifiedName}.",
        )
    }

    @GraphQLDescription("QUERY: Gets all itineraries information of authenticated user.")
    fun getMyItineraries(): List<ItineraryInformationType>? = executeOperation(log = log) {
        listOf(
            ItineraryInformationType(
                value = "This is ${this::class.qualifiedName}.",
            )
        )
    }
}
