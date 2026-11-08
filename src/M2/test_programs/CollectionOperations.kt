package M2.test_programs

// Collection Operations

fun main() {
    val listOfStudent = mutableListOf<ResortStudent>(
        ResortStudent(
            id = 101,
            name = "Verti",
            course = "RoomService",
        ),
        ResortStudent(
            id = 102,
            name = "Aishu",
            course = "Chef",
        ),
        ResortStudent(
            id = 103,
            name = "Veni",
            course = "Chef",
        ),
        ResortStudent(
            id = 104,
            name = "Priya",
            course = "Reception",
        ),
        ResortStudent(
            id = 105,
            name = "Nedumaaran",
            course = "HeadChef",
        ),
    )

    val list = listOf(1,2,3,4,5,6,7,8,9,10,1,2,3,4,5)
    val set = mutableSetOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15)
    val map = mutableMapOf(
        1 to "ONE",
        2 to "TWO",
        3 to "THREE",
        4 to "FOUR",
        5 to "FIVE",
        6 to "SIX",
        7 to "SEVEN",
        8 to "EIGHT",
        9 to "NINE",
        10 to "TEN",
    )

    list.forEach { e ->
        print("$e, ")
    }

    println()

    set.forEachIndexed { index, element ->
        print("[$index] => $element, ")
    }

    println()

    map.forEach { key, value ->
        print("($key:$value), ")
    }

    println()

    println("list map(): ${list.map{e -> e * e}}")
    println("set map(): ${set.map{e -> e * e}}")
    println("map map(): ${map.map {(k,v) -> "$k is $v"}}")

    println()

    println("list filter(): ${list.filter{e -> e % 2 == 0}}")
    println("set filter(): ${set.filter{e -> e % 2 == 0}}")
    println("map filter(): ${map.filter{(k,v) -> k > 5}}")

    println()

    println("list find(): ${list.sortedDescending().find{e -> e % 2 == 0}}")
    println("set find(): ${set.find{e -> e % 2 == 0}}")
    println("map find(): ${map.keys.find{e -> e > 5}}")

    println()

    val sum = list.fold(0){ acc, e -> acc + e}
    println("SUM list id: $sum")

    println()

    println("list any(): ${list.any{e -> e % 2 == 0}}")
    println("set any(): ${set.any{e -> e % 2 == 0}}")
    println("map any(): ${map.any{(k,v) -> k % 2 == 0}}")

    println()

    println("list all(): ${list.all{e -> e % 2 == 0}}")
    println("set all(): ${set.all{e -> e > 0}}")
    println("map all(): ${map.all{(k,v) -> k % 2 == 0}}")

    println()

    println("list none(): ${list.none{e -> e > 25}}")
    println("set none(): ${set.none{e -> e % 2 == 0}}")
    println("map none(): ${map.none{(k,v) -> k % 2 == 0}}")

    println()

    println("list count(): ${list.count{e -> e % 2 == 0}}")
    println("set count(): ${set.count{e -> e % 2 == 0}}")
    println("map count(): ${map.count{(k,v) -> v == ""}}")

    val groupedStudents = listOfStudent.groupBy { e -> e.course }
    val associatedStudents = listOfStudent.associateBy { e -> e.id }

    println()

    println("groupedStudents")
    for (e in groupedStudents) {
        println(e)
    }

    println()

    println("associatedStudents")
    for (e in associatedStudents) {
        println(e)
    }

    println()

    println("list distinct(): ${list.distinct()}")
    println("set distinct(): ${list.distinct()}")
    println("map distinct(): ${map.values.distinct()}")

    val l1 = listOf(1,2,3)
    val l2 = listOf("A","B","C","D")
    val lZip = l1.zip(l2)
    println("list zip(): $lZip")
    val (unZipL1, unZipL2) = lZip.unzip()
    println("list unzip(): $unZipL1 | $unZipL2")
    val unZipL3 = lZip.unzip()
    println("list unzip(): $unZipL3")

    val l4Partition = l1.partition{ e -> e % 2 == 0}
    println("list unzip(): $l4Partition")
    val (l5Partition, l6Partition) = l1.partition{ e -> e % 2 == 0}
    println("list partition(): $l5Partition | $l6Partition")
}

data class ResortStudent(
    val id: Int,
    val name: String,
    val course: String,
)