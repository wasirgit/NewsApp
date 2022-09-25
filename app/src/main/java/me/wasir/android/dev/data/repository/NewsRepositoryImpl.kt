package me.wasir.android.dev.data.repository

import me.wasir.android.dev.data.model.TopHeadLinesDto
import me.wasir.android.dev.data.source.DataSourceFactory
import me.wasir.android.dev.data.source.Source
import me.wasir.android.dev.domain.model.NewsRequest
import me.wasir.android.dev.domain.repository.NewsRepository
import javax.inject.Inject

class NewsRepositoryImpl @Inject constructor(private val dataSourceFactory: DataSourceFactory) :
    NewsRepository {
    override suspend fun getNewsHeadLines(newsRequest: NewsRequest): TopHeadLinesDto {
        return dataSourceFactory.create(Source.NETWORK).getNewsHeadLines(newsRequest)
    }
}