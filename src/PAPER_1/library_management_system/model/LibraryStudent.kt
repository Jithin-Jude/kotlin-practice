package PAPER_1.library_management_system.model

class LibraryStudent(
    id: Int,
    name: String,
    borrowedBooks: MutableList<LibraryBook>,
): LibraryUser(
    id = id,
    name = name,
    borrowedBooks = borrowedBooks,
    ) {
    override val maximumBorrowLimit: Int = 2
}