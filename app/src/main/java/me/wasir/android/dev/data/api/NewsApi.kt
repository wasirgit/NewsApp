package me.wasir.android.dev.data.api

import me.wasir.android.dev.BuildConfig
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApi {
    @GET("top-headlines?country=us&apiKey=3643ea1924fe4788aa82c830212f33fa")
    suspend fun getTopHeadLines(
        @Query("country") country: String,
        @Query("apiKey") apiKey: String = BuildConfig.API_KEY
    ): String
}