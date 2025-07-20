package jp.terakoyalabo.application.common

import jp.terakoyalabo.common.util.Log
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class Log4Resolver: Log {
    private val logger: Logger = LoggerFactory.getLogger(this::class.java)

    override fun error(message: String, throwable: Throwable) =
        logger.error(message, throwable)

    override fun warn(message: String) = logger.warn(message)

    override fun info(message: String) = logger.info(message)

    override fun debug(message: String) = logger.debug(message)

    override fun trace(message: String) = logger.trace(message)
}
