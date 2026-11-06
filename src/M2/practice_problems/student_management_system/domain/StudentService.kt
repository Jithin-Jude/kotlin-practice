package M2.practice_problems.student_management_system.domain

import M2.practice_problems.student_management_system.model.Student
import M2.practice_problems.student_management_system.repository.StudentRepositoryImpl

class StudentService {
    val studentRepo = StudentRepositoryImpl()

    // Register a student.
    fun registerStudent(
        id: Int,
        name: String,
        marks: Int,
    ) {
        val student = Student(
            id = id,
            name = name,
            marks = marks
        )

        if(!student.validateStudent()){
            println("Student data is not valid")
            return
        }

        studentRepo.addStudent(student)
        println("Student registration success")
    }

    // Validate student details.
    fun Student.validateStudent(): Boolean {
        val studentIdAlreadyPresent = getAllStudents().map{s -> s.id}.contains(this.id)
        return this.name.isNotEmpty() &&
                this.name.isNotBlank() &&
                this.marks >= 0 && !studentIdAlreadyPresent
    }

    fun getAllStudents(): List<Student> {
        return studentRepo.getAllStudents()
    }

    fun getStudentById(id: Int): Student? {
        return studentRepo.getStudentById(id)
    }

    fun generateStudentReport() {
        val allStudents = getAllStudents()

        allStudents.forEach{ s ->
            println("${s.id} | ${s.name} | ${s.marks} | ${calculateGrade(s.marks)}")
        }
    }

    fun calculateGrade(mark: Int): String {
        when(mark) {
            in 90..100 -> {
                return "A"
            }
            in 75..89 -> {
                return "B"
            }
            in 60..74 -> {
                return "C"
            }
            in 40..59 -> {
                return "D"
            }
            else -> {
                return "F"
            }
        }
    }
}