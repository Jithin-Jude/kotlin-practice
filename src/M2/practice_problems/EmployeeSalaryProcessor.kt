package M2.practice_problems

// Employee Salary Processor

fun main(){
    var eList = listOf(
        BroEmployee(
            id = 101,
            name = "Jithin",
            salary = 100000.0,
            department = "Teaching",
        ),
        BroEmployee(
            id = 102,
            name = "Vetri",
            salary = 50000.0,
            department = "Room Service",
        ),
        BroEmployee(
            id = 103,
            name = "Aishu",
            salary = 200000.0,
            department = "Chef",
        ),
        BroEmployee(
            id = 104,
            name = "Veni",
            salary = 150000.0,
            department = "Chef",
        ),
        BroEmployee(
            id = 105,
            name = "Uthaman",
            salary = 25000.0,
            department = "Room Service",
        ),
    )

    // Find employees earning more than ₹50,000.
    println(eList.filter { e -> e.salary > 50000 }.map { e -> e.name })

    println()

    // Increase every employee's salary by 10%.
    eList = eList.map { e -> e.copy(salary = e.salary + (e.salary * 10/100)) }
    eList.forEach { e ->
        println("${e.name} => ${e.salary}")
    }

    println()

    // Sort employees by salary.
    println(eList.sortedByDescending { e -> e.salary }.map { e -> "${e.name} : ${e.salary}" })

    println()

    // Calculate average salary.
    println(eList.map { e -> e.salary }.average())

    println()

    // Find the highest-paid employee.
    println(eList.maxBy{ e -> e.salary }.name)

    println()

    // Group employees by department.
    eList.groupBy { e -> e.department }.forEach { dept, employees ->
        println("$dept => ${employees.map { e -> e.name }}")
    }

}

data class BroEmployee(
    val id: Int,
    val name: String,
    val salary: Double,
    val department: String,
)