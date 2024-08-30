package com.atomic.coding.repository

import com.atomic.coding.repository.entity.PostEntity
import com.atomic.coding.repository.entity.StatisticsEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query

interface StatisticsRepository: JpaRepository<StatisticsEntity, Long> {

    fun findByPost(post: PostEntity): StatisticsEntity?

    @Query("SELECT nextval('statistics_id_seq')", nativeQuery = true)
    fun nextSequenceValue(): Long

}