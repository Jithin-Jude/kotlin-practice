package M2.practice_problems

// Functional E-commerce Order Processor

fun main() {
    var cpList = listOf(
        ConsumerProduct(
            id = 101,
            name = "Face Wash",
            price = 50.0,
            quantity = 10,
            category = "A",
        ),
        ConsumerProduct(
            id = 102,
            name = "Lux Soap",
            price = 40.0,
            quantity = 20,
            category = "B",
        ),
        ConsumerProduct(
            id = 103,
            name = "Pen",
            price = 10.0,
            quantity = 100,
            category = "C",
        ),
        ConsumerProduct(
            id = 104,
            name = "Notebook",
            price = 25.0,
            quantity = 50,
            category = "D",
        ),
        ConsumerProduct(
            id = 105,
            name = "Mirror",
            price = 150.0,
            quantity = 15,
            category = "E",
        ),
        ConsumerProduct(
            id = 106,
            name = "Pencil",
            price = 5.0,
            quantity = 200,
            category = "A",
        ),
        ConsumerProduct(
            id = 107,
            name = "Marker",
            price = 40.0,
            quantity = 70,
            category = "B",
        ),
        ConsumerProduct(
            id = 108,
            name = "Slate",
            price = 250.0,
            quantity = 100,
            category = "C",
        ),
        ConsumerProduct(
            id = 109,
            name = "Name Slips",
            price = 65.0,
            quantity = 10,
            category = "D",
        ),
        ConsumerProduct(
            id = 110,
            name = "Candy",
            price = 10.0,
            quantity = 15,
            category = "E",
        ),
    )

    // Create at least 10 products.

    //Use filter() to find products in a selected category.

    println(cpList.filter { p -> p.category == "B" }.map { p -> p.name })

    println()

    //Use map() to calculate the price after a 10% discount.
    println("calculate the price after a 10% discount")
    cpList.map { p -> p.copy(price = p.price - (p.price * 10/100)) }
        .forEach { p ->
            println("${p.name} => ${p.price}")
        }

    println()

    //Use sortedByDescending() to rank products by price.
    cpList.sortedByDescending { p -> p.price }.forEach { p ->
        println("${p.name} => ${p.price}")
    }

    println()

    //Use groupBy() to categorise products.
    cpList.groupBy { p -> p.category }.forEach { cat, products ->
        println("$cat => ${products.map { p -> p.name }}")
    }

    println()

    //Use fold() to calculate the complete order value.
    println(cpList.fold(0) {acc, product -> (acc + (product.price * product.quantity)).toInt()})

    println()

    //Create reusable functions for discount calculation.
    cpList
        .map { p -> p.copy(price = discountCalc(p, {cpPrice: Double, dPercentage: Double -> cpPrice - (cpPrice * dPercentage/100)})) }
        .forEach { discountedProduct ->
            println("${discountedProduct.name} => ${discountedProduct.price}")
        }

    println()
}

fun discountCalc(
    product: ConsumerProduct,
    calculateDiscount: (Double, Double) -> Double
    ): Double {
    val discountPercentage = 10.0
    return calculateDiscount(product.price, discountPercentage)
}

data class ConsumerProduct(
    val id: Int,
    val name: String,
    val price: Double,
    val quantity: Int,
    val category: String,
)