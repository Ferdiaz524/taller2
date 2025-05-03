package com.pmtaller2.a00351519_kevindiaz.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Search(searchState: String, onValueChange: (String) -> Unit){
    OutlinedTextField(
        value = searchState,
        onValueChange = { newText -> onValueChange(newText) },
        label = { Text("Buscar platillo") },
        leadingIcon = {
            Icon(
                Icons.Default.Search,
                contentDescription = "Buscar"
            )
        },
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
    )
}