package pattern_printing

// RightAngledTriangle

fun main () {
    val n = 5

    for (i in 1..n) {
        for (j in 1..i) {
            print("*")
        }
        println()
    }
}