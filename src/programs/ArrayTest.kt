package programs

fun main () {
    val numbers2: Array<Double> = arrayOf(1.8, 2.3,  3.5)
    val numbers3: IntArray = intArrayOf(4,5,6)

    val numbers = Array(10) {i -> i * 10}

    numbers[2] = 5;

    for (num in numbers) {
        print("$num, ")
    }

    println()

    for (i in numbers2.indices) {
        print("${numbers2[i]}, ")
    }

    println()

    for (index in 0 until numbers3.size) {
        print("${numbers3[index]}, ")
    }
}