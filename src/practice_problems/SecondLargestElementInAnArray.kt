package practice_problems

fun main() {
    val a = arrayOf(70,70,20,15,20,40,55,60,65,63)

    var largest = Int.MIN_VALUE
    var secondLargest = Int.MIN_VALUE

    for (i in a.indices) {
        if (a[i] > largest) {
            secondLargest = largest
            largest = a[i]
        } else if (a[i] < largest && a[i] > secondLargest) {
            secondLargest = a[i]
        }
    }

    println("Second largest element in the array is: $secondLargest")
}