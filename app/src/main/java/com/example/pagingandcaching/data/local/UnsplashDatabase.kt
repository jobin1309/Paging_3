package com.example.pagingandcaching.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.pagingandcaching.model.UnsplashImage
import com.example.pagingandcaching.model.UnsplashRemoteKey


@Database(entities = [UnsplashImage::class, UnsplashRemoteKey::class], version = 1, exportSchema = false )
abstract class UnsplashDatabase(): RoomDatabase() {

    abstract fun unsplashDao(): UnsplashImageDao
    abstract fun unsplashRemoteDao(): UnsplashRemoteDao

}