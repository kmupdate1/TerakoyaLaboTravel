package jp.terakoyalabo.common.util

fun <T: Any> executeOperation(
    log: Log,
    operation: () -> T,
): T = runCatching { operation() }.fold(
    onSuccess = { type ->
        log.info("Operation SUCCESS. Result: $type")
        type
    },
    onFailure = { throwable ->
        log.error("Operation FAILED.", throwable = throwable)
        throw throwable
    },
)
