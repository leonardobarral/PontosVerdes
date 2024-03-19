package br.com.fiap.pontosverdes.pagina04.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource

@Composable
fun ImagemComponent(
    proporcao: Float,
    contentDescription: String,
    id: Int
) {
    Row(
        modifier = Modifier.fillMaxWidth()
    ) {
        Image(
            painter = painterResource(id = id),
            modifier = Modifier
                .fillMaxWidth()
                .aspectRatio(proporcao),
            contentDescription = contentDescription
        )

    }
}