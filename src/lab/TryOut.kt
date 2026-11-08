package lab

// TryOut

fun main() {

    val items: List<Int> = listOf(
        10,
        20,
        30
    )

    items.forEach { item ->

        when (item) {
            in 1..10 -> println("Integer: $item")
            in 10.rangeTo(20)  -> println("String: $item")
            in 30 downTo 25 -> println("Boolean: $item")
        }
    }
}