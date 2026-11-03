package M2.practice_problems

// E-commerce Product Management

fun main() {
    val lisOfProduct: MutableList<Product> = mutableListOf()

    lisOfProduct.add(
        Product(
            id = 101,
            name = "A",
            category = "CAT_X",
            price = 100.0,
            stock = 10,
        )
    )
    lisOfProduct.add(
        Product(
            id = 102,
            name = "B",
            category = "CAT_X",
            price = 200.0,
            stock = 20,
        )
    )
    lisOfProduct.add(
        Product(
            id = 103,
            name = "C",
            category = "CAT_Y",
            price = 50.0,
            stock = 30,
        )
    )
    lisOfProduct.add(
        Product(
            id = 104,
            name = "D",
            category = "CAT_Y",
            price = 45.0,
            stock = 40,
        )
    )
    lisOfProduct.add(
        Product(
            id = 105,
            name = "E",
            category = "CAT_Z",
            price = 500.0,
            stock = 50,
        )
    )

    // product 103 removed
    lisOfProduct.removeAt(lisOfProduct.indexOf(lisOfProduct.firstOrNull { p -> p.id == 103 }))

    val searchKey = "D"
    val searchedProduct = lisOfProduct[lisOfProduct.indexOf(lisOfProduct.firstOrNull { p -> p.name == searchKey })]
    println("Searched product is: ${searchedProduct}")


    val filterKey = "CAT_X"
    val listOfFilteredProducts = lisOfProduct.filter { p -> p.category == filterKey }
    println("\nFiltered products:")
    for (p in listOfFilteredProducts) {
        println(p.toString())
    }

    println("\nSorted products:")
    for (p in lisOfProduct.sortedBy { p -> p.price }) {
        println(p.toString())
    }

    val sum = lisOfProduct.fold(0.0) {acc, price -> acc + price.price}
    println("Total inventory value: $sum")

    val lowStockProducts = lisOfProduct.filter { p -> p.stock < 15 }
    println("\nLow Stock products:")
    for (p in lowStockProducts) {
        println(p.toString())
    }

    lisOfProduct.groupBy { p -> p.category }
    lisOfProduct.associateBy { p -> p.id }
}

data class  Product(
    val id: Int,
    val name: String,
    val category: String,
    val price: Double,
    val stock: Int,
)