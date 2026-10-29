package programs

fun main() {
    var n = 0

    println("Enter size of array:")
    n = readln().toInt()

    val array = Array(n) {i -> 0}
    var sum = 0

    println("Enter $n number into array")
    for (i in 0 until n) {
        array[i] = readln().toInt()
        sum += array[i]
    }

    println("The given array is:")
    for (i in array.indices) {
        println("${array[i]}\t")
    }

    println("Sum of array elements: $sum")
}