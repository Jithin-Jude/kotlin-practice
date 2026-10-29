package pattern_printing

fun main () {
    val n = 5

    for (i in n downTo 1) {
        for (j in 1..i) {
            print("$j")
        }
        println()
    }
}