package M2.test_programs

// Eg Lambda Expressions

fun main() {
    println(add(2,5))
    println(multiply(2,5.0))
}

val add = {a: Int, b: Int ->
    a + b
}

val multiply: (Int, Double) -> Int = {a, b -> (a * b).toInt()}