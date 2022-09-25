package me.wasir.android.dev.data.source

import me.wasir.android.dev.data.model.TopHeadLinesDto
import me.wasir.android.dev.domain.model.NewsRequest
import javax.inject.Inject

class DataSourceLocalImpl @Inject constructor() : DataSource {
    override suspend fun getNewsHeadLines(newsRequest: NewsRequest): TopHeadLinesDto {
        val headLineList =TopHeadLinesDto()
        return headLineList
    }
}