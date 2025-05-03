package com.pmtaller2.a00351519_kevindiaz.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.pmtaller2.a00351519_kevindiaz.data.model.Dish
import com.pmtaller2.a00351519_kevindiaz.ui.theme.black
import com.pmtaller2.a00351519_kevindiaz.ui.theme.blue
import com.pmtaller2.a00351519_kevindiaz.ui.theme.darkBlue
import com.pmtaller2.a00351519_kevindiaz.ui.theme.whiteA
import com.pmtaller2.a00351519_kevindiaz.ui.theme.whiteB

@Composable
fun DishCard(
    dish: Dish,
    onBuyClick: (() -> Unit)? = null // lo use para que no siempre este activo el boton buy
) {
    Card(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth()
            .background(whiteA)
    ) {
        Row(
            modifier = Modifier.padding(8.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = rememberAsyncImagePainter(dish.imageUrl),
                contentDescription = "Imagen de platillo",
                modifier = Modifier
                    .size(100.dp)
                    .padding(2.dp),
                contentScale = ContentScale.Fit
            )

            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(start = 16.dp),
                horizontalAlignment = Alignment.Start
            ) {
                Text(text = dish.name, modifier = Modifier.padding(bottom = 4.dp),
                    style = MaterialTheme.typography.titleMedium.copy(
                        fontFamily = FontFamily.SansSerif,
                        fontWeight = FontWeight.Bold),
                    color = black

                )
                Text(text = dish.description, color = darkBlue)
            }

            if (onBuyClick != null) {
                IconButton (onClick = onBuyClick) {
                    Icon(
                        Icons.Default.AddCircle,
                        contentDescription = "Agregar al carrito",
                        tint = darkBlue
                    )
                }
            }
        }
    }
}
