package M2.test_programs

// EgRunTimePolymorphism

fun main() {
    val b: AClass = BClass()
    val c: AClass = CClass()

    b.printFunction()
    c.printFunction()
}

class CClass: BClass() {
    override fun printFunction() {
        println("printFunction implementation in class C")
    }
}

open class BClass: AClass() {
    override fun printFunction() {
        println("printFunction implementation in class B")
    }
}

abstract class AClass{
    abstract fun printFunction()
}