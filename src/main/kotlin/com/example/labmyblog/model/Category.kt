package com.example.labmyblog.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType

@Entity
data class Category(
    @jakarta.persistence.Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = -1L,
    val name: String,
){
    constructor() :this(-1L, "", )
}