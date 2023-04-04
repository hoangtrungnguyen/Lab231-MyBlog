package com.example.labmyblog.controller

import com.example.labmyblog.repository.BlogRepository
import com.example.labmyblog.repository.CategoryRepository
import org.springframework.data.domain.PageRequest
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class BlogController(
   private val blogRepository: BlogRepository,
   private val categoryRepository: CategoryRepository
    ) {

    @GetMapping("/home")
    fun listBlogs(model: Model): String {
        val blogs = blogRepository.findAll()
        model.addAttribute("blogs", blogs)
        model.addAttribute("active","home")

        //Get 5 recent rows in the table
        val pageable = PageRequest.of(0, 5);
        val recent = blogRepository.findAll(pageable)

        model.addAttribute("recent_blogs",recent)
        val categories = categoryRepository.findAll()

        model.addAttribute("categories", categories)

        return "home"
    }

    @GetMapping("/contact")
    fun contact(model: Model): String {
        model.addAttribute("active","contact")

        val categories = categoryRepository.findAll()

        model.addAttribute("categories", categories)


        return "contact"
    }

    @GetMapping("/")
    fun welcome(model: Model): String {
        return "welcome"
    }

}
