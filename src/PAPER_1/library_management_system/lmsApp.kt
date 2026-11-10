package PAPER_1.library_management_system

import PAPER_1.library_management_system.model.BookCategory
import PAPER_1.library_management_system.service.LibraryService
import PAPER_1.library_management_system.repository.BookRepositoryImpl

fun main() {
    var option: Int = -1

    val bookRepository = BookRepositoryImpl()
    val libraryService = LibraryService(bookRepository)

    do {
        println()
        println("""
            ========== LIBRARY MANAGEMENT SYSTEM ==========
            
            1. Add Book
            2. Register Member
            3. Display All Books
            4. Search Book
            5. Borrow Book
            6. Return Book
            7. Display All Members
            8. Display Borrowing Statistics
            9. Sort Books
            10. Display Books by Category
            11. Display Borrowing Pattern
            0. Exit
        """.trimIndent())
        println()
        try {
            option = readln().toInt()
        } catch (e: NumberFormatException) {
            println("\nOption should be a number.\n")
            option = -1
        } catch (e: Throwable) {
            println()
            println("\nPlease choose a valid option.\n")
            println()
            option = -1
        }

        processOptions(option, libraryService)

    } while (option != 0)
}

fun processOptions(option: Int, libraryService: LibraryService) {
    when(option) {
        1 -> {
            try {
                println("Enter Book ID: ")
                val id: Int = readln().toInt()

                println("Enter Title: ")
                val title: String = readln()

                println("Enter Author: ")
                val author: String = readln()

                println("Enter Category ${BookCategory.entries}: ")
                val category: String = readln().uppercase()

                println("Enter Quantity: ")
                val quantity: Int = readln().toInt()

                libraryService.addBook(
                    bookId = id,
                    title = title,
                    author = author,
                    category = BookCategory.valueOf(category),
                    quantity = quantity,
                )

                println("\nBook added successfully!\n")
            } catch (e: Exception) {
                println("Something went wrong: ${e.message}")
            }
        }
        3 -> {
            libraryService.getAllBooks().forEach { book ->
                println("${book.bookId} | ${book.title} | ${book.author} | ${book.quantity} | ${book.category}")
            }
        }
        else -> {
            println("\n Invalid Option \n")
        }
    }
}