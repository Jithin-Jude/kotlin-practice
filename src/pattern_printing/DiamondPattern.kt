package pattern_printing

// Diamond Pattern

fun main () {
    val n = 5

    for (i in 1..n-1) {
        // Space loop
        for (j in 1..(n-i)) {
            print(" ")
        }

        // Start loop
        for (k in 1..(2*i -1)) {
            print("*")
        }
        println()
    }

    for (i in n downTo 1) {
        // Space loop
        for (j in 1..(n-i)) {
            print(" ")
        }

        // Start loop
        for (k in 1..(2*i -1)) {
            print("*")
        }
        println()
    }
}