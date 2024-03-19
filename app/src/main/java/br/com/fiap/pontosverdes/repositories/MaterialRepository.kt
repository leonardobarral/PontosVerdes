package br.com.fiap.pontosverdes.repositories

import br.com.fiap.pontosverdes.models.Material

fun getMaterial():List<Material>{
    return listOf(
        Material(nome = "Plástico", enderecos = listOf("01001000","02011000","03021000","04001000")),
        Material(nome = "Papel", enderecos = listOf("05001000","06018000","07024000","08010000")),
        Material(nome = "Vidro", enderecos = listOf("09015000","10005000","11015000","12010000")),
        Material(nome = "Metal", enderecos = listOf("13020000","14020000","15014000","16018000"))
    )
}





