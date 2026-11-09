package M2.test_programs

// ::toLevelFunction
fun isEvenNum(n: Int): Boolean {
    return n % 2 == 0
}

// ClassName::memberFunction

// instance::memberFunction
class Formater {
    fun format(s: Int): String {
        return "| $s |"
    }
}

// ::ClassName
data class Stud(
    val name: String,
)

fun main() {
    val l = listOf(1,2,3,4,5)
    val el = l.filter(::isEvenNum) // ::toLevelFunction
    println(el)

    println(l.map(Int::toString)) // ClassName::memberFunction

    val fm = Formater()
    println(l.map(fm::format)) // instance::memberFunction

    println(listOf("A", "B", "C").map(::Stud)) // ::ClassName

}