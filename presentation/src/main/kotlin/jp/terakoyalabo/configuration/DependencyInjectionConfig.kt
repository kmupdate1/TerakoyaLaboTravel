package jp.terakoyalabo.configuration

import io.ktor.server.application.*
import jp.terakoyalabo.application.common.Log4Resolver
import jp.terakoyalabo.application.resolver.query.ItineraryQuery
import jp.terakoyalabo.common.util.Log
import org.koin.dsl.module
import org.koin.ktor.plugin.Koin
import org.koin.logger.slf4jLogger

private val layerBasedLogModule = module {
    factory<Log> { Log4Resolver() }
}
private val queryResolverModule = module {
    factory { ItineraryQuery(get()) }
}
private val mutationResolverModule = module {

}

fun Application.configureDependencyInjection() {
    install(Koin) {
        slf4jLogger()
        modules(
            layerBasedLogModule,
            queryResolverModule, mutationResolverModule,
        )
    }
}
