package M2.practice_problems

// Employee Database

fun main() {
    val eList = listOf(
        CampusEmployee(
            id = 101,
            name = null,
            email = "jithin@brototype.com",
            salary = 50000.0,
            department = "Teaching",
        ),
        CampusEmployee(
            id = 102,
            name = "Vetri",
            email = "vetri@brototype.com",
            salary = 60000.0,
            department = "Teaching",
        ),
        CampusEmployee(
            id = 103,
            name = "Aishu",
            email = "aishu@brototype.com",
            salary = null,
            department = "Chef",
        ),
        CampusEmployee(
            id = 104,
            name = "Veni",
            email = null,
            salary = 200000.0,
            department = "Chef",
        ),
        CampusEmployee(
            id = 105,
            name = "Nedumaaran",
            email = "nedumaaran@brototype.com",
            salary = 25000.0,
            department = null,
        ),
    )

    // Filter out employees whose names are null.
    println(eList.filter{e -> e.name == null})

    println()

    // Display employee emails using safe calls.
    eList.forEach{ e ->
        println("Email: ${e?.email}")
    }

    println()

    // Calculate total salary, treating missing salaries as zero.
    val totalSalary = eList.fold(0.0) { acc, e -> acc + (e.salary ?: 0.0) }
    println("Total Salary: $totalSalary")

    println()

    // Display "Unknown Department" when the department is null.
    eList.forEach { e ->
        println("${e.name ?: "Unknown Name"} => ${e.department ?: "Unknown Department"}")
    }

    println()

    // Find the employee with the highest available salary.
    println(eList.maxBy { e -> e.salary ?: 0.0 })
}

data class CampusEmployee(
    val id: Int,
    val name: String?,
    val email: String?,
    val salary: Double?,
    val department: String?,
)