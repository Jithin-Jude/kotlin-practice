package lab

data class Student(val name: String, val grade: Int)
fun main() {
    println(myAddFun(2, 5))

    myFun1(
        onClick = { value: String -> println(value) }
    )
}
val myAddFun: (num1: Int, num2: Int) -> Int = {a: Int, b: Int -> a + b}

fun myFun1(onClick: (value: String) -> Unit): (product: Int) -> String {
    return {v -> "$v"}
}