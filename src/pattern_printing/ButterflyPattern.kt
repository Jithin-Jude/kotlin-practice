package pattern_printing

// Butterfly Pattern

fun main () {
    val n = 5

    for (i in 1..n) {
        repeat(i) { index ->
            print("*")
        }

        repeat((2*n) - (2*i)) {
            print(" ")
        }

        repeat(i) {
            print("*")
        }

        println()
    }

    for (i in n-1 downTo 1) {
        repeat(i) { index ->
            print("*")
        }

        repeat((2*n) - (2*i)) {
            print(" ")
        }

        repeat(i) {
            print("*")
        }

        println()
    }
}