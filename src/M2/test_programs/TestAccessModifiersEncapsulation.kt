package M2.test_programs

// TestAccessModifiersEncapsulation

open class Vehicle {
    protected var numOfWheels = 4
    private var fuel = "Pertol"

    protected fun accelerateVehicle() {
        println("Using more $fuel")
    }
}

class Car: Vehicle() {
    fun increaseSpeed() {
        accelerateVehicle()
    }

    fun getNumOfWheels() {
        println("Number of wheels is: $numOfWheels")
    }
}