package com.atomic.coding.domain

import java.time.LocalDateTime

data class Post(
    val id: Long,
    val title: String,
    val content: String,
    val author: String,
    val createdAt: LocalDateTime
)
