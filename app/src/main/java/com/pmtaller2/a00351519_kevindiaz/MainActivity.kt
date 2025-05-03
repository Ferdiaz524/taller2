package com.pmtaller2.a00351519_kevindiaz

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.pmtaller2.a00351519_kevindiaz.navigation.navigation
import com.pmtaller2.a00351519_kevindiaz.ui.theme._00351519_KevinDiazTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            _00351519_KevinDiazTheme {
                navigation()
            }
        }
    }
}
