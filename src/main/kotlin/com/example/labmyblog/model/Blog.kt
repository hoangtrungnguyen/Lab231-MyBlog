package com.example.labmyblog.model

import org.springframework.data.annotation.Id


data class Blog (
    @Id
    val id: Long?,
    val title: String,
    val content: String,
    val createdTime: String,
    val imageUrl: String
){

    constructor() :this(-1L, "", "", "", "")
}

