package com.example.labmyblog.controller

import com.example.labmyblog.model.Form
import com.example.labmyblog.repository.FormRepository
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.servlet.ModelAndView
import java.util.*


@RestController
class FormController(private val formRepository: FormRepository) {


    @PostMapping("/save")
    fun save(@ModelAttribute("contactForm") form: Form): ModelAndView{
        form.id = UUID.randomUUID().mostSignificantBits
        println(form)
        formRepository.save(form)
        return ModelAndView("/success")

    }

    @GetMapping("/success")
    fun successPage(): String{
        return "success"
    }
}