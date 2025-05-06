package com.pmtaller2.a00351519_kevindiaz.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.pmtaller2.a00351519_kevindiaz.navigation.Screen
import com.pmtaller2.a00351519_kevindiaz.ui.theme.blue
import com.pmtaller2.a00351519_kevindiaz.ui.theme.darkBlue

@Composable
fun BottomNavigationBar(navController: NavController) {
    BottomAppBar(
        containerColor = blue,
        tonalElevation = 4.dp
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            NavigationIconButton(icon = Icons.Default.List) {
                navController.navigate(Screen.RestaurantsList.route)
            }

            NavigationIconButton(icon = Icons.Default.Search) {
                navController.navigate(Screen.SearchScreen.route)
            }

            NavigationIconButton(icon = Icons.Default.ShoppingCart) {
                navController.navigate(Screen.OrderScreen.route)
            }
        }
    }
}

@Composable
fun NavigationIconButton(icon: androidx.compose.ui.graphics.vector.ImageVector, onClick: () -> Unit) {
    IconButton(onClick = onClick) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            tint = darkBlue
        )
    }
}
