package com.example.labmyblog.repository

import com.example.labmyblog.model.Category
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface CategoryRepository : MongoRepository<Category, Long> {
}