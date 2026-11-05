package M2.practice_problems

// EcommerceOrderProcessorScopeFunctionsDemo

fun main(){
    // Use apply() to initialise an Order.
    val p1 = DigitalProduct().apply {
        id = 1001
        name = "Phone"
        price = 25000.0
        quantity = 5
    }
    val p2 = DigitalProduct().apply {
        id = 1002
        name = "Pen"
        price = 500.0
        quantity = 20
    }
    val p3 = DigitalProduct().apply {
        id = 1003
        name = "Watch"
        price = 5000.0
        quantity = 10
    }

    // Use also() to log order creation.
    val order = Order().apply {
        orderId = 101
        products = mutableListOf(p1,p2,p3)
        isPaid = true
    }.also { o ->
        println("Order ${o.orderId} created.")
    }

    println()

    // Use let() to calculate a product's discounted price.
    val discountPercentage = 10
    order.products?.let { pList ->
        pList.forEach { p ->
            println("${p.name} | ${p.price?.let { price -> "${p.price} | ${price - (price * discountPercentage / 100)}" }}")
        }
    }

    println()

    // Use run() to calculate the total order value.
    val totalOrderValue = order.products?.fold(0.0){acc, product -> acc + ((product.price ?: 0.0 ) * (product.quantity?.toDouble() ?: 0.0))}
    println( "Total order value:$totalOrderValue")

    println()

    // Use with() to print the order summary.
    with(order) {
        println("Order ID: $orderId")
        println("Number of Products: ${products?.size}")
        println("Is paid: $isPaid")

        println()

        products?.forEach { product ->
            println("${product.id} | ${product.name} | ${product.quantity} | ${product.price}")
        }
    }
}

class DigitalProduct {
    var id: Int? = null
    var name: String? = null
    var price: Double? = null
    var quantity: Int? = null
}

class Order {
    var orderId: Int? = null
    var products: MutableList<DigitalProduct>? = null
    var isPaid: Boolean? = null
}