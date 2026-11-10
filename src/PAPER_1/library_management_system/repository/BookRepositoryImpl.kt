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
}