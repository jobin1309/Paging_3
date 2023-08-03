package com.example.pagingandcaching.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost

import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.paging.ExperimentalPagingApi
import com.example.pagingandcaching.screen.home.HomeScreen

@ExperimentalPagingApi
@Composable
fun NavGraph(navController: NavHostController) {

    NavHost(navController = navController, startDestination = Screen.home.route) {
        composable(route = Screen.home.route) {
            HomeScreen(navController = navController)
        }

        composable(route = Screen.search.route) {
//            SearchScreen(navController = navController)
        }

    }

}


