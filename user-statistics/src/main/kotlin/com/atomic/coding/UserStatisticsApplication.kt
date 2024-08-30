package com.atomic.coding

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class UserStatisticsApplication

fun main(args: Array<String>) {
    runApplication<UserStatisticsApplication>(*args)
}
