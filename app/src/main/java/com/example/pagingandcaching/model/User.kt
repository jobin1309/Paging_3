package com.example.pagingandcaching.model

import androidx.room.Embedded
import com.google.gson.annotations.SerializedName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class User(
    @SerialName("links")
    @Embedded // this is for room to know there is a nested field object
    val userLinks: UserLinks,
    val username: String
) {
}