package practice_problems

// TrianglePatternPrinting

fun main () {
    val n = 5

    for (i in 0 until n) {
        for (j in n-i-1 downTo 0) {
            print(" ")
        }
        for (k in 0 until i*2+1) {
            print("*")
        }
        println()
    }
}