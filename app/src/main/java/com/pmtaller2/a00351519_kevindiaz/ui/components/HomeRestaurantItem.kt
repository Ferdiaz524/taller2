package com.pmtaller2.a00351519_kevindiaz.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.pmtaller2.a00351519_kevindiaz.R
import com.pmtaller2.a00351519_kevindiaz.data.model.Restaurant
import com.pmtaller2.a00351519_kevindiaz.ui.theme.blue

@Composable
fun RestaurantCard(
    restaurant: Restaurant,
    onRestaurantClick: () -> Unit
) {
    Card(
        modifier = Modifier
            .padding(10.dp)
            .size(185.dp, 150.dp)
            .clickable {
                onRestaurantClick()
            },
        colors = CardDefaults.cardColors(containerColor = blue)
    ) {
        Column (
            modifier = Modifier
                .padding(8.dp)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            AsyncImage(
                model = restaurant.imageUrl,
                contentDescription = "Imagen restaurant",
                modifier = Modifier
                    .padding(bottom = 8.dp)
                    .size(90.dp,90.dp),
                contentScale = ContentScale.Fit,
                error = painterResource(R.drawable.placeholder)
            )
            Text(
                text = restaurant.name,
                style =MaterialTheme.typography.bodyLarge,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
        }
    }
}