package com.example.pagingandcaching.di

import android.content.Context
import androidx.room.Query
import androidx.room.Room
import com.example.pagingandcaching.data.local.UnsplashDatabase
import com.example.pagingandcaching.utils.Constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object unsplashDatabaseModule {

    @Provides //3rd party library
    fun providesunsplashDatabase(@ApplicationContext context: Context) = Room.databaseBuilder(
        context, UnsplashDatabase::class.java, Constants.unsplashDatabase
    ).fallbackToDestructiveMigration().build()

}