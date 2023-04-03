package com.example.labmyblog.repository

import com.example.labmyblog.model.Blog
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository

@Repository
interface   BlogRepository : JpaRepository<Blog, Long> {

    @Query(value = "SELECT '*' FROM Blog ORDER BY createdTime LIMIT 5")
    fun findLatestBlog(): Blog
}