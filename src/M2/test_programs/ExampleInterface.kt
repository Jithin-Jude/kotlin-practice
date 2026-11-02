package M2.test_programs

// ExampleInterface

fun main() {
    val upi = UpiPayment()
    upi.pay(1000)
    upi.refund(500)

    val cc = CreditCardPayment()
    cc.pay(2000)
    cc.refund(1000)
}

class UpiPayment: Payment {
    override fun pay(amount: Int) {
        println("Paid using UPI.")
    }
}

class CreditCardPayment: Payment {
    override fun pay(amount: Int) {
        println("Paid using Credit Card")
    }
}

interface Payment {
    fun pay(amount: Int)

    fun refund(amount: Int) {
        println("$amount refunded.")
    }
}