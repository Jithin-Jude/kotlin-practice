package M2.test_programs

// EgScopeFunctions

fun main() {
    val s1: BroStudent? = BroStudent(
        id = 101,
        name = "Jithin",
        marks = 71.0,
    )

    // let
    // Let me transform this value
    val resultLet = s1?.let { s ->
        println(s.id)
        println(s.name)
        println(s.marks)
        s.marks = 75.0
        "Let Done"
    }
    println(resultLet)

    println()

    // apply
    // Apply configurations
    val resultApply = s1?.apply {
        marks = 80.0
    }
    println(resultApply)

    println()

    // also
    /// Also do something with this object
    val resultAlso = s1?.also { s ->
        s.marks = 90.0
    }
    println(resultAlso)

    println()

    // run
    // Run some code and return the result
    val resultRun = s1?.run {
        marks = 85.0
        "Run Done"
    }
    println(resultRun)

    println()

    // with
    // With this object, do these operations
    val resultWith = with(s1!!) {
        marks = 90.0
        "With Done"
    }
    println(resultWith)

    println()
}

data class BroStudent(
    val id: Int?,
    val name: String?,
    var marks: Double?,
)