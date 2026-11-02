package M2.test_programs

// ExampleAbstractClass

fun main () {
    val c = CarU1()
    val b = BikeU1()

    c.start()
    c.stop()

    b.start()
    b.stop()

}

class BikeU1: VehicleU1() {

    override val name: String = "TVS WeGo"

    override fun start() {
        println("Start using button")
    }
}

class CarU1: VehicleU1() {

    override val name: String = "Celerio"

    override fun start() {
        println("Start using key")
    }
}

abstract class VehicleU1() {
    abstract val name: String

    abstract fun start()

    fun stop() {
        println("Stop the vehicle")
    }
}