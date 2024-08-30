package com.atomic.coding.repository.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.time.LocalDateTime

@Entity
@Table(name = "posts")
data class PostEntity(
    @Id
    val id: Long,
    @Column(name = "title")
    val title: String,
    @Column(name = "content")
    val content: String,
    @Column(name = "author")
    val author: String,
    @Column(name = "created_at")
    val createdAt: LocalDateTime
)
