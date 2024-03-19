package br.com.fiap.pontosverdes.pagina04.components

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.material3.minimumInteractiveComponentSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.pontosverdes.models.Endereco
import br.com.fiap.pontosverdes.models.Material
import br.com.fiap.pontosverdes.screens.H1Style
import br.com.fiap.pontosverdes.services.RetrofitFactory
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

@Composable
fun TextPontoverdeMaisProximo(
    material: Material,
    cepPontoVerde: String,
    localizacaoPontoVerde: Endereco,
    updateLocalizacaoPontoVerde: (Endereco) -> Unit,

    ) {

    val callPontoVerde = RetrofitFactory().getCepService().getEnderecobyCep(
        cep = cepPontoVerde
    )

    callPontoVerde.enqueue(object : Callback<Endereco> {
        override fun onResponse(
            call: Call<Endereco>, response: Response<Endereco>
        ) {
            Log.i("FIAP", "onResponse${response.body()}")
            updateLocalizacaoPontoVerde(response.body()!!)
        }

        override fun onFailure(call: Call<Endereco>, t: Throwable) {
            Log.i("FIAP", "onResponse${t.message}")
        }

    })

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .minimumInteractiveComponentSize()
            .padding(vertical = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "O ponto mais próximo para a coleta de ${material.nome} é: ",
            fontSize = 25.sp,
            fontWeight = FontWeight.Medium,
            style = H1Style,
            textAlign = TextAlign.Center,
            fontFamily = FontFamily.SansSerif,
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "${localizacaoPontoVerde.logradouro}, ${localizacaoPontoVerde.bairro}",
            fontSize = 20.sp,
            fontWeight = FontWeight.Medium,
            style = H1Style,
            textAlign = TextAlign.Center,
            fontFamily = FontFamily.SansSerif,
        )


    }
}