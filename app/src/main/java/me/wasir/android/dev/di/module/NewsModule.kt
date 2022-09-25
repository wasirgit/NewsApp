package me.wasir.android.dev.di.module

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import me.wasir.android.dev.data.repository.NewsRepositoryImpl
import me.wasir.android.dev.domain.repository.NewsRepository

@Module
@InstallIn(ViewModelComponent::class)
abstract class NewsModule {
    @Binds
    abstract fun bindNewsRepository(newsRepositoryImpl: NewsRepositoryImpl): NewsRepository
}