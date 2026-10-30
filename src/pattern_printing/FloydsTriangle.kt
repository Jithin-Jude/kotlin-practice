package pattern_printing

// Floyd's Triangle

fun main () {
    val n = 4
    var num = 1

    for (i in 1..n) {
        for (j in 1..i) {
            print("$num ")
            num++
        }
        println()
    }
}