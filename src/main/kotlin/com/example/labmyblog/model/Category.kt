package com.example.labmyblog.model

import org.springframework.data.annotation.Id


data class Category(
    @Id
    val id: Long = -1L,
    val name: String,
){
    constructor() :this(-1L, "", )
}