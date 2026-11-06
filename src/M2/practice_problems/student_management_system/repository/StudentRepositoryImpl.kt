package M2.practice_problems.student_management_system.repository

import M2.practice_problems.student_management_system.model.Student

class StudentRepositoryImpl: StudentRepository {

    val studentList = mutableMapOf<Int, Student>()

    override fun addStudent(student: Student) {
        studentList.put(student.id, student)
    }

    override fun getStudentById(id: Int): Student? {
        return studentList[id]
    }

    override fun getAllStudents(): List<Student> {
        return studentList.map{s -> s.value}
    }
}