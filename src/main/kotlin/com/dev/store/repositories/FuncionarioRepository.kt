package com.dev.store.repositories

import com.dev.store.models.Funcionario
import org.springframework.data.jpa.repository.JpaRepository

interface FuncionarioRepository: JpaRepository<Funcionario, Long>