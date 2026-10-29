package practice_problems

// SearchElement

fun main () {
    val a = arrayOf(1,9,2,8,3,7,4,6,5)

    val searchKey = 3

    a.forEachIndexed { index, element ->
        if (element == searchKey) {
            println("$searchKey found in array at index $index")
            return
        }
    }
}