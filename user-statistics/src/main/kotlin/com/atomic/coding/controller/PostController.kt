package com.atomic.coding.controller

import com.atomic.coding.domain.Post
import com.atomic.coding.service.PostService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/posts")
class PostController(
    private val postService: PostService
) {

    @GetMapping
    fun posts(): List<Post> {
        return postService.posts()
    }

    @GetMapping("/{postId}/users/{userId}")
    fun post(
        @PathVariable("postId") postId: Long,
        @PathVariable("userId") userId: Long
    ): Post {
        return postService.postById(postId = postId, userId = userId)
    }

}