package M2.practice_problems

// API Response Handler

fun main() {
    val res = ApiResponse(
        status = "SUCCESS",
        message = null,
        data = UserData(
            userId = 101,
            name = "Jithin",
            address = Address(
                city = "Kochi",
                country = "India",
            )
        )
    )
    handleResponse(response = res)
}

fun handleResponse(response: ApiResponse?) {
    if(response == null) {
        println("No response received")
    } else {
        if (response.status == "SUCCESS") {
            println(response.data?.userId)
            println(response.data?.name ?: "Unknown Name")
            println("${response.data?.address?.city ?: "Unknown City"}, ${response.data?.address?.country ?: "Unknown Country"}")
        } else if (response.status == "ERROR") {
            println(response.message)
        } else {
            println("Unknown Response")
        }
    }
}

data class ApiResponse(
    val status: String?,
    val message: String?,
    val data: UserData?
)

data class UserData(
    val userId: Int?,
    val name: String?,
    val address: Address?
)

data class Address(
    val city: String?,
    val country: String?
)