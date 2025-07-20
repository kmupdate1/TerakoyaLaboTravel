package jp.terakoyalabo.domain.graphql.type

import com.expediagroup.graphql.generator.annotations.GraphQLDescription

@GraphQLDescription("TYPE: Itinerary information details.")
data class ItineraryInformationType(
    val value: String,
)
