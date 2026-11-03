package M2.test_programs

// EgMap

fun  main() {
    val list: MutableList<String> = mutableListOf("A","B","C")
    val set = mutableSetOf("D","E","F")

    val map = mutableMapOf(
        "A" to "Vetri",
        102 to "Aishu",
        103.3 to 1021,
        104 to "Vikki",
        105 to "Nedumaaran",
    )

    map[0] = "A"
    map[-1] = "B"

    println(map.get("A"))
    map[106.6] = 25
    println(map.set(106.6, 24))
    map.put(106.7, 25)

    println(map[0])

    for ((key, value) in map) {
        println("KEY = $key | VALUE: = $value")
    }

    println()

    for (key in map.entries) {
        print("$key, ")
    }
}