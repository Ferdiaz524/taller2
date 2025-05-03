package com.pmtaller2.a00351519_kevindiaz.navigation


import androidx.compose.runtime.Composable
import androidx.navigation.compose.composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.pmtaller2.a00351519_kevindiaz.ui.screens.OrderScreen
import com.pmtaller2.a00351519_kevindiaz.ui.screens.RestaurantMenu
import com.pmtaller2.a00351519_kevindiaz.ui.screens.RestaurantsList
import com.pmtaller2.a00351519_kevindiaz.ui.screens.SearchScreen
import com.pmtaller2.a00351519_kevindiaz.ui.viewmodel.RestaurantVM

@Composable
fun navigation(){
    val navController = rememberNavController()
    val restaurantVM = RestaurantVM()

    NavHost(navController = navController,
        startDestination = Screen.RestaurantsList.route,
        builder = {

            composable(Screen.RestaurantsList.route){
                RestaurantsList(navController, restaurantVM)
            }
            composable(Screen.RestaurantMenu.route){
                    backStackEntry ->
                val restaurantId = backStackEntry.arguments?.getString("restaurantId")?.toInt() ?: 0
                RestaurantMenu(navController,restaurantId, restaurantVM)
            }

            composable(Screen.SearchScreen.route){
                SearchScreen(navController, restaurantVM)
            }

            composable(Screen.OrderScreen.route){
                OrderScreen(navController, restaurantVM)
            }
        })
}