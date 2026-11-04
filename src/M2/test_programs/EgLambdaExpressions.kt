package M2.test_programs

// Eg Lambda Expressions, Higher Order functions, Function references

fun main() {

    // Lambda Expressions
    println(add(2,5))
    println(multiply(2,5))

    println()

    println(calculate(2, 5, add))
    println(calculate(2, 5, multiply))

    println()

    // Higher order function
    println(calculate(2, 5,  {a: Int, b: Int -> a - b }))
    println(calculate(
        5.0,
        2.0,
        {a: Double, b: Double -> a / b },
        {a: Double, b: Double -> a % b }))

    openActivity(onCLick = { value -> println(value) })

    println()

    // Higher-order function returning another function
    val funAResult = funA("X-VALUE")
    println(funAResult)
    println(funAResult("Y-VALUE"))

    println()

    // Function references
    val testFun = ::squareOfNumber
    println("${testFun(5)}")

    println()

    val list = listOf(1,2,3,4,5,6,7,8,9,10)
//    val sqList = list.map{squareOfNumber(it)}
    val sqList = list.map(::squareOfNumber)
    println(list)
    println(sqList)
}

// Lambda expressions
val add = {a: Int, b: Int ->
    a + b
}

val multiply: (Int, Int) -> Int = {a, b -> a * b}

// Higher order function
fun calculate(
    a: Int,
    b: Int,
    operation: (Int, Int) -> Int,
    ): Int {
    return operation(a, b)
}

fun calculate(
    a: Double,
    b: Double,
    operation1: (v1: Double, v2: Double) -> Double,
    operation2: (Double, Double) -> Double,
): String {
    return "${operation1(a, b)} : ${operation2(a, b)}"
}

fun openActivity(onCLick: (value: String) -> Unit) {
    onCLick("clicked!")
}

// Higher-order function returning another function
fun funA(str: String): (String) -> String {
    return {word -> "$str to $word funA"}
}

// Function references
fun squareOfNumber(number: Int): Int {
    return number * number
}