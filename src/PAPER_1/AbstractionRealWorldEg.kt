package PAPER_1

// Abstraction real world example.

fun main() {
    val paymentSys: PaymentSystem = CreditCard()

    paymentSys.pay(1500.0)
}

abstract class PaymentSystem {
    abstract fun pay(amount: Double)
}

class GooglePay: PaymentSystem() {
    override fun pay(amount: Double) {
        println("Payment of $amount processed via Google Pay")
    }
}

class CreditCard: PaymentSystem() {
    override fun pay(amount: Double) {
        println("Payment of $amount processed via Credit Card")
    }
}