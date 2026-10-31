package M2.test_programs

// TestPrivateSetter

fun main () {

    val e1 = Employee()

    e1.incrementSalary(25000)

    println("E1 salary is: ${e1.salary}")

}

class Employee {
    var salary: Int = 50000
        private set

    fun incrementSalary(amount: Int){
        salary += amount
    }
}