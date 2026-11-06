package M2.practice_problems.student_management_system.view

import M2.practice_problems.student_management_system.domain.StudentService
import M2.practice_problems.student_management_system.repository.StudentRepository
import M2.practice_problems.student_management_system.repository.StudentRepositoryImpl

// Student Management View

fun main(){
    val studentRepo: StudentRepository = StudentRepositoryImpl()
    val studentService = StudentService(studentRepo)

    try {
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

        println("Student registration success")

    } catch(e: IllegalArgumentException) {
        println("Student registration failed: ${e.message}")
    }

    println()
    println("ALL REGISTERED STUDENTS:")
    studentService.getAllStudents().forEach { s ->
        println(s.name)
    }

    println()
    println("STUDENT OF ID 102 is: ${studentService.getStudentById(102)}")

    println()
    studentService.generateStudentReport(102)?.run{
        println("$name => ${grade.name}")
    }
}