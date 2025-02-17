package com.example.a235150701111034_salmasabilakhairunnisa_aplikasi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.a235150701111034_salmasabilakhairunnisa_aplikasi.ui.theme._235150701111034_SalmaSabilaKhairunnisa_AplikasiTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            _235150701111034_SalmaSabilaKhairunnisa_AplikasiTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Salma Sabila Khairunnisa",
                        nim = "235150701111034",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, nim: String, modifier: Modifier = Modifier) {
    Text(
        text = "Nama: $name\nNIM: $nim",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    _235150701111034_SalmaSabilaKhairunnisa_AplikasiTheme {
        Greeting("Salma Sabila Khairunnisa", nim = "235150701111034")
    }
}
