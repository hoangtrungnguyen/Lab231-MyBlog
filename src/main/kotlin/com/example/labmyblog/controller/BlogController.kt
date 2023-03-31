package com.example.labmyblog.controller

import com.example.labmyblog.repository.BlogRepository
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class BlogController(private val blogRepository: BlogRepository) {

    @GetMapping("/home")
    fun listBlogs(model: Model): String {
        val blogs = blogRepository.findAll()
        model.addAttribute("blogs", blogs)
        val recent = blogRepository.findAll()
        model.addAttribute("recent_blogs",recent)
        return "home"
    }

    @GetMapping("/contact")
    fun contact(model: Model): String {
        return "contact"
    }

    @GetMapping("/")
    fun welcome(model: Model): String {
        return "welcome"
    }


}
