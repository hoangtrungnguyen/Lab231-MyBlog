package com.example.labmyblog.controller

import com.example.labmyblog.repository.BlogRepository
import com.example.labmyblog.repository.CategoryRepository
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
        val recent = blogRepository.findLatestBlog()
        model.addAttribute("recent_blogs",recent)
        val categories = categoryRepository.findAll()
        model.addAttribute("categories", categories)

        return "home"
    }

    @GetMapping("/contact")
    fun contact(model: Model): String {
        model.addAttribute("active","contact")
        return "contact"
    }

    @GetMapping("/")
    fun welcome(model: Model): String {
        return "welcome"
    }

}
