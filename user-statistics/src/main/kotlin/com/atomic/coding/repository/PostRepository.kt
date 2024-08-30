package com.atomic.coding.repository

import com.atomic.coding.repository.entity.PostEntity
import org.springframework.data.jpa.repository.JpaRepository


interface PostRepository : JpaRepository<PostEntity, Long>