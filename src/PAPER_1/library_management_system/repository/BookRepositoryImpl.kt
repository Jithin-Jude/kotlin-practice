package PAPER_1.library_management_system.repository

import PAPER_1.library_management_system.model.LibraryBook

class BookRepositoryImpl: BookRepository {
    val libBookDb = mutableListOf<LibraryBook>()

    override fun addBook(book: LibraryBook) {
        libBookDb.add(book)
    }

    override fun getAllBooks(): List<LibraryBook> {
        return libBookDb
    }

    override fun incrementBookAvailability(bookId: Int) {
        libBookDb.find { b -> b.bookId == bookId }?.apply {
            quantity++
        }
    }

    override fun decrementBookAvailability(bookId: Int): LibraryBook? {
        val bookFound = libBookDb.find { b -> b.bookId == bookId }?.apply {
            quantity--
        }
        return bookFound
    }
}