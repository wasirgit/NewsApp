package me.wasir.android.dev.data.model

data class TopHeadLinesDto(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)