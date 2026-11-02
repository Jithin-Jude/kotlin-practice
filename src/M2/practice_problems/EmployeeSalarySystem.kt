package M2.practice_problems

// Employee Salary System

fun main() {
    val employeeList = listOf(
        FullTimeEmployee(
            name = "Riya",
            employeeId = "1",
            monthlySalary = 50000.0
        ),
        PartTimeEmployee(
            name = "Jerin",
            employeeId = "2",
            perDaySalary = 500.0,
            daysWorked = 15,
        ),
        ContractEmployee(
            name = "Rahul",
            employeeId = "3",
            hourlyRate = 150.0,
            hoursWorked = 25,
        ),
    )

    for (employee in employeeList) {
        println("Salary of ${employee.name} is ${employee.calculateSalary()}")
    }
}

class FullTimeEmployee(
    name: String,
    employeeId: String,
    var monthlySalary: Double,
    ): Employee(name = name, employeeId = employeeId) {
    override fun calculateSalary(): Double {
        return monthlySalary
    }
}

class PartTimeEmployee(
    name: String,
    employeeId: String,
    var perDaySalary: Double,
    var daysWorked: Int,
    ): Employee(name = name, employeeId = employeeId) {
    override fun calculateSalary(): Double {
        return perDaySalary * daysWorked
    }
}

class ContractEmployee(
    name: String,
    employeeId: String,
    var hourlyRate: Double,
    var hoursWorked: Int,
    ): Employee(name = name, employeeId = employeeId) {
    override fun calculateSalary(): Double {
        return hourlyRate * hoursWorked
    }
}

abstract class Employee(
    var name: String,
    var employeeId: String,
) {
    abstract fun calculateSalary(): Double
}