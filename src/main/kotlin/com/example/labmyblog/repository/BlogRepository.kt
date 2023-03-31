package com.example.labmyblog.repository

import com.example.labmyblog.model.Blog
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface BlogRepository : CrudRepository<Blog, Long> {
}