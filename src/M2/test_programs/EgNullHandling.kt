package M2.test_programs

// Eg Null Handling

fun main(){
    // ?:
//    val m1: String? = null
//    m1 ?: throw Exception("My custom exception")

//    val m2: Int? = 101
//    val m3 = m2!!

    // Safe Type Casting as?
    val value: Any = 100
    val a = value as? Int
    val b = value as? String
    println(a)
    println(b)

    println()

    // isNullOrEmpty, isNullOrBlank
    val str1: String? = null
    val str2: String? = "Jithin"
    val str3: String? = ""

    println(str1.isNullOrEmpty()) // true
    println(str2.isNullOrEmpty()) // false
    println(str3.isNullOrEmpty()) // false
    println(str3.isNullOrBlank()) // true

    println()

    // filterNotNull
    val listOfString1 = listOf("A", "B", null, "C", "D")
    println(listOfString1)
    println(listOfString1.filterNotNull())

    println()

    // orEmpty
    val str4: String? = null
    println("A-${str4}-B")
    println("A-${str4.orEmpty()}-B")

    val listOfString2: List<String?>? = null
    println(listOfString2)
    val listOfString3 = listOfString2.orEmpty()
    println(listOfString3)

    println()

    // requireNotNull(), checkNotNull()
    val str5: String? = "Jithin"
    println(requireNotNull(str5){
        "My requireNotNull Error message"
    })
    println(checkNotNull(str5){
        "My checkNotNull Error message"
    })

    val str6: String? = null
    println(requireNotNull(str6){
        "My requireNotNull Error message"
    })
    println(checkNotNull(str6){
        "My checkNotNull Error message"
    })


}