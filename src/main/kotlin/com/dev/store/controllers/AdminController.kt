package com.dev.store.controllers

import com.dev.store.models.Funcionario
import com.dev.store.repositories.FuncionarioRepository
import org.springframework.stereotype.Controller
import org.springframework.validation.BindingResult
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.servlet.ModelAndView
import javax.validation.Valid

@Controller
class AdminController {

    lateinit var funcionarioRepository: FuncionarioRepository

    @GetMapping("/adm")
    fun getHome(): String {
        return "admin/home"
    }

    @GetMapping("/funcionarios/cadastrar")
    fun cadastrar(funcionario: Funcionario): ModelAndView {
        val mv = ModelAndView("admin/funcionarios/cadastro")
        mv.addObject("funcionarios", funcionario)
        return mv
    }

    @PostMapping("/funcionarios/salvar")
    fun salvar(@Valid funcionario: Funcionario, result: BindingResult): ModelAndView {
        if(result.hasErrors()) {
            return cadastrar(funcionario)
        }

        funcionarioRepository.saveAndFlush(funcionario)
        return cadastrar(funcionario)
    }


    @GetMapping("/funcionarios/listar")
    fun getFuncionarios(): String {
        return "admin/funcionarios/lista"
    }
}