package me.wasir.android.dev.presentation.home

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import me.wasir.android.dev.data.model.TopHeadLinesDto
import me.wasir.android.dev.data.networking.CoroutineDispatcherProvider
import me.wasir.android.dev.domain.model.NewsRequest
import me.wasir.android.dev.domain.usecase.GetNewsUseCase
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val getNewsUseCase: GetNewsUseCase,
    private val dispatcherProvider: CoroutineDispatcherProvider
) : ViewModel() {
    private val TAG = "HomeViewModel"

    fun getNewsHeadLines() {
        viewModelScope.launch(dispatcherProvider.IO()) {
            val newsRequest = NewsRequest("us")
            val result: TopHeadLinesDto = getNewsUseCase.execute(newsRequest)
            Log.d(TAG, "getNewsHeadLines: $result")
        }
    }
}