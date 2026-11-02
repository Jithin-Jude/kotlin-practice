package M2.test_programs

// ExampleMultiLevelInheritance

fun main () {
    val d = Dog()
    d.mammalBehaviour()
    d.animalBehaviour()
}

abstract class Animal{
    abstract var name: String

    abstract fun animalBehaviour()
}

abstract class Mammal : Animal() {

    abstract var mammalProperty: String

    abstract fun mammalBehaviour()
}

class Dog : Mammal() {
    override var mammalProperty: String = "Dog property"

    override fun mammalBehaviour() {
        println("Mammal Behaviour: $mammalProperty")
    }

    override var name: String = "Animal property"

    override fun animalBehaviour() {
        println("Animal behaviour: $mammalProperty")
    }
}