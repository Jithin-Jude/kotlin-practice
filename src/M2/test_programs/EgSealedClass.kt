package M2.test_programs

// Eg Sealed Class

fun main() {
    checkResponse(state = DataState.Success(data = "I am data"))
}

fun checkResponse(state: DataState) {
    when(state) {
        is DataState.Loading -> {
            println("Loading")
        }
        is DataState.Success -> {
            println("Success ${state.data}")
        }
        is DataState.Error -> {
            println("Error ${state.message}")
        }
    }
}

sealed class DataState {
    object Loading: DataState()
    data class Success(val data: String): DataState()
    data class Error(val message: String): DataState()
}