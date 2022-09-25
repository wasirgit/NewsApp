package me.wasir.android.dev.data.source

import javax.inject.Inject

class DataSourceFactory @Inject constructor(
    private val dataSourceNetworkImpl: DataSourceNetworkImpl,
    private val dataSourceLocalImpl: DataSourceLocalImpl
) {
    fun create(source: Source): DataSource {
        return when (source) {
            Source.NETWORK -> dataSourceNetworkImpl
            else -> dataSourceLocalImpl
        }
    }
}