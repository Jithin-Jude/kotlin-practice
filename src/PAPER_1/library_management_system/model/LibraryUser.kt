package PAPER_1.library_management_system.model

abstract class LibraryUser(
    val id: Int,
    val name: String,
    var borrowedBooks: MutableList<LibraryBook>,
) {
    abstract val maximumBorrowLimit: Int

    fun getMemberDetails(): String {
        return "$id | $name | $borrowedBooks"
    }
}