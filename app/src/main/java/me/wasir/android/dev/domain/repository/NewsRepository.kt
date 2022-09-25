package me.wasir.android.dev.domain.repository

import me.wasir.android.dev.data.model.TopHeadLinesDto
import me.wasir.android.dev.domain.model.NewsRequest

interface NewsRepository {
   suspend fun getNewsHeadLines(newsRequest: NewsRequest): TopHeadLinesDto
}