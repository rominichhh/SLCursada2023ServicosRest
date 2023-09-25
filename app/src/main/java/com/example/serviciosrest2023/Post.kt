package com.example.serviciosrest2023

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Post(
    var id : Int?,
    var title : String,
    var body : String,
    var userId : Int
)

