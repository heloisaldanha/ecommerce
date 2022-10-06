package com.dev.store.models

import java.io.Serializable
import java.util.Date
import javax.persistence.*

@Entity
@Table(name = "funcionarios")
data class Funcionario(

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long? = null,

    val salario: Double? = null,

    @Temporal(TemporalType.DATE)
    val dataEntrada: Date? = null,
    @Temporal(TemporalType.DATE)
    val dataSaida: Date? = null,

    val cargo: String? = null,
    val cidade: String? = null,
    val logradouro: String? = null,
    val complemento: String? = null,
    val bairro: String? = null,
    val uf: String? = null,
    val cep:  String? = null

) : Serializable
