package M2.test_programs

import java.io.BufferedReader
import java.io.File
import java.io.IOException
import kotlin.Error

// EgExceptionHandling

fun main() {

    fileReader()

    testRequireAndCheck(2)

    println(testFinally())

    try {
        throw NullPointerException("Custom fire")
//        throw OutOfMemoryError("Custom fire")
//        val r = 3/0
    } catch(e: NullPointerException) {
        println("My NullPointerExpection happened ${e.message}")
//        e.printStackTrace()
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

    // try-catch as an expression
    val r = try {
        7/0
    } catch(e: Exception) {
        0
    }
    println("Try-catch as an expression: $r")

    // try without finally
    try {
        println()
    } finally {

    }
}

// Custom Exception
class InsufficientBalanceException(
    customMessage: String
): Exception(customMessage)

fun recursiveFunction() {
    recursiveFunction()
}

//@Throws(IOException::class)
fun testFinally(): Int {
    try {
        return 10
    } finally {
        println("Cleanup")
    }
}

fun testRequireAndCheck(value: Int?){

    requireNotNull(value) {
        "Value should be > 0"
    }

    checkNotNull(value) {
        "Value should be > 0"
    }

    require(value = value > 0) {
        "Value should be > 0"
    }

    println("Require test done")

    check(value > 0) {
        "Value should be > 0"
    }

    println("Check test done")
}

fun fileReader() {
    var mReader: BufferedReader? = null
    try{
        mReader = File("/Users/jithinjude/Desktop/MACMINI_EXHDD/BRO/BroPractice/practice/src/M2/test_programs/sample.txt").bufferedReader()
        val content = mReader.readText()
        println(content)
    } catch (e: Exception) {
        println("File issue: ${e.message}")
    } finally {
        mReader?.close()
        println("File closed.")
    }
}