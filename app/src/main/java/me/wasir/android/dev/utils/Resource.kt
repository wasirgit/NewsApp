package me.wasir.android.dev.utils

data class Resource<out T>(val status: Status, val data: T?, val message: String?) {
    companion object {
        fun <T> success(data: T?): Resource<T> {
            return Resource(Status.SUCCESS, data = data, message = null)
        }

        fun <T> loading(data: T?): Resource<T> {
            return Resource(Status.LOADING, data = data, message = null)
        }

        fun <T> error(message: String?): Resource<T> {
            return Resource(Status.ERROR, null, message = null)
        }
    }
}
