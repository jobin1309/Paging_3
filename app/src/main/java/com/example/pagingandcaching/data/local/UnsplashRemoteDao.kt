package com.example.pagingandcaching.data.local

import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.pagingandcaching.model.UnsplashRemoteKey

interface UnsplashRemoteDao {

    @Query("SELECT * FROM unsplash_remotekey_table WHERE id = :id")
    suspend fun getRemoteKeys(id: String): UnsplashRemoteKey

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addAllRemoteKeys(remoteKeys: List<UnsplashRemoteKey>)

    @Query("DELETE FROM unsplash_remotekey_table")
    suspend fun deleteAllRemoteKeys()


}