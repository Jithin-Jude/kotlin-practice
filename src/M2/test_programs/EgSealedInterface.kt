package M2.test_programs

import java.io.IOException

// Eg Sealed Interface

fun main() {
    checkDataResponse(state = DataFetchingState.Error(customMessage = "I am message"))
}

fun checkDataResponse(state: DataFetchingState) {
    when(state) {
        is DataFetchingState.Loading -> {
            println("Loading")
        }
        is DataFetchingState.Success -> {
            println("Success ${state.data}")
        }
        is DataFetchingState.Error -> {
            println("Error ${state.customMessage}")
            println("Error ${state.message}")
        }
    }
}

sealed interface DataFetchingState {

    object Loading: DataFetchingState
    data class Success(val data: String): DataFetchingState
    data class Error(val customMessage: String): IOException("Network error"), DataFetchingState
}