package programs

fun main() {
    val a = 3
    val b = 5

    val max = if (a > b) a else b

    println("MAX: $max")

    println("Enter current day: ")
    val day = readln().toInt();

    when(day) {
        1 -> println("MON")
        2 -> {
            println("TUE")
            println("multi line")
        }
        3 -> println("WED")
        4 -> println("THU")
        5 -> println("SAT")
        6 -> println("FRI")
        10 -> println("SUN")
        else -> println("INVALID")
    }

    val mark = 60;

    val grade = when {
        mark >= 90 -> "A"
        mark >= 80 -> "B"
        mark >= 70 -> "C"
        mark >= 60 -> "D"
        mark >= 50 -> "E"
        else -> "Failed"
    }

    println("Grade: $grade");

}