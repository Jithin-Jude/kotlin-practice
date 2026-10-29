package practice_problems

// SumOfUniqueEvenNumbers

fun main () {
    val a = arrayOf(1,2,3,4,5,6,1,2,3,4)
    var n = a.size

    var sum = 0

    for (element in a) {
        var freq = 0
        for (num in a) {
            if (num == element) {
                freq++
            }
        }
        if (freq == 1) {
            if (element % 2 == 0) {
                sum += element
            }
        }
    }

    if (sum > 5) {
        var maxValue = Int.MIN_VALUE
        var maxPos = Int.MIN_VALUE

        a.forEachIndexed { index, element ->
            if (element > maxValue) {
                maxValue = element
                maxPos = index
            }
        }

        for (i in maxPos until a.size-1) {
            a[i] = a[i + 1]
        }
        n--

        println("Modified array:")
        for (i in 0 until n) {
            print("${a[i]}\t")
        }
    }
}
