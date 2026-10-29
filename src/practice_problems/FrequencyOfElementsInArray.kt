package practice_problems

fun main() {
    val a = arrayOf(1,2,3,1,2,4,5,6,6)
    val checked = Array(a.size) {i -> 0}

    for (i in a.indices) {
        if (checked[i] == 1) {
            continue
        }

        var count = 0
        for (j in a.indices) {
            if (a[i] == a[j]) {
                count++
                checked[j] = 1
            }
        }
        println("${a[i]} found $count times")
    }
}