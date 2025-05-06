package com.pmtaller2.a00351519_kevindiaz.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.pmtaller2.a00351519_kevindiaz.ui.components.DishCard
import com.pmtaller2.a00351519_kevindiaz.ui.components.Search
import com.pmtaller2.a00351519_kevindiaz.ui.viewmodel.RestaurantVM
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.LaunchedEffect
import com.pmtaller2.a00351519_kevindiaz.ui.components.BottomNavigationBar
import com.pmtaller2.a00351519_kevindiaz.ui.theme.blue

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OrderScreen(navController: NavController, viewModel: RestaurantVM) {
    var findState = viewModel.FindState.collectAsState()
    val FindText = findState.value
    val orderCartId by viewModel.orderCart.collectAsState()

    val orderCart = orderCartId.mapNotNull { viewModel.dishesOrderById(it) }

    LaunchedEffect(Unit) { viewModel.searchQuery("") }
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Lista de pedidos",
                    style = MaterialTheme.typography.titleLarge)

                }

            )
        },
        content = {
                paddingValues ->

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                val filteredCartItems = orderCart.filter {
                    it.name.contains(findState.value, ignoreCase = true)
                }

                Search(FindText){ SearchQuery ->
                    viewModel.searchQuery(SearchQuery)
                }

                if (filteredCartItems.isEmpty()){
                    Text(
                        text = "No hay platillos disponibles",
                        color = blue,
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
                    items(filteredCartItems) { dish ->
                        DishCard(dish)
                    }
                }
            }

        },

        bottomBar = {BottomNavigationBar(navController)}
    )

}

@Composable
@Preview (showBackground = true)
fun prev(){
    OrderScreen(rememberNavController(), RestaurantVM())
}