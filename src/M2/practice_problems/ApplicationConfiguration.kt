package M2.practice_problems

// Application Configuration

fun main() {
    AppConfig.displayConfig()
    println()
    AppConfig.disableDebugMode()
    AppConfig.displayConfig()

    val user = User.createUser(id = "303", name = "Nedumaaran")
    println("Created user: ${user.name}")
}

class User private constructor(
    val id: String,
    val name: String,
) {
    companion object {
        fun createUser(id: String, name: String): User {
            return User(id = id, name = name)
        }
    }

}

object AppConfig {
    val appName: String = "My App"
    val appVersion: Int = 2
    var debugMode: Boolean = true

    fun displayConfig() {
        println("App Name: $appName")
        println("App Version: $appVersion")
        println("Debug Mode: $debugMode")
    }

    fun enableDebugMode() {
        debugMode = true
    }

    fun disableDebugMode() {
        debugMode = false
    }
}