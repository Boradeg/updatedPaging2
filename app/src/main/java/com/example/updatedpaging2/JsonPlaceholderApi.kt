package com.example.updatedpaging2
import retrofit2.http.GET

interface JsonPlaceholderApi {
    @GET("/posts")
    suspend fun getPosts(): List<Post>
}