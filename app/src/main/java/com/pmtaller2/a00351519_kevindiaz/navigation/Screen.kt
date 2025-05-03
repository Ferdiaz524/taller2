package com.pmtaller2.a00351519_kevindiaz.navigation

sealed class Screen(val route: String){
    object RestaurantsList: Screen("restaurants_list")
    object RestaurantMenu: Screen("restaurant_menu/{restaurantId}"){
        fun createRoute(restaurantId: Int) = "restaurant_menu/$restaurantId"
    }
    object SearchScreen: Screen("search_screen")
    object OrderScreen: Screen("order_screen")
}