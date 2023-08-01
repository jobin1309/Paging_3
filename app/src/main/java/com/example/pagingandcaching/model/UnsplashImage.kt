package com.example.pagingandcaching.model

import android.text.style.URLSpan
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.pagingandcaching.utils.Constants
import com.example.pagingandcaching.utils.Constants.UNSPLASH_IMAGE_NAME
import kotlinx.serialization.Serializable


@Entity(tableName = UNSPLASH_IMAGE_NAME)
@Serializable
class UnsplashImage(
    @PrimaryKey(autoGenerate = false) //we put false because it is already unique from the api respone
    val id: String,
    @Embedded
    val urls: Urls,
    val likes: Int,
    @Embedded
    val user: User

)