package com.example.pagingandcaching.di

import com.example.pagingandcaching.data.remote.UnsplashApi
import com.example.pagingandcaching.utils.Constants.BASE_URL
import com.google.gson.Gson
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.serialization.json.Json
import okhttp3.MediaType
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Provides
    fun ProvidesHttpClient(): OkHttpClient {
        return OkHttpClient.Builder()
            .readTimeout(15, TimeUnit.SECONDS)
            .connectTimeout(15, TimeUnit.SECONDS)
            .build()
    }

    @Provides
    fun GsonConverterFactory(): GsonConverterFactory = GsonConverterFactory.create()

    @Provides
    fun ProvideRetrofitInstance(
        okHttpClient: OkHttpClient,
        gsonConverterFactory: GsonConverterFactory
    ): Retrofit {
        return Retrofit.Builder().baseUrl(BASE_URL).client(okHttpClient).addConverterFactory(
            gsonConverterFactory
        ).build()
    }

    @Provides
    fun providesApiServices(retrofit: Retrofit):UnsplashApi{
        return retrofit.create(UnsplashApi::class.java)

    }


}