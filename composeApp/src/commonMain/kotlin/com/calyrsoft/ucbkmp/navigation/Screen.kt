package com.ucb.ucbtest.navigation

sealed class Screen(val route: String) {
    object CalculatorUI: Screen("calculator")
    object OptionsUI: Screen("options")
}
//    object GitaliasScreen : Screen("gitlab")
//    object TakePhotoScreen: Screen("takephoto")
//    object MenuScreen: Screen("menu")
//    object LoginScreen: Screen("login")
//    object MoviesScreen: Screen("movies")
//    object MovieDetailScreen: Screen("movieDetail")
//    object CounterScreen: Screen("counter")
//    object DollarScreen: Screen("dollar")
//    object BookScreen: Screen("book")
//}