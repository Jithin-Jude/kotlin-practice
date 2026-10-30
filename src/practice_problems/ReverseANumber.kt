package practice_problems

fun main () {
    var a = -123
    var rev = 0

    while (a != 0) {
        val r = a % 10
        rev = rev * 10 + r
        a /= 10
    }

    println(rev)
}