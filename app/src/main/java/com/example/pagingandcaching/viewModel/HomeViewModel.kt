package com.example.pagingandcaching.viewModel

import androidx.lifecycle.ViewModel
import com.example.pagingandcaching.data.repository.PagingRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class HomeViewModel @Inject constructor(val repository: PagingRepo): ViewModel() {

    val getAllImage = repository.getAllImages()

}