package com.example.labmyblog

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication
@EnableJpaRepositories(basePackages = ["com.example.labmyblog.repository"])
class LabMyBlogApplication

fun main(args: Array<String>) {
    runApplication<LabMyBlogApplication>(*args)
}


