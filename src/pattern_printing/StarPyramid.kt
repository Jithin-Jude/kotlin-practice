package pattern_printing

// Star Pyramid

fun main () {
    val n = 5

    for (i in 1..n) {

        // Spaces
        for (j in 1..(n-i)) {
            print(" ")
        }

        // Stars
        for (k in 1..(2*i-1)) {
            print("*")
        }
        println()
    }
}