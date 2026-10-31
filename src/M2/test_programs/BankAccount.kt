package M2.test_programs

// BankAccount

fun main() {

    val ba1 = BankAccount()

    println("Initial account balance: ${ba1.checkBalance()}")
    ba1.deposit(amount = 45000)
    ba1.withdraw(amount = 15000)

//    ba1.accountBalance = 0 // Won't work

    println("Remaining account balance: ${ba1.checkBalance()}")

}

class BankAccount {
    private var accountBalance: Int = 0

    fun deposit(amount: Int) {
        if (amount > 0) {
            accountBalance += amount
        } else {
            println("Invalid amount!")
        }
    }

    fun withdraw(amount: Int) {
        if (amount < 0) {
            println("Invalid amount!")
        } else if (amount > accountBalance) {
            println("Insufficient account balance!")
        } else {
            accountBalance -= amount
        }
    }

    fun checkBalance(): Int {
        return accountBalance
    }
}