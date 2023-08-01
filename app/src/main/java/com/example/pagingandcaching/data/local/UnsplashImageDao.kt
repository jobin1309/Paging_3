package com.example.pagingandcaching.data.local

import androidx.paging.PagingSource
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.pagingandcaching.model.UnsplashImage


@Dao
interface UnsplashImageDao {

    @Query("SELECT * FROM unsplash_image_table")
    fun getAllImages(): PagingSource<Int, UnsplashImage>
    //room db supports pagination, so only specify the PagingSource,

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addImages(image: List<UnsplashImage>)

    @Query("DELETE FROM unsplash_image_table")
    suspend fun deleteAllImages()
}