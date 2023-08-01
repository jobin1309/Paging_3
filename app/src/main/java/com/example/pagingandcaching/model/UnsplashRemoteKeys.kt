package com.example.pagingandcaching.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.pagingandcaching.utils.Constants


@Entity(tableName = Constants.UNSPLASH_REMOTE_KEY_TABLE)
data class UnsplashRemoteKey(
    @PrimaryKey(autoGenerate = false)
    val id: String,
    val prevPage: Int?,
    val nextPage: Int?
)

