package lab

// TryOut

fun main() {

    val state = DataState.Loading
    checkDataState(state)
    chooseEnv(BaseUrl.DEV)


    println("Hi")
}

fun chooseEnv(env: BaseUrl) {
    when (env) {
        BaseUrl.DEV -> {
            println("URL is: ${env.endPoint}")
        }
        BaseUrl.PROD -> {
            println("URL is: ${env.endPoint}")
        }
    }
}

fun checkDataState(state: DataState) {

    when(state) {
        is DataState.Loading -> {
            println("Loading...")
        }
        is DataState.Success -> {
            println("Success: ${state.data}")
        }
        is DataState.Error -> {
            println("Error: ${state.message}")
        }
    }
}

sealed class DataState {
    object Loading: DataState()
    data class Success(val data: String): DataState()
    data class Error(val message: String): DataState()
}

enum class BaseUrl(val server: String, val endPoint: String) {
    DEV(server = "dev", endPoint = "https://dev.com"),
    PROD(server = "prod", endPoint = "https://prod.com")
}