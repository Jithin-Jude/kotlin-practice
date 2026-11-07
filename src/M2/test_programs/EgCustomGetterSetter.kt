package M2.test_programs

// EgCustomGetterSetter

fun main() {
    val rectangle = Rect(2,5)
    println(rectangle.area)

    val bank = MyBankAccount()

    bank.balance = 1000.0
//    bank.balance = -1000.0
}

class MyBankAccount {
    var balance: Double = 0.0
        get() = 25000.0
        set(a) {
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