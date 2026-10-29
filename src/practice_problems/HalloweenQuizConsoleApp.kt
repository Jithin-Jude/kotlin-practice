package practice_problems

// HalloweenQuizConsoleApp

data class Question(
    val text: String,
    val options: List<String>,
    val correctOption: Int
)

fun main() {

    println("================================")
    println("     🎃 HALLOWEEN QUIZ 🎃")
    println("================================")

    print("Enter your name: ")
    val name = readln().trim().ifBlank { "Guest" }

    var score = 0

    val questions = listOf(

        Question(
            "1. On which date is Halloween celebrated?",
            listOf("October 25", "October 31", "November 1", "December 25"),
            2
        ),

        Question(
            "2. Which ancient Celtic festival is associated with Halloween's origins?",
            listOf("Samhain", "Saturnalia", "Yule", "Ostara"),
            1
        ),

        Question(
            "3. What does the word Halloween derive from?",
            listOf(
                "Harvest Evening",
                "Holy Winter",
                "All Hallows' Eve",
                "Haunted Evening"
            ),
            3
        ),

        Question(
            "4. Which vegetable was traditionally used to make early jack-o'-lanterns in Ireland?",
            listOf("Potato", "Turnip", "Carrot", "Cabbage"),
            2
        ),

        Question(
            "5. What do children traditionally say when visiting houses on Halloween?",
            listOf(
                "Happy Holidays",
                "Give Me Food",
                "Trick or Treat",
                "Welcome Home"
            ),
            3
        ),

        Question(
            "6. Which two colours are commonly associated with Halloween?",
            listOf(
                "Red and White",
                "Blue and Yellow",
                "Green and Pink",
                "Orange and Black"
            ),
            4
        ),

        Question(
            "7. Which creature is commonly associated with vampires in Halloween folklore?",
            listOf("Rabbit", "Bat", "Horse", "Dolphin"),
            2
        ),

        Question(
            "8. Which Christian observance falls on November 1 and is associated with Halloween's name?",
            listOf(
                "Christmas Day",
                "Good Friday",
                "All Saints' Day",
                "Easter Sunday"
            ),
            3
        ),

        Question(
            "9. Which of these is commonly carved into a Halloween lantern?",
            listOf("Pumpkin", "Watermelon", "Coconut", "Pineapple"),
            1
        ),

        Question(
            "10. In Halloween folklore, which object is commonly associated with witches flying?",
            listOf("Magic carpet", "Broomstick", "Umbrella", "Walking stick"),
            2
        )
    )

    println("\nWelcome, $name!")
    println("There are ${questions.size} questions.")
    println("Each correct answer earns 10 points.")
    println("Let's begin!\n")

    // Display questions in random order
    val randomQuestions = questions.shuffled()

    randomQuestions.forEachIndexed { index, question ->

        println("--------------------------------")
        println("Question ${index + 1} of ${questions.size}")
        println("--------------------------------")

        println(question.text)

        // Display all four options
        question.options.forEachIndexed { optionIndex, option ->
            println("${optionIndex + 1} -> $option")
        }

        // Get a valid answer from the user
        val answer = readAnswer()

        // Check the answer
        if (answer == question.correctOption) {
            println("✅ Correct answer!")
            println("You earned 10 points.")
            score += 10
        } else {
            println("❌ Wrong answer!")

            val correctAnswer =
                question.options[question.correctOption - 1]

            println(
                "Correct answer: " +
                        "${question.correctOption} -> $correctAnswer"
            )
        }

        println("Current score: $score")
        println()
    }

    // Display final results
    println("================================")
    println("         QUIZ COMPLETED!")
    println("================================")
    println("Player Name : $name")
    println("Final Score : $score / ${questions.size * 10}")

    println(
        when (score) {
            100 -> "Amazing! You're a Halloween expert! 🎃"
            in 70..90 -> "Great job! You know your Halloween facts!"
            in 40..60 -> "Good effort! Keep learning!"
            else -> "Nice try! Better luck next time!"
        }
    )

    println("================================")
}

// Function to get a valid option from 1 to 4
fun readAnswer(): Int {

    while (true) {
        print("Enter your answer (1-4): ")

        val answer = readln().toIntOrNull()

        if (answer != null && answer in 1..4) {
            return answer
        }

        println("Invalid input. Please enter a number from 1 to 4.")
    }
}