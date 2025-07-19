package jp.terakoyalabo

import io.ktor.server.application.Application
import io.ktor.server.cio.EngineMain
import jp.terakoyalabo.configuration.configureSpecification
import jp.terakoyalabo.configuration.configureDependencyInjection
import jp.terakoyalabo.configuration.configureGraphQL
import jp.terakoyalabo.configuration.configureRouting
import jp.terakoyalabo.configuration.configureStatusPages

fun Application.module() {
    configureDependencyInjection()
    configureSpecification()
    configureGraphQL()
    configureRouting()
    configureStatusPages()
}

fun main(args: Array<String>) = EngineMain.main(args = args)
