package practice_problems

fun fibonacci(n: Int): Int {
    if (n <= 1) {
        return n
    }

    return fibonacci(n - 1) + fibonacci(n - 2)
}

fun main() {
    print("Enter the number of terms: ")
    val n = readln().toInt()

    println("Fibonacci Series:")

    for (i in 0 until n) {
        print("${fibonacci(i)} ")
    }
}