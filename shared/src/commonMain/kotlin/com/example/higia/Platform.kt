package com.example.higia

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform