package com.atomic.coding.service

import com.atomic.coding.domain.Post
import com.atomic.coding.mapper.toPost
import com.atomic.coding.repository.PostRepository
import com.atomic.coding.repository.StatisticsRepository
import com.atomic.coding.repository.entity.StatisticsEntity
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service


@Service
class PostService(
    private val postRepository: PostRepository,
    private val statisticsRepository: StatisticsRepository
) {

    private val viewerThreshold = 5000

    private val logger: Logger = LoggerFactory.getLogger(PostService::class.java)

    fun posts(): List<Post> = postRepository.findAll().map { it.toPost() }

    fun postById(postId: Long, userId: Long): Post {
        val post = postRepository.findByIdOrNull(postId)
            ?: throw IllegalArgumentException("Post by id: [$postId] not found!")
        logger.info("User with id: [$userId] request post with id: [$postId]")
        // save here statistics about the viewing the post
        var statistics = statisticsRepository.findByPost(post)
        if (statistics == null) {
            val id = statisticsRepository.nextSequenceValue()
            statistics = StatisticsEntity(id, post = post)
        }
        statistics.viewCount++
        statisticsRepository.save(statistics)
        if (statistics.viewCount >= viewerThreshold) {
            logger.info("View count threshold: [$viewerThreshold] exceed, count: [${statistics.viewCount}] post: [$postId]")
        }
        return post.toPost()
    }

}