package M2.test_programs

fun main() {
    val numbers = listOf(1,2,3,4,5,6,7,8,9,10)
    val eNums1 = numbers.filter{n -> isEven(n)}
    val eNums2 = numbers.filter(::isEven)  // via function reference
    println(eNums1)
    println(eNums2)

    val twice1 = numbers.map { n -> twice(n) }
    val twice2 = numbers.map(::twice)  // via function reference
    println(twice1)
    println(twice2)

}

fun isEven(n: Int): Boolean {
    return n % 2 == 0
}

fun twice(n: Int): Int {
    return n * 2
}