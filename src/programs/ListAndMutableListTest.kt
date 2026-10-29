package programs

fun main() {
    val list1 = listOf(1,2,3,4,5)

    val mList1 = mutableListOf<Int>()

    println("list1 size: ${list1.size}")

    mList1.add(10)
    mList1.add(20)
    mList1.add(30)
    mList1.add(40)
    mList1.add(50)
    mList1.add(60)

    mList1[0] = 11

    mList1.removeAt(3)

    println("mList1 size: ${mList1.size}")

    if (mList1.contains(60)) {
        println("mList1 has 60")
    }

    for (num in list1) {
        print("$num\t")
    }

    println()

    for (num in mList1) {
        print("$num\t")
    }

    println()

    mList1.forEach { num ->
        print("$num\t")
    }

    println()

    list1.forEach { num ->
        print("$num\t")
    }

    println()

    mList1.forEachIndexed { index, num ->
        print("$num\t")
    }

    println()

    list1.forEachIndexed { index, num ->
        print("${list1[index]}\t")
    }
}