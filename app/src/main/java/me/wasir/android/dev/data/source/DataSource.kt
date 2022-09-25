package me.wasir.android.dev.data.source

import me.wasir.android.dev.data.model.TopHeadLinesDto
import me.wasir.android.dev.domain.model.NewsRequest

interface DataSource {
    suspend fun getNewsHeadLines(newsRequest: NewsRequest):  TopHeadLinesDto
}