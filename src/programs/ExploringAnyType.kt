package programs

// ExploringAnyType

fun main () {
    myFunction(a = 123)
    myFunction(a = "123")
    myFunction(a = 2.5)
    myFunction(a = true)
    myFunction(a = 2.5f)
    myFunction(a = null)
}

fun myFunction (a: Any?): Unit {
    if (a is Int) {
        println("a has Int")
    } else if (a is String) {
        println("a has String")
    } else if (a is Double) {
        println("a has Double")
    } else if (a is Boolean) {
        println("a has Boolean")
    } else {
        if (a != null) {
            println("a has ${a::class.simpleName}")
        } else {
            println("a is null")
        }
    }
}