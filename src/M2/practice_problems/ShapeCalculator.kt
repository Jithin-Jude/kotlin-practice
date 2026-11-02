package M2.practice_problems

// ShapeCalculator

fun main() {
    val c = Circle(radius = 50)
    c.displayDetails()

    println()

    val sq = Square(side = 50)
    sq.displayDetails()

    println()

    val rec = Rectangle(width = 50, height = 20)
    rec.displayDetails()

}

class Rectangle(
    var width: Int,
    var height: Int,
): Shape() {
    override var name: String = "Circle"

    override fun calculateArea(): Double {
        return (width * height).toDouble()
    }

    override fun calculatePerimeter(): Double {
        return 2 * (width + height).toDouble()
    }

    override fun displayDetails() {
        println("Shape: $name")
        println("Width: $width")
        println("Height: $height")
        println("Area: ${calculateArea()}")
        println("Perimeter: ${calculatePerimeter()}")
    }
}

class Square(
    var side: Int
): Shape() {
    override var name: String = "Circle"

    override fun calculateArea(): Double {
        return (side * side).toDouble()
    }

    override fun calculatePerimeter(): Double {
        return (4 * side).toDouble()
    }

    override fun displayDetails() {
        println("Shape: $name")
        println("Length: $side")
        println("Area: ${calculateArea()}")
        println("Perimeter: ${calculatePerimeter()}")
    }
}

class Circle(
    var radius: Int
): Shape() {
    override var name: String = "Circle"

    override fun calculateArea(): Double {
        return 3.14 * radius * radius
    }

    override fun calculatePerimeter(): Double {
        return 2 * 3.14 * radius
    }

    override fun displayDetails() {
        println("Shape: $name")
        println("Radius: $radius")
        println("Area: ${calculateArea()}")
        println("Perimeter: ${calculatePerimeter()}")
    }
}

abstract class Shape {
    abstract var name: String

    abstract fun calculateArea(): Double

    abstract fun calculatePerimeter(): Double

    abstract fun displayDetails()
}