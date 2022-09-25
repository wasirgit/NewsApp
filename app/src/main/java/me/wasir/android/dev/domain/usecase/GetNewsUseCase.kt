package me.wasir.android.dev.domain.usecase

import me.wasir.android.dev.data.model.TopHeadLinesDto
import me.wasir.android.dev.domain.model.NewsRequest
import me.wasir.android.dev.domain.repository.NewsRepository
import javax.inject.Inject

class GetNewsUseCase @Inject constructor(private val newsRepository: NewsRepository) {
    suspend fun execute(request: NewsRequest): TopHeadLinesDto {
       return newsRepository.getNewsHeadLines(request)
    }
}