package M2.test_programs

// TestClassObjectsConsturctors

fun main () {

    val s1 = Student(
        name = "Jithin",
        rollNumber = 101,
        marks = 75,
    )

    val s2 = Student(
        name = "Jose",
        rollNumber = 102,
    )

    s1.displayDetails()
    println("Passed: ${s1.isPassed()}")
    println("Grade: ${s1.calculateGrade()}")

    println()

    s2.displayDetails()
    println("Passed: ${s2.isPassed()}")
    println("Grade: ${s2.calculateGrade()}")

}

class Student(name: String, rollNumber: Int, marks: Int) {
    var name: String = name
    var rollNumber: Int = rollNumber
    var marks: Int = marks

    constructor(name: String, rollNumber: Int): this(name = name, rollNumber = rollNumber, marks = 0)

    fun displayDetails() {
        println("Name: ${this.name}")
        println("RollNumber: ${this.rollNumber}")
        println("Marks: ${this.marks}")
    }

    fun isPassed(): Boolean {
        if (this.marks >= 60) {
            return true
        } else {
            return false

        }
    }

    fun calculateGrade(): String {
        return when {
            marks >= 90 -> "A"
            marks >= 75 -> "B"
            marks >= 60 -> "C"
            marks >= 40 -> "D"
            else -> "F"
        }
    }
}

