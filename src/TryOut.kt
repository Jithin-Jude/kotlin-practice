// TryOut

fun main() {
    val result = "Kotlin"
        .also {
            println("A: $it")
        }
        .let {
            it.length
        }
        .run {
            this * 2
        }

    println("Result: $result")
}