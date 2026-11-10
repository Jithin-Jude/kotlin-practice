package PAPER_1.library_management_system.model

class LibraryTeacher(
    id: Int,
    name: String,
    borrowedBooks: MutableList<LibraryBook>,
): LibraryUser(
    id = id,
    name = name,
    borrowedBooks = borrowedBooks,
    ) {
    override val maximumBorrowLimit: Int = 5
}