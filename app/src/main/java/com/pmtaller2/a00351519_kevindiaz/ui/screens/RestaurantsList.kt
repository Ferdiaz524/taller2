package com.pmtaller2.a00351519_kevindiaz.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.pmtaller2.a00351519_kevindiaz.navigation.Screen
import com.pmtaller2.a00351519_kevindiaz.ui.viewmodel.RestaurantVM
import com.pmtaller2.a00351519_kevindiaz.ui.components.BottomNavigationBar
import com.pmtaller2.a00351519_kevindiaz.ui.components.RestaurantCard

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RestaurantsList(navController: NavController, viewModel: RestaurantVM) {
    val categories =viewModel.restaurantsCategory.collectAsState().value
    Scaffold (
        topBar = {
            TopAppBar(
                title = { Text("FoodSpot",
                    style = MaterialTheme.typography.titleLarge)
                }
            )
        },
        bottomBar = {BottomNavigationBar(navController)}
    ){
        paddingValues ->
        Column (
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            LazyColumn (
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp)
            ) {
                categories.forEach { (category, restaurants) ->
                    item {
                        Text(
                            text = category,
                            style = MaterialTheme.typography.titleLarge,
                            modifier = Modifier.padding(vertical = 8.dp)
                        )
                    }

                    item {
                        LazyRow(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(8.dp)
                                .clip(RoundedCornerShape(25.dp)),
                            horizontalArrangement = Arrangement.Center
                        ) {
                            items(restaurants) { restaurant ->
                                RestaurantCard(restaurant){
                                    navController.navigate(Screen.RestaurantMenu.createRoute(restaurant.id))
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewCategoryScreen() {
    RestaurantsList(
        navController = rememberNavController(),
        viewModel = RestaurantVM()
    )
}