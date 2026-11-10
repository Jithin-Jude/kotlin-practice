package PAPER_1.library_management_system.service

import PAPER_1.library_management_system.model.BookCategory
import PAPER_1.library_management_system.model.LibraryBook
import PAPER_1.library_management_system.repository.BookRepository

class LibraryService(val bookRepository: BookRepository) {
    fun addBook(
        bookId: Int,
        title: String,
        author: String,
        category: BookCategory,
        quantity: Int,
    ) {
        val book = LibraryBook.createBook(
            bookId = bookId,
            title = title,
            author = author,
            category = category,
            quantity = quantity,
        )
        bookRepository.addBook(book)
    }

    fun getAllBooks(): List<LibraryBook> {
        return bookRepository.getAllBooks()
    }
}