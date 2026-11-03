package M2.test_programs

// EgEnumClass

fun main(){
    val today = DaysOfWeek.TUE

    when(today) {
        DaysOfWeek.MON -> {
            println("Today is MONDAY")
        }

        DaysOfWeek.TUE -> {
            println("Today is TUESDAY")
        }

        DaysOfWeek.WED -> {
            println("Today is WEDNESDAY")
        }

        DaysOfWeek.THU -> {
            println("Today is THURSDAY")
        }

        DaysOfWeek.FRI -> {
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

enum class DaysOfWeek {MON, TUE, WED, THU, FRI, SAT, SUN}