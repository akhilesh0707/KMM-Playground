package com.aqube.kmmplayground

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform