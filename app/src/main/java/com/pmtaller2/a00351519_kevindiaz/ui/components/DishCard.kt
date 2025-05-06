package com.pmtaller2.a00351519_kevindiaz.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.pmtaller2.a00351519_kevindiaz.R
import com.pmtaller2.a00351519_kevindiaz.data.model.Dish
import com.pmtaller2.a00351519_kevindiaz.ui.theme.darkBlue
import com.pmtaller2.a00351519_kevindiaz.ui.theme.whiteA

@Composable
fun DishCard(
    dish: Dish,
    onBuyClick: (() -> Unit)? = null
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
            AsyncImage(
                model = dish.imageUrl,
                contentDescription = "Imagen de platillo",
                modifier = Modifier
                    .size(100.dp,100.dp)
                    .padding(2.dp),
                contentScale = ContentScale.Fit,
                error = painterResource(R.drawable.placeholder_dish)
            )

            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(start = 16.dp),
                horizontalAlignment = Alignment.Start
            ) {
                Text(text = dish.name, modifier = Modifier.padding(bottom = 4.dp),
                    style = MaterialTheme.typography.titleMedium

                )
                Text(text = dish.description,
                    style = MaterialTheme.typography.bodyMedium
                    )
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
