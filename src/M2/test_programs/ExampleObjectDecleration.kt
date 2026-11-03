package M2.test_programs

// ExampleObjectDecleration

fun main() {
    Utils.abc
    println("done")
    Utils.sendLog(message = "Start")
}

object Utils: ObjBase(), C {

    init {
        println("init")
    }

    var abc = "ABC"

    override fun ttest() {
        println("ab")
    }

    override fun testFun() {
        println("test")
    }

    fun sendLog(message: String) {
        println("Log sent: $message")
    }
}

abstract class ObjBase() {
    abstract fun ttest()
}

interface C {
    fun testFun()
}