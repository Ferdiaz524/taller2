package com.pmtaller2.a00351519_kevindiaz.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.pmtaller2.a00351519_kevindiaz.navigation.Screen
import com.pmtaller2.a00351519_kevindiaz.ui.components.BottomNavigationBar
import com.pmtaller2.a00351519_kevindiaz.ui.components.Search
import com.pmtaller2.a00351519_kevindiaz.ui.viewmodel.RestaurantVM
import androidx.compose.foundation.lazy.items
import com.pmtaller2.a00351519_kevindiaz.ui.components.RestaurantCard
import com.pmtaller2.a00351519_kevindiaz.ui.theme.blue

@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun SearchScreen(navController: NavController, viewModel: RestaurantVM) {
    var FindState = viewModel.FindState.collectAsState()
    val FindText = FindState.value
    var result = viewModel.advancedSearcher(FindText)

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        "Búsqueda Avanzada",
                        style = MaterialTheme.typography.titleLarge
                    )
                }
            )
        },
        bottomBar = { BottomNavigationBar(navController) },
        content = { paddingValues ->
            Column(
                modifier = Modifier
                    .padding(paddingValues)
                    .fillMaxSize(),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Search(FindText) { SearchQuery ->
                    viewModel.searchQuery(SearchQuery)
                }

                if (FindState.value.isEmpty()) {
                    Text(
                        text = "No hay resultados disponibles",
                        color = blue,
                        style = MaterialTheme.typography.bodyLarge,
                        modifier = Modifier.padding(top = 100.dp)
                    )
                } else {
                    LazyRow(
                        modifier = Modifier
                            .padding(8.dp)
                            .clip(RoundedCornerShape(25.dp)),
                        horizontalArrangement = Arrangement.Center
                    ) {
                        items(result) { restaurant ->
                            RestaurantCard(restaurant){
                                navController.navigate(Screen.RestaurantMenu.createRoute(restaurant.id))
                            }
                        }
                    }
                }
            }
        }
    )
}
