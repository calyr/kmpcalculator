package com.calyrsoft.ucbkmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform