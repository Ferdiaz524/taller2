package com.pmtaller2.a00351519_kevindiaz.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import coil.compose.AsyncImage
import com.pmtaller2.a00351519_kevindiaz.navigation.Screen
import com.pmtaller2.a00351519_kevindiaz.ui.viewmodel.RestaurantVM
import com.pmtaller2.a00351519_kevindiaz.R
import com.pmtaller2.a00351519_kevindiaz.ui.components.BottomNavigationBar
import com.pmtaller2.a00351519_kevindiaz.ui.theme.Purple80
import com.pmtaller2.a00351519_kevindiaz.ui.theme.black
import com.pmtaller2.a00351519_kevindiaz.ui.theme.blue
import com.pmtaller2.a00351519_kevindiaz.ui.theme.lightPurple
import com.pmtaller2.a00351519_kevindiaz.ui.theme.whiteB

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RestaurantsList(navController: NavController, viewModel: RestaurantVM) {
    val categories =viewModel.restaurantsCategory.collectAsState().value
    Scaffold (
        topBar = {
            TopAppBar(
                title = { Text("FoodSpot",
                    style = MaterialTheme.typography.titleLarge.copy(
                            fontFamily = FontFamily.Monospace,
                            fontWeight = FontWeight.Bold,
                            color = black
                    ))
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
                            modifier = Modifier.padding(vertical = 8.dp),
                            fontWeight = FontWeight.Bold,
                            fontSize = 19.sp,
                            color = black
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
                                Card(
                                    modifier = Modifier
                                        .padding(10.dp)
                                        .clickable {
                                            navController.navigate(Screen.RestaurantMenu.createRoute(restaurant.id))
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
                                                .size(90.dp),
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