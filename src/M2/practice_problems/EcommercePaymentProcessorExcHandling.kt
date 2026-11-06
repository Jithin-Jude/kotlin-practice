package M2.practice_problems

// EcommercePaymentProcessorExcHandling

fun main() {
    val listOfPayment = listOf(
        JPayment().apply {
            paymentId = 101
        },
        JPayment().apply {
            paymentId = 102
        },
        JPayment().apply {
            paymentId = 103
        },
        JPayment().apply {
            paymentId = 104
        },
        JPayment().apply {
            paymentId = 105
        }
    )

    listOfPayment.forEach { payment ->
        payment.processPayment(value = 100.0)
        println()
    }
}

class JPayment {
    var paymentId: Int = 0

    // Use a private property to protect payment state.
    private var amount: Double = 5000.0
    private var isPaid: Boolean = false

    // Validate the payment amount.
    // Throw InvalidAmountException for invalid amounts.
    // Handle exceptions using multiple catch blocks.

    fun validatePaymentAmount(value: Double) {
        try {
            require(value > 0) {
                "Invalid amount."
            }
        } catch (e: IllegalArgumentException) {
            throw InvalidAmountException("Invalid amount: $e")
        }

        println("Payment validation success.")
    }

    // Prevent processing an already completed payment.
    // Throw PaymentAlreadyCompletedException when a completed payment is processed again.
    // Use finally to execute transaction cleanup.
    fun processPayment(value: Double) {
        try {
            validatePaymentAmount(value = value)

            if(isPaid) {
                throw PaymentAlreadyCompletedException("Already paid")
            }

            amount += value
            isPaid = true
            println("Payment processed.")
            println("Amount: $amount")

        } catch (e: PaymentAlreadyCompletedException) {
            println(e.message)
            return
        } catch (e: InvalidAmountException) {
            println(e.message)
            return
        } finally {
            println("Transaction cleaned up.")
        }
    }
}

class InvalidAmountException(customMessage: String)
    : Exception(customMessage)

class PaymentAlreadyCompletedException(customMessage: String)
    : Exception(customMessage)