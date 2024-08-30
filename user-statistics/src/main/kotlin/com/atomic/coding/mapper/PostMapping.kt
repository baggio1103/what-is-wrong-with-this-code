package com.atomic.coding.mapper

import com.atomic.coding.domain.Post
import com.atomic.coding.repository.entity.PostEntity

fun PostEntity.toPost() = Post(
    id = id,
    title = title,
    content = content,
    author = author,
    createdAt = createdAt
)