package br.com.fiap.pontosverdes.models

data class Endereco(
    val cep: String = "",
    val logradouro: String = "",
    val localidade: String = "",
    val bairro: String = "",
    val uf: String = "",
)