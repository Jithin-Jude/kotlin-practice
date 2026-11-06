package M2.practice_problems.student_management_system

import M2.practice_problems.student_management_system.model.StudentGrade

object StudentUtils {
    fun calculateGrade(mark: Int): StudentGrade {
        when(mark) {
            in 90..100 -> {
                return StudentGrade.A
            }
            in 75..89 -> {
                return StudentGrade.B
            }
            in 60..74 -> {
                return StudentGrade.C
            }
            in 40..59 -> {
                return StudentGrade.D
            }
            else -> {
                return StudentGrade.F
            }
        }
    }
}