package practice_problems

fun main () {
    val a = arrayOf(50,4,13,2,11)

    var minValue = a[0]
    var minPos = 0

    var maxValue = a[0]
    var maxPos = 0

    a.forEachIndexed { index, element ->
        if (element < minValue) {
            minValue = element
            minPos = index
        }
        if (element > maxValue) {
            maxValue = element
            maxPos = index
        }
    }

    if (minPos < maxPos) {
        for (i in (minPos+1) until maxPos) {
            print("${a[i]}\t")
        }
    } else {

        for (i in (maxPos+1) until minPos) {
            print("${a[i]}\t")
        }
    }
}