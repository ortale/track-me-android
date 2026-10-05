package com.devortale.trackme

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform