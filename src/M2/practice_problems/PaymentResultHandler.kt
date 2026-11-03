package M2.practice_problems

// Payment Result Handler

fun main(){
    paymentProcessor(paymentMethod = PaymentMethod.UPI, paymentResult = PaymentResult.Success(data = "thanks"))
}

fun paymentProcessor(paymentMethod: PaymentMethod, paymentResult: PaymentResult) {
    when(paymentResult) {
        is PaymentResult.Loading -> {
            println("LOADING: ${paymentMethod.name} payment.")
        }
        is PaymentResult.Cancelled -> {
            println("CANCELLED: ${paymentMethod.name} payment.")
        }
        is PaymentResult.Failure -> {
            println("FAILURE: ${paymentMethod.name} payment.")
        }
        is PaymentResult.Success -> {
            println("SUCCESS: ${paymentMethod.name} payment.")
        }
    }
}

sealed class PaymentResult {
    object Loading: PaymentResult()
    data class Success(val data: String): PaymentResult()
    data class Failure(val message: String): PaymentResult()
    data class Cancelled(val message: String): PaymentResult()
}

enum class PaymentMethod {UPI, CREDIT_CARD, PAYPAL, WALLET}