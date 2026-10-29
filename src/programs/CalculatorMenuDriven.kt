package programs

fun main () {
    var option = 0
    var num1: Int
    var num2: Int

    do {

        println("Choose your operation:\n===================\n")
        println("1 -> ADD")
        println("2 -> SUBTRACT")
        println("3 -> MULTIPLY")
        println("4 -> DIVIDE")
        println("5 -> EXIT")
        option = readln().toInt()

        if (option != 5) {
            println("Enter 2 numbers:")
            num1 = readln().toInt()
            num2 = readln().toInt()

            when(option) {
                1 -> println("$num1 + $num2 = ${sum(num1, num2)}")
                2 -> println("$num1 + $num2 = ${subtract(num1, num2)}")
                3 -> println("$num1 + $num2 = ${product(num1, num2)}")
                4 -> println("$num1 + $num2 = ${div(num1, num2)}")
            }
        }


    } while (option != 5)
}

// Single-expression function
fun sum(a: Int, b: Int): Int = a + b

fun subtract(a: Int, b: Int): Int {
    return a - b;
}

fun product(a: Int, b: Int): Int {
    return a * b;
}

fun div(a: Int, b: Int): Int {
    return a / b;
}