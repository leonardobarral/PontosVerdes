package br.com.fiap.pontosverdes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import br.com.fiap.pontosverdes.models.Pagina04Model
import br.com.fiap.pontosverdes.screens.Pagina04Screen
import br.com.fiap.pontosverdes.ui.theme.PontosVerdesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PontosVerdesTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    // PaginaInicial()
                    // PaginaFinal()
                     Pagina04Screen(Pagina04Model())
                }
            }
        }
    }
}













