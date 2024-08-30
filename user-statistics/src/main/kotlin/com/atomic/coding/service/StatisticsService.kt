package com.atomic.coding.service

import com.atomic.coding.repository.StatisticsRepository
import org.springframework.stereotype.Service

@Service
class StatisticsService(
    private val statisticsRepository: StatisticsRepository
) {

    fun updateStatistics() {

    }

}