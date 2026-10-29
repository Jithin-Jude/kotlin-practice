package programs

// Sum of two floating point numbers

fun main() {
    // Print from 1 to 5
    for (num in 1..5) {
        print("$num, ")
    }

    print("\n")

    // Print from 1 to 4
    for (num in 1 until 5) {
        print("$num, ")
    }

    print("\n")

    // Print from 1 to 4
    for (num in 5 downTo 1) {
        print("$num, ")
    }

    print("\n")

    // Print from 1 to 10
    for (num in 1..10 step 2) {
        print("$num, ")
    }

    print("\n")

    // while loop: 0 to 4
    var i = 0
    while (i < 5) {
        print("$i, ")
        i++
    }

    print("\n")

    // do-while loop: 10 to 1
    var j = 10
    do {
        print("$j, ")
        j--
    } while (j > 0)
}