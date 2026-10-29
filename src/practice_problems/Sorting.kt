package practice_problems

fun main () {
    val a = arrayOf(1,9,2,8,3,7,4,6,5)

    for (i in a.indices) {
        var minValue = a[i]
        var minPos = i
        for (j in i until a.size) {
            if (a[j] < minValue) {
                minValue = a[j]
                minPos = j
            }
        }
        a[minPos] = a[i]
        a[i] = minValue
    }

    println("Sorted Array is:")
    for (num in a) {
        print("$num\t")
    }
}