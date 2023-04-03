package com.example.labmyblog.repository

import com.example.labmyblog.model.Form
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository


@Repository
interface FormRepository : MongoRepository<Form, Long> {
}