package com.example.pagingandcaching.screen.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.paging.compose.LazyPagingItems
import androidx.paging.compose.collectAsLazyPagingItems
import coil.annotation.ExperimentalCoilApi
import com.example.pagingandcaching.model.UnsplashImage
import com.example.pagingandcaching.viewModel.HomeViewModel

@Composable
fun HomeScreen(navController: NavController,
               homeViewModel: HomeViewModel = hiltViewModel()) {

    val getAllImages = homeViewModel.getAllImage.collectAsLazyPagingItems()
    //now the data is in LazyPagingItem


}



