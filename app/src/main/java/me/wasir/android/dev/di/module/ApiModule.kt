package me.wasir.android.dev.di.module

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import me.wasir.android.dev.data.api.NewsApi
import retrofit2.Retrofit

@Module
@InstallIn(SingletonComponent::class)
object ApiModule {
    @Provides
    fun provideNewsApi(retrofit: Retrofit): NewsApi {
        return retrofit.create(NewsApi::class.java)
    }
}