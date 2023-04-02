package com.example.labmyblog.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
data class Form(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = -1L,
    val name: String,
    val email: String,
    val phone: String,
    val company: String,
    val message: String
) {
    constructor() :this(-1L, "", "","", "", "" )

}