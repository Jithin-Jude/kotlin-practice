package M2.practice_problems.student_management_system.view

import M2.practice_problems.student_management_system.domain.StudentService

// Student Management View

fun main(){
    val studentService = StudentService()

    studentService.registerStudent(
        id = 101,
        name = "Jithin",
        marks = 75
    )
    studentService.registerStudent(
        id = 102,
        name = "Vetri",
        marks = 80
    )
    studentService.registerStudent(
        id = 103,
        name = "Aishu",
        marks = 90
    )

    println("ALL REGISTERED STUDENTS:")
    studentService.getAllStudents().forEach { s ->
        println(s.name)
    }

    println()
    println("STUDENT OF ID 102 is: ${studentService.getStudentById(102)}")

    println()
    studentService.generateStudentReport()
}