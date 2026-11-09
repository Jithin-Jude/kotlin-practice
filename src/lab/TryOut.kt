package lab

fun main() {
    println("RESULT: ${calc(5, 2, {a, b -> a * b})}")
}

fun <T, R> calc(a: T, b: T, operation: (T, T) -> R): R {
    return operation(a, b)
}