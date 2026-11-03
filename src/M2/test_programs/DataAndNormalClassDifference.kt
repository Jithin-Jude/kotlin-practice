package M2.test_programs

// DataAndNormalClassDifference

fun main() {

    val a = A(a = "A", b = 1)

    val d = D(a = "A", b = 1)

    val c = d.copy(b = 7)
    println(a.toString())
    println(c.toString())

}

class A(
    val a: String,
    val b: Int,
) {

}

data class D(
    val a: String,
    val b: Int,
) {

}