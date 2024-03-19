package br.com.fiap.pontosverdes.services

import br.com.fiap.pontosverdes.models.Endereco
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface EnderecoService {

    @GET("{cep}/json/")
    fun getEnderecobyCep(@Path("cep") cep:String): Call<Endereco>

}