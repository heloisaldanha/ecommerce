package com.dev.store.repositories

import com.dev.store.models.Funcionario
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

interface FuncionarioRepository: JpaRepository<Funcionario, Long>