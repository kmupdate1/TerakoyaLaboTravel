package jp.terakoyalabo.common.util

interface Log {
    fun error(message: String, throwable: Throwable)
    fun warn(message: String)
    fun info(message: String)
    fun debug(message: String)
    fun trace(message: String)
}
