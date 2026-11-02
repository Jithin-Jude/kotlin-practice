package M2.practice_problems

// AnimalHierarchy

fun main() {
    val dog = Dog(
        name = "Tommy",
        age = 5,
    )
    dog.makeSound()
    dog.eat()

    println()

    val cat = Cat(
        name = "Goose",
        age = 8,
    )
    cat.makeSound()
    cat.eat()

    println()

    val cow = Cow(
        name = "Reha",
        age = 7,
    )
    cow.makeSound()
    cow.eat()
}

class Dog(name: String, age: Int): Animal(name = name, age = age) {
    override fun makeSound() {
        super.eat()
        println("$name Bow.. Bow")
    }

}

class Cat(name: String, age: Int): Animal(name = name, age = age) {
    override fun makeSound() {
        super.eat()
        println("$name Meow.. Meow")
    }
}

class Cow(name: String, age: Int): Animal(name = name, age = age) {
    override fun makeSound() {
        println("$name Bea.. Bea")
        super.eat()
    }

}

abstract class Animal(
    var name: String,
    var age: Int,
) {

    abstract fun makeSound()

    fun eat() {
        println("$name Eating")
    }
}