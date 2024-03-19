package br.com.fiap.pontosverdes.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.fiap.pontosverdes.R

@Composable
fun PaginaFinal() {
    Column(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(
                id = R.drawable.image4
            ), contentDescription = "Gato feliz",
            modifier = Modifier
                .fillMaxWidth()
                .height(440.dp)
        )

        Spacer(modifier = Modifier.height(30.dp))
        Text(
            text = "Tudo Certo!",
            style = H1Style,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(8.dp)
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "Obrigado por contribuir com um",
            style = H2Style,
            textAlign = TextAlign.Center,
            color = Color.Gray
        )
        Text(
            text = "planeta mais verde",
            style = H2Style,
            textAlign = TextAlign.Center,
            color = Color.Green
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PaginaFinalPreview() {
    PaginaFinal()
    
}