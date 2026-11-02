package M2.practice_problems

// DigitalWallet

fun main() {
    val customer1 = DigitalWallet(
        ownerName = "Jithin",
        walletId = "123",
        balance = 5000,
    )

    println("Initial Balance: ${customer1.checkBalance()}")
    customer1.addMoney(2000)
    customer1.makePayment(1500)
    println("Final Balance: ${customer1.checkBalance()}")
}

class DigitalWallet(
    private var ownerName: String,
    private var walletId: String,
    private var balance: Int
) {
    fun addMoney(amount: Int) {
        if (amount > 0) {
            balance += amount
            println("Added: $amount")
        } else {
            println("Invalid amount.")
        }
    }

    fun makePayment(amount: Int) {
        if (amount > 0 && amount <= balance) {
            balance -= amount
            println("Payment: $amount")
        } else {
            println("Invalid amount or insufficient balance.")
        }
    }

    fun checkBalance(): Int {
        return balance
    }
}