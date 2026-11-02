package M2.test_programs

// ExampleCustomGettersAndSetters

class Square(var side: Int) {
    val area: Int get() = side * side
}