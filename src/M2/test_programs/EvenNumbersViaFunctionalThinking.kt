package M2.test_programs

// EvenNumbers Via Functional Thinking

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6)
    val evenNumbers = numbers.filter { e -> e % 2 == 0 }
    println(evenNumbers)
}