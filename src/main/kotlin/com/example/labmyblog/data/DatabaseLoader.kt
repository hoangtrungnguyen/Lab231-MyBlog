package com.example.labmyblog.data

import com.example.labmyblog.model.Blog
import com.example.labmyblog.model.Category
import com.example.labmyblog.repository.BlogRepository
import com.example.labmyblog.repository.CategoryRepository
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration


@Configuration
internal class LoadDatabase {

    @Bean
    fun initDatabase(repository: BlogRepository, categoryRepository: CategoryRepository): CommandLineRunner {
        return CommandLineRunner { args: Array<String?>? ->
            log.info("Preloading " + repository.save(Blog(1,"Bilbo Baggins", "burglar", "2022-03-12")))
            log.info("Preloading " + repository.save(Blog(2, "Frodo Baggins", "thief", "2022-01-01")), )
            log.info("Preloading " + repository.save(Blog(3, "Layout", "thief lorem inspu", "2022-03-01")), )
            log.info("Preloading " + categoryRepository.save(Category(1, "Art")))
            log.info("Preloading " + categoryRepository.save(Category(2, "Beauty")))
            log.info("Preloading " + categoryRepository.save(Category(3, "Food")))
            log.info("Preloading " + categoryRepository.save(Category(4, "Tech")))

        }
    }

    companion object {
        private val log: Logger = LoggerFactory.getLogger(LoadDatabase::class.java)
    }
}