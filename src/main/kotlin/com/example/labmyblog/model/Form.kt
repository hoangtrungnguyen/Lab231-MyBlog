package com.example.labmyblog.model

import org.springframework.data.annotation.Id


data class Form(
    @Id
    var id: Long = -1L,
    val name: String,
    val email: String,
    val phone: String,
    val company: String,
    val message: String
) {
    constructor() :this(-1L, "", "","", "", "" )

}