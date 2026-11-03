// TryOut

fun main() {
    val set1 = mutableSetOf(1,2,3,4,5)
    val set2 = mutableSetOf(4,5,6,7,8)

//    println(set1.add(6))
    println((set1 union set2).size)

    for (element in set1 union set2) {
        print("$element\t")
    }
}