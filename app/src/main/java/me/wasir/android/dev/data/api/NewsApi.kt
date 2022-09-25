package me.wasir.android.dev.data.api

import me.wasir.android.dev.BuildConfig
import me.wasir.android.dev.data.model.TopHeadLinesDto
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApi {
    @GET("top-headlines")
    suspend fun getTopHeadLines(
        @Query("country") country: String,
        @Query("apiKey") apiKey: String = BuildConfig.API_KEY
    ): TopHeadLinesDto
}