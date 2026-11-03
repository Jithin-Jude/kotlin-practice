package M2.practice_problems

// Student Data Manager

fun main() {
    val s0 = Student(
        id = "101",
        name = "Vetri",
        age = 30,
        course = "Hotel Management"
    )

    val s1 = Student(
        id = "101",
        name = "Vetri",
        age = 30,
        course = "Hotel Management"
    )
    val s2 = Student(
        id = "102",
        name = "Aishu",
        age = 30,
        course = "Chef"
    )
    val s3 = Student(
        id = "103",
        name = "Veni",
        age = 30,
        course = "Reception"
    )

    val s4 = s1.copy(course = "Engineer")

    val (id, name, age, subject) = s4

    println(s0 == s1)
    println()
    println(id)
    println(name)
    println(age)
    println(subject)
    println()
    println(s2.toString())

}

data class Student(
    val id: String,
    val name: String,
    val age: Int,
    val course: String,
)