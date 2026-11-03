package M2.test_programs

// ExampleObjectExpression

fun main() {
    val listener = object: ClickListener {
        override fun onClick(value: String) {
            println("$value clicked!")
        }
    }

    listener.onClick("TEST")
}

interface ClickListener {
    fun onClick(value: String)
}