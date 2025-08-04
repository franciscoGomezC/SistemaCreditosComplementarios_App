package com.example.historialacreditacionprueba

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.historialacreditacionprueba.data.AppDataContainer
import com.example.historialacreditacionprueba.ui.theme.HistorialAcreditacionPruebaTheme

class MainActivity : ComponentActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        // Crea manualmente el AppContainer
        val appContainer = AppDataContainer(applicationContext)


        setContent {
            HistorialAcreditacionPruebaTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                )
                {
                    DepartamentoApp()
                }
            }
        }
    }
}
