package com.example.labmyblog.repository

import com.example.labmyblog.model.Form
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


@Repository
interface FormRepository : JpaRepository<Form, Long> {
}