package com.example.pagingandcaching.data.repository

import androidx.paging.ExperimentalPagingApi
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.example.pagingandcaching.data.local.UnsplashDatabase
import com.example.pagingandcaching.data.paging.UnsplashRemoteMediator
import com.example.pagingandcaching.data.remote.UnsplashApi
import com.example.pagingandcaching.model.UnsplashImage
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class PagingRepo @Inject constructor(
    private val unsplashApi: UnsplashApi,
    private val unsplashDatabase: UnsplashDatabase
) {

    @OptIn(ExperimentalPagingApi::class)
    fun getAllImages(): Flow<PagingData<UnsplashImage>> {
        val pagingSourceFactory = { unsplashDatabase.unsplashImageDao().getAllImages() }  //paging source is initialized in the dao
        return Pager(
            config = PagingConfig(pageSize = 10),
            remoteMediator = UnsplashRemoteMediator(
                unsplashApi = unsplashApi,
                unsplashDatabase = unsplashDatabase
            ),
            pagingSourceFactory = pagingSourceFactory
        ).flow
    }
}