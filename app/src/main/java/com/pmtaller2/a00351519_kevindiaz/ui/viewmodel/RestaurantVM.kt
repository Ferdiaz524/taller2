package com.pmtaller2.a00351519_kevindiaz.ui.viewmodel

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import com.pmtaller2.a00351519_kevindiaz.data.dataSource.DataSource.restaurants
import com.pmtaller2.a00351519_kevindiaz.data.model.Dish
import com.pmtaller2.a00351519_kevindiaz.data.model.Restaurant
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class RestaurantVM : ViewModel(){

    //Definicion de estados
    private val _restaurantsCategory = MutableStateFlow<Map<String, List<Restaurant>>>(emptyMap())
    val restaurantsCategory: StateFlow<Map<String, List<Restaurant>>> = _restaurantsCategory

    //Datos base
    private val _restaurants = restaurants
    private val _dishes =restaurants.flatMap { it.menu }

    //Historial de carrito de compras
    private val _orderCartId = mutableStateListOf<Int>()
    private val _orderCartStateFlow = MutableStateFlow<List<Int>>(emptyList())
    val orderCart: StateFlow<List<Int>> get()= _orderCartStateFlow

    //Estado para la busqueda de platillo
    private val _FindState = MutableStateFlow("")
    val FindState: StateFlow<String> = _FindState

    //Inicializacion
    init {
        CategoryRestaurants(_restaurants)
    }

    //Funcion para agrupar restaurantes por categoria
    fun CategoryRestaurants(restaurant: List<Restaurant>) {
        val categoryMap = mapOf(
            "Comida Rápida" to "comida rápida",
            "Comida Mexicana" to "comida mexicana",
            "Comida Italiana" to "comida italiana",
            "Comida Asiática" to "comida asiática",
            "Comida Saludable" to "comida saludable",
            "Postres y Dulces" to "postres",
            "Bebidas" to "bebidas"
        )

        val result = mutableMapOf<String, MutableList<Restaurant>>()
        categoryMap.keys.forEach { result[it] = mutableListOf() }

        for (restaurant in restaurant){
            val lowerCategories = restaurant.categories.map { it.lowercase() }
            categoryMap.forEach { (prettyName, keyword) ->
                if (lowerCategories.any() { it.contains(keyword) }){
                    result[prettyName]?.add(restaurant)
                }
            }
        }
        _restaurantsCategory.value = result
    }

    fun restaurantsOrderedById (id:Int): Restaurant? {
        return _restaurants.find{it.id == id}
    }

    fun addOrderCart(dish: Dish){
        _orderCartId.add(dish.id)
        _orderCartStateFlow.value = _orderCartId.toList()
    }

    fun dishesOrderById (id:Int): Dish? {
        return _dishes.find{it.id == id}
    }

    fun searchQuery(searchQuery: String){
        _FindState.value = searchQuery
    }

    fun advancedSearcher(searchQuery: String): List<Restaurant>{
        return _restaurants.filter { restaurant ->
            val findName = restaurant.name.contains(searchQuery, ignoreCase = true)

            val findCategory = restaurant.categories.any{
                it.contains(searchQuery, ignoreCase = true)
            }
            val findDish = restaurant.menu.any {
                it.name.contains(searchQuery, ignoreCase = true)
            }
            val findDishDescription = restaurant.menu.any{
                it.description.contains(searchQuery, ignoreCase = true)
            }

            findName || findCategory || findDish || findDishDescription
        }
    }

}