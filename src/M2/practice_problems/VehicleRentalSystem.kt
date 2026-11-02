package M2.practice_problems

// Vehicle Rental System

fun main() {
    val vehicleList = listOf(
        Car(
            brand = "Suzuki",
            model = "Alto",
            rentalPricePerDay = 100.0,
        ),
        Bike(
            brand = "TVS",
            model = "WeGo",
            rentalPricePerDay = 50.0,
        ),
        Truck(
            brand = "Scania",
            model = "X3",
            rentalPricePerDay = 1000.0,
        ),
    )

    for (vehicle in vehicleList) {
        vehicle.displayDetails()
        println("Rent: ${vehicle.calculateRentalCost(noOfDays = 30)}")
        println("Rent with discount: ${vehicle.calculateRentalCost(noOfDays = 30, discount = 5.0)}")
        println()
    }
}

class Car(
    brand: String,
    model: String,
    rentalPricePerDay: Double,
): Vehicle(
    brand = brand,
    model = model,
    rentalPricePerDay = rentalPricePerDay,
) {
    override fun calculateRentalCost(noOfDays: Int): Double {
        return rentalPricePerDay * noOfDays
    }

    override fun calculateRentalCost(noOfDays: Int, discount: Double): Double {
        val baseCost = rentalPricePerDay * noOfDays
        return baseCost * (1 - discount / 100)
    }
}

class Bike(
    brand: String,
    model: String,
    rentalPricePerDay: Double,
): Vehicle(
    brand = brand,
    model = model,
    rentalPricePerDay = rentalPricePerDay,
) {
    override fun calculateRentalCost(noOfDays: Int): Double {
        return rentalPricePerDay * noOfDays
    }

    override fun calculateRentalCost(noOfDays: Int, discount: Double): Double {
        val baseCost = rentalPricePerDay * noOfDays
        return baseCost * (1 - discount / 100)
    }
}

class Truck(
    brand: String,
    model: String,
    rentalPricePerDay: Double,
): Vehicle(
    brand = brand,
    model = model,
    rentalPricePerDay = rentalPricePerDay,
) {
    override fun calculateRentalCost(noOfDays: Int): Double {
        return rentalPricePerDay * noOfDays
    }

    override fun calculateRentalCost(noOfDays: Int, discount: Double): Double {
        val baseCost = rentalPricePerDay * noOfDays
        return baseCost * (1 - discount / 100)
    }
}

abstract class Vehicle(
    var brand: String,
    var model: String,
    var rentalPricePerDay: Double,
) {
    abstract fun calculateRentalCost(noOfDays: Int): Double

    abstract fun calculateRentalCost(noOfDays: Int, discount: Double): Double

    fun displayDetails() {
        println("Brand: ${brand}")
        println("Model: ${model}")
        println("Rent Per Day: ${rentalPricePerDay}")
    }
}