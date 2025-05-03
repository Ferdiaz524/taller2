package com.pmtaller2.a00351519_kevindiaz.data.dataSource

import com.pmtaller2.a00351519_kevindiaz.data.model.Dish
import com.pmtaller2.a00351519_kevindiaz.data.model.Restaurant

object DataSource {
    val restaurants = listOf(
        // Comida Rapida
        Restaurant(
            id = 1,
            name = "BurgerKong",
            description = "Las hamburguesas más monstruosas de la ciudad",
            imageUrl = "https://cdn.pixabay.com/photo/2016/03/05/19/02/hamburgger-1238246_1280.jpg",
            categories = listOf("Comida Rápida", "Hamburguesas"),
            menu = listOf(
                Dish(
                    id = 101,
                    name = "King Kong Burger",
                    description = "Triple carne, bacon, queso cheddar y salsa especial",
                    imageUrl = "https://cdn.pixabay.com/photo/2016/03/05/19/02/hamburhger-1238246_1280.jpg"
                ),
                Dish(
                    id = 102,
                    name = "Clásica con Queso",
                    description = "Carne 100% res, queso americano y vegetales frescos",
                    imageUrl = "https://cdn.pixabay.com/photo/2014/10/19/20/59/hamburger-494706_1280.jpg"
                ),
                Dish(
                    id = 103,
                    name = "Papas Kong",
                    description = "Papas fritas crujientes con salsa de la casa",
                    imageUrl = "https://cdn.pixabay.com/photo/2016/11/20/09/06/bowl-1842294_1280.jpg"
                )
            )
        ),
        Restaurant(
            id = 2,
            name = "McRonald's",
            description = "El sabor que conoces y amas en cada bocado",
            imageUrl = "https://cdn.pixabay.com/photo/2017/09/02/16/05/mcdonalds-2707882_1280.jpg",
            categories = listOf("Comida Rápida", "Hamburguesas"),
            menu = listOf(
                Dish(
                    id = 201,
                    name = "Big Mac",
                    description = "Dos carnes, salsa especial, queso, lechuga y pepinillos",
                    imageUrl = "https://cdn.pixabay.com/photo/2017/09/02/16/05/mcdonalds-2707882_1280.jpg"
                ),
                Dish(
                    id = 202,
                    name = "McNuggets",
                    description = "6 piezas de pollo empanizado crujiente",
                    imageUrl = "https://cdn.pixabay.com/photo/2016/03/05/22/18/food-1239241_1280.jpg"
                ),
                Dish(
                    id = 203,
                    name = "Sundae de Chocolate",
                    description = "Helado suave con salsa de chocolate",
                    imageUrl = "https://cdn.pixabay.com/photo/2018/04/13/21/40/ice-cream-3317797_1280.jpg"
                )
            )
        ),
        Restaurant(
            id = 3,
            name = "WacDonal",
            description = "Hamburguesas artesanales con ingredientes premium",
            imageUrl = "https://cdn.pixabay.com/photo/2016/03/05/20/07/american-1238825_1280.jpg",
            categories = listOf("Comida Rápida", "Hamburguesas"),
            menu = listOf(
                Dish(
                    id = 301,
                    name = "Wac Bacon",
                    description = "Doble carne, bacon crocante y queso ahumado",
                    imageUrl = "https://cdn.pixabay.com/photo/2016/03/05/20/07/american-1238825_1280.jpg"
                ),
                Dish(
                    id = 302,
                    name = "Wac Clásica",
                    description = "Carne angus, pan brioche y vegetales frescos",
                    imageUrl = "https://cdn.pixabay.com/photo/2016/11/18/14/39/beans-1834984_1280.jpg"
                ),
                Dish(
                    id = 303,
                    name = "Batido de Vainilla",
                    description = "Batido cremoso hecho con helado de vainilla natural",
                    imageUrl = "https://cdn.pixabay.com/photo/2017/01/11/11/33/cake-1971552_1280.jpg"
                )
            )
        ),

        // Comida Mexicana
        Restaurant(
            id = 4,
            name = "Taco Fiesta",
            description = "Auténticos sabores mexicanos en cada taco",
            imageUrl = "https://cdn.pixabay.com/photo/2017/02/16/10/23/tacos-2070778_1280.jpg",
            categories = listOf("Comida Mexicana", "Tacos"),
            menu = listOf(
                Dish(
                    id = 401,
                    name = "Tacos al Pastor",
                    description = "Tortilla de maíz con carne marinada y piña",
                    imageUrl = "https://cdn.pixabay.com/photo/2017/02/16/10/23/tacos-2070778_1280.jpg"
                ),
                Dish(
                    id = 402,
                    name = "Quesadillas",
                    description = "Tortilla rellena de queso fundido y tu elección de guisado",
                    imageUrl = "https://cdn.pixabay.com/photo/2017/06/01/18/46/quesadillas-2363899_1280.jpg"
                ),
                Dish(
                    id = 403,
                    name = "Guacamole",
                    description = "Tradicional preparado con aguacate, cilantro y limón",
                    imageUrl = "https://cdn.pixabay.com/photo/2017/06/01/18/46/quesadillas-2363899_1280.jpg"
                )
            )
        ),
        Restaurant(
            id = 5,
            name = "El Mariachi",
            description = "Cocina tradicional mexicana en un ambiente festivo",
            imageUrl = "https://cdn.pixabay.com/photo/2015/07/11/14/53/platter-840957_1280.jpg",
            categories = listOf("Comida Mexicana", "Platos Fuertes"),
            menu = listOf(
                Dish(
                    id = 501,
                    name = "Enchiladas Verdes",
                    description = "Tortillas rellenas bañadas en salsa verde",
                    imageUrl = "https://cdn.pixabay.com/photo/2015/07/11/14/53/platter-840957_1280.jpg"
                ),
                Dish(
                    id = 502,
                    name = "Chiles Rellenos",
                    description = "Chiles poblanos rellenos de queso y carne",
                    imageUrl = "https://cdn.pixabay.com/photo/2015/09/15/14/13/chiles-rellenos-940654_1280.jpg"
                ),
                Dish(
                    id = 503,
                    name = "Mole Poblano",
                    description = "Pollo bañado en la tradicional salsa de mole",
                    imageUrl = "https://cdn.pixabay.com/photo/2017/03/16/16/53/mexican-food-2149275_1280.jpg"
                )
            )
        ),
        Restaurant(
            id = 6,
            name = "La Cantina",
            description = "Los mejores antojitos mexicanos acompañados de buen tequila",
            imageUrl = "https://cdn.pixabay.com/photo/2016/03/27/21/59/mexican-1284456_1280.jpg",
            categories = listOf("Comida Mexicana", "Antojitos"),
            menu = listOf(
                Dish(
                    id = 601,
                    name = "Nachos Supreme",
                    description = "Totopos con queso, frijoles, guacamole y crema",
                    imageUrl = "https://cdn.pixabay.com/photo/2016/03/27/21/59/mexican-1284456_1280.jpg"
                ),
                Dish(
                    id = 602,
                    name = "Flautas",
                    description = "Tortillas enrolladas y fritas rellenas de pollo",
                    imageUrl = "https://cdn.pixabay.com/photo/2017/06/29/20/09/mexican-2456038_1280.jpg"
                ),
                Dish(
                    id = 603,
                    name = "Sopes",
                    description = "Base de masa con frijoles, carne y vegetales",
                    imageUrl = "https://cdn.pixabay.com/photo/2017/05/11/19/44/fresh-2305192_1280.jpg"
                )
            )
        ),

        // Comida Italiana
        Restaurant(
            id = 7,
            name = "Pizza Planet",
            description = "Las mejores pizzas del universo",
            imageUrl = "https://cdn.pixabay.com/photo/2017/12/09/08/18/pizza-3007395_1280.jpg",
            categories = listOf("Comida Italiana", "Pizzas"),
            menu = listOf(
                Dish(
                    id = 701,
                    name = "Pizza Pepperoni",
                    description = "Clásica pizza con pepperoni y queso mozzarella",
                    imageUrl = "https://cdn.pixabay.com/photo/2017/12/09/08/18/pizza-3007395_1280.jpg"
                ),
                Dish(
                    id = 702,
                    name = "Pizza Vegetariana",
                    description = "Pizza saludable con verduras frescas",
                    imageUrl = "https://cdn.pixabay.com/photo/2017/02/15/10/57/pizza-2068272_1280.jpg"
                ),
                Dish(
                    id = 703,
                    name = "Lasagna",
                    description = "Capas de pasta, carne y queso horneadas",
                    imageUrl = "https://cdn.pixabay.com/photo/2017/02/15/11/12/pasta-2065781_1280.jpg"
                )
            )
        ),
        Restaurant(
            id = 8,
            name = "La Pasta",
            description = "Pastas frescas hechas a mano con ingredientes importados",
            imageUrl = "https://cdn.pixabay.com/photo/2018/07/18/19/12/pasta-3547078_1280.jpg",
            categories = listOf("Comida Italiana", "Pastas"),
            menu = listOf(
                Dish(
                    id = 801,
                    name = "Spaghetti Carbonara",
                    description = "Pasta con salsa cremosa de huevo, queso y panceta",
                    imageUrl = "https://cdn.pixabay.com/photo/2018/07/18/19/12/pasta-3547078_1280.jpg"
                ),
                Dish(
                    id = 802,
                    name = "Ravioli de Ricotta",
                    description = "Rellenos de queso ricotta y espinacas",
                    imageUrl = "https://cdn.pixabay.com/photo/2015/03/05/18/02/ravioli-660622_1280.jpg"
                ),
                Dish(
                    id = 803,
                    name = "Tiramisú",
                    description = "Postre italiano clásico con café y mascarpone",
                    imageUrl = "https://cdn.pixabay.com/photo/2017/10/28/19/07/tiramisu-2897900_1280.jpg"
                )
            )
        ),
        Restaurant(
            id = 9,
            name = "Bella Napoli",
            description = "Auténtica cocina napolitana en un ambiente acogedor",
            imageUrl = "https://cdn.pixabay.com/photo/2016/11/23/18/31/pasta-1854245_1280.jpg",
            categories = listOf("Comida Italiana", "Especialidades"),
            menu = listOf(
                Dish(
                    id = 901,
                    name = "Risotto al Funghi",
                    description = "Arroz cremoso con hongos porcini",
                    imageUrl = "https://cdn.pixabay.com/photo/2016/11/23/18/31/pasta-1854245_1280.jpg"
                ),
                Dish(
                    id = 902,
                    name = "Ossobuco",
                    description = "Crujiente por fuera y jugoso por dentro con gremolata",
                    imageUrl = "https://cdn.pixabay.com/photo/2016/02/27/18/53/meat-1226042_1280.jpg"
                ),
                Dish(
                    id = 903,
                    name = "Panna Cotta",
                    description = "Postre cremoso con salsa de frutos rojos",
                    imageUrl = "https://cdn.pixabay.com/photo/2018/03/04/20/08/panna-cotta-3199081_1280.jpg"
                )
            )
        ),

        // Comida Asiatica
        Restaurant(
            id = 10,
            name = "Wok This Way",
            description = "Sabores auténticos del lejano oriente",
            imageUrl = "https://cdn.pixabay.com/photo/2015/03/26/10/24/sushi-691164_1280.jpg",
            categories = listOf("Comida Asiática", "China"),
            menu = listOf(
                Dish(
                    id = 1001,
                    name = "Pollo al Curry",
                    description = "Trozos de pollo en salsa de curry con vegetales",
                    imageUrl = "https://cdn.pixabay.com/photo/2017/06/30/04/58/chicken-2456629_1280.jpg"
                ),
                Dish(
                    id = 1002,
                    name = "Cerdo Agridulce",
                    description = "Cerdo crujiente con salsa agridulce",
                    imageUrl = "https://cdn.pixabay.com/photo/2016/10/25/13/29/sweet-and-sour-pork-1768993_1280.jpg"
                ),
                Dish(
                    id = 1003,
                    name = "Rollitos de Primavera",
                    description = "Vegetales frescos envueltos en masa crujiente",
                    imageUrl = "https://cdn.pixabay.com/photo/2014/01/16/02/47/spring-rolls-246670_1280.jpg"
                )
            )
        ),
        Restaurant(
            id = 11,
            name = "Sushi Express",
            description = "Sushi fresco preparado al momento",
            imageUrl = "https://cdn.pixabay.com/photo/2015/03/26/10/24/sushi-691164_1280.jpg",
            categories = listOf("Comida Asiática", "Japonesa"),
            menu = listOf(
                Dish(
                    id = 1101,
                    name = "Sushi Variado",
                    description = "12 piezas de sushi variado (4 nigiri, 4 maki, 4 sashimi)",
                    imageUrl = "https://cdn.pixabay.com/photo/2015/03/26/10/24/sushi-691164_1280.jpg"
                ),
                Dish(
                    id = 1102,
                    name = "Ramen de Cerdo",
                    description = "Fideos en caldo de cerdo con huevo y vegetales",
                    imageUrl = "https://cdn.pixabay.com/photo/2017/02/01/11/27/ramen-2029712_1280.jpg"
                ),
                Dish(
                    id = 1103,
                    name = "Tempura",
                    description = "Vegetales y camarones empanizados ligeramente",
                    imageUrl = "https://cdn.pixabay.com/photo/2015/09/20/13/04/tempura-947110_1280.jpg"
                )
            )
        ),
        Restaurant(
            id = 12,
            name = "Thai Garden",
            description = "Auténtica cocina tailandesa con ingredientes frescos",
            imageUrl = "https://cdn.pixabay.com/photo/2018/04/13/17/14/thai-food-3317065_1280.jpg",
            categories = listOf("Comida Asiática", "Tailandesa"),
            menu = listOf(
                Dish(
                    id = 1201,
                    name = "Pad Thai",
                    description = "Fideos de arroz salteados con huevo y vegetales",
                    imageUrl = "https://cdn.pixabay.com/photo/2018/04/13/17/14/thai-food-3317065_1280.jpg"
                ),
                Dish(
                    id = 1202,
                    name = "Tom Yum Goong",
                    description = "Sopa picante con camarones y hierbas tailandesas",
                    imageUrl = "https://cdn.pixabay.com/photo/2017/04/23/07/36/tom-yum-goong-2253171_1280.jpg"
                ),
                Dish(
                    id = 1203,
                    name = "Mango Sticky Rice",
                    description = "Postre tradicional con mango y arroz glutinoso",
                    imageUrl = "https://cdn.pixabay.com/photo/2017/05/08/13/44/mango-sticky-rice-2295561_1280.jpg"
                )
            )
        ),

        // Comida Saludable
        Restaurant(
            id = 13,
            name = "Green Life",
            description = "Comida saludable que nutre tu cuerpo y alma",
            imageUrl = "https://cdn.pixabay.com/photo/2017/10/09/19/29/eat-2834549_1280.jpg",
            categories = listOf("Comida Saludable", "Ensaladas"),
            menu = listOf(
                Dish(
                    id = 1301,
                    name = "Ensalada César",
                    description = "Lechuga romana, croutons, queso parmesano y aderezo césar",
                    imageUrl = "https://cdn.pixabay.com/photo/2017/10/09/19/29/eat-2834549_1280.jpg"
                ),
                Dish(
                    id = 1302,
                    name = "Bowl de Quinoa",
                    description = "Quinoa con aguacate, tomate, pepino y aderezo de limón",
                    imageUrl = "https://cdn.pixabay.com/photo/2016/11/23/18/31/breakfast-1853301_1280.jpg"
                ),
                Dish(
                    id = 1303,
                    name = "Smoothie Verde",
                    description = "Espinaca, piña, manzana y jengibre",
                    imageUrl = "https://cdn.pixabay.com/photo/2017/02/04/12/25/smoothie-2038658_1280.jpg"
                )
            )
        ),
        Restaurant(
            id = 14,
            name = "Veggie Delight",
            description = "Deliciosas opciones 100% vegetales",
            imageUrl = "https://cdn.pixabay.com/photo/2015/11/23/08/32/vegetables-1057899_1280.jpg",
            categories = listOf("Comida Saludable", "Vegetariano"),
            menu = listOf(
                Dish(
                    id = 1401,
                    name = "Hamburguesa de Lentejas",
                    description = "Hamburguesa vegana de lentejas con pan integral",
                    imageUrl = "https://cdn.pixabay.com/photo/2016/03/05/19/02/hamburger-1238246_1280.jpg"
                ),
                Dish(
                    id = 1402,
                    name = "Wrap de Garbanzos",
                    description = "Tortilla integral rellena de garbanzos y vegetales",
                    imageUrl = "https://cdn.pixabay.com/photo/2017/06/02/12/32/wrap-2365890_1280.jpg"
                ),
                Dish(
                    id = 1403,
                    name = "Ensalada de Frutas",
                    description = "Mezcla de frutas frescas de temporada",
                    imageUrl = "https://cdn.pixabay.com/photo/2017/06/02/18/24/fruit-2367029_1280.jpg"
                )
            )
        ),
        Restaurant(
            id = 15,
            name = "Superfood",
            description = "Alimentos ricos en nutrientes para maximizar tu energía",
            imageUrl = "https://cdn.pixabay.com/photo/2015/11/23/08/32/vegetables-1057899_1280.jpg",
            categories = listOf("Comida Saludable", "Superfoods"),
            menu = listOf(
                Dish(
                    id = 1501,
                    name = "Açaí Bowl",
                    description = "Base de açaí con granola, banana y frutos rojos",
                    imageUrl = "https://cdn.pixabay.com/photo/2017/05/23/17/54/breakfast-2337669_1280.jpg"
                ),
                Dish(
                    id = 1502,
                    name = "Avocado Toast",
                    description = "Pan integral con aguacate, semillas y huevo pochado",
                    imageUrl = "https://cdn.pixabay.com/photo/2017/03/23/19/57/avocado-toast-2169465_1280.jpg"
                ),
                Dish(
                    id = 1503,
                    name = "Chía Pudding",
                    description = "Semillas de chía con leche de almendras y frutas",
                    imageUrl = "https://cdn.pixabay.com/photo/2017/05/23/17/54/breakfast-2337669_1280.jpg"
                )
            )
        ),

        // Postres y Dulces
        Restaurant(
            id = 16,
            name = "Sweet Heaven",
            description = "Para los amantes del dulce",
            imageUrl = "https://cdn.pixabay.com/photo/2014/05/23/23/17/dessert-352475_1280.jpg",
            categories = listOf("Postres y Dulces", "Repostería"),
            menu = listOf(
                Dish(
                    id = 1601,
                    name = "Cheesecake de Frutos Rojos",
                    description = "Tarta de queso con coulis de frutos rojos",
                    imageUrl = "https://cdn.pixabay.com/photo/2014/05/23/23/17/dessert-352475_1280.jpg"
                ),
                Dish(
                    id = 1602,
                    name = "Brownie con Helado",
                    description = "Brownie caliente con helado de vainilla",
                    imageUrl = "https://cdn.pixabay.com/photo/2017/01/11/11/33/cake-1971552_1280.jpg"
                ),
                Dish(
                    id = 1603,
                    name = "Tiramisú Clásico",
                    description = "Capas de bizcocho, café y crema de mascarpone",
                    imageUrl = "https://cdn.pixabay.com/photo/2017/10/28/19/07/tiramisu-2897900_1280.jpg"
                )
            )
        ),
        Restaurant(
            id = 17,
            name = "Donut World",
            description = "El paraíso de las donas artesanales",
            imageUrl = "https://cdn.pixabay.com/photo/2018/04/07/15/03/donuts-3299084_1280.jpg",
            categories = listOf("Postres y Dulces", "Donas"),
            menu = listOf(
                Dish(
                    id = 1701,
                    name = "Donut Glaseada",
                    description = "Donut esponjosa con glaseado de colores",
                    imageUrl = "https://cdn.pixabay.com/photo/2018/04/07/15/03/donuts-3299084_1280.jpg"
                ),
                Dish(
                    id = 1702,
                    name = "Donut de Chocolate",
                    description = "Cubierta de chocolate con sprinkles",
                    imageUrl = "https://cdn.pixabay.com/photo/2016/11/22/18/52/doughnut-1850013_1280.jpg"
                ),
                Dish(
                    id = 1703,
                    name = "Donut Rellena",
                    description = "Rellena de crema pastelera o mermelada",
                    imageUrl = "https://cdn.pixabay.com/photo/2016/11/22/18/52/doughnut-1850013_1280.jpg"
                )
            )
        ),
        Restaurant(
            id = 18,
            name = "GelatoLand",
            description = "Helado artesanal italiano con sabores creativos",
            imageUrl = "https://cdn.pixabay.com/photo/2018/04/13/21/40/ice-cream-3317797_1280.jpg",
            categories = listOf("Postres y Dulces", "Helados"),
            menu = listOf(
                Dish(
                    id = 1801,
                    name = "Gelato de Vainilla",
                    description = "Hecho con vainas de vainilla de Madagascar",
                    imageUrl = "https://cdn.pixabay.com/photo/2018/04/13/21/40/ice-cream-3317797_1280.jpg"
                ),
                Dish(
                    id = 1802,
                    name = "Gelato de Chocolate",
                    description = "Chocolate belga 70% cacao",
                    imageUrl = "https://cdn.pixabay.com/photo/2015/09/09/20/32/ice-cream-933674_1280.jpg"
                ),
                Dish(
                    id = 1803,
                    name = "Sorbete de Limón",
                    description = "Refrescante y ligero, sin lácteos",
                    imageUrl = "https://cdn.pixabay.com/photo/2015/09/09/20/32/ice-cream-933674_1280.jpg"
                )
            )
        ),

        // Bebidas
        Restaurant(
            id = 19,
            name = "Coffee Lab",
            description = "Café de especialidad tostado artesanalmente",
            imageUrl = "https://cdn.pixabay.com/photo/2015/10/12/14/54/coffee-983955_1280.jpg",
            categories = listOf("Bebidas", "Café"),
            menu = listOf(
                Dish(
                    id = 1901,
                    name = "Espresso",
                    description = "Café concentrado recién molido",
                    imageUrl = "https://cdn.pixabay.com/photo/2015/10/12/14/54/coffee-983955_1280.jpg"
                ),
                Dish(
                    id = 1902,
                    name = "Cappuccino",
                    description = "Espresso con leche vaporizada y espuma",
                    imageUrl = "https://cdn.pixabay.com/photo/2017/03/31/14/32/cappuccino-2192253_1280.jpg"
                ),
                Dish(
                    id = 1903,
                    name = "Latte Art",
                    description = "Café con leche y diseño artístico en la espuma",
                    imageUrl = "https://cdn.pixabay.com/photo/2015/07/02/10/23/writing-828911_1280.jpg"
                )
            )
        ),
        Restaurant(
            id = 20,
            name = "Tea House",
            description = "Té de burbujas con sabores innovadores",
            imageUrl = "https://cdn.pixabay.com/photo/2017/08/04/11/43/bubble-tea-2579598_1280.jpg",
            categories = listOf("Bebidas", "Té"),
            menu = listOf(
                Dish(
                    id = 2001,
                    name = "Té de Leche Clásico",
                    description = "Té negro con leche y perlas de tapioca",
                    imageUrl = "https://cdn.pixabay.com/photo/2017/08/04/11/43/bubble-tea-2579598_1280.jpg"
                ),
                Dish(
                    id = 2002,
                    name = "Té de Frutas",
                    description = "Mezcla de frutas tropicales con té verde",
                    imageUrl = "https://cdn.pixabay.com/photo/2017/08/04/11/43/bubble-tea-2579598_1280.jpg"
                ),
                Dish(
                    id = 2003,
                    name = "Matcha Latte",
                    description = "Té matcha japonés con leche",
                    imageUrl = "https://cdn.pixabay.com/photo/2017/08/04/11/43/bubble-tea-2579598_1280.jpg"
                )
            )
        ),
        Restaurant(
            id = 21,
            name = "Fresh&Juicy",
            description = "Jugos y smoothies 100% naturales",
            imageUrl = "https://cdn.pixabay.com/photo/2017/01/20/14/59/orange-1995044_1280.jpg",
            categories = listOf("Bebidas", "Jugos"),
            menu = listOf(
                Dish(
                    id = 2101,
                    name = "Jugo Verde",
                    description = "Espinaca, manzana, pepino y limón",
                    imageUrl = "https://cdn.pixabay.com/photo/2017/01/20/14/59/orange-1995044_1280.jpg"
                ),
                Dish(
                    id = 2102,
                    name = "Smoothie Tropical",
                    description = "Mango, piña, banana y leche de coco",
                    imageUrl = "https://cdn.pixabay.com/photo/2017/02/04/12/25/smoothie-2038658_1280.jpg"
                ),
                Dish(
                    id = 2103,
                    name = "Zumo de Naranja",
                    description = "Exprimido al momento",
                    imageUrl = "https://cdn.pixabay.com/photo/2017/01/20/14/59/orange-1995044_1280.jpg"
                )
            )
        )
    )
}