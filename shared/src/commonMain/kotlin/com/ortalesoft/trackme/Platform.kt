package com.ortalesoft.trackme

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform