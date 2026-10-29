package practice_problems

// FindLastPrimeNumberFromGivenArray

fun main () {
    val a = arrayOf(1,9,2,8,3,7,4,6,5)

//    for (element in a.indices.reversed()) {
//        print("${a[element]}, ")
//    }

    for (element in a.indices.reversed()) {
//        println(element)
        if (isPrime(a[element])) {
            println("The last prime number is ${a[element]}")
            break
        }
    }
}

fun isPrime(num: Int): Boolean {
    if (num <= 1) {
        return false
    }

    var isPrime = true

    for (i in 2..(num/2)) {
        if (num % i == 0) {
            isPrime = false
            break
        }
    }
    return isPrime
}