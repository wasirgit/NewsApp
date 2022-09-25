package me.wasir.android.dev.data.source

import android.util.Log
import me.wasir.android.dev.data.api.NewsApi
import me.wasir.android.dev.data.model.TopHeadLinesDto
import me.wasir.android.dev.domain.model.NewsRequest
import javax.inject.Inject

class DataSourceNetworkImpl @Inject constructor(
    private val newsApi: NewsApi
) : DataSource {
    private  val TAG = "DataSourceNetworkImpl"
    override suspend fun getNewsHeadLines(newsRequest: NewsRequest): TopHeadLinesDto{
        Log.d(TAG, "getNewsHeadLines: ")
        return newsApi.getTopHeadLines(newsRequest.city)
    }
}