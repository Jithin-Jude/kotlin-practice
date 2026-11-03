package M2.test_programs

// ExampleDataClassShallowCopy


fun main() {

    val d = DA(a = "A", b = 1, mList = mutableListOf("A", "B", "C"))

    val c = d.copy(b = 2) // Shallow copy of mutable variables

    c.mList.add("Hi") // updates both

    println("D => ${d.toString()}")
    println("C => ${c.toString()}")

}

data class DA(
    var a: String,
    var b: Int,
    var mList: MutableList<String> = mutableListOf("A", "B", "C")
) {

}