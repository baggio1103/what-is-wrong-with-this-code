package com.atomic.coding.repository.entity

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "statistics")
data class StatisticsEntity(
    @Id
    val id: Long,

    @Column(name = "view_count")
    var viewCount: Long = 0,

    @Column(name = "query_time")
    val queryTime: LocalDateTime = LocalDateTime.now(),

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "post_id")
    val post: PostEntity,
)
