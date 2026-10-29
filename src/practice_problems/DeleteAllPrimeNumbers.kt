package practice_problems

fun main () {

    val a = arrayOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14)
    var n = a.size
    var i = 0

    while (i < n) {
        if (isPrimeNumber(a[i])) {
            print("${a[i]}\t");
            for (j in i until (a.size -1)) {
                a[j] = a[j + 1]
            }
            n--
            i--
        }
        i++
    }

    println("\nArray after deleting all Prime numbers: ")
    for (i in 0 until n) {
        print("${a[i]}\t")
    }
}

fun isPrimeNumber (num: Int): Boolean {

    if (num <= 1) {
        return false
    }

    var flag = true
    for (i in 2..(num/2)) {
        if (num % i == 0) {
            flag = false
            break
        }
    }
    return flag
}