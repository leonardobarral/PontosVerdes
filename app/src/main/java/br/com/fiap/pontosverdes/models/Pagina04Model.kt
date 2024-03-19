package br.com.fiap.pontosverdes.models

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Pagina04Model : ViewModel() {

    //Localização
    private val _localizacao = MutableLiveData<Endereco>()
    var localizacao: LiveData<Endereco> = _localizacao

    fun updateLocalizacao(novoValor: Endereco) {
        _localizacao.value = novoValor
    }

    //Localização do ponto verde mais próximo
    private val _localizacaoPontoVerde = MutableLiveData<Endereco>()
    var localizacaoPontoVerde: LiveData<Endereco> = _localizacaoPontoVerde

    fun updateLocalizacaoPontoVerde(novoValor: Endereco) {
        _localizacaoPontoVerde.value = novoValor
    }

    //Material
    private val _material = MutableLiveData<Material>()
    var material: LiveData<Material> = _material

    fun updateMaterial(novoValor: Material) {
        _material.value = novoValor
    }


    //Cep da Localização atual
    private val _cepLocalizacao = MutableLiveData<String>()
    var cepLocalizacao: LiveData<String> = _cepLocalizacao

    fun updatecepLocalizacao(novoValor: String) {
        _cepLocalizacao.value = novoValor
    }

    //Cep do endereço do Ponto Verde Mais Próximo
    private val _cepPontoVerde = MutableLiveData<String>()
    var cepPontoVerde: LiveData<String> = _cepPontoVerde

    fun updateCepPontoVerde(novoValor: String) {
        _cepPontoVerde.value = novoValor
    }





}