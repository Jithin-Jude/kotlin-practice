package M2.test_programs

// ClassConstructorDeligation

fun main() {
    val obj = MyClass(1,2, 3)
}

class MyClass(
    val a: Int,
) {

    init {
        println("constructor A")
    }

    constructor(
        a: Int,
        b: Int,
    ): this(
        a = a,
    ) {
        println("constructor B")
    }


    constructor(
        a: Int,
        b: Int,
        c: Int,
    ): this(
        a = a,
        b = b,
    ){
        println("constructor C")
    }

}