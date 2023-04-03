package com.example.labmyblog.repository

import com.example.labmyblog.model.Blog
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface BlogRepository : MongoRepository<Blog, Long> {

}