package com.example.labmyblog.repository

import com.example.labmyblog.model.Category
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CategoryRepository : JpaRepository<Category,Long> {
}