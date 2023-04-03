package com.example.labmyblog

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories

@SpringBootApplication
@EnableMongoRepositories(basePackages = ["com.example.labmyblog.repository"])
class LabMyBlogApplication

fun main(args: Array<String>) {
    runApplication<LabMyBlogApplication>(*args)
}


