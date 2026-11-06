package M2.practice_problems.student_management_system.domain

import M2.practice_problems.student_management_system.StudentUtils.calculateGrade
import M2.practice_problems.student_management_system.model.Student
import M2.practice_problems.student_management_system.model.StudentReport
import M2.practice_problems.student_management_system.repository.StudentRepository

class StudentService(private val studentRepo: StudentRepository) {

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

        require(student.validateStudent()){
            "Student data is not valid"
        }

        studentRepo.addStudent(student)
    }

    // Validate student details.
    fun Student.validateStudent(): Boolean {
        val studentIdAlreadyPresent = getAllStudents().map{s -> s.id}.contains(this.id)
        return this.name.isNotEmpty() &&
                this.name.isNotBlank() &&
                this.marks in 0..100 && !studentIdAlreadyPresent
    }

    fun getAllStudents(): List<Student> {
        return studentRepo.getAllStudents()
    }

    fun getStudentById(id: Int): Student? {
        return studentRepo.getStudentById(id)
    }

    fun generateStudentReport(id: Int): StudentReport? {
        val student = getStudentById(id) ?: return null

        return StudentReport(
            name = student.name,
            grade = calculateGrade(student.marks),
        )
    }
}