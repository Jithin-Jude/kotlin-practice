package M2.test_programs

// EgEnumClass

fun main(){
    val today = DaysOfWeek.TUE
    println(DaysOfWeek.values())
    println(DaysOfWeek.entries)
    println(DaysOfWeek.valueOf("Fri"))
    println(DaysOfWeek.entries.contains(DaysOfWeek.Fri))

    when(today) {
        DaysOfWeek.MON -> {
            println("Today is MONDAY")
        }

        DaysOfWeek.TUE -> {
            println("Today is TUESDAY")
            println(today.name)
            println(today.ordinal)
        }

        DaysOfWeek.WED -> {
            println("Today is WEDNESDAY")
        }

        DaysOfWeek.THU -> {
            println("Today is THURSDAY")
        }

        DaysOfWeek.Fri -> {
            println("Today is FRIDAY")
        }

        DaysOfWeek.SAT -> {
            println("Today is SATURDAY")
        }

        DaysOfWeek.SUN -> {
            println("Today is SUNDAY")
        }
    }
}

enum class DaysOfWeek {MON, TUE, WED, THU, Fri, SAT, SUN}