package try_outs

// TryOut

fun main () {
    val number = "25".toInt()
    println("number is ${number}")

    val userInput = 60

    val result = when {
        userInput >= 90 -> {
            "A"
        }
        userInput >= 80 -> {
            "B"
        }
        userInput >= 70 -> {
            "C"
        }
        userInput >= 60 -> {
            "D"
        }
        else -> {
            "Failed"
        }
    }

    println("Result is: $result")
}