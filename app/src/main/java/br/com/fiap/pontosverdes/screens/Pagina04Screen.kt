package br.com.fiap.pontosverdes.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.pontosverdes.R
import br.com.fiap.pontosverdes.models.Endereco
import br.com.fiap.pontosverdes.models.Pagina04Model
import br.com.fiap.pontosverdes.pagina04.components.ImagemComponent
import br.com.fiap.pontosverdes.pagina04.components.TextLocalizacao
import br.com.fiap.pontosverdes.pagina04.components.TextPontoverdeMaisProximo
import br.com.fiap.pontosverdes.pagina04.repositoriesMOC.getCep
import br.com.fiap.pontosverdes.repositories.getMaterial

@Composable
fun Pagina04Screen(pagina04Model: Pagina04Model) {


    val material by pagina04Model.material.observeAsState(initial = getMaterial()[1])

    val cepLocalizacao by pagina04Model.cepLocalizacao.observeAsState(initial = getCep().random())
    val localizacao by pagina04Model.localizacao.observeAsState(initial = Endereco())


    val cepPontoVerde by pagina04Model.cepPontoVerde.observeAsState(material.enderecos.random())
    val localizacaoPontoVerde by pagina04Model.localizacaoPontoVerde.observeAsState(initial = Endereco())


    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        ImagemComponent(
            proporcao = 1.48f,
            contentDescription = "Imagem de cidade modernista",
            id = R.drawable.image3
        )


        Spacer(modifier = Modifier.height(30.dp))


        TextLocalizacao(
            cepLocalizacao = cepLocalizacao,
            localizacao = localizacao,
            updateLocalizacao = { pagina04Model.updateLocalizacao(it) }
        )


        Spacer(modifier = Modifier.height(30.dp))


        TextPontoverdeMaisProximo(
            material = material,
            cepPontoVerde = cepPontoVerde,
            localizacaoPontoVerde = localizacaoPontoVerde,
            updateLocalizacaoPontoVerde = { pagina04Model.updateLocalizacaoPontoVerde(it) }
        )


        Spacer(modifier = Modifier.height(30.dp))


        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(80.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Button(
                onClick = { /*TODO*/ }, colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xff4E802D)
                ), shape = RoundedCornerShape(8.dp), modifier = Modifier
                    .height(42.dp)
                    .width(334.dp)

            ) {
                Text(text = "Agendar coleta", fontSize = 20.sp, fontWeight = FontWeight.Medium)
            }
        }

    }
}


