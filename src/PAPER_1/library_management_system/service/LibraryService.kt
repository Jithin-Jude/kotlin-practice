package PAPER_1.library_management_system.service

import PAPER_1.library_management_system.model.BookCategory
import PAPER_1.library_management_system.model.LibraryBook
import PAPER_1.library_management_system.model.LibraryStudent
import PAPER_1.library_management_system.model.LibraryTeacher
import PAPER_1.library_management_system.model.LibraryUser
import PAPER_1.library_management_system.repository.BookRepository
import PAPER_1.library_management_system.repository.MemberRepository

class LibraryService(
    val bookRepository: BookRepository,
    val memberRepository: MemberRepository,
    ) {
    fun addBook(
        bookId: Int,
        title: String,
        author: String,
        category: BookCategory,
        quantity: Int,
    ) {
        require(!getAllBooks().map { m -> m.bookId }.contains(bookId)) {
            "Book Id already exists!"
        }

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

    fun searchBook(keyWord: String): String {
        var searchResult: LibraryBook? = null

        for (book in getAllBooks()) {
            if (book.title.contains(keyWord) ||
                book.author.contains(keyWord)) {
                searchResult = book
                break
            }
        }

        if(searchResult != null) {
            return "Book found: ${searchResult.title} | ${searchResult.author} | ${searchResult.quantity}"
        } else {
            return "Book not found!"
        }
    }

    fun borrowBook(memberId: Int, bookId: Int): String {
        require(getAllMembers().map { m -> m.id }.contains(memberId)) {
            "Member not found!"
        }
        require(getAllBooks().map { b -> b.bookId }.contains(bookId)) {
            "Book not found!"
        }

        val borrowedBook = bookRepository.decrementBookAvailability(bookId = bookId)
        memberRepository.updateMemberBorrowedBooks(memberId = memberId, book = borrowedBook)

        return "Book borrowed successfully!\nRemaining copies: ${borrowedBook?.quantity}"

    }

    fun returnBook(memberId: Int, bookId: Int): String {
        require(getAllMembers().map { m -> m.id }.contains(memberId)) {
            "Member not found!"
        }
        require(getAllBooks().map { b -> b.bookId }.contains(bookId)) {
            "Book not found!"
        }

        bookRepository.incrementBookAvailability(bookId = bookId)
        memberRepository.removeMemberBorrowedBooks(memberId = memberId, bookId = bookId)

        return "Book returned successfully!"

    }

    // ===

    fun registerMember(
        memberId: Int,
        name: String,
        isStudent: String,
    ) {
        require(!getAllMembers().map { m -> m.id }.contains(memberId)) {
            "Member Id already exists!"
        }

        val member: LibraryUser = if(isStudent.lowercase() == "y") {
            LibraryStudent(
                id = memberId,
                name = name,
                borrowedBooks = mutableListOf(),
            )
        } else {
            LibraryTeacher(
                id = memberId,
                name = name,
                borrowedBooks = mutableListOf(),
            )
        }

        memberRepository.registerMember(member)
    }

    fun getAllMembers(): List<LibraryUser> {
        return memberRepository.getAllMembers()
    }
}