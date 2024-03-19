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
import br.com.fiap.pontosverdes.services.RetrofitFactory
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

@Composable
fun TextLocalizacao(
    cepLocalizacao:String,
    localizacao:Endereco,
    updateLocalizacao:(Endereco) -> Unit,
) {

    val callLocalizacao = RetrofitFactory().getCepService().getEnderecobyCep(
        cep = cepLocalizacao
    )

    callLocalizacao.enqueue(object : Callback<Endereco> {
        override fun onResponse(
            call: Call<Endereco>, response: Response<Endereco>
        ) {
            Log.i("FIAP","onResponse${response.body()}")
            updateLocalizacao(response.body()!!)
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
        //"Sua localização é
        Text(
            text = "Sua localição é",
            fontSize = 34.sp,
            fontWeight = FontWeight.Medium,
            textAlign = TextAlign.Center,
            fontFamily = FontFamily.SansSerif,
        )
        Spacer(modifier = Modifier.height(15.dp))
        Text(

            text = "${localizacao.logradouro}, ${localizacao.bairro}",
            fontSize = 20.sp,
            fontWeight = FontWeight.Medium,
            textAlign = TextAlign.Center,
            fontFamily = FontFamily.SansSerif,
        )
    }
}