package com.dev.store.controllers

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class AdminController {

    @GetMapping("/adm")
    fun getHome(): String {
        return "admin/home"
    }
}