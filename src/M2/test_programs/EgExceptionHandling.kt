package M2.test_programs

// EgExceptionHandling

fun main() {
    try {
        throw NullPointerException("Custom fire")
//        val r = 3/0
    } catch(e: NullPointerException) {
        println("NullPointerExpection happened ${e}")
    } catch(e: Exception) {
        println("Unknown error: ${e.message}")
    } finally {
        println("I will always print.")
    }
}