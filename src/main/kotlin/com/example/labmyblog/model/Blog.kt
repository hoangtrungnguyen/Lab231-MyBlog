package com.example.labmyblog.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType


@Entity
data class Blog (
    @jakarta.persistence.Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long?,
    val title: String,
    val content: String,
    val createdTime: String,
    val imageUrl: String
){

    constructor() :this(-1L, "", "", "", "")
}

