package com.example.pagingandcaching.navigation

sealed class Screen(val route: String) {
    object home: Screen("home_screen")
    object search: Screen("search_screen")
}

