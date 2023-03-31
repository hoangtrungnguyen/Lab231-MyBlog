package com.example.labmyblog.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id


@Entity
data class Blog (
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = -1L,
    val title: String,
    val content: String,
    val createdTime: String,
){

    constructor() :this(-1L, "", "", "")
}

