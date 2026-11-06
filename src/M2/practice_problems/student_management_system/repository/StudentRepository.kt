package M2.practice_problems.student_management_system.repository

import M2.practice_problems.student_management_system.model.Student

interface StudentRepository {
    fun addStudent(student: Student)

    fun getStudentById(id: Int): Student?

    fun getAllStudents(): List<Student>
}