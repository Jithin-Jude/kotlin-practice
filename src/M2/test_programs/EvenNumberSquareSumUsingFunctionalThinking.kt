package M2.test_programs

// EvenNumberSquareSumUsingFunctionalThinking

fun main() {

    val numbers = listOf(1, 2, 3, 4, 5, 6)

    val evenNumberSquareSum = numbers
        .filter { e -> e % 2 == 0 }
        .map { e -> e * e }
        .fold(0){acc, e -> acc + e}

    println("Sum of the squares of all even number from the list numbers is: $evenNumberSquareSum")
}