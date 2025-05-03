package com.pmtaller2.a00351519_kevindiaz.ui.screens

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import com.pmtaller2.a00351519_kevindiaz.data.model.Dish
import com.pmtaller2.a00351519_kevindiaz.ui.components.BottomNavigationBar
import com.pmtaller2.a00351519_kevindiaz.ui.components.DishCard
import com.pmtaller2.a00351519_kevindiaz.ui.components.Search
import com.pmtaller2.a00351519_kevindiaz.ui.theme.black
import com.pmtaller2.a00351519_kevindiaz.ui.theme.blue
import com.pmtaller2.a00351519_kevindiaz.ui.theme.darkBlue
import com.pmtaller2.a00351519_kevindiaz.ui.viewmodel.RestaurantVM

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RestaurantMenu(navController: NavController, restaurantId: Int, restaurantViewModel: RestaurantVM) {
    val restaurant = restaurantViewModel.restaurantsOrderedById(restaurantId)
    var FindState = restaurantViewModel.FindState.collectAsState()
    val FindText =FindState.value

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Column {
                        Text(
                            text = restaurant?.name ?: "",
                            style = MaterialTheme.typography.titleLarge.copy(
                                fontFamily = FontFamily.SansSerif,
                                fontWeight = FontWeight.Bold),
                            color = black

                        )
                        Text(
                            text = restaurant?.description ?: "",
                            style = MaterialTheme.typography.bodySmall,
                            maxLines = 1,
                            color = black
                        )
                    }
                },
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(Icons.Default.Home, contentDescription = "regresar",
                            tint = darkBlue
                        )
                    }
                }
            )
        },
        content = { paddingValues ->
            restaurant?.let { nonNullRestaurant ->
                val filteredDishes = nonNullRestaurant.menu.filter {
                    it.name.contains(FindState.value, ignoreCase = true)
                }

                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(paddingValues),
                    verticalArrangement = Arrangement.Top,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Search(FindText){ SearchQuery ->
                        restaurantViewModel.searchQuery(SearchQuery)
                    }

                    if (filteredDishes.isEmpty()){
                        Text(
                            text = "No hay platillos disponibles",
                            color = black,
                            style = MaterialTheme.typography.bodyLarge,
                            modifier = Modifier.padding(top = 100.dp)
                        )
                    }

                    LazyColumn(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(10.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        items(filteredDishes) { dish ->
                            BuyDish(dish, restaurantViewModel)
                        }
                    }
                }
            }

        },

        bottomBar = {BottomNavigationBar(navController)}
    )
}

@Composable
fun BuyDish(dish: Dish, restaurantViewModel: RestaurantVM) {
    val context = LocalContext.current

    DishCard(dish, onBuyClick = {
        restaurantViewModel.addOrderCart(dish)
        Toast.makeText(context, "${dish.name} agregado al carrito", Toast.LENGTH_SHORT).show()

    })
}




@Preview(showBackground = true)
@Composable
fun PreviewRestaurantScreen() {
    val restaurantViewModel = RestaurantVM()

    val restaurantId = 2

    com.pmtaller2.a00351519_kevindiaz.ui.screens.RestaurantMenu(
        navController = rememberNavController(),
        restaurantId = restaurantId,
        restaurantViewModel = restaurantViewModel
    )
}
