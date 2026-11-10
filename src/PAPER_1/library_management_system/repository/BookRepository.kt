package PAPER_1.library_management_system.repository

import PAPER_1.library_management_system.model.LibraryBook

interface BookRepository {
    fun addBook(book: LibraryBook)
    fun getAllBooks(): List<LibraryBook>
}