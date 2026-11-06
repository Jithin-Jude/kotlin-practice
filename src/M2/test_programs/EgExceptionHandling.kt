package M2.test_programs

import kotlin.Error

// EgExceptionHandling

fun main() {
    try {
        throw NullPointerException("Custom fire")
//        throw OutOfMemoryError("Custom fire")
//        val r = 3/0
    } catch(e: NullPointerException) {
        println("My NullPointerExpection happened ${e.printStackTrace()}")
    } catch(e: Exception) {
        println("My Unknown error: ${e.message}")
    } finally {
        println("I will always print.")
    }

    try {
        recursiveFunction()
    } catch(e: Error) { // Generally this is not good for applications
        println("My StackOverflowError happened ${e}")
    } finally {
        println("Finally error caught.")
    }
}

fun recursiveFunction() {
    recursiveFunction()
}