package M2.test_programs

// EgCustomGetterSetter

class MyBankAccount {
    var balance: Double = 0.0
        get() = 25000.0
        private set(a) {
            if (a >= 0) {
                field = a
            } else {
                field = 0.0
                println("Invalid value")
            }
        }
}

class Rect(val l: Int, val b: Int) {
    val area: Int get() = l * b
}