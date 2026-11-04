package M2.practice_problems

// Lambda Calculator

fun main() {
    println(add(2, 5))
    println(sub(2, 5))
    println(product(2, 5))
    println(div(2.0, 5.0))
}

val add = {a: Int, b: Int -> a + b}
val sub: (Int, Int) -> Int = {a, b -> a - b}
val product: (Int, Int) -> Int = {a, b -> a * b}
val div: (Double, Double) -> Double = { a, b -> a / b}